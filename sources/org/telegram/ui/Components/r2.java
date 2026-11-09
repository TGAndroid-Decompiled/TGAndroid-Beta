package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Intro;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.ic1;
public final class r2 implements Runnable {
    public final int f37533a;
    public final int f37534b;
    public final Object f37535c;

    public r2(int i7, Object obj, int i10) {
        this.f37533a = i10;
        this.f37534b = i7;
        this.f37535c = obj;
    }

    @Override
    public final void run() {
        String str;
        CharSequence X2;
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        org.telegram.ui.rq0 rq0Var;
        String str2;
        int i14 = this.f37533a;
        float f10 = 1.0f;
        int i15 = 0;
        Object obj = this.f37535c;
        int i16 = this.f37534b;
        switch (i14) {
            case 0:
                x70 x70Var = (x70) obj;
                ArrayList v = org.telegram.messenger.g5.r(i16).v(11);
                String M0 = org.telegram.messenger.id.M0(2131751241, null);
                if (v != null && !v.isEmpty()) {
                    int i17 = 0;
                    while (true) {
                        if (i17 < v.size()) {
                            if (v.get(i17) instanceof TLRPC.TL_privacyValueAllowContacts) {
                                M0 = org.telegram.messenger.id.M0(2131751241, null);
                            } else {
                                if ((v.get(i17) instanceof TLRPC.TL_privacyValueAllowAll) || (v.get(i17) instanceof TLRPC.TL_privacyValueDisallowAll)) {
                                    M0 = org.telegram.messenger.id.M0(2131751242, null);
                                }
                                i17++;
                            }
                        }
                    }
                }
                x70Var.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(M0, new f1(0, v)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(0.66f)));
                return;
            case 1:
                ((org.telegram.messenger.re) obj).u(i16);
                return;
            case 2:
                uc ucVar = (uc) obj;
                fi.m3 m3Var = ucVar.f38686c1;
                if (ucVar.f38684a1 != i16) {
                    ucVar.setTimer(i16);
                    org.telegram.messenger.c20 c20Var = ucVar.f38698q1;
                    if (c20Var != null) {
                        c20Var.a(Integer.valueOf(i16));
                    }
                    if (i16 == 0) {
                        if (ucVar.f38697p1) {
                            i11 = 2131744128;
                        } else {
                            i11 = 2131744133;
                        }
                        X2 = org.telegram.messenger.id.M0(i11, null);
                        m3Var.h = ucVar.getMeasuredWidth();
                        m3Var.r(false);
                        m3Var.n(13.0f, 4.0f, 10.0f, 4.0f);
                        m3Var.f12424e0 = org.telegram.messenger.g0.L(0);
                        m3Var.f12422d0 = -org.telegram.messenger.g0.L(1.0f);
                    } else if (i16 == Integer.MAX_VALUE) {
                        if (ucVar.f38697p1) {
                            i7 = 2131744127;
                        } else {
                            i7 = 2131744132;
                        }
                        X2 = org.telegram.messenger.id.M0(i7, null);
                        m3Var.h = ucVar.getMeasuredWidth();
                        m3Var.r(false);
                        m3Var.n(13.0f, 4.0f, 10.0f, 4.0f);
                        m3Var.f12424e0 = org.telegram.messenger.g0.L(0);
                        m3Var.f12422d0 = -org.telegram.messenger.g0.L(1.0f);
                    } else if (i16 > 0) {
                        if (ucVar.f38697p1) {
                            str = "TimerPeriodVideoSetSeconds";
                        } else {
                            str = "TimerPeriodPhotoSetSeconds";
                        }
                        X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.id.G(i16, str, new Object[0]));
                        m3Var.r(true);
                        m3Var.h = fi.m3.a(X2, m3Var.getTextPaint());
                        m3Var.n(12.0f, 7.0f, 11.0f, 7.0f);
                        m3Var.f12424e0 = org.telegram.messenger.g0.L(2);
                        m3Var.f12422d0 = 0.0f;
                    } else {
                        return;
                    }
                    float L = (-Math.min(org.telegram.messenger.g0.L(34.0f), ucVar.getEditTextHeight())) - org.telegram.messenger.g0.L(14.0f);
                    if (ucVar instanceof org.telegram.ui.cp0) {
                        f10 = -1.0f;
                    }
                    m3Var.setTranslationY(L * f10);
                    m3Var.u(X2);
                    if (i16 > 0) {
                        i10 = 2131624020;
                    } else {
                        i10 = 2131624019;
                    }
                    ah0 ah0Var = new ah0(i10, org.telegram.messenger.g0.L(34.0f), org.telegram.messenger.g0.L(34.0f));
                    ah0Var.start();
                    m3Var.m(ah0Var);
                    m3Var.w();
                    ucVar.n1 = false;
                    org.telegram.messenger.g0.r(ucVar.f38696o1);
                    ucVar.invalidate();
                    return;
                }
                return;
            case 3:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                if (i16 == 0) {
                    chatActivityEnterView.A2 = 0;
                }
                chatActivityEnterView.V0 = null;
                mf mfVar = chatActivityEnterView.U0;
                if (mfVar != null) {
                    if (chatActivityEnterView.f31069h5 == null) {
                        mfVar.setTranslationY(0.0f);
                    }
                    chatActivityEnterView.U0.setVisibility(8);
                    chatActivityEnterView.n1.removeView(chatActivityEnterView.U0);
                    if (chatActivityEnterView.G3) {
                        chatActivityEnterView.G3 = false;
                        chatActivityEnterView.U0 = null;
                    }
                }
                wf wfVar = chatActivityEnterView.Z2;
                if (wfVar != null) {
                    wfVar.w(0.0f);
                }
                chatActivityEnterView.requestLayout();
                return;
            case 4:
                am amVar = (am) obj;
                bm bmVar = amVar.P;
                if (i16 == amVar.O && bmVar.f32280x.isShown()) {
                    bmVar.f32280x.d(1, true);
                    return;
                }
                return;
            case 5:
                org.telegram.ui.ActionBar.v2 v2Var = (org.telegram.ui.ActionBar.v2) obj;
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T != null) {
                    v2Var.dismiss();
                    PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "create_bot");
                    premiumPreviewFragment.setCurrentAccount(i16);
                    T.presentFragment(premiumPreviewFragment);
                    return;
                }
                return;
            case 6:
                hy hyVar = (hy) obj;
                if (hyVar.P1) {
                    ix ixVar = hyVar.f34467t1;
                    if (ixVar != null && ixVar.k()) {
                        try {
                            hyVar.f34483y.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    hyVar.Q1 = true;
                    int max = Math.max(50, i16 - 100);
                    org.telegram.messenger.g0.i3(new r2(hyVar, max, 6), max);
                    return;
                }
                return;
            case 7:
                ((i90) obj).f34651b.a(Integer.valueOf(i16));
                return;
            case 8:
                ae0 ae0Var = (ae0) obj;
                org.telegram.ui.eq0 eq0Var = ae0Var.f31777a;
                TextView textView = eq0Var.f32241e;
                bi.ec ecVar = eq0Var.h;
                RadialProgressView radialProgressView = eq0Var.f32243n;
                TextView textView2 = eq0Var.d;
                textView.setVisibility(8);
                eq0Var.f32242f.setVisibility(8);
                LinearLayout linearLayout = eq0Var.f32240c;
                if (linearLayout.getVisibility() == 8) {
                    linearLayout.setVisibility(0);
                    linearLayout.animate().cancel();
                    linearLayout.animate().alpha(1.0f).setDuration(150L).start();
                }
                if (radialProgressView.getAlpha() == 1.0f) {
                    radialProgressView.animate().cancel();
                    radialProgressView.animate().alpha(0.0f).setDuration(150L).setListener(new zd0(ae0Var, 0));
                }
                if (ecVar.getAlpha() == 1.0f) {
                    ecVar.animate().cancel();
                    ecVar.animate().alpha(0.0f).setDuration(150L).setListener(new zd0(ae0Var, 1));
                }
                if (i16 != 2) {
                    if (i16 != 5) {
                        if (i16 != 150) {
                            if (i16 != 100) {
                                if (i16 != 101) {
                                    return;
                                }
                            } else {
                                textView2.setText(org.telegram.messenger.id.M0(2131742831, null));
                                return;
                            }
                        }
                        textView2.setText(org.telegram.messenger.id.M0(2131742832, null));
                        textView.setText(org.telegram.messenger.id.M0(2131742830, null));
                        textView.setVisibility(0);
                        textView.setOnClickListener(new ma0(ae0Var, 4));
                        return;
                    }
                    textView2.setText(org.telegram.messenger.id.M0(2131742834, null));
                    return;
                }
                textView2.setText(org.telegram.messenger.id.M0(2131742833, null));
                return;
            case 9:
                yg0 yg0Var = (yg0) obj;
                yg0Var.V0 = false;
                if (yg0Var.W0) {
                    yg0Var.C(true);
                    return;
                }
                yg0Var.f40719a1 = i16;
                yg0Var.I();
                yg0Var.x();
                return;
            case 10:
                w21 w21Var = (w21) obj;
                w21Var.e1();
                w21Var.Y1 = i16;
                l21.S0(w21Var.X1);
                w21Var.f1();
                return;
            case 11:
                ((v61) obj).f38986w.y0(i16);
                return;
            case 12:
                m71 m71Var = (m71) obj;
                u51 u51Var = m71Var.f35996a;
                if (i16 == -1) {
                    if (u51Var.d0()) {
                        u51Var.g0();
                        m71Var.n();
                    }
                    m71Var.J = false;
                    return;
                } else if (i16 == 1) {
                    if (m71Var.K) {
                        m71Var.K = false;
                        u51Var.h0();
                        return;
                    }
                    return;
                } else if (i16 != -3 && i16 == -2 && u51Var.d0()) {
                    m71Var.K = true;
                    u51Var.g0();
                    m71Var.n();
                    return;
                } else {
                    return;
                }
            case 13:
                org.telegram.ui.e40 e40Var = (org.telegram.ui.e40) obj;
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.setAudioOutput(i16);
                    e40Var.f45254p5 = Integer.valueOf(i16);
                }
                hc hcVar = new hc(e40Var.E, new di.i0());
                Resources resources = e40Var.getContext().getResources();
                if (i16 == 2) {
                    i12 = 2131232425;
                } else if (i16 == 0) {
                    i12 = 2131232430;
                } else {
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    if (sharedInstance2 != null && sharedInstance2.isHeadsetPlugged()) {
                        i12 = 2131232426;
                    } else {
                        i12 = 2131232428;
                    }
                }
                hcVar.M(resources.getDrawable(i12).mutate(), org.telegram.ui.e40.j1(i16)).k(e40Var.q1());
                return;
            case 14:
                org.telegram.ui.e40 e40Var2 = ((org.telegram.ui.j30) obj).f46823b;
                VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                if (sharedInstance3 != null) {
                    sharedInstance3.setAudioOutput(i16);
                    e40Var2.f45254p5 = Integer.valueOf(i16);
                }
                hc hcVar2 = new hc(e40Var2.E, new di.i0());
                Resources resources2 = e40Var2.getContext().getResources();
                if (i16 == 2) {
                    i13 = 2131232425;
                } else if (i16 == 0) {
                    i13 = 2131232430;
                } else {
                    VoIPService sharedInstance4 = VoIPService.getSharedInstance();
                    if (sharedInstance4 != null && sharedInstance4.isHeadsetPlugged()) {
                        i13 = 2131232426;
                    } else {
                        i13 = 2131232428;
                    }
                }
                hcVar2.M(resources2.getDrawable(i13).mutate(), org.telegram.ui.e40.j1(i16)).k(e40Var2.q1());
                return;
            case 15:
                org.telegram.ui.y40 y40Var = (org.telegram.ui.y40) obj;
                AnimatorSet animatorSet = new AnimatorSet();
                int childCount = y40Var.f51872n.getChildCount();
                for (int i18 = 0; i18 < childCount; i18++) {
                    View childAt = y40Var.f51872n.getChildAt(i18);
                    y40Var.f51872n.getClass();
                    if (RecyclerView.R(childAt) >= i16) {
                        childAt.setAlpha(0.0f);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f);
                        ofFloat.setStartDelay((int) ((Math.min(y40Var.f51872n.getMeasuredHeight(), Math.max(0, childAt.getTop())) / y40Var.f51872n.getMeasuredHeight()) * 100.0f));
                        ofFloat.setDuration(200L);
                        animatorSet.playTogether(ofFloat);
                    }
                }
                animatorSet.start();
                return;
            case 16:
                org.telegram.ui.v50 v50Var = (org.telegram.ui.v50) obj;
                int i19 = org.telegram.ui.v50.D;
                v50Var.a(2131231535, 17, i16, true);
                v50Var.c();
                v50Var.b(v50Var.f50577w, 23, true);
                v50Var.d();
                Intro.a(i16);
                return;
            case 17:
                org.telegram.ui.ra0 ra0Var = (org.telegram.ui.ra0) obj;
                ra0Var.U.h1(0, -org.telegram.messenger.g0.L(i16));
                ra0Var.K0(false);
                return;
            case 18:
                ((org.telegram.ui.qb0) obj).f49001a.f43768f[i16].C(1.0f);
                return;
            case 19:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj;
                notificationsSettingsActivity.V = true;
                notificationsSettingsActivity.f41323c.g(i16);
                return;
            case 20:
                ((org.telegram.ui.ai0) obj).a(Integer.valueOf(i16));
                return;
            case 21:
                ((org.telegram.ui.wl0) obj).f51429e.f45078p0.I.E(1 - i16);
                return;
            case 22:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.Y8;
                int i20 = i16 + 1;
                if (i20 < 6 && (rq0Var = photoViewer.f41391e0) != null) {
                    rq0Var.invalidate();
                    org.telegram.messenger.g0.i3(new r2(photoViewer, i20, 22), 100L);
                    return;
                }
                return;
            case 23:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                RectF rectF = ProfileActivity.V6;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, profileActivity.getParentActivity(), profileActivity.f41876z0);
                String M02 = org.telegram.messenger.id.M0(2131746647, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                u1Var.R = M02;
                u1Var.T = org.telegram.messenger.id.M0(2131746648, null);
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751598, null), new l2.q(profileActivity, i16, 17));
                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                return;
            case 24:
                org.telegram.ui.kw0 kw0Var = (org.telegram.ui.kw0) obj;
                ProfileActivity profileActivity2 = kw0Var.h.f47690e;
                profileActivity2.getNotificationCenter().n(profileActivity2, 107);
                if (i16 == 2) {
                    profileActivity2.getMessagesController().k4(0L, "PREMIUM_GRACE");
                    vf.c.t(kw0Var.getContext(), profileActivity2.getMessagesController().L5);
                } else {
                    org.telegram.messenger.qp messagesController = profileActivity2.getMessagesController();
                    if (i16 == 0) {
                        str2 = "VALIDATE_PHONE_NUMBER";
                    } else {
                        str2 = "VALIDATE_PASSWORD";
                    }
                    messagesController.k4(0L, str2);
                }
                profileActivity2.getNotificationCenter().c(profileActivity2, 107);
                profileActivity2.G5(false, false);
                return;
            case 25:
                org.telegram.ui.yx0 yx0Var = (org.telegram.ui.yx0) obj;
                org.telegram.messenger.g0.v1(yx0Var.d.findFocus());
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr = yx0Var.f52344a;
                    if (i15 < editTextBoldCursorArr.length) {
                        if (i15 != 0 && ((i16 != 3 || i15 != 4) && ((i16 != 2 || (i15 != 4 && i15 != 1)) && (i16 != 1 || (i15 != 1 && i15 != 2 && i15 != 3))))) {
                            editTextBoldCursorArr[i15].setText((CharSequence) null);
                        }
                        i15++;
                    } else {
                        return;
                    }
                }
                break;
            case 26:
                SessionsActivity sessionsActivity = (SessionsActivity) obj;
                sessionsActivity.f41966f.remove(i16);
                sessionsActivity.r0();
                org.telegram.ui.a31 a31Var = sessionsActivity.f41962a;
                if (a31Var != null) {
                    a31Var.f();
                    return;
                }
                return;
            case 27:
                ic1 ic1Var = (ic1) obj;
                ic1Var.F.setSignalBarCount(i16);
                if (i16 <= 1) {
                    org.telegram.ui.Components.voip.u2 u2Var = ic1Var.f46611w;
                    if (u2Var.V != 3) {
                        u2Var.V = 3;
                        ValueAnimator ofInt = ValueAnimator.ofInt(u2Var.H, 255);
                        u2Var.O = ofInt;
                        ofInt.addUpdateListener(new org.telegram.ui.Components.voip.s2(u2Var, 2));
                        u2Var.O.setDuration(500L);
                        u2Var.O.start();
                    }
                    ic1Var.F.c(true);
                    return;
                }
                org.telegram.ui.Components.voip.u2 u2Var2 = ic1Var.f46611w;
                if (u2Var2.V != 2) {
                    u2Var2.V = 2;
                    u2Var2.c();
                    ValueAnimator valueAnimator = u2Var2.O;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllUpdateListeners();
                        u2Var2.O.cancel();
                    }
                    ValueAnimator ofInt2 = ValueAnimator.ofInt(u2Var2.H, 0);
                    u2Var2.O = ofInt2;
                    ofInt2.addUpdateListener(new org.telegram.ui.Components.voip.s2(u2Var2, 0));
                    u2Var2.O.setDuration(500L);
                    u2Var2.O.start();
                }
                ic1Var.F.c(false);
                return;
            case 28:
                org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) obj;
                HashSet hashSet = l0Var.E;
                hashSet.remove(Integer.valueOf(i16));
                if (hashSet.isEmpty()) {
                    l0Var.S();
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.l0 x10 = org.telegram.ui.Wallet.l0.x(i16);
                org.telegram.messenger.qs f11 = org.telegram.messenger.qs.f(i16);
                org.telegram.ui.Wallet.a0 a0Var = new org.telegram.ui.Wallet.a0(f11, (org.telegram.ui.bd0) obj, x10);
                f11.b(a0Var, 251);
                org.telegram.messenger.g0.i3(a0Var, 10000L);
                if (x10.f42683e == null && x10.A < 0) {
                    x10.Y();
                }
                x10.W();
                a0Var.a();
                return;
        }
    }

    public r2(Object obj, int i7, int i10) {
        this.f37533a = i10;
        this.f37535c = obj;
        this.f37534b = i7;
    }
}
