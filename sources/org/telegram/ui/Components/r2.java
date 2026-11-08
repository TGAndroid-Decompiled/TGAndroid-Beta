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
import org.telegram.ui.fc1;
public final class r2 implements Runnable {
    public final int f37485a;
    public final int f37486b;
    public final Object f37487c;

    public r2(int i7, Object obj, int i10) {
        this.f37485a = i10;
        this.f37486b = i7;
        this.f37487c = obj;
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
        org.telegram.ui.pq0 pq0Var;
        String str2;
        int i14 = this.f37485a;
        float f10 = 1.0f;
        int i15 = 0;
        Object obj = this.f37487c;
        int i16 = this.f37486b;
        switch (i14) {
            case 0:
                w70 w70Var = (w70) obj;
                ArrayList v = org.telegram.messenger.g5.r(i16).v(11);
                String M0 = org.telegram.messenger.id.M0(2131751242, null);
                if (v != null && !v.isEmpty()) {
                    int i17 = 0;
                    while (true) {
                        if (i17 < v.size()) {
                            if (v.get(i17) instanceof TLRPC.TL_privacyValueAllowContacts) {
                                M0 = org.telegram.messenger.id.M0(2131751242, null);
                            } else {
                                if ((v.get(i17) instanceof TLRPC.TL_privacyValueAllowAll) || (v.get(i17) instanceof TLRPC.TL_privacyValueDisallowAll)) {
                                    M0 = org.telegram.messenger.id.M0(2131751243, null);
                                }
                                i17++;
                            }
                        }
                    }
                }
                w70Var.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(M0, new f1(0, v)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(0.66f)));
                return;
            case 1:
                ((org.telegram.messenger.re) obj).u(i16);
                return;
            case 2:
                uc ucVar = (uc) obj;
                fi.m3 m3Var = ucVar.f38597c1;
                if (ucVar.f38595a1 != i16) {
                    ucVar.setTimer(i16);
                    org.telegram.messenger.c20 c20Var = ucVar.f38609q1;
                    if (c20Var != null) {
                        c20Var.a(Integer.valueOf(i16));
                    }
                    if (i16 == 0) {
                        if (ucVar.f38608p1) {
                            i11 = 2131744131;
                        } else {
                            i11 = 2131744136;
                        }
                        X2 = org.telegram.messenger.id.M0(i11, null);
                        m3Var.h = ucVar.getMeasuredWidth();
                        m3Var.r(false);
                        m3Var.n(13.0f, 4.0f, 10.0f, 4.0f);
                        m3Var.f12423e0 = org.telegram.messenger.g0.L(0);
                        m3Var.f12421d0 = -org.telegram.messenger.g0.L(1.0f);
                    } else if (i16 == Integer.MAX_VALUE) {
                        if (ucVar.f38608p1) {
                            i7 = 2131744130;
                        } else {
                            i7 = 2131744135;
                        }
                        X2 = org.telegram.messenger.id.M0(i7, null);
                        m3Var.h = ucVar.getMeasuredWidth();
                        m3Var.r(false);
                        m3Var.n(13.0f, 4.0f, 10.0f, 4.0f);
                        m3Var.f12423e0 = org.telegram.messenger.g0.L(0);
                        m3Var.f12421d0 = -org.telegram.messenger.g0.L(1.0f);
                    } else if (i16 > 0) {
                        if (ucVar.f38608p1) {
                            str = "TimerPeriodVideoSetSeconds";
                        } else {
                            str = "TimerPeriodPhotoSetSeconds";
                        }
                        X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.id.G(i16, str, new Object[0]));
                        m3Var.r(true);
                        m3Var.h = fi.m3.a(X2, m3Var.getTextPaint());
                        m3Var.n(12.0f, 7.0f, 11.0f, 7.0f);
                        m3Var.f12423e0 = org.telegram.messenger.g0.L(2);
                        m3Var.f12421d0 = 0.0f;
                    } else {
                        return;
                    }
                    float L = (-Math.min(org.telegram.messenger.g0.L(34.0f), ucVar.getEditTextHeight())) - org.telegram.messenger.g0.L(14.0f);
                    if (ucVar instanceof org.telegram.ui.ap0) {
                        f10 = -1.0f;
                    }
                    m3Var.setTranslationY(L * f10);
                    m3Var.u(X2);
                    if (i16 > 0) {
                        i10 = 2131624020;
                    } else {
                        i10 = 2131624019;
                    }
                    zg0 zg0Var = new zg0(i10, org.telegram.messenger.g0.L(34.0f), org.telegram.messenger.g0.L(34.0f));
                    zg0Var.start();
                    m3Var.m(zg0Var);
                    m3Var.w();
                    ucVar.n1 = false;
                    org.telegram.messenger.g0.r(ucVar.f38607o1);
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
                    if (chatActivityEnterView.f31064h5 == null) {
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
                if (i16 == amVar.O && bmVar.f32223x.isShown()) {
                    bmVar.f32223x.d(1, true);
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
                    ix ixVar = hyVar.f34452t1;
                    if (ixVar != null && ixVar.k()) {
                        try {
                            hyVar.f34468y.performHapticFeedback(3);
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
                ((h90) obj).f34168b.a(Integer.valueOf(i16));
                return;
            case 8:
                zd0 zd0Var = (zd0) obj;
                org.telegram.ui.cq0 cq0Var = zd0Var.f40956a;
                TextView textView = cq0Var.f31795e;
                bi.ec ecVar = cq0Var.h;
                RadialProgressView radialProgressView = cq0Var.f31797n;
                TextView textView2 = cq0Var.d;
                textView.setVisibility(8);
                cq0Var.f31796f.setVisibility(8);
                LinearLayout linearLayout = cq0Var.f31794c;
                if (linearLayout.getVisibility() == 8) {
                    linearLayout.setVisibility(0);
                    linearLayout.animate().cancel();
                    linearLayout.animate().alpha(1.0f).setDuration(150L).start();
                }
                if (radialProgressView.getAlpha() == 1.0f) {
                    radialProgressView.animate().cancel();
                    radialProgressView.animate().alpha(0.0f).setDuration(150L).setListener(new yd0(zd0Var, 0));
                }
                if (ecVar.getAlpha() == 1.0f) {
                    ecVar.animate().cancel();
                    ecVar.animate().alpha(0.0f).setDuration(150L).setListener(new yd0(zd0Var, 1));
                }
                if (i16 != 2) {
                    if (i16 != 5) {
                        if (i16 != 150) {
                            if (i16 != 100) {
                                if (i16 != 101) {
                                    return;
                                }
                            } else {
                                textView2.setText(org.telegram.messenger.id.M0(2131742834, null));
                                return;
                            }
                        }
                        textView2.setText(org.telegram.messenger.id.M0(2131742835, null));
                        textView.setText(org.telegram.messenger.id.M0(2131742833, null));
                        textView.setVisibility(0);
                        textView.setOnClickListener(new la0(zd0Var, 4));
                        return;
                    }
                    textView2.setText(org.telegram.messenger.id.M0(2131742837, null));
                    return;
                }
                textView2.setText(org.telegram.messenger.id.M0(2131742836, null));
                return;
            case 9:
                xg0 xg0Var = (xg0) obj;
                xg0Var.V0 = false;
                if (xg0Var.W0) {
                    xg0Var.C(true);
                    return;
                }
                xg0Var.f40314a1 = i16;
                xg0Var.I();
                xg0Var.x();
                return;
            case 10:
                v21 v21Var = (v21) obj;
                v21Var.e1();
                v21Var.Y1 = i16;
                k21.S0(v21Var.X1);
                v21Var.f1();
                return;
            case 11:
                ((u61) obj).f38550w.y0(i16);
                return;
            case 12:
                l71 l71Var = (l71) obj;
                t51 t51Var = l71Var.f35570a;
                if (i16 == -1) {
                    if (t51Var.d0()) {
                        t51Var.g0();
                        l71Var.n();
                    }
                    l71Var.J = false;
                    return;
                } else if (i16 == 1) {
                    if (l71Var.K) {
                        l71Var.K = false;
                        t51Var.h0();
                        return;
                    }
                    return;
                } else if (i16 != -3 && i16 == -2 && t51Var.d0()) {
                    l71Var.K = true;
                    t51Var.g0();
                    l71Var.n();
                    return;
                } else {
                    return;
                }
            case 13:
                org.telegram.ui.c40 c40Var = (org.telegram.ui.c40) obj;
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.setAudioOutput(i16);
                    c40Var.f44614p5 = Integer.valueOf(i16);
                }
                hc hcVar = new hc(c40Var.E, new di.i0());
                Resources resources = c40Var.getContext().getResources();
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
                hcVar.M(resources.getDrawable(i12).mutate(), org.telegram.ui.c40.j1(i16)).k(c40Var.q1());
                return;
            case 14:
                org.telegram.ui.c40 c40Var2 = ((org.telegram.ui.h30) obj).f46207b;
                VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                if (sharedInstance3 != null) {
                    sharedInstance3.setAudioOutput(i16);
                    c40Var2.f44614p5 = Integer.valueOf(i16);
                }
                hc hcVar2 = new hc(c40Var2.E, new di.i0());
                Resources resources2 = c40Var2.getContext().getResources();
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
                hcVar2.M(resources2.getDrawable(i13).mutate(), org.telegram.ui.c40.j1(i16)).k(c40Var2.q1());
                return;
            case 15:
                org.telegram.ui.w40 w40Var = (org.telegram.ui.w40) obj;
                AnimatorSet animatorSet = new AnimatorSet();
                int childCount = w40Var.f50884n.getChildCount();
                for (int i18 = 0; i18 < childCount; i18++) {
                    View childAt = w40Var.f50884n.getChildAt(i18);
                    w40Var.f50884n.getClass();
                    if (RecyclerView.R(childAt) >= i16) {
                        childAt.setAlpha(0.0f);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f);
                        ofFloat.setStartDelay((int) ((Math.min(w40Var.f50884n.getMeasuredHeight(), Math.max(0, childAt.getTop())) / w40Var.f50884n.getMeasuredHeight()) * 100.0f));
                        ofFloat.setDuration(200L);
                        animatorSet.playTogether(ofFloat);
                    }
                }
                animatorSet.start();
                return;
            case 16:
                org.telegram.ui.t50 t50Var = (org.telegram.ui.t50) obj;
                int i19 = org.telegram.ui.t50.D;
                t50Var.a(2131231535, 17, i16, true);
                t50Var.c();
                t50Var.b(t50Var.f49937w, 23, true);
                t50Var.d();
                Intro.a(i16);
                return;
            case 17:
                org.telegram.ui.pa0 pa0Var = (org.telegram.ui.pa0) obj;
                pa0Var.U.h1(0, -org.telegram.messenger.g0.L(i16));
                pa0Var.K0(false);
                return;
            case 18:
                ((org.telegram.ui.ob0) obj).f48350a.f52289f[i16].C(1.0f);
                return;
            case 19:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj;
                notificationsSettingsActivity.V = true;
                notificationsSettingsActivity.f41316c.g(i16);
                return;
            case 20:
                ((org.telegram.ui.yh0) obj).a(Integer.valueOf(i16));
                return;
            case 21:
                ((org.telegram.ui.ul0) obj).f50373e.f44449p0.I.E(1 - i16);
                return;
            case 22:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.Y8;
                int i20 = i16 + 1;
                if (i20 < 6 && (pq0Var = photoViewer.f41384e0) != null) {
                    pq0Var.invalidate();
                    org.telegram.messenger.g0.i3(new r2(photoViewer, i20, 22), 100L);
                    return;
                }
                return;
            case 23:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                RectF rectF = ProfileActivity.S6;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, profileActivity.getParentActivity(), profileActivity.f41869z0);
                String M02 = org.telegram.messenger.id.M0(2131746648, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                u1Var.R = M02;
                u1Var.T = org.telegram.messenger.id.M0(2131746649, null);
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751599, null), new l2.q(profileActivity, i16, 17));
                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                return;
            case 24:
                org.telegram.ui.iw0 iw0Var = (org.telegram.ui.iw0) obj;
                ProfileActivity profileActivity2 = iw0Var.h.f47047e;
                profileActivity2.getNotificationCenter().n(profileActivity2, 107);
                if (i16 == 2) {
                    profileActivity2.getMessagesController().k4(0L, "PREMIUM_GRACE");
                    vf.c.t(iw0Var.getContext(), profileActivity2.getMessagesController().L5);
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
                profileActivity2.D5(false, false);
                return;
            case 25:
                org.telegram.ui.ux0 ux0Var = (org.telegram.ui.ux0) obj;
                org.telegram.messenger.g0.v1(ux0Var.d.findFocus());
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr = ux0Var.f50441a;
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
                sessionsActivity.f41959f.remove(i16);
                sessionsActivity.r0();
                org.telegram.ui.y21 y21Var = sessionsActivity.f41955a;
                if (y21Var != null) {
                    y21Var.f();
                    return;
                }
                return;
            case 27:
                fc1 fc1Var = (fc1) obj;
                fc1Var.F.setSignalBarCount(i16);
                if (i16 <= 1) {
                    org.telegram.ui.Components.voip.u2 u2Var = fc1Var.f45579w;
                    if (u2Var.V != 3) {
                        u2Var.V = 3;
                        ValueAnimator ofInt = ValueAnimator.ofInt(u2Var.H, 255);
                        u2Var.O = ofInt;
                        ofInt.addUpdateListener(new org.telegram.ui.Components.voip.s2(u2Var, 2));
                        u2Var.O.setDuration(500L);
                        u2Var.O.start();
                    }
                    fc1Var.F.c(true);
                    return;
                }
                org.telegram.ui.Components.voip.u2 u2Var2 = fc1Var.f45579w;
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
                fc1Var.F.c(false);
                return;
            case 28:
                org.telegram.ui.Wallet.m0 m0Var = (org.telegram.ui.Wallet.m0) obj;
                HashSet hashSet = m0Var.E;
                hashSet.remove(Integer.valueOf(i16));
                if (hashSet.isEmpty()) {
                    m0Var.S();
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.m0 x10 = org.telegram.ui.Wallet.m0.x(i16);
                org.telegram.messenger.qs f11 = org.telegram.messenger.qs.f(i16);
                org.telegram.ui.Wallet.b0 b0Var = new org.telegram.ui.Wallet.b0(f11, (org.telegram.ui.zc0) obj, x10);
                f11.b(b0Var, 251);
                org.telegram.messenger.g0.i3(b0Var, 10000L);
                if (x10.f42765e == null && x10.A < 0) {
                    x10.Y();
                }
                x10.W();
                b0Var.a();
                return;
        }
    }

    public r2(Object obj, int i7, int i10) {
        this.f37485a = i10;
        this.f37487c = obj;
        this.f37486b = i7;
    }
}
