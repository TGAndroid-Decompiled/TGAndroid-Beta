package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.wi1;
public final class nd implements Runnable {
    public final int f29143a;
    public final int f29144b;
    public final Object f29145c;

    public nd(Object obj, int i10, int i11) {
        this.f29143a = i11;
        this.f29145c = obj;
        this.f29144b = i10;
    }

    @Override
    public final void run() {
        String str;
        CharSequence replaceTags;
        int i10;
        int i11;
        int i12;
        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab;
        int i13;
        int i14;
        org.telegram.ui.wu0 wu0Var;
        String str2;
        int i15;
        int i16 = this.f29143a;
        float f7 = 1.0f;
        int i17 = 0;
        int i18 = this.f29144b;
        Object obj = this.f29145c;
        switch (i16) {
            case 0:
                od odVar = (od) obj;
                ci.d4 d4Var = odVar.f29454d1;
                if (odVar.f29452b1 != i18) {
                    odVar.setTimer(i18);
                    Utilities.Callback callback = odVar.f29467r1;
                    if (callback != null) {
                        callback.run(Integer.valueOf(i18));
                    }
                    if (i18 == 0) {
                        if (odVar.f29466q1) {
                            i12 = R.string.TimerPeriodVideoKeep;
                        } else {
                            i12 = R.string.TimerPeriodPhotoKeep;
                        }
                        replaceTags = LocaleController.getString(i12);
                        d4Var.h = odVar.getMeasuredWidth();
                        d4Var.p(false);
                        d4Var.k(13.0f, 4.0f, 10.0f, 4.0f);
                        d4Var.f4910e0 = AndroidUtilities.dp(0);
                        d4Var.f4908d0 = -AndroidUtilities.dp(1.0f);
                    } else if (i18 == Integer.MAX_VALUE) {
                        if (odVar.f29466q1) {
                            i10 = R.string.TimerPeriodVideoSetOnce;
                        } else {
                            i10 = R.string.TimerPeriodPhotoSetOnce;
                        }
                        replaceTags = LocaleController.getString(i10);
                        d4Var.h = odVar.getMeasuredWidth();
                        d4Var.p(false);
                        d4Var.k(13.0f, 4.0f, 10.0f, 4.0f);
                        d4Var.f4910e0 = AndroidUtilities.dp(0);
                        d4Var.f4908d0 = -AndroidUtilities.dp(1.0f);
                    } else if (i18 > 0) {
                        if (odVar.f29466q1) {
                            str = "TimerPeriodVideoSetSeconds";
                        } else {
                            str = "TimerPeriodPhotoSetSeconds";
                        }
                        replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString(str, i18, new Object[0]));
                        d4Var.p(true);
                        d4Var.h = ci.d4.a(replaceTags, d4Var.getTextPaint());
                        d4Var.k(12.0f, 7.0f, 11.0f, 7.0f);
                        d4Var.f4910e0 = AndroidUtilities.dp(2);
                        d4Var.f4908d0 = 0.0f;
                    } else {
                        return;
                    }
                    float dp = (-Math.min(AndroidUtilities.dp(34.0f), odVar.getEditTextHeight())) - AndroidUtilities.dp(14.0f);
                    if (odVar instanceof org.telegram.ui.ct0) {
                        f7 = -1.0f;
                    }
                    d4Var.setTranslationY(dp * f7);
                    d4Var.s(replaceTags);
                    if (i18 > 0) {
                        i11 = R.raw.fire_on;
                    } else {
                        i11 = R.raw.fire_off;
                    }
                    ck0 ck0Var = new ck0(i11, AndroidUtilities.dp(34.0f), AndroidUtilities.dp(34.0f));
                    ck0Var.start();
                    d4Var.j(ck0Var);
                    d4Var.u();
                    odVar.f29464o1 = false;
                    AndroidUtilities.cancelRunOnUIThread(odVar.f29465p1);
                    odVar.invalidate();
                    return;
                }
                return;
            case 1:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                if (i18 == 0) {
                    chatActivityEnterView.A2 = 0;
                }
                chatActivityEnterView.V0 = null;
                gg ggVar = chatActivityEnterView.U0;
                if (ggVar != null) {
                    if (chatActivityEnterView.f23876d5 == null) {
                        ggVar.setTranslationY(0.0f);
                    }
                    chatActivityEnterView.U0.setVisibility(8);
                    chatActivityEnterView.f23931n1.removeView(chatActivityEnterView.U0);
                    if (chatActivityEnterView.G3) {
                        chatActivityEnterView.G3 = false;
                        chatActivityEnterView.U0 = null;
                    }
                }
                qg qgVar = chatActivityEnterView.Z2;
                if (qgVar != null) {
                    qgVar.z(0.0f);
                }
                chatActivityEnterView.requestLayout();
                return;
            case 2:
                gn gnVar = (gn) obj;
                hn hnVar = gnVar.P;
                if (i18 == gnVar.O && hnVar.f27092w.isShown()) {
                    hnVar.f27092w.e(1, true);
                    return;
                }
                return;
            case 3:
                a00 a00Var = (a00) obj;
                if (a00Var.P1) {
                    az azVar = a00Var.f24455t1;
                    if (azVar != null && azVar.k()) {
                        try {
                            a00Var.f24467x.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    a00Var.Q1 = true;
                    int max = Math.max(50, i18 - 100);
                    AndroidUtilities.runOnUIThread(new nd(a00Var, max, 3), max);
                    return;
                }
                return;
            case 4:
                ((qb0) obj).f30138b.run(Integer.valueOf(i18));
                return;
            case 5:
                rg0 rg0Var = (rg0) obj;
                org.telegram.ui.ju0 ju0Var = rg0Var.f30440a;
                TextView textView = ju0Var.f30785e;
                ci.bb bbVar = ju0Var.h;
                RadialProgressView radialProgressView = ju0Var.f30787n;
                TextView textView2 = ju0Var.d;
                textView.setVisibility(8);
                ju0Var.f30786f.setVisibility(8);
                LinearLayout linearLayout = ju0Var.f30784c;
                if (linearLayout.getVisibility() == 8) {
                    linearLayout.setVisibility(0);
                    linearLayout.animate().cancel();
                    linearLayout.animate().alpha(1.0f).setDuration(150L).start();
                }
                if (radialProgressView.getAlpha() == 1.0f) {
                    radialProgressView.animate().cancel();
                    radialProgressView.animate().alpha(0.0f).setDuration(150L).setListener(new qg0(rg0Var, 0));
                }
                if (bbVar.getAlpha() == 1.0f) {
                    bbVar.animate().cancel();
                    bbVar.animate().alpha(0.0f).setDuration(150L).setListener(new qg0(rg0Var, 1));
                }
                if (i18 != 2) {
                    if (i18 != 5) {
                        if (i18 != 150) {
                            if (i18 != 100) {
                                if (i18 != 101) {
                                    return;
                                }
                            } else {
                                textView2.setText(LocaleController.getString(R.string.YouTubeVideoErrorNotFound));
                                return;
                            }
                        }
                        textView2.setText(LocaleController.getString(R.string.YouTubeVideoErrorNotAvailableInApp));
                        textView.setText(LocaleController.getString(R.string.YouTubeVideoErrorOpenExternal));
                        textView.setVisibility(0);
                        textView.setOnClickListener(new b90(rg0Var, 6));
                        return;
                    }
                    textView2.setText(LocaleController.getString(R.string.YouTubeVideoErrorHTML));
                    return;
                }
                textView2.setText(LocaleController.getString(R.string.YouTubeVideoErrorInvalid));
                return;
            case 6:
                ak0 ak0Var = (ak0) obj;
                ak0Var.V0 = false;
                if (ak0Var.W0) {
                    ak0Var.C(true);
                    return;
                }
                ak0Var.f24707a1 = i18;
                ak0Var.I();
                ak0Var.x();
                return;
            case 7:
                ((bw0) obj).d1(i18);
                return;
            case 8:
                ((uu0) obj).h.scrollBy(0, i18);
                return;
            case 9:
                bw0 bw0Var = ((tt0) obj).f31278a;
                org.telegram.ui.ActionBar.n2 n2Var = bw0Var.f25166v1;
                if (n2Var != null) {
                    if (bw0Var.f25127d1 instanceof TLRPC.TL_channelFull) {
                        TLRPC.TL_channels_setMainProfileTab tL_channels_setMainProfileTab = new TLRPC.TL_channels_setMainProfileTab();
                        tL_channels_setMainProfileTab.tab = bw0.d0(i18, true);
                        tL_channels_setMainProfileTab.channel = n2Var.getMessagesController().getInputChannel(bw0Var.f25127d1.f20039id);
                        TLRPC.ChatFull chatFull = bw0Var.f25127d1;
                        chatFull.flags2 |= 4194304;
                        chatFull.main_tab = tL_channels_setMainProfileTab.tab;
                        tL_account_setMainProfileTab = tL_channels_setMainProfileTab;
                    } else {
                        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab2 = new TLRPC.TL_account_setMainProfileTab();
                        TLRPC.ProfileTab d02 = bw0.d0(i18, true);
                        tL_account_setMainProfileTab2.tab = d02;
                        TLRPC.UserFull userFull = bw0Var.f25130e1;
                        tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        if (userFull != null) {
                            userFull.flags2 |= 1048576;
                            userFull.main_tab = d02;
                            n2Var.getMessagesStorage().updateUserInfo(bw0Var.f25130e1, true);
                            tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        }
                    }
                    n2Var.getConnectionsManager().sendRequest(tL_account_setMainProfileTab, null);
                    bw0Var.v1(true);
                    return;
                }
                return;
            case 10:
                ((yx0) obj).k0(i18, 0);
                return;
            case 11:
                m51 m51Var = (m51) obj;
                m51Var.V();
                m51Var.f28699g0 = i18;
                b51.J(m51Var.f28698f0);
                m51Var.W();
                return;
            case 12:
                ((n91) obj).v.x0(i18);
                return;
            case 13:
                ha1 ha1Var = (ha1) obj;
                k81 k81Var = ha1Var.f27012a;
                if (i18 == -1) {
                    if (k81Var.y()) {
                        k81Var.B();
                        ha1Var.n();
                    }
                    ha1Var.J = false;
                    return;
                } else if (i18 == 1) {
                    if (ha1Var.K) {
                        ha1Var.K = false;
                        k81Var.C();
                        return;
                    }
                    return;
                } else if (i18 != -3 && i18 == -2 && k81Var.y()) {
                    ha1Var.K = true;
                    k81Var.B();
                    ha1Var.n();
                    return;
                } else {
                    return;
                }
            case 14:
                org.telegram.ui.g60 g60Var = (org.telegram.ui.g60) obj;
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.setAudioOutput(i18);
                    g60Var.y3 = Integer.valueOf(i18);
                }
                ad adVar = new ad(g60Var.topBulletinContainer, new ai.a1());
                Resources resources = g60Var.getContext().getResources();
                if (i18 == 2) {
                    i13 = R.drawable.msg_voice_bluetooth;
                } else if (i18 == 0) {
                    i13 = R.drawable.msg_voice_speaker;
                } else {
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    if (sharedInstance2 != null && sharedInstance2.isHeadsetPlugged()) {
                        i13 = R.drawable.msg_voice_headphones;
                    } else {
                        i13 = R.drawable.msg_voice_phone;
                    }
                }
                adVar.L(resources.getDrawable(i13).mutate(), org.telegram.ui.g60.h1(i18)).k(g60Var.o1());
                return;
            case 15:
                org.telegram.ui.g60 g60Var2 = ((org.telegram.ui.j50) obj).f38824b;
                VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                if (sharedInstance3 != null) {
                    sharedInstance3.setAudioOutput(i18);
                    g60Var2.y3 = Integer.valueOf(i18);
                }
                ad adVar2 = new ad(g60Var2.topBulletinContainer, new ai.a1());
                Resources resources2 = g60Var2.getContext().getResources();
                if (i18 == 2) {
                    i14 = R.drawable.msg_voice_bluetooth;
                } else if (i18 == 0) {
                    i14 = R.drawable.msg_voice_speaker;
                } else {
                    VoIPService sharedInstance4 = VoIPService.getSharedInstance();
                    if (sharedInstance4 != null && sharedInstance4.isHeadsetPlugged()) {
                        i14 = R.drawable.msg_voice_headphones;
                    } else {
                        i14 = R.drawable.msg_voice_phone;
                    }
                }
                adVar2.L(resources2.getDrawable(i14).mutate(), org.telegram.ui.g60.h1(i18)).k(g60Var2.o1());
                return;
            case 16:
                org.telegram.ui.c70 c70Var = (org.telegram.ui.c70) obj;
                AnimatorSet animatorSet = new AnimatorSet();
                int childCount = c70Var.f36557n.getChildCount();
                for (int i19 = 0; i19 < childCount; i19++) {
                    View childAt = c70Var.f36557n.getChildAt(i19);
                    c70Var.f36557n.getClass();
                    if (RecyclerView.R(childAt) >= i18) {
                        childAt.setAlpha(0.0f);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f);
                        ofFloat.setStartDelay((int) ((Math.min(c70Var.f36557n.getMeasuredHeight(), Math.max(0, childAt.getTop())) / c70Var.f36557n.getMeasuredHeight()) * 100.0f));
                        ofFloat.setDuration(200L);
                        animatorSet.playTogether(ofFloat);
                    }
                }
                animatorSet.start();
                return;
            case 17:
                org.telegram.ui.hd0 hd0Var = (org.telegram.ui.hd0) obj;
                hd0Var.Y.h1(0, -AndroidUtilities.dp(i18));
                hd0Var.z0(false);
                return;
            case 18:
                ((org.telegram.ui.fe0) obj).f37523a.f36732f[i18].l(1.0f);
                return;
            case 19:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj;
                notificationsSettingsActivity.V = true;
                notificationsSettingsActivity.f33840c.m(i18);
                return;
            case 20:
                ((org.telegram.ui.il0) obj).run(Integer.valueOf(i18));
                return;
            case 21:
                ((org.telegram.ui.np0) obj).f40308e.f42530p0.I.D(1 - i18);
                return;
            case 22:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.U8;
                int i20 = i18 + 1;
                if (i20 < 6 && (wu0Var = photoViewer.f33904e0) != null) {
                    wu0Var.invalidate();
                    AndroidUtilities.runOnUIThread(new nd(photoViewer, i20, 22), 100L);
                    return;
                }
                return;
            case 23:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.f34386z0);
                String string = LocaleController.getString(R.string.ProfileNotesRemoveTitle);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20374a;
                b2Var.R = string;
                b2Var.T = LocaleController.getString(R.string.ProfileNotesRemoveText);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new i2.s(profileActivity, i18, 18));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                return;
            case 24:
                org.telegram.ui.x01 x01Var = (org.telegram.ui.x01) obj;
                org.telegram.ui.y01 y01Var = x01Var.h;
                NotificationCenter notificationCenter = y01Var.f44189e.getNotificationCenter();
                ProfileActivity profileActivity2 = y01Var.f44189e;
                int i21 = NotificationCenter.newSuggestionsAvailable;
                notificationCenter.removeObserver(profileActivity2, i21);
                if (i18 == 2) {
                    profileActivity2.getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
                    of.f.s(x01Var.getContext(), profileActivity2.getMessagesController().premiumManageSubscriptionUrl);
                } else {
                    MessagesController messagesController = profileActivity2.getMessagesController();
                    if (i18 == 0) {
                        str2 = "VALIDATE_PHONE_NUMBER";
                    } else {
                        str2 = "VALIDATE_PASSWORD";
                    }
                    messagesController.removeSuggestion(0L, str2);
                }
                profileActivity2.getNotificationCenter().addObserver(profileActivity2, i21);
                profileActivity2.e5(false, false);
                return;
            case 25:
                org.telegram.ui.n21 n21Var = (org.telegram.ui.n21) obj;
                AndroidUtilities.hideKeyboard(n21Var.d.findFocus());
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr = n21Var.f40050a;
                    if (i17 < editTextBoldCursorArr.length) {
                        if (i17 != 0 && ((i18 != 3 || i17 != 4) && ((i18 != 2 || (i17 != 4 && i17 != 1)) && (i18 != 1 || (i17 != 1 && i17 != 2 && i17 != 3))))) {
                            editTextBoldCursorArr[i17].setText((CharSequence) null);
                        }
                        i17++;
                    } else {
                        return;
                    }
                }
                break;
            case 26:
                org.telegram.ui.d31 d31Var = (org.telegram.ui.d31) obj;
                s4.p0 layoutManager = d31Var.f36830y.getLayoutManager();
                if (layoutManager != null) {
                    if (d31Var.R) {
                        if (i18 > d31Var.L) {
                            i15 = Math.min(i18 + 1, d31Var.f36821b.d.size() - 1);
                        } else {
                            i15 = Math.max(i18 - 1, 0);
                        }
                    } else {
                        i15 = i18;
                    }
                    org.telegram.ui.a31 a31Var = d31Var.f36822c;
                    a31Var.f47825a = i15;
                    layoutManager.w0(a31Var);
                }
                d31Var.L = i18;
                return;
            case 27:
                SessionsActivity sessionsActivity = (SessionsActivity) obj;
                sessionsActivity.h.remove(i18);
                sessionsActivity.m0();
                org.telegram.ui.u81 u81Var = sessionsActivity.f34473a;
                if (u81Var != null) {
                    u81Var.l();
                    return;
                }
                return;
            case 28:
                wi1 wi1Var = (wi1) obj;
                wi1Var.F.setSignalBarCount(i18);
                if (i18 <= 1) {
                    org.telegram.ui.Components.voip.c3 c3Var = wi1Var.v;
                    if (c3Var.V != 3) {
                        c3Var.V = 3;
                        ValueAnimator ofInt = ValueAnimator.ofInt(c3Var.H, 255);
                        c3Var.O = ofInt;
                        ofInt.addUpdateListener(new org.telegram.ui.Components.voip.a3(c3Var, 2));
                        c3Var.O.setDuration(500L);
                        c3Var.O.start();
                    }
                    wi1Var.F.c(true);
                    return;
                }
                org.telegram.ui.Components.voip.c3 c3Var2 = wi1Var.v;
                if (c3Var2.V != 2) {
                    c3Var2.V = 2;
                    c3Var2.c();
                    ValueAnimator valueAnimator = c3Var2.O;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllUpdateListeners();
                        c3Var2.O.cancel();
                    }
                    ValueAnimator ofInt2 = ValueAnimator.ofInt(c3Var2.H, 0);
                    c3Var2.O = ofInt2;
                    ofInt2.addUpdateListener(new org.telegram.ui.Components.voip.a3(c3Var2, 0));
                    c3Var2.O.setDuration(500L);
                    c3Var2.O.start();
                }
                wi1Var.F.c(false);
                return;
            default:
                org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) obj;
                HashSet hashSet = k0Var.A;
                hashSet.remove(Integer.valueOf(i18));
                if (hashSet.isEmpty()) {
                    k0Var.P();
                    return;
                }
                return;
        }
    }
}
