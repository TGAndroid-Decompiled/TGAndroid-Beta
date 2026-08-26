package org.telegram.ui.Components;

import android.content.Context;
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
import org.telegram.messenger.utils.FBool;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda168;
import org.telegram.ui.ChatUsersActivity$$ExternalSyntheticLambda13;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda1;
import org.telegram.ui.PollItemMenu$$ExternalSyntheticLambda12;
import org.telegram.ui.QrActivity$$ExternalSyntheticLambda15;
import org.telegram.ui.Stars.BotStarsActivity$$ExternalSyntheticLambda26;

public final class JoinGroupAlert extends BottomSheet {
    public static final int $r8$clinit = 0;
    public BulletinFactory bulletinFactory;
    public final TLRPC.ChatInvite chatInvite;
    public final TLRPC.Chat currentChat;
    public final BaseFragment fragment;
    public final String hash;
    public final RadialProgressView requestProgressView;
    public final TextView requestTextView;

    public final class AnonymousClass1 extends ChatActivity {
        public boolean shownToast;
        public final long val$chatId;
        public final boolean val$showJoined;

        public AnonymousClass1(Bundle bundle, boolean z, long j) {
            super(bundle);
            this.val$showJoined = z;
            this.val$chatId = j;
            this.shownToast = false;
        }

        public final void lambda$onBecomeFullyVisible$0(TLRPC.Chat chat, long j) {
            if (AndroidUtilities.isContextSafe(getParentActivity())) {
                TagEditCell.showSheet(getParentActivity(), this.currentAccount, -j, getUserConfig().getCurrentUser(), null, chat.admin_rights != null, chat.creator, ((BottomSheet) JoinGroupAlert.this).resourcesProvider);
            }
        }

        @Override
        public final void onBecomeFullyVisible() {
            super.onBecomeFullyVisible();
            if (this.shownToast || !this.val$showJoined) {
                return;
            }
            this.shownToast = true;
            MessagesController messagesController = getMessagesController();
            long j = this.val$chatId;
            TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j));
            if (!ChatObject.canManageMyTag(chat)) {
                Bulletin bulletinCreateSimpleBulletinWithIconSize = BulletinFactory.of(this).createSimpleBulletinWithIconSize(R.raw.contact_check, 36, LocaleController.getString(R.string.JoinedGroup));
                bulletinCreateSimpleBulletinWithIconSize.hideAfterBottomSheet = false;
                bulletinCreateSimpleBulletinWithIconSize.show(true);
                return;
            }
            Bulletin bulletinCreateSimpleBulletin = BulletinFactory.of(this).createSimpleBulletin(R.raw.contact_check, LocaleController.getString(R.string.JoinedGroup), new PollItemMenu$$ExternalSyntheticLambda12(this, j, chat, 13), LocaleController.getString(R.string.JoinedGroupAddTag));
            bulletinCreateSimpleBulletin.hideAfterBottomSheet = false;
            bulletinCreateSimpleBulletin.show(true);
        }
    }

    public JoinGroupAlert(Context context, TLObject tLObject, String str, BaseFragment baseFragment, Theme.ResourcesProvider resourcesProvider) {
        final long j;
        String str2;
        boolean z;
        boolean z2;
        boolean z3;
        int iMax;
        float f;
        AvatarsDrawable avatarsDrawable;
        String string;
        super(context, resourcesProvider, false, false);
        int i = 4;
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
        imageView.setOnClickListener(new SearchField$$ExternalSyntheticLambda0(this, i));
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
                iMax = chat3.participants_count;
                backupImageView.imageReceiver.setForUserOrChat(chat3, avatarDrawable, chatInvite3);
                backupImageView.onNewImageSet();
                str3 = str4;
            } else {
                AvatarDrawable avatarDrawable2 = new AvatarDrawable((Theme.ResourcesProvider) null);
                avatarDrawable2.setInfo(0L, this.chatInvite.title, null, null, null);
                TLRPC.ChatInvite chatInvite4 = this.chatInvite;
                String str5 = chatInvite4.title;
                iMax = chatInvite4.participants_count;
                backupImageView.setImage(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(chatInvite4.photo.sizes, 50), this.chatInvite.photo), "50_50", avatarDrawable2, this.chatInvite);
                str3 = str5;
            }
            TLRPC.ChatInvite chatInvite5 = this.chatInvite;
            str2 = chatInvite5.about;
            z2 = chatInvite5.verified;
            z3 = chatInvite5.fake;
            z = chatInvite5.scam;
        } else if (this.currentChat != null) {
            AvatarDrawable avatarDrawable3 = new AvatarDrawable(this.currentChat);
            String str6 = this.currentChat.title;
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(this.currentChat.id);
            str3 = chatFull != null ? chatFull.about : null;
            iMax = Math.max(this.currentChat.participants_count, chatFull != null ? chatFull.participants_count : 0);
            TLRPC.Chat chat4 = this.currentChat;
            backupImageView.imageReceiver.setForUserOrChat(chat4, avatarDrawable3, chat4);
            backupImageView.onNewImageSet();
            TLRPC.Chat chat5 = this.currentChat;
            z2 = chat5.verified;
            z3 = chat5.fake;
            z = chat5.scam;
            String str7 = str3;
            str3 = str6;
            str2 = str7;
        } else {
            str2 = null;
            z = false;
            z2 = false;
            z3 = false;
            iMax = 0;
        }
        SimpleTextView simpleTextView = new SimpleTextView(context);
        simpleTextView.setTypeface(AndroidUtilities.bold());
        simpleTextView.setTextSize(20);
        int i2 = Theme.key_dialogTextBlack;
        simpleTextView.setTextColor(getThemedColor(i2));
        simpleTextView.setText(str3, false);
        simpleTextView.setGravity(17);
        linearLayout.addView(simpleTextView, LayoutHelper.createLinear(-2, -2, 49, 10, 10, 10, iMax > 0 ? 0 : 20));
        if (z || z3) {
            simpleTextView.setRightDrawable(z ? Theme.dialogs_scamDrawable : Theme.dialogs_fakeDrawable);
        } else if (z2) {
            simpleTextView.setRightDrawable(new CombinedDrawable(Theme.dialogs_verifiedDrawable, Theme.dialogs_verifiedCheckDrawable));
        }
        TLRPC.ChatInvite chatInvite6 = this.chatInvite;
        final boolean z4 = (chatInvite6 != null && ((chatInvite6.channel && !chatInvite6.megagroup) || ChatObject.isChannelAndNotMegaGroup(chatInvite6.chat))) || (ChatObject.isChannel(this.currentChat) && !this.currentChat.megagroup);
        boolean zIsEmpty = TextUtils.isEmpty(str2);
        TextView textViewM = RichMessageLayout$$ExternalSyntheticOutline0.m(context, 1, 13.0f);
        int i3 = Theme.key_dialogTextGray3;
        textViewM.setTextColor(getThemedColor(i3));
        textViewM.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textViewM.setEllipsize(truncateAt);
        textViewM.setText(z4 ? LocaleController.getString(R.string.ChannelPrivate).toLowerCase() : LocaleController.getString(R.string.MegaPrivate).toLowerCase());
        linearLayout.addView(textViewM, LayoutHelper.createLinear(-2, -2, 49, 10, 0, 10, !zIsEmpty ? 0 : 20));
        if (!zIsEmpty) {
            TextView textView = new TextView(context);
            textView.setGravity(17);
            textView.setText(str2);
            textView.setTextColor(getThemedColor(i2));
            textView.setTextSize(1, 15.0f);
            linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 48, 24, 10, 24, 20));
        }
        TLRPC.ChatInvite chatInvite7 = this.chatInvite;
        if (chatInvite7 == null || chatInvite7.request_needed) {
            FrameLayout frameLayout2 = new FrameLayout(getContext());
            linearLayout.addView(frameLayout2, LayoutHelper.createLinear(-1, -2));
            RadialProgressView radialProgressView = new RadialProgressView(getContext(), resourcesProvider);
            this.requestProgressView = radialProgressView;
            int i4 = Theme.key_featuredStickers_addButton;
            radialProgressView.setProgressColor(getThemedColor(i4));
            radialProgressView.setSize(AndroidUtilities.dp(32.0f));
            radialProgressView.setVisibility(4);
            frameLayout2.addView(radialProgressView, LayoutHelper.createFrame(48, 48, 17));
            TextView textView2 = new TextView(getContext());
            this.requestTextView = textView2;
            int iDp2 = AndroidUtilities.dp(24.0f);
            int themedColor = getThemedColor(i4);
            int themedColor2 = getThemedColor(Theme.key_featuredStickers_addButtonPressed);
            textView2.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp2, iDp2, iDp2, iDp2, themedColor, themedColor2, themedColor2));
            textView2.setEllipsize(truncateAt);
            textView2.setGravity(17);
            textView2.setSingleLine(true);
            textView2.setText(LocaleController.getString(z4 ? R.string.RequestToJoinChannel : R.string.RequestToJoinGroup));
            textView2.setTextColor(getThemedColor(Theme.key_featuredStickers_buttonText));
            textView2.setTextSize(1, 14.0f);
            textView2.setTypeface(AndroidUtilities.bold());
            textView2.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$new$8(j, z4);
                }
            });
            frameLayout2.addView(textView2, LayoutHelper.createLinear(-1, 48, 8388611, 14, 0, 14, 0));
            TextView textView3 = new TextView(getContext());
            textView3.setGravity(17);
            textView3.setTextSize(1, 14.0f);
            textView3.setText(LocaleController.getString(z4 ? R.string.RequestToJoinChannelDescription : R.string.RequestToJoinGroupDescription));
            textView3.setTextColor(getThemedColor(i3));
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
            int i5 = 0;
            while (true) {
                avatarsDrawable = avatarsImageView.avatarsDrawable;
                if (i5 >= iMin) {
                    break;
                }
                avatarsDrawable.setObject(i5, this.chatInvite.participants.get(i5), UserConfig.selectedAccount);
                i5++;
            }
            f = 24.0f;
            avatarsDrawable.commitTransition(false, true);
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
        boolean z5 = (chatInvite8.channel && !chatInvite8.megagroup) || (ChatObject.isChannel(chatInvite8.chat) && !this.chatInvite.chat.megagroup);
        TextView textView5 = new TextView(getContext());
        int iDp3 = AndroidUtilities.dp(f);
        int themedColor3 = getThemedColor(Theme.key_featuredStickers_addButton);
        int themedColor4 = getThemedColor(Theme.key_featuredStickers_addButtonPressed);
        textView5.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp3, iDp3, iDp3, iDp3, themedColor3, themedColor4, themedColor4));
        ScaleStateListAnimator.apply(textView5, 0.02f, 1.2f);
        textView5.setEllipsize(TextUtils.TruncateAt.END);
        textView5.setGravity(17);
        textView5.setSingleLine(true);
        textView5.setText(LocaleController.getString(z5 ? R.string.ProfileJoinChannel : R.string.ProfileJoinGroup));
        textView5.setTextColor(getThemedColor(Theme.key_featuredStickers_buttonText));
        textView5.setTextSize(1, 14.0f);
        textView5.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView5, LayoutHelper.createLinear(-1, 48, 8388611, 14, 0, 14, 14));
        textView5.setOnClickListener(new GiftSheet$$ExternalSyntheticLambda1(this, j, 1));
    }

    public static CharSequence ellipsize(TextView textView, TLRPC.ChatInvite chatInvite, int i) {
        String str = chatInvite.participants.get(i).first_name;
        if (str == null) {
            str = "";
        }
        return TextUtils.ellipsize(str.trim(), textView.getPaint(), AndroidUtilities.dp(120.0f), TextUtils.TruncateAt.END);
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
        twoLineLottieLayout.imageView.setAnimation(R.raw.timer_3, 28, 28, null);
        twoLineLottieLayout.titleTextView.setText(LocaleController.getString(R.string.RequestToJoinSent));
        twoLineLottieLayout.subtitleTextView.setText(z ? LocaleController.getString(R.string.RequestToJoinChannelSentDescription) : LocaleController.getString(R.string.RequestToJoinGroupSentDescription));
        bulletinFactory.create(twoLineLottieLayout, 2750).show();
    }

    public final void lambda$new$10(TLRPC.TL_error tL_error, TLRPC.Updates updates, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        BaseFragment baseFragment = this.fragment;
        if (baseFragment != null && baseFragment.getParentActivity() != null) {
            if (tL_error != null) {
                "USER_ALREADY_PARTICIPANT".equals(tL_error.text);
                AlertsCreator.processError(this.currentAccount, tL_error, baseFragment, tL_messages_importChatInvite, new Object[0]);
                return;
            }
            if (updates != null && !updates.chats.isEmpty()) {
                TLRPC.Chat chat = updates.chats.get(0);
                chat.left = false;
                chat.kicked = false;
                MessagesController.getInstance(this.currentAccount).putUsers(updates.users, false);
                MessagesController.getInstance(this.currentAccount).putChats(updates.chats, false);
                long j = chat.id;
                boolean z = !ChatObject.isChannelAndNotMegaGroup(chat);
                Bundle bundleM = FBool.m(j, "chat_id");
                if (MessagesController.getInstance(this.currentAccount).checkCanOpenChat(bundleM, baseFragment)) {
                    baseFragment.presentFragment(new AnonymousClass1(bundleM, z, j), baseFragment instanceof ChatActivity);
                }
            }
        }
    }

    public final void lambda$new$11(long j, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite, TLRPC.ChatInviteJoinResult chatInviteJoinResult, TLRPC.TL_error tL_error) {
        TLRPC.Updates updates;
        if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
            TLRPC.Updates updates2 = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
            MessagesController.getInstance(this.currentAccount).processUpdates(updates2, false);
            updates = updates2;
        } else {
            if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                AndroidUtilities.runOnUIThread(new JoinGroupAlert$$ExternalSyntheticLambda8(this, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult, j, 0));
            }
            updates = null;
        }
        AndroidUtilities.runOnUIThread(new ChatUsersActivity$$ExternalSyntheticLambda13((Object) this, (Object) tL_error, (Object) updates, (Object) tL_messages_importChatInvite, 13));
    }

    public final void lambda$new$12(long j) {
        lambda$showGiftOfferSheet$15();
        TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
        tL_messages_importChatInvite.hash = this.hash;
        ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_importChatInvite, null, new JoinGroupAlert$$ExternalSyntheticLambda3(this, j, tL_messages_importChatInvite), 2);
    }

    public final void lambda$new$4(TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j) {
        MessagesController.getInstance(this.currentAccount).putUsers(tL_chatInviteJoinResultWebView.users, false);
        BotGuardHelper.getInstance(this.currentAccount).openGuardBotWebApp(j, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id);
    }

    public final void lambda$new$6(TLRPC.TL_error tL_error, boolean z, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        BaseFragment baseFragment = this.fragment;
        if (baseFragment == null || baseFragment.getParentActivity() == null) {
            return;
        }
        if (tL_error != null) {
            if ("INVITE_REQUEST_SENT".equals(tL_error.text)) {
                setOnDismissListener(new JoinGroupAlert$$ExternalSyntheticLambda12(1, this, z));
            } else {
                AlertsCreator.processError(this.currentAccount, tL_error, baseFragment, tL_messages_importChatInvite, new Object[0]);
            }
        }
        lambda$showGiftOfferSheet$15();
    }

    public final void lambda$new$7(long j, boolean z, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.TL_chatInviteJoinResultOk) {
            MessagesController.getInstance(this.currentAccount).processUpdates(((TLRPC.TL_chatInviteJoinResultOk) tLObject).updates, false);
        } else if (tLObject instanceof TLRPC.TL_chatInviteJoinResultWebView) {
            AndroidUtilities.runOnUIThread(new JoinGroupAlert$$ExternalSyntheticLambda8(this, (TLRPC.TL_chatInviteJoinResultWebView) tLObject, j, 1));
        }
        AndroidUtilities.runOnUIThread(new QrActivity$$ExternalSyntheticLambda15(this, tL_error, z, tL_messages_importChatInvite, 12));
    }

    public final void lambda$new$8(long j, boolean z) {
        TLRPC.Chat chat;
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
                        JoinGroupAlert joinGroupAlert = this.f$0;
                        if (!joinGroupAlert.isDismissed()) {
                            joinGroupAlert.requestTextView.setVisibility(4);
                            joinGroupAlert.requestProgressView.setVisibility(0);
                        }
                        break;
                    default:
                        this.f$0.lambda$showGiftOfferSheet$15();
                        break;
                }
            }
        }, 400L);
        if (this.chatInvite == null && (chat = this.currentChat) != null) {
            final int i2 = 1;
            MessagesController.getInstance(this.currentAccount).addUserToChat(chat.id, UserConfig.getInstance(this.currentAccount).getCurrentUser(), 0, null, null, true, new Runnable(this) {
                public final JoinGroupAlert f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run() {
                    switch (i2) {
                        case 0:
                            JoinGroupAlert joinGroupAlert = this.f$0;
                            if (!joinGroupAlert.isDismissed()) {
                                joinGroupAlert.requestTextView.setVisibility(4);
                                joinGroupAlert.requestProgressView.setVisibility(0);
                            }
                            break;
                        default:
                            this.f$0.lambda$showGiftOfferSheet$15();
                            break;
                    }
                }
            }, new ChatActivity$$ExternalSyntheticLambda168(5, this, z));
        } else {
            TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
            tL_messages_importChatInvite.hash = this.hash;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_importChatInvite, new BotStarsActivity$$ExternalSyntheticLambda26(this, j, z, tL_messages_importChatInvite), 2);
        }
    }

    public final void lambda$new$9(TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j) {
        MessagesController.getInstance(this.currentAccount).putUsers(tL_chatInviteJoinResultWebView.users, false);
        BotGuardHelper.getInstance(this.currentAccount).openGuardBotWebApp(j, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id);
    }
}
