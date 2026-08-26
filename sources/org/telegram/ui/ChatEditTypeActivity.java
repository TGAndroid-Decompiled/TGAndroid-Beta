package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Vibrator;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.AboutLinkCell;
import org.telegram.ui.Cells.AdminedChannelCell;
import org.telegram.ui.Cells.BotButton$$ExternalSyntheticLambda0;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.LoadingCell;
import org.telegram.ui.Cells.RadioButtonCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.TextSettingsCell;
import org.telegram.ui.Components.CircularProgressDrawable;
import org.telegram.ui.Components.CrossfadeDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ImageUpdater$$ExternalSyntheticLambda2;
import org.telegram.ui.Components.InviteLinkBottomSheet;
import org.telegram.ui.Components.JoinToSendSettingsView;
import org.telegram.ui.Components.JoinToSendSettingsView$$ExternalSyntheticLambda4;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkActionView;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SectionsScrollView;
import org.telegram.ui.Components.TypefaceSpan;
import org.telegram.ui.Components.ViewPagerFixed;

public final class ChatEditTypeActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    public final ArrayList adminedChannelCells;
    public ShadowSectionCell adminedInfoCell;
    public LinearLayout adminnedChannelsLayout;
    public boolean applyToAllInviteLinks;
    public boolean canCreatePublic;
    public long chatId;
    public int checkReqId;
    public ChatLinkActivity$$ExternalSyntheticLambda9 checkRunnable;
    public AnonymousClass6 checkTextView;
    public TLRPC.Chat currentChat;
    public boolean deactivatingLinks;
    public ActionBarMenuItem doneButton;
    public CrossfadeDrawable doneButtonDrawable;
    public ValueAnimator doneButtonDrawableAnimator;
    public EditTextBoldCursor editText;
    public ChangeUsernameActivity.UsernameCell editableUsernameCell;
    public Boolean editableUsernameWasActive;
    public final ArrayList editableUsernames;
    public final ChatEditTypeActivity$$ExternalSyntheticLambda1 enableDoneLoading;
    public HeaderCell headerCell;
    public HeaderCell headerCell2;
    public boolean ignoreScroll;
    public boolean ignoreTextChanges;
    public TLRPC.ChatFull info;
    public TLRPC.TL_chatInviteExported invite;
    public InviteLinkBottomSheet inviteLinkBottomSheet;
    public boolean isChannel;
    public final boolean isForcePublic;
    public boolean isPrivate;
    public boolean isSaveRestricted;
    public AnonymousClass7 joinContainer;
    public String lastCheckName;
    public boolean lastNameAvailable;
    public GLIconSettingsView linearLayout;
    public LinearLayout linearLayoutTypeContainer;
    public LinearLayout linkContainer;
    public LoadingCell loadingAdminedCell;
    public boolean loadingAdminedChannels;
    public final ArrayList loadingUsernames;
    public TextInfoPrivacyCell manageLinksInfoCell;
    public TextCell manageLinksTextView;
    public LinkActionView permanentLinkView;
    public LinearLayout privateContainer;
    public LinearLayout publicContainer;
    public RadioButtonCell radioButtonCell1;
    public RadioButtonCell radioButtonCell2;
    public LinearLayout saveContainer;
    public HeaderCell saveHeaderCell;
    public TextCheckCell saveRestrictCell;
    public TextInfoPrivacyCell saveRestrictInfoCell;
    public ShadowSectionCell sectionCell2;
    public TextInfoPrivacyCell typeInfoCell;
    public UsersSelectActivity.AnonymousClass4 usernameTextView;
    public final ArrayList usernames;
    public UsernamesListView usernamesListView;
    public final HashMap usersMap;

    public final class AnonymousClass6 extends TextInfoPrivacyCell {
        public int prevHeight;
        public ValueAnimator translateAnimator;

        public AnonymousClass6(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context, 12, resourcesProvider);
            this.prevHeight = -1;
        }

        @Override
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            int i5 = 1;
            super.onLayout(z, i, i2, i3, i4);
            if (this.prevHeight != -1) {
                ChatEditTypeActivity chatEditTypeActivity = ChatEditTypeActivity.this;
                if (chatEditTypeActivity.linearLayout != null) {
                    ArrayList arrayList = new ArrayList();
                    boolean z2 = false;
                    for (int i6 = 0; i6 < chatEditTypeActivity.linearLayout.getChildCount(); i6++) {
                        View childAt = chatEditTypeActivity.linearLayout.getChildAt(i6);
                        if (z2) {
                            arrayList.add(childAt);
                        } else if (childAt == this) {
                            z2 = true;
                        }
                    }
                    float height = this.prevHeight - getHeight();
                    ValueAnimator valueAnimator = this.translateAnimator;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.translateAnimator = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.addUpdateListener(new ChatActivity$$ExternalSyntheticLambda305(arrayList, height, i5));
                    this.translateAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                    this.translateAnimator.setDuration(350L);
                    this.translateAnimator.start();
                }
            }
            this.prevHeight = getHeight();
        }

        @Override
        public final void setText(CharSequence charSequence) {
            if (charSequence != 0) {
                charSequence = AndroidUtilities.replaceTags(charSequence.toString());
                int iIndexOf = charSequence.toString().indexOf(10);
                ChatEditTypeActivity chatEditTypeActivity = ChatEditTypeActivity.this;
                if (iIndexOf >= 0) {
                    charSequence.replace(iIndexOf, iIndexOf + 1, " ");
                    charSequence.setSpan(new ForegroundColorSpan(chatEditTypeActivity.getThemedColor(Theme.key_text_RedRegular)), 0, iIndexOf, 33);
                }
                TypefaceSpan[] typefaceSpanArr = (TypefaceSpan[]) charSequence.getSpans(0, charSequence.length(), TypefaceSpan.class);
                UsersSelectActivity.AnonymousClass4 anonymousClass4 = chatEditTypeActivity.usernameTextView;
                String string = (anonymousClass4 == null || anonymousClass4.getText() == null) ? "" : chatEditTypeActivity.usernameTextView.getText().toString();
                for (int i = 0; i < typefaceSpanArr.length; i++) {
                    charSequence.setSpan(new AboutLinkCell.AnonymousClass5(5, (Object) this, string), charSequence.getSpanStart(typefaceSpanArr[i]), charSequence.getSpanEnd(typefaceSpanArr[i]), 33);
                    charSequence.removeSpan(typefaceSpanArr[i]);
                }
            }
            super.setText(charSequence);
        }
    }

    public final class AnonymousClass7 extends JoinToSendSettingsView {
        public final Context val$context;

        public AnonymousClass7(Context context, TLRPC.Chat chat, Context context2) {
            super(context, chat);
            this.val$context = context2;
        }

        @Override
        public final boolean onJoinRequestToggle(JoinToSendSettingsView$$ExternalSyntheticLambda4 joinToSendSettingsView$$ExternalSyntheticLambda4, final boolean z) {
            TLRPC.ChatFull chatFull;
            int i;
            String str;
            ChatEditTypeActivity chatEditTypeActivity = ChatEditTypeActivity.this;
            if (!chatEditTypeActivity.isPrivate || (chatFull = chatEditTypeActivity.info) == null || (i = chatFull.invitesCount) == 0) {
                return true;
            }
            if (chatEditTypeActivity.isChannel) {
                str = z ? "ApproveNewMembersEnableForLinksChannel" : "ApproveNewMembersDisableForLinksChannel";
            } else {
                str = z ? "ApproveNewMembersEnableForLinks" : "ApproveNewMembersDisableForLinks";
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(this.val$context, 0, ((BaseFragment) chatEditTypeActivity).resourceProvider);
            String string = LocaleController.getString(R.string.ApproveNewMembersApplyToLinksTitle);
            AlertDialog alertDialog = builder.alertDialog;
            alertDialog.title = string;
            alertDialog.message = AndroidUtilities.replaceTags(LocaleController.formatPluralString(str, i, new Object[0]));
            final int i2 = 0;
            builder.setPositiveButton(LocaleController.getString(R.string.ApproveNewMembersApplyToLinksApply), new AlertDialog.OnButtonClickListener(this) {
                public final ChatEditTypeActivity.AnonymousClass7 f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(AlertDialog alertDialog2, int i3) {
                    switch (i2) {
                        case 0:
                            ChatEditTypeActivity.AnonymousClass7 anonymousClass7 = this.f$0;
                            anonymousClass7.setJoinRequest(z);
                            ChatEditTypeActivity.this.applyToAllInviteLinks = true;
                            break;
                        default:
                            ChatEditTypeActivity.AnonymousClass7 anonymousClass8 = this.f$0;
                            anonymousClass8.setJoinRequest(z);
                            ChatEditTypeActivity.this.applyToAllInviteLinks = false;
                            break;
                    }
                }
            });
            final int i3 = 1;
            builder.setNegativeButton(LocaleController.getString(R.string.ApproveNewMembersApplyToLinksDontApply), new AlertDialog.OnButtonClickListener(this) {
                public final ChatEditTypeActivity.AnonymousClass7 f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(AlertDialog alertDialog2, int i4) {
                    switch (i3) {
                        case 0:
                            ChatEditTypeActivity.AnonymousClass7 anonymousClass7 = this.f$0;
                            anonymousClass7.setJoinRequest(z);
                            ChatEditTypeActivity.this.applyToAllInviteLinks = true;
                            break;
                        default:
                            ChatEditTypeActivity.AnonymousClass7 anonymousClass8 = this.f$0;
                            anonymousClass8.setJoinRequest(z);
                            ChatEditTypeActivity.this.applyToAllInviteLinks = false;
                            break;
                    }
                }
            });
            chatEditTypeActivity.showDialog(alertDialog);
            return false;
        }
    }

    public final class UsernamesListView extends RecyclerListView {
        public final Adapter adapter;
        public final Paint backgroundPaint;
        public boolean needReorder;

        public final class AnonymousClass1 implements RecyclerListView.OnItemClickListener {
            public AnonymousClass1() {
            }

            @Override
            public final void onItemClick(int i, View view) {
                TLRPC.TL_username tL_username;
                if (!(view instanceof ChangeUsernameActivity.UsernameCell) || (tL_username = ((ChangeUsernameActivity.UsernameCell) view).currentUsername) == null) {
                    return;
                }
                boolean z = tL_username.editable;
                UsernamesListView usernamesListView = UsernamesListView.this;
                if (z) {
                    ChatEditTypeActivity chatEditTypeActivity = ChatEditTypeActivity.this;
                    View view2 = chatEditTypeActivity.fragmentView;
                    if (view2 instanceof ScrollView) {
                        ((ScrollView) view2).smoothScrollTo(0, chatEditTypeActivity.linkContainer.getTop() - AndroidUtilities.dp(128.0f));
                    }
                    ChatEditTypeActivity chatEditTypeActivity2 = ChatEditTypeActivity.this;
                    chatEditTypeActivity2.usernameTextView.requestFocus();
                    AndroidUtilities.showKeyboard(chatEditTypeActivity2.usernameTextView);
                    return;
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(usernamesListView.getContext(), 0, ChatEditTypeActivity.this.getResourceProvider());
                String string = LocaleController.getString(tL_username.active ? R.string.UsernameDeactivateLink : R.string.UsernameActivateLink);
                AlertDialog alertDialog = builder.alertDialog;
                alertDialog.title = string;
                alertDialog.message = LocaleController.getString(tL_username.active ? R.string.UsernameDeactivateLinkChannelMessage : R.string.UsernameActivateLinkChannelMessage);
                builder.setPositiveButton(LocaleController.getString(tL_username.active ? R.string.Hide : R.string.Show), new ChatActivity$$ExternalSyntheticLambda248(this, tL_username, view, 16));
                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new ChatActivity$$ExternalSyntheticLambda131(6));
                builder.show();
            }
        }

        public final class Adapter extends RecyclerListView.SelectionAdapter {
            public Adapter() {
            }

            @Override
            public final int getItemCount() {
                return ChatEditTypeActivity.this.usernames.size() + 2;
            }

            @Override
            public final int getItemViewType(int i) {
                if (i == 0) {
                    return 0;
                }
                return i <= ChatEditTypeActivity.this.usernames.size() ? 1 : 2;
            }

            @Override
            public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
                return viewHolder.mItemViewType == 1;
            }

            @Override
            public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                int i2 = viewHolder.mItemViewType;
                UsernamesListView usernamesListView = UsernamesListView.this;
                View view = viewHolder.itemView;
                if (i2 == 0) {
                    HeaderCell headerCell = (HeaderCell) view;
                    headerCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite, usernamesListView.resourcesProvider));
                    headerCell.setText(LocaleController.getString(R.string.UsernamesChannelHeader));
                    return;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        return;
                    }
                    TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) view;
                    textInfoPrivacyCell.setText(LocaleController.getString(R.string.UsernamesChannelHelp));
                    textInfoPrivacyCell.setBackground(Theme.getThemedDrawableByKey(usernamesListView.getContext(), R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                    return;
                }
                TLRPC.TL_username tL_username = (TLRPC.TL_username) ChatEditTypeActivity.this.usernames.get(i - 1);
                ChangeUsernameActivity.UsernameCell usernameCell = (ChangeUsernameActivity.UsernameCell) view;
                boolean z = usernameCell.editable;
                ChatEditTypeActivity chatEditTypeActivity = ChatEditTypeActivity.this;
                if (z) {
                    chatEditTypeActivity.editableUsernameCell = null;
                }
                usernameCell.set(tL_username, i < chatEditTypeActivity.usernames.size(), false, 0L);
                if (tL_username == null || !tL_username.editable) {
                    return;
                }
                chatEditTypeActivity.editableUsernameCell = usernameCell;
            }

            @Override
            public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                UsernamesListView usernamesListView = UsernamesListView.this;
                if (i == 0) {
                    return new RecyclerListView.Holder(new HeaderCell(usernamesListView.getContext(), usernamesListView.resourcesProvider));
                }
                if (i == 1) {
                    return new RecyclerListView.Holder(new ChangeUsernameActivity.UsernameCell(usernamesListView.getContext(), usernamesListView.resourcesProvider) {
                        @Override
                        public final String getUsernameEditable() {
                            UsersSelectActivity.AnonymousClass4 anonymousClass4 = ChatEditTypeActivity.this.usernameTextView;
                            if (anonymousClass4 == null) {
                                return null;
                            }
                            return anonymousClass4.getText().toString();
                        }
                    });
                }
                if (i != 2) {
                    return null;
                }
                return new RecyclerListView.Holder(new TextInfoPrivacyCell(usernamesListView.getContext(), 12, usernamesListView.resourcesProvider));
            }
        }

        public UsernamesListView(Context context) {
            super(context, null);
            this.needReorder = false;
            this.backgroundPaint = new Paint(1);
            Adapter adapter = new Adapter();
            this.adapter = adapter;
            setAdapter(adapter);
            setLayoutManager(new LinearLayoutManager(1, false));
            setOnItemClickListener(new AnonymousClass1());
            new ItemTouchHelper(new ViewPagerFixed.TabsView.AnonymousClass6(this, 1)).attachToRecyclerView(this);
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            Canvas canvas2;
            int childAdapterPosition;
            int size = ChatEditTypeActivity.this.usernames.size();
            int iMin = Integer.MAX_VALUE;
            int iMax = Integer.MIN_VALUE;
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (childAt != null && (childAdapterPosition = RecyclerView.getChildAdapterPosition(childAt)) >= 1 && childAdapterPosition <= size) {
                    iMin = Math.min(childAt.getTop(), iMin);
                    iMax = Math.max(childAt.getBottom(), iMax);
                }
            }
            if (iMin < iMax) {
                Paint paint = this.backgroundPaint;
                paint.setColor(Theme.getColor(Theme.key_windowBackgroundWhite, this.resourcesProvider));
                canvas2 = canvas;
                canvas2.drawRect(0.0f, iMin, getWidth(), iMax, paint);
            } else {
                canvas2 = canvas;
            }
            super.dispatchDraw(canvas2);
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(9999999, Integer.MIN_VALUE));
        }

        public final void toggleUsername(TLRPC.TL_username tL_username, boolean z, boolean z2) {
            TLRPC.TL_username tL_username2;
            int iMin;
            int i = 0;
            int i2 = 0;
            while (true) {
                ChatEditTypeActivity chatEditTypeActivity = ChatEditTypeActivity.this;
                ArrayList arrayList = chatEditTypeActivity.usernames;
                if (i2 >= arrayList.size()) {
                    return;
                }
                if (arrayList.get(i2) == tL_username) {
                    int i3 = i2 + 1;
                    if (i2 < 0 || i2 >= arrayList.size() || (tL_username2 = (TLRPC.TL_username) arrayList.get(i2)) == null) {
                        return;
                    }
                    int i4 = -1;
                    if (tL_username2.active != z) {
                        tL_username2.active = z;
                        if (z) {
                            int i5 = 0;
                            while (true) {
                                if (i5 >= arrayList.size()) {
                                    i5 = -1;
                                    break;
                                } else if (!((TLRPC.TL_username) arrayList.get(i5)).active) {
                                    break;
                                } else {
                                    i5++;
                                }
                            }
                            if (i5 >= 0) {
                                iMin = Math.max(0, i5 - 1);
                                i4 = iMin + 1;
                            }
                        } else {
                            int i6 = -1;
                            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                                if (((TLRPC.TL_username) arrayList.get(i7)).active) {
                                    i6 = i7;
                                }
                            }
                            if (i6 >= 0) {
                                iMin = Math.min(arrayList.size() - 1, i6 + 1);
                                i4 = iMin + 1;
                            }
                        }
                    }
                    for (int i8 = 0; i8 < getChildCount(); i8++) {
                        View childAt = getChildAt(i8);
                        if (RecyclerView.getChildAdapterPosition(childAt) == i3) {
                            if (z2) {
                                AndroidUtilities.shakeView(childAt);
                            }
                            if (!(childAt instanceof ChangeUsernameActivity.UsernameCell)) {
                                break;
                            }
                            ChangeUsernameActivity.UsernameCell usernameCell = (ChangeUsernameActivity.UsernameCell) childAt;
                            usernameCell.setLoading(chatEditTypeActivity.loadingUsernames.contains(tL_username2.username));
                            TLRPC.TL_username tL_username3 = usernameCell.currentUsername;
                            if (tL_username3 == null) {
                                break;
                            }
                            usernameCell.set(tL_username3, usernameCell.useDivider, true, usernameCell.botId);
                            break;
                        }
                    }
                    if (i4 < 0 || i3 == i4) {
                        return;
                    }
                    int i9 = i4 - 1;
                    Adapter adapter = this.adapter;
                    if (i2 < ChatEditTypeActivity.this.usernames.size()) {
                        UsernamesListView usernamesListView = UsernamesListView.this;
                        if (i9 >= ChatEditTypeActivity.this.usernames.size()) {
                            return;
                        }
                        ChatEditTypeActivity chatEditTypeActivity2 = ChatEditTypeActivity.this;
                        chatEditTypeActivity2.usernames.add(i9, (TLRPC.TL_username) chatEditTypeActivity2.usernames.remove(i2));
                        adapter.mObservable.notifyItemMoved(i3, i4);
                        while (i < chatEditTypeActivity2.usernames.size()) {
                            i++;
                            adapter.notifyItemChanged(i);
                        }
                        return;
                    }
                    return;
                }
                i2++;
            }
        }
    }

    public ChatEditTypeActivity(long j, boolean z) {
        super(null);
        this.editableUsernames = new ArrayList();
        this.usernames = new ArrayList();
        this.loadingUsernames = new ArrayList();
        this.canCreatePublic = true;
        this.adminedChannelCells = new ArrayList();
        this.usersMap = new HashMap();
        this.enableDoneLoading = new ChatEditTypeActivity$$ExternalSyntheticLambda1(this, 5);
        this.deactivatingLinks = false;
        this.chatId = j;
        this.isForcePublic = z;
    }

    public final void checkDoneButton() {
        if (!this.isPrivate && this.usernameTextView.length() <= 0) {
            ArrayList arrayList = this.usernames;
            if (arrayList != null) {
                for (int i = 0; i < arrayList.size(); i++) {
                    TLRPC.TL_username tL_username = (TLRPC.TL_username) arrayList.get(i);
                    if (tL_username == null || !tL_username.active || TextUtils.isEmpty(tL_username.username)) {
                    }
                }
            }
            this.doneButton.setEnabled(false);
            this.doneButton.setAlpha(0.5f);
            return;
        }
        this.doneButton.setEnabled(true);
        this.doneButton.setAlpha(1.0f);
    }

    public final void checkUserName$1$1(String str) {
        if (str == null || str.length() <= 0) {
            this.checkTextView.setVisibility(8);
        } else {
            this.checkTextView.setVisibility(0);
        }
        ChatLinkActivity$$ExternalSyntheticLambda9 chatLinkActivity$$ExternalSyntheticLambda9 = this.checkRunnable;
        if (chatLinkActivity$$ExternalSyntheticLambda9 != null) {
            AndroidUtilities.cancelRunOnUIThread(chatLinkActivity$$ExternalSyntheticLambda9);
            this.checkRunnable = null;
            this.lastCheckName = null;
            if (this.checkReqId != 0) {
                getConnectionsManager().cancelRequest(this.checkReqId, true);
            }
        }
        this.lastNameAvailable = false;
        if (str != null) {
            if (str.startsWith("_") || str.endsWith("_")) {
                this.checkTextView.setText(LocaleController.getString(R.string.LinkInvalid));
                this.checkTextView.setTextColorByKey(Theme.key_text_RedRegular);
                return;
            }
            for (int i = 0; i < str.length(); i++) {
                char cCharAt = str.charAt(i);
                if (i == 0 && cCharAt >= '0' && cCharAt <= '9') {
                    if (this.isChannel) {
                        this.checkTextView.setText(LocaleController.getString(R.string.LinkInvalidStartNumber));
                    } else {
                        this.checkTextView.setText(LocaleController.getString(R.string.LinkInvalidStartNumberMega));
                    }
                    this.checkTextView.setTextColorByKey(Theme.key_text_RedRegular);
                    return;
                }
                if ((cCharAt < '0' || cCharAt > '9') && ((cCharAt < 'a' || cCharAt > 'z') && ((cCharAt < 'A' || cCharAt > 'Z') && cCharAt != '_'))) {
                    this.checkTextView.setText(LocaleController.getString(R.string.LinkInvalid));
                    this.checkTextView.setTextColorByKey(Theme.key_text_RedRegular);
                    return;
                }
            }
        }
        if (str == null || str.length() < 4) {
            if (this.isChannel) {
                this.checkTextView.setText(LocaleController.getString(R.string.LinkInvalidShort));
            } else {
                this.checkTextView.setText(LocaleController.getString(R.string.LinkInvalidShortMega));
            }
            this.checkTextView.setTextColorByKey(Theme.key_text_RedRegular);
            return;
        }
        if (str.length() > 32) {
            this.checkTextView.setText(LocaleController.getString(R.string.LinkInvalidLong));
            this.checkTextView.setTextColorByKey(Theme.key_text_RedRegular);
            return;
        }
        this.checkTextView.setText(LocaleController.getString(R.string.LinkChecking));
        this.checkTextView.setTextColorByKey(Theme.key_windowBackgroundWhiteGrayText8);
        this.lastCheckName = str;
        ChatLinkActivity$$ExternalSyntheticLambda9 chatLinkActivity$$ExternalSyntheticLambda10 = new ChatLinkActivity$$ExternalSyntheticLambda9(5, this, str);
        this.checkRunnable = chatLinkActivity$$ExternalSyntheticLambda10;
        AndroidUtilities.runOnUIThread(chatLinkActivity$$ExternalSyntheticLambda10, 300L);
    }

    @Override
    public final View createView(final Context context) {
        int i;
        int i2;
        int i3 = 2;
        int i4 = 6;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new CallLogActivity.AnonymousClass1(this, 22));
        ActionBarMenu actionBarMenuCreateMenu = this.actionBar.createMenu();
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i5 = Theme.key_actionBarDefaultIcon;
        int i6 = 0;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, i5, false), PorterDuff.Mode.MULTIPLY));
        CrossfadeDrawable crossfadeDrawable = new CrossfadeDrawable(drawableMutate, new CircularProgressDrawable(Theme.getColor(null, i5, false)));
        this.doneButtonDrawable = crossfadeDrawable;
        this.doneButton = actionBarMenuCreateMenu.addItemWithWidth(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), crossfadeDrawable);
        this.linearLayout = new GLIconSettingsView(context);
        SectionsScrollView sectionsScrollView = new SectionsScrollView(context, this.linearLayout, this.resourceProvider) {
            @Override
            public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                return !ChatEditTypeActivity.this.ignoreScroll && super.onInterceptTouchEvent(motionEvent);
            }

            @Override
            public final boolean onTouchEvent(MotionEvent motionEvent) {
                if (motionEvent.getAction() != 0) {
                    return super.onTouchEvent(motionEvent);
                }
                return !ChatEditTypeActivity.this.ignoreScroll && super.onTouchEvent(motionEvent);
            }

            @Override
            public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
                rect.bottom = AndroidUtilities.dp(60.0f) + rect.bottom;
                return super.requestChildRectangleOnScreen(view, rect, z);
            }
        };
        this.fragmentView = sectionsScrollView;
        sectionsScrollView.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
        SectionsScrollView sectionsScrollView2 = (SectionsScrollView) this.fragmentView;
        sectionsScrollView2.setFillViewport(true);
        sectionsScrollView2.addView(this.linearLayout, new FrameLayout.LayoutParams(-1, -2));
        this.actionBar.setAdaptiveBackground(sectionsScrollView2);
        this.linearLayout.setOrientation(1);
        boolean z = this.isForcePublic;
        if (z) {
            this.actionBar.setTitle(LocaleController.getString(R.string.TypeLocationGroup));
        } else if (this.isChannel) {
            this.actionBar.setTitle(LocaleController.getString(R.string.ChannelSettingsTitle));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.GroupSettingsTitle));
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.linearLayoutTypeContainer = linearLayout;
        linearLayout.setOrientation(1);
        this.linearLayout.addView(this.linearLayoutTypeContainer, LayoutHelper.createLinear(-1, -2));
        HeaderCell headerCell = new HeaderCell(context, 23);
        this.headerCell2 = headerCell;
        headerCell.setHeight(46);
        if (this.isChannel) {
            this.headerCell2.setText(LocaleController.getString(R.string.ChannelTypeHeader));
        } else {
            this.headerCell2.setText(LocaleController.getString(R.string.GroupTypeHeader));
        }
        this.linearLayoutTypeContainer.addView(this.headerCell2);
        RadioButtonCell radioButtonCell = new RadioButtonCell(context, false);
        this.radioButtonCell2 = radioButtonCell;
        if (this.isChannel) {
            radioButtonCell.setTextAndValue(LocaleController.getString(R.string.ChannelPrivate), LocaleController.getString(R.string.ChannelPrivateInfo), false, this.isPrivate);
        } else {
            radioButtonCell.setTextAndValue(LocaleController.getString(R.string.MegaPrivate), LocaleController.getString(R.string.MegaPrivateInfo), false, this.isPrivate);
        }
        this.linearLayoutTypeContainer.addView(this.radioButtonCell2, LayoutHelper.createLinear(-1, -2));
        this.radioButtonCell2.setOnClickListener(new ChatEditTypeActivity$$ExternalSyntheticLambda4(this, i6));
        RadioButtonCell radioButtonCell2 = new RadioButtonCell(context, false);
        this.radioButtonCell1 = radioButtonCell2;
        if (this.isChannel) {
            radioButtonCell2.setTextAndValue(LocaleController.getString(R.string.ChannelPublic), LocaleController.getString(R.string.ChannelPublicInfo), false, !this.isPrivate);
        } else {
            radioButtonCell2.setTextAndValue(LocaleController.getString(R.string.MegaPublic), LocaleController.getString(R.string.MegaPublicInfo), false, !this.isPrivate);
        }
        this.linearLayoutTypeContainer.addView(this.radioButtonCell1, LayoutHelper.createLinear(-1, -2));
        this.radioButtonCell1.setOnClickListener(new ChatEditTypeActivity$$ExternalSyntheticLambda4(this, i3));
        ShadowSectionCell shadowSectionCell = new ShadowSectionCell(context, (Object) null);
        this.sectionCell2 = shadowSectionCell;
        this.linearLayout.addView(shadowSectionCell, LayoutHelper.createLinear(-1, -2));
        if (z) {
            this.radioButtonCell2.setVisibility(8);
            this.radioButtonCell1.setVisibility(8);
            this.sectionCell2.setVisibility(8);
            this.headerCell2.setVisibility(8);
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.linkContainer = linearLayout2;
        linearLayout2.setOrientation(1);
        this.linearLayout.addView(this.linkContainer, LayoutHelper.createLinear(-1, -2));
        HeaderCell headerCell2 = new HeaderCell(context, 23);
        this.headerCell = headerCell2;
        this.linkContainer.addView(headerCell2);
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.publicContainer = linearLayout3;
        linearLayout3.setOrientation(0);
        this.linkContainer.addView(this.publicContainer, LayoutHelper.createLinear(23.0f, 7.0f, 23.0f, 0.0f, -1, 36));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.editText = editTextBoldCursor;
        editTextBoldCursor.setText(getMessagesController().linkPrefix + "/");
        this.editText.setTextSize(1, 18.0f);
        EditTextBoldCursor editTextBoldCursor2 = this.editText;
        int i7 = Theme.key_windowBackgroundWhiteHintText;
        editTextBoldCursor2.setHintTextColor(Theme.getColor(null, i7, false));
        EditTextBoldCursor editTextBoldCursor3 = this.editText;
        int i8 = Theme.key_windowBackgroundWhiteBlackText;
        editTextBoldCursor3.setTextColor(Theme.getColor(null, i8, false));
        this.editText.setMaxLines(1);
        this.editText.setLines(1);
        this.editText.setEnabled(false);
        this.editText.setBackground(null);
        this.editText.setPadding(0, 0, 0, 0);
        this.editText.setSingleLine(true);
        this.editText.setInputType(163840);
        this.editText.setImeOptions(6);
        this.publicContainer.addView(this.editText, LayoutHelper.createLinear(-2, 36));
        UsersSelectActivity.AnonymousClass4 anonymousClass4 = new UsersSelectActivity.AnonymousClass4(this, context, 2);
        this.usernameTextView = anonymousClass4;
        anonymousClass4.setTextSize(1, 18.0f);
        this.usernameTextView.setHintTextColor(Theme.getColor(null, i7, false));
        this.usernameTextView.setTextColor(Theme.getColor(null, i8, false));
        this.usernameTextView.setMaxLines(1);
        this.usernameTextView.setLines(1);
        this.usernameTextView.setBackground(null);
        this.usernameTextView.setPadding(0, 0, 0, 0);
        this.usernameTextView.setSingleLine(true);
        this.usernameTextView.setInputType(163872);
        this.usernameTextView.setImeOptions(6);
        this.usernameTextView.setHint(LocaleController.getString(R.string.ChannelUsernamePlaceholder));
        this.usernameTextView.setCursorColor(Theme.getColor(null, i8, false));
        this.usernameTextView.setCursorSize(AndroidUtilities.dp(20.0f));
        this.usernameTextView.setCursorWidth(1.5f);
        this.publicContainer.addView(this.usernameTextView, LayoutHelper.createLinear(-1, 36));
        this.usernameTextView.addTextChangedListener(new ArticleViewer.AnonymousClass16(this, i4));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.privateContainer = linearLayout4;
        linearLayout4.setOrientation(1);
        this.linkContainer.addView(this.privateContainer, LayoutHelper.createLinear(-1, -2));
        LinkActionView linkActionView = new LinkActionView(context, this, null, true, ChatObject.isChannel(this.currentChat));
        this.permanentLinkView = linkActionView;
        linkActionView.setDelegate(new LinkActionView.Delegate() {
            @Override
            public final void editLink() {
            }

            @Override
            public final void removeLink() {
            }

            @Override
            public final void revokeLink() {
                ChatEditTypeActivity.this.generateLink(true);
            }

            @Override
            public final void showUsersForPermanentLink() {
                ChatEditTypeActivity chatEditTypeActivity = ChatEditTypeActivity.this;
                chatEditTypeActivity.inviteLinkBottomSheet = new InviteLinkBottomSheet(context, chatEditTypeActivity.invite, chatEditTypeActivity.info, chatEditTypeActivity.usersMap, chatEditTypeActivity, chatEditTypeActivity.chatId, true, ChatObject.isChannel(chatEditTypeActivity.currentChat));
                chatEditTypeActivity.inviteLinkBottomSheet.show();
            }
        });
        this.permanentLinkView.setUsers(0, null, false);
        this.privateContainer.addView(this.permanentLinkView);
        AnonymousClass6 anonymousClass6 = new AnonymousClass6(context, this.resourceProvider);
        this.checkTextView = anonymousClass6;
        anonymousClass6.setBottomPadding(6);
        this.linearLayout.addView(this.checkTextView, LayoutHelper.createLinear(-2, -2));
        TextInfoPrivacyCell textInfoPrivacyCell = new TextInfoPrivacyCell(context, 12, this.resourceProvider);
        this.typeInfoCell = textInfoPrivacyCell;
        textInfoPrivacyCell.setImportantForAccessibility(1);
        this.linearLayout.addView(this.typeInfoCell, LayoutHelper.createLinear(-1, -2));
        LoadingCell loadingCell = new LoadingCell(context);
        this.loadingAdminedCell = loadingCell;
        this.linearLayout.addView(loadingCell, LayoutHelper.createLinear(-1, -2));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.adminnedChannelsLayout = linearLayout5;
        linearLayout5.setOrientation(1);
        this.linearLayout.addView(this.adminnedChannelsLayout, LayoutHelper.createLinear(-1, -2));
        ShadowSectionCell shadowSectionCell2 = new ShadowSectionCell(context, (Object) null);
        this.adminedInfoCell = shadowSectionCell2;
        this.linearLayout.addView(shadowSectionCell2, LayoutHelper.createLinear(-1, -2));
        GLIconSettingsView gLIconSettingsView = this.linearLayout;
        UsernamesListView usernamesListView = new UsernamesListView(context);
        this.usernamesListView = usernamesListView;
        gLIconSettingsView.addView(usernamesListView, LayoutHelper.createLinear(-1, -2));
        this.usernamesListView.setVisibility((this.isPrivate || this.usernames.isEmpty()) ? 8 : 0);
        TextCell textCell = new TextCell(context);
        this.manageLinksTextView = textCell;
        textCell.setTextAndIcon(R.drawable.msg_link2, (CharSequence) LocaleController.getString(R.string.ManageInviteLinks), false);
        this.manageLinksTextView.setOnClickListener(new ChatEditTypeActivity$$ExternalSyntheticLambda4(this, 3));
        this.linearLayout.addView(this.manageLinksTextView, LayoutHelper.createLinear(-1, -2));
        TextInfoPrivacyCell textInfoPrivacyCell2 = new TextInfoPrivacyCell(context, 12, this.resourceProvider);
        this.manageLinksInfoCell = textInfoPrivacyCell2;
        this.linearLayout.addView(textInfoPrivacyCell2, LayoutHelper.createLinear(-1, -2));
        AnonymousClass7 anonymousClass7 = new AnonymousClass7(context, this.currentChat, context);
        this.joinContainer = anonymousClass7;
        TLRPC.ChatFull chatFull = this.info;
        boolean z2 = (chatFull == null || chatFull.linked_chat_id == 0 || this.isChannel) ? false : true;
        anonymousClass7.joinHeaderCell.setVisibility(z2 ? 0 : 8);
        anonymousClass7.joinToSendCell.setVisibility(z2 ? 0 : 8);
        if (!z2) {
            anonymousClass7.isJoinToSend = true;
            anonymousClass7.joinRequestCell.setVisibility(0);
            anonymousClass7.updateToggleValue(1.0f);
        }
        anonymousClass7.requestLayout();
        AnonymousClass7 anonymousClass8 = this.joinContainer;
        TLRPC.ChatFull chatFull2 = this.info;
        boolean zIsChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(anonymousClass8.currentChat);
        boolean zIsPublic = ChatObject.isPublic(anonymousClass8.currentChat);
        TextInfoPrivacyCell textInfoPrivacyCell3 = anonymousClass8.joinRequestInfoCell;
        if (chatFull2 == null || chatFull2.guard_bot_id == 0) {
            if (zIsChannelAndNotMegaGroup) {
                i = R.string.ChannelSettingsJoinRequestInfo2;
            } else {
                i = zIsPublic ? R.string.GroupPublicSettingsJoinRequestInfo2 : R.string.GroupPrivateSettingsJoinRequestInfo2;
            }
            textInfoPrivacyCell3.setText(LocaleController.getString(i));
        } else {
            String str = "@" + DialogObject.getPublicUsername(MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(chatFull2.guard_bot_id)));
            if (zIsChannelAndNotMegaGroup) {
                i2 = R.string.ChannelSettingsJoinRequestInfoManagedBy;
            } else {
                i2 = zIsPublic ? R.string.GroupPublicSettingsJoinRequestInfoManagedBy : R.string.GroupPrivateSettingsJoinRequestInfoManagedBy;
            }
            textInfoPrivacyCell3.setText(AndroidUtilities.replaceSingleLink(LocaleController.formatString(i2, str), Theme.getColor(null, Theme.key_telegram_color_text, false), new ImageUpdater$$ExternalSyntheticLambda2(i4, chatFull2, this)));
        }
        this.linearLayout.addView(this.joinContainer);
        LinearLayout linearLayout6 = new LinearLayout(context);
        this.saveContainer = linearLayout6;
        linearLayout6.setOrientation(1);
        this.linearLayout.addView(this.saveContainer);
        HeaderCell headerCell3 = new HeaderCell(context, 23);
        this.saveHeaderCell = headerCell3;
        headerCell3.setHeight(46);
        this.saveHeaderCell.setText(LocaleController.getString(R.string.SavingContentTitle));
        this.saveContainer.addView(this.saveHeaderCell, LayoutHelper.createLinear(-1, -2));
        TextCheckCell textCheckCell = new TextCheckCell(context);
        this.saveRestrictCell = textCheckCell;
        textCheckCell.setTextAndCheck(LocaleController.getString(R.string.RestrictSavingContent), this.isSaveRestricted, false);
        this.saveRestrictCell.setOnClickListener(new ChatEditTypeActivity$$ExternalSyntheticLambda4(this, 4));
        this.saveContainer.addView(this.saveRestrictCell, LayoutHelper.createLinear(-1, -2));
        this.saveRestrictInfoCell = new TextInfoPrivacyCell(context, 12, this.resourceProvider);
        if (!this.isChannel || ChatObject.isMegagroup(this.currentChat)) {
            this.saveRestrictInfoCell.setText(LocaleController.getString(R.string.RestrictSavingContentInfoGroup));
        } else {
            this.saveRestrictInfoCell.setText(LocaleController.getString(R.string.RestrictSavingContentInfoChannel));
        }
        this.saveContainer.addView(this.saveRestrictInfoCell, LayoutHelper.createLinear(-1, -2));
        String publicUsername = ChatObject.getPublicUsername(this.currentChat, true);
        if (!this.isPrivate && publicUsername != null) {
            this.ignoreTextChanges = true;
            this.usernameTextView.setText(publicUsername);
            this.usernameTextView.setSelection(publicUsername.length());
            this.ignoreTextChanges = false;
        }
        updatePrivatePublic$1();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.id == this.chatId) {
                this.info = chatFull;
                this.invite = chatFull.exported_invite;
                updatePrivatePublic$1();
                return;
            }
            return;
        }
        if (i == NotificationCenter.dialogDeleted) {
            if ((-this.chatId) == ((Long) objArr[0]).longValue()) {
                INavigationLayout iNavigationLayout = this.parentLayout;
                if (iNavigationLayout == null || ((ActionBarLayout) iNavigationLayout).getLastFragment() != this) {
                    removeSelfFromStack();
                } else {
                    finishFragment();
                }
            }
        }
    }

    public final void generateLink(boolean z) {
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
        tL_messages_exportChatInvite.peer = getMessagesController().getInputPeer(-this.chatId);
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new CallLogActivity$$ExternalSyntheticLambda31(5, this, z)), this.classGuid);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        ChatActivity$$ExternalSyntheticLambda94 chatActivity$$ExternalSyntheticLambda94 = new ChatActivity$$ExternalSyntheticLambda94(this, 7);
        arrayList.add(new ThemeDescription(this.fragmentView, 1, null, null, null, null, Theme.key_windowBackgroundGray));
        arrayList.add(new ThemeDescription(this.actionBar, 64, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, 128, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, 256, null, null, null, null, Theme.key_actionBarDefaultSelector));
        int i = Theme.key_windowBackgroundGrayShadow;
        arrayList.add(new ThemeDescription(this.sectionCell2, 32, new Class[]{ShadowSectionCell.class}, null, null, null, i));
        arrayList.add(new ThemeDescription(null, 32, new Class[]{TextInfoPrivacyCell.class}, null, null, null, i));
        int i2 = Theme.key_windowBackgroundWhiteGrayText4;
        arrayList.add(new ThemeDescription(null, 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, null, null, -1, null, i2));
        int i3 = Theme.key_listSelector;
        arrayList.add(new ThemeDescription(null, 4096, null, null, null, null, i3));
        int i4 = Theme.key_text_RedRegular;
        arrayList.add(new ThemeDescription(null, 4, new Class[]{TextSettingsCell.class}, new String[]{"textView"}, null, null, -1, null, i4));
        arrayList.add(new ThemeDescription(null, 4096, null, null, null, null, i3));
        int i5 = Theme.key_windowBackgroundWhiteBlackText;
        arrayList.add(new ThemeDescription(null, 4, new Class[]{TextSettingsCell.class}, new String[]{"textView"}, null, null, -1, null, i5));
        arrayList.add(new ThemeDescription(this.usernameTextView, 4, null, null, null, null, i5));
        UsersSelectActivity.AnonymousClass4 anonymousClass4 = this.usernameTextView;
        int i6 = Theme.key_windowBackgroundWhiteHintText;
        arrayList.add(new ThemeDescription(anonymousClass4, 8388608, null, null, null, null, i6));
        LinearLayout linearLayout = this.linearLayoutTypeContainer;
        int i7 = Theme.key_windowBackgroundWhite;
        arrayList.add(new ThemeDescription(linearLayout, 1, null, null, null, null, i7));
        arrayList.add(new ThemeDescription(this.linkContainer, 1, null, null, null, null, i7));
        int i8 = Theme.key_windowBackgroundWhiteBlueHeader;
        arrayList.add(new ThemeDescription(this.headerCell, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, null, null, -1, null, i8));
        arrayList.add(new ThemeDescription(this.headerCell2, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, null, null, -1, null, i8));
        arrayList.add(new ThemeDescription(this.saveHeaderCell, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, null, null, -1, null, i8));
        arrayList.add(new ThemeDescription(this.editText, 4, null, null, null, null, i5));
        arrayList.add(new ThemeDescription(this.editText, 8388608, null, null, null, null, i6));
        arrayList.add(new ThemeDescription(this.saveRestrictCell, 4096, null, null, null, null, i3));
        arrayList.add(new ThemeDescription(this.saveRestrictCell, 0, new Class[]{TextCheckCell.class}, new String[]{"textView"}, null, null, -1, null, i5));
        arrayList.add(new ThemeDescription(this.saveRestrictCell, 0, new Class[]{TextCheckCell.class}, new String[]{"checkBox"}, null, null, -1, null, Theme.key_switchTrack));
        arrayList.add(new ThemeDescription(this.saveRestrictCell, 0, new Class[]{TextCheckCell.class}, new String[]{"checkBox"}, null, null, -1, null, Theme.key_switchTrackChecked));
        arrayList.add(new ThemeDescription(this.checkTextView, 262144, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, null, null, -1, null, i4));
        arrayList.add(new ThemeDescription(this.checkTextView, 262144, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayText8));
        arrayList.add(new ThemeDescription(this.checkTextView, 262144, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGreenText));
        arrayList.add(new ThemeDescription(this.typeInfoCell, 32, new Class[]{TextInfoPrivacyCell.class}, null, null, null, i));
        arrayList.add(new ThemeDescription(this.typeInfoCell, 262144, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, null, null, -1, null, i2));
        arrayList.add(new ThemeDescription(this.typeInfoCell, 262144, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, null, null, -1, null, i4));
        arrayList.add(new ThemeDescription(this.manageLinksInfoCell, 32, new Class[]{TextInfoPrivacyCell.class}, null, null, null, i));
        arrayList.add(new ThemeDescription(this.manageLinksInfoCell, 262144, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, null, null, -1, null, i2));
        arrayList.add(new ThemeDescription(this.manageLinksInfoCell, 262144, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, null, null, -1, null, i4));
        arrayList.add(new ThemeDescription(this.saveRestrictInfoCell, 32, new Class[]{TextInfoPrivacyCell.class}, null, null, null, i));
        arrayList.add(new ThemeDescription(this.saveRestrictInfoCell, 262144, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, null, null, -1, null, i2));
        arrayList.add(new ThemeDescription(this.saveRestrictInfoCell, 262144, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, null, null, -1, null, i4));
        arrayList.add(new ThemeDescription(this.adminedInfoCell, 32, new Class[]{TextInfoPrivacyCell.class}, null, null, null, i));
        arrayList.add(new ThemeDescription(this.adminnedChannelsLayout, 1, null, null, null, null, i7));
        arrayList.add(new ThemeDescription(this.loadingAdminedCell, 0, new Class[]{LoadingCell.class}, new String[]{"progressBar"}, null, null, -1, null, Theme.key_progressCircle));
        arrayList.add(new ThemeDescription(this.radioButtonCell1, 4096, null, null, null, null, i3));
        int i9 = Theme.key_radioBackground;
        arrayList.add(new ThemeDescription(this.radioButtonCell1, 8192, new Class[]{RadioButtonCell.class}, new String[]{"radioButton"}, null, null, -1, null, i9));
        int i10 = Theme.key_radioBackgroundChecked;
        arrayList.add(new ThemeDescription(this.radioButtonCell1, 16384, new Class[]{RadioButtonCell.class}, new String[]{"radioButton"}, null, null, -1, null, i10));
        arrayList.add(new ThemeDescription(this.radioButtonCell1, 4, new Class[]{RadioButtonCell.class}, new String[]{"textView"}, null, null, -1, null, i5));
        int i11 = Theme.key_windowBackgroundWhiteGrayText2;
        arrayList.add(new ThemeDescription(this.radioButtonCell1, 4, new Class[]{RadioButtonCell.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        arrayList.add(new ThemeDescription(this.radioButtonCell2, 4096, null, null, null, null, i3));
        arrayList.add(new ThemeDescription(this.radioButtonCell2, 8192, new Class[]{RadioButtonCell.class}, new String[]{"radioButton"}, null, null, -1, null, i9));
        arrayList.add(new ThemeDescription(this.radioButtonCell2, 16384, new Class[]{RadioButtonCell.class}, new String[]{"radioButton"}, null, null, -1, null, i10));
        arrayList.add(new ThemeDescription(this.radioButtonCell2, 4, new Class[]{RadioButtonCell.class}, new String[]{"textView"}, null, null, -1, null, i5));
        arrayList.add(new ThemeDescription(this.radioButtonCell2, 4, new Class[]{RadioButtonCell.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        arrayList.add(new ThemeDescription(this.adminnedChannelsLayout, 4, new Class[]{AdminedChannelCell.class}, new String[]{"nameTextView"}, null, null, -1, null, i5));
        int i12 = Theme.key_windowBackgroundWhiteGrayText;
        arrayList.add(new ThemeDescription(this.adminnedChannelsLayout, 4, new Class[]{AdminedChannelCell.class}, new String[]{"statusTextView"}, null, null, -1, null, i12));
        arrayList.add(new ThemeDescription(this.adminnedChannelsLayout, 2, new Class[]{AdminedChannelCell.class}, new String[]{"statusTextView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteLinkText));
        arrayList.add(new ThemeDescription(this.adminnedChannelsLayout, 8, new Class[]{AdminedChannelCell.class}, new String[]{"deleteButton"}, null, null, -1, null, i12));
        arrayList.add(new ThemeDescription(null, 0, null, null, Theme.avatarDrawables, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_text));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundRed));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundOrange));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundViolet));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundGreen));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundCyan));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundBlue));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundPink));
        arrayList.add(new ThemeDescription(this.manageLinksTextView, 4096, null, null, null, null, i3));
        arrayList.add(new ThemeDescription(this.manageLinksTextView, 4, new Class[]{TextCell.class}, new String[]{"textView"}, null, null, -1, null, i5));
        arrayList.add(new ThemeDescription(this.manageLinksTextView, 0, new Class[]{TextCell.class}, new String[]{"imageView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayIcon));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onBecomeFullyVisible() {
        UsersSelectActivity.AnonymousClass4 anonymousClass4;
        super.onBecomeFullyVisible();
        if (!this.isForcePublic || (anonymousClass4 = this.usernameTextView) == null) {
            return;
        }
        anonymousClass4.requestFocus();
        AndroidUtilities.showKeyboard(this.usernameTextView);
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ChatEditTypeActivity.onFragmentCreate():boolean");
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        GLIconSettingsView gLIconSettingsView = this.linearLayout;
        if (gLIconSettingsView != null) {
            gLIconSettingsView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + i4);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        TLRPC.ChatFull chatFull = this.info;
        if (chatFull != null) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull.exported_invite;
            this.invite = tL_chatInviteExported;
            this.permanentLinkView.setLink(tL_chatInviteExported == null ? null : tL_chatInviteExported.link);
            this.permanentLinkView.loadUsers(this.invite, this.chatId);
        }
    }

    public final void processDone$6() {
        boolean z;
        boolean z2;
        ArrayList<TLRPC.TL_username> arrayList;
        boolean z3;
        final ChatEditTypeActivity chatEditTypeActivity = this;
        AndroidUtilities.runOnUIThread(chatEditTypeActivity.enableDoneLoading, 200L);
        boolean z4 = true;
        if (chatEditTypeActivity.getParentActivity() == null) {
            z2 = false;
        } else {
            String publicUsername = ChatObject.getPublicUsername(chatEditTypeActivity.currentChat, true);
            if (chatEditTypeActivity.isPrivate || (((publicUsername != null || chatEditTypeActivity.usernameTextView.length() == 0) && (publicUsername == null || publicUsername.equalsIgnoreCase(chatEditTypeActivity.usernameTextView.getText().toString()))) || chatEditTypeActivity.usernameTextView.length() == 0 || chatEditTypeActivity.lastNameAvailable)) {
                if (publicUsername == null) {
                    publicUsername = "";
                }
                String string = chatEditTypeActivity.isPrivate ? "" : chatEditTypeActivity.usernameTextView.getText().toString();
                if (publicUsername.equals(string)) {
                    if (!chatEditTypeActivity.isPrivate || (arrayList = chatEditTypeActivity.currentChat.usernames) == null || arrayList.isEmpty()) {
                        z = true;
                    } else if (chatEditTypeActivity.deactivatingLinks) {
                        z = false;
                    } else {
                        chatEditTypeActivity.deactivatingLinks = true;
                        boolean z5 = false;
                        for (int i = 0; i < chatEditTypeActivity.currentChat.usernames.size(); i++) {
                            TLRPC.TL_username tL_username = chatEditTypeActivity.currentChat.usernames.get(i);
                            if (tL_username != null && tL_username.active && !tL_username.editable) {
                                z5 = true;
                            }
                        }
                        if (z5) {
                            TLRPC.TL_channels_deactivateAllUsernames tL_channels_deactivateAllUsernames = new TLRPC.TL_channels_deactivateAllUsernames();
                            tL_channels_deactivateAllUsernames.channel = MessagesController.getInputChannel(chatEditTypeActivity.currentChat);
                            chatEditTypeActivity.getConnectionsManager().sendRequest(tL_channels_deactivateAllUsernames, new ChatEditTypeActivity$$ExternalSyntheticLambda0(chatEditTypeActivity, 1));
                        } else {
                            chatEditTypeActivity.deactivatingLinks = false;
                        }
                        z = !z5;
                    }
                    if (z) {
                        z2 = true;
                    }
                } else if (ChatObject.isChannel(chatEditTypeActivity.currentChat)) {
                    chatEditTypeActivity.getMessagesController().updateChannelUserName(chatEditTypeActivity, chatEditTypeActivity.chatId, string, new ChatEditTypeActivity$$ExternalSyntheticLambda1(chatEditTypeActivity, 2), new ChatEditTypeActivity$$ExternalSyntheticLambda1(chatEditTypeActivity, 3));
                    chatEditTypeActivity = chatEditTypeActivity;
                } else {
                    final int i2 = 1;
                    chatEditTypeActivity.getMessagesController().convertToMegaGroup(chatEditTypeActivity.getParentActivity(), chatEditTypeActivity.chatId, chatEditTypeActivity, new MessagesStorage.LongCallback(chatEditTypeActivity) {
                        public final ChatEditTypeActivity f$0;

                        {
                            this.f$0 = chatEditTypeActivity;
                        }

                        @Override
                        public final void run(long j) {
                            switch (i2) {
                                case 0:
                                    ChatEditTypeActivity chatEditTypeActivity2 = this.f$0;
                                    if (j == 0) {
                                        chatEditTypeActivity2.getClass();
                                    } else {
                                        chatEditTypeActivity2.chatId = j;
                                        chatEditTypeActivity2.currentChat = chatEditTypeActivity2.getMessagesController().getChat(Long.valueOf(j));
                                        chatEditTypeActivity2.processDone$6();
                                    }
                                    break;
                                case 1:
                                    ChatEditTypeActivity chatEditTypeActivity3 = this.f$0;
                                    if (j == 0) {
                                        chatEditTypeActivity3.getClass();
                                    } else {
                                        chatEditTypeActivity3.chatId = j;
                                        chatEditTypeActivity3.currentChat = chatEditTypeActivity3.getMessagesController().getChat(Long.valueOf(j));
                                        chatEditTypeActivity3.processDone$6();
                                    }
                                    break;
                                default:
                                    ChatEditTypeActivity chatEditTypeActivity4 = this.f$0;
                                    if (j == 0) {
                                        chatEditTypeActivity4.getClass();
                                    } else {
                                        chatEditTypeActivity4.chatId = j;
                                        chatEditTypeActivity4.currentChat = chatEditTypeActivity4.getMessagesController().getChat(Long.valueOf(j));
                                        MessagesController messagesController = chatEditTypeActivity4.getMessagesController();
                                        long j2 = -chatEditTypeActivity4.chatId;
                                        TLRPC.Chat chat = chatEditTypeActivity4.currentChat;
                                        boolean z6 = chatEditTypeActivity4.isSaveRestricted;
                                        chat.noforwards = z6;
                                        messagesController.toggleChatNoForwards(j2, z6);
                                        chatEditTypeActivity4.processDone$6();
                                    }
                                    break;
                            }
                        }
                    });
                }
            } else {
                Vibrator vibrator = (Vibrator) chatEditTypeActivity.getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                AndroidUtilities.shakeView(chatEditTypeActivity.checkTextView);
                chatEditTypeActivity.updateDoneProgress$1(false);
            }
            z2 = false;
        }
        if (z2) {
            TLRPC.Chat chat = chatEditTypeActivity.currentChat;
            if (chat.noforwards == chatEditTypeActivity.isSaveRestricted) {
                z3 = true;
            } else if (ChatObject.isChannel(chat)) {
                MessagesController messagesController = chatEditTypeActivity.getMessagesController();
                long j = -chatEditTypeActivity.chatId;
                TLRPC.Chat chat2 = chatEditTypeActivity.currentChat;
                boolean z6 = chatEditTypeActivity.isSaveRestricted;
                chat2.noforwards = z6;
                messagesController.toggleChatNoForwards(j, z6);
                z3 = true;
            } else {
                chatEditTypeActivity.updateDoneProgress$1(true);
                final int i3 = 2;
                chatEditTypeActivity.getMessagesController().convertToMegaGroup(chatEditTypeActivity.getParentActivity(), chatEditTypeActivity.chatId, chatEditTypeActivity, new MessagesStorage.LongCallback(chatEditTypeActivity) {
                    public final ChatEditTypeActivity f$0;

                    {
                        this.f$0 = chatEditTypeActivity;
                    }

                    @Override
                    public final void run(long j2) {
                        switch (i3) {
                            case 0:
                                ChatEditTypeActivity chatEditTypeActivity2 = this.f$0;
                                if (j2 == 0) {
                                    chatEditTypeActivity2.getClass();
                                } else {
                                    chatEditTypeActivity2.chatId = j2;
                                    chatEditTypeActivity2.currentChat = chatEditTypeActivity2.getMessagesController().getChat(Long.valueOf(j2));
                                    chatEditTypeActivity2.processDone$6();
                                }
                                break;
                            case 1:
                                ChatEditTypeActivity chatEditTypeActivity3 = this.f$0;
                                if (j2 == 0) {
                                    chatEditTypeActivity3.getClass();
                                } else {
                                    chatEditTypeActivity3.chatId = j2;
                                    chatEditTypeActivity3.currentChat = chatEditTypeActivity3.getMessagesController().getChat(Long.valueOf(j2));
                                    chatEditTypeActivity3.processDone$6();
                                }
                                break;
                            default:
                                ChatEditTypeActivity chatEditTypeActivity4 = this.f$0;
                                if (j2 == 0) {
                                    chatEditTypeActivity4.getClass();
                                } else {
                                    chatEditTypeActivity4.chatId = j2;
                                    chatEditTypeActivity4.currentChat = chatEditTypeActivity4.getMessagesController().getChat(Long.valueOf(j2));
                                    MessagesController messagesController2 = chatEditTypeActivity4.getMessagesController();
                                    long j3 = -chatEditTypeActivity4.chatId;
                                    TLRPC.Chat chat3 = chatEditTypeActivity4.currentChat;
                                    boolean z7 = chatEditTypeActivity4.isSaveRestricted;
                                    chat3.noforwards = z7;
                                    messagesController2.toggleChatNoForwards(j3, z7);
                                    chatEditTypeActivity4.processDone$6();
                                }
                                break;
                        }
                    }
                });
                z3 = false;
            }
            if (z3) {
                if (chatEditTypeActivity.joinContainer != null) {
                    if (chatEditTypeActivity.getParentActivity() != null) {
                        if (!chatEditTypeActivity.isChannel && !ChatObject.isChannel(chatEditTypeActivity.currentChat)) {
                            AnonymousClass7 anonymousClass7 = chatEditTypeActivity.joinContainer;
                            if (anonymousClass7.isJoinToSend || anonymousClass7.isJoinRequest) {
                                final int i4 = 0;
                                chatEditTypeActivity.getMessagesController().convertToMegaGroup(chatEditTypeActivity.getParentActivity(), chatEditTypeActivity.chatId, chatEditTypeActivity, new MessagesStorage.LongCallback(chatEditTypeActivity) {
                                    public final ChatEditTypeActivity f$0;

                                    {
                                        this.f$0 = chatEditTypeActivity;
                                    }

                                    @Override
                                    public final void run(long j2) {
                                        switch (i4) {
                                            case 0:
                                                ChatEditTypeActivity chatEditTypeActivity2 = this.f$0;
                                                if (j2 == 0) {
                                                    chatEditTypeActivity2.getClass();
                                                } else {
                                                    chatEditTypeActivity2.chatId = j2;
                                                    chatEditTypeActivity2.currentChat = chatEditTypeActivity2.getMessagesController().getChat(Long.valueOf(j2));
                                                    chatEditTypeActivity2.processDone$6();
                                                }
                                                break;
                                            case 1:
                                                ChatEditTypeActivity chatEditTypeActivity3 = this.f$0;
                                                if (j2 == 0) {
                                                    chatEditTypeActivity3.getClass();
                                                } else {
                                                    chatEditTypeActivity3.chatId = j2;
                                                    chatEditTypeActivity3.currentChat = chatEditTypeActivity3.getMessagesController().getChat(Long.valueOf(j2));
                                                    chatEditTypeActivity3.processDone$6();
                                                }
                                                break;
                                            default:
                                                ChatEditTypeActivity chatEditTypeActivity4 = this.f$0;
                                                if (j2 == 0) {
                                                    chatEditTypeActivity4.getClass();
                                                } else {
                                                    chatEditTypeActivity4.chatId = j2;
                                                    chatEditTypeActivity4.currentChat = chatEditTypeActivity4.getMessagesController().getChat(Long.valueOf(j2));
                                                    MessagesController messagesController2 = chatEditTypeActivity4.getMessagesController();
                                                    long j3 = -chatEditTypeActivity4.chatId;
                                                    TLRPC.Chat chat3 = chatEditTypeActivity4.currentChat;
                                                    boolean z7 = chatEditTypeActivity4.isSaveRestricted;
                                                    chat3.noforwards = z7;
                                                    messagesController2.toggleChatNoForwards(j3, z7);
                                                    chatEditTypeActivity4.processDone$6();
                                                }
                                                break;
                                        }
                                    }
                                });
                                z4 = false;
                            }
                        }
                        if (chatEditTypeActivity.currentChat.join_to_send != chatEditTypeActivity.joinContainer.isJoinToSend) {
                            MessagesController messagesController2 = chatEditTypeActivity.getMessagesController();
                            long j2 = chatEditTypeActivity.chatId;
                            TLRPC.Chat chat3 = chatEditTypeActivity.currentChat;
                            boolean z7 = chatEditTypeActivity.joinContainer.isJoinToSend;
                            chat3.join_to_send = z7;
                            messagesController2.toggleChatJoinToSend(j2, z7, null, null);
                        }
                        if (chatEditTypeActivity.currentChat.join_request != chatEditTypeActivity.joinContainer.isJoinRequest || chatEditTypeActivity.applyToAllInviteLinks) {
                            MessagesController messagesController3 = chatEditTypeActivity.getMessagesController();
                            long j3 = chatEditTypeActivity.chatId;
                            TLRPC.Chat chat4 = chatEditTypeActivity.currentChat;
                            boolean z8 = chatEditTypeActivity.joinContainer.isJoinRequest;
                            chat4.join_request = z8;
                            messagesController3.toggleChatJoinRequest(j3, 0L, z8, chatEditTypeActivity.applyToAllInviteLinks, false, null, null);
                        }
                    } else {
                        z4 = false;
                    }
                }
                if (z4) {
                    chatEditTypeActivity.finishFragment();
                }
            }
        }
    }

    public final void showPremiumIncreaseLimitDialog$1() {
        if (getParentActivity() == null) {
            return;
        }
        LimitReachedBottomSheet limitReachedBottomSheet = new LimitReachedBottomSheet(2, this.currentAccount, getParentActivity(), this, null);
        limitReachedBottomSheet.parentIsChannel = this.isChannel;
        limitReachedBottomSheet.onSuccessRunnable = new ChatEditTypeActivity$$ExternalSyntheticLambda1(this, 1);
        showDialog(limitReachedBottomSheet);
    }

    public final void updateDoneProgress$1(boolean z) {
        if (!z) {
            AndroidUtilities.cancelRunOnUIThread(this.enableDoneLoading);
        }
        if (this.doneButtonDrawable != null) {
            ValueAnimator valueAnimator = this.doneButtonDrawableAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.doneButtonDrawable.progress, z ? 1.0f : 0.0f);
            this.doneButtonDrawableAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new BotButton$$ExternalSyntheticLambda0(this, 17));
            this.doneButtonDrawableAnimator.setDuration((long) (Math.abs(this.doneButtonDrawable.progress - (z ? 1.0f : 0.0f)) * 200.0f));
            this.doneButtonDrawableAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
            this.doneButtonDrawableAnimator.start();
        }
    }

    public final void updatePrivatePublic$1() {
        if (this.sectionCell2 == null) {
            return;
        }
        int i = 8;
        if (this.isPrivate || this.canCreatePublic || !getUserConfig().isPremium()) {
            TextInfoPrivacyCell textInfoPrivacyCell = this.typeInfoCell;
            int i2 = Theme.key_windowBackgroundWhiteGrayText4;
            textInfoPrivacyCell.setTag(Integer.valueOf(i2));
            this.typeInfoCell.setTextColor(Theme.getColor(null, i2, false));
            if (this.isForcePublic) {
                this.sectionCell2.setVisibility(8);
            } else {
                this.sectionCell2.setVisibility(0);
            }
            this.adminedInfoCell.setVisibility(8);
            this.adminnedChannelsLayout.setVisibility(8);
            this.linkContainer.setVisibility(0);
            this.loadingAdminedCell.setVisibility(8);
            if (this.isChannel) {
                this.typeInfoCell.setText(LocaleController.getString(this.isPrivate ? R.string.ChannelPrivateLinkHelp : R.string.ChannelUsernameHelp));
                this.headerCell.setText(LocaleController.getString(this.isPrivate ? R.string.ChannelInviteLinkTitle : R.string.ChannelLinkTitle));
            } else {
                this.typeInfoCell.setText(LocaleController.getString(this.isPrivate ? R.string.MegaPrivateLinkHelp : R.string.MegaUsernameHelp));
                this.headerCell.setText(LocaleController.getString(this.isPrivate ? R.string.ChannelInviteLinkTitle : R.string.ChannelLinkTitle));
            }
            this.publicContainer.setVisibility(this.isPrivate ? 8 : 0);
            this.privateContainer.setVisibility(this.isPrivate ? 0 : 8);
            this.saveContainer.setVisibility(0);
            this.manageLinksTextView.setVisibility(0);
            this.manageLinksInfoCell.setVisibility(0);
            this.linkContainer.setPadding(0, 0, 0, this.isPrivate ? 0 : AndroidUtilities.dp(7.0f));
            LinkActionView linkActionView = this.permanentLinkView;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.invite;
            linkActionView.setLink(tL_chatInviteExported != null ? tL_chatInviteExported.link : null);
            this.permanentLinkView.loadUsers(this.invite, this.chatId);
            AnonymousClass6 anonymousClass6 = this.checkTextView;
            anonymousClass6.setVisibility((this.isPrivate || anonymousClass6.textView.length() == 0) ? 8 : 0);
            TLRPC.ChatFull chatFull = getMessagesController().getChatFull(this.chatId);
            this.manageLinksInfoCell.setText(LocaleController.getString((chatFull != null && chatFull.paid_media_allowed && ChatObject.isChannelAndNotMegaGroup(getMessagesController().getChat(Long.valueOf(this.chatId)))) ? R.string.ManageLinksInfoHelpPaid : R.string.ManageLinksInfoHelp));
        } else {
            this.typeInfoCell.setText(LocaleController.getString(R.string.ChangePublicLimitReached));
            TextInfoPrivacyCell textInfoPrivacyCell2 = this.typeInfoCell;
            int i3 = Theme.key_text_RedRegular;
            textInfoPrivacyCell2.setTag(Integer.valueOf(i3));
            this.typeInfoCell.setTextColor(Theme.getColor(null, i3, false));
            this.linkContainer.setVisibility(8);
            this.checkTextView.setVisibility(8);
            this.sectionCell2.setVisibility(8);
            this.adminedInfoCell.setVisibility(0);
            if (this.loadingAdminedChannels) {
                this.loadingAdminedCell.setVisibility(0);
                this.adminnedChannelsLayout.setVisibility(8);
            } else {
                this.loadingAdminedCell.setVisibility(8);
                this.adminnedChannelsLayout.setVisibility(0);
            }
        }
        this.radioButtonCell1.radioButton.setChecked(!this.isPrivate, true);
        this.radioButtonCell2.radioButton.setChecked(this.isPrivate, true);
        this.usernameTextView.clearFocus();
        AnonymousClass7 anonymousClass7 = this.joinContainer;
        if (anonymousClass7 != null) {
            anonymousClass7.setVisibility((!this.isChannel || this.isPrivate) ? 0 : 8);
            AnonymousClass7 anonymousClass8 = this.joinContainer;
            TLRPC.ChatFull chatFull2 = this.info;
            boolean z = (chatFull2 == null || chatFull2.linked_chat_id == 0 || this.isChannel) ? false : true;
            anonymousClass8.joinHeaderCell.setVisibility(z ? 0 : 8);
            anonymousClass8.joinToSendCell.setVisibility(z ? 0 : 8);
            if (!z) {
                anonymousClass8.isJoinToSend = true;
                anonymousClass8.joinRequestCell.setVisibility(0);
                anonymousClass8.updateToggleValue(1.0f);
            }
            anonymousClass8.requestLayout();
        }
        UsernamesListView usernamesListView = this.usernamesListView;
        if (usernamesListView != null) {
            if (!this.isPrivate && !this.usernames.isEmpty()) {
                i = 0;
            }
            usernamesListView.setVisibility(i);
        }
        checkDoneButton();
    }
}
