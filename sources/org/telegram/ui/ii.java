package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.Intro;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.RadialProgressView;
public final class ii implements Runnable {
    public final int f48818a;
    public final int f48819b;
    public final Object f48820c;

    public ii(int i7, Object obj, int i10) {
        this.f48818a = i10;
        this.f48819b = i7;
        this.f48820c = obj;
    }

    @Override
    public final void run() {
        int i7;
        String str;
        CharSequence W2;
        int i10;
        int i11;
        int i12;
        int i13 = this.f48818a;
        int i14 = 2131232433;
        float f10 = 1.0f;
        int i15 = this.f48819b;
        Object obj = this.f48820c;
        switch (i13) {
            case 0:
                bn bnVar = ((gi) obj).f48305g;
                if (bnVar.f46130ac == i15) {
                    bnVar.pb();
                    return;
                }
                return;
            case 1:
                bn bnVar2 = ((hi) obj).f48559g;
                if (bnVar2.f46130ac == i15) {
                    bnVar2.pb();
                    return;
                }
                return;
            case 2:
                bn bnVar3 = ((hi) obj).f48559g;
                if (bnVar3.f46130ac == i15) {
                    bnVar3.pb();
                    return;
                }
                return;
            case 3:
                bn bnVar4 = ((pl) obj).f51056x0;
                bnVar4.C0.h1(i15, bnVar4.O4);
                return;
            case 4:
                i7 = ((org.telegram.ui.ActionBar.g2) ((mm) obj).f50079a).currentAccount;
                ConnectionsManager.getInstance(i7).cancelRequest(i15, true);
                return;
            case 5:
                org.telegram.messenger.ks.f(i15).k(4, new Object[0]);
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.z1((org.telegram.messenger.lr) obj, 1), 250L);
                return;
            case 6:
                org.telegram.ui.Components.j80 j80Var = (org.telegram.ui.Components.j80) obj;
                ArrayList v = org.telegram.messenger.i5.r(i15).v(11);
                String str2 = null;
                String N0 = org.telegram.messenger.gd.N0(2131751229, null);
                if (v != null && !v.isEmpty()) {
                    int i16 = 0;
                    while (true) {
                        if (i16 < v.size()) {
                            if (v.get(i16) instanceof TLRPC.TL_privacyValueAllowContacts) {
                                N0 = org.telegram.messenger.gd.N0(2131751229, str2);
                            } else {
                                if (!(v.get(i16) instanceof TLRPC.TL_privacyValueAllowAll) && !(v.get(i16) instanceof TLRPC.TL_privacyValueDisallowAll)) {
                                    str2 = null;
                                } else {
                                    str2 = null;
                                    N0 = org.telegram.messenger.gd.N0(2131751230, null);
                                }
                                i16++;
                            }
                        }
                    }
                }
                j80Var.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.T2(N0, new org.telegram.ui.Components.n1(0, v)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(0.66f)));
                return;
            case 7:
                ((org.telegram.messenger.pe) obj).u(i15);
                return;
            case 8:
                org.telegram.ui.Components.yc ycVar = (org.telegram.ui.Components.yc) obj;
                hi.u3 u3Var = ycVar.f42412d1;
                if (ycVar.f42410b1 != i15) {
                    ycVar.setTimer(i15);
                    org.telegram.messenger.w10 w10Var = ycVar.f42424r1;
                    if (w10Var != null) {
                        w10Var.a(Integer.valueOf(i15));
                    }
                    if (i15 == 0) {
                        if (ycVar.f42423q1) {
                            i12 = 2131743883;
                        } else {
                            i12 = 2131743888;
                        }
                        W2 = org.telegram.messenger.gd.N0(i12, null);
                        u3Var.h = ycVar.getMeasuredWidth();
                        u3Var.r(false);
                        u3Var.n(13.0f, 4.0f, 10.0f, 4.0f);
                        u3Var.f15493f0 = org.telegram.messenger.g0.L(0);
                        u3Var.f15491e0 = -org.telegram.messenger.g0.L(1.0f);
                    } else if (i15 == Integer.MAX_VALUE) {
                        if (ycVar.f42423q1) {
                            i10 = 2131743882;
                        } else {
                            i10 = 2131743887;
                        }
                        W2 = org.telegram.messenger.gd.N0(i10, null);
                        u3Var.h = ycVar.getMeasuredWidth();
                        u3Var.r(false);
                        u3Var.n(13.0f, 4.0f, 10.0f, 4.0f);
                        u3Var.f15493f0 = org.telegram.messenger.g0.L(0);
                        u3Var.f15491e0 = -org.telegram.messenger.g0.L(1.0f);
                    } else if (i15 > 0) {
                        if (ycVar.f42423q1) {
                            str = "TimerPeriodVideoSetSeconds";
                        } else {
                            str = "TimerPeriodPhotoSetSeconds";
                        }
                        W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.G(i15, str, new Object[0]));
                        u3Var.r(true);
                        u3Var.h = hi.u3.a(W2, u3Var.getTextPaint());
                        u3Var.n(12.0f, 7.0f, 11.0f, 7.0f);
                        u3Var.f15493f0 = org.telegram.messenger.g0.L(2);
                        u3Var.f15491e0 = 0.0f;
                    } else {
                        return;
                    }
                    float L = (-Math.min(org.telegram.messenger.g0.L(34.0f), ycVar.getEditTextHeight())) - org.telegram.messenger.g0.L(14.0f);
                    if (ycVar instanceof ap0) {
                        f10 = -1.0f;
                    }
                    u3Var.setTranslationY(L * f10);
                    u3Var.v(W2);
                    if (i15 > 0) {
                        i11 = 2131624021;
                    } else {
                        i11 = 2131624020;
                    }
                    org.telegram.ui.Components.nh0 nh0Var = new org.telegram.ui.Components.nh0(i11, org.telegram.messenger.g0.L(34.0f), org.telegram.messenger.g0.L(34.0f));
                    nh0Var.start();
                    u3Var.m(nh0Var);
                    u3Var.x();
                    ycVar.f42421o1 = false;
                    org.telegram.messenger.g0.r(ycVar.f42422p1);
                    ycVar.invalidate();
                    return;
                }
                return;
            case 9:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                if (i15 == 0) {
                    chatActivityEnterView.f32763q3 = 0;
                }
                chatActivityEnterView.W0 = null;
                org.telegram.ui.Components.eg egVar = chatActivityEnterView.V0;
                if (egVar != null) {
                    if (chatActivityEnterView.f32676e7 == null) {
                        egVar.setTranslationY(0.0f);
                    }
                    chatActivityEnterView.V0.setVisibility(8);
                    chatActivityEnterView.d2.removeView(chatActivityEnterView.V0);
                    if (chatActivityEnterView.f32809w4) {
                        chatActivityEnterView.f32809w4 = false;
                        chatActivityEnterView.V0 = null;
                    }
                }
                org.telegram.ui.Components.mg mgVar = chatActivityEnterView.P3;
                if (mgVar != null) {
                    mgVar.u(0.0f);
                }
                chatActivityEnterView.requestLayout();
                return;
            case 10:
                ((ji.g) obj).a(Integer.valueOf(i15));
                return;
            case 11:
                ((ji.g) obj).a(Integer.valueOf(i15));
                return;
            case 12:
                org.telegram.ui.Components.om omVar = (org.telegram.ui.Components.om) obj;
                org.telegram.ui.Components.pm pmVar = omVar.Q;
                if (i15 == omVar.P && pmVar.f38513x.isShown()) {
                    pmVar.f38513x.d(1, true);
                    return;
                }
                return;
            case 13:
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) obj;
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if (T != null) {
                    w2Var.dismiss();
                    PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "create_bot");
                    premiumPreviewFragment.setCurrentAccount(i15);
                    T.presentFragment(premiumPreviewFragment);
                    return;
                }
                return;
            case 14:
                org.telegram.ui.Components.qy qyVar = (org.telegram.ui.Components.qy) obj;
                if (qyVar.Q1) {
                    org.telegram.ui.Components.qx qxVar = qyVar.f39099u1;
                    if (qxVar != null && qxVar.k()) {
                        try {
                            qyVar.f39112y.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    qyVar.R1 = true;
                    int max = Math.max(50, i15 - 100);
                    org.telegram.messenger.g0.h3(new ii(qyVar, max, 14), max);
                    return;
                }
                return;
            case 15:
                ((org.telegram.ui.Components.t90) obj).f39877b.a(Integer.valueOf(i15));
                return;
            case 16:
                org.telegram.ui.Components.je0 je0Var = (org.telegram.ui.Components.je0) obj;
                dq0 dq0Var = je0Var.f36396a;
                TextView textView = dq0Var.f36723e;
                bi.o3 o3Var = dq0Var.h;
                RadialProgressView radialProgressView = dq0Var.f36725n;
                TextView textView2 = dq0Var.d;
                textView.setVisibility(8);
                dq0Var.f36724f.setVisibility(8);
                LinearLayout linearLayout = dq0Var.f36722c;
                if (linearLayout.getVisibility() == 8) {
                    linearLayout.setVisibility(0);
                    linearLayout.animate().cancel();
                    linearLayout.animate().alpha(1.0f).setDuration(150L).start();
                }
                if (radialProgressView.getAlpha() == 1.0f) {
                    radialProgressView.animate().cancel();
                    radialProgressView.animate().alpha(0.0f).setDuration(150L).setListener(new org.telegram.ui.Components.ie0(je0Var, 0));
                }
                if (o3Var.getAlpha() == 1.0f) {
                    o3Var.animate().cancel();
                    o3Var.animate().alpha(0.0f).setDuration(150L).setListener(new org.telegram.ui.Components.ie0(je0Var, 1));
                }
                if (i15 != 2) {
                    if (i15 != 5) {
                        if (i15 != 150) {
                            if (i15 != 100) {
                                if (i15 != 101) {
                                    return;
                                }
                            } else {
                                textView2.setText(org.telegram.messenger.gd.N0(2131742560, null));
                                return;
                            }
                        }
                        textView2.setText(org.telegram.messenger.gd.N0(2131742561, null));
                        textView.setText(org.telegram.messenger.gd.N0(2131742559, null));
                        textView.setVisibility(0);
                        textView.setOnClickListener(new org.telegram.ui.Components.g70(je0Var, 6));
                        return;
                    }
                    textView2.setText(org.telegram.messenger.gd.N0(2131742563, null));
                    return;
                }
                textView2.setText(org.telegram.messenger.gd.N0(2131742562, null));
                return;
            case 17:
                org.telegram.ui.Components.lh0 lh0Var = (org.telegram.ui.Components.lh0) obj;
                lh0Var.W0 = false;
                if (lh0Var.X0) {
                    lh0Var.C(true);
                    return;
                }
                lh0Var.f37133b1 = i15;
                lh0Var.I();
                lh0Var.x();
                return;
            case 18:
                org.telegram.ui.Components.l31 l31Var = (org.telegram.ui.Components.l31) obj;
                l31Var.f1();
                l31Var.f37012c2 = i15;
                org.telegram.ui.Components.a31.U0(l31Var.f37011b2);
                l31Var.g1();
                return;
            case 19:
                ((org.telegram.ui.Components.j71) obj).f36348w.y0(i15);
                return;
            case 20:
                org.telegram.ui.Components.a81 a81Var = (org.telegram.ui.Components.a81) obj;
                org.telegram.ui.Components.h61 h61Var = a81Var.f33397a;
                if (i15 == -1) {
                    if (h61Var.d0()) {
                        h61Var.g0();
                        a81Var.n();
                    }
                    a81Var.K = false;
                    return;
                } else if (i15 == 1) {
                    if (a81Var.L) {
                        a81Var.L = false;
                        h61Var.h0();
                        return;
                    }
                    return;
                } else if (i15 != -3 && i15 == -2 && h61Var.d0()) {
                    a81Var.L = true;
                    h61Var.g0();
                    a81Var.n();
                    return;
                } else {
                    return;
                }
            case 21:
                e40 e40Var = (e40) obj;
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.setAudioOutput(i15);
                    e40Var.f47423x5 = Integer.valueOf(i15);
                }
                org.telegram.ui.Components.kc kcVar = new org.telegram.ui.Components.kc(e40Var.F, new fi.h0());
                Resources resources = e40Var.getContext().getResources();
                if (i15 == 2) {
                    i14 = 2131232430;
                } else if (i15 == 0) {
                    i14 = 2131232435;
                } else {
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    if (sharedInstance2 != null && sharedInstance2.isHeadsetPlugged()) {
                        i14 = 2131232431;
                    }
                }
                kcVar.M(resources.getDrawable(i14).mutate(), e40.k1(i15)).k(e40Var.r1());
                return;
            case 22:
                e40 e40Var2 = ((j30) obj).f48977b;
                VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                if (sharedInstance3 != null) {
                    sharedInstance3.setAudioOutput(i15);
                    e40Var2.f47423x5 = Integer.valueOf(i15);
                }
                org.telegram.ui.Components.kc kcVar2 = new org.telegram.ui.Components.kc(e40Var2.F, new fi.h0());
                Resources resources2 = e40Var2.getContext().getResources();
                if (i15 == 2) {
                    i14 = 2131232430;
                } else if (i15 == 0) {
                    i14 = 2131232435;
                } else {
                    VoIPService sharedInstance4 = VoIPService.getSharedInstance();
                    if (sharedInstance4 != null && sharedInstance4.isHeadsetPlugged()) {
                        i14 = 2131232431;
                    }
                }
                kcVar2.M(resources2.getDrawable(i14).mutate(), e40.k1(i15)).k(e40Var2.r1());
                return;
            case 23:
                y40 y40Var = (y40) obj;
                AnimatorSet animatorSet = new AnimatorSet();
                int childCount = y40Var.f54207n.getChildCount();
                for (int i17 = 0; i17 < childCount; i17++) {
                    View childAt = y40Var.f54207n.getChildAt(i17);
                    y40Var.f54207n.getClass();
                    if (RecyclerView.R(childAt) >= i15) {
                        childAt.setAlpha(0.0f);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f);
                        ofFloat.setStartDelay((int) ((Math.min(y40Var.f54207n.getMeasuredHeight(), Math.max(0, childAt.getTop())) / y40Var.f54207n.getMeasuredHeight()) * 100.0f));
                        ofFloat.setDuration(200L);
                        animatorSet.playTogether(ofFloat);
                    }
                }
                animatorSet.start();
                return;
            case 24:
                u50 u50Var = (u50) obj;
                int i18 = u50.E;
                u50Var.a(2131231539, 17, i15, true);
                u50Var.c();
                u50Var.b(u50Var.f52540w, 23, true);
                u50Var.d();
                Intro.a(i15);
                return;
            case 25:
                pa0 pa0Var = (pa0) obj;
                pa0Var.V.h1(0, -org.telegram.messenger.g0.L(i15));
                pa0Var.N0(false);
                return;
            case 26:
                ((ob0) obj).f50620a.f46491f[i15].D(1.0f);
                return;
            case 27:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj;
                notificationsSettingsActivity.W = true;
                notificationsSettingsActivity.f43249c.g(i15);
                return;
            case 28:
                ((bi0) obj).a(Integer.valueOf(i15));
                return;
            default:
                ((wl0) obj).f53702e.f47185q0.J.C(1 - i15);
                return;
        }
    }

    public ii(Object obj, int i7, int i10) {
        this.f48818a = i10;
        this.f48820c = obj;
        this.f48819b = i7;
    }
}
