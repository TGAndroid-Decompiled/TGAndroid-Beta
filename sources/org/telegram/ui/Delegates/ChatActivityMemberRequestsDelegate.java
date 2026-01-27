package org.telegram.ui.Delegates;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Components.AvatarsImageView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.MemberRequestsBottomSheet;

public class ChatActivityMemberRequestsDelegate {
    private AvatarsImageView avatarsView;
    private MemberRequestsBottomSheet bottomSheet;
    private TLRPC.ChatFull chatInfo;
    private int closePendingRequestsCount = -1;
    private ImageView closeView;
    private final int currentAccount;
    private final TLRPC.Chat currentChat;
    private ChangeVisibilityDelegate delegate;
    private final BaseFragment fragment;
    private int pendingRequestsCount;
    private TextView requestsCountTextView;
    private LinearLayout requestsDataLayout;
    public FrameLayout root;

    public interface ChangeVisibilityDelegate {
        void setVisible(boolean z, boolean z2);
    }

    public ChatActivityMemberRequestsDelegate(BaseFragment baseFragment, TLRPC.Chat chat) {
        this.fragment = baseFragment;
        this.currentChat = chat;
        this.currentAccount = baseFragment.getCurrentAccount();
    }

    public void setDelegate(ChangeVisibilityDelegate changeVisibilityDelegate) {
        this.delegate = changeVisibilityDelegate;
    }

    public View getView() {
        if (this.root == null) {
            FrameLayout frameLayout = new FrameLayout(this.fragment.getParentActivity());
            this.root = frameLayout;
            frameLayout.setBackground(Theme.getSelectorDrawable(false));
            this.root.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$getView$0(view);
                }
            });
            LinearLayout linearLayout = new LinearLayout(this.fragment.getParentActivity());
            this.requestsDataLayout = linearLayout;
            linearLayout.setOrientation(0);
            this.root.addView(this.requestsDataLayout, LayoutHelper.createFrame(-1, -1.0f, 48, 0.0f, 0.0f, 100.0f, 0.0f));
            AvatarsImageView avatarsImageView = new AvatarsImageView(this.fragment.getParentActivity(), false) {
                @Override
                protected void onMeasure(int i, int i2) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.avatarsDrawable.count == 0 ? 0 : ((r2 - 1) * 20) + 24), 1073741824), i2);
                }
            };
            this.avatarsView = avatarsImageView;
            avatarsImageView.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
            this.avatarsView.reset();
            this.requestsDataLayout.addView(this.avatarsView, LayoutHelper.createFrame(-2, -1.0f, 48, 8.0f, 0.0f, 10.0f, 0.0f));
            TextView textView = new TextView(this.fragment.getParentActivity());
            this.requestsCountTextView = textView;
            textView.setEllipsize(TextUtils.TruncateAt.END);
            this.requestsCountTextView.setGravity(16);
            this.requestsCountTextView.setSingleLine();
            this.requestsCountTextView.setText((CharSequence) null);
            this.requestsCountTextView.setTextColor(this.fragment.getThemedColor(Theme.key_chat_topPanelTitle));
            this.requestsCountTextView.setTypeface(AndroidUtilities.bold());
            this.requestsDataLayout.addView(this.requestsCountTextView, LayoutHelper.createFrame(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
            ImageView imageView = new ImageView(this.fragment.getParentActivity());
            this.closeView = imageView;
            imageView.setBackground(Theme.createSelectorDrawable(this.fragment.getThemedColor(Theme.key_inappPlayerClose) & 436207615, 1, AndroidUtilities.dp(14.0f)));
            this.closeView.setColorFilter(new PorterDuffColorFilter(this.fragment.getThemedColor(Theme.key_chat_topPanelClose), PorterDuff.Mode.MULTIPLY));
            this.closeView.setContentDescription(LocaleController.getString(R.string.Close));
            this.closeView.setImageResource(R.drawable.miniplayer_close);
            this.closeView.setScaleType(ImageView.ScaleType.CENTER);
            this.closeView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$getView$1(view);
                }
            });
            this.root.addView(this.closeView, LayoutHelper.createFrame(36, -1.0f, 53, 0.0f, 0.0f, 4.0f, 0.0f));
            TLRPC.ChatFull chatFull = this.chatInfo;
            if (chatFull != null) {
                setPendingRequests(chatFull.requests_pending, chatFull.recent_requesters, false);
            }
        }
        return this.root;
    }

    public void lambda$getView$0(View view) {
        showBottomSheet();
    }

    public void lambda$getView$1(View view) {
        this.fragment.getMessagesController().setChatPendingRequestsOnClose(this.currentChat.id, this.pendingRequestsCount);
        this.closePendingRequestsCount = this.pendingRequestsCount;
        animatePendingRequests(false, true);
    }

    public void setChatInfo(TLRPC.ChatFull chatFull, boolean z) {
        this.chatInfo = chatFull;
        if (chatFull != null) {
            setPendingRequests(chatFull.requests_pending, chatFull.recent_requesters, z);
        }
    }

    public void onBackToScreen() {
        MemberRequestsBottomSheet memberRequestsBottomSheet = this.bottomSheet;
        if (memberRequestsBottomSheet == null || !memberRequestsBottomSheet.isNeedRestoreDialog()) {
            return;
        }
        showBottomSheet();
    }

    private void showBottomSheet() {
        if (this.bottomSheet == null) {
            this.bottomSheet = new MemberRequestsBottomSheet(this.fragment, this.currentChat.id) {
                @Override
                public void lambda$new$0() {
                    if (ChatActivityMemberRequestsDelegate.this.bottomSheet != null && !ChatActivityMemberRequestsDelegate.this.bottomSheet.isNeedRestoreDialog()) {
                        ChatActivityMemberRequestsDelegate.this.bottomSheet = null;
                    }
                    super.lambda$new$0();
                }
            };
        }
        this.fragment.showDialog(this.bottomSheet);
    }

    private void setPendingRequests(int i, List list, boolean z) {
        if (this.root == null) {
            return;
        }
        if (i <= 0) {
            if (this.currentChat != null) {
                this.fragment.getMessagesController().setChatPendingRequestsOnClose(this.currentChat.id, 0);
                this.closePendingRequestsCount = 0;
            }
            animatePendingRequests(false, z);
            this.pendingRequestsCount = 0;
            return;
        }
        if (this.pendingRequestsCount != i) {
            this.pendingRequestsCount = i;
            this.requestsCountTextView.setText(LocaleController.formatPluralString("JoinUsersRequests", i, new Object[0]));
            animatePendingRequests(true, z);
            if (list == null || list.isEmpty()) {
                return;
            }
            int iMin = Math.min(3, list.size());
            for (int i2 = 0; i2 < iMin; i2++) {
                TLRPC.User user = this.fragment.getMessagesController().getUser((Long) list.get(i2));
                if (user != null) {
                    this.avatarsView.setObject(i2, this.currentAccount, user);
                }
            }
            this.avatarsView.setCount(iMin);
            this.avatarsView.commitTransition(true);
        }
    }

    private void animatePendingRequests(boolean z, boolean z2) {
        if (z == (this.root.getVisibility() == 0)) {
            return;
        }
        if (z) {
            if (this.closePendingRequestsCount == -1 && this.currentChat != null) {
                this.closePendingRequestsCount = this.fragment.getMessagesController().getChatPendingRequestsOnClosed(this.currentChat.id);
            }
            int i = this.pendingRequestsCount;
            int i2 = this.closePendingRequestsCount;
            if (i == i2) {
                return;
            }
            if (i2 != 0 && this.currentChat != null) {
                this.fragment.getMessagesController().setChatPendingRequestsOnClose(this.currentChat.id, 0);
            }
        }
        ChangeVisibilityDelegate changeVisibilityDelegate = this.delegate;
        if (changeVisibilityDelegate != null) {
            changeVisibilityDelegate.setVisible(z, z2);
        }
    }

    public void fillThemeDescriptions(List list) {
        list.add(new ThemeDescription(this.requestsCountTextView, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, Theme.key_chat_topPanelTitle));
        list.add(new ThemeDescription(this.closeView, ThemeDescription.FLAG_IMAGECOLOR, null, null, null, null, Theme.key_chat_topPanelClose));
    }
}
