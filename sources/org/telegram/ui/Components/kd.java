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
import org.telegram.ui.ti1;
public final class kd implements Runnable {
    public final int f25760a;
    public final int f25761b;
    public final Object f25762c;

    public kd(Object obj, int i10, int i11) {
        this.f25760a = i11;
        this.f25762c = obj;
        this.f25761b = i10;
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
        org.telegram.ui.vu0 vu0Var;
        String str2;
        int i15;
        int i16 = this.f25760a;
        float f7 = 1.0f;
        int i17 = 0;
        int i18 = this.f25761b;
        Object obj = this.f25762c;
        switch (i16) {
            case 0:
                ld ldVar = (ld) obj;
                ci.f4 f4Var = ldVar.f26102d1;
                if (ldVar.f26100b1 != i18) {
                    ldVar.setTimer(i18);
                    Utilities.Callback callback = ldVar.f26115r1;
                    if (callback != null) {
                        callback.run(Integer.valueOf(i18));
                    }
                    if (i18 == 0) {
                        if (ldVar.f26114q1) {
                            i12 = R.string.TimerPeriodVideoKeep;
                        } else {
                            i12 = R.string.TimerPeriodPhotoKeep;
                        }
                        replaceTags = LocaleController.getString(i12);
                        f4Var.h = ldVar.getMeasuredWidth();
                        f4Var.p(false);
                        f4Var.k(13.0f, 4.0f, 10.0f, 4.0f);
                        f4Var.f4631e0 = AndroidUtilities.dp(0);
                        f4Var.f4630d0 = -AndroidUtilities.dp(1.0f);
                    } else if (i18 == Integer.MAX_VALUE) {
                        if (ldVar.f26114q1) {
                            i10 = R.string.TimerPeriodVideoSetOnce;
                        } else {
                            i10 = R.string.TimerPeriodPhotoSetOnce;
                        }
                        replaceTags = LocaleController.getString(i10);
                        f4Var.h = ldVar.getMeasuredWidth();
                        f4Var.p(false);
                        f4Var.k(13.0f, 4.0f, 10.0f, 4.0f);
                        f4Var.f4631e0 = AndroidUtilities.dp(0);
                        f4Var.f4630d0 = -AndroidUtilities.dp(1.0f);
                    } else if (i18 > 0) {
                        if (ldVar.f26114q1) {
                            str = "TimerPeriodVideoSetSeconds";
                        } else {
                            str = "TimerPeriodPhotoSetSeconds";
                        }
                        replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString(str, i18, new Object[0]));
                        f4Var.p(true);
                        f4Var.h = ci.f4.a(replaceTags, f4Var.getTextPaint());
                        f4Var.k(12.0f, 7.0f, 11.0f, 7.0f);
                        f4Var.f4631e0 = AndroidUtilities.dp(2);
                        f4Var.f4630d0 = 0.0f;
                    } else {
                        return;
                    }
                    float dp = (-Math.min(AndroidUtilities.dp(34.0f), ldVar.getEditTextHeight())) - AndroidUtilities.dp(14.0f);
                    if (ldVar instanceof org.telegram.ui.ct0) {
                        f7 = -1.0f;
                    }
                    f4Var.setTranslationY(dp * f7);
                    f4Var.s(replaceTags);
                    if (i18 > 0) {
                        i11 = R.raw.fire_on;
                    } else {
                        i11 = R.raw.fire_off;
                    }
                    hj0 hj0Var = new hj0(i11, AndroidUtilities.dp(34.0f), AndroidUtilities.dp(34.0f));
                    hj0Var.start();
                    f4Var.j(hj0Var);
                    f4Var.u();
                    ldVar.f26112o1 = false;
                    AndroidUtilities.cancelRunOnUIThread(ldVar.f26113p1);
                    ldVar.invalidate();
                    return;
                }
                return;
            case 1:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                if (i18 == 0) {
                    chatActivityEnterView.f22096z2 = 0;
                }
                chatActivityEnterView.V0 = null;
                dg dgVar = chatActivityEnterView.U0;
                if (dgVar != null) {
                    if (chatActivityEnterView.f21972c5 == null) {
                        dgVar.setTranslationY(0.0f);
                    }
                    chatActivityEnterView.U0.setVisibility(8);
                    chatActivityEnterView.f22025m1.removeView(chatActivityEnterView.U0);
                    if (chatActivityEnterView.F3) {
                        chatActivityEnterView.F3 = false;
                        chatActivityEnterView.U0 = null;
                    }
                }
                ng ngVar = chatActivityEnterView.Y2;
                if (ngVar != null) {
                    ngVar.y(0.0f);
                }
                chatActivityEnterView.requestLayout();
                return;
            case 2:
                pm pmVar = (pm) obj;
                qm qmVar = pmVar.P;
                if (i18 == pmVar.O && qmVar.f27610w.isShown()) {
                    qmVar.f27610w.e(1, true);
                    return;
                }
                return;
            case 3:
                kz kzVar = (kz) obj;
                if (kzVar.P1) {
                    ly lyVar = kzVar.f25951t1;
                    if (lyVar != null && lyVar.k()) {
                        try {
                            kzVar.f25963x.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    kzVar.Q1 = true;
                    int max = Math.max(50, i18 - 100);
                    AndroidUtilities.runOnUIThread(new kd(kzVar, max, 3), max);
                    return;
                }
                return;
            case 4:
                ((wa0) obj).f30018b.run(Integer.valueOf(i18));
                return;
            case 5:
                xf0 xf0Var = (xf0) obj;
                org.telegram.ui.iu0 iu0Var = xf0Var.f30258a;
                TextView textView = iu0Var.e;
                ci.eb ebVar = iu0Var.h;
                RadialProgressView radialProgressView = iu0Var.f30517n;
                TextView textView2 = iu0Var.d;
                textView.setVisibility(8);
                iu0Var.f30516f.setVisibility(8);
                LinearLayout linearLayout = iu0Var.f30515c;
                if (linearLayout.getVisibility() == 8) {
                    linearLayout.setVisibility(0);
                    linearLayout.animate().cancel();
                    linearLayout.animate().alpha(1.0f).setDuration(150L).start();
                }
                if (radialProgressView.getAlpha() == 1.0f) {
                    radialProgressView.animate().cancel();
                    radialProgressView.animate().alpha(0.0f).setDuration(150L).setListener(new wf0(xf0Var, 0));
                }
                if (ebVar.getAlpha() == 1.0f) {
                    ebVar.animate().cancel();
                    ebVar.animate().alpha(0.0f).setDuration(150L).setListener(new wf0(xf0Var, 1));
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
                        textView.setOnClickListener(new f80(xf0Var, 7));
                        return;
                    }
                    textView2.setText(LocaleController.getString(R.string.YouTubeVideoErrorHTML));
                    return;
                }
                textView2.setText(LocaleController.getString(R.string.YouTubeVideoErrorInvalid));
                return;
            case 6:
                fj0 fj0Var = (fj0) obj;
                fj0Var.V0 = false;
                if (fj0Var.W0) {
                    fj0Var.C(true);
                    return;
                }
                fj0Var.f24131a1 = i18;
                fj0Var.I();
                fj0Var.x();
                return;
            case 7:
                ((jv0) obj).d1(i18);
                return;
            case 8:
                ((cu0) obj).h.scrollBy(0, i18);
                return;
            case 9:
                jv0 jv0Var = ((bt0) obj).f23050a;
                org.telegram.ui.ActionBar.n2 n2Var = jv0Var.f25528v1;
                if (n2Var != null) {
                    if (jv0Var.f25490d1 instanceof TLRPC.TL_channelFull) {
                        TLRPC.TL_channels_setMainProfileTab tL_channels_setMainProfileTab = new TLRPC.TL_channels_setMainProfileTab();
                        tL_channels_setMainProfileTab.tab = jv0.d0(i18, true);
                        tL_channels_setMainProfileTab.channel = n2Var.getMessagesController().getInputChannel(jv0Var.f25490d1.f18329id);
                        TLRPC.ChatFull chatFull = jv0Var.f25490d1;
                        chatFull.flags2 |= 4194304;
                        chatFull.main_tab = tL_channels_setMainProfileTab.tab;
                        tL_account_setMainProfileTab = tL_channels_setMainProfileTab;
                    } else {
                        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab2 = new TLRPC.TL_account_setMainProfileTab();
                        TLRPC.ProfileTab d02 = jv0.d0(i18, true);
                        tL_account_setMainProfileTab2.tab = d02;
                        TLRPC.UserFull userFull = jv0Var.f25492e1;
                        tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        if (userFull != null) {
                            userFull.flags2 |= 1048576;
                            userFull.main_tab = d02;
                            n2Var.getMessagesStorage().updateUserInfo(jv0Var.f25492e1, true);
                            tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        }
                    }
                    n2Var.getConnectionsManager().sendRequest(tL_account_setMainProfileTab, null);
                    jv0Var.v1(true);
                    return;
                }
                return;
            case 10:
                ((hx0) obj).l0(i18, 0);
                return;
            case 11:
                u41 u41Var = (u41) obj;
                u41Var.U();
                u41Var.f28547g0 = i18;
                j41.I(u41Var.f28546f0);
                u41Var.V();
                return;
            case 12:
                ((w81) obj).v.y0(i18);
                return;
            case 13:
                p91 p91Var = (p91) obj;
                t71 t71Var = p91Var.f27211a;
                if (i18 == -1) {
                    if (t71Var.y()) {
                        t71Var.B();
                        p91Var.n();
                    }
                    p91Var.J = false;
                    return;
                } else if (i18 == 1) {
                    if (p91Var.K) {
                        p91Var.K = false;
                        t71Var.C();
                        return;
                    }
                    return;
                } else if (i18 != -3 && i18 == -2 && t71Var.y()) {
                    p91Var.K = true;
                    t71Var.B();
                    p91Var.n();
                    return;
                } else {
                    return;
                }
            case 14:
                org.telegram.ui.i60 i60Var = (org.telegram.ui.i60) obj;
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.setAudioOutput(i18);
                    i60Var.y3 = Integer.valueOf(i18);
                }
                xc xcVar = new xc(i60Var.topBulletinContainer, new ai.a1());
                Resources resources = i60Var.getContext().getResources();
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
                xcVar.L(resources.getDrawable(i13).mutate(), org.telegram.ui.i60.g1(i18)).k(i60Var.n1());
                return;
            case 15:
                org.telegram.ui.i60 i60Var2 = ((org.telegram.ui.l50) obj).f35306b;
                VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                if (sharedInstance3 != null) {
                    sharedInstance3.setAudioOutput(i18);
                    i60Var2.y3 = Integer.valueOf(i18);
                }
                xc xcVar2 = new xc(i60Var2.topBulletinContainer, new ai.a1());
                Resources resources2 = i60Var2.getContext().getResources();
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
                xcVar2.L(resources2.getDrawable(i14).mutate(), org.telegram.ui.i60.g1(i18)).k(i60Var2.n1());
                return;
            case 16:
                org.telegram.ui.e70 e70Var = (org.telegram.ui.e70) obj;
                AnimatorSet animatorSet = new AnimatorSet();
                int childCount = e70Var.f33261n.getChildCount();
                for (int i19 = 0; i19 < childCount; i19++) {
                    View childAt = e70Var.f33261n.getChildAt(i19);
                    e70Var.f33261n.getClass();
                    if (RecyclerView.S(childAt) >= i18) {
                        childAt.setAlpha(0.0f);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f);
                        ofFloat.setStartDelay((int) ((Math.min(e70Var.f33261n.getMeasuredHeight(), Math.max(0, childAt.getTop())) / e70Var.f33261n.getMeasuredHeight()) * 100.0f));
                        ofFloat.setDuration(200L);
                        animatorSet.playTogether(ofFloat);
                    }
                }
                animatorSet.start();
                return;
            case 17:
                org.telegram.ui.kd0 kd0Var = (org.telegram.ui.kd0) obj;
                kd0Var.Y.h1(0, -AndroidUtilities.dp(i18));
                kd0Var.A0(false);
                return;
            case 18:
                ((org.telegram.ui.ie0) obj).f34539a.f33125f[i18].l(1.0f);
                return;
            case 19:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj;
                notificationsSettingsActivity.V = true;
                notificationsSettingsActivity.f31160c.m(i18);
                return;
            case 20:
                ((org.telegram.ui.il0) obj).run(Integer.valueOf(i18));
                return;
            case 21:
                ((org.telegram.ui.pp0) obj).e.f39211p0.I.E(1 - i18);
                return;
            case 22:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.U8;
                int i20 = i18 + 1;
                if (i20 < 6 && (vu0Var = photoViewer.f31221e0) != null) {
                    vu0Var.invalidate();
                    AndroidUtilities.runOnUIThread(new kd(photoViewer, i20, 22), 100L);
                    return;
                }
                return;
            case 23:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.f31696z0);
                String string = LocaleController.getString(R.string.ProfileNotesRemoveTitle);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18654a;
                b2Var.R = string;
                b2Var.T = LocaleController.getString(R.string.ProfileNotesRemoveText);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new i2.s(profileActivity, i18, 17));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                return;
            case 24:
                org.telegram.ui.y01 y01Var = (org.telegram.ui.y01) obj;
                org.telegram.ui.z01 z01Var = y01Var.h;
                NotificationCenter notificationCenter = z01Var.e.getNotificationCenter();
                ProfileActivity profileActivity2 = z01Var.e;
                int i21 = NotificationCenter.newSuggestionsAvailable;
                notificationCenter.removeObserver(profileActivity2, i21);
                if (i18 == 2) {
                    profileActivity2.getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
                    nf.f.s(y01Var.getContext(), profileActivity2.getMessagesController().premiumManageSubscriptionUrl);
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
                org.telegram.ui.o21 o21Var = (org.telegram.ui.o21) obj;
                AndroidUtilities.hideKeyboard(o21Var.d.findFocus());
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr = o21Var.f36171a;
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
                org.telegram.ui.e31 e31Var = (org.telegram.ui.e31) obj;
                s4.o0 layoutManager = e31Var.f33218y.getLayoutManager();
                if (layoutManager != null) {
                    if (e31Var.R) {
                        if (i18 > e31Var.L) {
                            i15 = Math.min(i18 + 1, e31Var.f33210b.d.size() - 1);
                        } else {
                            i15 = Math.max(i18 - 1, 0);
                        }
                    } else {
                        i15 = i18;
                    }
                    org.telegram.ui.b31 b31Var = e31Var.f33211c;
                    b31Var.f43124a = i15;
                    layoutManager.w0(b31Var);
                }
                e31Var.L = i18;
                return;
            case 27:
                SessionsActivity sessionsActivity = (SessionsActivity) obj;
                sessionsActivity.h.remove(i18);
                sessionsActivity.m0();
                org.telegram.ui.t81 t81Var = sessionsActivity.f31780a;
                if (t81Var != null) {
                    t81Var.l();
                    return;
                }
                return;
            case 28:
                ti1 ti1Var = (ti1) obj;
                ti1Var.F.setSignalBarCount(i18);
                if (i18 <= 1) {
                    org.telegram.ui.Components.voip.c3 c3Var = ti1Var.v;
                    if (c3Var.V != 3) {
                        c3Var.V = 3;
                        ValueAnimator ofInt = ValueAnimator.ofInt(c3Var.H, 255);
                        c3Var.O = ofInt;
                        ofInt.addUpdateListener(new org.telegram.ui.Components.voip.a3(c3Var, 2));
                        c3Var.O.setDuration(500L);
                        c3Var.O.start();
                    }
                    ti1Var.F.c(true);
                    return;
                }
                org.telegram.ui.Components.voip.c3 c3Var2 = ti1Var.v;
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
                ti1Var.F.c(false);
                return;
            default:
                qg.j jVar = (qg.j) obj;
                jVar.L = i18;
                jVar.K = true;
                try {
                    jVar.performHapticFeedback(3, 2);
                } catch (Exception unused2) {
                }
                ValueAnimator valueAnimator2 = jVar.P;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ValueAnimator valueAnimator3 = jVar.Q;
                if (valueAnimator3 != null) {
                    valueAnimator3.cancel();
                }
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                jVar.P = duration;
                duration.setInterpolator(qr.f27642f);
                jVar.P.addUpdateListener(new qg.f(jVar, 5));
                jVar.P.addListener(new qg.g(jVar, 2));
                jVar.P.start();
                return;
        }
    }
}
