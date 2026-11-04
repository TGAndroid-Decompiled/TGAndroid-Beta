package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
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
import org.telegram.ui.zb1;
public final class o2 implements Runnable {
    public final int f36681a;
    public final int f36682b;
    public final Object f36683c;

    public o2(int i3, Object obj, int i10) {
        this.f36681a = i10;
        this.f36682b = i3;
        this.f36683c = obj;
    }

    @Override
    public final void run() {
        float f10;
        String str;
        CharSequence charSequence;
        int i3;
        float f11;
        int i10;
        int i11;
        float f12;
        int i12;
        int i13;
        org.telegram.ui.gq0 gq0Var;
        String str2;
        int i14 = this.f36681a;
        int i15 = 0;
        Object obj = this.f36683c;
        int i16 = this.f36682b;
        switch (i14) {
            case 0:
                s70 s70Var = (s70) obj;
                ArrayList v = org.telegram.messenger.g5.r(i16).v(11);
                String str3 = null;
                String M0 = org.telegram.messenger.bd.M0(2131751242, null);
                if (v != null && !v.isEmpty()) {
                    int i17 = 0;
                    while (true) {
                        if (i17 < v.size()) {
                            if (v.get(i17) instanceof TLRPC.TL_privacyValueAllowContacts) {
                                M0 = org.telegram.messenger.bd.M0(2131751242, str3);
                            } else {
                                if (!(v.get(i17) instanceof TLRPC.TL_privacyValueAllowAll) && !(v.get(i17) instanceof TLRPC.TL_privacyValueDisallowAll)) {
                                    str3 = null;
                                } else {
                                    str3 = null;
                                    M0 = org.telegram.messenger.bd.M0(2131751243, null);
                                }
                                i17++;
                            }
                        }
                    }
                }
                s70Var.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(M0, new e1(0, v)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(0.66f)));
                return;
            case 1:
                ((o4.m0) obj).t(i16);
                return;
            case 2:
                sc scVar = (sc) obj;
                gi.l3 l3Var = scVar.f37969d1;
                if (scVar.f37967b1 != i16) {
                    scVar.setTimer(i16);
                    org.telegram.messenger.u10 u10Var = scVar.f37981r1;
                    if (u10Var != null) {
                        u10Var.a(Integer.valueOf(i16));
                    }
                    if (i16 == 0) {
                        if (scVar.f37980q1) {
                            i11 = 2131744138;
                        } else {
                            i11 = 2131744143;
                        }
                        charSequence = org.telegram.messenger.bd.M0(i11, null);
                        l3Var.h = scVar.getMeasuredWidth();
                        l3Var.r(false);
                        l3Var.n(13.0f, 4.0f, 10.0f, 4.0f);
                        l3Var.f13087f0 = org.telegram.messenger.g0.L(0);
                        l3Var.f13085e0 = -org.telegram.messenger.g0.L(1.0f);
                        f10 = 1.0f;
                    } else if (i16 == Integer.MAX_VALUE) {
                        if (scVar.f37980q1) {
                            i3 = 2131744137;
                        } else {
                            i3 = 2131744142;
                        }
                        charSequence = org.telegram.messenger.bd.M0(i3, null);
                        l3Var.h = scVar.getMeasuredWidth();
                        l3Var.r(false);
                        l3Var.n(13.0f, 4.0f, 10.0f, 4.0f);
                        l3Var.f13087f0 = org.telegram.messenger.g0.L(0);
                        f10 = 1.0f;
                        l3Var.f13085e0 = -org.telegram.messenger.g0.L(1.0f);
                    } else {
                        f10 = 1.0f;
                        if (i16 > 0) {
                            if (scVar.f37980q1) {
                                str = "TimerPeriodVideoSetSeconds";
                            } else {
                                str = "TimerPeriodPhotoSetSeconds";
                            }
                            SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.G(i16, str, new Object[0]));
                            l3Var.r(true);
                            l3Var.h = gi.l3.a(X2, l3Var.getTextPaint());
                            l3Var.n(12.0f, 7.0f, 11.0f, 7.0f);
                            l3Var.f13087f0 = org.telegram.messenger.g0.L(2);
                            l3Var.f13085e0 = 0.0f;
                            charSequence = X2;
                        } else {
                            return;
                        }
                    }
                    float L = (-Math.min(org.telegram.messenger.g0.L(34.0f), scVar.getEditTextHeight())) - org.telegram.messenger.g0.L(14.0f);
                    if (scVar instanceof org.telegram.ui.ro0) {
                        f11 = -1.0f;
                    } else {
                        f11 = f10;
                    }
                    l3Var.setTranslationY(L * f11);
                    l3Var.u(charSequence);
                    if (i16 > 0) {
                        i10 = 2131624020;
                    } else {
                        i10 = 2131624019;
                    }
                    ch0 ch0Var = new ch0(i10, org.telegram.messenger.g0.L(34.0f), org.telegram.messenger.g0.L(34.0f));
                    ch0Var.start();
                    l3Var.m(ch0Var);
                    l3Var.w();
                    scVar.f37978o1 = false;
                    org.telegram.messenger.g0.r(scVar.f37979p1);
                    scVar.invalidate();
                    return;
                }
                return;
            case 3:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                if (i16 == 0) {
                    chatActivityEnterView.B2 = 0;
                }
                chatActivityEnterView.W0 = null;
                kf kfVar = chatActivityEnterView.V0;
                if (kfVar != null) {
                    if (chatActivityEnterView.f31139i5 == null) {
                        kfVar.setTranslationY(0.0f);
                    }
                    chatActivityEnterView.V0.setVisibility(8);
                    chatActivityEnterView.f31168o1.removeView(chatActivityEnterView.V0);
                    if (chatActivityEnterView.H3) {
                        chatActivityEnterView.H3 = false;
                        chatActivityEnterView.V0 = null;
                    }
                }
                uf ufVar = chatActivityEnterView.f31087a3;
                if (ufVar != null) {
                    ufVar.x(0.0f);
                }
                chatActivityEnterView.requestLayout();
                return;
            case 4:
                zl zlVar = (zl) obj;
                am amVar = zlVar.Q;
                if (i16 == zlVar.P && amVar.f31899x.isShown()) {
                    amVar.f31899x.d(1, true);
                    return;
                }
                return;
            case 5:
                org.telegram.ui.ActionBar.t2 t2Var = (org.telegram.ui.ActionBar.t2) obj;
                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                if (T != null) {
                    t2Var.dismiss();
                    PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "create_bot");
                    premiumPreviewFragment.setCurrentAccount(i16);
                    T.presentFragment(premiumPreviewFragment);
                    return;
                }
                return;
            case 6:
                ey eyVar = (ey) obj;
                if (eyVar.Q1) {
                    fx fxVar = eyVar.f33582u1;
                    if (fxVar != null && fxVar.k()) {
                        try {
                            eyVar.f33595y.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    eyVar.R1 = true;
                    int max = Math.max(50, i16 - 100);
                    org.telegram.messenger.g0.i3(new o2(eyVar, max, 6), max);
                    return;
                }
                return;
            case 7:
                ((d90) obj).f33024b.a(Integer.valueOf(i16));
                return;
            case 8:
                td0 td0Var = (td0) obj;
                org.telegram.ui.tp0 tp0Var = td0Var.f38396a;
                TextView textView = tp0Var.f38722e;
                ai.x2 x2Var = tp0Var.h;
                RadialProgressView radialProgressView = tp0Var.f38724n;
                TextView textView2 = tp0Var.d;
                textView.setVisibility(8);
                tp0Var.f38723f.setVisibility(8);
                LinearLayout linearLayout = tp0Var.f38721c;
                if (linearLayout.getVisibility() == 8) {
                    linearLayout.setVisibility(0);
                    linearLayout.animate().cancel();
                    f12 = 1.0f;
                    linearLayout.animate().alpha(1.0f).setDuration(150L).start();
                } else {
                    f12 = 1.0f;
                }
                if (radialProgressView.getAlpha() == f12) {
                    radialProgressView.animate().cancel();
                    radialProgressView.animate().alpha(0.0f).setDuration(150L).setListener(new sd0(td0Var, 0));
                }
                if (x2Var.getAlpha() == 1.0f) {
                    x2Var.animate().cancel();
                    x2Var.animate().alpha(0.0f).setDuration(150L).setListener(new sd0(td0Var, 1));
                }
                if (i16 != 2) {
                    if (i16 != 5) {
                        if (i16 != 150) {
                            if (i16 != 100) {
                                if (i16 != 101) {
                                    return;
                                }
                            } else {
                                textView2.setText(org.telegram.messenger.bd.M0(2131742841, null));
                                return;
                            }
                        }
                        textView2.setText(org.telegram.messenger.bd.M0(2131742842, null));
                        textView.setText(org.telegram.messenger.bd.M0(2131742840, null));
                        textView.setVisibility(0);
                        textView.setOnClickListener(new ga0(td0Var, 4));
                        return;
                    }
                    textView2.setText(org.telegram.messenger.bd.M0(2131742844, null));
                    return;
                }
                textView2.setText(org.telegram.messenger.bd.M0(2131742843, null));
                return;
            case 9:
                ah0 ah0Var = (ah0) obj;
                ah0Var.W0 = false;
                if (ah0Var.X0) {
                    ah0Var.C(true);
                    return;
                }
                ah0Var.f31847b1 = i16;
                ah0Var.I();
                ah0Var.x();
                return;
            case 10:
                q21 q21Var = (q21) obj;
                q21Var.e1();
                q21Var.Z1 = i16;
                f21.S0(q21Var.Y1);
                q21Var.f1();
                return;
            case 11:
                ((m61) obj).f36052w.y0(i16);
                return;
            case 12:
                d71 d71Var = (d71) obj;
                m51 m51Var = d71Var.f32996a;
                if (i16 == -1) {
                    if (m51Var.d0()) {
                        m51Var.g0();
                        d71Var.n();
                    }
                    d71Var.K = false;
                    return;
                } else if (i16 == 1) {
                    if (d71Var.L) {
                        d71Var.L = false;
                        m51Var.h0();
                        return;
                    }
                    return;
                } else if (i16 != -3 && i16 == -2 && m51Var.d0()) {
                    d71Var.L = true;
                    m51Var.g0();
                    d71Var.n();
                    return;
                } else {
                    return;
                }
            case 13:
                org.telegram.ui.x30 x30Var = (org.telegram.ui.x30) obj;
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.setAudioOutput(i16);
                    x30Var.f51786q5 = Integer.valueOf(i16);
                }
                fc fcVar = new fc(x30Var.F, new ei.k0());
                Resources resources = x30Var.getContext().getResources();
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
                fcVar.M(resources.getDrawable(i12).mutate(), org.telegram.ui.x30.i1(i16)).k(x30Var.p1());
                return;
            case 14:
                org.telegram.ui.x30 x30Var2 = ((org.telegram.ui.c30) obj).f44213b;
                VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                if (sharedInstance3 != null) {
                    sharedInstance3.setAudioOutput(i16);
                    x30Var2.f51786q5 = Integer.valueOf(i16);
                }
                fc fcVar2 = new fc(x30Var2.F, new ei.k0());
                Resources resources2 = x30Var2.getContext().getResources();
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
                fcVar2.M(resources2.getDrawable(i13).mutate(), org.telegram.ui.x30.i1(i16)).k(x30Var2.p1());
                return;
            case 15:
                org.telegram.ui.r40 r40Var = (org.telegram.ui.r40) obj;
                AnimatorSet animatorSet = new AnimatorSet();
                int childCount = r40Var.f49048n.getChildCount();
                for (int i18 = 0; i18 < childCount; i18++) {
                    View childAt = r40Var.f49048n.getChildAt(i18);
                    r40Var.f49048n.getClass();
                    if (RecyclerView.R(childAt) >= i16) {
                        childAt.setAlpha(0.0f);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f);
                        ofFloat.setStartDelay((int) ((Math.min(r40Var.f49048n.getMeasuredHeight(), Math.max(0, childAt.getTop())) / r40Var.f49048n.getMeasuredHeight()) * 100.0f));
                        ofFloat.setDuration(200L);
                        animatorSet.playTogether(ofFloat);
                    }
                }
                animatorSet.start();
                return;
            case 16:
                org.telegram.ui.n50 n50Var = (org.telegram.ui.n50) obj;
                int i19 = org.telegram.ui.n50.E;
                n50Var.a(2131231535, 17, i16, true);
                n50Var.c();
                n50Var.b(n50Var.f47890w, 23, true);
                n50Var.e();
                Intro.a(i16);
                return;
            case 17:
                org.telegram.ui.la0 la0Var = (org.telegram.ui.la0) obj;
                la0Var.V.h1(0, -org.telegram.messenger.g0.L(i16));
                la0Var.K0(false);
                return;
            case 18:
                ((org.telegram.ui.lb0) obj).f47283a.f52078f[i16].C(1.0f);
                return;
            case 19:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj;
                notificationsSettingsActivity.W = true;
                notificationsSettingsActivity.f41345c.g(i16);
                return;
            case 20:
                ((org.telegram.ui.vh0) obj).a(Integer.valueOf(i16));
                return;
            case 21:
                ((org.telegram.ui.pl0) obj).f48606e.f51221q0.J.D(1 - i16);
                return;
            case 22:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.V8;
                int i20 = i16 + 1;
                if (i20 < 6 && (gq0Var = photoViewer.f41420f0) != null) {
                    gq0Var.invalidate();
                    org.telegram.messenger.g0.i3(new o2(photoViewer, i20, 22), 100L);
                    return;
                }
                return;
            case 23:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                RectF rectF = ProfileActivity.T6;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, profileActivity.getParentActivity(), profileActivity.A0);
                String M02 = org.telegram.messenger.bd.M0(2131746655, null);
                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                s1Var.S = M02;
                s1Var.U = org.telegram.messenger.bd.M0(2131746656, null);
                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751599, null), new k2.q(profileActivity, i16, 18));
                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                return;
            case 24:
                org.telegram.ui.aw0 aw0Var = (org.telegram.ui.aw0) obj;
                ProfileActivity profileActivity2 = aw0Var.h.f44157e;
                profileActivity2.getNotificationCenter().n(profileActivity2, 107);
                if (i16 == 2) {
                    profileActivity2.getMessagesController().k4(0L, "PREMIUM_GRACE");
                    sf.c.t(aw0Var.getContext(), profileActivity2.getMessagesController().L5);
                } else {
                    org.telegram.messenger.hp messagesController = profileActivity2.getMessagesController();
                    if (i16 == 0) {
                        str2 = "VALIDATE_PHONE_NUMBER";
                    } else {
                        str2 = "VALIDATE_PASSWORD";
                    }
                    messagesController.k4(0L, str2);
                }
                profileActivity2.getNotificationCenter().c(profileActivity2, 107);
                profileActivity2.D5(false, false);
                return;
            case 25:
                org.telegram.ui.mx0 mx0Var = (org.telegram.ui.mx0) obj;
                org.telegram.messenger.g0.v1(mx0Var.d.findFocus());
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr = mx0Var.f47810a;
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
                sessionsActivity.f41988f.remove(i16);
                sessionsActivity.r0();
                org.telegram.ui.o21 o21Var = sessionsActivity.f41984a;
                if (o21Var != null) {
                    o21Var.f();
                    return;
                }
                return;
            case 27:
                zb1 zb1Var = (zb1) obj;
                zb1Var.G.setSignalBarCount(i16);
                if (i16 <= 1) {
                    org.telegram.ui.Components.voip.j2 j2Var = zb1Var.f52645w;
                    if (j2Var.W != 3) {
                        j2Var.W = 3;
                        ValueAnimator ofInt = ValueAnimator.ofInt(j2Var.I, 255);
                        j2Var.P = ofInt;
                        ofInt.addUpdateListener(new org.telegram.ui.Components.voip.h2(j2Var, 2));
                        j2Var.P.setDuration(500L);
                        j2Var.P.start();
                    }
                    zb1Var.G.c(true);
                    return;
                }
                org.telegram.ui.Components.voip.j2 j2Var2 = zb1Var.f52645w;
                if (j2Var2.W != 2) {
                    j2Var2.W = 2;
                    j2Var2.c();
                    ValueAnimator valueAnimator = j2Var2.P;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllUpdateListeners();
                        j2Var2.P.cancel();
                    }
                    ValueAnimator ofInt2 = ValueAnimator.ofInt(j2Var2.I, 0);
                    j2Var2.P = ofInt2;
                    ofInt2.addUpdateListener(new org.telegram.ui.Components.voip.h2(j2Var2, 0));
                    j2Var2.P.setDuration(500L);
                    j2Var2.P.start();
                }
                zb1Var.G.c(false);
                return;
            case 28:
                org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) obj;
                HashSet hashSet = k0Var.E;
                hashSet.remove(Integer.valueOf(i16));
                if (hashSet.isEmpty()) {
                    k0Var.S();
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.k0 x10 = org.telegram.ui.Wallet.k0.x(i16);
                org.telegram.messenger.hs f13 = org.telegram.messenger.hs.f(i16);
                org.telegram.ui.Wallet.z zVar = new org.telegram.ui.Wallet.z(f13, (org.telegram.ui.tb0) obj, x10);
                f13.b(zVar, 251);
                org.telegram.messenger.g0.i3(zVar, 10000L);
                if (x10.f42721e == null && x10.A < 0) {
                    x10.Y();
                }
                x10.W();
                zVar.a();
                return;
        }
    }

    public o2(Object obj, int i3, int i10) {
        this.f36681a = i10;
        this.f36683c = obj;
        this.f36682b = i3;
    }
}
