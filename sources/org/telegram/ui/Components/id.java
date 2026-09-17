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
public final class id implements Runnable {
    public final int f24925a;
    public final int f24926b;
    public final Object f24927c;

    public id(Object obj, int i10, int i11) {
        this.f24925a = i11;
        this.f24927c = obj;
        this.f24926b = i10;
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
        org.telegram.ui.xu0 xu0Var;
        String str2;
        int i15;
        int i16 = this.f24925a;
        float f7 = 1.0f;
        int i17 = 0;
        int i18 = this.f24926b;
        Object obj = this.f24927c;
        switch (i16) {
            case 0:
                jd jdVar = (jd) obj;
                ci.f4 f4Var = jdVar.f25210d1;
                if (jdVar.f25208b1 != i18) {
                    jdVar.setTimer(i18);
                    Utilities.Callback callback = jdVar.f25223r1;
                    if (callback != null) {
                        callback.run(Integer.valueOf(i18));
                    }
                    if (i18 == 0) {
                        if (jdVar.f25222q1) {
                            i12 = R.string.TimerPeriodVideoKeep;
                        } else {
                            i12 = R.string.TimerPeriodPhotoKeep;
                        }
                        replaceTags = LocaleController.getString(i12);
                        f4Var.h = jdVar.getMeasuredWidth();
                        f4Var.p(false);
                        f4Var.k(13.0f, 4.0f, 10.0f, 4.0f);
                        f4Var.f4630e0 = AndroidUtilities.dp(0);
                        f4Var.f4629d0 = -AndroidUtilities.dp(1.0f);
                    } else if (i18 == Integer.MAX_VALUE) {
                        if (jdVar.f25222q1) {
                            i10 = R.string.TimerPeriodVideoSetOnce;
                        } else {
                            i10 = R.string.TimerPeriodPhotoSetOnce;
                        }
                        replaceTags = LocaleController.getString(i10);
                        f4Var.h = jdVar.getMeasuredWidth();
                        f4Var.p(false);
                        f4Var.k(13.0f, 4.0f, 10.0f, 4.0f);
                        f4Var.f4630e0 = AndroidUtilities.dp(0);
                        f4Var.f4629d0 = -AndroidUtilities.dp(1.0f);
                    } else if (i18 > 0) {
                        if (jdVar.f25222q1) {
                            str = "TimerPeriodVideoSetSeconds";
                        } else {
                            str = "TimerPeriodPhotoSetSeconds";
                        }
                        replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString(str, i18, new Object[0]));
                        f4Var.p(true);
                        f4Var.h = ci.f4.a(replaceTags, f4Var.getTextPaint());
                        f4Var.k(12.0f, 7.0f, 11.0f, 7.0f);
                        f4Var.f4630e0 = AndroidUtilities.dp(2);
                        f4Var.f4629d0 = 0.0f;
                    } else {
                        return;
                    }
                    float dp = (-Math.min(AndroidUtilities.dp(34.0f), jdVar.getEditTextHeight())) - AndroidUtilities.dp(14.0f);
                    if (jdVar instanceof org.telegram.ui.et0) {
                        f7 = -1.0f;
                    }
                    f4Var.setTranslationY(dp * f7);
                    f4Var.s(replaceTags);
                    if (i18 > 0) {
                        i11 = R.raw.fire_on;
                    } else {
                        i11 = R.raw.fire_off;
                    }
                    yi0 yi0Var = new yi0(i11, AndroidUtilities.dp(34.0f), AndroidUtilities.dp(34.0f));
                    yi0Var.start();
                    f4Var.j(yi0Var);
                    f4Var.u();
                    jdVar.f25220o1 = false;
                    AndroidUtilities.cancelRunOnUIThread(jdVar.f25221p1);
                    jdVar.invalidate();
                    return;
                }
                return;
            case 1:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                if (i18 == 0) {
                    chatActivityEnterView.f21885z2 = 0;
                }
                chatActivityEnterView.V0 = null;
                cg cgVar = chatActivityEnterView.U0;
                if (cgVar != null) {
                    if (chatActivityEnterView.f21761c5 == null) {
                        cgVar.setTranslationY(0.0f);
                    }
                    chatActivityEnterView.U0.setVisibility(8);
                    chatActivityEnterView.f21814m1.removeView(chatActivityEnterView.U0);
                    if (chatActivityEnterView.F3) {
                        chatActivityEnterView.F3 = false;
                        chatActivityEnterView.U0 = null;
                    }
                }
                mg mgVar = chatActivityEnterView.Y2;
                if (mgVar != null) {
                    mgVar.y(0.0f);
                }
                chatActivityEnterView.requestLayout();
                return;
            case 2:
                pm pmVar = (pm) obj;
                qm qmVar = pmVar.P;
                if (i18 == pmVar.O && qmVar.f27350w.isShown()) {
                    qmVar.f27350w.e(1, true);
                    return;
                }
                return;
            case 3:
                kz kzVar = (kz) obj;
                if (kzVar.P1) {
                    ky kyVar = kzVar.f25766t1;
                    if (kyVar != null && kyVar.k()) {
                        try {
                            kzVar.f25778x.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    kzVar.Q1 = true;
                    int max = Math.max(50, i18 - 100);
                    AndroidUtilities.runOnUIThread(new id(kzVar, max, 3), max);
                    return;
                }
                return;
            case 4:
                ((oa0) obj).f26691b.run(Integer.valueOf(i18));
                return;
            case 5:
                pf0 pf0Var = (pf0) obj;
                org.telegram.ui.ku0 ku0Var = pf0Var.f27020a;
                TextView textView = ku0Var.e;
                ci.eb ebVar = ku0Var.h;
                RadialProgressView radialProgressView = ku0Var.f27282n;
                TextView textView2 = ku0Var.d;
                textView.setVisibility(8);
                ku0Var.f27281f.setVisibility(8);
                LinearLayout linearLayout = ku0Var.f27280c;
                if (linearLayout.getVisibility() == 8) {
                    linearLayout.setVisibility(0);
                    linearLayout.animate().cancel();
                    linearLayout.animate().alpha(1.0f).setDuration(150L).start();
                }
                if (radialProgressView.getAlpha() == 1.0f) {
                    radialProgressView.animate().cancel();
                    radialProgressView.animate().alpha(0.0f).setDuration(150L).setListener(new of0(pf0Var, 0));
                }
                if (ebVar.getAlpha() == 1.0f) {
                    ebVar.animate().cancel();
                    ebVar.animate().alpha(0.0f).setDuration(150L).setListener(new of0(pf0Var, 1));
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
                        textView.setOnClickListener(new x70(pf0Var, 7));
                        return;
                    }
                    textView2.setText(LocaleController.getString(R.string.YouTubeVideoErrorHTML));
                    return;
                }
                textView2.setText(LocaleController.getString(R.string.YouTubeVideoErrorInvalid));
                return;
            case 6:
                wi0 wi0Var = (wi0) obj;
                wi0Var.V0 = false;
                if (wi0Var.W0) {
                    wi0Var.C(true);
                    return;
                }
                wi0Var.f29682a1 = i18;
                wi0Var.I();
                wi0Var.x();
                return;
            case 7:
                ((zu0) obj).d1(i18);
                return;
            case 8:
                ((st0) obj).h.scrollBy(0, i18);
                return;
            case 9:
                zu0 zu0Var = ((rs0) obj).f27686a;
                org.telegram.ui.ActionBar.o2 o2Var = zu0Var.f30656v1;
                if (o2Var != null) {
                    if (zu0Var.f30618d1 instanceof TLRPC.TL_channelFull) {
                        TLRPC.TL_channels_setMainProfileTab tL_channels_setMainProfileTab = new TLRPC.TL_channels_setMainProfileTab();
                        tL_channels_setMainProfileTab.tab = zu0.d0(i18, true);
                        tL_channels_setMainProfileTab.channel = o2Var.getMessagesController().getInputChannel(zu0Var.f30618d1.f18122id);
                        TLRPC.ChatFull chatFull = zu0Var.f30618d1;
                        chatFull.flags2 |= 4194304;
                        chatFull.main_tab = tL_channels_setMainProfileTab.tab;
                        tL_account_setMainProfileTab = tL_channels_setMainProfileTab;
                    } else {
                        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab2 = new TLRPC.TL_account_setMainProfileTab();
                        TLRPC.ProfileTab d02 = zu0.d0(i18, true);
                        tL_account_setMainProfileTab2.tab = d02;
                        TLRPC.UserFull userFull = zu0Var.f30620e1;
                        tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        if (userFull != null) {
                            userFull.flags2 |= 1048576;
                            userFull.main_tab = d02;
                            o2Var.getMessagesStorage().updateUserInfo(zu0Var.f30620e1, true);
                            tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        }
                    }
                    o2Var.getConnectionsManager().sendRequest(tL_account_setMainProfileTab, null);
                    zu0Var.v1(true);
                    return;
                }
                return;
            case 10:
                ((xw0) obj).l0(i18, 0);
                return;
            case 11:
                h41 h41Var = (h41) obj;
                h41Var.U();
                h41Var.f24480g0 = i18;
                w31.I(h41Var.f24479f0);
                h41Var.V();
                return;
            case 12:
                ((i81) obj).v.y0(i18);
                return;
            case 13:
                d91 d91Var = (d91) obj;
                h71 h71Var = d91Var.f23264a;
                if (i18 == -1) {
                    if (h71Var.y()) {
                        h71Var.B();
                        d91Var.n();
                    }
                    d91Var.J = false;
                    return;
                } else if (i18 == 1) {
                    if (d91Var.K) {
                        d91Var.K = false;
                        h71Var.C();
                        return;
                    }
                    return;
                } else if (i18 != -3 && i18 == -2 && h71Var.y()) {
                    d91Var.K = true;
                    h71Var.B();
                    d91Var.n();
                    return;
                } else {
                    return;
                }
            case 14:
                org.telegram.ui.k60 k60Var = (org.telegram.ui.k60) obj;
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.setAudioOutput(i18);
                    k60Var.y3 = Integer.valueOf(i18);
                }
                vc vcVar = new vc(k60Var.topBulletinContainer, new ai.a1());
                Resources resources = k60Var.getContext().getResources();
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
                vcVar.L(resources.getDrawable(i13).mutate(), org.telegram.ui.k60.g1(i18)).k(k60Var.n1());
                return;
            case 15:
                org.telegram.ui.k60 k60Var2 = ((org.telegram.ui.n50) obj).f35945b;
                VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                if (sharedInstance3 != null) {
                    sharedInstance3.setAudioOutput(i18);
                    k60Var2.y3 = Integer.valueOf(i18);
                }
                vc vcVar2 = new vc(k60Var2.topBulletinContainer, new ai.a1());
                Resources resources2 = k60Var2.getContext().getResources();
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
                vcVar2.L(resources2.getDrawable(i14).mutate(), org.telegram.ui.k60.g1(i18)).k(k60Var2.n1());
                return;
            case 16:
                org.telegram.ui.g70 g70Var = (org.telegram.ui.g70) obj;
                AnimatorSet animatorSet = new AnimatorSet();
                int childCount = g70Var.f33883n.getChildCount();
                for (int i19 = 0; i19 < childCount; i19++) {
                    View childAt = g70Var.f33883n.getChildAt(i19);
                    g70Var.f33883n.getClass();
                    if (RecyclerView.S(childAt) >= i18) {
                        childAt.setAlpha(0.0f);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f);
                        ofFloat.setStartDelay((int) ((Math.min(g70Var.f33883n.getMeasuredHeight(), Math.max(0, childAt.getTop())) / g70Var.f33883n.getMeasuredHeight()) * 100.0f));
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
                ((org.telegram.ui.ie0) obj).f34541a.f33749f[i18].l(1.0f);
                return;
            case 19:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj;
                notificationsSettingsActivity.V = true;
                notificationsSettingsActivity.f30890c.m(i18);
                return;
            case 20:
                ((org.telegram.ui.hl0) obj).run(Integer.valueOf(i18));
                return;
            case 21:
                ((org.telegram.ui.pp0) obj).e.f39147p0.I.E(1 - i18);
                return;
            case 22:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.T8;
                int i20 = i18 + 1;
                if (i20 < 6 && (xu0Var = photoViewer.f30950e0) != null) {
                    xu0Var.invalidate();
                    AndroidUtilities.runOnUIThread(new id(photoViewer, i20, 22), 100L);
                    return;
                }
                return;
            case 23:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.f31425z0);
                String string = LocaleController.getString(R.string.ProfileNotesRemoveTitle);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18446a;
                c2Var.R = string;
                c2Var.T = LocaleController.getString(R.string.ProfileNotesRemoveText);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new i2.s(profileActivity, i18, 17));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                return;
            case 24:
                org.telegram.ui.a11 a11Var = (org.telegram.ui.a11) obj;
                org.telegram.ui.b11 b11Var = a11Var.h;
                NotificationCenter notificationCenter = b11Var.e.getNotificationCenter();
                ProfileActivity profileActivity2 = b11Var.e;
                int i21 = NotificationCenter.newSuggestionsAvailable;
                notificationCenter.removeObserver(profileActivity2, i21);
                if (i18 == 2) {
                    profileActivity2.getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
                    nf.f.s(a11Var.getContext(), profileActivity2.getMessagesController().premiumManageSubscriptionUrl);
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
                org.telegram.ui.q21 q21Var = (org.telegram.ui.q21) obj;
                AndroidUtilities.hideKeyboard(q21Var.d.findFocus());
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr = q21Var.f36781a;
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
                org.telegram.ui.f31 f31Var = (org.telegram.ui.f31) obj;
                s4.o0 layoutManager = f31Var.f33536y.getLayoutManager();
                if (layoutManager != null) {
                    if (f31Var.R) {
                        if (i18 > f31Var.L) {
                            i15 = Math.min(i18 + 1, f31Var.f33528b.d.size() - 1);
                        } else {
                            i15 = Math.max(i18 - 1, 0);
                        }
                    } else {
                        i15 = i18;
                    }
                    org.telegram.ui.c31 c31Var = f31Var.f33529c;
                    c31Var.f42847a = i15;
                    layoutManager.w0(c31Var);
                }
                f31Var.L = i18;
                return;
            case 27:
                SessionsActivity sessionsActivity = (SessionsActivity) obj;
                sessionsActivity.h.remove(i18);
                sessionsActivity.m0();
                org.telegram.ui.r81 r81Var = sessionsActivity.f31509a;
                if (r81Var != null) {
                    r81Var.l();
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
                duration.setInterpolator(qr.f27380f);
                jVar.P.addUpdateListener(new qg.f(jVar, 5));
                jVar.P.addListener(new qg.g(jVar, 2));
                jVar.P.start();
                return;
        }
    }
}
