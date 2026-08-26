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
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticOutline0;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.AdminedChannelCell;
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
import org.telegram.ui.Components.InviteLinkBottomSheet;
import org.telegram.ui.Components.JoinToSendSettingsView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkActionView;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SectionsScrollView;
import org.telegram.ui.Components.TypefaceSpan;

public class ChatEditTypeActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    private static final int done_button = 1;
    private boolean activatingEditableLink;
    private ArrayList<AdminedChannelCell> adminedChannelCells;
    private ShadowSectionCell adminedInfoCell;
    private LinearLayout adminnedChannelsLayout;
    private boolean applyToAllInviteLinks;
    private boolean canCreatePublic;
    private long chatId;
    private int checkReqId;
    private Runnable checkRunnable;
    private TextInfoPrivacyCell checkTextView;
    private TLRPC.Chat currentChat;
    private boolean deactivatingLinks;
    private ActionBarMenuItem doneButton;
    private CrossfadeDrawable doneButtonDrawable;
    private ValueAnimator doneButtonDrawableAnimator;
    private EditTextBoldCursor editText;
    private ChangeUsernameActivity.UsernameCell editableUsernameCell;
    private Boolean editableUsernameUpdated;
    private Boolean editableUsernameWasActive;
    private ArrayList<TLRPC.TL_username> editableUsernames;
    private Runnable enableDoneLoading;
    private HeaderCell headerCell;
    private HeaderCell headerCell2;
    private boolean ignoreScroll;
    private boolean ignoreTextChanges;
    private TLRPC.ChatFull info;
    private TextInfoPrivacyCell infoCell;
    private TLRPC.TL_chatInviteExported invite;
    private InviteLinkBottomSheet inviteLinkBottomSheet;
    private boolean isChannel;
    private boolean isForcePublic;
    private boolean isPrivate;
    private boolean isSaveRestricted;
    private JoinToSendSettingsView joinContainer;
    private String lastCheckName;
    private boolean lastNameAvailable;
    private LinearLayout linearLayout;
    private LinearLayout linearLayoutTypeContainer;
    private LinearLayout linkContainer;
    private LoadingCell loadingAdminedCell;
    private boolean loadingAdminedChannels;
    private boolean loadingInvite;
    private ArrayList<String> loadingUsernames;
    private TextInfoPrivacyCell manageLinksInfoCell;
    private TextCell manageLinksTextView;
    private LinkActionView permanentLinkView;
    private LinearLayout privateContainer;
    private LinearLayout publicContainer;
    private RadioButtonCell radioButtonCell1;
    private RadioButtonCell radioButtonCell2;
    private LinearLayout saveContainer;
    private HeaderCell saveHeaderCell;
    private TextCheckCell saveRestrictCell;
    private TextInfoPrivacyCell saveRestrictInfoCell;
    private ShadowSectionCell sectionCell2;
    private TextSettingsCell textCell;
    private TextSettingsCell textCell2;
    private TextInfoPrivacyCell typeInfoCell;
    private EditTextBoldCursor usernameTextView;
    private ArrayList<TLRPC.TL_username> usernames;
    private UsernamesListView usernamesListView;
    HashMap<Long, TLRPC.User> usersMap;

    public class AnonymousClass6 extends TextInfoPrivacyCell {
        int prevHeight;
        ValueAnimator translateAnimator;

        public AnonymousClass6(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
            super(context, i, resourcesProvider);
            this.prevHeight = -1;
        }

        public static void lambda$onLayout$0(ArrayList arrayList, float f, ValueAnimator valueAnimator) {
            float fFloatValue = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
            for (int i = 0; i < arrayList.size(); i++) {
                View view = (View) arrayList.get(i);
                if (view != null) {
                    view.setTranslationY(f * fFloatValue);
                }
            }
        }

        @Override
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            int i5 = 1;
            super.onLayout(z, i, i2, i3, i4);
            if (this.prevHeight != -1 && ChatEditTypeActivity.this.linearLayout != null) {
                ArrayList arrayList = new ArrayList();
                boolean z2 = false;
                for (int i6 = 0; i6 < ChatEditTypeActivity.this.linearLayout.getChildCount(); i6++) {
                    View childAt = ChatEditTypeActivity.this.linearLayout.getChildAt(i6);
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
                valueAnimatorOfFloat.addUpdateListener(new ChatActivity$$ExternalSyntheticLambda150(arrayList, height, i5));
                this.translateAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                this.translateAnimator.setDuration(350L);
                this.translateAnimator.start();
            }
            this.prevHeight = getHeight();
        }

        @Override
        public void setText(CharSequence charSequence) {
            if (charSequence != 0) {
                charSequence = AndroidUtilities.replaceTags(charSequence.toString());
                int iIndexOf = charSequence.toString().indexOf(10);
                if (iIndexOf >= 0) {
                    charSequence.replace(iIndexOf, iIndexOf + 1, " ");
                    charSequence.setSpan(new ForegroundColorSpan(ChatEditTypeActivity.this.getThemedColor(Theme.key_text_RedRegular)), 0, iIndexOf, 33);
                }
                TypefaceSpan[] typefaceSpanArr = (TypefaceSpan[]) charSequence.getSpans(0, charSequence.length(), TypefaceSpan.class);
                final String string = (ChatEditTypeActivity.this.usernameTextView == null || ChatEditTypeActivity.this.usernameTextView.getText() == null) ? "" : ChatEditTypeActivity.this.usernameTextView.getText().toString();
                for (int i = 0; i < typefaceSpanArr.length; i++) {
                    charSequence.setSpan(new ClickableSpan() {
                        @Override
                        public void onClick(View view) {
                            Browser.openUrl(AnonymousClass6.this.getContext(), "https://fragment.com/username/" + string);
                        }

                        @Override
                        public void updateDrawState(TextPaint textPaint) {
                            super.updateDrawState(textPaint);
                            textPaint.setUnderlineText(false);
                        }
                    }, charSequence.getSpanStart(typefaceSpanArr[i]), charSequence.getSpanEnd(typefaceSpanArr[i]), 33);
                    charSequence.removeSpan(typefaceSpanArr[i]);
                }
            }
            super.setText(charSequence);
        }
    }

    public class AnonymousClass7 extends JoinToSendSettingsView {
        final Context val$context;

        public AnonymousClass7(Context context, TLRPC.Chat chat, Context context2) {
            super(context, chat);
            this.val$context = context2;
        }

        public void lambda$onJoinRequestToggle$0(boolean z, AlertDialog alertDialog, int i) {
            lambda$new$3(z);
            ChatEditTypeActivity.this.applyToAllInviteLinks = true;
        }

        public void lambda$onJoinRequestToggle$1(boolean z, AlertDialog alertDialog, int i) {
            lambda$new$3(z);
            ChatEditTypeActivity.this.applyToAllInviteLinks = false;
        }

        @Override
        public boolean onJoinRequestToggle(final boolean z, Runnable runnable) {
            int i;
            String str;
            if (!ChatEditTypeActivity.this.isPrivate || ChatEditTypeActivity.this.info == null || (i = ChatEditTypeActivity.this.info.invitesCount) == 0) {
                return true;
            }
            if (ChatEditTypeActivity.this.isChannel) {
                str = z ? "ApproveNewMembersEnableForLinksChannel" : "ApproveNewMembersDisableForLinksChannel";
            } else {
                str = z ? "ApproveNewMembersEnableForLinks" : "ApproveNewMembersDisableForLinks";
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(this.val$context, 0, ((BaseFragment) ChatEditTypeActivity.this).resourceProvider);
            builder.setTitle(LocaleController.getString(R.string.ApproveNewMembersApplyToLinksTitle));
            builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatPluralString(str, i, new Object[0])));
            final int i2 = 0;
            builder.setPositiveButton(LocaleController.getString(R.string.ApproveNewMembersApplyToLinksApply), new AlertDialog.OnButtonClickListener(this) {
                public final ChatEditTypeActivity.AnonymousClass7 f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(AlertDialog alertDialog, int i3) {
                    switch (i2) {
                        case 0:
                            this.f$0.lambda$onJoinRequestToggle$0(z, alertDialog, i3);
                            break;
                        default:
                            this.f$0.lambda$onJoinRequestToggle$1(z, alertDialog, i3);
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
                public final void onClick(AlertDialog alertDialog, int i4) {
                    switch (i3) {
                        case 0:
                            this.f$0.lambda$onJoinRequestToggle$0(z, alertDialog, i4);
                            break;
                        default:
                            this.f$0.lambda$onJoinRequestToggle$1(z, alertDialog, i4);
                            break;
                    }
                }
            });
            ChatEditTypeActivity.this.showDialog(builder.create());
            return false;
        }
    }

    public class UsernamesListView extends RecyclerListView {
        private final int VIEW_TYPE_HEADER;
        private final int VIEW_TYPE_HELP;
        private final int VIEW_TYPE_USERNAME;
        private Adapter adapter;
        private Paint backgroundPaint;
        private ItemTouchHelper itemTouchHelper;
        private LinearLayoutManager layoutManager;
        private boolean needReorder;

        public class AnonymousClass1 implements RecyclerListView.OnItemClickListener {
            final ChatEditTypeActivity val$this$0;

            public AnonymousClass1(ChatEditTypeActivity chatEditTypeActivity) {
                this.val$this$0 = chatEditTypeActivity;
            }

            public void lambda$onItemClick$0(TLRPC.TL_username tL_username, boolean z, AlertDialog alertDialog, int i) {
                UsernamesListView.this.toggleUsername(tL_username, z, true);
                ChatEditTypeActivity.this.checkDoneButton();
            }

            public void lambda$onItemClick$1(TLRPC.TL_username tL_username, boolean z) {
                new AlertDialog.Builder(UsernamesListView.this.getContext(), 0, ((RecyclerListView) UsernamesListView.this).resourcesProvider).setTitle(LocaleController.getString(R.string.UsernameActivateErrorTitle)).setMessage(LocaleController.getString(R.string.UsernameActivateErrorMessage)).setPositiveButton(LocaleController.getString(R.string.OK), new LoginActivity$$ExternalSyntheticLambda26(this, tL_username, z, 2)).show();
            }

            public void lambda$onItemClick$2(TLRPC.TL_channels_toggleUsername tL_channels_toggleUsername, TLObject tLObject, TLRPC.TL_username tL_username, boolean z, TLRPC.TL_error tL_error) {
                ChatEditTypeActivity.this.loadingUsernames.remove(tL_channels_toggleUsername.username);
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    UsernamesListView.this.toggleUsername(tL_username, true ^ z);
                } else if (tL_error == null || !"USERNAMES_ACTIVE_TOO_MUCH".equals(tL_error.text)) {
                    UsernamesListView.this.toggleUsername(tL_username, z, true);
                    ChatEditTypeActivity.this.checkDoneButton();
                } else {
                    AndroidUtilities.runOnUIThread(new PhotoViewer$$ExternalSyntheticLambda28(this, tL_username, z, 2));
                }
                ChatEditTypeActivity.this.getMessagesController().updateUsernameActiveness(ChatEditTypeActivity.this.currentChat, tL_username.username, tL_username.active);
            }

            public void lambda$onItemClick$3(TLRPC.TL_channels_toggleUsername tL_channels_toggleUsername, TLRPC.TL_username tL_username, boolean z, TLObject tLObject, TLRPC.TL_error tL_error) {
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda242(this, tL_channels_toggleUsername, tLObject, tL_username, z, tL_error, 1));
            }

            public void lambda$onItemClick$4(TLRPC.TL_username tL_username, View view, AlertDialog alertDialog, int i) {
                AnonymousClass1 anonymousClass1;
                if (tL_username.editable) {
                    if (ChatEditTypeActivity.this.editableUsernameWasActive == null) {
                        ChatEditTypeActivity.this.editableUsernameWasActive = Boolean.valueOf(tL_username.active);
                    }
                    ChatEditTypeActivity chatEditTypeActivity = ChatEditTypeActivity.this;
                    boolean z = !tL_username.active;
                    tL_username.active = z;
                    chatEditTypeActivity.editableUsernameUpdated = Boolean.valueOf(z);
                    anonymousClass1 = this;
                } else {
                    TLRPC.TL_channels_toggleUsername tL_channels_toggleUsername = new TLRPC.TL_channels_toggleUsername();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    tL_inputChannel.channel_id = ChatEditTypeActivity.this.currentChat.id;
                    tL_inputChannel.access_hash = ChatEditTypeActivity.this.currentChat.access_hash;
                    tL_channels_toggleUsername.channel = tL_inputChannel;
                    tL_channels_toggleUsername.username = tL_username.username;
                    boolean z2 = tL_username.active;
                    tL_channels_toggleUsername.active = !z2;
                    anonymousClass1 = this;
                    ChatEditTypeActivity.this.getConnectionsManager().sendRequest(tL_channels_toggleUsername, new ChatActivity$$ExternalSyntheticLambda81(anonymousClass1, tL_channels_toggleUsername, tL_username, z2, 1));
                    ChatEditTypeActivity.this.loadingUsernames.add(tL_username.username);
                    ((ChangeUsernameActivity.UsernameCell) view).setLoading(true);
                }
                ChatEditTypeActivity.this.checkDoneButton();
            }

            @Override
            public void onItemClick(View view, int i) {
                TLRPC.TL_username tL_username;
                if (!(view instanceof ChangeUsernameActivity.UsernameCell) || (tL_username = ((ChangeUsernameActivity.UsernameCell) view).currentUsername) == null) {
                    return;
                }
                if (!tL_username.editable) {
                    new AlertDialog.Builder(UsernamesListView.this.getContext(), 0, ChatEditTypeActivity.this.getResourceProvider()).setTitle(LocaleController.getString(tL_username.active ? R.string.UsernameDeactivateLink : R.string.UsernameActivateLink)).setMessage(LocaleController.getString(tL_username.active ? R.string.UsernameDeactivateLinkChannelMessage : R.string.UsernameActivateLinkChannelMessage)).setPositiveButton(LocaleController.getString(tL_username.active ? R.string.Hide : R.string.Show), new WearAuthSheet$$ExternalSyntheticLambda5(this, tL_username, (ChangeUsernameActivity.UsernameCell) view, 5)).setNegativeButton(LocaleController.getString(R.string.Cancel), new ChatActivity$$ExternalSyntheticLambda49(3)).show();
                    return;
                }
                ChatEditTypeActivity chatEditTypeActivity = ChatEditTypeActivity.this;
                View view2 = chatEditTypeActivity.fragmentView;
                if (view2 instanceof ScrollView) {
                    ((ScrollView) view2).smoothScrollTo(0, chatEditTypeActivity.linkContainer.getTop() - AndroidUtilities.dp(128.0f));
                }
                ChatEditTypeActivity.this.usernameTextView.requestFocus();
                AndroidUtilities.showKeyboard(ChatEditTypeActivity.this.usernameTextView);
            }
        }

        public class Adapter extends RecyclerListView.SelectionAdapter {
            private Adapter() {
            }

            private void swapListElements(List<TLRPC.TL_username> list, int i, int i2) {
                TLRPC.TL_username tL_username = list.get(i);
                list.set(i, list.get(i2));
                list.set(i2, tL_username);
            }

            @Override
            public int getItemCount() {
                return ChatEditTypeActivity.this.usernames.size() + 2;
            }

            @Override
            public int getItemViewType(int i) {
                if (i == 0) {
                    return 0;
                }
                return i <= ChatEditTypeActivity.this.usernames.size() ? 1 : 2;
            }

            @Override
            public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
                return viewHolder.getItemViewType() == 1;
            }

            public void moveElement(int i, int i2) {
                int i3 = i - 1;
                int i4 = i2 - 1;
                if (i3 >= ChatEditTypeActivity.this.usernames.size() || i4 >= ChatEditTypeActivity.this.usernames.size()) {
                    return;
                }
                ChatEditTypeActivity.this.usernames.add(i4, (TLRPC.TL_username) ChatEditTypeActivity.this.usernames.remove(i3));
                notifyItemMoved(i, i2);
                int i5 = 0;
                while (i5 < ChatEditTypeActivity.this.usernames.size()) {
                    i5++;
                    lambda$onBindViewHolder$31(i5);
                }
            }

            @Override
            public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                int itemViewType = viewHolder.getItemViewType();
                if (itemViewType == 0) {
                    ((HeaderCell) viewHolder.itemView).setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite, ((RecyclerListView) UsernamesListView.this).resourcesProvider));
                    ((HeaderCell) viewHolder.itemView).setText(LocaleController.getString(R.string.UsernamesChannelHeader));
                    return;
                }
                if (itemViewType != 1) {
                    if (itemViewType != 2) {
                        return;
                    }
                    ((TextInfoPrivacyCell) viewHolder.itemView).setText(LocaleController.getString(R.string.UsernamesChannelHelp));
                    ((TextInfoPrivacyCell) viewHolder.itemView).setBackground(Theme.getThemedDrawableByKey(UsernamesListView.this.getContext(), R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                    return;
                }
                TLRPC.TL_username tL_username = (TLRPC.TL_username) ChatEditTypeActivity.this.usernames.get(i - 1);
                if (((ChangeUsernameActivity.UsernameCell) viewHolder.itemView).editable) {
                    ChatEditTypeActivity.this.editableUsernameCell = null;
                }
                ((ChangeUsernameActivity.UsernameCell) viewHolder.itemView).set(tL_username, i < ChatEditTypeActivity.this.usernames.size(), false);
                if (tL_username == null || !tL_username.editable) {
                    return;
                }
                ChatEditTypeActivity.this.editableUsernameCell = (ChangeUsernameActivity.UsernameCell) viewHolder.itemView;
            }

            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                if (i == 0) {
                    return new RecyclerListView.Holder(new HeaderCell(UsernamesListView.this.getContext(), ((RecyclerListView) UsernamesListView.this).resourcesProvider));
                }
                if (i == 1) {
                    return new RecyclerListView.Holder(new ChangeUsernameActivity.UsernameCell(UsernamesListView.this.getContext(), ((RecyclerListView) UsernamesListView.this).resourcesProvider) {
                        @Override
                        public String getUsernameEditable() {
                            if (ChatEditTypeActivity.this.usernameTextView == null) {
                                return null;
                            }
                            return ChatEditTypeActivity.this.usernameTextView.getText().toString();
                        }
                    });
                }
                if (i != 2) {
                    return null;
                }
                return new RecyclerListView.Holder(new TextInfoPrivacyCell(UsernamesListView.this.getContext(), 12, ((RecyclerListView) UsernamesListView.this).resourcesProvider));
            }

            public void swapElements(int i, int i2) {
                int i3 = i - 1;
                int i4 = i2 - 1;
                if (i3 >= ChatEditTypeActivity.this.usernames.size() || i4 >= ChatEditTypeActivity.this.usernames.size()) {
                    return;
                }
                if (i != i2) {
                    UsernamesListView.this.needReorder = true;
                }
                swapListElements(ChatEditTypeActivity.this.usernames, i3, i4);
                notifyItemMoved(i, i2);
                int size = ChatEditTypeActivity.this.usernames.size();
                if (i == size || i2 == size) {
                    notifyItemChanged(i, 3);
                    notifyItemChanged(i2, 3);
                }
            }
        }

        public class TouchHelperCallback extends ItemTouchHelper.Callback {
            public TouchHelperCallback() {
            }

            @Override
            public void clearView(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
                super.clearView(recyclerView, viewHolder);
                viewHolder.itemView.setPressed(false);
            }

            @Override
            public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
                return (viewHolder.getItemViewType() == 1 && ((ChangeUsernameActivity.UsernameCell) viewHolder.itemView).active) ? ItemTouchHelper.Callback.makeMovementFlags(3, 0) : ItemTouchHelper.Callback.makeMovementFlags(0, 0);
            }

            @Override
            public boolean isLongPressDragEnabled() {
                return true;
            }

            @Override
            public void onChildDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f, float f2, int i, boolean z) {
                super.onChildDraw(canvas, recyclerView, viewHolder, f, f2, i, z);
            }

            @Override
            public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
                if (viewHolder.getItemViewType() != viewHolder2.getItemViewType()) {
                    return false;
                }
                View view = viewHolder2.itemView;
                if ((view instanceof ChangeUsernameActivity.UsernameCell) && !((ChangeUsernameActivity.UsernameCell) view).active) {
                    return false;
                }
                UsernamesListView.this.adapter.swapElements(viewHolder.getAdapterPosition(), viewHolder2.getAdapterPosition());
                return true;
            }

            @Override
            public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i) {
                if (i == 0) {
                    ChatEditTypeActivity.this.ignoreScroll = false;
                    UsernamesListView.this.sendReorder();
                } else {
                    ChatEditTypeActivity.this.ignoreScroll = true;
                    UsernamesListView.this.cancelClickRunnables(false);
                    viewHolder.itemView.setPressed(true);
                }
                super.onSelectedChanged(viewHolder, i);
            }

            @Override
            public void onSwiped(RecyclerView.ViewHolder viewHolder, int i) {
            }
        }

        public UsernamesListView(Context context) {
            super(context);
            this.VIEW_TYPE_HEADER = 0;
            this.VIEW_TYPE_USERNAME = 1;
            this.VIEW_TYPE_HELP = 2;
            this.needReorder = false;
            this.backgroundPaint = new Paint(1);
            Adapter adapter = new Adapter();
            this.adapter = adapter;
            setAdapter(adapter);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
            this.layoutManager = linearLayoutManager;
            setLayoutManager(linearLayoutManager);
            setOnItemClickListener(new AnonymousClass1(ChatEditTypeActivity.this));
            ItemTouchHelper itemTouchHelper = new ItemTouchHelper(new TouchHelperCallback());
            this.itemTouchHelper = itemTouchHelper;
            itemTouchHelper.attachToRecyclerView(this);
        }

        public static void lambda$sendReorder$0(TLObject tLObject, TLRPC.TL_error tL_error) {
            boolean z = tLObject instanceof TLRPC.TL_boolTrue;
        }

        public void sendReorder() {
            if (!this.needReorder || ChatEditTypeActivity.this.currentChat == null) {
                return;
            }
            this.needReorder = false;
            TLRPC.TL_channels_reorderUsernames tL_channels_reorderUsernames = new TLRPC.TL_channels_reorderUsernames();
            TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
            tL_inputChannel.channel_id = ChatEditTypeActivity.this.currentChat.id;
            tL_inputChannel.access_hash = ChatEditTypeActivity.this.currentChat.access_hash;
            tL_channels_reorderUsernames.channel = tL_inputChannel;
            ArrayList<String> arrayList = new ArrayList<>();
            for (int i = 0; i < ChatEditTypeActivity.this.editableUsernames.size(); i++) {
                if (((TLRPC.TL_username) ChatEditTypeActivity.this.editableUsernames.get(i)).active) {
                    arrayList.add(((TLRPC.TL_username) ChatEditTypeActivity.this.editableUsernames.get(i)).username);
                }
            }
            for (int i2 = 0; i2 < ChatEditTypeActivity.this.usernames.size(); i2++) {
                if (((TLRPC.TL_username) ChatEditTypeActivity.this.usernames.get(i2)).active) {
                    arrayList.add(((TLRPC.TL_username) ChatEditTypeActivity.this.usernames.get(i2)).username);
                }
            }
            tL_channels_reorderUsernames.order = arrayList;
            ChatEditTypeActivity.this.getConnectionsManager().sendRequest(tL_channels_reorderUsernames, new PassportActivity$$ExternalSyntheticLambda3(1));
            updateChat();
        }

        private void updateChat() {
            ChatEditTypeActivity.this.currentChat.usernames.clear();
            ChatEditTypeActivity.this.currentChat.usernames.addAll(ChatEditTypeActivity.this.editableUsernames);
            ChatEditTypeActivity.this.currentChat.usernames.addAll(ChatEditTypeActivity.this.usernames);
            ChatEditTypeActivity.this.getMessagesController().putChat(ChatEditTypeActivity.this.currentChat, true);
        }

        @Override
        public void dispatchDraw(Canvas canvas) {
            Canvas canvas2;
            int childAdapterPosition;
            int size = ChatEditTypeActivity.this.usernames.size();
            int iMin = Integer.MAX_VALUE;
            int iMax = Integer.MIN_VALUE;
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (childAt != null && (childAdapterPosition = getChildAdapterPosition(childAt)) >= 1 && childAdapterPosition <= size) {
                    iMin = Math.min(childAt.getTop(), iMin);
                    iMax = Math.max(childAt.getBottom(), iMax);
                }
            }
            if (iMin < iMax) {
                this.backgroundPaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhite, this.resourcesProvider));
                canvas2 = canvas;
                canvas2.drawRect(0.0f, iMin, getWidth(), iMax, this.backgroundPaint);
            } else {
                canvas2 = canvas;
            }
            super.dispatchDraw(canvas2);
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(9999999, Integer.MIN_VALUE));
        }

        public void toggleUsername(TLRPC.TL_username tL_username, boolean z) {
            toggleUsername(tL_username, z, false);
        }

        public void toggleUsername(TLRPC.TL_username tL_username, boolean z, boolean z2) {
            for (int i = 0; i < ChatEditTypeActivity.this.usernames.size(); i++) {
                if (ChatEditTypeActivity.this.usernames.get(i) == tL_username) {
                    toggleUsername(i + 1, z, z2);
                    return;
                }
            }
        }

        public void toggleUsername(int i, boolean z) {
            toggleUsername(i, z, false);
        }

        public void toggleUsername(int i, boolean z, boolean z2) {
            TLRPC.TL_username tL_username;
            int iMin;
            int i2 = i - 1;
            if (i2 < 0 || i2 >= ChatEditTypeActivity.this.usernames.size() || (tL_username = (TLRPC.TL_username) ChatEditTypeActivity.this.usernames.get(i2)) == null) {
                return;
            }
            int i3 = -1;
            if (tL_username.active != z) {
                tL_username.active = z;
                if (z) {
                    int i4 = 0;
                    while (true) {
                        if (i4 >= ChatEditTypeActivity.this.usernames.size()) {
                            i4 = -1;
                            break;
                        } else if (!((TLRPC.TL_username) ChatEditTypeActivity.this.usernames.get(i4)).active) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                    if (i4 >= 0) {
                        iMin = Math.max(0, i4 - 1);
                        i3 = iMin + 1;
                    }
                } else {
                    int i5 = -1;
                    for (int i6 = 0; i6 < ChatEditTypeActivity.this.usernames.size(); i6++) {
                        if (((TLRPC.TL_username) ChatEditTypeActivity.this.usernames.get(i6)).active) {
                            i5 = i6;
                        }
                    }
                    if (i5 >= 0) {
                        iMin = Math.min(ChatEditTypeActivity.this.usernames.size() - 1, i5 + 1);
                        i3 = iMin + 1;
                    }
                }
            }
            for (int i7 = 0; i7 < getChildCount(); i7++) {
                View childAt = getChildAt(i7);
                if (getChildAdapterPosition(childAt) == i) {
                    if (z2) {
                        AndroidUtilities.shakeView(childAt);
                    }
                    if (!(childAt instanceof ChangeUsernameActivity.UsernameCell)) {
                        break;
                    }
                    ChangeUsernameActivity.UsernameCell usernameCell = (ChangeUsernameActivity.UsernameCell) childAt;
                    usernameCell.setLoading(ChatEditTypeActivity.this.loadingUsernames.contains(tL_username.username));
                    usernameCell.update();
                    break;
                }
            }
            if (i3 < 0 || i == i3) {
                return;
            }
            this.adapter.moveElement(i, i3);
        }
    }

    public ChatEditTypeActivity(long j, boolean z) {
        super(null);
        this.editableUsernames = new ArrayList<>();
        this.usernames = new ArrayList<>();
        this.loadingUsernames = new ArrayList<>();
        this.canCreatePublic = true;
        this.adminedChannelCells = new ArrayList<>();
        this.usersMap = new HashMap<>();
        this.enableDoneLoading = new ChatEditTypeActivity$$ExternalSyntheticLambda2(this, 1);
        this.deactivatingLinks = false;
        this.activatingEditableLink = false;
        this.chatId = j;
        this.isForcePublic = z;
    }

    public void checkDoneButton() {
        if (this.isPrivate || this.usernameTextView.length() > 0 || hasActiveLink()) {
            this.doneButton.setEnabled(true);
            this.doneButton.setAlpha(1.0f);
        } else {
            this.doneButton.setEnabled(false);
            this.doneButton.setAlpha(0.5f);
        }
    }

    public boolean checkUserName(String str) {
        if (str == null || str.length() <= 0) {
            this.checkTextView.setVisibility(8);
        } else {
            this.checkTextView.setVisibility(0);
        }
        Runnable runnable = this.checkRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
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
                return false;
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
                    return false;
                }
                if ((cCharAt < '0' || cCharAt > '9') && ((cCharAt < 'a' || cCharAt > 'z') && ((cCharAt < 'A' || cCharAt > 'Z') && cCharAt != '_'))) {
                    this.checkTextView.setText(LocaleController.getString(R.string.LinkInvalid));
                    this.checkTextView.setTextColorByKey(Theme.key_text_RedRegular);
                    return false;
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
            return false;
        }
        if (str.length() > 32) {
            this.checkTextView.setText(LocaleController.getString(R.string.LinkInvalidLong));
            this.checkTextView.setTextColorByKey(Theme.key_text_RedRegular);
            return false;
        }
        this.checkTextView.setText(LocaleController.getString(R.string.LinkChecking));
        this.checkTextView.setTextColorByKey(Theme.key_windowBackgroundWhiteGrayText8);
        this.lastCheckName = str;
        ChatActivity$$ExternalSyntheticLambda80 chatActivity$$ExternalSyntheticLambda80 = new ChatActivity$$ExternalSyntheticLambda80(19, this, str);
        this.checkRunnable = chatActivity$$ExternalSyntheticLambda80;
        AndroidUtilities.runOnUIThread(chatActivity$$ExternalSyntheticLambda80, 300L);
        return true;
    }

    public void generateLink(boolean z) {
        this.loadingInvite = true;
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
        tL_messages_exportChatInvite.peer = getMessagesController().getInputPeer(-this.chatId);
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new CallLogActivity$$ExternalSyntheticLambda31(this, z, 4)), this.classGuid);
    }

    public void lambda$checkUserName$23(String str, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_channels_checkUsername tL_channels_checkUsername) {
        this.checkReqId = 0;
        String str2 = this.lastCheckName;
        if (str2 == null || !str2.equals(str)) {
            return;
        }
        if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
            this.checkTextView.setText(LocaleController.formatString("LinkAvailable", R.string.LinkAvailable, str));
            this.checkTextView.setTextColorByKey(Theme.key_windowBackgroundWhiteGreenText);
            this.lastNameAvailable = true;
            return;
        }
        if (tL_error != null && "USERNAME_INVALID".equals(tL_error.text) && tL_channels_checkUsername.username.length() == 4) {
            this.checkTextView.setText(LocaleController.getString(R.string.UsernameInvalidShort));
            this.checkTextView.setTextColor(Theme.getColor(null, Theme.key_text_RedRegular, false));
        } else if (tL_error != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text)) {
            if (tL_channels_checkUsername.username.length() == 4) {
                this.checkTextView.setText(LocaleController.getString(R.string.UsernameInvalidShortPurchase));
            } else {
                this.checkTextView.setText(LocaleController.getString(R.string.UsernameInUsePurchase));
            }
            this.checkTextView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText8, false));
        } else if (tL_error == null || !"CHANNELS_ADMIN_PUBLIC_TOO_MUCH".equals(tL_error.text)) {
            this.checkTextView.setText(LocaleController.getString(R.string.LinkInUse));
            this.checkTextView.setTextColorByKey(Theme.key_text_RedRegular);
        } else {
            this.canCreatePublic = false;
            showPremiumIncreaseLimitDialog();
        }
        this.lastNameAvailable = false;
    }

    public void lambda$checkUserName$24(String str, TLRPC.TL_channels_checkUsername tL_channels_checkUsername, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda22((BaseFragment) this, str, tL_error, tLObject, (TLObject) tL_channels_checkUsername, 13));
    }

    public void lambda$checkUserName$25(String str) {
        TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
        tL_channels_checkUsername.username = str;
        tL_channels_checkUsername.channel = getMessagesController().getInputChannel(this.chatId);
        this.checkReqId = getConnectionsManager().sendRequest(tL_channels_checkUsername, new LinkManager$$ExternalSyntheticLambda0((Object) this, str, (Object) tL_channels_checkUsername, 14), 2);
    }

    public void lambda$createView$2(View view) {
        if (this.isPrivate) {
            return;
        }
        this.isPrivate = true;
        updatePrivatePublic();
    }

    public void lambda$createView$3(View view) {
        if (this.isPrivate) {
            if (!this.canCreatePublic) {
                showPremiumIncreaseLimitDialog();
            } else {
                this.isPrivate = false;
                updatePrivatePublic();
            }
        }
    }

    public void lambda$createView$4(View view) {
        ManageLinksActivity manageLinksActivity = new ManageLinksActivity(this.chatId, 0L, 0);
        manageLinksActivity.setInfo(this.info, this.invite);
        presentFragment(manageLinksActivity);
    }

    public void lambda$createView$5(View view) {
        boolean z = !this.isSaveRestricted;
        this.isSaveRestricted = z;
        ((TextCheckCell) view).setChecked(z);
    }

    public void lambda$generateLink$26(TLRPC.TL_error tL_error, TLObject tLObject, boolean z) {
        if (tL_error == null) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tLObject;
            this.invite = tL_chatInviteExported;
            TLRPC.ChatFull chatFull = this.info;
            if (chatFull != null) {
                chatFull.exported_invite = tL_chatInviteExported;
            }
            if (z) {
                if (getParentActivity() == null) {
                    return;
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
                builder.setMessage(LocaleController.getString(R.string.RevokeAlertNewLink));
                builder.setTitle(LocaleController.getString(R.string.RevokeLink));
                builder.setNegativeButton(LocaleController.getString(R.string.OK), null);
                showDialog(builder.create());
            }
        }
        this.loadingInvite = false;
        LinkActionView linkActionView = this.permanentLinkView;
        if (linkActionView != null) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = this.invite;
            linkActionView.setLink(tL_chatInviteExported2 != null ? tL_chatInviteExported2.link : null);
            this.permanentLinkView.loadUsers(this.invite, this.chatId);
        }
    }

    public void lambda$generateLink$27(boolean z, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new QrActivity$$ExternalSyntheticLambda3(this, tL_error, tLObject, z, 8));
    }

    public void lambda$getThemeDescriptions$28() {
        LinearLayout linearLayout = this.adminnedChannelsLayout;
        if (linearLayout != null) {
            int childCount = linearLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.adminnedChannelsLayout.getChildAt(i);
                if (childAt instanceof AdminedChannelCell) {
                    AdminedChannelCell adminedChannelCell = (AdminedChannelCell) childAt;
                    adminedChannelCell.avatarDrawable.setInfo(adminedChannelCell.currentAccount, adminedChannelCell.currentChannel);
                    adminedChannelCell.avatarImageView.invalidate();
                }
            }
        }
        this.permanentLinkView.updateColors();
        InviteLinkBottomSheet inviteLinkBottomSheet = this.inviteLinkBottomSheet;
        if (inviteLinkBottomSheet != null) {
            inviteLinkBottomSheet.updateColors();
        }
    }

    public void lambda$loadAdminedChannels$17() {
        this.canCreatePublic = true;
        if (this.usernameTextView.length() > 0) {
            checkUserName(this.usernameTextView.getText().toString());
        }
        updatePrivatePublic();
    }

    public void lambda$loadAdminedChannels$18(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            AndroidUtilities.runOnUIThread(new ChatEditTypeActivity$$ExternalSyntheticLambda2(this, 0));
        }
    }

    public void lambda$loadAdminedChannels$19(TLRPC.Chat chat, AlertDialog alertDialog, int i) {
        TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
        tL_channels_updateUsername.channel = MessagesController.getInputChannel(chat);
        tL_channels_updateUsername.username = "";
        getConnectionsManager().sendRequest(tL_channels_updateUsername, new ChatEditTypeActivity$$ExternalSyntheticLambda1(this, 0), 64);
    }

    public void lambda$loadAdminedChannels$20(View view) {
        int i = 1;
        TLRPC.Chat currentChannel = ((AdminedChannelCell) view.getParent()).getCurrentChannel();
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
        builder.setTitle(LocaleController.getString(R.string.AppName));
        if (this.isChannel) {
            SendMessagesHelper$$ExternalSyntheticOutline0.m("RevokeLinkAlertChannel", R.string.RevokeLinkAlertChannel, new Object[]{getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title}, builder);
        } else {
            SendMessagesHelper$$ExternalSyntheticOutline0.m("RevokeLinkAlert", R.string.RevokeLinkAlert, new Object[]{getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(currentChannel), currentChannel.title}, builder);
        }
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        builder.setPositiveButton(LocaleController.getString(R.string.RevokeButton), new DialogsActivity$$ExternalSyntheticLambda6(i, this, currentChannel));
        showDialog(builder.create());
    }

    public void lambda$loadAdminedChannels$21(TLObject tLObject) {
        this.loadingAdminedChannels = false;
        if (tLObject == null || getParentActivity() == null) {
            return;
        }
        for (int i = 0; i < this.adminedChannelCells.size(); i++) {
            this.linearLayout.removeView(this.adminedChannelCells.get(i));
        }
        this.adminedChannelCells.clear();
        TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
        for (int i2 = 0; i2 < tL_messages_chats.chats.size(); i2++) {
            AdminedChannelCell adminedChannelCell = new AdminedChannelCell(getParentActivity(), new ChatEditTypeActivity$$ExternalSyntheticLambda7(this, 0), false, 0);
            TLRPC.Chat chat = tL_messages_chats.chats.get(i2);
            boolean z = true;
            if (i2 != tL_messages_chats.chats.size() - 1) {
                z = false;
            }
            adminedChannelCell.setChannel(chat, z);
            this.adminedChannelCells.add(adminedChannelCell);
            this.adminnedChannelsLayout.addView(adminedChannelCell, LayoutHelper.createLinear(-1, 72));
        }
        updatePrivatePublic();
    }

    public void lambda$loadAdminedChannels$22(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new ChatEditTypeActivity$$ExternalSyntheticLambda10(this, tLObject, 1));
    }

    public void lambda$new$6() {
        updateDoneProgress(true);
    }

    public void lambda$onFragmentCreate$0(TLRPC.TL_error tL_error) {
        boolean z = tL_error == null || !tL_error.text.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH");
        this.canCreatePublic = z;
        if (z || !getUserConfig().isPremium()) {
            return;
        }
        loadAdminedChannels();
    }

    public void lambda$onFragmentCreate$1(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda80(18, this, tL_error));
    }

    public void lambda$showPremiumIncreaseLimitDialog$8() {
        this.canCreatePublic = true;
        updatePrivatePublic();
    }

    public void lambda$tryActivateEditableUsername$16(TLObject tLObject, TLRPC.TL_error tL_error) {
        this.activatingEditableLink = false;
        if (tL_error == null) {
            AndroidUtilities.runOnUIThread(new ChatEditTypeActivity$$ExternalSyntheticLambda2(this, 5));
        } else {
            updateDoneProgress(false);
        }
    }

    public void lambda$tryDeactivateAllLinks$14(TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            for (int i = 0; i < this.currentChat.usernames.size(); i++) {
                TLRPC.TL_username tL_username = this.currentChat.usernames.get(i);
                if (tL_username != null && tL_username.active && !tL_username.editable) {
                    tL_username.active = false;
                }
            }
        }
        this.deactivatingLinks = false;
        AndroidUtilities.runOnUIThread(new ChatEditTypeActivity$$ExternalSyntheticLambda2(this, 5));
    }

    public void lambda$tryDeactivateAllLinks$15(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new ChatEditTypeActivity$$ExternalSyntheticLambda10(this, tLObject, 0));
    }

    public void lambda$trySetRestrict$10(long j) {
        if (j != 0) {
            this.chatId = j;
            this.currentChat = getMessagesController().getChat(Long.valueOf(j));
            MessagesController messagesController = getMessagesController();
            long j2 = -this.chatId;
            TLRPC.Chat chat = this.currentChat;
            boolean z = this.isSaveRestricted;
            chat.noforwards = z;
            messagesController.toggleChatNoForwards(j2, z);
            processDone();
        }
    }

    public void lambda$trySetUsername$11(long j) {
        if (j != 0) {
            this.chatId = j;
            this.currentChat = getMessagesController().getChat(Long.valueOf(j));
            processDone();
        }
    }

    public void lambda$trySetUsername$12() {
        this.currentChat = getMessagesController().getChat(Long.valueOf(this.chatId));
        processDone();
    }

    public void lambda$trySetUsername$13() {
        updateDoneProgress(false);
    }

    public void lambda$tryUpdateJoinSettings$9(long j) {
        if (j != 0) {
            this.chatId = j;
            this.currentChat = getMessagesController().getChat(Long.valueOf(j));
            processDone();
        }
    }

    public void lambda$updateDoneProgress$7(ValueAnimator valueAnimator) {
        this.doneButtonDrawable.setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
        this.doneButtonDrawable.invalidateSelf();
    }

    private void loadAdminedChannels() {
        if (this.loadingAdminedChannels || this.adminnedChannelsLayout == null) {
            return;
        }
        this.loadingAdminedChannels = true;
        updatePrivatePublic();
        getConnectionsManager().sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new ChatEditTypeActivity$$ExternalSyntheticLambda1(this, 4));
    }

    public void processDone() {
        AndroidUtilities.runOnUIThread(this.enableDoneLoading, 200L);
        if (trySetUsername() && trySetRestrict() && tryUpdateJoinSettings()) {
            finishFragment();
        }
    }

    private void showPremiumIncreaseLimitDialog() {
        if (getParentActivity() == null) {
            return;
        }
        LimitReachedBottomSheet limitReachedBottomSheet = new LimitReachedBottomSheet(2, this, getParentActivity(), this.currentAccount, null);
        limitReachedBottomSheet.parentIsChannel = this.isChannel;
        limitReachedBottomSheet.onSuccessRunnable = new ChatEditTypeActivity$$ExternalSyntheticLambda2(this, 2);
        showDialog(limitReachedBottomSheet);
    }

    private boolean tryActivateEditableUsername() {
        Boolean bool;
        Boolean bool2;
        if (this.isPrivate || this.usernames == null || (bool = this.editableUsernameWasActive) == null || (bool2 = this.editableUsernameUpdated) == null || bool == bool2) {
            return true;
        }
        if (this.activatingEditableLink) {
            return false;
        }
        this.activatingEditableLink = true;
        String str = null;
        for (int i = 0; i < this.usernames.size(); i++) {
            if (this.usernames.get(i) != null && this.usernames.get(i).editable) {
                str = this.usernames.get(i).username;
            }
        }
        if (str == null) {
            this.activatingEditableLink = false;
            return true;
        }
        TLRPC.TL_channels_toggleUsername tL_channels_toggleUsername = new TLRPC.TL_channels_toggleUsername();
        tL_channels_toggleUsername.channel = MessagesController.getInputChannel(this.currentChat);
        tL_channels_toggleUsername.active = this.editableUsernameUpdated.booleanValue();
        tL_channels_toggleUsername.username = str;
        getConnectionsManager().sendRequest(tL_channels_toggleUsername, new ChatEditTypeActivity$$ExternalSyntheticLambda1(this, 2));
        return false;
    }

    private boolean tryDeactivateAllLinks() {
        ArrayList<TLRPC.TL_username> arrayList;
        if (!this.isPrivate || (arrayList = this.currentChat.usernames) == null || arrayList.isEmpty()) {
            return true;
        }
        if (this.deactivatingLinks) {
            return false;
        }
        this.deactivatingLinks = true;
        boolean z = false;
        for (int i = 0; i < this.currentChat.usernames.size(); i++) {
            TLRPC.TL_username tL_username = this.currentChat.usernames.get(i);
            if (tL_username != null && tL_username.active && !tL_username.editable) {
                z = true;
            }
        }
        if (z) {
            TLRPC.TL_channels_deactivateAllUsernames tL_channels_deactivateAllUsernames = new TLRPC.TL_channels_deactivateAllUsernames();
            tL_channels_deactivateAllUsernames.channel = MessagesController.getInputChannel(this.currentChat);
            getConnectionsManager().sendRequest(tL_channels_deactivateAllUsernames, new ChatEditTypeActivity$$ExternalSyntheticLambda1(this, 3));
        } else {
            this.deactivatingLinks = false;
        }
        return !z;
    }

    private boolean trySetRestrict() {
        TLRPC.Chat chat = this.currentChat;
        if (chat.noforwards == this.isSaveRestricted) {
            return true;
        }
        if (!ChatObject.isChannel(chat)) {
            updateDoneProgress(true);
            getMessagesController().convertToMegaGroup(getParentActivity(), this.chatId, this, new ChatEditTypeActivity$$ExternalSyntheticLambda12(this, 2));
            return false;
        }
        MessagesController messagesController = getMessagesController();
        long j = -this.chatId;
        TLRPC.Chat chat2 = this.currentChat;
        boolean z = this.isSaveRestricted;
        chat2.noforwards = z;
        messagesController.toggleChatNoForwards(j, z);
        return true;
    }

    private boolean trySetUsername() {
        if (getParentActivity() != null) {
            String publicUsername = ChatObject.getPublicUsername(this.currentChat, true);
            if (!this.isPrivate && (((publicUsername == null && this.usernameTextView.length() != 0) || (publicUsername != null && !publicUsername.equalsIgnoreCase(this.usernameTextView.getText().toString()))) && this.usernameTextView.length() != 0 && !this.lastNameAvailable)) {
                Vibrator vibrator = (Vibrator) getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                AndroidUtilities.shakeView(this.checkTextView);
                updateDoneProgress(false);
                return false;
            }
            if (publicUsername == null) {
                publicUsername = "";
            }
            String string = this.isPrivate ? "" : this.usernameTextView.getText().toString();
            if (!publicUsername.equals(string)) {
                if (ChatObject.isChannel(this.currentChat)) {
                    getMessagesController().updateChannelUserName(this, this.chatId, string, new ChatEditTypeActivity$$ExternalSyntheticLambda2(this, 3), new ChatEditTypeActivity$$ExternalSyntheticLambda2(this, 4));
                    return false;
                }
                getMessagesController().convertToMegaGroup(getParentActivity(), this.chatId, this, new ChatEditTypeActivity$$ExternalSyntheticLambda12(this, 1));
                return false;
            }
            if (tryDeactivateAllLinks()) {
                return true;
            }
        }
        return false;
    }

    private boolean tryUpdateJoinSettings() {
        if (this.joinContainer != null) {
            if (getParentActivity() == null) {
                return false;
            }
            if (!this.isChannel && !ChatObject.isChannel(this.currentChat)) {
                JoinToSendSettingsView joinToSendSettingsView = this.joinContainer;
                if (joinToSendSettingsView.isJoinToSend || joinToSendSettingsView.isJoinRequest) {
                    getMessagesController().convertToMegaGroup(getParentActivity(), this.chatId, this, new ChatEditTypeActivity$$ExternalSyntheticLambda12(this, 0));
                    return false;
                }
            }
            if (this.currentChat.join_to_send != this.joinContainer.isJoinToSend) {
                MessagesController messagesController = getMessagesController();
                long j = this.chatId;
                TLRPC.Chat chat = this.currentChat;
                boolean z = this.joinContainer.isJoinToSend;
                chat.join_to_send = z;
                messagesController.toggleChatJoinToSend(j, z, null, null);
            }
            if (this.currentChat.join_request != this.joinContainer.isJoinRequest || this.applyToAllInviteLinks) {
                MessagesController messagesController2 = getMessagesController();
                long j2 = this.chatId;
                TLRPC.Chat chat2 = this.currentChat;
                boolean z2 = this.joinContainer.isJoinRequest;
                chat2.join_request = z2;
                messagesController2.toggleChatJoinRequest(j2, 0L, z2, this.applyToAllInviteLinks, false, null, null);
                return true;
            }
        }
        return true;
    }

    private void updateDoneProgress(boolean z) {
        if (!z) {
            AndroidUtilities.cancelRunOnUIThread(this.enableDoneLoading);
        }
        if (this.doneButtonDrawable != null) {
            ValueAnimator valueAnimator = this.doneButtonDrawableAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.doneButtonDrawable.getProgress(), z ? 1.0f : 0.0f);
            this.doneButtonDrawableAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new QrActivity$$ExternalSyntheticLambda8(this, 3));
            this.doneButtonDrawableAnimator.setDuration((long) (Math.abs(this.doneButtonDrawable.getProgress() - (z ? 1.0f : 0.0f)) * 200.0f));
            this.doneButtonDrawableAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
            this.doneButtonDrawableAnimator.start();
        }
    }

    private void updatePrivatePublic() {
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
            TextInfoPrivacyCell textInfoPrivacyCell2 = this.checkTextView;
            textInfoPrivacyCell2.setVisibility((this.isPrivate || textInfoPrivacyCell2.length() == 0) ? 8 : 0);
            TLRPC.ChatFull chatFull = getMessagesController().getChatFull(this.chatId);
            this.manageLinksInfoCell.setText(LocaleController.getString((chatFull != null && chatFull.paid_media_allowed && ChatObject.isChannelAndNotMegaGroup(getMessagesController().getChat(Long.valueOf(this.chatId)))) ? R.string.ManageLinksInfoHelpPaid : R.string.ManageLinksInfoHelp));
        } else {
            this.typeInfoCell.setText(LocaleController.getString(R.string.ChangePublicLimitReached));
            TextInfoPrivacyCell textInfoPrivacyCell3 = this.typeInfoCell;
            int i3 = Theme.key_text_RedRegular;
            textInfoPrivacyCell3.setTag(Integer.valueOf(i3));
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
        JoinToSendSettingsView joinToSendSettingsView = this.joinContainer;
        if (joinToSendSettingsView != null) {
            joinToSendSettingsView.setVisibility((!this.isChannel || this.isPrivate) ? 0 : 8);
            JoinToSendSettingsView joinToSendSettingsView2 = this.joinContainer;
            TLRPC.ChatFull chatFull2 = this.info;
            joinToSendSettingsView2.showJoinToSend((chatFull2 == null || chatFull2.linked_chat_id == 0 || this.isChannel) ? false : true);
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

    @Override
    public View createView(final Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i) {
                if (i == -1) {
                    ChatEditTypeActivity.this.finishFragment();
                } else if (i == 1) {
                    if (ChatEditTypeActivity.this.doneButtonDrawable == null || ChatEditTypeActivity.this.doneButtonDrawable.getProgress() <= 0.0f) {
                        ChatEditTypeActivity.this.processDone();
                    }
                }
            }
        });
        ActionBarMenu actionBarMenuCreateMenu = this.actionBar.createMenu();
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i = Theme.key_actionBarDefaultIcon;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, i, false), PorterDuff.Mode.MULTIPLY));
        CrossfadeDrawable crossfadeDrawable = new CrossfadeDrawable(drawableMutate, new CircularProgressDrawable(Theme.getColor(null, i, false)));
        this.doneButtonDrawable = crossfadeDrawable;
        this.doneButton = actionBarMenuCreateMenu.addItemWithWidth(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), crossfadeDrawable);
        this.linearLayout = new SectionsScrollView.SectionsLinearLayout(context);
        SectionsScrollView sectionsScrollView = new SectionsScrollView(context, this.linearLayout, this.resourceProvider, false) {
            @Override
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                return !ChatEditTypeActivity.this.ignoreScroll && super.onInterceptTouchEvent(motionEvent);
            }

            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                if (motionEvent.getAction() != 0) {
                    return super.onTouchEvent(motionEvent);
                }
                return !ChatEditTypeActivity.this.ignoreScroll && super.onTouchEvent(motionEvent);
            }

            @Override
            public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
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
        if (this.isForcePublic) {
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
        this.radioButtonCell2.setOnClickListener(new ChatEditTypeActivity$$ExternalSyntheticLambda7(this, 1));
        RadioButtonCell radioButtonCell2 = new RadioButtonCell(context, false);
        this.radioButtonCell1 = radioButtonCell2;
        if (this.isChannel) {
            radioButtonCell2.setTextAndValue(LocaleController.getString(R.string.ChannelPublic), LocaleController.getString(R.string.ChannelPublicInfo), false, !this.isPrivate);
        } else {
            radioButtonCell2.setTextAndValue(LocaleController.getString(R.string.MegaPublic), LocaleController.getString(R.string.MegaPublicInfo), false, !this.isPrivate);
        }
        this.linearLayoutTypeContainer.addView(this.radioButtonCell1, LayoutHelper.createLinear(-1, -2));
        this.radioButtonCell1.setOnClickListener(new ChatEditTypeActivity$$ExternalSyntheticLambda7(this, 2));
        ShadowSectionCell shadowSectionCell = new ShadowSectionCell(context, null, 0);
        this.sectionCell2 = shadowSectionCell;
        this.linearLayout.addView(shadowSectionCell, LayoutHelper.createLinear(-1, -2));
        if (this.isForcePublic) {
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
        this.linkContainer.addView(this.publicContainer, LayoutHelper.createLinear(-1, 36, 23.0f, 7.0f, 23.0f, 0.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.editText = editTextBoldCursor;
        editTextBoldCursor.setText(getMessagesController().linkPrefix + "/");
        this.editText.setTextSize(1, 18.0f);
        EditTextBoldCursor editTextBoldCursor2 = this.editText;
        int i2 = Theme.key_windowBackgroundWhiteHintText;
        editTextBoldCursor2.setHintTextColor(Theme.getColor(null, i2, false));
        EditTextBoldCursor editTextBoldCursor3 = this.editText;
        int i3 = Theme.key_windowBackgroundWhiteBlackText;
        editTextBoldCursor3.setTextColor(Theme.getColor(null, i3, false));
        this.editText.setMaxLines(1);
        this.editText.setLines(1);
        this.editText.setEnabled(false);
        this.editText.setBackground(null);
        this.editText.setPadding(0, 0, 0, 0);
        this.editText.setSingleLine(true);
        this.editText.setInputType(163840);
        this.editText.setImeOptions(6);
        this.publicContainer.addView(this.editText, LayoutHelper.createLinear(-2, 36));
        EditTextBoldCursor editTextBoldCursor4 = new EditTextBoldCursor(context) {
            @Override
            public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                StringBuilder sb = new StringBuilder();
                sb.append((CharSequence) getText());
                if (ChatEditTypeActivity.this.checkTextView != null && ChatEditTypeActivity.this.checkTextView.getTextView() != null && !TextUtils.isEmpty(ChatEditTypeActivity.this.checkTextView.getTextView().getText())) {
                    sb.append("\n");
                    sb.append(ChatEditTypeActivity.this.checkTextView.getTextView().getText());
                }
                accessibilityNodeInfo.setText(sb);
            }
        };
        this.usernameTextView = editTextBoldCursor4;
        editTextBoldCursor4.setTextSize(1, 18.0f);
        this.usernameTextView.setHintTextColor(Theme.getColor(null, i2, false));
        this.usernameTextView.setTextColor(Theme.getColor(null, i3, false));
        this.usernameTextView.setMaxLines(1);
        this.usernameTextView.setLines(1);
        this.usernameTextView.setBackground(null);
        this.usernameTextView.setPadding(0, 0, 0, 0);
        this.usernameTextView.setSingleLine(true);
        this.usernameTextView.setInputType(163872);
        this.usernameTextView.setImeOptions(6);
        this.usernameTextView.setHint(LocaleController.getString(R.string.ChannelUsernamePlaceholder));
        this.usernameTextView.setCursorColor(Theme.getColor(null, i3, false));
        this.usernameTextView.setCursorSize(AndroidUtilities.dp(20.0f));
        this.usernameTextView.setCursorWidth(1.5f);
        this.publicContainer.addView(this.usernameTextView, LayoutHelper.createLinear(-1, 36));
        this.usernameTextView.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable editable) {
                ChatEditTypeActivity.this.checkDoneButton();
            }

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
                if (ChatEditTypeActivity.this.ignoreTextChanges) {
                    return;
                }
                String string = ChatEditTypeActivity.this.usernameTextView.getText().toString();
                if (ChatEditTypeActivity.this.editableUsernameCell != null) {
                    ChatEditTypeActivity.this.editableUsernameCell.updateUsername(string);
                }
                ChatEditTypeActivity.this.checkUserName(string);
            }
        });
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.privateContainer = linearLayout4;
        linearLayout4.setOrientation(1);
        this.linkContainer.addView(this.privateContainer, LayoutHelper.createLinear(-1, -2));
        LinkActionView linkActionView = new LinkActionView(context, this, null, this.chatId, true, ChatObject.isChannel(this.currentChat));
        this.permanentLinkView = linkActionView;
        linkActionView.setDelegate(new LinkActionView.Delegate() {
            @Override
            public final void editLink() {
                LinkActionView.Delegate.CC.$default$editLink(this);
            }

            @Override
            public final void removeLink() {
                LinkActionView.Delegate.CC.$default$removeLink(this);
            }

            @Override
            public void revokeLink() {
                ChatEditTypeActivity.this.generateLink(true);
            }

            @Override
            public void showUsersForPermanentLink() {
                ChatEditTypeActivity chatEditTypeActivity = ChatEditTypeActivity.this;
                Context context2 = context;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = ChatEditTypeActivity.this.invite;
                TLRPC.ChatFull chatFull = ChatEditTypeActivity.this.info;
                ChatEditTypeActivity chatEditTypeActivity2 = ChatEditTypeActivity.this;
                chatEditTypeActivity.inviteLinkBottomSheet = new InviteLinkBottomSheet(context2, tL_chatInviteExported, chatFull, chatEditTypeActivity2.usersMap, chatEditTypeActivity2, chatEditTypeActivity2.chatId, true, ChatObject.isChannel(ChatEditTypeActivity.this.currentChat));
                ChatEditTypeActivity.this.inviteLinkBottomSheet.show();
            }
        });
        this.permanentLinkView.setUsers(0, null, false);
        this.privateContainer.addView(this.permanentLinkView);
        AnonymousClass6 anonymousClass6 = new AnonymousClass6(context, 12, this.resourceProvider);
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
        ShadowSectionCell shadowSectionCell2 = new ShadowSectionCell(context, null, 0);
        this.adminedInfoCell = shadowSectionCell2;
        this.linearLayout.addView(shadowSectionCell2, LayoutHelper.createLinear(-1, -2));
        LinearLayout linearLayout6 = this.linearLayout;
        UsernamesListView usernamesListView = new UsernamesListView(context);
        this.usernamesListView = usernamesListView;
        linearLayout6.addView(usernamesListView, LayoutHelper.createLinear(-1, -2));
        this.usernamesListView.setVisibility((this.isPrivate || this.usernames.isEmpty()) ? 8 : 0);
        TextCell textCell = new TextCell(context);
        this.manageLinksTextView = textCell;
        textCell.setTextAndIcon((CharSequence) LocaleController.getString(R.string.ManageInviteLinks), R.drawable.msg_link2, false);
        this.manageLinksTextView.setOnClickListener(new ChatEditTypeActivity$$ExternalSyntheticLambda7(this, 3));
        this.linearLayout.addView(this.manageLinksTextView, LayoutHelper.createLinear(-1, -2));
        TextInfoPrivacyCell textInfoPrivacyCell2 = new TextInfoPrivacyCell(context, 12, this.resourceProvider);
        this.manageLinksInfoCell = textInfoPrivacyCell2;
        this.linearLayout.addView(textInfoPrivacyCell2, LayoutHelper.createLinear(-1, -2));
        AnonymousClass7 anonymousClass7 = new AnonymousClass7(context, this.currentChat, context);
        this.joinContainer = anonymousClass7;
        TLRPC.ChatFull chatFull = this.info;
        anonymousClass7.showJoinToSend((chatFull == null || chatFull.linked_chat_id == 0 || this.isChannel) ? false : true);
        this.joinContainer.setFullInfo(this, this.info);
        this.linearLayout.addView(this.joinContainer);
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.saveContainer = linearLayout7;
        linearLayout7.setOrientation(1);
        this.linearLayout.addView(this.saveContainer);
        HeaderCell headerCell3 = new HeaderCell(context, 23);
        this.saveHeaderCell = headerCell3;
        headerCell3.setHeight(46);
        this.saveHeaderCell.setText(LocaleController.getString(R.string.SavingContentTitle));
        this.saveContainer.addView(this.saveHeaderCell, LayoutHelper.createLinear(-1, -2));
        TextCheckCell textCheckCell = new TextCheckCell(context);
        this.saveRestrictCell = textCheckCell;
        textCheckCell.setTextAndCheck(LocaleController.getString(R.string.RestrictSavingContent), this.isSaveRestricted, false);
        this.saveRestrictCell.setOnClickListener(new ChatEditTypeActivity$$ExternalSyntheticLambda7(this, 4));
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
        updatePrivatePublic();
        return this.fragmentView;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.id == this.chatId) {
                this.info = chatFull;
                this.invite = chatFull.exported_invite;
                updatePrivatePublic();
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

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        IntroActivity$$ExternalSyntheticLambda0 introActivity$$ExternalSyntheticLambda0 = new IntroActivity$$ExternalSyntheticLambda0(this, 7);
        arrayList.add(new ThemeDescription(this.fragmentView, 1, null, null, null, null, Theme.key_windowBackgroundGray));
        arrayList.add(new ThemeDescription(this.actionBar, 64, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, 128, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, 256, null, null, null, null, Theme.key_actionBarDefaultSelector));
        int i = Theme.key_windowBackgroundGrayShadow;
        arrayList.add(new ThemeDescription(this.sectionCell2, 32, new Class[]{ShadowSectionCell.class}, null, null, null, i));
        arrayList.add(new ThemeDescription(this.infoCell, 32, new Class[]{TextInfoPrivacyCell.class}, null, null, null, i));
        int i2 = Theme.key_windowBackgroundWhiteGrayText4;
        arrayList.add(new ThemeDescription(this.infoCell, 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, null, null, -1, null, i2));
        TextSettingsCell textSettingsCell = this.textCell;
        int i3 = Theme.key_listSelector;
        arrayList.add(new ThemeDescription(textSettingsCell, 4096, null, null, null, null, i3));
        int i4 = Theme.key_text_RedRegular;
        arrayList.add(new ThemeDescription(this.textCell, 4, new Class[]{TextSettingsCell.class}, new String[]{"textView"}, null, null, -1, null, i4));
        arrayList.add(new ThemeDescription(this.textCell2, 4096, null, null, null, null, i3));
        int i5 = Theme.key_windowBackgroundWhiteBlackText;
        arrayList.add(new ThemeDescription(this.textCell2, 4, new Class[]{TextSettingsCell.class}, new String[]{"textView"}, null, null, -1, null, i5));
        arrayList.add(new ThemeDescription(this.usernameTextView, 4, null, null, null, null, i5));
        EditTextBoldCursor editTextBoldCursor = this.usernameTextView;
        int i6 = Theme.key_windowBackgroundWhiteHintText;
        arrayList.add(new ThemeDescription(editTextBoldCursor, 8388608, null, null, null, null, i6));
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
        arrayList.add(new ThemeDescription(null, 0, null, null, Theme.avatarDrawables, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_text));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_backgroundRed));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_backgroundOrange));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_backgroundViolet));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_backgroundGreen));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_backgroundCyan));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_backgroundBlue));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, introActivity$$ExternalSyntheticLambda0, Theme.key_avatar_backgroundPink));
        arrayList.add(new ThemeDescription(this.manageLinksTextView, 4096, null, null, null, null, i3));
        arrayList.add(new ThemeDescription(this.manageLinksTextView, 4, new Class[]{TextCell.class}, new String[]{"textView"}, null, null, -1, null, i5));
        arrayList.add(new ThemeDescription(this.manageLinksTextView, 0, new Class[]{TextCell.class}, new String[]{"imageView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayIcon));
        return arrayList;
    }

    public boolean hasActiveLink() {
        if (this.usernames == null) {
            return false;
        }
        for (int i = 0; i < this.usernames.size(); i++) {
            TLRPC.TL_username tL_username = this.usernames.get(i);
            if (tL_username != null && tL_username.active && !TextUtils.isEmpty(tL_username.username)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public void onBecomeFullyVisible() {
        EditTextBoldCursor editTextBoldCursor;
        super.onBecomeFullyVisible();
        if (!this.isForcePublic || (editTextBoldCursor = this.usernameTextView) == null) {
            return;
        }
        editTextBoldCursor.requestFocus();
        AndroidUtilities.showKeyboard(this.usernameTextView);
    }

    @Override
    public boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ChatEditTypeActivity.onFragmentCreate():boolean");
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override
    public void onInsets(int i, int i2, int i3, int i4) {
        LinearLayout linearLayout = this.linearLayout;
        if (linearLayout != null) {
            linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + i4);
        }
    }

    @Override
    public void onResume() {
        TLRPC.ChatFull chatFull;
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        TextSettingsCell textSettingsCell = this.textCell2;
        if (textSettingsCell != null && (chatFull = this.info) != null) {
            if (chatFull.stickerset != null) {
                textSettingsCell.setTextAndValue(LocaleController.getString(R.string.GroupStickers), this.info.stickerset.title, false, false);
            } else {
                textSettingsCell.setText(LocaleController.getString(R.string.GroupStickers), false);
            }
        }
        TLRPC.ChatFull chatFull2 = this.info;
        if (chatFull2 != null) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull2.exported_invite;
            this.invite = tL_chatInviteExported;
            this.permanentLinkView.setLink(tL_chatInviteExported == null ? null : tL_chatInviteExported.link);
            this.permanentLinkView.loadUsers(this.invite, this.chatId);
        }
    }

    public void setInfo(TLRPC.ChatFull chatFull) {
        this.info = chatFull;
        if (chatFull != null) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull.exported_invite;
            if (tL_chatInviteExported != null) {
                this.invite = tL_chatInviteExported;
            } else {
                generateLink(false);
            }
        }
    }
}
