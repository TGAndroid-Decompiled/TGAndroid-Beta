package org.telegram.ui.Components;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.util.Log;
import com.google.android.gms.internal.mlkit_language_id_common.zzhr;
import com.google.android.gms.internal.mlkit_vision_common.zzkf;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import org.telegram.messenger.AiTonesController$$ExternalSyntheticOutline0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FactCheckController$$ExternalSyntheticOutline0;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda53;
import org.telegram.ui.Cells.CollapseTextCell;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda263;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda264;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda356;
import org.telegram.ui.ChatActivity$16$$ExternalSyntheticLambda4;
import org.telegram.ui.ChatEditActivity$$ExternalSyntheticLambda1;
import org.telegram.ui.GroupCallSheet$$ExternalSyntheticLambda3;
import org.telegram.ui.GroupCreateActivity;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.VoIPFragment$$ExternalSyntheticLambda36;

public final class DeleteMessagesBottomSheet extends BottomSheetWithRecyclerListView {
    public static final int $r8$clinit = 0;
    public UniversalAdapter adapter;
    public boolean banChecked;
    public final boolean[] banFilter;
    public boolean banFromCommunity;
    public TL_communities.ParticipantJoinedChats banFromCommunityChats;
    public final long banFromCommunityDialogId;
    public final Action banOrRestrict;
    public final TLRPC.TL_chatBannedRights bannedRights;
    public final boolean canRestrict;
    public final TLRPC.TL_chatBannedRights defaultBannedRights;
    public final Action deleteAll;
    public final Action deleteAllReactions;
    public final TLRPC.Chat inChat;
    public final TLRPC.Chat inCommunity;
    public final boolean isForum;
    public final boolean isReactionOnlyMode;
    public final boolean isSingleUsersMode;
    public final long mergeDialogId;
    public final ArrayList messages;
    public final int mode;
    public final boolean monoforum;
    public final Runnable onDelete;
    public int[] participantMessageCounts;
    public boolean participantMessageCountsLoaded;
    public boolean participantMessageCountsLoading;
    public final ArrayList participantsBannedRights;
    public final Action report;
    public boolean restrict;
    public final boolean[] restrictFilter;
    public boolean restrictUserCollapsed;
    public boolean restrictUserDeleteAllMessages;
    public boolean restrictUserDeleteAllReactions;
    public boolean sendMediaCollapsed;
    public float shiftDp;
    public final int topicId;

    public final class Action {
        public final boolean[] checks;
        public boolean collapsed;
        public boolean[] filter;
        public int filteredCount;
        public final ArrayList options;
        public int selectedCount;
        public String title;
        public final int totalCount;
        public final int type;

        public Action(int i, ArrayList arrayList) {
            this.type = i;
            int size = arrayList.size();
            this.totalCount = size;
            this.selectedCount = 0;
            if (size > 0) {
                this.options = arrayList;
                this.checks = new boolean[size];
                this.collapsed = true;
                updateTitle();
            }
        }

        public final boolean areAllSelected() {
            boolean[] zArr;
            for (int i = 0; i < this.totalCount; i++) {
                if (!this.checks[i] || ((zArr = this.filter) != null && !zArr[i])) {
                    return false;
                }
            }
            return true;
        }

        public final boolean isExpandable() {
            return (this.filter != null ? this.filteredCount : this.totalCount) > 1;
        }

        public final boolean isPresent() {
            return (this.filter != null ? this.filteredCount : this.totalCount) > 0;
        }

        public final void toggleAllChecks() {
            boolean[] zArr;
            boolean[] zArr2;
            boolean z = false;
            int i = 0;
            while (true) {
                int i2 = this.totalCount;
                zArr = this.checks;
                if (i < i2) {
                    if (zArr[i] && ((zArr2 = this.filter) == null || zArr2[i])) {
                        z = true;
                        break;
                    }
                    i++;
                } else {
                    break;
                }
            }
            Arrays.fill(zArr, !z);
            updateCounters();
            DeleteMessagesBottomSheet.this.adapter.update(true);
        }

        public final void toggleCheck(int i) {
            boolean[] zArr = this.filter;
            if (zArr == null || zArr[i]) {
                boolean[] zArr2 = this.checks;
                boolean z = zArr2[i];
                zArr2[i] = !z;
                if (z) {
                    this.selectedCount--;
                } else {
                    this.selectedCount++;
                }
                DeleteMessagesBottomSheet.this.adapter.update(true);
            }
        }

        public final void updateCounters() {
            this.selectedCount = 0;
            this.filteredCount = 0;
            for (int i = 0; i < this.totalCount; i++) {
                boolean[] zArr = this.filter;
                boolean[] zArr2 = this.checks;
                if (zArr == null) {
                    if (zArr2[i]) {
                        this.selectedCount++;
                    }
                } else if (zArr[i]) {
                    this.filteredCount++;
                    if (zArr2[i]) {
                        this.selectedCount++;
                    }
                }
            }
        }

        public final void updateTitle() {
            TLObject tLObject;
            int i = this.totalCount;
            if (i == 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    tLObject = null;
                    break;
                }
                boolean[] zArr = this.filter;
                if (zArr == null || zArr[i2]) {
                    tLObject = (TLObject) this.options.get(i2);
                    break;
                }
                i2++;
            }
            String forcedFirstName = tLObject instanceof TLRPC.User ? UserObject.getForcedFirstName((TLRPC.User) tLObject) : ContactsController.formatName(tLObject);
            int i3 = this.type;
            if (i3 == 0) {
                this.title = LocaleController.getString(R.string.DeleteReportSpam);
                return;
            }
            if (i3 == 1) {
                this.title = isExpandable() ? LocaleController.getString(R.string.DeleteAllMessagesFromUsers) : LocaleController.formatString(R.string.DeleteAllFrom, forcedFirstName);
                return;
            }
            if (i3 == 3) {
                this.title = isExpandable() ? LocaleController.getString(R.string.DeleteAllReactionsFromUsers) : LocaleController.formatString(R.string.DeleteAllReactionsFrom, forcedFirstName);
            } else if (i3 == 2) {
                if (DeleteMessagesBottomSheet.this.restrict) {
                    this.title = isExpandable() ? LocaleController.getString(R.string.DeleteRestrictUsers) : LocaleController.formatString(R.string.DeleteRestrict, forcedFirstName);
                } else {
                    this.title = isExpandable() ? LocaleController.getString(R.string.DeleteBanUsers) : LocaleController.formatString(R.string.DeleteBan, forcedFirstName);
                }
            }
        }
    }

    public DeleteMessagesBottomSheet(BaseFragment baseFragment, TLRPC.Chat chat, ArrayList arrayList, ArrayList arrayList2, TLRPC.ChannelParticipant[] channelParticipantArr, long j, int i, int i2, boolean z, Runnable runnable) {
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        TLRPC.TL_chatBannedRights tL_chatBannedRights2;
        super(baseFragment.getContext(), baseFragment, false, false, false, false, true, 2, baseFragment.getResourceProvider());
        this.restrict = false;
        this.participantMessageCountsLoading = false;
        this.participantMessageCountsLoaded = false;
        this.sendMediaCollapsed = true;
        this.restrictUserCollapsed = true;
        this.restrictUserDeleteAllMessages = false;
        this.restrictUserDeleteAllReactions = false;
        this.shiftDp = 10.0f;
        setBackgroundColor(getThemedColor(Theme.key_windowBackgroundGray));
        this.showHandle = true;
        fixNavigationBar();
        this.takeTranslationIntoAccount = true;
        this.isReactionOnlyMode = z;
        RecyclerListView recyclerListView = this.recyclerListView;
        int i3 = this.backgroundPaddingLeft;
        recyclerListView.setPadding(i3, this.headerTotalHeight, i3, AndroidUtilities.dp(63.0f));
        this.recyclerListView.setClipToPadding(false);
        this.recyclerListView.setOnItemClickListener(new DeleteMessagesBottomSheet$$ExternalSyntheticLambda1(this, 0));
        this.takeTranslationIntoAccount = true;
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator() {
            @Override
            public final void onMoveAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                ((BottomSheet) DeleteMessagesBottomSheet.this).containerView.invalidate();
            }
        };
        defaultItemAnimator.mSupportsChangeAnimations = false;
        defaultItemAnimator.delayAnimations = false;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        defaultItemAnimator.mAddInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.mMoveInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.mRemoveInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.mChangeInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.setDurations(350L);
        this.recyclerListView.setItemAnimator(defaultItemAnimator);
        this.recyclerListView.setSections();
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(getContext(), this.resourcesProvider, true);
        buttonWithCounterView.setRoundRadius(24);
        buttonWithCounterView.setText(LocaleController.getString(R.string.DeleteProceedBtn));
        buttonWithCounterView.setOnClickListener(new ChatActivity$16$$ExternalSyntheticLambda4(this, 14));
        this.containerView.addView(buttonWithCounterView, LayoutHelper.createFrameMarginPx(48.0f, 87, AndroidUtilities.dp(10.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(10.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(10.0f)));
        this.inChat = chat;
        this.isForum = ChatObject.isForum(chat);
        this.messages = arrayList;
        this.mergeDialogId = j;
        this.topicId = i;
        this.mode = i2;
        this.onDelete = runnable;
        TLRPC.TL_chatBannedRights tL_chatBannedRights3 = chat.default_banned_rights;
        this.defaultBannedRights = tL_chatBannedRights3;
        TLRPC.TL_chatBannedRights tL_chatBannedRights4 = new TLRPC.TL_chatBannedRights();
        this.bannedRights = tL_chatBannedRights4;
        if (tL_chatBannedRights3.view_messages) {
            tL_chatBannedRights4.view_messages = true;
        }
        if (tL_chatBannedRights3.send_messages) {
            tL_chatBannedRights4.send_messages = true;
        }
        if (tL_chatBannedRights3.send_media) {
            tL_chatBannedRights4.send_media = true;
        }
        if (tL_chatBannedRights3.send_stickers) {
            tL_chatBannedRights4.send_stickers = true;
        }
        if (tL_chatBannedRights3.send_gifs) {
            tL_chatBannedRights4.send_gifs = true;
        }
        if (tL_chatBannedRights3.send_games) {
            tL_chatBannedRights4.send_games = true;
        }
        if (tL_chatBannedRights3.send_inline) {
            tL_chatBannedRights4.send_inline = true;
        }
        if (tL_chatBannedRights3.embed_links) {
            tL_chatBannedRights4.embed_links = true;
        }
        if (tL_chatBannedRights3.send_polls) {
            tL_chatBannedRights4.send_polls = true;
        }
        if (tL_chatBannedRights3.invite_users) {
            tL_chatBannedRights4.invite_users = true;
        }
        if (tL_chatBannedRights3.change_info) {
            tL_chatBannedRights4.change_info = true;
        }
        if (tL_chatBannedRights3.pin_messages) {
            tL_chatBannedRights4.pin_messages = true;
        }
        if (tL_chatBannedRights3.manage_topics) {
            tL_chatBannedRights4.manage_topics = true;
        }
        if (tL_chatBannedRights3.send_photos) {
            tL_chatBannedRights4.send_photos = true;
        }
        if (tL_chatBannedRights3.send_videos) {
            tL_chatBannedRights4.send_videos = true;
        }
        if (tL_chatBannedRights3.send_audios) {
            tL_chatBannedRights4.send_audios = true;
        }
        if (tL_chatBannedRights3.send_docs) {
            tL_chatBannedRights4.send_docs = true;
        }
        if (tL_chatBannedRights3.send_voices) {
            tL_chatBannedRights4.send_voices = true;
        }
        if (tL_chatBannedRights3.send_roundvideos) {
            tL_chatBannedRights4.send_roundvideos = true;
        }
        if (tL_chatBannedRights3.send_plain) {
            tL_chatBannedRights4.send_plain = true;
        }
        if (tL_chatBannedRights3.send_reactions) {
            tL_chatBannedRights4.send_reactions = true;
        }
        MessagesController.getInstance(this.currentAccount).getMainSettings();
        this.report = new Action(0, arrayList2);
        this.deleteAll = new Action(1, arrayList2);
        this.deleteAllReactions = new Action(3, arrayList2);
        boolean z2 = arrayList2.size() == 1;
        this.isSingleUsersMode = z2;
        this.monoforum = ChatObject.isMonoForum(chat);
        if (chat.linked_community_id != 0) {
            this.inCommunity = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(chat.linked_community_id));
        }
        if (ChatObject.canUserDoAdminAction(this.inCommunity, 2) && ChatObject.canUserDoAdminAction(this.inCommunity, 27) && z2) {
            long dialogId = DialogObject.getDialogId((TLObject) arrayList2.get(0));
            this.banFromCommunityDialogId = dialogId;
            MessagesController.getInstance(this.currentAccount).fetchCommunityJoinedChats(this.inCommunity.id, dialogId, new DeleteMessagesBottomSheet$$ExternalSyntheticLambda0(this, 1));
        }
        if (ChatObject.canBlockUsers(chat)) {
            this.banFilter = new boolean[arrayList2.size()];
            int i4 = 0;
            while (true) {
                if (i4 >= arrayList2.size()) {
                    break;
                }
                TLRPC.ChannelParticipant channelParticipant = i4 < channelParticipantArr.length ? channelParticipantArr[i4] : null;
                if ((chat.creator || (!(channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) && !(channelParticipant instanceof TLRPC.TL_channelParticipantCreator))) && (!(channelParticipant instanceof TLRPC.TL_channelParticipantBanned) || (tL_chatBannedRights2 = channelParticipant.banned_rights) == null || !tL_chatBannedRights2.view_messages)) {
                    this.banFilter[i4] = true;
                }
                i4++;
            }
            this.restrictFilter = new boolean[arrayList2.size()];
            TLRPC.TL_chatBannedRights tL_chatBannedRights5 = this.defaultBannedRights;
            if (!tL_chatBannedRights5.send_messages || !tL_chatBannedRights5.send_media || !tL_chatBannedRights5.send_stickers || !tL_chatBannedRights5.send_gifs || !tL_chatBannedRights5.send_games || !tL_chatBannedRights5.send_inline || !tL_chatBannedRights5.embed_links || !tL_chatBannedRights5.send_polls || !tL_chatBannedRights5.send_reactions || !tL_chatBannedRights5.change_info || !tL_chatBannedRights5.invite_users || !tL_chatBannedRights5.pin_messages || ((!tL_chatBannedRights5.manage_topics && this.isForum) || !tL_chatBannedRights5.send_photos || !tL_chatBannedRights5.send_videos || !tL_chatBannedRights5.send_roundvideos || !tL_chatBannedRights5.send_audios || !tL_chatBannedRights5.send_voices || !tL_chatBannedRights5.send_docs || !tL_chatBannedRights5.send_plain)) {
                int i5 = 0;
                while (i5 < arrayList2.size()) {
                    TLRPC.ChannelParticipant channelParticipant2 = i5 < channelParticipantArr.length ? channelParticipantArr[i5] : null;
                    if (!(arrayList2.get(i5) instanceof TLRPC.Chat)) {
                        if ((channelParticipant2 instanceof TLRPC.TL_channelParticipantBanned) && (tL_chatBannedRights = channelParticipant2.banned_rights) != null && ((tL_chatBannedRights.send_stickers || this.defaultBannedRights.send_stickers) && ((tL_chatBannedRights.send_gifs || this.defaultBannedRights.send_gifs) && ((tL_chatBannedRights.send_games || this.defaultBannedRights.send_games) && (tL_chatBannedRights.send_inline || this.defaultBannedRights.send_inline))))) {
                            if (!tL_chatBannedRights.embed_links && !tL_chatBannedRights.send_plain) {
                                TLRPC.TL_chatBannedRights tL_chatBannedRights6 = this.defaultBannedRights;
                                if (tL_chatBannedRights6.embed_links || tL_chatBannedRights6.send_plain) {
                                    if (tL_chatBannedRights.send_polls) {
                                    }
                                } else if (this.banFilter[i5]) {
                                    this.restrictFilter[i5] = true;
                                    this.canRestrict = true;
                                }
                            } else if ((tL_chatBannedRights.send_polls && !this.defaultBannedRights.send_polls) || ((!tL_chatBannedRights.send_reactions && !this.defaultBannedRights.send_reactions) || ((!tL_chatBannedRights.change_info && !this.defaultBannedRights.change_info) || ((!tL_chatBannedRights.invite_users && !this.defaultBannedRights.invite_users) || ((!tL_chatBannedRights.pin_messages && !this.defaultBannedRights.pin_messages) || ((!tL_chatBannedRights.manage_topics && !this.defaultBannedRights.manage_topics && this.isForum) || ((!tL_chatBannedRights.send_photos && !this.defaultBannedRights.send_photos) || ((!tL_chatBannedRights.send_videos && !this.defaultBannedRights.send_videos) || ((!tL_chatBannedRights.send_roundvideos && !this.defaultBannedRights.send_roundvideos) || ((!tL_chatBannedRights.send_audios && !this.defaultBannedRights.send_audios) || ((!tL_chatBannedRights.send_voices && !this.defaultBannedRights.send_voices) || ((!tL_chatBannedRights.send_docs && !this.defaultBannedRights.send_docs) || (!tL_chatBannedRights.send_plain && !this.defaultBannedRights.send_plain))))))))))))) {
                                if (this.banFilter[i5]) {
                                    this.restrictFilter[i5] = true;
                                    this.canRestrict = true;
                                }
                            }
                        } else if (this.banFilter[i5]) {
                            this.restrictFilter[i5] = true;
                            this.canRestrict = true;
                        }
                    }
                    i5++;
                }
            }
            this.participantsBannedRights = (ArrayList) DesugarArrays.stream(channelParticipantArr).map(new GroupCallSheet$$ExternalSyntheticLambda3(4)).collect(Collectors.toCollection(new ChatActivity$$ExternalSyntheticLambda264()));
            Action action = new Action(2, arrayList2);
            this.banOrRestrict = action;
            boolean[] zArr = this.banFilter;
            if (action.totalCount != 0) {
                action.filter = zArr;
                action.updateCounters();
                action.updateTitle();
            }
        } else {
            this.banOrRestrict = new Action(2, new ArrayList(0));
        }
        this.adapter.update(false);
        this.actionBar.setTitle(getTitle());
    }

    public final boolean allDefaultMediaBanned$1() {
        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.defaultBannedRights;
        return tL_chatBannedRights.send_photos && tL_chatBannedRights.send_videos && tL_chatBannedRights.send_stickers && tL_chatBannedRights.send_audios && tL_chatBannedRights.send_docs && tL_chatBannedRights.send_voices && tL_chatBannedRights.send_roundvideos && tL_chatBannedRights.embed_links && tL_chatBannedRights.send_polls && tL_chatBannedRights.send_reactions;
    }

    @Override
    public final boolean canHighlightChildAt(View view, float f, float f2) {
        return !(view instanceof CollapseTextCell);
    }

    @Override
    public final RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        UniversalAdapter universalAdapter = new UniversalAdapter(recyclerListView, getContext(), this.currentAccount, this.baseFragment.getClassGuid(), true, new DeleteMessagesBottomSheet$$ExternalSyntheticLambda0(this, 0), this.resourcesProvider);
        this.adapter = universalAdapter;
        universalAdapter.applyBackground = false;
        return universalAdapter;
    }

    @Override
    public final void lambda$showGiftOfferSheet$15() {
        SharedPreferences.Editor editorM = AiTonesController$$ExternalSyntheticOutline0.m(this.currentAccount);
        editorM.putBoolean("delete_report", this.report.areAllSelected());
        editorM.putBoolean("delete_deleteAll", this.deleteAll.areAllSelected());
        editorM.putBoolean("delete_ban", !this.restrict && this.banOrRestrict.areAllSelected());
        editorM.apply();
        super.lambda$showGiftOfferSheet$15();
    }

    public final void fillAction(ArrayList arrayList, Action action) {
        if (action.isPresent()) {
            boolean zIsExpandable = action.isExpandable();
            int i = action.type;
            if (!zIsExpandable) {
                UItem uItemAsRoundCheckbox = UItem.asRoundCheckbox(i, action.title);
                uItemAsRoundCheckbox.setChecked(action.selectedCount > 0);
                arrayList.add(uItemAsRoundCheckbox);
                return;
            }
            String str = action.title;
            int i2 = action.selectedCount;
            int i3 = action.totalCount;
            if (i2 <= 0) {
                i2 = action.filter != null ? action.filteredCount : i3;
            }
            String strValueOf = String.valueOf(i2);
            UItem uItem = new UItem(36);
            uItem.id = i;
            uItem.text = str;
            uItem.animatedText = strValueOf;
            uItem.setChecked(action.selectedCount > 0);
            uItem.collapsed = action.collapsed;
            uItem.clickCallback = new ItemOptions$$ExternalSyntheticLambda7(20, this, action);
            arrayList.add(uItem);
            if (action.collapsed) {
                return;
            }
            for (int i4 = 0; i4 < i3; i4++) {
                boolean[] zArr = action.filter;
                if (zArr == null || zArr[i4]) {
                    TLObject tLObject = (TLObject) action.options.get(i4);
                    UItem uItem2 = new UItem(37);
                    uItem2.id = (i << 24) | i4;
                    uItem2.object = tLObject;
                    uItem2.setChecked(action.checks[i4]);
                    uItem2.pad = 1;
                    arrayList.add(uItem2);
                }
            }
        }
    }

    @Override
    public final CharSequence getTitle() {
        boolean[] zArr;
        if (this.isReactionOnlyMode) {
            if (this.restrictUserDeleteAllMessages) {
                return LocaleController.getString(R.string.DeleteMessagesOptionsTitleAll);
            }
            return this.restrictUserDeleteAllReactions ? LocaleController.getString(R.string.DeleteReactionOptionsTitleAll) : LocaleController.formatPluralString("DeleteReactionOptionsTitle", 1, new Object[0]);
        }
        ArrayList arrayList = this.messages;
        int[] iArr = {arrayList != null ? arrayList.size() : 0};
        if (this.participantMessageCounts != null && this.participantMessageCountsLoaded) {
            int i = 0;
            while (true) {
                Action action = this.deleteAll;
                if (i >= action.totalCount) {
                    break;
                }
                if (action.checks[i] && ((zArr = action.filter) == null || zArr[i])) {
                    iArr[0] = iArr[0] + this.participantMessageCounts[i];
                }
                i++;
            }
        }
        return LocaleController.formatPluralString("DeleteOptionsTitle", iArr[0], new Object[0]);
    }

    public final void lambda$fillItems$13() {
        LinearLayout linearLayout;
        boolean z = false;
        Context context = getContext();
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        int i = this.currentAccount;
        ArrayList<Long> arrayList = this.banFromCommunityChats.joined_chat_ids;
        DeleteMessagesBottomSheet$$ExternalSyntheticLambda1 deleteMessagesBottomSheet$$ExternalSyntheticLambda1 = new DeleteMessagesBottomSheet$$ExternalSyntheticLambda1(this, 1);
        Pattern pattern = AlertsCreator.URL_PATTERN;
        LinearLayout linearLayoutM = zzkf.m(context, 1);
        AlertDialog[] alertDialogArr = new AlertDialog[1];
        AlertDialog.Builder builder = new AlertDialog.Builder(context, 0, resourcesProvider);
        String string = LocaleController.getString(R.string.CommunityBanUserTitle);
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.title = string;
        alertDialog.message = AndroidUtilities.replaceTags(LocaleController.formatPluralString("CommunityBanWillRemoveFromChats", arrayList.size(), DialogObject.getShortName(i, this.banFromCommunityDialogId)));
        builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        builder.setView(linearLayoutM);
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            Long l = arrayList.get(i2);
            LinearLayout linearLayout2 = linearLayoutM;
            long jLongValue = l.longValue();
            TLRPC.Chat chat = MessagesController.getInstance(i).getChat(l);
            TLRPC.ChatFull chatFull = MessagesController.getInstance(i).getChatFull(jLongValue);
            if (chat == null) {
                linearLayout = linearLayout2;
            } else {
                GroupCreateActivity.AnonymousClass7 anonymousClass7 = new GroupCreateActivity.AnonymousClass7(context, resourcesProvider, z);
                ((TextView) anonymousClass7.paint).setText(DialogObject.getName(chat));
                ((TextView) anonymousClass7.this$0).setText(chatFull != null ? LocaleController.formatPluralString("Members", chatFull.participants_count, new Object[0]) : null);
                BackupImageView backupImageView = (BackupImageView) anonymousClass7.rectTmp;
                backupImageView.imageReceiver.setForUserOrChat(chat, new AvatarDrawable(chat));
                backupImageView.onNewImageSet();
                anonymousClass7.setBackground(Theme.getSelectorDrawable(false));
                anonymousClass7.setOnClickListener(new ChatEditActivity$$ExternalSyntheticLambda1(alertDialogArr, deleteMessagesBottomSheet$$ExternalSyntheticLambda1, jLongValue, 2));
                linearLayout = linearLayout2;
                linearLayout.addView(anonymousClass7, LayoutHelper.createLinear(-1, -2));
            }
            size = size;
            linearLayoutM = linearLayout;
            i2 = i3;
            z = false;
        }
        alertDialogArr[0] = alertDialog;
        alertDialog.show();
    }

    @Override
    public final void onContainerLayout(int i, int i2, int i3, int i4) {
        super.onContainerLayout(i, i2, i3, i4);
        Rect rect = AndroidUtilities.rectTmp2;
        RecyclerListView recyclerListView = this.recyclerListView;
        rect.set(0, 0, recyclerListView.getMeasuredWidth(), recyclerListView.getMeasuredHeight() - AndroidUtilities.dp(34.0f));
        recyclerListView.setClipBounds(rect);
    }

    public final void onRestrictionsChanged() {
        boolean z = this.restrict;
        Action action = this.banOrRestrict;
        if (z && action.isPresent()) {
            this.banChecked = action.selectedCount > 0;
        }
        if (this.restrict && action.isPresent() && action.selectedCount == 0) {
            action.toggleAllChecks();
        } else if (!this.restrict && action.isPresent()) {
            if (this.banChecked != (action.selectedCount > 0)) {
                action.toggleAllChecks();
            }
        }
        if (this.restrict || !action.isPresent()) {
            return;
        }
        this.banChecked = action.selectedCount > 0;
    }

    public final void proceed(boolean z) {
        long j;
        boolean[] zArr;
        boolean[] zArr2;
        ?? r7;
        boolean[] zArr3;
        boolean[] zArr4;
        long j2;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        long j3;
        TL_communities.ParticipantJoinedChats participantJoinedChats;
        LinearLayout linearLayout;
        final int i = 2;
        long j4 = this.banFromCommunityDialogId;
        ?? r8 = 1;
        if (z && this.banFromCommunity && (participantJoinedChats = this.banFromCommunityChats) != null && !participantJoinedChats.creator_chat_ids.isEmpty()) {
            Context context = getContext();
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            int i2 = this.currentAccount;
            ArrayList<Long> arrayList = this.banFromCommunityChats.creator_chat_ids;
            DeleteMessagesBottomSheet$$ExternalSyntheticLambda1 deleteMessagesBottomSheet$$ExternalSyntheticLambda1 = new DeleteMessagesBottomSheet$$ExternalSyntheticLambda1(this, i);
            DeleteMessagesBottomSheet$$ExternalSyntheticLambda8 deleteMessagesBottomSheet$$ExternalSyntheticLambda8 = new DeleteMessagesBottomSheet$$ExternalSyntheticLambda8(this, 1);
            Pattern pattern = AlertsCreator.URL_PATTERN;
            LinearLayout linearLayoutM = zzkf.m(context, 1);
            AlertDialog[] alertDialogArr = new AlertDialog[1];
            AlertDialog.Builder builder = new AlertDialog.Builder(context, 0, resourcesProvider);
            String string = LocaleController.getString(R.string.CommunityBanWarningTitle);
            AlertDialog alertDialog = builder.alertDialog;
            alertDialog.title = string;
            alertDialog.message = AndroidUtilities.replaceTags(LocaleController.formatPluralString("CommunityBanWarningMessage", arrayList.size(), DialogObject.getShortName(i2, j4)));
            builder.setPositiveButton(LocaleController.getString(R.string.Ban), new ChatActivity$$ExternalSyntheticLambda356(deleteMessagesBottomSheet$$ExternalSyntheticLambda8, 28));
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            builder.setView(linearLayoutM);
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Long l = arrayList.get(i3);
                int i4 = i3 + r8;
                Long l2 = l;
                long jLongValue = l2.longValue();
                TLRPC.Chat chat = MessagesController.getInstance(i2).getChat(l2);
                TLRPC.ChatFull chatFull = MessagesController.getInstance(i2).getChatFull(jLongValue);
                if (chat == null) {
                    size = size;
                    linearLayout = linearLayoutM;
                } else {
                    GroupCreateActivity.AnonymousClass7 anonymousClass7 = new GroupCreateActivity.AnonymousClass7(context, resourcesProvider, (boolean) r8);
                    ((TextView) anonymousClass7.paint).setText(DialogObject.getName(chat));
                    ((TextView) anonymousClass7.this$0).setText(chatFull != null ? LocaleController.formatPluralString("Members", chatFull.participants_count, new Object[0]) : null);
                    BackupImageView backupImageView = (BackupImageView) anonymousClass7.rectTmp;
                    backupImageView.imageReceiver.setForUserOrChat(chat, new AvatarDrawable(chat));
                    backupImageView.onNewImageSet();
                    anonymousClass7.setBackground(Theme.getSelectorDrawable(false));
                    linearLayout = linearLayoutM;
                    anonymousClass7.setOnClickListener(new ChatEditActivity$$ExternalSyntheticLambda1(alertDialogArr, deleteMessagesBottomSheet$$ExternalSyntheticLambda1, jLongValue, 1));
                    linearLayout.addView(anonymousClass7, LayoutHelper.createLinear(-1, -2));
                }
                i3 = i4;
                linearLayoutM = linearLayout;
                context = context;
                size = size;
                r8 = 1;
            }
            alertDialogArr[0] = alertDialog;
            alertDialog.show();
            TextView textView = (TextView) alertDialog.getButton(-1);
            if (textView != null) {
                textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
                return;
            }
            return;
        }
        lambda$showGiftOfferSheet$15();
        Runnable runnable = this.onDelete;
        if (runnable != null) {
            runnable.run();
        }
        Action action = this.report;
        String string2 = action.selectedCount > 0 ? "" + LocaleController.formatPluralString("UsersReported", action.selectedCount, new Object[0]) : "";
        Action action2 = this.banOrRestrict;
        if (action2.selectedCount > 0) {
            if (!TextUtils.isEmpty(string2)) {
                string2 = zzhr.m(string2, "\n");
            }
            if (this.restrict) {
                StringBuilder sbM = Log.m(string2);
                sbM.append(LocaleController.formatPluralString("UsersRestricted", action2.selectedCount, new Object[0]));
                string2 = sbM.toString();
            } else {
                StringBuilder sbM2 = Log.m(string2);
                sbM2.append(LocaleController.formatPluralString("UsersBanned", action2.selectedCount, new Object[0]));
                string2 = sbM2.toString();
            }
        }
        boolean z2 = this.isReactionOnlyMode;
        boolean z3 = z2 && !this.restrictUserDeleteAllMessages;
        int i5 = action2.selectedCount > 0 ? R.raw.ic_admin : R.raw.contact_check;
        boolean zIsEmpty = TextUtils.isEmpty(string2);
        BaseFragment baseFragment = this.baseFragment;
        if (zIsEmpty) {
            FactCheckController$$ExternalSyntheticOutline0.m(z3 ? R.string.ReactionsDeleted : R.string.MessagesDeleted, BulletinFactory.of(baseFragment), i5, 36);
        } else {
            BulletinFactory.of(baseFragment).createSimpleBulletin(LocaleController.getString(z3 ? R.string.ReactionsDeleted : R.string.MessagesDeleted), string2, i5).show();
        }
        long j5 = 0;
        if (j4 != 0 && this.banFromCommunity) {
            MessagesController.getInstance(this.currentAccount).toggleCommunityParticipantBanned(this.inCommunity.id, this.banFromCommunityDialogId, true, new VoIPFragment$$ExternalSyntheticLambda36(1));
        }
        ArrayList arrayList2 = this.messages;
        final int i6 = 0;
        ArrayList<Integer> arrayList3 = (ArrayList) Collection.EL.stream(arrayList2).filter(new Predicate(this) {
            public final DeleteMessagesBottomSheet f$0;

            {
                this.f$0 = this;
            }

            public final Predicate and(Predicate predicate) {
                int i7 = i6;
                return Predicate$CC.$default$and(this, predicate);
            }

            public final Predicate negate() {
                switch (i6) {
                    case 0:
                        break;
                    case 1:
                        break;
                }
                return Predicate$CC.$default$negate(this);
            }

            public final Predicate or(Predicate predicate) {
                int i7 = i6;
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override
            public final boolean test(Object obj) {
                MessageObject messageObject = (MessageObject) obj;
                switch (i6) {
                    case 0:
                        DeleteMessagesBottomSheet deleteMessagesBottomSheet = this.f$0;
                        deleteMessagesBottomSheet.getClass();
                        TLRPC.Peer peer = messageObject.messageOwner.peer_id;
                        long j6 = deleteMessagesBottomSheet.mergeDialogId;
                        return !(peer == null || peer.chat_id == (-j6)) || j6 == 0;
                    case 1:
                        DeleteMessagesBottomSheet deleteMessagesBottomSheet2 = this.f$0;
                        deleteMessagesBottomSheet2.getClass();
                        TLRPC.Peer peer2 = messageObject.messageOwner.peer_id;
                        if (peer2 != null) {
                            long j7 = peer2.chat_id;
                            long j8 = deleteMessagesBottomSheet2.mergeDialogId;
                            if (j7 == (-j8) && j8 != 0) {
                                return true;
                            }
                        }
                        return false;
                    default:
                        DeleteMessagesBottomSheet deleteMessagesBottomSheet3 = this.f$0;
                        deleteMessagesBottomSheet3.getClass();
                        TLRPC.Peer peer3 = messageObject.messageOwner.peer_id;
                        return (peer3 == null || peer3.chat_id == (-deleteMessagesBottomSheet3.mergeDialogId)) ? false : true;
                }
            }
        }).map(new GroupCallSheet$$ExternalSyntheticLambda3(3)).collect(Collectors.toCollection(new ChatActivity$$ExternalSyntheticLambda264()));
        final int i7 = 1;
        ArrayList<Integer> arrayList4 = (ArrayList) Collection.EL.stream(arrayList2).filter(new Predicate(this) {
            public final DeleteMessagesBottomSheet f$0;

            {
                this.f$0 = this;
            }

            public final Predicate and(Predicate predicate) {
                int i8 = i7;
                return Predicate$CC.$default$and(this, predicate);
            }

            public final Predicate negate() {
                switch (i7) {
                    case 0:
                        break;
                    case 1:
                        break;
                }
                return Predicate$CC.$default$negate(this);
            }

            public final Predicate or(Predicate predicate) {
                int i8 = i7;
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override
            public final boolean test(Object obj) {
                MessageObject messageObject = (MessageObject) obj;
                switch (i7) {
                    case 0:
                        DeleteMessagesBottomSheet deleteMessagesBottomSheet = this.f$0;
                        deleteMessagesBottomSheet.getClass();
                        TLRPC.Peer peer = messageObject.messageOwner.peer_id;
                        long j6 = deleteMessagesBottomSheet.mergeDialogId;
                        return !(peer == null || peer.chat_id == (-j6)) || j6 == 0;
                    case 1:
                        DeleteMessagesBottomSheet deleteMessagesBottomSheet2 = this.f$0;
                        deleteMessagesBottomSheet2.getClass();
                        TLRPC.Peer peer2 = messageObject.messageOwner.peer_id;
                        if (peer2 != null) {
                            long j7 = peer2.chat_id;
                            long j8 = deleteMessagesBottomSheet2.mergeDialogId;
                            if (j7 == (-j8) && j8 != 0) {
                                return true;
                            }
                        }
                        return false;
                    default:
                        DeleteMessagesBottomSheet deleteMessagesBottomSheet3 = this.f$0;
                        deleteMessagesBottomSheet3.getClass();
                        TLRPC.Peer peer3 = messageObject.messageOwner.peer_id;
                        return (peer3 == null || peer3.chat_id == (-deleteMessagesBottomSheet3.mergeDialogId)) ? false : true;
                }
            }
        }).map(new GroupCallSheet$$ExternalSyntheticLambda3(3)).collect(Collectors.toCollection(new ChatActivity$$ExternalSyntheticLambda264()));
        TLRPC.Chat chat2 = this.inChat;
        Action action3 = this.deleteAll;
        if (z2) {
            if (!this.restrictUserDeleteAllReactions) {
                int i8 = 0;
                while (i8 < action3.totalCount) {
                    boolean[] zArr5 = action3.filter;
                    if (zArr5 == null || zArr5[i8]) {
                        long dialogId = DialogObject.getDialogId((TLObject) action3.options.get(i8));
                        int size2 = arrayList3.size();
                        int i9 = 0;
                        while (i9 < size2) {
                            Integer num = arrayList3.get(i9);
                            i9++;
                            MessagesController.getInstance(this.currentAccount).deleteReactionsFromMessage(-chat2.id, dialogId, num.intValue());
                            j5 = j5;
                        }
                        j3 = j5;
                        int size3 = arrayList4.size();
                        int i10 = 0;
                        while (i10 < size3) {
                            Integer num2 = arrayList4.get(i10);
                            i10++;
                            MessagesController.getInstance(this.currentAccount).deleteReactionsFromMessage(this.mergeDialogId, dialogId, num2.intValue());
                        }
                    } else {
                        j3 = j5;
                    }
                    i8++;
                    j5 = j3;
                }
            }
            j = j5;
        } else {
            j = 0;
            if (!arrayList3.isEmpty()) {
                MessagesController.getInstance(this.currentAccount).deleteMessages(arrayList3, null, null, -chat2.id, this.topicId, false, this.mode);
            }
            if (!arrayList4.isEmpty()) {
                MessagesController.getInstance(this.currentAccount).deleteMessages(arrayList4, null, null, this.mergeDialogId, this.topicId, true, this.mode);
            }
        }
        for (int i11 = 0; i11 < action2.totalCount; i11++) {
            if (action2.checks[i11] && ((zArr4 = action2.filter) == null || zArr4[i11])) {
                TLObject tLObject = (TLObject) action2.options.get(i11);
                long j6 = chat2.id;
                if (ChatObject.isMonoForum(chat2) && ChatObject.canManageMonoForum(this.currentAccount, chat2)) {
                    long j7 = chat2.linked_monoforum_id;
                    if (j7 != j) {
                        j2 = j7;
                    } else {
                        j2 = j6;
                    }
                } else {
                    j2 = j6;
                }
                if (this.restrict) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights2 = (TLRPC.TL_chatBannedRights) this.participantsBannedRights.get(i11);
                    TLRPC.TL_chatBannedRights tL_chatBannedRights3 = this.bannedRights;
                    if (tL_chatBannedRights3 == null) {
                        tL_chatBannedRights = tL_chatBannedRights2;
                    } else if (tL_chatBannedRights2 == null) {
                        tL_chatBannedRights = tL_chatBannedRights3;
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights4 = new TLRPC.TL_chatBannedRights();
                        tL_chatBannedRights4.view_messages = tL_chatBannedRights3.view_messages || tL_chatBannedRights2.view_messages;
                        tL_chatBannedRights4.send_messages = tL_chatBannedRights3.send_messages || tL_chatBannedRights2.send_messages;
                        tL_chatBannedRights4.send_media = tL_chatBannedRights3.send_media || tL_chatBannedRights2.send_media;
                        tL_chatBannedRights4.send_stickers = tL_chatBannedRights3.send_stickers || tL_chatBannedRights2.send_stickers;
                        tL_chatBannedRights4.send_gifs = tL_chatBannedRights3.send_gifs || tL_chatBannedRights2.send_gifs;
                        tL_chatBannedRights4.send_games = tL_chatBannedRights3.send_games || tL_chatBannedRights2.send_games;
                        tL_chatBannedRights4.send_inline = tL_chatBannedRights3.send_inline || tL_chatBannedRights2.send_inline;
                        tL_chatBannedRights4.embed_links = tL_chatBannedRights3.embed_links || tL_chatBannedRights2.embed_links;
                        tL_chatBannedRights4.send_polls = tL_chatBannedRights3.send_polls || tL_chatBannedRights2.send_polls;
                        tL_chatBannedRights4.send_reactions = tL_chatBannedRights3.send_reactions || tL_chatBannedRights2.send_reactions;
                        tL_chatBannedRights4.change_info = tL_chatBannedRights3.change_info || tL_chatBannedRights2.change_info;
                        tL_chatBannedRights4.invite_users = tL_chatBannedRights3.invite_users || tL_chatBannedRights2.invite_users;
                        tL_chatBannedRights4.pin_messages = tL_chatBannedRights3.pin_messages || tL_chatBannedRights2.pin_messages;
                        tL_chatBannedRights4.manage_topics = tL_chatBannedRights3.manage_topics || tL_chatBannedRights2.manage_topics;
                        tL_chatBannedRights4.send_photos = tL_chatBannedRights3.send_photos || tL_chatBannedRights2.send_photos;
                        tL_chatBannedRights4.send_videos = tL_chatBannedRights3.send_videos || tL_chatBannedRights2.send_videos;
                        tL_chatBannedRights4.send_roundvideos = tL_chatBannedRights3.send_roundvideos || tL_chatBannedRights2.send_roundvideos;
                        tL_chatBannedRights4.send_audios = tL_chatBannedRights3.send_audios || tL_chatBannedRights2.send_audios;
                        tL_chatBannedRights4.send_voices = tL_chatBannedRights3.send_voices || tL_chatBannedRights2.send_voices;
                        tL_chatBannedRights4.send_docs = tL_chatBannedRights3.send_docs || tL_chatBannedRights2.send_docs;
                        tL_chatBannedRights4.send_plain = tL_chatBannedRights3.send_plain || tL_chatBannedRights2.send_plain;
                        tL_chatBannedRights = tL_chatBannedRights4;
                    }
                    if (tLObject instanceof TLRPC.User) {
                        MessagesController.getInstance(this.currentAccount).setParticipantBannedRole(j2, (TLRPC.User) tLObject, null, tL_chatBannedRights, false, this.baseFragment);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        MessagesController.getInstance(this.currentAccount).setParticipantBannedRole(j2, null, (TLRPC.Chat) tLObject, tL_chatBannedRights, false, this.baseFragment);
                    }
                } else if (tLObject instanceof TLRPC.User) {
                    MessagesController.getInstance(this.currentAccount).deleteParticipantFromChat(j2, (TLRPC.User) tLObject, (TLRPC.Chat) null, false, false);
                } else if (tLObject instanceof TLRPC.Chat) {
                    MessagesController.getInstance(this.currentAccount).deleteParticipantFromChat(j2, (TLRPC.User) null, (TLRPC.Chat) tLObject, false, false);
                }
            }
        }
        for (int i12 = 0; i12 < action.totalCount; i12++) {
            if (action.checks[i12] && ((zArr3 = action.filter) == null || zArr3[i12])) {
                TLObject tLObject2 = (TLObject) action.options.get(i12);
                ArrayList<Integer> arrayList5 = (ArrayList) Collection.EL.stream(arrayList2).filter(new Predicate(this) {
                    public final DeleteMessagesBottomSheet f$0;

                    {
                        this.f$0 = this;
                    }

                    public final Predicate and(Predicate predicate) {
                        int i13 = i;
                        return Predicate$CC.$default$and(this, predicate);
                    }

                    public final Predicate negate() {
                        switch (i) {
                            case 0:
                                break;
                            case 1:
                                break;
                        }
                        return Predicate$CC.$default$negate(this);
                    }

                    public final Predicate or(Predicate predicate) {
                        int i13 = i;
                        return Predicate$CC.$default$or(this, predicate);
                    }

                    @Override
                    public final boolean test(Object obj) {
                        MessageObject messageObject = (MessageObject) obj;
                        switch (i) {
                            case 0:
                                DeleteMessagesBottomSheet deleteMessagesBottomSheet = this.f$0;
                                deleteMessagesBottomSheet.getClass();
                                TLRPC.Peer peer = messageObject.messageOwner.peer_id;
                                long j8 = deleteMessagesBottomSheet.mergeDialogId;
                                return !(peer == null || peer.chat_id == (-j8)) || j8 == 0;
                            case 1:
                                DeleteMessagesBottomSheet deleteMessagesBottomSheet2 = this.f$0;
                                deleteMessagesBottomSheet2.getClass();
                                TLRPC.Peer peer2 = messageObject.messageOwner.peer_id;
                                if (peer2 != null) {
                                    long j9 = peer2.chat_id;
                                    long j10 = deleteMessagesBottomSheet2.mergeDialogId;
                                    if (j9 == (-j10) && j10 != 0) {
                                        return true;
                                    }
                                }
                                return false;
                            default:
                                DeleteMessagesBottomSheet deleteMessagesBottomSheet3 = this.f$0;
                                deleteMessagesBottomSheet3.getClass();
                                TLRPC.Peer peer3 = messageObject.messageOwner.peer_id;
                                return (peer3 == null || peer3.chat_id == (-deleteMessagesBottomSheet3.mergeDialogId)) ? false : true;
                        }
                    }
                }).filter(new ChatActivity$$ExternalSyntheticLambda263(tLObject2, 2)).map(new GroupCallSheet$$ExternalSyntheticLambda3(3)).collect(Collectors.toCollection(new ChatActivity$$ExternalSyntheticLambda264()));
                if (z2 && (tLObject2 instanceof TLRPC.User) && arrayList5.size() == 1) {
                    TLRPC.TL_messages_reportReaction tL_messages_reportReaction = new TLRPC.TL_messages_reportReaction();
                    tL_messages_reportReaction.peer = MessagesController.getInputPeer(chat2);
                    tL_messages_reportReaction.user_id = MessagesController.getInstance(this.currentAccount).getInputUser((TLRPC.User) tLObject2);
                    tL_messages_reportReaction.id = arrayList5.get(0).intValue();
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_reportReaction, null);
                } else {
                    TLRPC.TL_channels_reportSpam tL_channels_reportSpam = new TLRPC.TL_channels_reportSpam();
                    tL_channels_reportSpam.channel = MessagesController.getInputChannel(chat2);
                    if (tLObject2 instanceof TLRPC.User) {
                        tL_channels_reportSpam.participant = MessagesController.getInputPeer((TLRPC.User) tLObject2);
                    } else if (tLObject2 instanceof TLRPC.Chat) {
                        tL_channels_reportSpam.participant = MessagesController.getInputPeer((TLRPC.Chat) tLObject2);
                    }
                    tL_channels_reportSpam.id = arrayList5;
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_reportSpam, null);
                }
            }
        }
        if (this.isSingleUsersMode) {
            for (int i13 = 0; i13 < action3.totalCount; i13++) {
                boolean[] zArr6 = action3.filter;
                if (zArr6 == null || zArr6[i13]) {
                    TLObject tLObject3 = (TLObject) action3.options.get(i13);
                    if (!this.restrictUserDeleteAllMessages) {
                        r7 = 0;
                    } else if (tLObject3 instanceof TLRPC.User) {
                        r7 = 0;
                        MessagesController.getInstance(this.currentAccount).deleteUserChannelHistory(chat2, (TLRPC.User) tLObject3, null, 0);
                    } else {
                        r7 = 0;
                        r7 = 0;
                        if (tLObject3 instanceof TLRPC.Chat) {
                            MessagesController.getInstance(this.currentAccount).deleteUserChannelHistory(chat2, null, (TLRPC.Chat) tLObject3, 0);
                        }
                    }
                    if (this.restrictUserDeleteAllReactions) {
                        if (tLObject3 instanceof TLRPC.User) {
                            MessagesController.getInstance(this.currentAccount).deleteUserChannelAllReactions(chat2, (TLRPC.User) tLObject3, r7);
                        } else if (tLObject3 instanceof TLRPC.Chat) {
                            MessagesController.getInstance(this.currentAccount).deleteUserChannelAllReactions(chat2, r7, (TLRPC.Chat) tLObject3);
                        }
                    }
                }
            }
            return;
        }
        for (int i14 = 0; i14 < action3.totalCount; i14++) {
            if (action3.checks[i14] && ((zArr2 = action3.filter) == null || zArr2[i14])) {
                TLObject tLObject4 = (TLObject) action3.options.get(i14);
                if (tLObject4 instanceof TLRPC.User) {
                    MessagesController.getInstance(this.currentAccount).deleteUserChannelHistory(chat2, (TLRPC.User) tLObject4, null, 0);
                } else if (tLObject4 instanceof TLRPC.Chat) {
                    MessagesController.getInstance(this.currentAccount).deleteUserChannelHistory(chat2, null, (TLRPC.Chat) tLObject4, 0);
                }
            }
        }
        int i15 = 0;
        while (true) {
            Action action4 = this.deleteAllReactions;
            if (i15 >= action4.totalCount) {
                return;
            }
            if (action4.checks[i15] && ((zArr = action4.filter) == null || zArr[i15])) {
                TLObject tLObject5 = (TLObject) action4.options.get(i15);
                if (tLObject5 instanceof TLRPC.User) {
                    MessagesController.getInstance(this.currentAccount).deleteUserChannelAllReactions(chat2, (TLRPC.User) tLObject5, null);
                } else if (tLObject5 instanceof TLRPC.Chat) {
                    MessagesController.getInstance(this.currentAccount).deleteUserChannelAllReactions(chat2, null, (TLRPC.Chat) tLObject5);
                }
            }
            i15++;
        }
    }

    @Override
    public final void show() {
        super.show();
        Bulletin bulletin = Bulletin.visibleBulletin;
        if (bulletin != null) {
            bulletin.hide();
        }
    }

    public final void updateParticipantMessageCounts() {
        if (this.participantMessageCountsLoading) {
            return;
        }
        this.participantMessageCountsLoading = true;
        Action action = this.deleteAll;
        int i = action.totalCount;
        this.participantMessageCounts = new int[i];
        int[] iArr = {i};
        for (int i2 = 0; i2 < action.totalCount; i2++) {
            TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
            tL_messages_search.peer = MessagesController.getInputPeer(this.inChat);
            tL_messages_search.q = "";
            TLRPC.InputPeer inputPeer = MessagesController.getInputPeer((TLObject) action.options.get(i2));
            tL_messages_search.from_id = inputPeer;
            tL_messages_search.flags |= 1;
            tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
            tL_messages_search.limit = 1;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_search, new ArticleViewer$$ExternalSyntheticLambda53(this, inputPeer, i2, iArr, 2));
        }
    }
}
