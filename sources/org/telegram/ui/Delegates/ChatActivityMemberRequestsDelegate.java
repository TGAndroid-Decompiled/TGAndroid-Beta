package org.telegram.ui.Delegates;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda50;
import org.telegram.ui.Components.AvatarsDrawable;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.MemberRequestsBottomSheet;
import org.telegram.ui.Stories.HwAvatarsImageView;

public final class ChatActivityMemberRequestsDelegate {
    public HwAvatarsImageView avatarsView;
    public AnonymousClass2 bottomSheet;
    public TLRPC.ChatFull chatInfo;
    public int closePendingRequestsCount = -1;
    public ImageView closeView;
    public final int currentAccount;
    public final TLRPC.Chat currentChat;
    public ChangeVisibilityDelegate delegate;
    public final BaseFragment fragment;
    public int pendingRequestsCount;
    public TextView requestsCountTextView;
    public LinearLayout requestsDataLayout;
    public FrameLayout root;

    public interface ChangeVisibilityDelegate {
        void setVisible(boolean z, boolean z2);
    }

    public ChatActivityMemberRequestsDelegate(TLRPC.Chat chat, BaseFragment baseFragment) {
        this.fragment = baseFragment;
        this.currentChat = chat;
        this.currentAccount = baseFragment.getCurrentAccount();
    }

    public final void animatePendingRequests(boolean z, boolean z2) {
        if (z == (this.root.getVisibility() == 0)) {
            return;
        }
        if (z) {
            int i = this.closePendingRequestsCount;
            BaseFragment baseFragment = this.fragment;
            TLRPC.Chat chat = this.currentChat;
            if (i == -1 && chat != null) {
                this.closePendingRequestsCount = baseFragment.getMessagesController().getChatPendingRequestsOnClosed(chat.id);
            }
            int i2 = this.pendingRequestsCount;
            int i3 = this.closePendingRequestsCount;
            if (i2 == i3) {
                return;
            }
            if (i3 != 0 && chat != null) {
                baseFragment.getMessagesController().setChatPendingRequestsOnClose(chat.id, 0);
            }
        }
        ChangeVisibilityDelegate changeVisibilityDelegate = this.delegate;
        if (changeVisibilityDelegate != null) {
            changeVisibilityDelegate.setVisible(z, z2);
        }
    }

    public final void fillThemeDescriptions(ArrayList arrayList) {
        arrayList.add(new ThemeDescription(this.requestsCountTextView, 4, null, null, null, null, Theme.key_chat_topPanelTitle));
        arrayList.add(new ThemeDescription(this.closeView, 8, null, null, null, null, Theme.key_chat_topPanelClose));
    }

    public final FrameLayout getView() {
        if (this.root == null) {
            BaseFragment baseFragment = this.fragment;
            FrameLayout frameLayout = new FrameLayout(baseFragment.getParentActivity());
            this.root = frameLayout;
            frameLayout.setBackground(Theme.getSelectorDrawable(false));
            final int i = 0;
            this.root.setOnClickListener(new View.OnClickListener(this) {
                public final ChatActivityMemberRequestsDelegate f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i) {
                        case 0:
                            final ChatActivityMemberRequestsDelegate chatActivityMemberRequestsDelegate = this.f$0;
                            ChatActivityMemberRequestsDelegate.AnonymousClass2 anonymousClass2 = chatActivityMemberRequestsDelegate.bottomSheet;
                            BaseFragment baseFragment2 = chatActivityMemberRequestsDelegate.fragment;
                            if (anonymousClass2 == null) {
                                chatActivityMemberRequestsDelegate.bottomSheet = new MemberRequestsBottomSheet(baseFragment2, chatActivityMemberRequestsDelegate.currentChat.id) {
                                    @Override
                                    public final void lambda$showGiftOfferSheet$15() {
                                        ChatActivityMemberRequestsDelegate chatActivityMemberRequestsDelegate2 = ChatActivityMemberRequestsDelegate.this;
                                        AnonymousClass2 anonymousClass3 = chatActivityMemberRequestsDelegate2.bottomSheet;
                                        if (anonymousClass3 != null && !((MemberRequestsBottomSheet) anonymousClass3).delegate.isNeedRestoreList) {
                                            chatActivityMemberRequestsDelegate2.bottomSheet = null;
                                        }
                                        super.lambda$showGiftOfferSheet$15();
                                    }
                                };
                            }
                            baseFragment2.showDialog(chatActivityMemberRequestsDelegate.bottomSheet);
                            break;
                        default:
                            ChatActivityMemberRequestsDelegate chatActivityMemberRequestsDelegate2 = this.f$0;
                            chatActivityMemberRequestsDelegate2.fragment.getMessagesController().setChatPendingRequestsOnClose(chatActivityMemberRequestsDelegate2.currentChat.id, chatActivityMemberRequestsDelegate2.pendingRequestsCount);
                            chatActivityMemberRequestsDelegate2.closePendingRequestsCount = chatActivityMemberRequestsDelegate2.pendingRequestsCount;
                            chatActivityMemberRequestsDelegate2.animatePendingRequests(false, true);
                            break;
                    }
                }
            });
            LinearLayout linearLayout = new LinearLayout(baseFragment.getParentActivity());
            this.requestsDataLayout = linearLayout;
            linearLayout.setOrientation(0);
            this.root.addView(this.requestsDataLayout, LayoutHelper.createFrame(-1, -1.0f, 48, 0.0f, 0.0f, 100.0f, 0.0f));
            HwAvatarsImageView hwAvatarsImageView = new HwAvatarsImageView(1, baseFragment.getParentActivity(), false);
            this.avatarsView = hwAvatarsImageView;
            hwAvatarsImageView.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
            AvatarsDrawable avatarsDrawable = this.avatarsView.avatarsDrawable;
            for (int i2 = 0; i2 < avatarsDrawable.animatingStates.length; i2++) {
                avatarsDrawable.setObject(0, null, 0);
            }
            this.requestsDataLayout.addView(this.avatarsView, LayoutHelper.createFrame(-2, -1.0f, 48, 8.0f, 0.0f, 10.0f, 0.0f));
            TextView textView = new TextView(baseFragment.getParentActivity());
            this.requestsCountTextView = textView;
            textView.setEllipsize(TextUtils.TruncateAt.END);
            this.requestsCountTextView.setGravity(16);
            this.requestsCountTextView.setSingleLine();
            this.requestsCountTextView.setText((CharSequence) null);
            this.requestsCountTextView.setTextColor(baseFragment.getThemedColor(Theme.key_chat_topPanelTitle));
            this.requestsCountTextView.setTypeface(AndroidUtilities.bold());
            this.requestsDataLayout.addView(this.requestsCountTextView, LayoutHelper.createFrame(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
            ImageView imageView = new ImageView(baseFragment.getParentActivity());
            this.closeView = imageView;
            imageView.setBackground(Theme.createSelectorDrawable(baseFragment.getThemedColor(Theme.key_inappPlayerClose) & 436207615, 1, AndroidUtilities.dp(14.0f)));
            this.closeView.setColorFilter(new PorterDuffColorFilter(baseFragment.getThemedColor(Theme.key_chat_topPanelClose), PorterDuff.Mode.MULTIPLY));
            this.closeView.setContentDescription(LocaleController.getString(R.string.Close));
            this.closeView.setImageResource(R.drawable.miniplayer_close);
            this.closeView.setScaleType(ImageView.ScaleType.CENTER);
            final int i3 = 1;
            this.closeView.setOnClickListener(new View.OnClickListener(this) {
                public final ChatActivityMemberRequestsDelegate f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i3) {
                        case 0:
                            final ChatActivityMemberRequestsDelegate chatActivityMemberRequestsDelegate = this.f$0;
                            ChatActivityMemberRequestsDelegate.AnonymousClass2 anonymousClass2 = chatActivityMemberRequestsDelegate.bottomSheet;
                            BaseFragment baseFragment2 = chatActivityMemberRequestsDelegate.fragment;
                            if (anonymousClass2 == null) {
                                chatActivityMemberRequestsDelegate.bottomSheet = new MemberRequestsBottomSheet(baseFragment2, chatActivityMemberRequestsDelegate.currentChat.id) {
                                    @Override
                                    public final void lambda$showGiftOfferSheet$15() {
                                        ChatActivityMemberRequestsDelegate chatActivityMemberRequestsDelegate2 = ChatActivityMemberRequestsDelegate.this;
                                        AnonymousClass2 anonymousClass3 = chatActivityMemberRequestsDelegate2.bottomSheet;
                                        if (anonymousClass3 != null && !((MemberRequestsBottomSheet) anonymousClass3).delegate.isNeedRestoreList) {
                                            chatActivityMemberRequestsDelegate2.bottomSheet = null;
                                        }
                                        super.lambda$showGiftOfferSheet$15();
                                    }
                                };
                            }
                            baseFragment2.showDialog(chatActivityMemberRequestsDelegate.bottomSheet);
                            break;
                        default:
                            ChatActivityMemberRequestsDelegate chatActivityMemberRequestsDelegate2 = this.f$0;
                            chatActivityMemberRequestsDelegate2.fragment.getMessagesController().setChatPendingRequestsOnClose(chatActivityMemberRequestsDelegate2.currentChat.id, chatActivityMemberRequestsDelegate2.pendingRequestsCount);
                            chatActivityMemberRequestsDelegate2.closePendingRequestsCount = chatActivityMemberRequestsDelegate2.pendingRequestsCount;
                            chatActivityMemberRequestsDelegate2.animatePendingRequests(false, true);
                            break;
                    }
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

    public final void setDelegate(ChatActivity$$ExternalSyntheticLambda50 chatActivity$$ExternalSyntheticLambda50) {
        this.delegate = chatActivity$$ExternalSyntheticLambda50;
    }

    public final void setPendingRequests(int i, List list, boolean z) {
        if (this.root == null) {
            return;
        }
        BaseFragment baseFragment = this.fragment;
        if (i <= 0) {
            TLRPC.Chat chat = this.currentChat;
            if (chat != null) {
                baseFragment.getMessagesController().setChatPendingRequestsOnClose(chat.id, 0);
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
                TLRPC.User user = baseFragment.getMessagesController().getUser((Long) list.get(i2));
                if (user != null) {
                    HwAvatarsImageView hwAvatarsImageView = this.avatarsView;
                    hwAvatarsImageView.avatarsDrawable.setObject(i2, user, this.currentAccount);
                }
            }
            this.avatarsView.setCount(iMin);
            this.avatarsView.avatarsDrawable.commitTransition(true, true);
        }
    }
}
