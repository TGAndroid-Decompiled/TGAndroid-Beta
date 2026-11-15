package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
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
public final class a2 implements Runnable {
    public final int f32824a;
    public final int f32825b;
    public final Object f32826c;

    public a2(int i7, Object obj, int i10) {
        this.f32824a = i10;
        this.f32825b = i7;
        this.f32826c = obj;
    }

    @Override
    public final void run() {
        String str;
        CharSequence X2;
        int i7;
        int i10;
        int i11;
        int i12;
        org.telegram.ui.oq0 oq0Var;
        String str2;
        int i13 = this.f32824a;
        int i14 = 2131232426;
        float f10 = 1.0f;
        int i15 = 0;
        int i16 = this.f32825b;
        Object obj = this.f32826c;
        switch (i13) {
            case 0:
                org.telegram.messenger.ns.f(i16).k(4, new Object[0]);
                org.telegram.messenger.g0.i3(new p1((org.telegram.messenger.nr) obj, 1), 250L);
                return;
            case 1:
                z70 z70Var = (z70) obj;
                ArrayList v = org.telegram.messenger.g5.r(i16).v(11);
                String str3 = null;
                String M0 = org.telegram.messenger.hd.M0(2131751241, null);
                if (v != null && !v.isEmpty()) {
                    int i17 = 0;
                    while (true) {
                        if (i17 < v.size()) {
                            if (v.get(i17) instanceof TLRPC.TL_privacyValueAllowContacts) {
                                M0 = org.telegram.messenger.hd.M0(2131751241, str3);
                            } else {
                                if (!(v.get(i17) instanceof TLRPC.TL_privacyValueAllowAll) && !(v.get(i17) instanceof TLRPC.TL_privacyValueDisallowAll)) {
                                    str3 = null;
                                } else {
                                    str3 = null;
                                    M0 = org.telegram.messenger.hd.M0(2131751242, null);
                                }
                                i17++;
                            }
                        }
                    }
                }
                z70Var.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(M0, new c1(0, v)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(0.66f)));
                return;
            case 2:
                ((org.telegram.messenger.qe) obj).u(i16);
                return;
            case 3:
                pc pcVar = (pc) obj;
                hi.l3 l3Var = pcVar.f38267d1;
                if (pcVar.f38265b1 != i16) {
                    pcVar.setTimer(i16);
                    org.telegram.messenger.z10 z10Var = pcVar.f38279r1;
                    if (z10Var != null) {
                        z10Var.a(Integer.valueOf(i16));
                    }
                    if (i16 == 0) {
                        if (pcVar.f38278q1) {
                            i11 = 2131744128;
                        } else {
                            i11 = 2131744133;
                        }
                        X2 = org.telegram.messenger.hd.M0(i11, null);
                        l3Var.h = pcVar.getMeasuredWidth();
                        l3Var.r(false);
                        l3Var.n(13.0f, 4.0f, 10.0f, 4.0f);
                        l3Var.f14557f0 = org.telegram.messenger.g0.L(0);
                        l3Var.f14555e0 = -org.telegram.messenger.g0.L(1.0f);
                    } else if (i16 == Integer.MAX_VALUE) {
                        if (pcVar.f38278q1) {
                            i7 = 2131744127;
                        } else {
                            i7 = 2131744132;
                        }
                        X2 = org.telegram.messenger.hd.M0(i7, null);
                        l3Var.h = pcVar.getMeasuredWidth();
                        l3Var.r(false);
                        l3Var.n(13.0f, 4.0f, 10.0f, 4.0f);
                        l3Var.f14557f0 = org.telegram.messenger.g0.L(0);
                        l3Var.f14555e0 = -org.telegram.messenger.g0.L(1.0f);
                    } else if (i16 > 0) {
                        if (pcVar.f38278q1) {
                            str = "TimerPeriodVideoSetSeconds";
                        } else {
                            str = "TimerPeriodPhotoSetSeconds";
                        }
                        X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.G(i16, str, new Object[0]));
                        l3Var.r(true);
                        l3Var.h = hi.l3.a(X2, l3Var.getTextPaint());
                        l3Var.n(12.0f, 7.0f, 11.0f, 7.0f);
                        l3Var.f14557f0 = org.telegram.messenger.g0.L(2);
                        l3Var.f14555e0 = 0.0f;
                    } else {
                        return;
                    }
                    float L = (-Math.min(org.telegram.messenger.g0.L(34.0f), pcVar.getEditTextHeight())) - org.telegram.messenger.g0.L(14.0f);
                    if (pcVar instanceof org.telegram.ui.yo0) {
                        f10 = -1.0f;
                    }
                    l3Var.setTranslationY(L * f10);
                    l3Var.u(X2);
                    if (i16 > 0) {
                        i10 = 2131624021;
                    } else {
                        i10 = 2131624020;
                    }
                    ch0 ch0Var = new ch0(i10, org.telegram.messenger.g0.L(34.0f), org.telegram.messenger.g0.L(34.0f));
                    ch0Var.start();
                    l3Var.m(ch0Var);
                    l3Var.w();
                    pcVar.f38276o1 = false;
                    org.telegram.messenger.g0.r(pcVar.f38277p1);
                    pcVar.invalidate();
                    return;
                }
                return;
            case 4:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                if (i16 == 0) {
                    chatActivityEnterView.f32216i3 = 0;
                }
                chatActivityEnterView.W0 = null;
                sf sfVar = chatActivityEnterView.V0;
                if (sfVar != null) {
                    if (chatActivityEnterView.C6 == null) {
                        sfVar.setTranslationY(0.0f);
                    }
                    chatActivityEnterView.V0.setVisibility(8);
                    chatActivityEnterView.V1.removeView(chatActivityEnterView.V0);
                    if (chatActivityEnterView.o4) {
                        chatActivityEnterView.o4 = false;
                        chatActivityEnterView.V0 = null;
                    }
                }
                cg cgVar = chatActivityEnterView.H3;
                if (cgVar != null) {
                    cgVar.y(0.0f);
                }
                chatActivityEnterView.requestLayout();
                return;
            case 5:
                ((ji.g) obj).a(Integer.valueOf(i16));
                return;
            case 6:
                ((ji.g) obj).a(Integer.valueOf(i16));
                return;
            case 7:
                hm hmVar = (hm) obj;
                im imVar = hmVar.Q;
                if (i16 == hmVar.P && imVar.f35666x.isShown()) {
                    imVar.f35666x.d(1, true);
                    return;
                }
                return;
            case 8:
                org.telegram.ui.ActionBar.u2 u2Var = (org.telegram.ui.ActionBar.u2) obj;
                org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                if (T != null) {
                    u2Var.dismiss();
                    PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "create_bot");
                    premiumPreviewFragment.setCurrentAccount(i16);
                    T.presentFragment(premiumPreviewFragment);
                    return;
                }
                return;
            case 9:
                ly lyVar = (ly) obj;
                if (lyVar.Q1) {
                    mx mxVar = lyVar.f36993u1;
                    if (mxVar != null && mxVar.k()) {
                        try {
                            lyVar.f37006y.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    lyVar.R1 = true;
                    int max = Math.max(50, i16 - 100);
                    org.telegram.messenger.g0.i3(new a2(lyVar, max, 9), max);
                    return;
                }
                return;
            case 10:
                ((j90) obj).f35933b.a(Integer.valueOf(i16));
                return;
            case 11:
                zd0 zd0Var = (zd0) obj;
                org.telegram.ui.bq0 bq0Var = zd0Var.f42342a;
                TextView textView = bq0Var.f32971e;
                bi.o2 o2Var = bq0Var.h;
                RadialProgressView radialProgressView = bq0Var.f32973n;
                TextView textView2 = bq0Var.d;
                textView.setVisibility(8);
                bq0Var.f32972f.setVisibility(8);
                LinearLayout linearLayout = bq0Var.f32970c;
                if (linearLayout.getVisibility() == 8) {
                    linearLayout.setVisibility(0);
                    linearLayout.animate().cancel();
                    linearLayout.animate().alpha(1.0f).setDuration(150L).start();
                }
                if (radialProgressView.getAlpha() == 1.0f) {
                    radialProgressView.animate().cancel();
                    radialProgressView.animate().alpha(0.0f).setDuration(150L).setListener(new yd0(zd0Var, 0));
                }
                if (o2Var.getAlpha() == 1.0f) {
                    o2Var.animate().cancel();
                    o2Var.animate().alpha(0.0f).setDuration(150L).setListener(new yd0(zd0Var, 1));
                }
                if (i16 != 2) {
                    if (i16 != 5) {
                        if (i16 != 150) {
                            if (i16 != 100) {
                                if (i16 != 101) {
                                    return;
                                }
                            } else {
                                textView2.setText(org.telegram.messenger.hd.M0(2131742831, null));
                                return;
                            }
                        }
                        textView2.setText(org.telegram.messenger.hd.M0(2131742832, null));
                        textView.setText(org.telegram.messenger.hd.M0(2131742830, null));
                        textView.setVisibility(0);
                        textView.setOnClickListener(new y60(zd0Var, 5));
                        return;
                    }
                    textView2.setText(org.telegram.messenger.hd.M0(2131742834, null));
                    return;
                }
                textView2.setText(org.telegram.messenger.hd.M0(2131742833, null));
                return;
            case 12:
                ah0 ah0Var = (ah0) obj;
                ah0Var.W0 = false;
                if (ah0Var.X0) {
                    ah0Var.C(true);
                    return;
                }
                ah0Var.f32992b1 = i16;
                ah0Var.I();
                ah0Var.x();
                return;
            case 13:
                a31 a31Var = (a31) obj;
                a31Var.e1();
                a31Var.f32837c2 = i16;
                p21.T0(a31Var.f32836b2);
                a31Var.f1();
                return;
            case 14:
                ((v61) obj).f40317w.y0(i16);
                return;
            case 15:
                m71 m71Var = (m71) obj;
                u51 u51Var = m71Var.f37138a;
                if (i16 == -1) {
                    if (u51Var.d0()) {
                        u51Var.g0();
                        m71Var.n();
                    }
                    m71Var.K = false;
                    return;
                } else if (i16 == 1) {
                    if (m71Var.L) {
                        m71Var.L = false;
                        u51Var.h0();
                        return;
                    }
                    return;
                } else if (i16 != -3 && i16 == -2 && u51Var.d0()) {
                    m71Var.L = true;
                    u51Var.g0();
                    m71Var.n();
                    return;
                } else {
                    return;
                }
            case 16:
                org.telegram.ui.c40 c40Var = (org.telegram.ui.c40) obj;
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.setAudioOutput(i16);
                    c40Var.f45998x5 = Integer.valueOf(i16);
                }
                cc ccVar = new cc(c40Var.F, new fi.i0());
                Resources resources = c40Var.getContext().getResources();
                if (i16 == 2) {
                    i12 = 2131232426;
                } else if (i16 == 0) {
                    i12 = 2131232431;
                } else {
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    if (sharedInstance2 != null && sharedInstance2.isHeadsetPlugged()) {
                        i12 = 2131232427;
                    } else {
                        i12 = 2131232429;
                    }
                }
                ccVar.M(resources.getDrawable(i12).mutate(), org.telegram.ui.c40.j1(i16)).k(c40Var.q1());
                return;
            case 17:
                org.telegram.ui.c40 c40Var2 = ((org.telegram.ui.h30) obj).f47598b;
                VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                if (sharedInstance3 != null) {
                    sharedInstance3.setAudioOutput(i16);
                    c40Var2.f45998x5 = Integer.valueOf(i16);
                }
                cc ccVar2 = new cc(c40Var2.F, new fi.i0());
                Resources resources2 = c40Var2.getContext().getResources();
                if (i16 != 2) {
                    if (i16 == 0) {
                        i14 = 2131232431;
                    } else {
                        VoIPService sharedInstance4 = VoIPService.getSharedInstance();
                        if (sharedInstance4 != null && sharedInstance4.isHeadsetPlugged()) {
                            i14 = 2131232427;
                        } else {
                            i14 = 2131232429;
                        }
                    }
                }
                ccVar2.M(resources2.getDrawable(i14).mutate(), org.telegram.ui.c40.j1(i16)).k(c40Var2.q1());
                return;
            case 18:
                org.telegram.ui.w40 w40Var = (org.telegram.ui.w40) obj;
                AnimatorSet animatorSet = new AnimatorSet();
                int childCount = w40Var.f52415n.getChildCount();
                for (int i18 = 0; i18 < childCount; i18++) {
                    View childAt = w40Var.f52415n.getChildAt(i18);
                    w40Var.f52415n.getClass();
                    if (RecyclerView.R(childAt) >= i16) {
                        childAt.setAlpha(0.0f);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f);
                        ofFloat.setStartDelay((int) ((Math.min(w40Var.f52415n.getMeasuredHeight(), Math.max(0, childAt.getTop())) / w40Var.f52415n.getMeasuredHeight()) * 100.0f));
                        ofFloat.setDuration(200L);
                        animatorSet.playTogether(ofFloat);
                    }
                }
                animatorSet.start();
                return;
            case 19:
                org.telegram.ui.s50 s50Var = (org.telegram.ui.s50) obj;
                int i19 = org.telegram.ui.s50.E;
                s50Var.a(2131231535, 17, i16, true);
                s50Var.c();
                s50Var.b(s50Var.f51112w, 23, true);
                s50Var.d();
                Intro.a(i16);
                return;
            case 20:
                org.telegram.ui.pa0 pa0Var = (org.telegram.ui.pa0) obj;
                pa0Var.V.h1(0, -org.telegram.messenger.g0.L(i16));
                pa0Var.K0(false);
                return;
            case 21:
                ((org.telegram.ui.ob0) obj).f49890a.f45491f[i16].D(1.0f);
                return;
            case 22:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj;
                notificationsSettingsActivity.W = true;
                notificationsSettingsActivity.f42684c.g(i16);
                return;
            case 23:
                ((org.telegram.ui.ai0) obj).a(Integer.valueOf(i16));
                return;
            case 24:
                ((org.telegram.ui.vl0) obj).f52247e.f46210q0.J.C(1 - i16);
                return;
            case 25:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.Z8;
                int i20 = i16 + 1;
                if (i20 < 6 && (oq0Var = photoViewer.f42763f0) != null) {
                    oq0Var.invalidate();
                    org.telegram.messenger.g0.i3(new a2(photoViewer, i20, 25), 100L);
                    return;
                }
                return;
            case 26:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                RectF rectF = ProfileActivity.X6;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, profileActivity.getParentActivity(), profileActivity.A0);
                String M02 = org.telegram.messenger.hd.M0(2131746647, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                t1Var.S = M02;
                t1Var.U = org.telegram.messenger.hd.M0(2131746648, null);
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751598, null), new ai.r1(profileActivity, i16, 20));
                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                return;
            case 27:
                org.telegram.ui.hw0 hw0Var = (org.telegram.ui.hw0) obj;
                ProfileActivity profileActivity2 = hw0Var.h.f48138e;
                profileActivity2.getNotificationCenter().n(profileActivity2, 107);
                if (i16 == 2) {
                    profileActivity2.getMessagesController().k4(0L, "PREMIUM_GRACE");
                    vf.c.t(hw0Var.getContext(), profileActivity2.getMessagesController().M5);
                } else {
                    org.telegram.messenger.np messagesController = profileActivity2.getMessagesController();
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
            case 28:
                org.telegram.ui.tx0 tx0Var = (org.telegram.ui.tx0) obj;
                org.telegram.messenger.g0.v1(tx0Var.d.findFocus());
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr = tx0Var.f51685a;
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
            default:
                SessionsActivity sessionsActivity = (SessionsActivity) obj;
                sessionsActivity.f43331f.remove(i16);
                sessionsActivity.r0();
                org.telegram.ui.v21 v21Var = sessionsActivity.f43327a;
                if (v21Var != null) {
                    v21Var.f();
                    return;
                }
                return;
        }
    }

    public a2(Object obj, int i7, int i10) {
        this.f32824a = i10;
        this.f32826c = obj;
        this.f32825b = i7;
    }
}
