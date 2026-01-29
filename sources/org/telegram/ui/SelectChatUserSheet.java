package org.telegram.ui;

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
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotForumHelper$$ExternalSyntheticLambda2;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ProfileSearchCell;
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
import org.telegram.ui.TwoStepVerificationActivity;

public class SelectChatUserSheet extends BottomSheetWithRecyclerListView {
    private UniversalAdapter adapter;
    private ParticipantsList admins;
    private View bottomGradient;
    private ButtonWithCounterView button;
    private TLRPC.Chat chat;
    private Context context;
    private FrameLayout emptySearchView;
    private final TLObject initialOwner;
    private ParticipantsList members;
    private ParticipantsList search;
    private FrameLayout searchBox;
    private FrameLayout searchContainer;
    private EditTextBoldCursor searchEdit;
    private TLObject selectedOwner;
    private final Runnable whenTransferred;

    @Override
    protected CharSequence getTitle() {
        return LocaleController.getString(R.string.AppointNewOwner);
    }

    public SelectChatUserSheet(Context context, TLRPC.Chat chat, TLRPC.User user, Runnable runnable, Theme.ResourcesProvider resourcesProvider) {
        super(context, null, true, false, false, BottomSheetWithRecyclerListView.ActionBarType.SLIDING, resourcesProvider);
        this.headerMoveTop = AndroidUtilities.dp(12.0f);
        this.smoothKeyboardAnimationEnabled = true;
        this.chat = chat;
        this.initialOwner = user;
        this.selectedOwner = user;
        this.whenTransferred = runnable;
        UserConfig.getInstance(this.currentAccount).getCurrentUser();
        this.searchContainer = new FrameLayout(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.searchBox = frameLayout;
        frameLayout.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(20.0f), getThemedColor(Theme.key_dialogSearchBackground)));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        int i = Theme.key_dialogSearchHint;
        imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(i), PorterDuff.Mode.SRC_IN));
        this.searchBox.addView(imageView, LayoutHelper.createFrame(24, 24.0f, 19, 11.0f, 0.0f, 0.0f, 0.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context) {
            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0 && !AndroidUtilities.showKeyboard(this)) {
                    clearFocus();
                    requestFocus();
                }
                return super.onTouchEvent(motionEvent);
            }
        };
        this.searchEdit = editTextBoldCursor;
        editTextBoldCursor.setTextColor(getThemedColor(Theme.key_dialogSearchText));
        this.searchEdit.setHintTextColor(getThemedColor(i));
        this.searchEdit.setTextSize(1, 15.0f);
        this.searchEdit.setSingleLine(true);
        this.searchEdit.setBackground(null);
        this.searchEdit.setCursorWidth(1.5f);
        this.searchEdit.setGravity(112);
        this.searchEdit.setClipToPadding(true);
        this.searchEdit.setPadding(AndroidUtilities.dp(46.0f), 0, AndroidUtilities.dp(16.0f), 0);
        this.searchEdit.setTranslationY(-AndroidUtilities.dp(0.66f));
        EditTextBoldCursor editTextBoldCursor2 = this.searchEdit;
        editTextBoldCursor2.setInputType(editTextBoldCursor2.getInputType() | 524288);
        this.searchEdit.setImeOptions(33554435);
        this.searchEdit.setTextIsSelectable(false);
        this.searchEdit.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                return this.f$0.lambda$new$0(textView, i2, keyEvent);
            }
        });
        this.searchEdit.addTextChangedListener(new AnonymousClass2());
        this.searchEdit.setHint(LocaleController.getString(R.string.SearchMembers));
        this.searchBox.addView(this.searchEdit, LayoutHelper.createFrame(-1, -1, 119));
        this.searchContainer.addView(this.searchBox, LayoutHelper.createFrame(-1, 40.0f, 23, 11.0f, 0.0f, 11.0f, 0.0f));
        ViewGroup viewGroup = this.containerView;
        FrameLayout frameLayout2 = this.searchContainer;
        int iMax = Math.max(0, viewGroup.indexOfChild(this.actionBar));
        float f = this.backgroundPaddingLeft / AndroidUtilities.density;
        viewGroup.addView(frameLayout2, iMax, LayoutHelper.createFrame(-1, 64.0f, 55, f, 0.0f, f, 0.0f));
        this.emptySearchView = new FrameLayout(context) {
            @Override
            protected void onMeasure(int i2, int i3) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(240.0f), 1073741824));
            }
        };
        BackupImageView backupImageView = new BackupImageView(context);
        backupImageView.setImageDrawable(new RLottieDrawable(R.raw.utyan_empty, "utyan_empty", AndroidUtilities.dp(130.0f), AndroidUtilities.dp(130.0f)));
        this.emptySearchView.addView(backupImageView, LayoutHelper.createFrame(130, 130, 17));
        this.admins = new ParticipantsList(this.currentAccount, chat.id, new TLRPC.TL_channelParticipantsAdmins()).listen(new Runnable() {
            @Override
            public final void run() {
                this.f$0.update();
            }
        });
        this.members = new ParticipantsList(this.currentAccount, chat.id, new TLRPC.TL_channelParticipantsRecent()).listen(new Runnable() {
            @Override
            public final void run() {
                this.f$0.update();
            }
        });
        this.search = new ParticipantsList(this.currentAccount, chat.id, new TLRPC.TL_channelParticipantsSearch()).listen(new Runnable() {
            @Override
            public final void run() {
                this.f$0.update();
            }
        });
        RecyclerListView recyclerListView = this.recyclerListView;
        int i2 = this.backgroundPaddingLeft;
        recyclerListView.setPadding(i2, 0, i2, AndroidUtilities.dp(68.0f));
        this.recyclerListView.setClipToPadding(false);
        this.recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i3) {
                this.f$0.lambda$new$1(view, i3);
            }
        });
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator() {
            @Override
            protected void onMoveAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                super.onMoveAnimationUpdate(viewHolder);
                SelectChatUserSheet.this.updateSearchY();
            }
        };
        defaultItemAnimator.setSupportsChangeAnimations(false);
        defaultItemAnimator.setDelayAnimations(false);
        defaultItemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        defaultItemAnimator.setDurations(350L);
        this.recyclerListView.setItemAnimator(defaultItemAnimator);
        this.recyclerListView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
            @Override
            public void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                SelectChatUserSheet.this.updateSearchY();
            }
        });
        this.recyclerListView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int i3, int i4) {
                if (((BottomSheetWithRecyclerListView) SelectChatUserSheet.this).recyclerListView.scrollingByUser) {
                    AndroidUtilities.hideKeyboard(SelectChatUserSheet.this.searchEdit);
                }
                SelectChatUserSheet.this.updateSearchY();
            }
        });
        View view = new View(getContext()) {
            private final LinearGradient gradient;
            private final Paint paint = new Paint(1);

            {
                float fDp = AndroidUtilities.dp(68.0f);
                int i3 = Theme.key_dialogBackground;
                this.gradient = new LinearGradient(0.0f, 0.0f, 0.0f, fDp, new int[]{Theme.multAlpha(SelectChatUserSheet.this.getThemedColor(i3), 0.0f), SelectChatUserSheet.this.getThemedColor(i3)}, new float[]{0.0f, 0.2f}, Shader.TileMode.CLAMP);
            }

            @Override
            protected void onDraw(Canvas canvas) {
                this.paint.setShader(this.gradient);
                canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.paint);
            }
        };
        this.bottomGradient = view;
        this.containerView.addView(view, LayoutHelper.createFrame(-1, 68, 87));
        ButtonWithCounterView round = new ButtonWithCounterView(getContext(), resourcesProvider).setRound();
        this.button = round;
        round.setColor(getThemedColor(Theme.key_fill_RedNormal));
        updateButton(false);
        ViewGroup viewGroup2 = this.containerView;
        ButtonWithCounterView buttonWithCounterView = this.button;
        float f2 = (this.backgroundPaddingLeft / AndroidUtilities.density) + 10.0f;
        viewGroup2.addView(buttonWithCounterView, LayoutHelper.createFrame(-1, 48.0f, 87, f2, 10.0f, f2, 10.0f));
        this.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                this.f$0.lambda$new$2(view2);
            }
        });
        UniversalAdapter universalAdapter = this.adapter;
        if (universalAdapter != null) {
            universalAdapter.update(false);
        }
        this.admins.load();
        this.members.load();
    }

    public boolean lambda$new$0(TextView textView, int i, KeyEvent keyEvent) {
        if (keyEvent == null) {
            return false;
        }
        if ((keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 84) && (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66)) {
            return false;
        }
        AndroidUtilities.hideKeyboard(this.searchEdit);
        return false;
    }

    class AnonymousClass2 implements TextWatcher {
        private final Runnable updateSearchRunnable = new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$$0();
            }
        };

        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        AnonymousClass2() {
        }

        @Override
        public void afterTextChanged(Editable editable) {
            if (editable.length() <= 0) {
                AndroidUtilities.cancelRunOnUIThread(this.updateSearchRunnable);
                lambda$$0();
            } else {
                AndroidUtilities.cancelRunOnUIThread(this.updateSearchRunnable);
                AndroidUtilities.runOnUIThread(this.updateSearchRunnable, 300L);
            }
        }

        public void lambda$$0() {
            TLRPC.TL_channelParticipantsSearch tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsSearch();
            tL_channelParticipantsSearch.q = SelectChatUserSheet.this.searchEdit.getText().toString();
            SelectChatUserSheet.this.search.setFilter(tL_channelParticipantsSearch);
            SelectChatUserSheet.this.update();
        }
    }

    public void lambda$new$1(View view, int i) {
        UItem item = this.adapter.getItem(i - 1);
        if (item == null) {
            return;
        }
        Object obj = item.object;
        if ((obj instanceof TLRPC.User) || (obj instanceof TLRPC.Chat)) {
            ((ProfileSearchCell) view).setChecked(true, true);
            this.selectedOwner = (TLObject) item.object;
            updateButton(true);
            this.adapter.update(true);
        }
    }

    public void lambda$new$2(View view) {
        if ((this.selectedOwner instanceof TLRPC.User) && !this.button.isLoading()) {
            this.button.setLoading(true);
            lambda$initTransfer$4((TLRPC.User) this.selectedOwner, null, null);
        }
    }

    private void updateButton(boolean z) {
        int i = ChatObject.isChannelAndNotMegaGroup(this.chat) ? R.string.LeaveChannelAndAppoint : R.string.LeaveGroupAndAppoint;
        this.button.setText(LocaleController.formatString(i, TextUtils.ellipsize(DialogObject.getShortTitle(this.selectedOwner), this.button.getTextPaint(), Math.max(AndroidUtilities.dp(32.0f), ((this.button.getWidth() > 0 ? this.button.getWidth() : AndroidUtilities.displaySize.x - AndroidUtilities.dp(20.0f)) - AndroidUtilities.dp(16.0f)) - this.button.getTextPaint().measureText(LocaleController.getString(i))), TextUtils.TruncateAt.MIDDLE)), z);
    }

    public void updateSearchY() {
        float y = -AndroidUtilities.dp(64.0f);
        int i = 0;
        while (true) {
            if (i >= this.recyclerListView.getChildCount()) {
                break;
            }
            View childAt = this.recyclerListView.getChildAt(i);
            if (childAt.getId() == 3) {
                y = childAt.getY();
                break;
            }
            i++;
        }
        this.searchContainer.setTranslationY(y);
    }

    public void update() {
        UniversalAdapter universalAdapter = this.adapter;
        if (universalAdapter != null) {
            universalAdapter.update(true);
        }
    }

    @Override
    protected RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        UniversalAdapter universalAdapter = new UniversalAdapter(recyclerListView, getContext(), this.currentAccount, 0, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                this.f$0.fillItems((ArrayList) obj, (UniversalAdapter) obj2);
            }
        }, this.resourcesProvider);
        this.adapter = universalAdapter;
        return universalAdapter;
    }

    public void fillItems(ArrayList arrayList, UniversalAdapter universalAdapter) {
        if (this.admins == null || this.members == null) {
            return;
        }
        HashSet hashSet = new HashSet();
        hashSet.add(Long.valueOf(UserConfig.getInstance(this.currentAccount).getClientUserId()));
        arrayList.add(UItem.asSpace(3, AndroidUtilities.dp(64.0f)));
        ParticipantsList participantsList = this.search;
        if (participantsList != null && !TextUtils.isEmpty(participantsList.filter.q)) {
            Iterator it = this.search.users.iterator();
            while (it.hasNext()) {
                TLObject tLObject = (TLObject) it.next();
                if (!hashSet.contains(Long.valueOf(DialogObject.getDialogId(tLObject)))) {
                    hashSet.add(Long.valueOf(DialogObject.getDialogId(tLObject)));
                    arrayList.add(UItem.asProfileCell(tLObject).setChecked(DialogObject.getDialogId(tLObject) == DialogObject.getDialogId(this.selectedOwner)));
                }
            }
            if (this.search.loading) {
                arrayList.add(UItem.asFlicker(29));
                arrayList.add(UItem.asFlicker(29));
                arrayList.add(UItem.asFlicker(29));
            }
            if (arrayList.size() == 1) {
                arrayList.add(UItem.asCustom(this.emptySearchView));
                return;
            }
            return;
        }
        arrayList.add(UItem.asGraySection(LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(this.chat) ? R.string.ChannelAdmins : R.string.GroupAdmins)));
        TLObject tLObject2 = this.initialOwner;
        if (tLObject2 != null) {
            hashSet.add(Long.valueOf(DialogObject.getDialogId(tLObject2)));
            arrayList.add(UItem.asProfileCell(this.initialOwner).setChecked(DialogObject.getDialogId(this.initialOwner) == DialogObject.getDialogId(this.selectedOwner)));
        }
        Iterator it2 = this.admins.users.iterator();
        while (it2.hasNext()) {
            TLObject tLObject3 = (TLObject) it2.next();
            if (!hashSet.contains(Long.valueOf(DialogObject.getDialogId(tLObject3)))) {
                hashSet.add(Long.valueOf(DialogObject.getDialogId(tLObject3)));
                arrayList.add(UItem.asProfileCell(tLObject3).setChecked(DialogObject.getDialogId(tLObject3) == DialogObject.getDialogId(this.selectedOwner)));
            }
        }
        if (this.admins.loading) {
            arrayList.add(UItem.asFlicker(29));
            arrayList.add(UItem.asFlicker(29));
            arrayList.add(UItem.asFlicker(29));
        }
        Iterator it3 = this.members.users.iterator();
        boolean z = true;
        while (it3.hasNext()) {
            TLObject tLObject4 = (TLObject) it3.next();
            if (!hashSet.contains(Long.valueOf(DialogObject.getDialogId(tLObject4)))) {
                if (z) {
                    arrayList.add(UItem.asGraySection(LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(this.chat) ? R.string.ChannelSubscribers2 : R.string.GroupMembers2)));
                    z = false;
                }
                hashSet.add(Long.valueOf(DialogObject.getDialogId(tLObject4)));
                arrayList.add(UItem.asProfileCell(tLObject4).setChecked(DialogObject.getDialogId(tLObject4) == DialogObject.getDialogId(this.selectedOwner)));
            }
        }
        if (this.members.users.isEmpty() || !this.members.loading) {
            return;
        }
        arrayList.add(UItem.asFlicker(29));
        arrayList.add(UItem.asFlicker(29));
        arrayList.add(UItem.asFlicker(29));
    }

    @Override
    public void lambda$new$0() {
        super.lambda$new$0();
        this.admins.detach();
        this.members.detach();
        this.search.detach();
    }

    static class ParticipantsList implements NotificationCenter.NotificationCenterDelegate {
        private boolean attached;
        private final TLRPC.Chat chat;
        private TLRPC.ChatFull chatInfo;
        private boolean clearOnLoad;
        private final int currentAccount;
        public boolean endReached;
        public TLRPC.ChannelParticipantsFilter filter;
        public boolean loading;
        public final ArrayList users = new ArrayList();
        private ArrayList listeners = new ArrayList();
        private int requestId = -1;

        public ParticipantsList(int i, long j, TLRPC.ChannelParticipantsFilter channelParticipantsFilter) {
            this.currentAccount = i;
            this.chat = MessagesController.getInstance(i).getChat(Long.valueOf(j));
            TLRPC.ChatFull chatFull = MessagesController.getInstance(i).getChatFull(j);
            this.chatInfo = chatFull;
            this.filter = channelParticipantsFilter;
            if (chatFull == null) {
                attach();
                MessagesController.getInstance(i).loadFullChat(j, 0, false);
            }
        }

        public ParticipantsList setFilter(TLRPC.ChannelParticipantsFilter channelParticipantsFilter) {
            boolean z;
            boolean z2;
            TLRPC.ChannelParticipantsFilter channelParticipantsFilter2 = this.filter;
            if ((channelParticipantsFilter2 instanceof TLRPC.TL_channelParticipantsSearch) && (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch)) {
                z = !TextUtils.equals(channelParticipantsFilter2.q, channelParticipantsFilter.q);
                z2 = false;
            } else {
                z = true;
                z2 = true;
            }
            this.filter = channelParticipantsFilter;
            if (z) {
                if (z2) {
                    clear();
                } else {
                    this.clearOnLoad = true;
                    this.endReached = false;
                }
                load();
            }
            return this;
        }

        public ParticipantsList listen(Runnable runnable) {
            this.listeners.add(runnable);
            return this;
        }

        private void emit() {
            Iterator it = this.listeners.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }

        public void clear() {
            this.clearOnLoad = false;
            cancel();
            this.users.clear();
            this.endReached = false;
        }

        public void load() {
            if (this.loading || this.endReached) {
                return;
            }
            TLRPC.ChannelParticipantsFilter channelParticipantsFilter = this.filter;
            if ((channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) && TextUtils.isEmpty(channelParticipantsFilter.q)) {
                return;
            }
            this.loading = true;
            if (ChatObject.isChannel(this.chat)) {
                TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                tL_channels_getParticipants.channel = MessagesController.getInputChannel(this.chat);
                tL_channels_getParticipants.filter = this.filter;
                tL_channels_getParticipants.limit = 30;
                tL_channels_getParticipants.offset = this.clearOnLoad ? 0 : this.users.size();
                ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_channels_getParticipants, new BotForumHelper$$ExternalSyntheticLambda2(), new Utilities.Callback2() {
                    @Override
                    public final void run(Object obj, Object obj2) {
                        this.f$0.lambda$load$0((TLRPC.channels_ChannelParticipants) obj, (TLRPC.TL_error) obj2);
                    }
                });
            }
        }

        public void lambda$load$0(TLRPC.channels_ChannelParticipants channels_channelparticipants, TLRPC.TL_error tL_error) {
            if (tL_error != null) {
                if (this.clearOnLoad) {
                    this.users.clear();
                    this.clearOnLoad = false;
                }
                this.endReached = true;
                this.loading = false;
                emit();
                return;
            }
            MessagesController.getInstance(this.currentAccount).putUsers(channels_channelparticipants.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(channels_channelparticipants.chats, false);
            if (this.clearOnLoad) {
                this.users.clear();
                this.clearOnLoad = false;
            }
            Iterator<TLRPC.ChannelParticipant> it = channels_channelparticipants.participants.iterator();
            while (it.hasNext()) {
                TLObject userOrChat = MessagesController.getInstance(this.currentAccount).getUserOrChat(DialogObject.getPeerDialogId(it.next().peer));
                if (userOrChat != null) {
                    this.users.add(userOrChat);
                }
            }
            if (channels_channelparticipants.participants.size() < 30) {
                this.endReached = true;
            }
            this.loading = false;
            emit();
        }

        public void cancel() {
            if (this.requestId >= 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.requestId, true);
                this.requestId = -1;
            }
            this.loading = false;
        }

        @Override
        public void didReceivedNotification(int i, int i2, Object... objArr) {
            if (i == NotificationCenter.chatInfoDidLoad) {
                TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
                long j = chatFull.id;
                TLRPC.Chat chat = this.chat;
                if (j == chat.id) {
                    this.chatInfo = chatFull;
                    if (ChatObject.isChannel(chat) || !this.loading) {
                        return;
                    }
                    this.loading = false;
                    load();
                }
            }
        }

        public void attach() {
            if (this.attached) {
                return;
            }
            this.attached = true;
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatInfoDidLoad);
        }

        public void detach() {
            if (this.attached) {
                return;
            }
            this.attached = false;
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatInfoDidLoad);
            cancel();
        }
    }

    public void lambda$initTransfer$4(final TLRPC.User user, final TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, final TwoStepVerificationActivity twoStepVerificationActivity) {
        if (getContext() != null) {
            this.context = getContext();
        }
        if (this.context == null) {
            return;
        }
        if (inputCheckPasswordSRP != null && !ChatObject.isChannel(this.chat)) {
            BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
            if (safeLastFragment == null) {
                return;
            }
            MessagesController.getInstance(this.currentAccount).convertToMegaGroup(this.context, this.chat.id, safeLastFragment, new MessagesStorage.LongCallback() {
                @Override
                public final void run(long j) {
                    this.f$0.lambda$initTransfer$3(user, inputCheckPasswordSRP, twoStepVerificationActivity, j);
                }
            });
            return;
        }
        final TLRPC.TL_channels_editCreator tL_channels_editCreator = new TLRPC.TL_channels_editCreator();
        if (ChatObject.isChannel(this.chat)) {
            TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
            tL_channels_editCreator.channel = tL_inputChannel;
            TLRPC.Chat chat = this.chat;
            tL_inputChannel.channel_id = chat.id;
            tL_inputChannel.access_hash = chat.access_hash;
        } else {
            tL_channels_editCreator.channel = new TLRPC.TL_inputChannelEmpty();
        }
        tL_channels_editCreator.password = inputCheckPasswordSRP != null ? inputCheckPasswordSRP : new TLRPC.TL_inputCheckPasswordEmpty();
        tL_channels_editCreator.user_id = MessagesController.getInstance(this.currentAccount).getInputUser(user);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_editCreator, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$initTransfer$13(inputCheckPasswordSRP, user, twoStepVerificationActivity, tL_channels_editCreator, tLObject, tL_error);
            }
        });
    }

    public void lambda$initTransfer$3(TLRPC.User user, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, long j) {
        if (j != 0) {
            this.chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j));
            lambda$initTransfer$4(user, inputCheckPasswordSRP, twoStepVerificationActivity);
        }
    }

    public void lambda$initTransfer$13(final TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, final TLRPC.User user, final TwoStepVerificationActivity twoStepVerificationActivity, final TLRPC.TL_channels_editCreator tL_channels_editCreator, TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$initTransfer$12(tL_error, inputCheckPasswordSRP, user, twoStepVerificationActivity, tL_channels_editCreator);
            }
        });
    }

    public void lambda$initTransfer$12(TLRPC.TL_error tL_error, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, final TLRPC.User user, final TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_channels_editCreator tL_channels_editCreator) {
        int i;
        if (tL_error == null) {
            if (inputCheckPasswordSRP != null) {
                Runnable runnable = this.whenTransferred;
                if (runnable != null) {
                    runnable.run();
                }
                lambda$new$0();
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
            if (inputCheckPasswordSRP == null) {
                AlertDialog.Builder builder = new AlertDialog.Builder(this.context);
                builder.setTitle(LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(this.chat) ? R.string.EditAdminChannelTransfer : R.string.EditAdminGroupTransfer));
                builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.EditAdminTransferReadyAlertText, this.chat.title, UserObject.getFirstName(user))));
                builder.setPositiveButton(LocaleController.getString(R.string.EditAdminTransferChangeOwner), new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i2) {
                        this.f$0.lambda$initTransfer$5(user, alertDialog, i2);
                    }
                });
                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i2) {
                        this.f$0.lambda$initTransfer$6(alertDialog, i2);
                    }
                });
                builder.show();
                return;
            }
            return;
        }
        if ("PASSWORD_MISSING".equals(tL_error.text) || tL_error.text.startsWith("PASSWORD_TOO_FRESH_") || tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
            if (twoStepVerificationActivity != null) {
                twoStepVerificationActivity.needHideProgress();
            }
            AlertDialog.Builder builder2 = new AlertDialog.Builder(this.context);
            builder2.setTitle(LocaleController.getString(R.string.EditAdminTransferAlertTitle));
            LinearLayout linearLayout = new LinearLayout(this.context);
            linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
            linearLayout.setOrientation(1);
            builder2.setView(linearLayout);
            TextView textView = new TextView(this.context);
            int i2 = Theme.key_dialogTextBlack;
            textView.setTextColor(Theme.getColor(i2));
            textView.setTextSize(1, 16.0f);
            textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            if (ChatObject.isChannelAndNotMegaGroup(this.chat)) {
                textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.EditChannelAdminTransferAlertText, UserObject.getFirstName(user))));
            } else {
                textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.EditAdminTransferAlertText, UserObject.getFirstName(user))));
            }
            linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2));
            LinearLayout linearLayout2 = new LinearLayout(this.context);
            linearLayout2.setOrientation(0);
            linearLayout.addView(linearLayout2, LayoutHelper.createLinear(-1, -2, 0.0f, 11.0f, 0.0f, 0.0f));
            ImageView imageView = new ImageView(this.context);
            int i3 = R.drawable.list_circle;
            imageView.setImageResource(i3);
            imageView.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
            int color = Theme.getColor(i2);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            imageView.setColorFilter(new PorterDuffColorFilter(color, mode));
            TextView textView2 = new TextView(this.context);
            textView2.setTextColor(Theme.getColor(i2));
            textView2.setTextSize(1, 16.0f);
            textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            textView2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.EditAdminTransferAlertText1)));
            if (LocaleController.isRTL) {
                linearLayout2.addView(textView2, LayoutHelper.createLinear(-1, -2));
                linearLayout2.addView(imageView, LayoutHelper.createLinear(-2, -2, 5));
            } else {
                linearLayout2.addView(imageView, LayoutHelper.createLinear(-2, -2));
                linearLayout2.addView(textView2, LayoutHelper.createLinear(-1, -2));
            }
            LinearLayout linearLayout3 = new LinearLayout(this.context);
            linearLayout3.setOrientation(0);
            linearLayout.addView(linearLayout3, LayoutHelper.createLinear(-1, -2, 0.0f, 11.0f, 0.0f, 0.0f));
            ImageView imageView2 = new ImageView(this.context);
            imageView2.setImageResource(i3);
            imageView2.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
            imageView2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i2), mode));
            TextView textView3 = new TextView(this.context);
            textView3.setTextColor(Theme.getColor(i2));
            textView3.setTextSize(1, 16.0f);
            textView3.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            textView3.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.EditAdminTransferAlertText2)));
            if (LocaleController.isRTL) {
                linearLayout3.addView(textView3, LayoutHelper.createLinear(-1, -2));
                i = 5;
                linearLayout3.addView(imageView2, LayoutHelper.createLinear(-2, -2, 5));
            } else {
                i = 5;
                linearLayout3.addView(imageView2, LayoutHelper.createLinear(-2, -2));
                linearLayout3.addView(textView3, LayoutHelper.createLinear(-1, -2));
            }
            if ("PASSWORD_MISSING".equals(tL_error.text)) {
                builder2.setPositiveButton(LocaleController.getString(R.string.EditAdminTransferSetPassword), new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i4) {
                        this.f$0.lambda$initTransfer$7(alertDialog, i4);
                    }
                });
                builder2.setNegativeButton(LocaleController.getString(R.string.Cancel), new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i4) {
                        this.f$0.lambda$initTransfer$8(alertDialog, i4);
                    }
                });
            } else {
                TextView textView4 = new TextView(this.context);
                textView4.setTextColor(Theme.getColor(i2));
                textView4.setTextSize(1, 16.0f);
                if (!LocaleController.isRTL) {
                    i = 3;
                }
                textView4.setGravity(i | 48);
                textView4.setText(LocaleController.getString(R.string.EditAdminTransferAlertText3));
                linearLayout.addView(textView4, LayoutHelper.createLinear(-1, -2, 0.0f, 11.0f, 0.0f, 0.0f));
                builder2.setNegativeButton(LocaleController.getString(R.string.OK), new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i4) {
                        this.f$0.lambda$initTransfer$9(alertDialog, i4);
                    }
                });
            }
            builder2.show();
            return;
        }
        if ("SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error2) {
                    this.f$0.lambda$initTransfer$11(twoStepVerificationActivity, user, tLObject, tL_error2);
                }
            }, 8);
            return;
        }
        if (tL_error.text.equals("CHANNELS_TOO_MUCH")) {
            if (this.context != null && !AccountInstance.getInstance(this.currentAccount).getUserConfig().isPremium()) {
                BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                if (safeLastFragment == null) {
                    return;
                }
                showDialog(new LimitReachedBottomSheet(safeLastFragment, this.context, 5, this.currentAccount, null));
                return;
            }
            BaseFragment safeLastFragment2 = LaunchActivity.getSafeLastFragment();
            if (safeLastFragment2 == null) {
                return;
            }
            lambda$new$0();
            safeLastFragment2.presentFragment(new TooManyCommunitiesActivity(1));
            return;
        }
        if (twoStepVerificationActivity != null) {
            twoStepVerificationActivity.needHideProgress();
            twoStepVerificationActivity.finishFragment();
        }
        BaseFragment safeLastFragment3 = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment3 == null) {
            return;
        }
        AlertsCreator.showAddUserAlert(tL_error.text, safeLastFragment3, ChatObject.isChannelAndNotMegaGroup(this.chat), tL_channels_editCreator);
    }

    public void lambda$initTransfer$5(final TLRPC.User user, AlertDialog alertDialog, int i) {
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment == null) {
            return;
        }
        lambda$new$0();
        final TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        twoStepVerificationActivity.setDelegate(0, new TwoStepVerificationActivity.TwoStepVerificationActivityDelegate() {
            @Override
            public final void didEnterPassword(TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP) {
                this.f$0.lambda$initTransfer$4(user, twoStepVerificationActivity, inputCheckPasswordSRP);
            }
        });
        safeLastFragment.presentFragment(twoStepVerificationActivity);
    }

    public void lambda$initTransfer$6(AlertDialog alertDialog, int i) {
        this.button.setLoading(false);
    }

    public void lambda$initTransfer$7(AlertDialog alertDialog, int i) {
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment == null) {
            return;
        }
        lambda$new$0();
        safeLastFragment.presentFragment(new TwoStepVerificationSetupActivity(6, null));
    }

    public void lambda$initTransfer$8(AlertDialog alertDialog, int i) {
        this.button.setLoading(false);
    }

    public void lambda$initTransfer$9(AlertDialog alertDialog, int i) {
        this.button.setLoading(false);
    }

    public void lambda$initTransfer$11(final TwoStepVerificationActivity twoStepVerificationActivity, final TLRPC.User user, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$initTransfer$10(tL_error, tLObject, twoStepVerificationActivity, user);
            }
        });
    }

    public void lambda$initTransfer$10(TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.User user) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            twoStepVerificationActivity.setCurrentPasswordInfo(null, password);
            TwoStepVerificationActivity.initPasswordNewAlgo(password);
            lambda$initTransfer$4(user, twoStepVerificationActivity.getNewSrpPassword(), twoStepVerificationActivity);
        }
    }
}
