package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ad0;
import org.telegram.ui.kf1;
public final class s1 implements org.telegram.ui.ActionBar.c2, ResultCallback, org.telegram.ui.iy {
    public final int f28586a = 3;
    public final long f28587b;
    public final int f28588c;
    public final Object d;
    public final Object e;

    public s1(int i10, long j10, TLRPC.TL_attachMenuBot tL_attachMenuBot, Runnable runnable) {
        this.f28588c = i10;
        this.f28587b = j10;
        this.d = tL_attachMenuBot;
        this.e = runnable;
    }

    @Override
    public boolean C() {
        return false;
    }

    @Override
    public boolean K(org.telegram.ui.oy oyVar) {
        return false;
    }

    @Override
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        int i11 = this.f28586a;
        Object obj = this.e;
        Object obj2 = this.d;
        long j10 = this.f28587b;
        int i12 = this.f28588c;
        switch (i11) {
            case 0:
                EditText editText = (EditText) obj2;
                EditText editText2 = (EditText) obj;
                if (editText.getText() != null) {
                    if (j10 > 0) {
                        TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(j10));
                        String obj3 = editText.getText().toString();
                        String obj4 = editText2.getText().toString();
                        String str = user.first_name;
                        String str2 = user.last_name;
                        if (str == null) {
                            str = "";
                        }
                        if (str2 == null) {
                            str2 = "";
                        }
                        if (str.equals(obj3) && str2.equals(obj4)) {
                            d2Var.dismiss();
                            return;
                        }
                        TL_account.updateProfile updateprofile = new TL_account.updateProfile();
                        updateprofile.flags = 3;
                        updateprofile.first_name = obj3;
                        user.first_name = obj3;
                        updateprofile.last_name = obj4;
                        user.last_name = obj4;
                        TLRPC.User user2 = MessagesController.getInstance(i12).getUser(Long.valueOf(UserConfig.getInstance(i12).getClientUserId()));
                        if (user2 != null) {
                            user2.first_name = updateprofile.first_name;
                            user2.last_name = updateprofile.last_name;
                        }
                        UserConfig.getInstance(i12).saveConfig(true);
                        NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                        NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
                        ConnectionsManager.getInstance(i12).sendRequest(updateprofile, new nh.p5(8));
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 3, Long.valueOf(j10));
                    } else {
                        long j11 = -j10;
                        TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(j11));
                        String obj5 = editText.getText().toString();
                        String str3 = chat.title;
                        if (str3 != null && str3.equals(obj5)) {
                            d2Var.dismiss();
                            return;
                        }
                        chat.title = obj5;
                        NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_CHAT_NAME));
                        MessagesController.getInstance(i12).changeChatTitle(j11, obj5);
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 3, Long.valueOf(j10));
                    }
                    d2Var.dismiss();
                    return;
                }
                return;
            default:
                Runnable runnable = (Runnable) obj;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i12).getInputUser(j10);
                tL_messages_toggleBotInAttachMenu.enabled = false;
                ConnectionsManager.getInstance(i12).sendRequest(tL_messages_toggleBotInAttachMenu, new org.telegram.messenger.voip.o(i12, 6), 66);
                ((TLRPC.TL_attachMenuBot) obj2).show_in_side_menu = false;
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.attachMenuBotsDidLoad, new Object[0]);
                MediaDataController.getInstance(i12).uninstallShortcut(j10, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    @Override
    public void onComplete(Object obj) {
        int i10;
        w11 w11Var = (w11) this.d;
        jp jpVar = (jp) this.e;
        Pair pair = (Pair) obj;
        if (pair != null && ((Long) pair.first).longValue() == this.f28587b) {
            Drawable drawable = jpVar.f26016b;
            if (drawable instanceof dc0) {
                dc0 dc0Var = (dc0) drawable;
                if (this.f28588c >= 0) {
                    i10 = 100;
                } else {
                    i10 = -100;
                }
                dc0Var.t(w11.e((Bitmap) pair.second), i10);
                dc0Var.u(w11Var.I);
            }
            w11Var.invalidate();
        }
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override
    public boolean w(org.telegram.ui.oy oyVar, ArrayList arrayList, CharSequence charSequence, boolean z4, boolean z10, int i10, int i11, kf1 kf1Var) {
        Activity activity;
        String str;
        String str2;
        TLRPC.Chat chat;
        TLRPC.User user;
        TLRPC.User user2;
        int i12;
        int i13;
        int i14;
        org.telegram.ui.oy oyVar2 = (org.telegram.ui.oy) this.d;
        final TL_bots.botVerifierSettings botverifiersettings = (TL_bots.botVerifierSettings) this.e;
        if (arrayList.isEmpty()) {
            return false;
        }
        final long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        Activity parentActivity = oyVar2.getParentActivity();
        final int i15 = this.f28588c;
        rh.k1 k1Var = new rh.k1(kf1Var, oyVar2, j10, i15);
        if (parentActivity == null) {
            return true;
        }
        MessagesController messagesController = MessagesController.getInstance(i15);
        final long j11 = this.f28587b;
        messagesController.getUser(Long.valueOf(j11));
        int i16 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i16 >= 0) {
            TLRPC.User user3 = MessagesController.getInstance(i15).getUser(Long.valueOf(j10));
            str2 = UserObject.getForcedFirstName(user3);
            if (user3.bot_verification_icon == botverifiersettings.icon) {
                rh.o1.a(parentActivity, i15, j11, j10, botverifiersettings, k1Var);
                return true;
            }
            activity = parentActivity;
            user = user3;
            chat = null;
            user2 = user3;
        } else {
            activity = parentActivity;
            TLRPC.Chat chat2 = MessagesController.getInstance(i15).getChat(Long.valueOf(-j10));
            if (chat2 == null) {
                str = "";
            } else {
                str = chat2.title;
            }
            str2 = str;
            if (chat2.bot_verification_icon == botverifiersettings.icon) {
                rh.o1.a(activity, i15, j11, j10, botverifiersettings, k1Var);
                return true;
            }
            k1Var = k1Var;
            chat = chat2;
            user = null;
            user2 = chat2;
        }
        TLRPC.User user4 = user;
        final org.telegram.ui.ActionBar.g3 g3Var = new org.telegram.ui.ActionBar.g3(activity, null, true, false);
        g3Var.fixNavigationBar();
        LinearLayout h = kh.a2.h(activity, 1);
        TLRPC.Chat chat3 = chat;
        h.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        h.setClipChildren(false);
        h.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setBackground(org.telegram.ui.ActionBar.j6.c0(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.ci, false)));
        p9 p9Var = new p9(activity);
        p9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        z8 z8Var = new z8((org.telegram.ui.ActionBar.f6) null);
        z8Var.p(user2);
        p9Var.e(user2, z8Var);
        frameLayout.addView(p9Var, k7.b6.e(28, 28, 51));
        p9 p9Var2 = new p9(activity);
        p9Var2.setEmojiColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20301z9, false), PorterDuff.Mode.SRC_IN));
        final rh.k1 k1Var2 = k1Var;
        p9Var2.setAnimatedEmojiDrawable(l5.n(i15, botverifiersettings.icon, null, 3));
        frameLayout.addView(p9Var2, k7.b6.d(20, 20.0f, 19, 34.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(activity);
        k5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20012j5, false));
        k5Var.setTextSize(13);
        k5Var.setEllipsizeByGradient(true);
        k5Var.l(str2, false);
        k5Var.setWidthWrapContent(true);
        frameLayout.addView(k5Var, k7.b6.d(-2, -2.0f, 19, 57.0f, 0.0f, 10.0f, 0.0f));
        h.addView(frameLayout, k7.b6.t(-2, -2, 1, 16, 0, 16, 0));
        TextView textView = new TextView(activity);
        int i17 = org.telegram.ui.ActionBar.j6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i17, false));
        textView.setTextSize(1, 20.0f);
        textView.setGravity(17);
        if (UserObject.isBot(user4)) {
            textView.setText(LocaleController.getString(R.string.BotVerifyBotTitle));
        } else if (user4 != null) {
            textView.setText(LocaleController.getString(R.string.BotVerifyUserTitle));
        } else if (ChatObject.isChannelAndNotMegaGroup(chat3)) {
            textView.setText(LocaleController.getString(R.string.BotVerifyChannelTitle));
        } else {
            textView.setText(LocaleController.getString(R.string.BotVerifyGroupTitle));
        }
        textView.setTypeface(AndroidUtilities.bold());
        h.addView(textView, k7.b6.k(24.0f, 21.0f, 24.0f, 8.33f, -1, -2));
        TextView textView2 = new TextView(activity);
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i17, false));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        NotificationCenter.listenEmojiLoading(textView2);
        textView2.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotVerifyText, str2)), textView2.getPaint().getFontMetricsInt(), false));
        h.addView(textView2, k7.b6.k(24.0f, 0.0f, 24.0f, 22.0f, -1, -2));
        final int i18 = MessagesController.getInstance(i15).botVerificationDescriptionLengthLimit;
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(activity);
        final ad0 ad0Var = new ad0(activity, null);
        ad0Var.setForceForceUseCenter(true);
        ad0Var.setText(LocaleController.getString(R.string.BotVerifyDescription));
        ad0Var.setLeftPadding(AndroidUtilities.dp(2.0f));
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i17, false));
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setMaxLines(15);
        editTextBoldCursor.setInputType(180225);
        editTextBoldCursor.setTypeface(Typeface.DEFAULT);
        editTextBoldCursor.setSelectAllOnFocus(true);
        editTextBoldCursor.setHighlightColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20216uf, false));
        editTextBoldCursor.setHandlesColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20234vf, false));
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        editTextBoldCursor.setGravity(i12);
        editTextBoldCursor.setOnFocusChangeListener(new lh.n8(ad0Var, editTextBoldCursor, 2));
        ad0Var.e(editTextBoldCursor);
        ad0Var.addView(editTextBoldCursor, k7.b6.d(-1, -2.0f, 48, 12.0f, 4.0f, 12.0f, 4.0f));
        h.addView(ad0Var, k7.b6.n(-1, -2));
        editTextBoldCursor.addTextChangedListener(new org.telegram.ui.Cells.h3());
        editTextBoldCursor.addTextChangedListener(new rh.n1(editTextBoldCursor, i18, ad0Var));
        if (!TextUtils.isEmpty(botverifiersettings.custom_description)) {
            editTextBoldCursor.setText(botverifiersettings.custom_description);
            if (!botverifiersettings.can_modify_custom_description) {
                editTextBoldCursor.setEnabled(false);
                editTextBoldCursor.setFocusable(false);
                editTextBoldCursor.setFocusableInTouchMode(false);
            }
        } else if (!botverifiersettings.can_modify_custom_description) {
            ad0Var.setVisibility(8);
        }
        if (botverifiersettings.can_modify_custom_description) {
            TextView textView3 = new TextView(activity);
            textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.B6, false));
            textView3.setTextSize(1, 12.0f);
            if (i16 >= 0) {
                i14 = R.string.BotVerifyDescriptionInfo;
            } else {
                i14 = R.string.BotVerifyDescriptionInfoChat;
            }
            textView3.setPadding(org.telegram.ui.b.e(14.0f, i14, textView3), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(27.0f));
            i13 = -1;
            h.addView(textView3, k7.b6.c(-2.0f, -1));
        } else {
            i13 = -1;
            h.addView(new View(activity), k7.b6.c(12.0f, -1));
        }
        final ph.d dVar = new ph.d(activity, null, true);
        dVar.g(textView.getText(), false, true);
        h.addView(dVar, k7.b6.n(i13, 48));
        g3Var.customView = h;
        dVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ph.d dVar2 = ph.d.this;
                if (dVar2.K) {
                    return;
                }
                TL_bots.botVerifierSettings botverifiersettings2 = botverifiersettings;
                boolean z11 = botverifiersettings2.can_modify_custom_description;
                EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
                if (z11 && editTextBoldCursor2.getText().length() > i18) {
                    ad0 ad0Var2 = ad0Var;
                    ad0Var2.a(1.0f);
                    AndroidUtilities.shakeViewSpring(ad0Var2, -6.0f);
                    return;
                }
                dVar2.setLoading(true);
                TL_bots.setCustomVerification setcustomverification = new TL_bots.setCustomVerification();
                setcustomverification.enabled = true;
                setcustomverification.flags = 1 | setcustomverification.flags;
                int i19 = i15;
                setcustomverification.bot = MessagesController.getInstance(i19).getInputUser(j11);
                setcustomverification.peer = MessagesController.getInstance(i19).getInputPeer(j10);
                if (botverifiersettings2.can_modify_custom_description) {
                    setcustomverification.custom_description = editTextBoldCursor2.getText().toString();
                } else {
                    setcustomverification.custom_description = botverifiersettings2.custom_description;
                }
                if (!TextUtils.isEmpty(setcustomverification.custom_description)) {
                    setcustomverification.flags |= 4;
                }
                ConnectionsManager.getInstance(i19).sendRequest(setcustomverification, new gg.y(dVar2, g3Var, k1Var2, 23));
            }
        });
        g3Var.smoothKeyboardAnimationEnabled = true;
        g3Var.smoothKeyboardByBottom = true;
        g3Var.show();
        return true;
    }

    public s1(EditText editText, long j10, int i10, EditText editText2) {
        this.d = editText;
        this.f28587b = j10;
        this.f28588c = i10;
        this.e = editText2;
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }

    public s1(w11 w11Var, long j10, jp jpVar, int i10) {
        this.d = w11Var;
        this.f28587b = j10;
        this.e = jpVar;
        this.f28588c = i10;
    }

    public s1(org.telegram.ui.oy oyVar, int i10, long j10, TL_bots.botVerifierSettings botverifiersettings) {
        this.d = oyVar;
        this.f28588c = i10;
        this.f28587b = j10;
        this.e = botverifiersettings;
    }
}
