package org.telegram.ui.Components;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
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
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.Bulletin;

public class JoinGroupAlert extends BottomSheet {
    private TLRPC.ChatInvite chatInvite;
    private TLRPC.Chat currentChat;
    private final BaseFragment fragment;
    private final String hash;
    private RadialProgressView requestProgressView;
    private TextView requestTextView;

    public JoinGroupAlert(Context context, TLObject tLObject, String str, BaseFragment baseFragment, Theme.ResourcesProvider resourcesProvider) {
        this(context, tLObject, str, baseFragment, resourcesProvider, -1);
    }

    public JoinGroupAlert(Context context, TLObject tLObject, String str, BaseFragment baseFragment, Theme.ResourcesProvider resourcesProvider, final int i) {
        final long j;
        String str2;
        String str3;
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        String lowerCase;
        boolean z4;
        CharSequence string;
        super(context, false, resourcesProvider);
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
                str2 = str;
            }
            str2 = str;
            j = 0;
        } else {
            if (tLObject instanceof TLRPC.Chat) {
                TLRPC.Chat chat2 = (TLRPC.Chat) tLObject;
                this.currentChat = chat2;
                j = chat2.id;
                str2 = str;
            }
            str2 = str;
            j = 0;
        }
        this.hash = str2;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClickable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(linearLayout);
        NestedScrollView nestedScrollView = new NestedScrollView(context);
        nestedScrollView.addView(frameLayout);
        setCustomView(nestedScrollView);
        ImageView imageView = new ImageView(context);
        imageView.setBackground(Theme.createSelectorDrawable(getThemedColor(Theme.key_listSelector)));
        imageView.setColorFilter(getThemedColor(Theme.key_sheet_other));
        imageView.setImageResource(R.drawable.ic_layer_close);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$new$0(view);
            }
        });
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
                str = chat3.title;
                i2 = chat3.participants_count;
                backupImageView.setForUserOrChat(chat3, avatarDrawable, chatInvite3);
            } else {
                AvatarDrawable avatarDrawable2 = new AvatarDrawable();
                avatarDrawable2.setInfo(0L, this.chatInvite.title, null);
                TLRPC.ChatInvite chatInvite4 = this.chatInvite;
                String str4 = chatInvite4.title;
                int i3 = chatInvite4.participants_count;
                backupImageView.setImage(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(chatInvite4.photo.sizes, 50), this.chatInvite.photo), "50_50", avatarDrawable2, this.chatInvite);
                str = str4;
                i2 = i3;
            }
            TLRPC.ChatInvite chatInvite5 = this.chatInvite;
            str3 = chatInvite5.about;
            z2 = chatInvite5.verified;
            z3 = chatInvite5.fake;
            z = chatInvite5.scam;
        } else if (this.currentChat != null) {
            AvatarDrawable avatarDrawable3 = new AvatarDrawable(this.currentChat);
            String str5 = this.currentChat.title;
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(this.currentChat.id);
            str = chatFull != null ? chatFull.about : null;
            int iMax = Math.max(this.currentChat.participants_count, chatFull != null ? chatFull.participants_count : 0);
            TLRPC.Chat chat4 = this.currentChat;
            backupImageView.setForUserOrChat(chat4, avatarDrawable3, chat4);
            TLRPC.Chat chat5 = this.currentChat;
            z2 = chat5.verified;
            z3 = chat5.fake;
            str3 = str;
            str = str5;
            z = chat5.scam;
            i2 = iMax;
        } else {
            str3 = null;
            i2 = 0;
            z = 0;
            z2 = false;
            z3 = false;
        }
        SimpleTextView simpleTextView = new SimpleTextView(context);
        simpleTextView.setTypeface(AndroidUtilities.bold());
        simpleTextView.setTextSize(20);
        int i4 = Theme.key_dialogTextBlack;
        simpleTextView.setTextColor(getThemedColor(i4));
        simpleTextView.setText(str);
        simpleTextView.setGravity(17);
        linearLayout.addView(simpleTextView, LayoutHelper.createLinear(-2, -2, 49, 10, 10, 10, i2 > 0 ? 0 : 20));
        if (z != 0 || z3) {
            simpleTextView.setRightDrawable(getScamDrawable(!z));
        } else if (z2) {
            simpleTextView.setRightDrawable(getVerifiedCrossfadeDrawable());
        }
        TLRPC.ChatInvite chatInvite6 = this.chatInvite;
        final boolean z5 = (chatInvite6 != null && ((chatInvite6.channel && !chatInvite6.megagroup) || ChatObject.isChannelAndNotMegaGroup(chatInvite6.chat))) || (ChatObject.isChannel(this.currentChat) && !this.currentChat.megagroup);
        boolean zIsEmpty = TextUtils.isEmpty(str3);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 13.0f);
        int i5 = Theme.key_dialogTextGray3;
        textView.setTextColor(getThemedColor(i5));
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        if (this.chatInvite != null && i == 0) {
            textView.setText(LocaleController.getString(R.string.ChannelPublic).toLowerCase());
        } else {
            if (z5) {
                lowerCase = LocaleController.getString(R.string.ChannelPrivate).toLowerCase();
            } else {
                lowerCase = LocaleController.getString(R.string.MegaPrivate).toLowerCase();
            }
            textView.setText(lowerCase);
        }
        linearLayout.addView(textView, LayoutHelper.createLinear(-2, -2, 49, 10, 0, 10, !zIsEmpty ? 0 : 20));
        if (!zIsEmpty) {
            TextView textView2 = new TextView(context);
            textView2.setGravity(17);
            textView2.setText(str3);
            textView2.setTextColor(getThemedColor(i4));
            textView2.setTextSize(1, 15.0f);
            linearLayout.addView(textView2, LayoutHelper.createLinear(-1, -2, 48, 24, 10, 24, 20));
        }
        TLRPC.ChatInvite chatInvite7 = this.chatInvite;
        if (chatInvite7 == null || chatInvite7.request_needed) {
            FrameLayout frameLayout2 = new FrameLayout(getContext());
            linearLayout.addView(frameLayout2, LayoutHelper.createLinear(-1, -2));
            RadialProgressView radialProgressView = new RadialProgressView(getContext(), resourcesProvider);
            this.requestProgressView = radialProgressView;
            int i6 = Theme.key_featuredStickers_addButton;
            radialProgressView.setProgressColor(getThemedColor(i6));
            this.requestProgressView.setSize(AndroidUtilities.dp(32.0f));
            this.requestProgressView.setVisibility(4);
            frameLayout2.addView(this.requestProgressView, LayoutHelper.createFrame(48, 48, 17));
            TextView textView3 = new TextView(getContext());
            this.requestTextView = textView3;
            textView3.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(24.0f), getThemedColor(i6), getThemedColor(Theme.key_featuredStickers_addButtonPressed)));
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
            TextView textView4 = new TextView(getContext());
            textView4.setGravity(17);
            textView4.setTextSize(1, 14.0f);
            textView4.setText(LocaleController.getString(z5 ? R.string.RequestToJoinChannelDescription : R.string.RequestToJoinGroupDescription));
            textView4.setTextColor(getThemedColor(i5));
            linearLayout.addView(textView4, LayoutHelper.createLinear(-1, -2, 48, 24, 17, 24, 15));
            return;
        }
        if (chatInvite7.participants.isEmpty()) {
            z4 = false;
        } else {
            int iMin = Math.min(this.chatInvite.participants.size(), 3);
            AvatarsImageView avatarsImageView = new AvatarsImageView(context, false);
            avatarsImageView.setAvatarsTextSize(AndroidUtilities.dp(20.0f));
            float f = 38;
            avatarsImageView.setSize(AndroidUtilities.dp(f));
            avatarsImageView.setCount(iMin);
            avatarsImageView.setStepFactor(0.65f);
            for (int i7 = 0; i7 < iMin; i7++) {
                avatarsImageView.setObject(i7, UserConfig.selectedAccount, this.chatInvite.participants.get(i7));
            }
            avatarsImageView.commitTransition(false);
            linearLayout.addView(avatarsImageView, LayoutHelper.createLinear((int) (f + ((iMin - 1) * ((0.65f * f) + 1.0f))), 44, 17, 0, 2, 0, 4));
            TextView textView5 = new TextView(context);
            textView5.setTextSize(1, 13.0f);
            textView5.setTextColor(getThemedColor(Theme.key_dialogTextGray3));
            textView5.setGravity(17);
            if (iMin == 1) {
                z4 = false;
                string = ellipsize(textView5, this.chatInvite, 0).toString();
            } else {
                z4 = false;
                if (iMin == 2) {
                    string = LocaleController.formatString("RequestToJoinMembersTwo", R.string.RequestToJoinMembersTwo, ellipsize(textView5, this.chatInvite, 0), ellipsize(textView5, this.chatInvite, 1));
                } else if (i2 == 3) {
                    string = LocaleController.formatString("RequestToJoinMembersThree", R.string.RequestToJoinMembersThree, ellipsize(textView5, this.chatInvite, 0), ellipsize(textView5, this.chatInvite, 1), ellipsize(textView5, this.chatInvite, 2));
                } else {
                    int iMax2 = Math.max(i2 - iMin, 2);
                    string = String.format(LocaleController.getPluralString("RequestToJoinMembersAll", iMax2), ellipsize(textView5, this.chatInvite, 0), ellipsize(textView5, this.chatInvite, 1), Integer.valueOf(iMax2));
                }
            }
            textView5.setText(string);
            linearLayout.addView(textView5, LayoutHelper.createLinear(-2, -2, 49, 10, 0, 10, 24));
        }
        TLRPC.ChatInvite chatInvite8 = this.chatInvite;
        if ((chatInvite8.channel && !chatInvite8.megagroup) || (ChatObject.isChannel(chatInvite8.chat) && !this.chatInvite.chat.megagroup)) {
            z4 = true;
        }
        TextView textView6 = new TextView(getContext());
        textView6.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(24.0f), getThemedColor(Theme.key_featuredStickers_addButton), getThemedColor(Theme.key_featuredStickers_addButtonPressed)));
        ScaleStateListAnimator.apply(textView6, 0.02f, 1.2f);
        textView6.setEllipsize(TextUtils.TruncateAt.END);
        textView6.setGravity(17);
        textView6.setSingleLine(true);
        textView6.setText(LocaleController.getString(z4 ? R.string.ProfileJoinChannel : R.string.ProfileJoinGroup));
        textView6.setTextColor(getThemedColor(Theme.key_featuredStickers_buttonText));
        textView6.setTextSize(1, 14.0f);
        textView6.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView6, LayoutHelper.createLinear(-1, 48, 8388611, 14, 0, 14, 14));
        textView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$new$12(j, i, view);
            }
        });
    }

    public void lambda$new$0(View view) {
        lambda$new$0();
    }

    public void lambda$new$8(final boolean z, final long j, View view) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$new$1();
            }
        }, 400L);
        if (this.chatInvite == null && this.currentChat != null) {
            MessagesController.getInstance(this.currentAccount).addUserToChat(this.currentChat.id, UserConfig.getInstance(this.currentAccount).getCurrentUser(), 0, null, null, true, new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$new$0();
                }
            }, new MessagesController.ErrorDelegate() {
                @Override
                public final boolean run(TLRPC.TL_error tL_error) {
                    return this.f$0.lambda$new$3(z, tL_error);
                }
            });
            return;
        }
        final TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
        tL_messages_importChatInvite.hash = this.hash;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_importChatInvite, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$new$7(j, z, tL_messages_importChatInvite, tLObject, tL_error);
            }
        }, 2);
    }

    public void lambda$new$1() {
        if (isDismissed()) {
            return;
        }
        this.requestTextView.setVisibility(4);
        this.requestProgressView.setVisibility(0);
    }

    public boolean lambda$new$3(final boolean z, TLRPC.TL_error tL_error) {
        if (tL_error != null && "INVITE_REQUEST_SENT".equals(tL_error.text)) {
            setOnDismissListener(new DialogInterface.OnDismissListener() {
                @Override
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f$0.lambda$new$2(z, dialogInterface);
                }
            });
        }
        lambda$new$0();
        return false;
    }

    public void lambda$new$2(boolean z, DialogInterface dialogInterface) {
        showBulletin(getContext(), this.fragment, z);
    }

    public void lambda$new$7(final long j, final boolean z, final TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite, TLObject tLObject, final TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.TL_chatInviteJoinResultOk) {
            MessagesController.getInstance(this.currentAccount).processUpdates(((TLRPC.TL_chatInviteJoinResultOk) tLObject).updates, false);
        } else if (tLObject instanceof TLRPC.TL_chatInviteJoinResultWebView) {
            final TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) tLObject;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$new$4(tL_chatInviteJoinResultWebView, j);
                }
            });
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$new$6(tL_error, z, tL_messages_importChatInvite);
            }
        });
    }

    public void lambda$new$4(TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j) {
        MessagesController.getInstance(this.currentAccount).putUsers(tL_chatInviteJoinResultWebView.users, false);
        BotGuardHelper.getInstance(this.currentAccount).openGuardBotWebApp(j, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.webview);
    }

    public void lambda$new$6(TLRPC.TL_error tL_error, final boolean z, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        BaseFragment baseFragment = this.fragment;
        if (baseFragment == null || baseFragment.getParentActivity() == null) {
            return;
        }
        if (tL_error != null) {
            if ("INVITE_REQUEST_SENT".equals(tL_error.text)) {
                setOnDismissListener(new DialogInterface.OnDismissListener() {
                    @Override
                    public final void onDismiss(DialogInterface dialogInterface) {
                        this.f$0.lambda$new$5(z, dialogInterface);
                    }
                });
            } else {
                AlertsCreator.processError(this.currentAccount, tL_error, this.fragment, tL_messages_importChatInvite, new Object[0]);
            }
        }
        lambda$new$0();
    }

    public void lambda$new$5(boolean z, DialogInterface dialogInterface) {
        showBulletin(getContext(), this.fragment, z);
    }

    public void lambda$new$12(final long j, final int i, View view) {
        lambda$new$0();
        final TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
        tL_messages_importChatInvite.hash = this.hash;
        ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_importChatInvite, null, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                this.f$0.lambda$new$11(j, i, tL_messages_importChatInvite, (TLRPC.ChatInviteJoinResult) obj, (TLRPC.TL_error) obj2);
            }
        }, 2);
    }

    public void lambda$new$11(final long j, final int i, final TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite, TLRPC.ChatInviteJoinResult chatInviteJoinResult, final TLRPC.TL_error tL_error) {
        final TLRPC.Updates updates;
        if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
            TLRPC.Updates updates2 = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
            MessagesController.getInstance(this.currentAccount).processUpdates(updates2, false);
            updates = updates2;
        } else {
            if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                final TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$new$9(tL_chatInviteJoinResultWebView, j);
                    }
                });
            }
            updates = null;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$new$10(tL_error, updates, i, tL_messages_importChatInvite);
            }
        });
    }

    public void lambda$new$9(TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j) {
        MessagesController.getInstance(this.currentAccount).putUsers(tL_chatInviteJoinResultWebView.users, false);
        BotGuardHelper.getInstance(this.currentAccount).openGuardBotWebApp(j, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.webview);
    }

    public void lambda$new$10(TLRPC.TL_error tL_error, TLRPC.Updates updates, int i, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        TLRPC.ChatInvite chatInvite;
        TLRPC.Chat chat;
        BaseFragment baseFragment = this.fragment;
        if (baseFragment == null || baseFragment.getParentActivity() == null) {
            return;
        }
        if (tL_error == null) {
            if (updates == null || updates.chats.isEmpty()) {
                return;
            }
            TLRPC.Chat chat2 = updates.chats.get(0);
            chat2.left = false;
            chat2.kicked = false;
            MessagesController.getInstance(this.currentAccount).putUsers(updates.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(updates.chats, false);
            openChat(chat2.id, !ChatObject.isChannelAndNotMegaGroup(chat2));
            return;
        }
        if ("USER_ALREADY_PARTICIPANT".equals(tL_error.text) && i == 0 && (chatInvite = this.chatInvite) != null && (chat = chatInvite.chat) != null) {
            openChat(chat.id, false);
        } else {
            AlertsCreator.processError(this.currentAccount, tL_error, this.fragment, tL_messages_importChatInvite, new Object[0]);
        }
    }

    private Drawable getVerifiedCrossfadeDrawable() {
        return new CombinedDrawable(Theme.dialogs_verifiedDrawable, Theme.dialogs_verifiedCheckDrawable);
    }

    public static void showBulletin(Context context, BaseFragment baseFragment, boolean z) {
        String string;
        if (context == null) {
            if (baseFragment != null) {
                baseFragment.getContext();
                return;
            }
            return;
        }
        Bulletin.TwoLineLottieLayout twoLineLottieLayout = new Bulletin.TwoLineLottieLayout(context, baseFragment.getResourceProvider());
        twoLineLottieLayout.imageView.setAnimation(R.raw.timer_3, 28, 28);
        twoLineLottieLayout.titleTextView.setText(LocaleController.getString(R.string.RequestToJoinSent));
        if (z) {
            string = LocaleController.getString(R.string.RequestToJoinChannelSentDescription);
        } else {
            string = LocaleController.getString(R.string.RequestToJoinGroupSentDescription);
        }
        twoLineLottieLayout.subtitleTextView.setText(string);
        Bulletin.make(baseFragment, twoLineLottieLayout, 2750).show();
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

    private void openChat(long j, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", j);
        if (MessagesController.getInstance(this.currentAccount).checkCanOpenChat(bundle, this.fragment)) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(bundle, z, j);
            BaseFragment baseFragment = this.fragment;
            baseFragment.presentFragment(anonymousClass1, baseFragment instanceof ChatActivity);
        }
    }

    class AnonymousClass1 extends ChatActivity {
        private boolean shownToast;
        final long val$chatId;
        final boolean val$showJoined;

        AnonymousClass1(Bundle bundle, boolean z, long j) {
            super(bundle);
            this.val$showJoined = z;
            this.val$chatId = j;
            this.shownToast = false;
        }

        @Override
        public void onBecomeFullyVisible() throws Resources.NotFoundException {
            super.onBecomeFullyVisible();
            if (this.shownToast || !this.val$showJoined) {
                return;
            }
            this.shownToast = true;
            final TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.val$chatId));
            if (ChatObject.canManageMyTag(chat)) {
                BulletinFactory bulletinFactoryOf = BulletinFactory.of(this);
                int i = R.raw.contact_check;
                String string = LocaleController.getString(R.string.JoinedGroup);
                String string2 = LocaleController.getString(R.string.JoinedGroupAddTag);
                final long j = this.val$chatId;
                bulletinFactoryOf.createSimpleBulletin(i, string, string2, new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$onBecomeFullyVisible$0(j, chat);
                    }
                }).hideAfterBottomSheet(false).show(true);
                return;
            }
            BulletinFactory.of(this).createSimpleBulletin(R.raw.contact_check, LocaleController.getString(R.string.JoinedGroup)).hideAfterBottomSheet(false).show(true);
        }

        public void lambda$onBecomeFullyVisible$0(long j, TLRPC.Chat chat) {
            if (AndroidUtilities.isContextSafe(getContext())) {
                TagEditCell.showSheet(getContext(), this.currentAccount, -j, getUserConfig().getCurrentUser(), null, chat.admin_rights != null, chat.creator, ((BottomSheet) JoinGroupAlert.this).resourcesProvider);
            }
        }
    }
}
