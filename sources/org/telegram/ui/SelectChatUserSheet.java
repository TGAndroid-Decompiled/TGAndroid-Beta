package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_vision_common.zzko;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AiTonesController$$ExternalSyntheticLambda0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline1;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public final class SelectChatUserSheet extends BottomSheetWithRecyclerListView {
    public UniversalAdapter adapter;
    public final ParticipantsList admins;
    public final ButtonWithCounterView button;
    public TLRPC.Chat chat;
    public Context context;
    public final AnonymousClass3 emptySearchView;
    public final TLRPC.User initialOwner;
    public final ParticipantsList members;
    public final ParticipantsList search;
    public final FrameLayout searchContainer;
    public final AnonymousClass1 searchEdit;
    public TLObject selectedOwner;
    public final ArticleViewer$$ExternalSyntheticLambda74 whenTransferred;

    public final class AnonymousClass1 extends EditTextBoldCursor {
        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0 && !AndroidUtilities.showKeyboard(this)) {
                clearFocus();
                requestFocus();
            }
            return super.onTouchEvent(motionEvent);
        }
    }

    public final class AnonymousClass2 implements TextWatcher {
        public final ProfileActivity$9$$ExternalSyntheticLambda1 updateSearchRunnable = new ProfileActivity$9$$ExternalSyntheticLambda1(this, 15);

        public AnonymousClass2() {
        }

        @Override
        public final void afterTextChanged(Editable editable) {
            int length = editable.length();
            ProfileActivity$9$$ExternalSyntheticLambda1 profileActivity$9$$ExternalSyntheticLambda1 = this.updateSearchRunnable;
            if (length <= 0) {
                AndroidUtilities.cancelRunOnUIThread(profileActivity$9$$ExternalSyntheticLambda1);
                updateSearch();
            } else {
                AndroidUtilities.cancelRunOnUIThread(profileActivity$9$$ExternalSyntheticLambda1);
                AndroidUtilities.runOnUIThread(profileActivity$9$$ExternalSyntheticLambda1, 300L);
            }
        }

        @Override
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void updateSearch() {
            boolean z;
            boolean z2;
            TLRPC.TL_channelParticipantsSearch tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsSearch();
            SelectChatUserSheet selectChatUserSheet = SelectChatUserSheet.this;
            String string = selectChatUserSheet.searchEdit.getText().toString();
            tL_channelParticipantsSearch.q = string;
            ParticipantsList participantsList = selectChatUserSheet.search;
            TLRPC.ChannelParticipantsFilter channelParticipantsFilter = participantsList.filter;
            if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) {
                z = !TextUtils.equals(channelParticipantsFilter.q, string);
                z2 = false;
            } else {
                z = true;
                z2 = true;
            }
            participantsList.filter = tL_channelParticipantsSearch;
            if (z) {
                if (z2) {
                    participantsList.clearOnLoad = false;
                    if (participantsList.requestId >= 0) {
                        ConnectionsManager.getInstance(participantsList.currentAccount).cancelRequest(participantsList.requestId, true);
                        participantsList.requestId = -1;
                    }
                    participantsList.loading = false;
                    participantsList.users.clear();
                    participantsList.endReached = false;
                } else {
                    participantsList.clearOnLoad = true;
                    participantsList.endReached = false;
                }
                participantsList.load$1();
            }
            UniversalAdapter universalAdapter = selectChatUserSheet.adapter;
            if (universalAdapter != null) {
                universalAdapter.update(true);
            }
        }
    }

    public final class AnonymousClass3 extends FrameLayout {
        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(240.0f), 1073741824));
        }
    }

    public final class ParticipantsList implements NotificationCenter.NotificationCenterDelegate {
        public boolean attached;
        public final TLRPC.Chat chat;
        public boolean clearOnLoad;
        public final int currentAccount;
        public boolean endReached;
        public TLRPC.ChannelParticipantsFilter filter;
        public boolean loading;
        public final ArrayList users = new ArrayList();
        public final ArrayList listeners = new ArrayList();
        public int requestId = -1;

        public ParticipantsList(int i, long j, TLRPC.ChannelParticipantsFilter channelParticipantsFilter) {
            this.currentAccount = i;
            this.chat = MessagesController.getInstance(i).getChat(Long.valueOf(j));
            TLRPC.ChatFull chatFull = MessagesController.getInstance(i).getChatFull(j);
            this.filter = channelParticipantsFilter;
            if (chatFull == null) {
                if (!this.attached) {
                    this.attached = true;
                    NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.chatInfoDidLoad);
                }
                MessagesController.getInstance(i).loadFullChat(j, 0, false);
            }
        }

        @Override
        public final void didReceivedNotification(int i, int i2, Object... objArr) {
            if (i == NotificationCenter.chatInfoDidLoad) {
                long j = ((TLRPC.ChatFull) objArr[0]).id;
                TLRPC.Chat chat = this.chat;
                if (j == chat.id && !ChatObject.isChannel(chat) && this.loading) {
                    this.loading = false;
                    load$1();
                }
            }
        }

        public final void load$1() {
            if (this.loading || this.endReached) {
                return;
            }
            TLRPC.ChannelParticipantsFilter channelParticipantsFilter = this.filter;
            if ((channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) && TextUtils.isEmpty(channelParticipantsFilter.q)) {
                return;
            }
            this.loading = true;
            TLRPC.Chat chat = this.chat;
            if (ChatObject.isChannel(chat)) {
                TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                tL_channels_getParticipants.channel = MessagesController.getInputChannel(chat);
                tL_channels_getParticipants.filter = this.filter;
                tL_channels_getParticipants.limit = 30;
                tL_channels_getParticipants.offset = this.clearOnLoad ? 0 : this.users.size();
                ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_channels_getParticipants, new AiTonesController$$ExternalSyntheticLambda0(), new LinkManager$$ExternalSyntheticLambda1(this, 11));
            }
        }
    }

    public SelectChatUserSheet(Activity activity, TLRPC.Chat chat, TLRPC.User user, ArticleViewer$$ExternalSyntheticLambda74 articleViewer$$ExternalSyntheticLambda74, Theme.ResourcesProvider resourcesProvider) {
        super(activity, null, true, false, false, false, false, 2, resourcesProvider);
        this.headerMoveTop = AndroidUtilities.dp(12.0f);
        this.smoothKeyboardAnimationEnabled = true;
        this.chat = chat;
        this.initialOwner = user;
        this.selectedOwner = user;
        this.whenTransferred = articleViewer$$ExternalSyntheticLambda74;
        UserConfig.getInstance(this.currentAccount).getCurrentUser();
        FrameLayout frameLayout = new FrameLayout(activity);
        this.searchContainer = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(activity);
        frameLayout2.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(20.0f), getThemedColor(Theme.key_dialogSearchBackground)));
        ImageView imageView = new ImageView(activity);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        int i = Theme.key_dialogSearchHint;
        imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(i), PorterDuff.Mode.SRC_IN));
        frameLayout2.addView(imageView, LayoutHelper.createFrame(24, 24.0f, 19, 11.0f, 0.0f, 0.0f, 0.0f));
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(activity);
        this.searchEdit = anonymousClass1;
        anonymousClass1.setTextColor(getThemedColor(Theme.key_dialogSearchText));
        anonymousClass1.setHintTextColor(getThemedColor(i));
        anonymousClass1.setTextSize(1, 15.0f);
        anonymousClass1.setSingleLine(true);
        anonymousClass1.setBackground(null);
        anonymousClass1.setCursorWidth(1.5f);
        anonymousClass1.setGravity(112);
        anonymousClass1.setClipToPadding(true);
        anonymousClass1.setPadding(AndroidUtilities.dp(46.0f), 0, AndroidUtilities.dp(16.0f), 0);
        anonymousClass1.setTranslationY(-AndroidUtilities.dp(0.66f));
        anonymousClass1.setInputType(anonymousClass1.getInputType() | 524288);
        anonymousClass1.setImeOptions(33554435);
        anonymousClass1.setTextIsSelectable(false);
        anonymousClass1.setOnEditorActionListener(new ChatActivity$$ExternalSyntheticLambda380(this, 22));
        anonymousClass1.addTextChangedListener(new AnonymousClass2());
        anonymousClass1.setHint(LocaleController.getString(R.string.SearchMembers));
        frameLayout2.addView(anonymousClass1, LayoutHelper.createFrame(-1, -1, 119));
        frameLayout.addView(frameLayout2, LayoutHelper.createFrame(-1, 40.0f, 23, 11.0f, 0.0f, 11.0f, 0.0f));
        ViewGroup viewGroup = this.containerView;
        int iMax = Math.max(0, viewGroup.indexOfChild(this.actionBar));
        float f = this.backgroundPaddingLeft / AndroidUtilities.density;
        viewGroup.addView(frameLayout, iMax, LayoutHelper.createFrame(-1, 64.0f, 55, f, 0.0f, f, 0.0f));
        AnonymousClass3 anonymousClass3 = new AnonymousClass3(activity);
        this.emptySearchView = anonymousClass3;
        BackupImageView backupImageView = new BackupImageView(activity);
        backupImageView.setImageDrawable(new RLottieDrawable(R.raw.utyan_empty, "utyan_empty", AndroidUtilities.dp(130.0f), AndroidUtilities.dp(130.0f), true, null));
        anonymousClass3.addView(backupImageView, LayoutHelper.createFrame(130, 130, 17));
        ParticipantsList participantsList = new ParticipantsList(this.currentAccount, chat.id, new TLRPC.TL_channelParticipantsAdmins());
        participantsList.listeners.add(new ProfileActivity$9$$ExternalSyntheticLambda1(this, 14));
        this.admins = participantsList;
        ParticipantsList participantsList2 = new ParticipantsList(this.currentAccount, chat.id, new TLRPC.TL_channelParticipantsRecent());
        participantsList2.listeners.add(new ProfileActivity$9$$ExternalSyntheticLambda1(this, 14));
        this.members = participantsList2;
        ParticipantsList participantsList3 = new ParticipantsList(this.currentAccount, chat.id, new TLRPC.TL_channelParticipantsSearch());
        participantsList3.listeners.add(new ProfileActivity$9$$ExternalSyntheticLambda1(this, 14));
        this.search = participantsList3;
        RecyclerListView recyclerListView = this.recyclerListView;
        int i2 = this.backgroundPaddingLeft;
        recyclerListView.setPadding(i2, 0, i2, AndroidUtilities.dp(68.0f));
        this.recyclerListView.setClipToPadding(false);
        this.recyclerListView.setOnItemClickListener(new TopicsFragment$$ExternalSyntheticLambda9(this, 5));
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator() {
            @Override
            public final void onMoveAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                SelectChatUserSheet.access$300(SelectChatUserSheet.this);
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
        this.recyclerListView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
            @Override
            public final void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                SelectChatUserSheet.access$300(SelectChatUserSheet.this);
            }
        });
        this.recyclerListView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public final void onScrolled(RecyclerView recyclerView, int i3, int i4) {
                SelectChatUserSheet selectChatUserSheet = SelectChatUserSheet.this;
                if (selectChatUserSheet.recyclerListView.scrollingByUser) {
                    AndroidUtilities.hideKeyboard(selectChatUserSheet.searchEdit);
                }
                SelectChatUserSheet.access$300(selectChatUserSheet);
            }
        });
        this.containerView.addView(new View(this, getContext()) {
            public final LinearGradient gradient;
            public final Paint paint = new Paint(1);

            {
                float fDp = AndroidUtilities.dp(68.0f);
                int i3 = Theme.key_dialogBackground;
                this.gradient = new LinearGradient(0.0f, 0.0f, 0.0f, fDp, new int[]{Theme.multAlpha(0.0f, this.getThemedColor(i3)), this.getThemedColor(i3)}, new float[]{0.0f, 0.2f}, Shader.TileMode.CLAMP);
            }

            @Override
            public final void onDraw(Canvas canvas) {
                Paint paint = this.paint;
                paint.setShader(this.gradient);
                canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
            }
        }, LayoutHelper.createFrame(-1, 68, 87));
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(getContext(), resourcesProvider, true);
        buttonWithCounterView.setRoundRadius(24);
        this.button = buttonWithCounterView;
        buttonWithCounterView.setColor(getThemedColor(Theme.key_fill_RedNormal));
        updateButton$2(false);
        ViewGroup viewGroup2 = this.containerView;
        float f2 = (this.backgroundPaddingLeft / AndroidUtilities.density) + 10.0f;
        viewGroup2.addView(buttonWithCounterView, LayoutHelper.createFrame(-1, 48.0f, 87, f2, 10.0f, f2, 10.0f));
        buttonWithCounterView.setOnClickListener(new TodoItemMenu$$ExternalSyntheticLambda13(this, 4));
        UniversalAdapter universalAdapter = this.adapter;
        if (universalAdapter != null) {
            universalAdapter.update(false);
        }
        participantsList.load$1();
        participantsList2.load$1();
    }

    public static void access$300(SelectChatUserSheet selectChatUserSheet) {
        selectChatUserSheet.getClass();
        float y = -AndroidUtilities.dp(64.0f);
        int i = 0;
        while (true) {
            RecyclerListView recyclerListView = selectChatUserSheet.recyclerListView;
            if (i >= recyclerListView.getChildCount()) {
                break;
            }
            View childAt = recyclerListView.getChildAt(i);
            if (childAt.getId() == 3) {
                y = childAt.getY();
                break;
            }
            i++;
        }
        selectChatUserSheet.searchContainer.setTranslationY(y);
    }

    @Override
    public final RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        UniversalAdapter universalAdapter = new UniversalAdapter(recyclerListView, getContext(), this.currentAccount, 0, false, new LinkManager$$ExternalSyntheticLambda1(this, 10), this.resourcesProvider);
        this.adapter = universalAdapter;
        return universalAdapter;
    }

    @Override
    public final void lambda$showGiftOfferSheet$15() {
        super.lambda$showGiftOfferSheet$15();
        ParticipantsList participantsList = this.admins;
        if (!participantsList.attached) {
            participantsList.attached = false;
            int i = participantsList.currentAccount;
            NotificationCenter.getInstance(i).removeObserver(participantsList, NotificationCenter.chatInfoDidLoad);
            if (participantsList.requestId >= 0) {
                ConnectionsManager.getInstance(i).cancelRequest(participantsList.requestId, true);
                participantsList.requestId = -1;
            }
            participantsList.loading = false;
        }
        ParticipantsList participantsList2 = this.members;
        if (!participantsList2.attached) {
            participantsList2.attached = false;
            int i2 = participantsList2.currentAccount;
            NotificationCenter.getInstance(i2).removeObserver(participantsList2, NotificationCenter.chatInfoDidLoad);
            if (participantsList2.requestId >= 0) {
                ConnectionsManager.getInstance(i2).cancelRequest(participantsList2.requestId, true);
                participantsList2.requestId = -1;
            }
            participantsList2.loading = false;
        }
        ParticipantsList participantsList3 = this.search;
        if (participantsList3.attached) {
            return;
        }
        participantsList3.attached = false;
        int i3 = participantsList3.currentAccount;
        NotificationCenter.getInstance(i3).removeObserver(participantsList3, NotificationCenter.chatInfoDidLoad);
        if (participantsList3.requestId >= 0) {
            ConnectionsManager.getInstance(i3).cancelRequest(participantsList3.requestId, true);
            participantsList3.requestId = -1;
        }
        participantsList3.loading = false;
    }

    public final void fillItems$36(ArrayList arrayList) {
        ParticipantsList participantsList;
        boolean z;
        boolean z2;
        ParticipantsList participantsList2 = this.admins;
        if (participantsList2 == null || (participantsList = this.members) == null) {
            return;
        }
        HashSet hashSet = new HashSet();
        hashSet.add(Long.valueOf(UserConfig.getInstance(this.currentAccount).getClientUserId()));
        arrayList.add(UItem.asSpace(3, AndroidUtilities.dp(64.0f)));
        ParticipantsList participantsList3 = this.search;
        if (participantsList3 != null && !TextUtils.isEmpty(participantsList3.filter.q)) {
            ArrayList arrayList2 = participantsList3.users;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                TLObject tLObject = (TLObject) obj;
                if (!hashSet.contains(Long.valueOf(DialogObject.getDialogId(tLObject)))) {
                    hashSet.add(Long.valueOf(DialogObject.getDialogId(tLObject)));
                    UItem uItem = new UItem(32);
                    uItem.object = tLObject;
                    uItem.setChecked(DialogObject.getDialogId(tLObject) == DialogObject.getDialogId(this.selectedOwner));
                    arrayList.add(uItem);
                }
            }
            if (participantsList3.loading) {
                UItem uItem2 = new UItem(34);
                uItem2.intValue = 29;
                UItem uItemM = ArticleViewer.IBlock.CC.m(arrayList, uItem2, 34);
                uItemM.intValue = 29;
                UItem uItemM2 = ArticleViewer.IBlock.CC.m(arrayList, uItemM, 34);
                uItemM2.intValue = 29;
                arrayList.add(uItemM2);
            }
            if (arrayList.size() == 1) {
                arrayList.add(UItem.asCustom(this.emptySearchView));
                return;
            }
            return;
        }
        ArrayList arrayList3 = participantsList2.users;
        TLRPC.User user = this.initialOwner;
        if (user == null) {
            z = true;
            break;
        }
        int size2 = arrayList3.size();
        int i2 = 0;
        while (true) {
            if (i2 < size2) {
                Object obj2 = arrayList3.get(i2);
                i2++;
                if (DialogObject.getDialogId((TLObject) obj2) == DialogObject.getDialogId(user)) {
                    if (!hashSet.contains(Long.valueOf(DialogObject.getDialogId(user)))) {
                        String string = LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(this.chat) ? R.string.ChannelAdmins : R.string.GroupAdmins);
                        UItem uItem3 = new UItem(31);
                        uItem3.text = string;
                        arrayList.add(uItem3);
                        hashSet.add(Long.valueOf(DialogObject.getDialogId(user)));
                        UItem uItem4 = new UItem(32);
                        uItem4.object = user;
                        uItem4.setChecked(DialogObject.getDialogId(user) == DialogObject.getDialogId(this.selectedOwner));
                        arrayList.add(uItem4);
                        z = false;
                        break;
                    }
                }
            }
            z = true;
            break;
        }
        int size3 = arrayList3.size();
        int i3 = 0;
        while (i3 < size3) {
            Object obj3 = arrayList3.get(i3);
            i3++;
            TLObject tLObject2 = (TLObject) obj3;
            if (!hashSet.contains(Long.valueOf(DialogObject.getDialogId(tLObject2)))) {
                if (z) {
                    String string2 = LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(this.chat) ? R.string.ChannelAdmins : R.string.GroupAdmins);
                    UItem uItem5 = new UItem(31);
                    uItem5.text = string2;
                    arrayList.add(uItem5);
                    z = false;
                }
                hashSet.add(Long.valueOf(DialogObject.getDialogId(tLObject2)));
                UItem uItem6 = new UItem(32);
                uItem6.object = tLObject2;
                uItem6.setChecked(DialogObject.getDialogId(tLObject2) == DialogObject.getDialogId(this.selectedOwner));
                arrayList.add(uItem6);
            }
        }
        if (participantsList2.loading) {
            UItem uItem7 = new UItem(34);
            uItem7.intValue = 29;
            UItem uItemM3 = ArticleViewer.IBlock.CC.m(arrayList, uItem7, 34);
            uItemM3.intValue = 29;
            UItem uItemM4 = ArticleViewer.IBlock.CC.m(arrayList, uItemM3, 34);
            uItemM4.intValue = 29;
            arrayList.add(uItemM4);
        }
        if (user == null || hashSet.contains(Long.valueOf(DialogObject.getDialogId(user)))) {
            z2 = true;
        } else {
            String string3 = LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(this.chat) ? R.string.ChannelSubscribers2 : R.string.GroupMembers2);
            UItem uItem8 = new UItem(31);
            uItem8.text = string3;
            arrayList.add(uItem8);
            hashSet.add(Long.valueOf(DialogObject.getDialogId(user)));
            UItem uItem9 = new UItem(32);
            uItem9.object = user;
            uItem9.setChecked(DialogObject.getDialogId(user) == DialogObject.getDialogId(this.selectedOwner));
            arrayList.add(uItem9);
            z2 = false;
        }
        ArrayList arrayList4 = participantsList.users;
        int size4 = arrayList4.size();
        int i4 = 0;
        while (i4 < size4) {
            Object obj4 = arrayList4.get(i4);
            i4++;
            TLObject tLObject3 = (TLObject) obj4;
            if (!hashSet.contains(Long.valueOf(DialogObject.getDialogId(tLObject3)))) {
                if (z2) {
                    String string4 = LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(this.chat) ? R.string.ChannelSubscribers2 : R.string.GroupMembers2);
                    UItem uItem10 = new UItem(31);
                    uItem10.text = string4;
                    arrayList.add(uItem10);
                    z2 = false;
                }
                hashSet.add(Long.valueOf(DialogObject.getDialogId(tLObject3)));
                UItem uItem11 = new UItem(32);
                uItem11.object = tLObject3;
                uItem11.setChecked(DialogObject.getDialogId(tLObject3) == DialogObject.getDialogId(this.selectedOwner));
                arrayList.add(uItem11);
            }
        }
        if (arrayList4.isEmpty() || !participantsList.loading) {
            return;
        }
        UItem uItem12 = new UItem(34);
        uItem12.intValue = 29;
        UItem uItemM5 = ArticleViewer.IBlock.CC.m(arrayList, uItem12, 34);
        uItemM5.intValue = 29;
        UItem uItemM6 = ArticleViewer.IBlock.CC.m(arrayList, uItemM5, 34);
        uItemM6.intValue = 29;
        arrayList.add(uItemM6);
    }

    @Override
    public final CharSequence getTitle() {
        return LocaleController.getString(R.string.AppointNewOwner);
    }

    public final void initTransfer(TLRPC.User user, TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        if (getContext() != null) {
            this.context = getContext();
        }
        if (this.context == null) {
            return;
        }
        if (tL_inputCheckPasswordSRP != null && !ChatObject.isChannel(this.chat)) {
            BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
            if (safeLastFragment == null) {
                return;
            }
            MessagesController.getInstance(this.currentAccount).convertToMegaGroup(this.context, this.chat.id, safeLastFragment, new ArticleViewer$$ExternalSyntheticLambda54(this, user, tL_inputCheckPasswordSRP, twoStepVerificationActivity, 16));
            return;
        }
        TLRPC.TL_channels_editCreator tL_channels_editCreator = new TLRPC.TL_channels_editCreator();
        if (ChatObject.isChannel(this.chat)) {
            TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
            tL_channels_editCreator.channel = tL_inputChannel;
            TLRPC.Chat chat = this.chat;
            tL_inputChannel.channel_id = chat.id;
            tL_inputChannel.access_hash = chat.access_hash;
        } else {
            tL_channels_editCreator.channel = new TLRPC.TL_inputChannelEmpty();
        }
        tL_channels_editCreator.password = tL_inputCheckPasswordSRP != null ? tL_inputCheckPasswordSRP : new TLRPC.TL_inputCheckPasswordEmpty();
        tL_channels_editCreator.user_id = MessagesController.getInstance(this.currentAccount).getInputUser(user);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_editCreator, new ChatActivity$$ExternalSyntheticLambda206(this, tL_inputCheckPasswordSRP, user, twoStepVerificationActivity, tL_channels_editCreator, 12));
    }

    public final void lambda$initTransfer$12(TLRPC.TL_error tL_error, TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP, TLRPC.User user, TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_channels_editCreator tL_channels_editCreator) {
        final int i = 0;
        if (tL_error == null) {
            if (tL_inputCheckPasswordSRP != null) {
                ArticleViewer$$ExternalSyntheticLambda74 articleViewer$$ExternalSyntheticLambda74 = this.whenTransferred;
                if (articleViewer$$ExternalSyntheticLambda74 != null) {
                    articleViewer$$ExternalSyntheticLambda74.run();
                }
                lambda$showGiftOfferSheet$15();
                twoStepVerificationActivity.needHideProgress();
                twoStepVerificationActivity.finishFragment();
                return;
            }
            return;
        }
        if (this.context == null) {
            return;
        }
        if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
            if (tL_inputCheckPasswordSRP == null) {
                AlertDialog.Builder builder = new AlertDialog.Builder(this.context, 0, null);
                String string = LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(this.chat) ? R.string.EditAdminChannelTransfer : R.string.EditAdminGroupTransfer);
                AlertDialog alertDialog = builder.alertDialog;
                alertDialog.title = string;
                alertDialog.message = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.EditAdminTransferReadyAlertText2, this.chat.title, UserObject.getFirstName(user)));
                builder.setPositiveButton(LocaleController.getString(R.string.EditAdminTransferChangeOwner), new SelectAnimatedEmojiDialog$SelectStatusDurationDialog$$ExternalSyntheticLambda10(17, this, user));
                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new AlertDialog.OnButtonClickListener(this) {
                    public final SelectChatUserSheet f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(AlertDialog alertDialog2, int i2) {
                        switch (i) {
                            case 0:
                                this.f$0.button.setLoading(false);
                                break;
                            case 1:
                                SelectChatUserSheet selectChatUserSheet = this.f$0;
                                selectChatUserSheet.getClass();
                                BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                                if (safeLastFragment != null) {
                                    selectChatUserSheet.lambda$showGiftOfferSheet$15();
                                    safeLastFragment.presentFragment(new TwoStepVerificationSetupActivity(6, null));
                                    break;
                                }
                                break;
                            case 2:
                                this.f$0.button.setLoading(false);
                                break;
                            default:
                                this.f$0.button.setLoading(false);
                                break;
                        }
                    }
                });
                builder.show();
                return;
            }
            return;
        }
        if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
            if ("SRP_ID_INVALID".equals(tL_error.text)) {
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new LinkManager$$ExternalSyntheticLambda0(this, twoStepVerificationActivity, user, 26), 8);
                return;
            }
            if (!tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                if (twoStepVerificationActivity != null) {
                    twoStepVerificationActivity.needHideProgress();
                    twoStepVerificationActivity.finishFragment();
                }
                BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                if (safeLastFragment == null) {
                    return;
                }
                AlertsCreator.showAddUserAlert(tL_error, safeLastFragment, ChatObject.isChannelAndNotMegaGroup(this.chat), ChatObject.isCommunity(this.chat), tL_channels_editCreator);
                return;
            }
            if (this.context != null && !AccountInstance.getInstance(this.currentAccount).getUserConfig().isPremium()) {
                BaseFragment safeLastFragment2 = LaunchActivity.getSafeLastFragment();
                if (safeLastFragment2 == null) {
                    return;
                }
                showDialog(new LimitReachedBottomSheet(5, this.currentAccount, this.context, safeLastFragment2, null));
                return;
            }
            BaseFragment safeLastFragment3 = LaunchActivity.getSafeLastFragment();
            if (safeLastFragment3 == null) {
                return;
            }
            lambda$showGiftOfferSheet$15();
            safeLastFragment3.presentFragment(new TooManyCommunitiesActivity(1));
            return;
        }
        if (twoStepVerificationActivity != null) {
            twoStepVerificationActivity.needHideProgress();
        }
        AlertDialog.Builder builder2 = new AlertDialog.Builder(this.context, 0, null);
        builder2.alertDialog.title = LocaleController.getString(R.string.EditAdminTransferAlertTitle);
        LinearLayout linearLayout = new LinearLayout(this.context);
        linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
        linearLayout.setOrientation(1);
        builder2.setView(linearLayout);
        TextView textView = new TextView(this.context);
        int i2 = Theme.key_dialogTextBlack;
        textView.setTextColor(Theme.getColor(null, i2, false));
        textView.setTextSize(1, 16.0f);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        if (ChatObject.isChannelAndNotMegaGroup(this.chat)) {
            zzko.m(R.string.EditChannelAdminTransferAlertText, new Object[]{UserObject.getFirstName(user)}, textView);
        } else {
            zzko.m(R.string.EditAdminTransferAlertText, new Object[]{UserObject.getFirstName(user)}, textView);
        }
        linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2));
        LinearLayout linearLayout2 = new LinearLayout(this.context);
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, LayoutHelper.createLinear(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView = new ImageView(this.context);
        int i3 = R.drawable.list_circle;
        imageView.setImageResource(i3);
        imageView.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
        int color = Theme.getColor(null, i2, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(color, mode));
        TextView textView2 = new TextView(this.context);
        textView2.setTextColor(Theme.getColor(null, i2, false));
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline1.m(R.string.EditAdminTransferAlertText1, textView2);
        if (LocaleController.isRTL) {
            linearLayout2.addView(textView2, LayoutHelper.createLinear(-1, -2));
            linearLayout2.addView(imageView, LayoutHelper.createLinear(-2, -2, 5));
        } else {
            linearLayout2.addView(imageView, LayoutHelper.createLinear(-2, -2));
            linearLayout2.addView(textView2, LayoutHelper.createLinear(-1, -2));
        }
        LinearLayout linearLayout3 = new LinearLayout(this.context);
        linearLayout3.setOrientation(0);
        linearLayout.addView(linearLayout3, LayoutHelper.createLinear(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView2 = new ImageView(this.context);
        imageView2.setImageResource(i3);
        imageView2.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
        imageView2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, i2, false), mode));
        TextView textView3 = new TextView(this.context);
        textView3.setTextColor(Theme.getColor(null, i2, false));
        textView3.setTextSize(1, 16.0f);
        textView3.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline1.m(R.string.EditAdminTransferAlertText2, textView3);
        if (LocaleController.isRTL) {
            linearLayout3.addView(textView3, LayoutHelper.createLinear(-1, -2));
            linearLayout3.addView(imageView2, LayoutHelper.createLinear(-2, -2, 5));
        } else {
            linearLayout3.addView(imageView2, LayoutHelper.createLinear(-2, -2));
            linearLayout3.addView(textView3, LayoutHelper.createLinear(-1, -2));
        }
        if ("PASSWORD_MISSING".equals(tL_error.text)) {
            final int i4 = 1;
            builder2.setPositiveButton(LocaleController.getString(R.string.EditAdminTransferSetPassword), new AlertDialog.OnButtonClickListener(this) {
                public final SelectChatUserSheet f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(AlertDialog alertDialog2, int i5) {
                    switch (i4) {
                        case 0:
                            this.f$0.button.setLoading(false);
                            break;
                        case 1:
                            SelectChatUserSheet selectChatUserSheet = this.f$0;
                            selectChatUserSheet.getClass();
                            BaseFragment safeLastFragment4 = LaunchActivity.getSafeLastFragment();
                            if (safeLastFragment4 != null) {
                                selectChatUserSheet.lambda$showGiftOfferSheet$15();
                                safeLastFragment4.presentFragment(new TwoStepVerificationSetupActivity(6, null));
                                break;
                            }
                            break;
                        case 2:
                            this.f$0.button.setLoading(false);
                            break;
                        default:
                            this.f$0.button.setLoading(false);
                            break;
                    }
                }
            });
            final int i5 = 2;
            builder2.setNegativeButton(LocaleController.getString(R.string.Cancel), new AlertDialog.OnButtonClickListener(this) {
                public final SelectChatUserSheet f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(AlertDialog alertDialog2, int i6) {
                    switch (i5) {
                        case 0:
                            this.f$0.button.setLoading(false);
                            break;
                        case 1:
                            SelectChatUserSheet selectChatUserSheet = this.f$0;
                            selectChatUserSheet.getClass();
                            BaseFragment safeLastFragment4 = LaunchActivity.getSafeLastFragment();
                            if (safeLastFragment4 != null) {
                                selectChatUserSheet.lambda$showGiftOfferSheet$15();
                                safeLastFragment4.presentFragment(new TwoStepVerificationSetupActivity(6, null));
                                break;
                            }
                            break;
                        case 2:
                            this.f$0.button.setLoading(false);
                            break;
                        default:
                            this.f$0.button.setLoading(false);
                            break;
                    }
                }
            });
        } else {
            TextView textView4 = new TextView(this.context);
            textView4.setTextColor(Theme.getColor(null, i2, false));
            textView4.setTextSize(1, 16.0f);
            textView4.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            textView4.setText(LocaleController.getString(R.string.EditAdminTransferAlertText3));
            linearLayout.addView(textView4, LayoutHelper.createLinear(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            final int i6 = 3;
            builder2.setNegativeButton(LocaleController.getString(R.string.OK), new AlertDialog.OnButtonClickListener(this) {
                public final SelectChatUserSheet f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(AlertDialog alertDialog2, int i7) {
                    switch (i6) {
                        case 0:
                            this.f$0.button.setLoading(false);
                            break;
                        case 1:
                            SelectChatUserSheet selectChatUserSheet = this.f$0;
                            selectChatUserSheet.getClass();
                            BaseFragment safeLastFragment4 = LaunchActivity.getSafeLastFragment();
                            if (safeLastFragment4 != null) {
                                selectChatUserSheet.lambda$showGiftOfferSheet$15();
                                safeLastFragment4.presentFragment(new TwoStepVerificationSetupActivity(6, null));
                                break;
                            }
                            break;
                        case 2:
                            this.f$0.button.setLoading(false);
                            break;
                        default:
                            this.f$0.button.setLoading(false);
                            break;
                    }
                }
            });
        }
        builder2.show();
    }

    public final void lambda$initTransfer$3(TLRPC.User user, TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, long j) {
        if (j != 0) {
            this.chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j));
            initTransfer(user, twoStepVerificationActivity, tL_inputCheckPasswordSRP);
        }
    }

    public final void updateButton$2(boolean z) {
        int i = ChatObject.isChannelAndNotMegaGroup(this.chat) ? R.string.LeaveChannelAndAppoint : R.string.LeaveGroupAndAppoint;
        float fDp = AndroidUtilities.dp(32.0f);
        ButtonWithCounterView buttonWithCounterView = this.button;
        buttonWithCounterView.setText(LocaleController.formatString(i, TextUtils.ellipsize(DialogObject.getShortTitle(this.selectedOwner), buttonWithCounterView.getTextPaint(), Math.max(fDp, ((buttonWithCounterView.getWidth() > 0 ? buttonWithCounterView.getWidth() : AndroidUtilities.displaySize.x - AndroidUtilities.dp(20.0f)) - AndroidUtilities.dp(16.0f)) - buttonWithCounterView.getTextPaint().measureText(LocaleController.getString(i))), TextUtils.TruncateAt.MIDDLE)), z, true);
    }
}
