package org.telegram.ui;

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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.RadialProgressView;
public final class ii implements Runnable {
    public final int f48760a;
    public final int f48761b;
    public final Object f48762c;

    public ii(int i7, Object obj, int i10) {
        this.f48760a = i10;
        this.f48761b = i7;
        this.f48762c = obj;
    }

    @Override
    public final void run() {
        int i7;
        float f10;
        String str;
        CharSequence W2;
        int i10;
        float f11;
        int i11;
        int i12;
        float f12;
        qq0 qq0Var;
        int i13 = this.f48760a;
        int i14 = 2131232432;
        int i15 = this.f48761b;
        Object obj = this.f48762c;
        switch (i13) {
            case 0:
                bn bnVar = ((hi) obj).f48407g;
                if (bnVar.f45962ac == i15) {
                    bnVar.pb();
                    return;
                }
                return;
            case 1:
                bn bnVar2 = ((pl) obj).f50912x0;
                bnVar2.C0.h1(i15, bnVar2.O4);
                return;
            case 2:
                i7 = ((org.telegram.ui.ActionBar.g2) ((mm) obj).f49941a).currentAccount;
                ConnectionsManager.getInstance(i7).cancelRequest(i15, true);
                return;
            case 3:
                org.telegram.messenger.ls.f(i15).k(4, new Object[0]);
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.a2((org.telegram.messenger.mr) obj, 1), 250L);
                return;
            case 4:
                org.telegram.ui.Components.m80 m80Var = (org.telegram.ui.Components.m80) obj;
                ArrayList v = org.telegram.messenger.i5.r(i15).v(11);
                String str2 = null;
                String N0 = org.telegram.messenger.hd.N0(2131751229, null);
                if (v != null && !v.isEmpty()) {
                    int i16 = 0;
                    while (true) {
                        if (i16 < v.size()) {
                            if (v.get(i16) instanceof TLRPC.TL_privacyValueAllowContacts) {
                                N0 = org.telegram.messenger.hd.N0(2131751229, str2);
                            } else {
                                if (!(v.get(i16) instanceof TLRPC.TL_privacyValueAllowAll) && !(v.get(i16) instanceof TLRPC.TL_privacyValueDisallowAll)) {
                                    str2 = null;
                                } else {
                                    str2 = null;
                                    N0 = org.telegram.messenger.hd.N0(2131751230, null);
                                }
                                i16++;
                            }
                        }
                    }
                }
                m80Var.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.T2(N0, new org.telegram.ui.Components.o1(0, v)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(0.66f)));
                return;
            case 5:
                ((org.telegram.messenger.qe) obj).u(i15);
                return;
            case 6:
                org.telegram.ui.Components.yc ycVar = (org.telegram.ui.Components.yc) obj;
                hi.l3 l3Var = ycVar.f42389d1;
                if (ycVar.f42387b1 != i15) {
                    ycVar.setTimer(i15);
                    org.telegram.messenger.y10 y10Var = ycVar.f42401r1;
                    if (y10Var != null) {
                        y10Var.a(Integer.valueOf(i15));
                    }
                    if (i15 == 0) {
                        if (ycVar.f42400q1) {
                            i12 = 2131743885;
                        } else {
                            i12 = 2131743890;
                        }
                        W2 = org.telegram.messenger.hd.N0(i12, null);
                        l3Var.h = ycVar.getMeasuredWidth();
                        l3Var.r(false);
                        l3Var.n(13.0f, 4.0f, 10.0f, 4.0f);
                        l3Var.f14975f0 = org.telegram.messenger.g0.L(0);
                        l3Var.f14973e0 = -org.telegram.messenger.g0.L(1.0f);
                        f10 = 1.0f;
                    } else if (i15 == Integer.MAX_VALUE) {
                        if (ycVar.f42400q1) {
                            i10 = 2131743884;
                        } else {
                            i10 = 2131743889;
                        }
                        W2 = org.telegram.messenger.hd.N0(i10, null);
                        l3Var.h = ycVar.getMeasuredWidth();
                        l3Var.r(false);
                        l3Var.n(13.0f, 4.0f, 10.0f, 4.0f);
                        l3Var.f14975f0 = org.telegram.messenger.g0.L(0);
                        f10 = 1.0f;
                        l3Var.f14973e0 = -org.telegram.messenger.g0.L(1.0f);
                    } else {
                        f10 = 1.0f;
                        if (i15 > 0) {
                            if (ycVar.f42400q1) {
                                str = "TimerPeriodVideoSetSeconds";
                            } else {
                                str = "TimerPeriodPhotoSetSeconds";
                            }
                            W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.G(i15, str, new Object[0]));
                            l3Var.r(true);
                            l3Var.h = hi.l3.a(W2, l3Var.getTextPaint());
                            l3Var.n(12.0f, 7.0f, 11.0f, 7.0f);
                            l3Var.f14975f0 = org.telegram.messenger.g0.L(2);
                            l3Var.f14973e0 = 0.0f;
                        } else {
                            return;
                        }
                    }
                    float L = (-Math.min(org.telegram.messenger.g0.L(34.0f), ycVar.getEditTextHeight())) - org.telegram.messenger.g0.L(14.0f);
                    if (ycVar instanceof bp0) {
                        f11 = -1.0f;
                    } else {
                        f11 = f10;
                    }
                    l3Var.setTranslationY(L * f11);
                    l3Var.v(W2);
                    if (i15 > 0) {
                        i11 = 2131624021;
                    } else {
                        i11 = 2131624020;
                    }
                    org.telegram.ui.Components.oh0 oh0Var = new org.telegram.ui.Components.oh0(i11, org.telegram.messenger.g0.L(34.0f), org.telegram.messenger.g0.L(34.0f));
                    oh0Var.start();
                    l3Var.m(oh0Var);
                    l3Var.x();
                    ycVar.f42398o1 = false;
                    org.telegram.messenger.g0.r(ycVar.f42399p1);
                    ycVar.invalidate();
                    return;
                }
                return;
            case 7:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                if (i15 == 0) {
                    chatActivityEnterView.f32699q3 = 0;
                }
                chatActivityEnterView.W0 = null;
                org.telegram.ui.Components.fg fgVar = chatActivityEnterView.V0;
                if (fgVar != null) {
                    if (chatActivityEnterView.f32612e7 == null) {
                        fgVar.setTranslationY(0.0f);
                    }
                    chatActivityEnterView.V0.setVisibility(8);
                    chatActivityEnterView.d2.removeView(chatActivityEnterView.V0);
                    if (chatActivityEnterView.f32745w4) {
                        chatActivityEnterView.f32745w4 = false;
                        chatActivityEnterView.V0 = null;
                    }
                }
                org.telegram.ui.Components.ng ngVar = chatActivityEnterView.P3;
                if (ngVar != null) {
                    ngVar.x(0.0f);
                }
                chatActivityEnterView.requestLayout();
                return;
            case 8:
                ((ji.f) obj).a(Integer.valueOf(i15));
                return;
            case 9:
                ((ji.f) obj).a(Integer.valueOf(i15));
                return;
            case 10:
                org.telegram.ui.Components.qm qmVar = (org.telegram.ui.Components.qm) obj;
                org.telegram.ui.Components.rm rmVar = qmVar.Q;
                if (i15 == qmVar.P && rmVar.f39283x.isShown()) {
                    rmVar.f39283x.d(1, true);
                    return;
                }
                return;
            case 11:
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
            case 12:
                org.telegram.ui.Components.ty tyVar = (org.telegram.ui.Components.ty) obj;
                if (tyVar.Q1) {
                    org.telegram.ui.Components.tx txVar = tyVar.f40143u1;
                    if (txVar != null && txVar.k()) {
                        try {
                            tyVar.f40156y.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    tyVar.R1 = true;
                    int max = Math.max(50, i15 - 100);
                    org.telegram.messenger.g0.h3(new ii(tyVar, max, 12), max);
                    return;
                }
                return;
            case 13:
                ((org.telegram.ui.Components.w90) obj).f41732b.a(Integer.valueOf(i15));
                return;
            case 14:
                org.telegram.ui.Components.ke0 ke0Var = (org.telegram.ui.Components.ke0) obj;
                dq0 dq0Var = ke0Var.f36896a;
                TextView textView = dq0Var.f37170e;
                bi.m3 m3Var = dq0Var.h;
                RadialProgressView radialProgressView = dq0Var.f37172n;
                TextView textView2 = dq0Var.d;
                textView.setVisibility(8);
                dq0Var.f37171f.setVisibility(8);
                LinearLayout linearLayout = dq0Var.f37169c;
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
                    radialProgressView.animate().alpha(0.0f).setDuration(150L).setListener(new org.telegram.ui.Components.je0(ke0Var, 0));
                }
                if (m3Var.getAlpha() == 1.0f) {
                    m3Var.animate().cancel();
                    m3Var.animate().alpha(0.0f).setDuration(150L).setListener(new org.telegram.ui.Components.je0(ke0Var, 1));
                }
                if (i15 != 2) {
                    if (i15 != 5) {
                        if (i15 != 150) {
                            if (i15 != 100) {
                                if (i15 != 101) {
                                    return;
                                }
                            } else {
                                textView2.setText(org.telegram.messenger.hd.N0(2131742565, null));
                                return;
                            }
                        }
                        textView2.setText(org.telegram.messenger.hd.N0(2131742566, null));
                        textView.setText(org.telegram.messenger.hd.N0(2131742564, null));
                        textView.setVisibility(0);
                        textView.setOnClickListener(new org.telegram.ui.Components.j70(ke0Var, 6));
                        return;
                    }
                    textView2.setText(org.telegram.messenger.hd.N0(2131742568, null));
                    return;
                }
                textView2.setText(org.telegram.messenger.hd.N0(2131742567, null));
                return;
            case 15:
                org.telegram.ui.Components.mh0 mh0Var = (org.telegram.ui.Components.mh0) obj;
                mh0Var.W0 = false;
                if (mh0Var.X0) {
                    mh0Var.C(true);
                    return;
                }
                mh0Var.f37517b1 = i15;
                mh0Var.I();
                mh0Var.x();
                return;
            case 16:
                org.telegram.ui.Components.m31 m31Var = (org.telegram.ui.Components.m31) obj;
                m31Var.f1();
                m31Var.f37404c2 = i15;
                org.telegram.ui.Components.b31.U0(m31Var.f37403b2);
                m31Var.g1();
                return;
            case 17:
                ((org.telegram.ui.Components.i71) obj).f36219w.y0(i15);
                return;
            case 18:
                org.telegram.ui.Components.z71 z71Var = (org.telegram.ui.Components.z71) obj;
                org.telegram.ui.Components.i61 i61Var = z71Var.f42709a;
                if (i15 == -1) {
                    if (i61Var.d0()) {
                        i61Var.g0();
                        z71Var.n();
                    }
                    z71Var.K = false;
                    return;
                } else if (i15 == 1) {
                    if (z71Var.L) {
                        z71Var.L = false;
                        i61Var.h0();
                        return;
                    }
                    return;
                } else if (i15 != -3 && i15 == -2 && i61Var.d0()) {
                    z71Var.L = true;
                    i61Var.g0();
                    z71Var.n();
                    return;
                } else {
                    return;
                }
            case 19:
                f40 f40Var = (f40) obj;
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.setAudioOutput(i15);
                    f40Var.f47573x5 = Integer.valueOf(i15);
                }
                org.telegram.ui.Components.lc lcVar = new org.telegram.ui.Components.lc(f40Var.F, new fi.h0());
                Resources resources = f40Var.getContext().getResources();
                if (i15 == 2) {
                    i14 = 2131232427;
                } else if (i15 != 0) {
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    if (sharedInstance2 != null && sharedInstance2.isHeadsetPlugged()) {
                        i14 = 2131232428;
                    } else {
                        i14 = 2131232430;
                    }
                }
                lcVar.M(resources.getDrawable(i14).mutate(), f40.k1(i15)).k(f40Var.r1());
                return;
            case 20:
                f40 f40Var2 = ((k30) obj).f49193b;
                VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                if (sharedInstance3 != null) {
                    sharedInstance3.setAudioOutput(i15);
                    f40Var2.f47573x5 = Integer.valueOf(i15);
                }
                org.telegram.ui.Components.lc lcVar2 = new org.telegram.ui.Components.lc(f40Var2.F, new fi.h0());
                Resources resources2 = f40Var2.getContext().getResources();
                if (i15 == 2) {
                    i14 = 2131232427;
                } else if (i15 != 0) {
                    VoIPService sharedInstance4 = VoIPService.getSharedInstance();
                    if (sharedInstance4 != null && sharedInstance4.isHeadsetPlugged()) {
                        i14 = 2131232428;
                    } else {
                        i14 = 2131232430;
                    }
                }
                lcVar2.M(resources2.getDrawable(i14).mutate(), f40.k1(i15)).k(f40Var2.r1());
                return;
            case 21:
                z40 z40Var = (z40) obj;
                AnimatorSet animatorSet = new AnimatorSet();
                int childCount = z40Var.f54421n.getChildCount();
                for (int i17 = 0; i17 < childCount; i17++) {
                    View childAt = z40Var.f54421n.getChildAt(i17);
                    z40Var.f54421n.getClass();
                    if (RecyclerView.R(childAt) >= i15) {
                        childAt.setAlpha(0.0f);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f);
                        ofFloat.setStartDelay((int) ((Math.min(z40Var.f54421n.getMeasuredHeight(), Math.max(0, childAt.getTop())) / z40Var.f54421n.getMeasuredHeight()) * 100.0f));
                        ofFloat.setDuration(200L);
                        animatorSet.playTogether(ofFloat);
                    }
                }
                animatorSet.start();
                return;
            case 22:
                u50 u50Var = (u50) obj;
                int i18 = u50.E;
                u50Var.a(2131231536, 17, i15, true);
                u50Var.c();
                u50Var.b(u50Var.f52453w, 23, true);
                u50Var.d();
                Intro.a(i15);
                return;
            case 23:
                qa0 qa0Var = (qa0) obj;
                qa0Var.V.h1(0, -org.telegram.messenger.g0.L(i15));
                qa0Var.N0(false);
                return;
            case 24:
                ((pb0) obj).f50833a.f46301f[i15].D(1.0f);
                return;
            case 25:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj;
                notificationsSettingsActivity.W = true;
                notificationsSettingsActivity.f43174c.g(i15);
                return;
            case 26:
                ((di0) obj).a(Integer.valueOf(i15));
                return;
            case 27:
                ((yl0) obj).f54230e.f47786q0.J.A(1 - i15);
                return;
            case 28:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.Z8;
                int i19 = i15 + 1;
                if (i19 < 6 && (qq0Var = photoViewer.f43253f0) != null) {
                    qq0Var.invalidate();
                    org.telegram.messenger.g0.h3(new ii(photoViewer, i19, 28), 100L);
                    return;
                }
                return;
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                RectF rectF = ProfileActivity.Z6;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, profileActivity.getParentActivity(), profileActivity.A0);
                String N02 = org.telegram.messenger.hd.N0(2131746451, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
                t1Var.S = N02;
                t1Var.U = org.telegram.messenger.hd.N0(2131746452, null);
                alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131751586, null), new ai.v1(profileActivity, i15, 20));
                alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                return;
        }
    }

    public ii(Object obj, int i7, int i10) {
        this.f48760a = i10;
        this.f48762c = obj;
        this.f48761b = i7;
    }
}
