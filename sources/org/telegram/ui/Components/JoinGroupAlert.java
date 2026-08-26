package org.telegram.ui.Components;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotGuardHelper;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$$ExternalSyntheticOutline0;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.utils.FBool;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda15;
import org.telegram.ui.Stars.BotStarsActivity$$ExternalSyntheticLambda25;

public class JoinGroupAlert extends BottomSheet {
    public static final int ORIGINATION_OTHER = -1;
    public static final int ORIGINATION_SPONSORED_CHAT = 0;
    private BulletinFactory bulletinFactory;
    private TLRPC.ChatInvite chatInvite;
    private TLRPC.Chat currentChat;
    private final BaseFragment fragment;
    private final String hash;
    private RadialProgressView requestProgressView;
    private TextView requestTextView;

    public class AnonymousClass1 extends ChatActivity {
        private boolean shownToast;
        final long val$chatId;
        final boolean val$showJoined;

        public AnonymousClass1(Bundle bundle, boolean z, long j) {
            super(bundle);
            this.val$showJoined = z;
            this.val$chatId = j;
            this.shownToast = false;
        }

        public void lambda$onBecomeFullyVisible$0(long j, TLRPC.Chat chat) {
            if (AndroidUtilities.isContextSafe(getContext())) {
                TagEditCell.showSheet(getContext(), this.currentAccount, -j, getUserConfig().getCurrentUser(), null, chat.admin_rights != null, chat.creator, ((BottomSheet) JoinGroupAlert.this).resourcesProvider);
            }
        }

        @Override
        public void onBecomeFullyVisible() {
            super.onBecomeFullyVisible();
            if (this.shownToast || !this.val$showJoined) {
                return;
            }
            this.shownToast = true;
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.val$chatId));
            if (ChatObject.canManageMyTag(chat)) {
                BulletinFactory.of(this).createSimpleBulletin(R.raw.contact_check, LocaleController.getString(R.string.JoinedGroup), LocaleController.getString(R.string.JoinedGroupAddTag), new BulletinFactory$$ExternalSyntheticLambda5(this, this.val$chatId, chat, 2)).hideAfterBottomSheet(false).show(true);
            } else {
                BulletinFactory.of(this).createSimpleBulletin(R.raw.contact_check, LocaleController.getString(R.string.JoinedGroup)).hideAfterBottomSheet(false).show(true);
            }
        }
    }

    public JoinGroupAlert(Context context, TLObject tLObject, String str, BaseFragment baseFragment, Theme.ResourcesProvider resourcesProvider) {
        this(context, tLObject, str, baseFragment, resourcesProvider, -1);
    }

    private CharSequence ellipsize(TextView textView, TLRPC.ChatInvite chatInvite, int i) {
        String str = chatInvite.participants.get(i).first_name;
        if (str == null) {
            str = "";
        }
        return TextUtils.ellipsize(str.trim(), textView.getPaint(), AndroidUtilities.dp(120.0f), TextUtils.TruncateAt.END);
    }

    private Drawable getScamDrawable(int i) {
        return i == 0 ? Theme.dialogs_scamDrawable : Theme.dialogs_fakeDrawable;
    }

    private Drawable getVerifiedCrossfadeDrawable() {
        return new CombinedDrawable(Theme.dialogs_verifiedDrawable, Theme.dialogs_verifiedCheckDrawable);
    }

    public void lambda$new$0(View view) {
        lambda$showGiftOfferSheet$15();
    }

    public void lambda$new$1() {
        if (isDismissed()) {
            return;
        }
        this.requestTextView.setVisibility(4);
        this.requestProgressView.setVisibility(0);
    }

    public void lambda$new$10(TLRPC.TL_error tL_error, TLRPC.Updates updates, int i, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        TLRPC.ChatInvite chatInvite;
        TLRPC.Chat chat;
        BaseFragment baseFragment = this.fragment;
        if (baseFragment == null || baseFragment.getParentActivity() == null) {
            return;
        }
        if (tL_error != null) {
            if (!"USER_ALREADY_PARTICIPANT".equals(tL_error.text) || i != 0 || (chatInvite = this.chatInvite) == null || (chat = chatInvite.chat) == null) {
                AlertsCreator.processError(this.currentAccount, tL_error, this.fragment, tL_messages_importChatInvite, new Object[0]);
                return;
            } else {
                openChat(chat.id, false);
                return;
            }
        }
        if (updates == null || updates.chats.isEmpty()) {
            return;
        }
        TLRPC.Chat chat2 = updates.chats.get(0);
        chat2.left = false;
        chat2.kicked = false;
        MessagesController.getInstance(this.currentAccount).putUsers(updates.users, false);
        MessagesController.getInstance(this.currentAccount).putChats(updates.chats, false);
        openChat(chat2.id, !ChatObject.isChannelAndNotMegaGroup(chat2));
    }

    public void lambda$new$11(long j, int i, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite, TLRPC.ChatInviteJoinResult chatInviteJoinResult, TLRPC.TL_error tL_error) {
        TLRPC.Updates updates;
        if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
            TLRPC.Updates updates2 = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
            MessagesController.getInstance(this.currentAccount).processUpdates(updates2, false);
            updates = updates2;
        } else {
            if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                AndroidUtilities.runOnUIThread(new JoinGroupAlert$$ExternalSyntheticLambda0(this, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult, j, 0));
            }
            updates = null;
        }
        AndroidUtilities.runOnUIThread(new GiftSheet$$ExternalSyntheticLambda15(this, tL_error, updates, i, tL_messages_importChatInvite, 14));
    }

    public void lambda$new$12(final long j, final int i, View view) {
        lambda$showGiftOfferSheet$15();
        final TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
        tL_messages_importChatInvite.hash = this.hash;
        ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_importChatInvite, null, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                JoinGroupAlert joinGroupAlert = this.f$0;
                TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite2 = tL_messages_importChatInvite;
                joinGroupAlert.lambda$new$11(j, i, tL_messages_importChatInvite2, (TLRPC.ChatInviteJoinResult) obj, (TLRPC.TL_error) obj2);
            }
        }, 2);
    }

    public void lambda$new$2(boolean z, DialogInterface dialogInterface) {
        showBulletin(getContext(), this.fragment, this.bulletinFactory, z);
    }

    public boolean lambda$new$3(boolean z, TLRPC.TL_error tL_error) {
        if (tL_error != null && "INVITE_REQUEST_SENT".equals(tL_error.text)) {
            setOnDismissListener(new JoinGroupAlert$$ExternalSyntheticLambda4(this, z, 0));
        }
        lambda$showGiftOfferSheet$15();
        return false;
    }

    public void lambda$new$4(TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j) {
        MessagesController.getInstance(this.currentAccount).putUsers(tL_chatInviteJoinResultWebView.users, false);
        BotGuardHelper.getInstance(this.currentAccount).openGuardBotWebApp(j, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id);
    }

    public void lambda$new$5(boolean z, DialogInterface dialogInterface) {
        showBulletin(getContext(), this.fragment, this.bulletinFactory, z);
    }

    public void lambda$new$6(TLRPC.TL_error tL_error, boolean z, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        BaseFragment baseFragment = this.fragment;
        if (baseFragment == null || baseFragment.getParentActivity() == null) {
            return;
        }
        if (tL_error != null) {
            if ("INVITE_REQUEST_SENT".equals(tL_error.text)) {
                setOnDismissListener(new JoinGroupAlert$$ExternalSyntheticLambda4(this, z, 1));
            } else {
                AlertsCreator.processError(this.currentAccount, tL_error, this.fragment, tL_messages_importChatInvite, new Object[0]);
            }
        }
        lambda$showGiftOfferSheet$15();
    }

    public void lambda$new$7(long j, boolean z, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.TL_chatInviteJoinResultOk) {
            MessagesController.getInstance(this.currentAccount).processUpdates(((TLRPC.TL_chatInviteJoinResultOk) tLObject).updates, false);
        } else if (tLObject instanceof TLRPC.TL_chatInviteJoinResultWebView) {
            AndroidUtilities.runOnUIThread(new JoinGroupAlert$$ExternalSyntheticLambda0(this, (TLRPC.TL_chatInviteJoinResultWebView) tLObject, j, 1));
        }
        AndroidUtilities.runOnUIThread(new JoinGroupAlert$$ExternalSyntheticLambda3(this, tL_error, z, tL_messages_importChatInvite, 0));
    }

    public void lambda$new$8(boolean z, long j, View view) {
        final int i = 0;
        AndroidUtilities.runOnUIThread(new Runnable(this) {
            public final JoinGroupAlert f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run() {
                switch (i) {
                    case 0:
                        this.f$0.lambda$new$1();
                        break;
                    default:
                        this.f$0.lambda$showGiftOfferSheet$15();
                        break;
                }
            }
        }, 400L);
        if (this.chatInvite != null || this.currentChat == null) {
            TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
            tL_messages_importChatInvite.hash = this.hash;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_importChatInvite, new BotStarsActivity$$ExternalSyntheticLambda25(this, j, z, tL_messages_importChatInvite), 2);
        } else {
            final int i2 = 1;
            MessagesController.getInstance(this.currentAccount).addUserToChat(this.currentChat.id, UserConfig.getInstance(this.currentAccount).getCurrentUser(), 0, null, null, true, new Runnable(this) {
                public final JoinGroupAlert f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run() {
                    switch (i2) {
                        case 0:
                            this.f$0.lambda$new$1();
                            break;
                        default:
                            this.f$0.lambda$showGiftOfferSheet$15();
                            break;
                    }
                }
            }, new JoinGroupAlert$$ExternalSyntheticLambda9(this, z));
        }
    }

    public void lambda$new$9(TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j) {
        MessagesController.getInstance(this.currentAccount).putUsers(tL_chatInviteJoinResultWebView.users, false);
        BotGuardHelper.getInstance(this.currentAccount).openGuardBotWebApp(j, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id);
    }

    private void openChat(long j, boolean z) {
        Bundle bundleM = FBool.m(j, "chat_id");
        if (MessagesController.getInstance(this.currentAccount).checkCanOpenChat(bundleM, this.fragment)) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(bundleM, z, j);
            BaseFragment baseFragment = this.fragment;
            baseFragment.presentFragment(anonymousClass1, baseFragment instanceof ChatActivity);
        }
    }

    public static void showBulletin(Context context, BaseFragment baseFragment, boolean z) {
        showBulletin(context, baseFragment, BulletinFactory.of(baseFragment), z);
    }

    public JoinGroupAlert setBulletinFactory(BulletinFactory bulletinFactory) {
        this.bulletinFactory = bulletinFactory;
        return this;
    }

    @Override
    public void setLastVisible(boolean z) {
    }

    public JoinGroupAlert(Context context, TLObject tLObject, String str, BaseFragment baseFragment, Theme.ResourcesProvider resourcesProvider, int i) {
        final long j;
        String str2;
        boolean z;
        int iMax;
        boolean z2;
        boolean z3;
        float f;
        CharSequence string;
        int i2;
        super(context, false, false, resourcesProvider);
        int i3 = 3;
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        fixNavigationBar(getThemedColor(Theme.key_windowBackgroundWhite));
        this.fragment = baseFragment;
        if (tLObject instanceof TLRPC.ChatInvite) {
            TLRPC.ChatInvite chatInvite = (TLRPC.ChatInvite) tLObject;
            this.chatInvite = chatInvite;
            TLRPC.Chat chat = chatInvite.chat;
            if (chat != null) {
                j = -chat.id;
            } else {
                j = 0;
            }
        } else if (tLObject instanceof TLRPC.Chat) {
            TLRPC.Chat chat2 = (TLRPC.Chat) tLObject;
            this.currentChat = chat2;
            j = chat2.id;
        } else {
            j = 0;
        }
        this.hash = str;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClickable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(linearLayout);
        String str3 = null;
        NestedScrollView nestedScrollView = new NestedScrollView(context, null);
        nestedScrollView.addView(frameLayout);
        setCustomView(nestedScrollView);
        ImageView imageView = new ImageView(context);
        imageView.setBackground(Theme.createSelectorDrawable(getThemedColor(Theme.key_listSelector), 1, -1));
        imageView.setColorFilter(getThemedColor(Theme.key_sheet_other));
        imageView.setImageResource(R.drawable.ic_layer_close);
        imageView.setOnClickListener(new SearchField$$ExternalSyntheticLambda0(this, i3));
        int iDp = AndroidUtilities.dp(8.0f);
        imageView.setPadding(iDp, iDp, iDp, iDp);
        frameLayout.addView(imageView, LayoutHelper.createFrame(36, 36.0f, 8388661, 6.0f, 8.0f, 8.0f, 0.0f));
        BackupImageView backupImageView = new BackupImageView(context);
        backupImageView.setRoundRadius(AndroidUtilities.dp(45.0f));
        linearLayout.addView(backupImageView, LayoutHelper.createLinear(90, 90, 49, 0, 27, 0, 0));
        TLRPC.ChatInvite chatInvite2 = this.chatInvite;
        if (chatInvite2 != null) {
            if (chatInvite2.chat != null) {
                AvatarDrawable avatarDrawable = new AvatarDrawable(this.chatInvite.chat);
                TLRPC.ChatInvite chatInvite3 = this.chatInvite;
                TLRPC.Chat chat3 = chatInvite3.chat;
                String str4 = chat3.title;
                int i4 = chat3.participants_count;
                backupImageView.setForUserOrChat(chat3, avatarDrawable, chatInvite3);
                str3 = str4;
                i2 = i4;
            } else {
                AvatarDrawable avatarDrawable2 = new AvatarDrawable();
                avatarDrawable2.setInfo(0L, this.chatInvite.title, null);
                TLRPC.ChatInvite chatInvite4 = this.chatInvite;
                String str5 = chatInvite4.title;
                i2 = chatInvite4.participants_count;
                backupImageView.setImage(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(chatInvite4.photo.sizes, 50), this.chatInvite.photo), "50_50", avatarDrawable2, this.chatInvite);
                str3 = str5;
            }
            TLRPC.ChatInvite chatInvite5 = this.chatInvite;
            str2 = chatInvite5.about;
            z2 = chatInvite5.verified;
            z3 = chatInvite5.fake;
            iMax = i2;
            z = chatInvite5.scam;
        } else if (this.currentChat != null) {
            AvatarDrawable avatarDrawable3 = new AvatarDrawable(this.currentChat);
            String str6 = this.currentChat.title;
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(this.currentChat.id);
            str3 = chatFull != null ? chatFull.about : null;
            iMax = Math.max(this.currentChat.participants_count, chatFull != null ? chatFull.participants_count : 0);
            TLRPC.Chat chat4 = this.currentChat;
            backupImageView.setForUserOrChat(chat4, avatarDrawable3, chat4);
            TLRPC.Chat chat5 = this.currentChat;
            boolean z4 = chat5.verified;
            z3 = chat5.fake;
            str2 = str3;
            str3 = str6;
            z2 = z4;
            z = chat5.scam;
        } else {
            str2 = null;
            z = 0;
            iMax = 0;
            z2 = false;
            z3 = false;
        }
        SimpleTextView simpleTextView = new SimpleTextView(context);
        simpleTextView.setTypeface(AndroidUtilities.bold());
        simpleTextView.setTextSize(20);
        int i5 = Theme.key_dialogTextBlack;
        simpleTextView.setTextColor(getThemedColor(i5));
        simpleTextView.setText(str3);
        simpleTextView.setGravity(17);
        linearLayout.addView(simpleTextView, LayoutHelper.createLinear(-2, -2, 49, 10, 10, 10, iMax > 0 ? 0 : 20));
        if (z != 0 || z3) {
            simpleTextView.setRightDrawable(getScamDrawable(!z));
        } else if (z2) {
            simpleTextView.setRightDrawable(getVerifiedCrossfadeDrawable());
        }
        TLRPC.ChatInvite chatInvite6 = this.chatInvite;
        final boolean z5 = (chatInvite6 != null && ((chatInvite6.channel && !chatInvite6.megagroup) || ChatObject.isChannelAndNotMegaGroup(chatInvite6.chat))) || (ChatObject.isChannel(this.currentChat) && !this.currentChat.megagroup);
        boolean zIsEmpty = TextUtils.isEmpty(str2);
        TextView textViewM = RichMessageLayout$$ExternalSyntheticOutline0.m(context, 1, 13.0f);
        int i6 = Theme.key_dialogTextGray3;
        textViewM.setTextColor(getThemedColor(i6));
        textViewM.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textViewM.setEllipsize(truncateAt);
        if (this.chatInvite == null || i != 0) {
            textViewM.setText(z5 ? LocaleController.getString(R.string.ChannelPrivate).toLowerCase() : LocaleController.getString(R.string.MegaPrivate).toLowerCase());
        } else {
            textViewM.setText(LocaleController.getString(R.string.ChannelPublic).toLowerCase());
        }
        linearLayout.addView(textViewM, LayoutHelper.createLinear(-2, -2, 49, 10, 0, 10, !zIsEmpty ? 0 : 20));
        if (!zIsEmpty) {
            TextView textView = new TextView(context);
            textView.setGravity(17);
            textView.setText(str2);
            textView.setTextColor(getThemedColor(i5));
            textView.setTextSize(1, 15.0f);
            linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 48, 24, 10, 24, 20));
        }
        TLRPC.ChatInvite chatInvite7 = this.chatInvite;
        if (chatInvite7 == null || chatInvite7.request_needed) {
            FrameLayout frameLayout2 = new FrameLayout(getContext());
            linearLayout.addView(frameLayout2, LayoutHelper.createLinear(-1, -2));
            RadialProgressView radialProgressView = new RadialProgressView(getContext(), resourcesProvider);
            this.requestProgressView = radialProgressView;
            int i7 = Theme.key_featuredStickers_addButton;
            radialProgressView.setProgressColor(getThemedColor(i7));
            this.requestProgressView.setSize(AndroidUtilities.dp(32.0f));
            this.requestProgressView.setVisibility(4);
            frameLayout2.addView(this.requestProgressView, LayoutHelper.createFrame(48, 48, 17));
            TextView textView2 = new TextView(getContext());
            this.requestTextView = textView2;
            int iDp2 = AndroidUtilities.dp(24.0f);
            int themedColor = getThemedColor(i7);
            int themedColor2 = getThemedColor(Theme.key_featuredStickers_addButtonPressed);
            textView2.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp2, iDp2, iDp2, iDp2, themedColor, themedColor2, themedColor2));
            this.requestTextView.setEllipsize(truncateAt);
            this.requestTextView.setGravity(17);
            this.requestTextView.setSingleLine(true);
            this.requestTextView.setText(LocaleController.getString(z5 ? R.string.RequestToJoinChannel : R.string.RequestToJoinGroup));
            this.requestTextView.setTextColor(getThemedColor(Theme.key_featuredStickers_buttonText));
            this.requestTextView.setTextSize(1, 14.0f);
            this.requestTextView.setTypeface(AndroidUtilities.bold());
            this.requestTextView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$new$8(z5, j, view);
                }
            });
            frameLayout2.addView(this.requestTextView, LayoutHelper.createLinear(-1, 48, 8388611, 14, 0, 14, 0));
            TextView textView3 = new TextView(getContext());
            textView3.setGravity(17);
            textView3.setTextSize(1, 14.0f);
            textView3.setText(LocaleController.getString(z5 ? R.string.RequestToJoinChannelDescription : R.string.RequestToJoinGroupDescription));
            textView3.setTextColor(getThemedColor(i6));
            linearLayout.addView(textView3, LayoutHelper.createLinear(-1, -2, 48, 24, 17, 24, 15));
            return;
        }
        if (chatInvite7.participants.isEmpty()) {
            f = 24.0f;
        } else {
            int iMin = Math.min(this.chatInvite.participants.size(), 3);
            AvatarsImageView avatarsImageView = new AvatarsImageView(context, false);
            avatarsImageView.setAvatarsTextSize(AndroidUtilities.dp(20.0f));
            float f2 = 38;
            avatarsImageView.setSize(AndroidUtilities.dp(f2));
            avatarsImageView.setCount(iMin);
            avatarsImageView.setStepFactor(0.65f);
            for (int i8 = 0; i8 < iMin; i8++) {
                avatarsImageView.setObject(i8, UserConfig.selectedAccount, this.chatInvite.participants.get(i8));
            }
            f = 24.0f;
            avatarsImageView.commitTransition(false);
            linearLayout.addView(avatarsImageView, LayoutHelper.createLinear((int) ((((0.65f * f2) + 1.0f) * (iMin - 1)) + f2), 44, 17, 0, 2, 0, 4));
            TextView textView4 = new TextView(context);
            textView4.setTextSize(1, 13.0f);
            textView4.setTextColor(getThemedColor(Theme.key_dialogTextGray3));
            textView4.setGravity(17);
            if (iMin == 1) {
                string = ellipsize(textView4, this.chatInvite, 0).toString();
            } else if (iMin == 2) {
                string = LocaleController.formatString("RequestToJoinMembersTwo", R.string.RequestToJoinMembersTwo, ellipsize(textView4, this.chatInvite, 0), ellipsize(textView4, this.chatInvite, 1));
            } else if (iMax == 3) {
                string = LocaleController.formatString("RequestToJoinMembersThree", R.string.RequestToJoinMembersThree, ellipsize(textView4, this.chatInvite, 0), ellipsize(textView4, this.chatInvite, 1), ellipsize(textView4, this.chatInvite, 2));
            } else {
                int iMax2 = Math.max(iMax - iMin, 2);
                string = String.format(LocaleController.getPluralString("RequestToJoinMembersAll", iMax2), ellipsize(textView4, this.chatInvite, 0), ellipsize(textView4, this.chatInvite, 1), Integer.valueOf(iMax2));
            }
            textView4.setText(string);
            linearLayout.addView(textView4, LayoutHelper.createLinear(-2, -2, 49, 10, 0, 10, 24));
        }
        TLRPC.ChatInvite chatInvite8 = this.chatInvite;
        boolean z6 = (chatInvite8.channel && !chatInvite8.megagroup) || (ChatObject.isChannel(chatInvite8.chat) && !this.chatInvite.chat.megagroup);
        TextView textView5 = new TextView(getContext());
        int iDp3 = AndroidUtilities.dp(f);
        int themedColor3 = getThemedColor(Theme.key_featuredStickers_addButton);
        int themedColor4 = getThemedColor(Theme.key_featuredStickers_addButtonPressed);
        textView5.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp3, iDp3, iDp3, iDp3, themedColor3, themedColor4, themedColor4));
        ScaleStateListAnimator.apply(textView5, 0.02f, 1.2f);
        textView5.setEllipsize(TextUtils.TruncateAt.END);
        textView5.setGravity(17);
        textView5.setSingleLine(true);
        textView5.setText(LocaleController.getString(z6 ? R.string.ProfileJoinChannel : R.string.ProfileJoinGroup));
        textView5.setTextColor(getThemedColor(Theme.key_featuredStickers_buttonText));
        textView5.setTextSize(1, 14.0f);
        textView5.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView5, LayoutHelper.createLinear(-1, 48, 8388611, 14, 0, 14, 14));
        textView5.setOnClickListener(new JoinGroupAlert$$ExternalSyntheticLambda12(this, j, i));
    }

    public static void showBulletin(Context context, BaseFragment baseFragment, BulletinFactory bulletinFactory, boolean z) {
        if (context == null) {
            if (baseFragment != null) {
                baseFragment.getContext();
                return;
            }
            return;
        }
        if (bulletinFactory == null) {
            bulletinFactory = BulletinFactory.of(baseFragment);
        }
        Bulletin.TwoLineLottieLayout twoLineLottieLayout = new Bulletin.TwoLineLottieLayout(context, baseFragment.getResourceProvider());
        twoLineLottieLayout.imageView.setAnimation(R.raw.timer_3, 28, 28);
        twoLineLottieLayout.titleTextView.setText(LocaleController.getString(R.string.RequestToJoinSent));
        twoLineLottieLayout.subtitleTextView.setText(z ? LocaleController.getString(R.string.RequestToJoinChannelSentDescription) : LocaleController.getString(R.string.RequestToJoinGroupSentDescription));
        bulletinFactory.create(twoLineLottieLayout, 2750).show();
    }
}
