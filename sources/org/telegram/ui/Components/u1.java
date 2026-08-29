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
import org.telegram.ui.Components.uc0;
import org.telegram.ui.ze1;
public final class u1 implements org.telegram.ui.ActionBar.b2, ResultCallback, org.telegram.ui.yx {
    public final int f33084a = 3;
    public final long f33085b;
    public final int f33086c;
    public final Object d;
    public final Object f33087e;

    public u1(int i10, long j10, TLRPC.TL_attachMenuBot tL_attachMenuBot, Runnable runnable) {
        this.f33086c = i10;
        this.f33085b = j10;
        this.d = tL_attachMenuBot;
        this.f33087e = runnable;
    }

    @Override
    public boolean C() {
        return false;
    }

    @Override
    public boolean J(org.telegram.ui.fy fyVar) {
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        int i11 = this.f33084a;
        Object obj = this.f33087e;
        Object obj2 = this.d;
        long j10 = this.f33085b;
        int i12 = this.f33086c;
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
                            c2Var.dismiss();
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
                        ConnectionsManager.getInstance(i12).sendRequest(updateprofile, new lh.o5(9));
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 3, Long.valueOf(j10));
                    } else {
                        long j11 = -j10;
                        TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(j11));
                        String obj5 = editText.getText().toString();
                        String str3 = chat.title;
                        if (str3 != null && str3.equals(obj5)) {
                            c2Var.dismiss();
                            return;
                        }
                        chat.title = obj5;
                        NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_CHAT_NAME));
                        MessagesController.getInstance(i12).changeChatTitle(j11, obj5);
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 3, Long.valueOf(j10));
                    }
                    c2Var.dismiss();
                    return;
                }
                return;
            default:
                Runnable runnable = (Runnable) obj;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i12).getInputUser(j10);
                tL_messages_toggleBotInAttachMenu.enabled = false;
                ConnectionsManager.getInstance(i12).sendRequest(tL_messages_toggleBotInAttachMenu, new org.telegram.messenger.voip.n(i12, 6), 66);
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
        l11 l11Var = (l11) this.d;
        fp fpVar = (fp) this.f33087e;
        Pair pair = (Pair) obj;
        if (pair != null && ((Long) pair.first).longValue() == this.f33085b) {
            Drawable drawable = fpVar.f28513b;
            if (drawable instanceof yb0) {
                yb0 yb0Var = (yb0) drawable;
                if (this.f33086c >= 0) {
                    i10 = 100;
                } else {
                    i10 = -100;
                }
                yb0Var.t(l11.e((Bitmap) pair.second), i10);
                yb0Var.u(l11Var.H);
            }
            l11Var.invalidate();
        }
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override
    public boolean v(org.telegram.ui.fy fyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, ze1 ze1Var) {
        Activity activity;
        String str;
        String str2;
        TLRPC.Chat chat;
        TLRPC.User user;
        TLRPC.User user2;
        int i12;
        int i13;
        int i14;
        org.telegram.ui.fy fyVar2 = (org.telegram.ui.fy) this.d;
        final TL_bots.botVerifierSettings botverifiersettings = (TL_bots.botVerifierSettings) this.f33087e;
        if (arrayList.isEmpty()) {
            return false;
        }
        final long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        Activity parentActivity = fyVar2.getParentActivity();
        final int i15 = this.f33086c;
        ph.j1 j1Var = new ph.j1(ze1Var, fyVar2, j10, i15);
        if (parentActivity == null) {
            return true;
        }
        MessagesController messagesController = MessagesController.getInstance(i15);
        final long j11 = this.f33085b;
        messagesController.getUser(Long.valueOf(j11));
        int i16 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i16 >= 0) {
            TLRPC.User user3 = MessagesController.getInstance(i15).getUser(Long.valueOf(j10));
            str2 = UserObject.getForcedFirstName(user3);
            if (user3.bot_verification_icon == botverifiersettings.icon) {
                ph.n1.a(parentActivity, i15, j11, j10, botverifiersettings, j1Var);
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
                ph.n1.a(activity, i15, j11, j10, botverifiersettings, j1Var);
                return true;
            }
            j1Var = j1Var;
            chat = chat2;
            user = null;
            user2 = chat2;
        }
        TLRPC.User user4 = user;
        final org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(activity, null, true, false);
        f3Var.fixNavigationBar();
        LinearLayout f9 = org.telegram.messenger.x3.f(activity, 1);
        TLRPC.Chat chat3 = chat;
        f9.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        f9.setClipChildren(false);
        f9.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setBackground(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.ci, false)));
        t9 t9Var = new t9(activity);
        t9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        e9 e9Var = new e9((org.telegram.ui.ActionBar.c6) null);
        e9Var.p(user2);
        t9Var.e(user2, e9Var);
        frameLayout.addView(t9Var, i7.f6.e(28, 28, 51));
        t9 t9Var2 = new t9(activity);
        t9Var2.setEmojiColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23453z9, false), PorterDuff.Mode.SRC_IN));
        final ph.j1 j1Var2 = j1Var;
        t9Var2.setAnimatedEmojiDrawable(p5.n(i15, botverifiersettings.icon, null, 3));
        frameLayout.addView(t9Var2, i7.f6.d(20, 20.0f, 19, 34.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(activity);
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23169j5, false));
        h5Var.setTextSize(13);
        h5Var.setEllipsizeByGradient(true);
        h5Var.l(str2, false);
        h5Var.setWidthWrapContent(true);
        frameLayout.addView(h5Var, i7.f6.d(-2, -2.0f, 19, 57.0f, 0.0f, 10.0f, 0.0f));
        f9.addView(frameLayout, i7.f6.t(-2, -2, 1, 16, 0, 16, 0));
        TextView textView = new TextView(activity);
        int i17 = org.telegram.ui.ActionBar.g6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i17, false));
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
        f9.addView(textView, i7.f6.k(24.0f, 21.0f, 24.0f, 8.33f, -1, -2));
        TextView textView2 = new TextView(activity);
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i17, false));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        NotificationCenter.listenEmojiLoading(textView2);
        textView2.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotVerifyText, str2)), textView2.getPaint().getFontMetricsInt(), false));
        f9.addView(textView2, i7.f6.k(24.0f, 0.0f, 24.0f, 22.0f, -1, -2));
        final int i18 = MessagesController.getInstance(i15).botVerificationDescriptionLengthLimit;
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(activity);
        final uc0 uc0Var = new uc0(activity, null);
        uc0Var.setForceForceUseCenter(true);
        uc0Var.setText(LocaleController.getString(R.string.BotVerifyDescription));
        uc0Var.setLeftPadding(AndroidUtilities.dp(2.0f));
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i17, false));
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setMaxLines(15);
        editTextBoldCursor.setInputType(180225);
        editTextBoldCursor.setTypeface(Typeface.DEFAULT);
        editTextBoldCursor.setSelectAllOnFocus(true);
        editTextBoldCursor.setHighlightColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23374uf, false));
        editTextBoldCursor.setHandlesColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23392vf, false));
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        editTextBoldCursor.setGravity(i12);
        editTextBoldCursor.setOnFocusChangeListener(new jh.m8(uc0Var, editTextBoldCursor, 2));
        uc0Var.e(editTextBoldCursor);
        uc0Var.addView(editTextBoldCursor, i7.f6.d(-1, -2.0f, 48, 12.0f, 4.0f, 12.0f, 4.0f));
        f9.addView(uc0Var, i7.f6.n(-1, -2));
        editTextBoldCursor.addTextChangedListener(new org.telegram.ui.Cells.f3());
        editTextBoldCursor.addTextChangedListener(new ph.m1(editTextBoldCursor, i18, uc0Var));
        if (!TextUtils.isEmpty(botverifiersettings.custom_description)) {
            editTextBoldCursor.setText(botverifiersettings.custom_description);
            if (!botverifiersettings.can_modify_custom_description) {
                editTextBoldCursor.setEnabled(false);
                editTextBoldCursor.setFocusable(false);
                editTextBoldCursor.setFocusableInTouchMode(false);
            }
        } else if (!botverifiersettings.can_modify_custom_description) {
            uc0Var.setVisibility(8);
        }
        if (botverifiersettings.can_modify_custom_description) {
            TextView textView3 = new TextView(activity);
            textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.B6, false));
            textView3.setTextSize(1, 12.0f);
            if (i16 >= 0) {
                i14 = R.string.BotVerifyDescriptionInfo;
            } else {
                i14 = R.string.BotVerifyDescriptionInfoChat;
            }
            textView3.setPadding(org.telegram.ui.b.e(14.0f, i14, textView3), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(27.0f));
            i13 = -1;
            f9.addView(textView3, i7.f6.c(-2.0f, -1));
        } else {
            i13 = -1;
            f9.addView(new View(activity), i7.f6.c(12.0f, -1));
        }
        final nh.d dVar = new nh.d(activity, null, true);
        dVar.g(textView.getText(), false, true);
        f9.addView(dVar, i7.f6.n(i13, 48));
        f3Var.customView = f9;
        dVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                nh.d dVar2 = nh.d.this;
                if (dVar2.J) {
                    return;
                }
                TL_bots.botVerifierSettings botverifiersettings2 = botverifiersettings;
                boolean z12 = botverifiersettings2.can_modify_custom_description;
                EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
                if (z12 && editTextBoldCursor2.getText().length() > i18) {
                    uc0 uc0Var2 = uc0Var;
                    uc0Var2.a(1.0f);
                    AndroidUtilities.shakeViewSpring(uc0Var2, -6.0f);
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
                ConnectionsManager.getInstance(i19).sendRequest(setcustomverification, new eg.z(dVar2, f3Var, j1Var2, 23));
            }
        });
        f3Var.smoothKeyboardAnimationEnabled = true;
        f3Var.smoothKeyboardByBottom = true;
        f3Var.show();
        return true;
    }

    public u1(EditText editText, long j10, int i10, EditText editText2) {
        this.d = editText;
        this.f33085b = j10;
        this.f33086c = i10;
        this.f33087e = editText2;
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }

    public u1(l11 l11Var, long j10, fp fpVar, int i10) {
        this.d = l11Var;
        this.f33085b = j10;
        this.f33087e = fpVar;
        this.f33086c = i10;
    }

    public u1(org.telegram.ui.fy fyVar, int i10, long j10, TL_bots.botVerifierSettings botverifiersettings) {
        this.d = fyVar;
        this.f33086c = i10;
        this.f33085b = j10;
        this.f33087e = botverifiersettings;
    }
}
