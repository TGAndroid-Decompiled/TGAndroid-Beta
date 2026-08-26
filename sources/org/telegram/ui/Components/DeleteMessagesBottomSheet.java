package org.telegram.ui.Components;

import android.content.SharedPreferences;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_language_id_common.zzhp;
import com.google.android.gms.internal.mlkit_vision_common.zzke;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FactCheckController$$ExternalSyntheticOutline0;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.CollapseTextCell;
import org.telegram.ui.Cells.TextCheckCell2;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda426;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda15;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public class DeleteMessagesBottomSheet extends BottomSheetWithRecyclerListView {
    private static final int ACTION_BAN = 2;
    private static final int ACTION_DELETE_ALL = 1;
    private static final int ACTION_DELETE_ALL_REACTIONS = 3;
    private static final int ACTION_REPORT = 0;
    private static final int OPTION_BAN_FROM_COMMUNITY = 103;
    private static final int OPTION_BAN_FROM_COMMUNITY_INFO = 104;
    private static final int OPTION_DELETE = 100;
    private static final int OPTION_DELETE_MESSAGES = 101;
    private static final int OPTION_DELETE_REACTIONS = 102;
    private static final int RIGHT_ADD_USERS = 2;
    private static final int RIGHT_CHANGE_CHAT_INFO = 4;
    private static final int RIGHT_CREATE_TOPICS = 5;
    private static final int RIGHT_PIN_MESSAGES = 3;
    private static final int RIGHT_SEND_FILES = 8;
    private static final int RIGHT_SEND_LINKS = 14;
    private static final int RIGHT_SEND_MEDIA = 1;
    private static final int RIGHT_SEND_MESSAGES = 0;
    private static final int RIGHT_SEND_MUSIC = 9;
    private static final int RIGHT_SEND_PHOTOS = 6;
    private static final int RIGHT_SEND_POLLS = 13;
    private static final int RIGHT_SEND_REACTIONS = 15;
    private static final int RIGHT_SEND_ROUND = 11;
    private static final int RIGHT_SEND_STICKERS = 12;
    private static final int RIGHT_SEND_VIDEOS = 7;
    private static final int RIGHT_SEND_VOICE = 10;
    private ButtonWithCounterView actionButton;
    private UniversalAdapter adapter;
    private boolean banChecked;
    private boolean[] banFilter;
    private boolean banFromCommunity;
    private TL_communities.ParticipantJoinedChats banFromCommunityChats;
    private long banFromCommunityDialogId;
    private Action banOrRestrict;
    private TLRPC.TL_chatBannedRights bannedRights;
    private boolean canRestrict;
    private TLRPC.TL_chatBannedRights defaultBannedRights;
    private Action deleteAll;
    private Action deleteAllReactions;
    private TLRPC.Chat inChat;
    private TLRPC.Chat inCommunity;
    private boolean isForum;
    private final boolean isReactionOnlyMode;
    private final boolean isSingleUsersMode;
    private long mergeDialogId;
    private ArrayList<MessageObject> messages;
    private int mode;
    private boolean monoforum;
    private Runnable onDelete;
    private int[] participantMessageCounts;
    private boolean participantMessageCountsLoaded;
    private boolean participantMessageCountsLoading;
    private ArrayList<TLRPC.TL_chatBannedRights> participantsBannedRights;
    private Action report;
    private boolean restrict;
    private boolean[] restrictFilter;
    private boolean restrictUserCollapsed;
    private boolean restrictUserDeleteAllMessages;
    private boolean restrictUserDeleteAllReactions;
    private boolean sendMediaCollapsed;
    private float shiftDp;
    private int topicId;

    public class Action {
        boolean[] checks;
        boolean collapsed;
        boolean[] filter;
        int filteredCount;
        ArrayList<TLObject> options;
        int selectedCount;
        String title;
        int totalCount;
        int type;

        public Action(int i, ArrayList<TLObject> arrayList) {
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

        public boolean areAllSelected() {
            boolean[] zArr;
            for (int i = 0; i < this.totalCount; i++) {
                if (!this.checks[i] || ((zArr = this.filter) != null && !zArr[i])) {
                    return false;
                }
            }
            return true;
        }

        public void collapseOrExpand() {
            this.collapsed = !this.collapsed;
            DeleteMessagesBottomSheet.this.adapter.update(true);
        }

        public TLObject first() {
            for (int i = 0; i < this.totalCount; i++) {
                boolean[] zArr = this.filter;
                if (zArr == null || zArr[i]) {
                    return this.options.get(i);
                }
            }
            return null;
        }

        public void forEach(Utilities.IndexedConsumer<TLObject> indexedConsumer) {
            for (int i = 0; i < this.totalCount; i++) {
                boolean[] zArr = this.filter;
                if (zArr == null || zArr[i]) {
                    indexedConsumer.accept(this.options.get(i), i);
                }
            }
        }

        public void forEachSelected(Utilities.IndexedConsumer<TLObject> indexedConsumer) {
            boolean[] zArr;
            for (int i = 0; i < this.totalCount; i++) {
                if (this.checks[i] && ((zArr = this.filter) == null || zArr[i])) {
                    indexedConsumer.accept(this.options.get(i), i);
                }
            }
        }

        public int getCount() {
            return this.filter != null ? this.filteredCount : this.totalCount;
        }

        public boolean isExpandable() {
            return getCount() > 1;
        }

        public boolean isOneSelected() {
            boolean[] zArr;
            for (int i = 0; i < this.totalCount; i++) {
                if (this.checks[i] && ((zArr = this.filter) == null || zArr[i])) {
                    return true;
                }
            }
            return false;
        }

        public boolean isPresent() {
            return getCount() > 0;
        }

        public void setAllChecks(boolean z) {
            setAllChecks(z, true);
        }

        public void setFilter(boolean[] zArr) {
            if (this.totalCount == 0) {
                return;
            }
            this.filter = zArr;
            updateCounters();
            updateTitle();
        }

        public void toggleAllChecks() {
            setAllChecks(!isOneSelected());
        }

        public void toggleCheck(int i) {
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

        public void updateCounters() {
            this.selectedCount = 0;
            this.filteredCount = 0;
            for (int i = 0; i < this.totalCount; i++) {
                boolean[] zArr = this.filter;
                if (zArr == null) {
                    if (this.checks[i]) {
                        this.selectedCount++;
                    }
                } else if (zArr[i]) {
                    this.filteredCount++;
                    if (this.checks[i]) {
                        this.selectedCount++;
                    }
                }
            }
        }

        public void updateTitle() {
            if (this.totalCount == 0) {
                return;
            }
            TLObject tLObjectFirst = first();
            String forcedFirstName = tLObjectFirst instanceof TLRPC.User ? UserObject.getForcedFirstName((TLRPC.User) tLObjectFirst) : ContactsController.formatName(tLObjectFirst);
            int i = this.type;
            if (i == 0) {
                this.title = LocaleController.getString(R.string.DeleteReportSpam);
                return;
            }
            if (i == 1) {
                this.title = isExpandable() ? LocaleController.getString(R.string.DeleteAllMessagesFromUsers) : LocaleController.formatString(R.string.DeleteAllFrom, forcedFirstName);
                return;
            }
            if (i == 3) {
                this.title = isExpandable() ? LocaleController.getString(R.string.DeleteAllReactionsFromUsers) : LocaleController.formatString(R.string.DeleteAllReactionsFrom, forcedFirstName);
            } else if (i == 2) {
                if (DeleteMessagesBottomSheet.this.restrict) {
                    this.title = isExpandable() ? LocaleController.getString(R.string.DeleteRestrictUsers) : LocaleController.formatString(R.string.DeleteRestrict, forcedFirstName);
                } else {
                    this.title = isExpandable() ? LocaleController.getString(R.string.DeleteBanUsers) : LocaleController.formatString(R.string.DeleteBan, forcedFirstName);
                }
            }
        }

        public void setAllChecks(boolean z, boolean z2) {
            Arrays.fill(this.checks, z);
            updateCounters();
            if (z2) {
                DeleteMessagesBottomSheet.this.adapter.update(true);
            }
        }
    }

    public DeleteMessagesBottomSheet(BaseFragment baseFragment, TLRPC.Chat chat, ArrayList<MessageObject> arrayList, ArrayList<TLObject> arrayList2, TLRPC.ChannelParticipant[] channelParticipantArr, long j, int i, int i2, boolean z, Runnable runnable) {
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        TLRPC.TL_chatBannedRights tL_chatBannedRights2;
        super(baseFragment.getContext(), baseFragment, false, false, false, true, BottomSheetWithRecyclerListView.ActionBarType.SLIDING, baseFragment.getResourceProvider());
        this.restrict = false;
        this.participantMessageCountsLoading = false;
        this.participantMessageCountsLoaded = false;
        this.sendMediaCollapsed = true;
        this.restrictUserCollapsed = true;
        this.restrictUserDeleteAllMessages = false;
        this.restrictUserDeleteAllReactions = false;
        this.shiftDp = 10.0f;
        setBackgroundColor(getThemedColor(Theme.key_windowBackgroundGray));
        setShowHandle(true);
        fixNavigationBar();
        this.takeTranslationIntoAccount = true;
        this.isReactionOnlyMode = z;
        RecyclerListView recyclerListView = this.recyclerListView;
        int i3 = this.backgroundPaddingLeft;
        recyclerListView.setPadding(i3, this.headerTotalHeight, i3, AndroidUtilities.dp(63.0f));
        this.recyclerListView.setClipToPadding(false);
        this.recyclerListView.setOnItemClickListener(new DeleteMessagesBottomSheet$$ExternalSyntheticLambda4(this, 0));
        this.takeTranslationIntoAccount = true;
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator() {
            @Override
            public void onMoveAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                super.onMoveAnimationUpdate(viewHolder);
                ((BottomSheet) DeleteMessagesBottomSheet.this).containerView.invalidate();
            }
        };
        defaultItemAnimator.setSupportsChangeAnimations(false);
        defaultItemAnimator.setDelayAnimations(false);
        defaultItemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        defaultItemAnimator.setDurations(350L);
        this.recyclerListView.lambda$onCellEnter$52(defaultItemAnimator);
        this.recyclerListView.setSections();
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(getContext(), true, this.resourcesProvider);
        this.actionButton = buttonWithCounterView;
        buttonWithCounterView.setRound();
        this.actionButton.setText(LocaleController.getString(R.string.DeleteProceedBtn));
        this.actionButton.setOnClickListener(new HintView$$ExternalSyntheticLambda0(this, 18));
        this.containerView.addView(this.actionButton, LayoutHelper.createFrameMarginPx(-1, 48.0f, 87, AndroidUtilities.dp(10.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(10.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(10.0f)));
        this.inChat = chat;
        this.isForum = ChatObject.isForum(chat);
        this.messages = arrayList;
        this.mergeDialogId = j;
        this.topicId = i;
        this.mode = i2;
        this.onDelete = runnable;
        this.defaultBannedRights = chat.default_banned_rights;
        TLRPC.TL_chatBannedRights tL_chatBannedRights3 = new TLRPC.TL_chatBannedRights();
        this.bannedRights = tL_chatBannedRights3;
        TLRPC.TL_chatBannedRights tL_chatBannedRights4 = this.defaultBannedRights;
        if (tL_chatBannedRights4.view_messages) {
            tL_chatBannedRights3.view_messages = true;
        }
        if (tL_chatBannedRights4.send_messages) {
            tL_chatBannedRights3.send_messages = true;
        }
        if (tL_chatBannedRights4.send_media) {
            tL_chatBannedRights3.send_media = true;
        }
        if (tL_chatBannedRights4.send_stickers) {
            tL_chatBannedRights3.send_stickers = true;
        }
        if (tL_chatBannedRights4.send_gifs) {
            tL_chatBannedRights3.send_gifs = true;
        }
        if (tL_chatBannedRights4.send_games) {
            tL_chatBannedRights3.send_games = true;
        }
        if (tL_chatBannedRights4.send_inline) {
            tL_chatBannedRights3.send_inline = true;
        }
        if (tL_chatBannedRights4.embed_links) {
            tL_chatBannedRights3.embed_links = true;
        }
        if (tL_chatBannedRights4.send_polls) {
            tL_chatBannedRights3.send_polls = true;
        }
        if (tL_chatBannedRights4.invite_users) {
            tL_chatBannedRights3.invite_users = true;
        }
        if (tL_chatBannedRights4.change_info) {
            tL_chatBannedRights3.change_info = true;
        }
        if (tL_chatBannedRights4.pin_messages) {
            tL_chatBannedRights3.pin_messages = true;
        }
        if (tL_chatBannedRights4.manage_topics) {
            tL_chatBannedRights3.manage_topics = true;
        }
        if (tL_chatBannedRights4.send_photos) {
            tL_chatBannedRights3.send_photos = true;
        }
        if (tL_chatBannedRights4.send_videos) {
            tL_chatBannedRights3.send_videos = true;
        }
        if (tL_chatBannedRights4.send_audios) {
            tL_chatBannedRights3.send_audios = true;
        }
        if (tL_chatBannedRights4.send_docs) {
            tL_chatBannedRights3.send_docs = true;
        }
        if (tL_chatBannedRights4.send_voices) {
            tL_chatBannedRights3.send_voices = true;
        }
        if (tL_chatBannedRights4.send_roundvideos) {
            tL_chatBannedRights3.send_roundvideos = true;
        }
        if (tL_chatBannedRights4.send_plain) {
            tL_chatBannedRights3.send_plain = true;
        }
        if (tL_chatBannedRights4.send_reactions) {
            tL_chatBannedRights3.send_reactions = true;
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
            this.banFromCommunityDialogId = DialogObject.getDialogId(arrayList2.get(0));
            MessagesController.getInstance(this.currentAccount).fetchCommunityJoinedChats(this.inCommunity.id, this.banFromCommunityDialogId, new DeleteMessagesBottomSheet$$ExternalSyntheticLambda0(this, 1));
        }
        if (ChatObject.canBlockUsers(chat)) {
            this.banFilter = new boolean[arrayList2.size()];
            int i4 = 0;
            while (true) {
                if (i4 >= arrayList2.size()) {
                    break;
                }
                TLRPC.ChannelParticipant channelParticipant = i4 < channelParticipantArr.length ? channelParticipantArr[i4] : null;
                if ((chat.creator || (!(channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) && !(channelParticipant instanceof TLRPC.TL_channelParticipantCreator))) && (!(channelParticipant instanceof TLRPC.TL_channelParticipantBanned) || (tL_chatBannedRights2 = channelParticipant.banned_rights) == null || !isBanned(tL_chatBannedRights2))) {
                    this.banFilter[i4] = true;
                }
                i4++;
            }
            this.restrictFilter = new boolean[arrayList2.size()];
            if (hasAnyDefaultRights()) {
                int i5 = 0;
                while (i5 < arrayList2.size()) {
                    TLRPC.ChannelParticipant channelParticipant2 = i5 < channelParticipantArr.length ? channelParticipantArr[i5] : null;
                    if (!(arrayList2.get(i5) instanceof TLRPC.Chat) && ((!(channelParticipant2 instanceof TLRPC.TL_channelParticipantBanned) || (tL_chatBannedRights = channelParticipant2.banned_rights) == null || canBeRestricted(tL_chatBannedRights)) && this.banFilter[i5])) {
                        this.restrictFilter[i5] = true;
                        this.canRestrict = true;
                    }
                    i5++;
                }
            }
            this.participantsBannedRights = (ArrayList) DesugarArrays.stream(channelParticipantArr).map(new DeleteMessagesBottomSheet$$ExternalSyntheticLambda7(0)).collect(Collectors.toCollection(new ChatActivity$$ExternalSyntheticLambda426()));
            Action action = new Action(2, arrayList2);
            this.banOrRestrict = action;
            action.setFilter(this.banFilter);
        } else {
            this.banOrRestrict = new Action(2, new ArrayList(0));
        }
        this.adapter.update(false);
        this.actionBar.setTitle(getTitle());
    }

    private boolean allDefaultMediaBanned() {
        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.defaultBannedRights;
        return tL_chatBannedRights.send_photos && tL_chatBannedRights.send_videos && tL_chatBannedRights.send_stickers && tL_chatBannedRights.send_audios && tL_chatBannedRights.send_docs && tL_chatBannedRights.send_voices && tL_chatBannedRights.send_roundvideos && tL_chatBannedRights.embed_links && tL_chatBannedRights.send_polls && tL_chatBannedRights.send_reactions;
    }

    public static TLRPC.TL_chatBannedRights bannedRightsOr(TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2) {
        if (tL_chatBannedRights == null) {
            return tL_chatBannedRights2;
        }
        if (tL_chatBannedRights2 == null) {
            return tL_chatBannedRights;
        }
        TLRPC.TL_chatBannedRights tL_chatBannedRights3 = new TLRPC.TL_chatBannedRights();
        boolean z = true;
        tL_chatBannedRights3.view_messages = tL_chatBannedRights.view_messages || tL_chatBannedRights2.view_messages;
        tL_chatBannedRights3.send_messages = tL_chatBannedRights.send_messages || tL_chatBannedRights2.send_messages;
        tL_chatBannedRights3.send_media = tL_chatBannedRights.send_media || tL_chatBannedRights2.send_media;
        tL_chatBannedRights3.send_stickers = tL_chatBannedRights.send_stickers || tL_chatBannedRights2.send_stickers;
        tL_chatBannedRights3.send_gifs = tL_chatBannedRights.send_gifs || tL_chatBannedRights2.send_gifs;
        tL_chatBannedRights3.send_games = tL_chatBannedRights.send_games || tL_chatBannedRights2.send_games;
        tL_chatBannedRights3.send_inline = tL_chatBannedRights.send_inline || tL_chatBannedRights2.send_inline;
        tL_chatBannedRights3.embed_links = tL_chatBannedRights.embed_links || tL_chatBannedRights2.embed_links;
        tL_chatBannedRights3.send_polls = tL_chatBannedRights.send_polls || tL_chatBannedRights2.send_polls;
        tL_chatBannedRights3.send_reactions = tL_chatBannedRights.send_reactions || tL_chatBannedRights2.send_reactions;
        tL_chatBannedRights3.change_info = tL_chatBannedRights.change_info || tL_chatBannedRights2.change_info;
        tL_chatBannedRights3.invite_users = tL_chatBannedRights.invite_users || tL_chatBannedRights2.invite_users;
        tL_chatBannedRights3.pin_messages = tL_chatBannedRights.pin_messages || tL_chatBannedRights2.pin_messages;
        tL_chatBannedRights3.manage_topics = tL_chatBannedRights.manage_topics || tL_chatBannedRights2.manage_topics;
        tL_chatBannedRights3.send_photos = tL_chatBannedRights.send_photos || tL_chatBannedRights2.send_photos;
        tL_chatBannedRights3.send_videos = tL_chatBannedRights.send_videos || tL_chatBannedRights2.send_videos;
        tL_chatBannedRights3.send_roundvideos = tL_chatBannedRights.send_roundvideos || tL_chatBannedRights2.send_roundvideos;
        tL_chatBannedRights3.send_audios = tL_chatBannedRights.send_audios || tL_chatBannedRights2.send_audios;
        tL_chatBannedRights3.send_voices = tL_chatBannedRights.send_voices || tL_chatBannedRights2.send_voices;
        tL_chatBannedRights3.send_docs = tL_chatBannedRights.send_docs || tL_chatBannedRights2.send_docs;
        if (!tL_chatBannedRights.send_plain && !tL_chatBannedRights2.send_plain) {
            z = false;
        }
        tL_chatBannedRights3.send_plain = z;
        return tL_chatBannedRights3;
    }

    private boolean canBeRestricted(TLRPC.TL_chatBannedRights tL_chatBannedRights) {
        if (!tL_chatBannedRights.send_stickers && !this.defaultBannedRights.send_stickers) {
            return true;
        }
        if (!tL_chatBannedRights.send_gifs && !this.defaultBannedRights.send_gifs) {
            return true;
        }
        if (!tL_chatBannedRights.send_games && !this.defaultBannedRights.send_games) {
            return true;
        }
        if (!tL_chatBannedRights.send_inline && !this.defaultBannedRights.send_inline) {
            return true;
        }
        if (!tL_chatBannedRights.embed_links && !tL_chatBannedRights.send_plain) {
            TLRPC.TL_chatBannedRights tL_chatBannedRights2 = this.defaultBannedRights;
            if (!tL_chatBannedRights2.embed_links && !tL_chatBannedRights2.send_plain) {
                return true;
            }
        }
        if (!tL_chatBannedRights.send_polls && !this.defaultBannedRights.send_polls) {
            return true;
        }
        if (!tL_chatBannedRights.send_reactions && !this.defaultBannedRights.send_reactions) {
            return true;
        }
        if (!tL_chatBannedRights.change_info && !this.defaultBannedRights.change_info) {
            return true;
        }
        if (!tL_chatBannedRights.invite_users && !this.defaultBannedRights.invite_users) {
            return true;
        }
        if (!tL_chatBannedRights.pin_messages && !this.defaultBannedRights.pin_messages) {
            return true;
        }
        if (!tL_chatBannedRights.manage_topics && !this.defaultBannedRights.manage_topics && this.isForum) {
            return true;
        }
        if (!tL_chatBannedRights.send_photos && !this.defaultBannedRights.send_photos) {
            return true;
        }
        if (!tL_chatBannedRights.send_videos && !this.defaultBannedRights.send_videos) {
            return true;
        }
        if (!tL_chatBannedRights.send_roundvideos && !this.defaultBannedRights.send_roundvideos) {
            return true;
        }
        if (!tL_chatBannedRights.send_audios && !this.defaultBannedRights.send_audios) {
            return true;
        }
        if (!tL_chatBannedRights.send_voices && !this.defaultBannedRights.send_voices) {
            return true;
        }
        if (tL_chatBannedRights.send_docs || this.defaultBannedRights.send_docs) {
            return (tL_chatBannedRights.send_plain || this.defaultBannedRights.send_plain) ? false : true;
        }
        return true;
    }

    private void fillAction(ArrayList<UItem> arrayList, Action action) {
        if (action.isPresent()) {
            if (!action.isExpandable()) {
                arrayList.add(UItem.asRoundCheckbox(action.type, action.title).setChecked(action.selectedCount > 0));
                return;
            }
            int i = action.type;
            String str = action.title;
            int count = action.selectedCount;
            if (count <= 0) {
                count = action.getCount();
            }
            arrayList.add(UItem.asUserGroupCheckbox(i, str, String.valueOf(count)).setChecked(action.selectedCount > 0).setCollapsed(action.collapsed).setClickCallback(new AIEditorAlert$$ExternalSyntheticLambda16(3, this, action)));
            if (action.collapsed) {
                return;
            }
            action.forEach(new AIEditorAlert$$ExternalSyntheticLambda34(5, arrayList, action));
        }
    }

    public void fillItems(ArrayList<UItem> arrayList, UniversalAdapter universalAdapter) {
        boolean z;
        boolean z2;
        if (this.messages == null) {
            return;
        }
        arrayList.add(UItem.asSpace(AndroidUtilities.dp(12.0f)));
        zzke.m(R.string.DeleteAdditionalActions, arrayList);
        fillAction(arrayList, this.report);
        if (this.isSingleUsersMode) {
            this.deleteAll.updateTitle();
            int i = (this.restrictUserDeleteAllMessages ? 1 : 0) + (this.restrictUserDeleteAllReactions ? 1 : 0);
            String str = this.deleteAll.title;
            Locale locale = Locale.US;
            arrayList.add(UItem.asRoundGroupCheckbox(100, str, i + "/2").setChecked(i == 2).setCollapsed(this.restrictUserCollapsed).setClickCallback(new AIEditorAlert$$ExternalSyntheticLambda16(24, this, universalAdapter)));
            if (!this.restrictUserCollapsed) {
                arrayList.add(UItem.asRoundCheckbox(101, LocaleController.getString(R.string.RestrictUserDeleteAllMessages)).setChecked(this.restrictUserDeleteAllMessages).setPad(1));
                arrayList.add(UItem.asRoundCheckbox(102, LocaleController.getString(R.string.RestrictUserDeleteAllReactions)).setChecked(this.restrictUserDeleteAllReactions).setPad(1));
            }
        } else {
            fillAction(arrayList, this.deleteAll);
            fillAction(arrayList, this.deleteAllReactions);
        }
        fillAction(arrayList, this.banOrRestrict);
        if (this.monoforum || !this.banOrRestrict.isPresent()) {
            z = true;
        } else {
            if (this.restrict) {
                arrayList.add(UItem.asShadow(null));
                if (this.banOrRestrict.isExpandable()) {
                    arrayList.add(UItem.asAnimatedHeader(0, LocaleController.formatPluralString("UserRestrictionsCanDoUsers", this.banOrRestrict.selectedCount, new Object[0])));
                } else {
                    arrayList.add(UItem.asAnimatedHeader(0, LocaleController.getString(R.string.UserRestrictionsCanDo)));
                }
                arrayList.add(UItem.asSwitch(0, LocaleController.getString(R.string.UserRestrictionsSend)).setChecked((this.bannedRights.send_plain || this.defaultBannedRights.send_plain) ? false : true).setLocked(this.defaultBannedRights.send_plain));
                int sendMediaSelectedCount = getSendMediaSelectedCount();
                String string = LocaleController.getString(R.string.UserRestrictionsSendMedia);
                Locale locale2 = Locale.US;
                arrayList.add(UItem.asExpandableSwitch(1, string, sendMediaSelectedCount + "/10").setChecked(sendMediaSelectedCount > 0).setLocked(allDefaultMediaBanned()).setCollapsed(this.sendMediaCollapsed).setClickCallback(new AlertsCreator$$ExternalSyntheticLambda134(this, sendMediaSelectedCount, universalAdapter, 2)));
                if (!this.sendMediaCollapsed) {
                    arrayList.add(UItem.asRoundCheckbox(6, LocaleController.getString(R.string.SendMediaPermissionPhotos)).setChecked((this.bannedRights.send_photos || this.defaultBannedRights.send_photos) ? false : true).setLocked(this.defaultBannedRights.send_photos).setPad(1));
                    arrayList.add(UItem.asRoundCheckbox(7, LocaleController.getString(R.string.SendMediaPermissionVideos)).setChecked((this.bannedRights.send_videos || this.defaultBannedRights.send_videos) ? false : true).setLocked(this.defaultBannedRights.send_videos).setPad(1));
                    arrayList.add(UItem.asRoundCheckbox(8, LocaleController.getString(R.string.SendMediaPermissionFiles)).setChecked((this.bannedRights.send_docs || this.defaultBannedRights.send_docs) ? false : true).setLocked(this.defaultBannedRights.send_docs).setPad(1));
                    arrayList.add(UItem.asRoundCheckbox(9, LocaleController.getString(R.string.SendMediaPermissionMusic)).setChecked((this.bannedRights.send_audios || this.defaultBannedRights.send_audios) ? false : true).setLocked(this.defaultBannedRights.send_audios).setPad(1));
                    arrayList.add(UItem.asRoundCheckbox(10, LocaleController.getString(R.string.SendMediaPermissionVoice)).setChecked((this.bannedRights.send_voices || this.defaultBannedRights.send_voices) ? false : true).setLocked(this.defaultBannedRights.send_voices).setPad(1));
                    arrayList.add(UItem.asRoundCheckbox(11, LocaleController.getString(R.string.SendMediaPermissionRound)).setChecked((this.bannedRights.send_roundvideos || this.defaultBannedRights.send_roundvideos) ? false : true).setLocked(this.defaultBannedRights.send_roundvideos).setPad(1));
                    arrayList.add(UItem.asRoundCheckbox(12, LocaleController.getString(R.string.SendMediaPermissionStickersGifs)).setChecked((this.bannedRights.send_stickers || this.defaultBannedRights.send_stickers) ? false : true).setLocked(this.defaultBannedRights.send_stickers).setPad(1));
                    arrayList.add(UItem.asRoundCheckbox(13, LocaleController.getString(R.string.SendMediaPolls)).setChecked((this.bannedRights.send_polls || this.defaultBannedRights.send_polls) ? false : true).setLocked(this.defaultBannedRights.send_polls).setPad(1));
                    UItem uItemAsRoundCheckbox = UItem.asRoundCheckbox(14, LocaleController.getString(R.string.UserRestrictionsEmbedLinks));
                    TLRPC.TL_chatBannedRights tL_chatBannedRights = this.bannedRights;
                    if (tL_chatBannedRights.embed_links) {
                        z2 = false;
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights2 = this.defaultBannedRights;
                        if (tL_chatBannedRights2.embed_links || tL_chatBannedRights.send_plain || tL_chatBannedRights2.send_plain) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                    }
                    arrayList.add(uItemAsRoundCheckbox.setChecked(z2).setLocked(this.defaultBannedRights.embed_links).setPad(1));
                    arrayList.add(UItem.asRoundCheckbox(15, LocaleController.getString(R.string.UserRestrictionsSendReactions)).setChecked((this.bannedRights.send_reactions || this.defaultBannedRights.send_reactions) ? false : true).setLocked(this.defaultBannedRights.send_reactions).setPad(1));
                }
                arrayList.add(UItem.asSwitch(2, LocaleController.getString(R.string.UserRestrictionsInviteUsers)).setChecked((this.bannedRights.invite_users || this.defaultBannedRights.invite_users) ? false : true).setLocked(this.defaultBannedRights.invite_users));
                arrayList.add(UItem.asSwitch(3, LocaleController.getString(R.string.UserRestrictionsPinMessages)).setChecked((this.bannedRights.pin_messages || this.defaultBannedRights.pin_messages) ? false : true).setLocked(this.defaultBannedRights.pin_messages));
                arrayList.add(UItem.asSwitch(4, LocaleController.getString(R.string.UserRestrictionsChangeInfo)).setChecked((this.bannedRights.change_info || this.defaultBannedRights.change_info) ? false : true).setLocked(this.defaultBannedRights.change_info));
                if (this.isForum) {
                    arrayList.add(UItem.asSwitch(5, LocaleController.getString(R.string.CreateTopicsPermission)).setChecked((this.bannedRights.manage_topics || this.defaultBannedRights.manage_topics) ? false : true).setLocked(this.defaultBannedRights.manage_topics));
                }
            }
            if (this.canRestrict) {
                arrayList.add(UItem.asShadowCollapseButton(1, LocaleController.getString(getRestrictToggleTextKey())).setCollapsed(!this.restrict).accent());
                z = false;
            } else {
                z = true;
            }
        }
        if (this.banFromCommunityDialogId != 0) {
            if (z) {
                arrayList.add(UItem.asSpace(AndroidUtilities.dp(12.0f)));
            }
            arrayList.add(UItem.asSwitchNoIcon(103, LocaleController.getString(R.string.CommunityBanFromCommunity)).setChecked(this.banFromCommunity));
            TL_communities.ParticipantJoinedChats participantJoinedChats = this.banFromCommunityChats;
            arrayList.add(UItem.asShadow(104, AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("CommunityBanFromCommunityInfo", participantJoinedChats != null ? participantJoinedChats.joined_chat_ids.size() : 1, new Object[0]), new DeleteMessagesBottomSheet$$ExternalSyntheticLambda11(this, 0)), true)));
        }
    }

    private int getRestrictToggleTextKey() {
        if (this.banOrRestrict.isExpandable()) {
            return this.restrict ? R.string.DeleteToggleBanUsers : R.string.DeleteToggleRestrictUsers;
        }
        return this.restrict ? R.string.DeleteToggleBanUser : R.string.DeleteToggleRestrictUser;
    }

    private int getSendMediaSelectedCount() {
        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.bannedRights;
        int i = (tL_chatBannedRights.send_photos || this.defaultBannedRights.send_photos) ? 0 : 1;
        if (!tL_chatBannedRights.send_videos && !this.defaultBannedRights.send_videos) {
            i++;
        }
        if (!tL_chatBannedRights.send_stickers && !this.defaultBannedRights.send_stickers) {
            i++;
        }
        if (!tL_chatBannedRights.send_audios && !this.defaultBannedRights.send_audios) {
            i++;
        }
        if (!tL_chatBannedRights.send_docs && !this.defaultBannedRights.send_docs) {
            i++;
        }
        if (!tL_chatBannedRights.send_voices && !this.defaultBannedRights.send_voices) {
            i++;
        }
        if (!tL_chatBannedRights.send_roundvideos && !this.defaultBannedRights.send_roundvideos) {
            i++;
        }
        if (!tL_chatBannedRights.embed_links) {
            TLRPC.TL_chatBannedRights tL_chatBannedRights2 = this.defaultBannedRights;
            if (!tL_chatBannedRights2.embed_links && !tL_chatBannedRights.send_plain && !tL_chatBannedRights2.send_plain) {
                i++;
            }
        }
        if (!tL_chatBannedRights.send_polls && !this.defaultBannedRights.send_polls) {
            i++;
        }
        return (tL_chatBannedRights.send_reactions || this.defaultBannedRights.send_reactions) ? i : i + 1;
    }

    private boolean hasAnyDefaultRights() {
        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.defaultBannedRights;
        if (tL_chatBannedRights.send_messages && tL_chatBannedRights.send_media && tL_chatBannedRights.send_stickers && tL_chatBannedRights.send_gifs && tL_chatBannedRights.send_games && tL_chatBannedRights.send_inline && tL_chatBannedRights.embed_links && tL_chatBannedRights.send_polls && tL_chatBannedRights.send_reactions && tL_chatBannedRights.change_info && tL_chatBannedRights.invite_users && tL_chatBannedRights.pin_messages) {
            return ((tL_chatBannedRights.manage_topics || !this.isForum) && tL_chatBannedRights.send_photos && tL_chatBannedRights.send_videos && tL_chatBannedRights.send_roundvideos && tL_chatBannedRights.send_audios && tL_chatBannedRights.send_voices && tL_chatBannedRights.send_docs && tL_chatBannedRights.send_plain) ? false : true;
        }
        return true;
    }

    private static boolean isBanned(TLRPC.TL_chatBannedRights tL_chatBannedRights) {
        return tL_chatBannedRights.view_messages;
    }

    public void lambda$fillAction$8(Action action, View view) {
        saveScrollPosition();
        action.collapseOrExpand();
        applyScrolledPosition(true);
    }

    public static void lambda$fillAction$9(ArrayList arrayList, Action action, TLObject tLObject, int i) {
        arrayList.add(UItem.asUserCheckbox((action.type << 24) | i, tLObject).setChecked(action.checks[i]).setPad(1));
    }

    public void lambda$fillItems$10(UniversalAdapter universalAdapter, View view) {
        this.restrictUserCollapsed = !this.restrictUserCollapsed;
        universalAdapter.update(true);
    }

    public void lambda$fillItems$11(int i, UniversalAdapter universalAdapter, View view) {
        if (allDefaultMediaBanned()) {
            new AlertDialog.Builder(getContext(), 0, null).setTitle(LocaleController.getString(R.string.UserRestrictionsCantModify)).setMessage(LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled)).setPositiveButton(LocaleController.getString(R.string.OK), null).create().show();
            return;
        }
        boolean z = i <= 0;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.bannedRights;
        boolean z2 = !z;
        tL_chatBannedRights.send_media = z2;
        tL_chatBannedRights.send_photos = z2;
        tL_chatBannedRights.send_videos = z2;
        tL_chatBannedRights.send_stickers = z2;
        tL_chatBannedRights.send_gifs = z2;
        tL_chatBannedRights.send_inline = z2;
        tL_chatBannedRights.send_games = z2;
        tL_chatBannedRights.send_audios = z2;
        tL_chatBannedRights.send_docs = z2;
        tL_chatBannedRights.send_voices = z2;
        tL_chatBannedRights.send_roundvideos = z2;
        tL_chatBannedRights.embed_links = z2;
        tL_chatBannedRights.send_polls = z2;
        tL_chatBannedRights.send_reactions = z2;
        onRestrictionsChanged();
        universalAdapter.update(true);
    }

    public void lambda$fillItems$12(long j) {
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        if (lastFragment != null) {
            lastFragment.presentFragment(ChatActivity.of(j));
        }
        lambda$showGiftOfferSheet$15();
    }

    public void lambda$fillItems$13() {
        AlertsCreator.showBanGroupCreatorFromCommunityJoinedChatsAlert(getContext(), this.resourcesProvider, this.currentAccount, this.banFromCommunityDialogId, this.banFromCommunityChats.joined_chat_ids, new DeleteMessagesBottomSheet$$ExternalSyntheticLambda4(this, 7));
    }

    public void lambda$getTitle$4(int[] iArr, TLObject tLObject, int i) {
        iArr[0] = iArr[0] + this.participantMessageCounts[i];
    }

    public void lambda$new$0(View view, int i, float f, float f2) {
        UItem item = this.adapter.getItem(i - 1);
        if (item == null) {
            return;
        }
        onClick(item, view, i, f, f2);
    }

    public void lambda$new$1(View view) {
        proceed();
    }

    public void lambda$new$2(TL_communities.ParticipantJoinedChats participantJoinedChats, TLRPC.TL_error tL_error) {
        if (participantJoinedChats != null) {
            this.banFromCommunityChats = participantJoinedChats;
            this.adapter.update(true);
        }
    }

    public static TLRPC.TL_chatBannedRights lambda$new$3(TLRPC.ChannelParticipant channelParticipant) {
        if (channelParticipant == null) {
            return null;
        }
        return channelParticipant.banned_rights;
    }

    public static void lambda$performDelete$14(TLRPC.Bool bool, TLRPC.TL_error tL_error) {
    }

    public boolean lambda$performDelete$15(MessageObject messageObject) {
        TLRPC.Peer peer = messageObject.messageOwner.peer_id;
        return !(peer == null || peer.chat_id == (-this.mergeDialogId)) || this.mergeDialogId == 0;
    }

    public boolean lambda$performDelete$16(MessageObject messageObject) {
        TLRPC.Peer peer = messageObject.messageOwner.peer_id;
        if (peer == null) {
            return false;
        }
        long j = peer.chat_id;
        long j2 = this.mergeDialogId;
        return j == (-j2) && j2 != 0;
    }

    public void lambda$performDelete$17(ArrayList arrayList, ArrayList arrayList2, TLObject tLObject, int i) {
        long dialogId = DialogObject.getDialogId(tLObject);
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            MessagesController.getInstance(this.currentAccount).deleteReactionsFromMessage(-this.inChat.id, dialogId, ((Integer) arrayList.get(i3)).intValue());
        }
        int size2 = arrayList2.size();
        while (i2 < size2) {
            Object obj = arrayList2.get(i2);
            i2++;
            MessagesController.getInstance(this.currentAccount).deleteReactionsFromMessage(this.mergeDialogId, dialogId, ((Integer) obj).intValue());
        }
    }

    public void lambda$performDelete$18(TLObject tLObject, int i) {
        long j;
        TLRPC.Chat chat = this.inChat;
        long j2 = chat.id;
        if (ChatObject.isMonoForum(chat) && ChatObject.canManageMonoForum(this.currentAccount, this.inChat)) {
            long j3 = this.inChat.linked_monoforum_id;
            if (j3 != 0) {
                j = j3;
            } else {
                j = j2;
            }
        } else {
            j = j2;
        }
        if (!this.restrict) {
            if (tLObject instanceof TLRPC.User) {
                MessagesController.getInstance(this.currentAccount).deleteParticipantFromChat(j, (TLRPC.User) tLObject, (TLRPC.Chat) null, false, false);
                return;
            } else {
                if (tLObject instanceof TLRPC.Chat) {
                    MessagesController.getInstance(this.currentAccount).deleteParticipantFromChat(j, (TLRPC.User) null, (TLRPC.Chat) tLObject, false, false);
                    return;
                }
                return;
            }
        }
        TLRPC.TL_chatBannedRights tL_chatBannedRightsBannedRightsOr = bannedRightsOr(this.bannedRights, this.participantsBannedRights.get(i));
        if (tLObject instanceof TLRPC.User) {
            MessagesController.getInstance(this.currentAccount).setParticipantBannedRole(j, (TLRPC.User) tLObject, null, tL_chatBannedRightsBannedRightsOr, false, getBaseFragment());
        } else if (tLObject instanceof TLRPC.Chat) {
            MessagesController.getInstance(this.currentAccount).setParticipantBannedRole(j, null, (TLRPC.Chat) tLObject, tL_chatBannedRightsBannedRightsOr, false, getBaseFragment());
        }
    }

    public boolean lambda$performDelete$19(MessageObject messageObject) {
        TLRPC.Peer peer = messageObject.messageOwner.peer_id;
        return (peer == null || peer.chat_id == (-this.mergeDialogId)) ? false : true;
    }

    public static boolean lambda$performDelete$20(TLObject tLObject, MessageObject messageObject) {
        if (tLObject instanceof TLRPC.User) {
            return messageObject.messageOwner.from_id.user_id == ((TLRPC.User) tLObject).id;
        }
        return (tLObject instanceof TLRPC.Chat) && messageObject.messageOwner.from_id.user_id == ((TLRPC.Chat) tLObject).id;
    }

    public void lambda$performDelete$21(TLObject tLObject, int i) {
        ArrayList<Integer> arrayList = (ArrayList) Collection.EL.stream(this.messages).filter(new DeleteMessagesBottomSheet$$ExternalSyntheticLambda12(this, 0)).filter(new DeleteMessagesBottomSheet$$ExternalSyntheticLambda1(tLObject, 1)).map(new DeleteMessagesBottomSheet$$ExternalSyntheticLambda7(1)).collect(Collectors.toCollection(new ChatActivity$$ExternalSyntheticLambda426()));
        if (this.isReactionOnlyMode && (tLObject instanceof TLRPC.User) && arrayList.size() == 1) {
            TLRPC.TL_messages_reportReaction tL_messages_reportReaction = new TLRPC.TL_messages_reportReaction();
            tL_messages_reportReaction.peer = MessagesController.getInputPeer(this.inChat);
            tL_messages_reportReaction.user_id = MessagesController.getInstance(this.currentAccount).getInputUser((TLRPC.User) tLObject);
            tL_messages_reportReaction.id = arrayList.get(0).intValue();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_reportReaction, null);
            return;
        }
        TLRPC.TL_channels_reportSpam tL_channels_reportSpam = new TLRPC.TL_channels_reportSpam();
        tL_channels_reportSpam.channel = MessagesController.getInputChannel(this.inChat);
        if (tLObject instanceof TLRPC.User) {
            tL_channels_reportSpam.participant = MessagesController.getInputPeer((TLRPC.User) tLObject);
        } else if (tLObject instanceof TLRPC.Chat) {
            tL_channels_reportSpam.participant = MessagesController.getInputPeer((TLRPC.Chat) tLObject);
        }
        tL_channels_reportSpam.id = arrayList;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_reportSpam, null);
    }

    public void lambda$performDelete$22(TLObject tLObject, int i) {
        if (this.restrictUserDeleteAllMessages) {
            if (tLObject instanceof TLRPC.User) {
                MessagesController.getInstance(this.currentAccount).deleteUserChannelHistory(this.inChat, (TLRPC.User) tLObject, null, 0);
            } else if (tLObject instanceof TLRPC.Chat) {
                MessagesController.getInstance(this.currentAccount).deleteUserChannelHistory(this.inChat, null, (TLRPC.Chat) tLObject, 0);
            }
        }
        if (this.restrictUserDeleteAllReactions) {
            if (tLObject instanceof TLRPC.User) {
                MessagesController.getInstance(this.currentAccount).deleteUserChannelAllReactions(this.inChat, (TLRPC.User) tLObject, null);
            } else if (tLObject instanceof TLRPC.Chat) {
                MessagesController.getInstance(this.currentAccount).deleteUserChannelAllReactions(this.inChat, null, (TLRPC.Chat) tLObject);
            }
        }
    }

    public void lambda$performDelete$23(TLObject tLObject, int i) {
        if (tLObject instanceof TLRPC.User) {
            MessagesController.getInstance(this.currentAccount).deleteUserChannelHistory(this.inChat, (TLRPC.User) tLObject, null, 0);
        } else if (tLObject instanceof TLRPC.Chat) {
            MessagesController.getInstance(this.currentAccount).deleteUserChannelHistory(this.inChat, null, (TLRPC.Chat) tLObject, 0);
        }
    }

    public void lambda$performDelete$24(TLObject tLObject, int i) {
        if (tLObject instanceof TLRPC.User) {
            MessagesController.getInstance(this.currentAccount).deleteUserChannelAllReactions(this.inChat, (TLRPC.User) tLObject, null);
        } else if (tLObject instanceof TLRPC.Chat) {
            MessagesController.getInstance(this.currentAccount).deleteUserChannelAllReactions(this.inChat, null, (TLRPC.Chat) tLObject);
        }
    }

    public void lambda$proceed$25(long j) {
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        if (lastFragment != null) {
            lastFragment.presentFragment(ChatActivity.of(j));
        }
        lambda$showGiftOfferSheet$15();
    }

    public void lambda$proceed$26() {
        proceed(false);
    }

    public static boolean lambda$updateParticipantMessageCounts$5(TLRPC.InputPeer inputPeer, MessageObject messageObject) {
        return MessageObject.peersEqual(inputPeer, messageObject.messageOwner.from_id);
    }

    public void lambda$updateParticipantMessageCounts$6(TLObject tLObject, TLRPC.InputPeer inputPeer, int i, int[] iArr) {
        if (tLObject instanceof TLRPC.TL_messages_channelMessages) {
            this.participantMessageCounts[i] = ((TLRPC.TL_messages_channelMessages) tLObject).count - ((int) Collection.EL.stream(this.messages).filter(new DeleteMessagesBottomSheet$$ExternalSyntheticLambda1(inputPeer, 0)).count());
        }
        int i2 = iArr[0] - 1;
        iArr[0] = i2;
        if (i2 == 0) {
            this.participantMessageCountsLoading = false;
            this.participantMessageCountsLoaded = true;
            updateTitleAnimated();
        }
    }

    public void lambda$updateParticipantMessageCounts$7(TLRPC.InputPeer inputPeer, int i, int[] iArr, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new GiftSheet$$ExternalSyntheticLambda15(this, tLObject, inputPeer, i, iArr, 13));
    }

    private void onClick(UItem uItem, View view, int i, float f, float f2) {
        int i2 = uItem.id;
        if (i2 == 103) {
            boolean z = !this.banFromCommunity;
            this.banFromCommunity = z;
            ((TextCheckCell2) view).setChecked(z);
            return;
        }
        int i3 = uItem.viewType;
        if (i3 == 37) {
            int i4 = i2 >>> 24;
            int i5 = 16777215 & i2;
            if (i4 == 0) {
                this.report.toggleCheck(i5);
                return;
            }
            if (i4 == 1) {
                this.deleteAll.toggleCheck(i5);
                onDeleteAllChanged();
                return;
            } else if (i2 == 3) {
                this.deleteAllReactions.toggleCheck(i5);
                onDeleteAllChanged();
                return;
            } else {
                if (i4 == 2) {
                    this.banOrRestrict.toggleCheck(i5);
                    return;
                }
                return;
            }
        }
        if (i3 != 36 && i3 != 35) {
            if (i3 != 39) {
                if (i3 == 40) {
                    this.sendMediaCollapsed = !this.sendMediaCollapsed;
                    saveScrollPosition();
                    this.adapter.update(true);
                    applyScrolledPosition(true);
                    return;
                }
                if (i2 != 100) {
                    if (i3 == 38) {
                        boolean z2 = this.restrict;
                        this.restrict = !z2;
                        this.banOrRestrict.setFilter(!z2 ? this.restrictFilter : this.banFilter);
                        this.adapter.update(true);
                        onRestrictionsChanged();
                        return;
                    }
                    return;
                }
                this.restrictUserCollapsed = false;
                boolean z3 = !this.restrictUserDeleteAllMessages;
                this.restrictUserDeleteAllMessages = z3;
                this.restrictUserDeleteAllReactions = z3;
                saveScrollPosition();
                this.adapter.update(true);
                applyScrolledPosition(true);
                updateTitleAnimated();
                return;
            }
            if (uItem.locked) {
                new AlertDialog.Builder(getContext(), 0, null).setTitle(LocaleController.getString(R.string.UserRestrictionsCantModify)).setMessage(LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled)).setPositiveButton(LocaleController.getString(R.string.OK), null).create().show();
                return;
            }
            if (i2 == 2) {
                TLRPC.TL_chatBannedRights tL_chatBannedRights = this.bannedRights;
                tL_chatBannedRights.invite_users = !tL_chatBannedRights.invite_users;
                onRestrictionsChanged();
            } else if (i2 == 3) {
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = this.bannedRights;
                tL_chatBannedRights2.pin_messages = !tL_chatBannedRights2.pin_messages;
                onRestrictionsChanged();
            } else if (i2 == 4) {
                TLRPC.TL_chatBannedRights tL_chatBannedRights3 = this.bannedRights;
                tL_chatBannedRights3.change_info = !tL_chatBannedRights3.change_info;
                onRestrictionsChanged();
            } else if (i2 == 5) {
                TLRPC.TL_chatBannedRights tL_chatBannedRights4 = this.bannedRights;
                tL_chatBannedRights4.manage_topics = !tL_chatBannedRights4.manage_topics;
                onRestrictionsChanged();
            } else if (i2 == 0) {
                TLRPC.TL_chatBannedRights tL_chatBannedRights5 = this.bannedRights;
                tL_chatBannedRights5.send_plain = !tL_chatBannedRights5.send_plain;
                onRestrictionsChanged();
            }
            this.adapter.update(true);
            return;
        }
        if (i2 == 0) {
            this.report.toggleAllChecks();
            return;
        }
        if (i2 == 1) {
            this.deleteAll.toggleAllChecks();
            onDeleteAllChanged();
            return;
        }
        if (i2 == 3) {
            this.deleteAllReactions.toggleAllChecks();
            onDeleteAllChanged();
            return;
        }
        if (i2 == 2) {
            this.banOrRestrict.toggleAllChecks();
            return;
        }
        if (i3 == 35) {
            if (uItem.locked) {
                new AlertDialog.Builder(getContext(), 0, null).setTitle(LocaleController.getString(R.string.UserRestrictionsCantModify)).setMessage(LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled)).setPositiveButton(LocaleController.getString(R.string.OK), null).create().show();
                return;
            }
            if (i2 == 6) {
                TLRPC.TL_chatBannedRights tL_chatBannedRights6 = this.bannedRights;
                tL_chatBannedRights6.send_photos = !tL_chatBannedRights6.send_photos;
                onRestrictionsChanged();
            } else if (i2 == 7) {
                TLRPC.TL_chatBannedRights tL_chatBannedRights7 = this.bannedRights;
                tL_chatBannedRights7.send_videos = !tL_chatBannedRights7.send_videos;
                onRestrictionsChanged();
            } else if (i2 == 9) {
                TLRPC.TL_chatBannedRights tL_chatBannedRights8 = this.bannedRights;
                tL_chatBannedRights8.send_audios = !tL_chatBannedRights8.send_audios;
                onRestrictionsChanged();
            } else if (i2 == 8) {
                TLRPC.TL_chatBannedRights tL_chatBannedRights9 = this.bannedRights;
                tL_chatBannedRights9.send_docs = !tL_chatBannedRights9.send_docs;
                onRestrictionsChanged();
            } else if (i2 == 11) {
                TLRPC.TL_chatBannedRights tL_chatBannedRights10 = this.bannedRights;
                tL_chatBannedRights10.send_roundvideos = !tL_chatBannedRights10.send_roundvideos;
                onRestrictionsChanged();
            } else if (i2 == 10) {
                TLRPC.TL_chatBannedRights tL_chatBannedRights11 = this.bannedRights;
                tL_chatBannedRights11.send_voices = !tL_chatBannedRights11.send_voices;
                onRestrictionsChanged();
            } else if (i2 == 15) {
                TLRPC.TL_chatBannedRights tL_chatBannedRights12 = this.bannedRights;
                tL_chatBannedRights12.send_reactions = !tL_chatBannedRights12.send_reactions;
                onRestrictionsChanged();
            } else if (i2 == 12) {
                TLRPC.TL_chatBannedRights tL_chatBannedRights13 = this.bannedRights;
                boolean z4 = !tL_chatBannedRights13.send_stickers;
                tL_chatBannedRights13.send_inline = z4;
                tL_chatBannedRights13.send_gifs = z4;
                tL_chatBannedRights13.send_games = z4;
                tL_chatBannedRights13.send_stickers = z4;
                onRestrictionsChanged();
            } else if (i2 == 14) {
                TLRPC.TL_chatBannedRights tL_chatBannedRights14 = this.bannedRights;
                if (tL_chatBannedRights14.send_plain || this.defaultBannedRights.send_plain) {
                    for (int i6 = 0; i6 < this.adapter.getItemCount(); i6++) {
                        UItem item = this.adapter.getItem(i6);
                        if (item.viewType == 39 && item.id == 0) {
                            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = this.recyclerListView.findViewHolderForAdapterPosition(i6 + 1);
                            if (viewHolderFindViewHolderForAdapterPosition == null) {
                                break;
                            }
                            View view2 = viewHolderFindViewHolderForAdapterPosition.itemView;
                            float f3 = -this.shiftDp;
                            this.shiftDp = f3;
                            AndroidUtilities.shakeViewSpring(view2, f3);
                            break;
                        }
                    }
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    return;
                }
                tL_chatBannedRights14.embed_links = !tL_chatBannedRights14.embed_links;
                onRestrictionsChanged();
            } else if (i2 == 13) {
                TLRPC.TL_chatBannedRights tL_chatBannedRights15 = this.bannedRights;
                tL_chatBannedRights15.send_polls = !tL_chatBannedRights15.send_polls;
                onRestrictionsChanged();
            } else if (i2 == 101) {
                this.restrictUserDeleteAllMessages = !this.restrictUserDeleteAllMessages;
                updateTitleAnimated();
            } else if (i2 == 102) {
                this.restrictUserDeleteAllReactions = !this.restrictUserDeleteAllReactions;
                updateTitleAnimated();
            }
            this.adapter.update(true);
        }
    }

    private void onDeleteAllChanged() {
        if (this.participantMessageCountsLoaded) {
            updateTitleAnimated();
        } else {
            updateParticipantMessageCounts();
        }
    }

    private void onRestrictionsChanged() {
        boolean z;
        Action action;
        boolean z2;
        if (this.restrict && this.banOrRestrict.isPresent()) {
            this.banChecked = this.banOrRestrict.selectedCount > 0;
        }
        if (this.restrict && this.banOrRestrict.isPresent()) {
            Action action2 = this.banOrRestrict;
            if (action2.selectedCount == 0) {
                action2.toggleAllChecks();
            } else if (!this.restrict) {
                z = this.banChecked;
                action = this.banOrRestrict;
                if (action.selectedCount > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z != z2) {
                    action.toggleAllChecks();
                }
            }
        } else if (!this.restrict && this.banOrRestrict.isPresent()) {
            z = this.banChecked;
            action = this.banOrRestrict;
            if (action.selectedCount > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z != z2) {
                action.toggleAllChecks();
            }
        }
        if (this.restrict || !this.banOrRestrict.isPresent()) {
            return;
        }
        this.banChecked = this.banOrRestrict.selectedCount > 0;
    }

    private void performDelete() {
        if (this.banFromCommunityDialogId != 0 && this.banFromCommunity) {
            MessagesController.getInstance(this.currentAccount).toggleCommunityParticipantBanned(this.inCommunity.id, this.banFromCommunityDialogId, true, new DeleteMessagesBottomSheet$$ExternalSyntheticLambda15());
        }
        ArrayList<Integer> arrayList = (ArrayList) Collection.EL.stream(this.messages).filter(new DeleteMessagesBottomSheet$$ExternalSyntheticLambda12(this, 1)).map(new DeleteMessagesBottomSheet$$ExternalSyntheticLambda7(1)).collect(Collectors.toCollection(new ChatActivity$$ExternalSyntheticLambda426()));
        ArrayList<Integer> arrayList2 = (ArrayList) Collection.EL.stream(this.messages).filter(new DeleteMessagesBottomSheet$$ExternalSyntheticLambda12(this, 2)).map(new DeleteMessagesBottomSheet$$ExternalSyntheticLambda7(1)).collect(Collectors.toCollection(new ChatActivity$$ExternalSyntheticLambda426()));
        if (!this.isReactionOnlyMode) {
            if (!arrayList.isEmpty()) {
                MessagesController.getInstance(this.currentAccount).deleteMessages(arrayList, null, null, -this.inChat.id, this.topicId, false, this.mode);
            }
            if (!arrayList2.isEmpty()) {
                MessagesController.getInstance(this.currentAccount).deleteMessages(arrayList2, null, null, this.mergeDialogId, this.topicId, true, this.mode);
            }
        } else if (!this.restrictUserDeleteAllReactions) {
            this.deleteAll.forEach(new AlertsCreator$$ExternalSyntheticLambda201(this, arrayList, arrayList2, 12));
        }
        this.banOrRestrict.forEachSelected(new DeleteMessagesBottomSheet$$ExternalSyntheticLambda4(this, 4));
        this.report.forEachSelected(new DeleteMessagesBottomSheet$$ExternalSyntheticLambda4(this, 5));
        if (this.isSingleUsersMode) {
            this.deleteAll.forEach(new DeleteMessagesBottomSheet$$ExternalSyntheticLambda4(this, 1));
        } else {
            this.deleteAll.forEachSelected(new DeleteMessagesBottomSheet$$ExternalSyntheticLambda4(this, 2));
            this.deleteAllReactions.forEachSelected(new DeleteMessagesBottomSheet$$ExternalSyntheticLambda4(this, 3));
        }
    }

    private void proceed() {
        proceed(true);
    }

    private void savePreferences() {
        SharedPreferences.Editor editorEdit = MessagesController.getInstance(this.currentAccount).getMainSettings().edit();
        editorEdit.putBoolean("delete_report", this.report.areAllSelected());
        editorEdit.putBoolean("delete_deleteAll", this.deleteAll.areAllSelected());
        editorEdit.putBoolean("delete_ban", !this.restrict && this.banOrRestrict.areAllSelected());
        editorEdit.apply();
    }

    private void updateParticipantMessageCounts() {
        if (this.participantMessageCountsLoading) {
            return;
        }
        this.participantMessageCountsLoading = true;
        int i = this.deleteAll.totalCount;
        this.participantMessageCounts = new int[i];
        int[] iArr = {i};
        for (int i2 = 0; i2 < this.deleteAll.totalCount; i2++) {
            TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
            tL_messages_search.peer = MessagesController.getInputPeer(this.inChat);
            tL_messages_search.q = "";
            TLRPC.InputPeer inputPeer = MessagesController.getInputPeer(this.deleteAll.options.get(i2));
            tL_messages_search.from_id = inputPeer;
            tL_messages_search.flags |= 1;
            tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
            tL_messages_search.limit = 1;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_search, new AlertsCreator$$ExternalSyntheticLambda55(this, inputPeer, i2, iArr, 1));
        }
    }

    @Override
    public boolean canHighlightChildAt(View view, float f, float f2) {
        return !(view instanceof CollapseTextCell);
    }

    @Override
    public RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        UniversalAdapter universalAdapter = new UniversalAdapter(recyclerListView, getContext(), this.currentAccount, getBaseFragment().getClassGuid(), true, new DeleteMessagesBottomSheet$$ExternalSyntheticLambda0(this, 0), this.resourcesProvider);
        this.adapter = universalAdapter;
        universalAdapter.setApplyBackground(false);
        return this.adapter;
    }

    @Override
    public void lambda$showGiftOfferSheet$15() {
        savePreferences();
        super.lambda$showGiftOfferSheet$15();
    }

    @Override
    public CharSequence getTitle() {
        if (this.isReactionOnlyMode) {
            if (this.restrictUserDeleteAllMessages) {
                return LocaleController.getString(R.string.DeleteMessagesOptionsTitleAll);
            }
            return this.restrictUserDeleteAllReactions ? LocaleController.getString(R.string.DeleteReactionOptionsTitleAll) : LocaleController.formatPluralString("DeleteReactionOptionsTitle", 1, new Object[0]);
        }
        ArrayList<MessageObject> arrayList = this.messages;
        int[] iArr = {arrayList != null ? arrayList.size() : 0};
        if (this.participantMessageCounts != null && this.participantMessageCountsLoaded) {
            this.deleteAll.forEachSelected(new AIEditorAlert$$ExternalSyntheticLambda34(24, this, iArr));
        }
        return LocaleController.formatPluralString("DeleteOptionsTitle", iArr[0], new Object[0]);
    }

    @Override
    public void onContainerLayout(int i, int i2, int i3, int i4) {
        super.onContainerLayout(i, i2, i3, i4);
        Rect rect = AndroidUtilities.rectTmp2;
        rect.set(0, 0, this.recyclerListView.getMeasuredWidth(), this.recyclerListView.getMeasuredHeight() - AndroidUtilities.dp(34.0f));
        this.recyclerListView.setClipBounds(rect);
    }

    @Override
    public void setLastVisible(boolean z) {
    }

    @Override
    public void show() {
        super.show();
        Bulletin.hideVisible();
    }

    private void proceed(boolean z) {
        TL_communities.ParticipantJoinedChats participantJoinedChats;
        if (z && this.banFromCommunity && (participantJoinedChats = this.banFromCommunityChats) != null && !participantJoinedChats.creator_chat_ids.isEmpty()) {
            AlertsCreator.showBanGroupCreatorFromCommunityConfirmAlert(getContext(), this.resourcesProvider, this.currentAccount, this.banFromCommunityDialogId, this.banFromCommunityChats.creator_chat_ids, new DeleteMessagesBottomSheet$$ExternalSyntheticLambda4(this, 6), new DeleteMessagesBottomSheet$$ExternalSyntheticLambda11(this, 1));
            return;
        }
        lambda$showGiftOfferSheet$15();
        Runnable runnable = this.onDelete;
        if (runnable != null) {
            runnable.run();
        }
        String string = "";
        boolean z2 = false;
        if (this.report.selectedCount > 0) {
            string = "" + LocaleController.formatPluralString("UsersReported", this.report.selectedCount, new Object[0]);
        }
        if (this.banOrRestrict.selectedCount > 0) {
            if (!TextUtils.isEmpty(string)) {
                string = zzhp.m(string, "\n");
            }
            if (this.restrict) {
                StringBuilder sbM = DiffUtil.m(string);
                sbM.append(LocaleController.formatPluralString("UsersRestricted", this.banOrRestrict.selectedCount, new Object[0]));
                string = sbM.toString();
            } else {
                StringBuilder sbM2 = DiffUtil.m(string);
                sbM2.append(LocaleController.formatPluralString("UsersBanned", this.banOrRestrict.selectedCount, new Object[0]));
                string = sbM2.toString();
            }
        }
        if (this.isReactionOnlyMode && !this.restrictUserDeleteAllMessages) {
            z2 = true;
        }
        int i = this.banOrRestrict.selectedCount > 0 ? R.raw.ic_admin : R.raw.contact_check;
        if (TextUtils.isEmpty(string)) {
            FactCheckController$$ExternalSyntheticOutline0.m(z2 ? R.string.ReactionsDeleted : R.string.MessagesDeleted, BulletinFactory.of(getBaseFragment()), i);
        } else {
            BulletinFactory.of(getBaseFragment()).createSimpleBulletin(i, LocaleController.getString(z2 ? R.string.ReactionsDeleted : R.string.MessagesDeleted), string).show();
        }
        performDelete();
    }
}
