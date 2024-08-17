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
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$ChatFull;
import org.telegram.tgnet.TLRPC$ChatInvite;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_messages_importChatInvite;
import org.telegram.tgnet.TLRPC$Updates;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.Bulletin;

public class JoinGroupAlert extends BottomSheet {
    private TLRPC$ChatInvite chatInvite;
    private TLRPC$Chat currentChat;
    private final BaseFragment fragment;
    private final String hash;
    private RadialProgressView requestProgressView;
    private TextView requestTextView;

    public JoinGroupAlert(Context context, TLObject tLObject, String str, BaseFragment baseFragment, Theme.ResourcesProvider resourcesProvider) {
        this(context, tLObject, str, baseFragment, resourcesProvider, -1);
    }

    public JoinGroupAlert(Context context, TLObject tLObject, String str, BaseFragment baseFragment, Theme.ResourcesProvider resourcesProvider, final int i) {
        super(context, false, resourcesProvider);
        String str2;
        boolean z;
        boolean z2;
        boolean z3;
        int i2;
        String lowerCase;
        int i3;
        String str3;
        int i4;
        String str4;
        boolean z4;
        int i5;
        String str5;
        CharSequence format;
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        fixNavigationBar(getThemedColor(Theme.key_windowBackgroundWhite));
        this.fragment = baseFragment;
        if (tLObject instanceof TLRPC$ChatInvite) {
            this.chatInvite = (TLRPC$ChatInvite) tLObject;
        } else if (tLObject instanceof TLRPC$Chat) {
            this.currentChat = (TLRPC$Chat) tLObject;
        }
        this.hash = str;
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
                JoinGroupAlert.this.lambda$new$0(view);
            }
        });
        int dp = AndroidUtilities.dp(8.0f);
        imageView.setPadding(dp, dp, dp, dp);
        frameLayout.addView(imageView, LayoutHelper.createFrame(36, 36.0f, 8388661, 6.0f, 8.0f, 8.0f, 0.0f));
        BackupImageView backupImageView = new BackupImageView(context);
        backupImageView.setRoundRadius(AndroidUtilities.dp(45.0f));
        linearLayout.addView(backupImageView, LayoutHelper.createLinear(90, 90, 49, 0, 27, 0, 0));
        TLRPC$ChatInvite tLRPC$ChatInvite = this.chatInvite;
        if (tLRPC$ChatInvite != null) {
            if (tLRPC$ChatInvite.chat != null) {
                AvatarDrawable avatarDrawable = new AvatarDrawable(this.chatInvite.chat);
                TLRPC$ChatInvite tLRPC$ChatInvite2 = this.chatInvite;
                TLRPC$Chat tLRPC$Chat = tLRPC$ChatInvite2.chat;
                String str6 = tLRPC$Chat.title;
                i2 = tLRPC$Chat.participants_count;
                backupImageView.setForUserOrChat(tLRPC$Chat, avatarDrawable, tLRPC$ChatInvite2);
                r12 = str6;
            } else {
                AvatarDrawable avatarDrawable2 = new AvatarDrawable();
                avatarDrawable2.setInfo(0L, this.chatInvite.title, null);
                TLRPC$ChatInvite tLRPC$ChatInvite3 = this.chatInvite;
                String str7 = tLRPC$ChatInvite3.title;
                i2 = tLRPC$ChatInvite3.participants_count;
                backupImageView.setImage(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(tLRPC$ChatInvite3.photo.sizes, 50), this.chatInvite.photo), "50_50", avatarDrawable2, this.chatInvite);
                r12 = str7;
            }
            TLRPC$ChatInvite tLRPC$ChatInvite4 = this.chatInvite;
            str2 = tLRPC$ChatInvite4.about;
            z2 = tLRPC$ChatInvite4.verified;
            z3 = tLRPC$ChatInvite4.fake;
            z = tLRPC$ChatInvite4.scam;
        } else if (this.currentChat != null) {
            AvatarDrawable avatarDrawable3 = new AvatarDrawable(this.currentChat);
            String str8 = this.currentChat.title;
            TLRPC$ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(this.currentChat.id);
            r12 = chatFull != null ? chatFull.about : null;
            i2 = Math.max(this.currentChat.participants_count, chatFull != null ? chatFull.participants_count : 0);
            TLRPC$Chat tLRPC$Chat2 = this.currentChat;
            backupImageView.setForUserOrChat(tLRPC$Chat2, avatarDrawable3, tLRPC$Chat2);
            TLRPC$Chat tLRPC$Chat3 = this.currentChat;
            boolean z5 = tLRPC$Chat3.verified;
            z3 = tLRPC$Chat3.fake;
            z2 = z5;
            str2 = r12;
            r12 = str8;
            z = tLRPC$Chat3.scam;
        } else {
            str2 = null;
            z = 0;
            z2 = false;
            z3 = false;
            i2 = 0;
        }
        SimpleTextView simpleTextView = new SimpleTextView(context);
        simpleTextView.setTypeface(AndroidUtilities.bold());
        simpleTextView.setTextSize(20);
        int i6 = Theme.key_dialogTextBlack;
        simpleTextView.setTextColor(getThemedColor(i6));
        simpleTextView.setText(r12);
        simpleTextView.setGravity(17);
        linearLayout.addView(simpleTextView, LayoutHelper.createLinear(-2, -2, 49, 10, 10, 10, i2 > 0 ? 0 : 20));
        if (z != 0 || z3) {
            simpleTextView.setRightDrawable(getScamDrawable(!z));
        } else if (z2) {
            simpleTextView.setRightDrawable(getVerifiedCrossfadeDrawable());
        }
        TLRPC$ChatInvite tLRPC$ChatInvite5 = this.chatInvite;
        final boolean z6 = (tLRPC$ChatInvite5 != null && ((tLRPC$ChatInvite5.channel && !tLRPC$ChatInvite5.megagroup) || ChatObject.isChannelAndNotMegaGroup(tLRPC$ChatInvite5.chat))) || (ChatObject.isChannel(this.currentChat) && !this.currentChat.megagroup);
        boolean z7 = !TextUtils.isEmpty(str2);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 13.0f);
        int i7 = Theme.key_dialogTextGray3;
        textView.setTextColor(getThemedColor(i7));
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        if (this.chatInvite != null && i == 0) {
            textView.setText(LocaleController.getString("ChannelPublic", R.string.ChannelPublic).toLowerCase());
        } else {
            if (z6) {
                lowerCase = LocaleController.getString("ChannelPrivate", R.string.ChannelPrivate).toLowerCase();
            } else {
                lowerCase = LocaleController.getString("MegaPrivate", R.string.MegaPrivate).toLowerCase();
            }
            textView.setText(lowerCase);
        }
        linearLayout.addView(textView, LayoutHelper.createLinear(-2, -2, 49, 10, 0, 10, z7 ? 0 : 20));
        if (z7) {
            TextView textView2 = new TextView(context);
            textView2.setGravity(17);
            textView2.setText(str2);
            textView2.setTextColor(getThemedColor(i6));
            textView2.setTextSize(1, 15.0f);
            linearLayout.addView(textView2, LayoutHelper.createLinear(-1, -2, 48, 24, 10, 24, 20));
        }
        TLRPC$ChatInvite tLRPC$ChatInvite6 = this.chatInvite;
        if (tLRPC$ChatInvite6 == null || tLRPC$ChatInvite6.request_needed) {
            FrameLayout frameLayout2 = new FrameLayout(getContext());
            linearLayout.addView(frameLayout2, LayoutHelper.createLinear(-1, -2));
            RadialProgressView radialProgressView = new RadialProgressView(getContext(), resourcesProvider);
            this.requestProgressView = radialProgressView;
            int i8 = Theme.key_featuredStickers_addButton;
            radialProgressView.setProgressColor(getThemedColor(i8));
            this.requestProgressView.setSize(AndroidUtilities.dp(32.0f));
            this.requestProgressView.setVisibility(4);
            frameLayout2.addView(this.requestProgressView, LayoutHelper.createFrame(48, 48, 17));
            TextView textView3 = new TextView(getContext());
            this.requestTextView = textView3;
            textView3.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(8.0f), getThemedColor(i8), getThemedColor(Theme.key_featuredStickers_addButtonPressed)));
            this.requestTextView.setEllipsize(truncateAt);
            this.requestTextView.setGravity(17);
            this.requestTextView.setSingleLine(true);
            TextView textView4 = this.requestTextView;
            if (z6) {
                i3 = R.string.RequestToJoinChannel;
                str3 = "RequestToJoinChannel";
            } else {
                i3 = R.string.RequestToJoinGroup;
                str3 = "RequestToJoinGroup";
            }
            textView4.setText(LocaleController.getString(str3, i3));
            this.requestTextView.setTextColor(getThemedColor(Theme.key_featuredStickers_buttonText));
            this.requestTextView.setTextSize(1, 14.0f);
            this.requestTextView.setTypeface(AndroidUtilities.bold());
            this.requestTextView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    JoinGroupAlert.this.lambda$new$7(z6, view);
                }
            });
            frameLayout2.addView(this.requestTextView, LayoutHelper.createLinear(-1, 48, 8388611, 14, 0, 14, 0));
            TextView textView5 = new TextView(getContext());
            textView5.setGravity(17);
            textView5.setTextSize(1, 14.0f);
            if (z6) {
                i4 = R.string.RequestToJoinChannelDescription;
                str4 = "RequestToJoinChannelDescription";
            } else {
                i4 = R.string.RequestToJoinGroupDescription;
                str4 = "RequestToJoinGroupDescription";
            }
            textView5.setText(LocaleController.getString(str4, i4));
            textView5.setTextColor(getThemedColor(i7));
            linearLayout.addView(textView5, LayoutHelper.createLinear(-1, -2, 48, 24, 17, 24, 15));
            return;
        }
        if (tLRPC$ChatInvite6.participants.isEmpty()) {
            z4 = false;
        } else {
            int min = Math.min(this.chatInvite.participants.size(), 3);
            AvatarsImageView avatarsImageView = new AvatarsImageView(context, false);
            avatarsImageView.setAvatarsTextSize(AndroidUtilities.dp(20.0f));
            float f = 38;
            avatarsImageView.setSize(AndroidUtilities.dp(f));
            avatarsImageView.setCount(min);
            avatarsImageView.setStepFactor(0.65f);
            for (int i9 = 0; i9 < min; i9++) {
                avatarsImageView.setObject(i9, UserConfig.selectedAccount, this.chatInvite.participants.get(i9));
            }
            avatarsImageView.commitTransition(false);
            linearLayout.addView(avatarsImageView, LayoutHelper.createLinear((int) (f + ((min - 1) * ((0.65f * f) + 1.0f))), 44, 17, 0, 2, 0, 4));
            TextView textView6 = new TextView(context);
            textView6.setTextSize(1, 13.0f);
            textView6.setTextColor(getThemedColor(Theme.key_dialogTextGray3));
            textView6.setGravity(17);
            if (min == 1) {
                z4 = false;
                format = ellipsize(textView6, this.chatInvite, 0).toString();
            } else {
                z4 = false;
                if (min == 2) {
                    format = LocaleController.formatString("RequestToJoinMembersTwo", R.string.RequestToJoinMembersTwo, ellipsize(textView6, this.chatInvite, 0), ellipsize(textView6, this.chatInvite, 1));
                } else if (i2 == 3) {
                    format = LocaleController.formatString("RequestToJoinMembersThree", R.string.RequestToJoinMembersThree, ellipsize(textView6, this.chatInvite, 0), ellipsize(textView6, this.chatInvite, 1), ellipsize(textView6, this.chatInvite, 2));
                } else {
                    int max = Math.max(i2 - min, 2);
                    format = String.format(LocaleController.getPluralString("RequestToJoinMembersAll", max), ellipsize(textView6, this.chatInvite, 0), ellipsize(textView6, this.chatInvite, 1), Integer.valueOf(max));
                }
            }
            textView6.setText(format);
            linearLayout.addView(textView6, LayoutHelper.createLinear(-2, -2, 49, 10, 0, 10, 24));
        }
        TLRPC$ChatInvite tLRPC$ChatInvite7 = this.chatInvite;
        if ((tLRPC$ChatInvite7.channel && !tLRPC$ChatInvite7.megagroup) || (ChatObject.isChannel(tLRPC$ChatInvite7.chat) && !this.chatInvite.chat.megagroup)) {
            z4 = true;
        }
        TextView textView7 = new TextView(getContext());
        textView7.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(8.0f), getThemedColor(Theme.key_featuredStickers_addButton), getThemedColor(Theme.key_featuredStickers_addButtonPressed)));
        textView7.setEllipsize(TextUtils.TruncateAt.END);
        textView7.setGravity(17);
        textView7.setSingleLine(true);
        if (z4) {
            i5 = R.string.ProfileJoinChannel;
            str5 = "ProfileJoinChannel";
        } else {
            i5 = R.string.ProfileJoinGroup;
            str5 = "ProfileJoinGroup";
        }
        textView7.setText(LocaleController.getString(str5, i5));
        textView7.setTextColor(getThemedColor(Theme.key_featuredStickers_buttonText));
        textView7.setTextSize(1, 14.0f);
        textView7.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView7, LayoutHelper.createLinear(-1, 48, 8388611, 14, 0, 14, 14));
        textView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                JoinGroupAlert.this.lambda$new$10(i, view);
            }
        });
    }

    public void lambda$new$0(View view) {
        dismiss();
    }

    public void lambda$new$7(final boolean z, View view) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                JoinGroupAlert.this.lambda$new$1();
            }
        }, 400L);
        if (this.chatInvite == null && this.currentChat != null) {
            MessagesController.getInstance(this.currentAccount).addUserToChat(this.currentChat.id, UserConfig.getInstance(this.currentAccount).getCurrentUser(), 0, null, null, true, new Runnable() {
                @Override
                public final void run() {
                    JoinGroupAlert.this.dismiss();
                }
            }, new MessagesController.ErrorDelegate() {
                @Override
                public final boolean run(TLRPC$TL_error tLRPC$TL_error) {
                    boolean lambda$new$3;
                    lambda$new$3 = JoinGroupAlert.this.lambda$new$3(z, tLRPC$TL_error);
                    return lambda$new$3;
                }
            });
            return;
        }
        final TLRPC$TL_messages_importChatInvite tLRPC$TL_messages_importChatInvite = new TLRPC$TL_messages_importChatInvite();
        tLRPC$TL_messages_importChatInvite.hash = this.hash;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_messages_importChatInvite, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                JoinGroupAlert.this.lambda$new$6(z, tLRPC$TL_messages_importChatInvite, tLObject, tLRPC$TL_error);
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

    public boolean lambda$new$3(final boolean z, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error != null && "INVITE_REQUEST_SENT".equals(tLRPC$TL_error.text)) {
            setOnDismissListener(new DialogInterface.OnDismissListener() {
                @Override
                public final void onDismiss(DialogInterface dialogInterface) {
                    JoinGroupAlert.this.lambda$new$2(z, dialogInterface);
                }
            });
        }
        dismiss();
        return false;
    }

    public void lambda$new$2(boolean z, DialogInterface dialogInterface) {
        showBulletin(getContext(), this.fragment, z);
    }

    public void lambda$new$6(final boolean z, final TLRPC$TL_messages_importChatInvite tLRPC$TL_messages_importChatInvite, TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                JoinGroupAlert.this.lambda$new$5(tLRPC$TL_error, z, tLRPC$TL_messages_importChatInvite);
            }
        });
    }

    public void lambda$new$5(TLRPC$TL_error tLRPC$TL_error, final boolean z, TLRPC$TL_messages_importChatInvite tLRPC$TL_messages_importChatInvite) {
        BaseFragment baseFragment = this.fragment;
        if (baseFragment == null || baseFragment.getParentActivity() == null) {
            return;
        }
        if (tLRPC$TL_error != null) {
            if ("INVITE_REQUEST_SENT".equals(tLRPC$TL_error.text)) {
                setOnDismissListener(new DialogInterface.OnDismissListener() {
                    @Override
                    public final void onDismiss(DialogInterface dialogInterface) {
                        JoinGroupAlert.this.lambda$new$4(z, dialogInterface);
                    }
                });
            } else {
                AlertsCreator.processError(this.currentAccount, tLRPC$TL_error, this.fragment, tLRPC$TL_messages_importChatInvite, new Object[0]);
            }
        }
        dismiss();
    }

    public void lambda$new$4(boolean z, DialogInterface dialogInterface) {
        showBulletin(getContext(), this.fragment, z);
    }

    public void lambda$new$10(final int i, View view) {
        dismiss();
        final TLRPC$TL_messages_importChatInvite tLRPC$TL_messages_importChatInvite = new TLRPC$TL_messages_importChatInvite();
        tLRPC$TL_messages_importChatInvite.hash = this.hash;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_messages_importChatInvite, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                JoinGroupAlert.this.lambda$new$9(i, tLRPC$TL_messages_importChatInvite, tLObject, tLRPC$TL_error);
            }
        }, 2);
    }

    public void lambda$new$9(final int i, final TLRPC$TL_messages_importChatInvite tLRPC$TL_messages_importChatInvite, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            MessagesController.getInstance(this.currentAccount).processUpdates((TLRPC$Updates) tLObject, false);
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                JoinGroupAlert.this.lambda$new$8(tLRPC$TL_error, tLObject, i, tLRPC$TL_messages_importChatInvite);
            }
        });
    }

    public void lambda$new$8(TLRPC$TL_error tLRPC$TL_error, TLObject tLObject, int i, TLRPC$TL_messages_importChatInvite tLRPC$TL_messages_importChatInvite) {
        TLRPC$ChatInvite tLRPC$ChatInvite;
        TLRPC$Chat tLRPC$Chat;
        BaseFragment baseFragment = this.fragment;
        if (baseFragment == null || baseFragment.getParentActivity() == null) {
            return;
        }
        if (tLRPC$TL_error == null) {
            TLRPC$Updates tLRPC$Updates = (TLRPC$Updates) tLObject;
            if (tLRPC$Updates.chats.isEmpty()) {
                return;
            }
            TLRPC$Chat tLRPC$Chat2 = tLRPC$Updates.chats.get(0);
            tLRPC$Chat2.left = false;
            tLRPC$Chat2.kicked = false;
            MessagesController.getInstance(this.currentAccount).putUsers(tLRPC$Updates.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(tLRPC$Updates.chats, false);
            openChat(tLRPC$Chat2.id);
            return;
        }
        if ("USER_ALREADY_PARTICIPANT".equals(tLRPC$TL_error.text) && i == 0 && (tLRPC$ChatInvite = this.chatInvite) != null && (tLRPC$Chat = tLRPC$ChatInvite.chat) != null) {
            openChat(tLRPC$Chat.id);
        } else {
            AlertsCreator.processError(this.currentAccount, tLRPC$TL_error, this.fragment, tLRPC$TL_messages_importChatInvite, new Object[0]);
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
        twoLineLottieLayout.titleTextView.setText(LocaleController.getString("RequestToJoinSent", R.string.RequestToJoinSent));
        if (z) {
            string = LocaleController.getString("RequestToJoinChannelSentDescription", R.string.RequestToJoinChannelSentDescription);
        } else {
            string = LocaleController.getString("RequestToJoinGroupSentDescription", R.string.RequestToJoinGroupSentDescription);
        }
        twoLineLottieLayout.subtitleTextView.setText(string);
        Bulletin.make(baseFragment, twoLineLottieLayout, 2750).show();
    }

    private CharSequence ellipsize(TextView textView, TLRPC$ChatInvite tLRPC$ChatInvite, int i) {
        String str = tLRPC$ChatInvite.participants.get(i).first_name;
        if (str == null) {
            str = "";
        }
        return TextUtils.ellipsize(str.trim(), textView.getPaint(), AndroidUtilities.dp(120.0f), TextUtils.TruncateAt.END);
    }

    private Drawable getScamDrawable(int i) {
        return i == 0 ? Theme.dialogs_scamDrawable : Theme.dialogs_fakeDrawable;
    }

    private void openChat(long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", j);
        if (MessagesController.getInstance(this.currentAccount).checkCanOpenChat(bundle, this.fragment)) {
            ChatActivity chatActivity = new ChatActivity(bundle);
            BaseFragment baseFragment = this.fragment;
            baseFragment.presentFragment(chatActivity, baseFragment instanceof ChatActivity);
        }
    }
}
