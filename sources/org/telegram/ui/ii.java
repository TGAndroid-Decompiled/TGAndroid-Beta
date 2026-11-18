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
    public final int f48734a;
    public final int f48735b;
    public final Object f48736c;

    public ii(int i7, Object obj, int i10) {
        this.f48734a = i10;
        this.f48735b = i7;
        this.f48736c = obj;
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
        int i13 = this.f48734a;
        int i14 = 2131232432;
        int i15 = this.f48735b;
        Object obj = this.f48736c;
        switch (i13) {
            case 0:
                bn bnVar = ((hi) obj).f48404g;
                if (bnVar.f45944ac == i15) {
                    bnVar.pb();
                    return;
                }
                return;
            case 1:
                bn bnVar2 = ((pl) obj).f50942x0;
                bnVar2.C0.h1(i15, bnVar2.O4);
                return;
            case 2:
                i7 = ((org.telegram.ui.ActionBar.h2) ((mm) obj).f49922a).currentAccount;
                ConnectionsManager.getInstance(i7).cancelRequest(i15, true);
                return;
            case 3:
                org.telegram.messenger.ks.f(i15).k(4, new Object[0]);
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.z1((org.telegram.messenger.lr) obj, 1), 250L);
                return;
            case 4:
                org.telegram.ui.Components.k80 k80Var = (org.telegram.ui.Components.k80) obj;
                ArrayList v = org.telegram.messenger.i5.r(i15).v(11);
                String str2 = null;
                String M0 = org.telegram.messenger.gd.M0(2131751230, null);
                if (v != null && !v.isEmpty()) {
                    int i16 = 0;
                    while (true) {
                        if (i16 < v.size()) {
                            if (v.get(i16) instanceof TLRPC.TL_privacyValueAllowContacts) {
                                M0 = org.telegram.messenger.gd.M0(2131751230, str2);
                            } else {
                                if (!(v.get(i16) instanceof TLRPC.TL_privacyValueAllowAll) && !(v.get(i16) instanceof TLRPC.TL_privacyValueDisallowAll)) {
                                    str2 = null;
                                } else {
                                    str2 = null;
                                    M0 = org.telegram.messenger.gd.M0(2131751231, null);
                                }
                                i16++;
                            }
                        }
                    }
                }
                k80Var.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.T2(M0, new org.telegram.ui.Components.n1(0, v)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(0.66f)));
                return;
            case 5:
                ((org.telegram.messenger.pe) obj).u(i15);
                return;
            case 6:
                org.telegram.ui.Components.yc ycVar = (org.telegram.ui.Components.yc) obj;
                hi.m3 m3Var = ycVar.f42454d1;
                if (ycVar.f42452b1 != i15) {
                    ycVar.setTimer(i15);
                    org.telegram.messenger.x10 x10Var = ycVar.f42466r1;
                    if (x10Var != null) {
                        x10Var.a(Integer.valueOf(i15));
                    }
                    if (i15 == 0) {
                        if (ycVar.f42465q1) {
                            i12 = 2131743893;
                        } else {
                            i12 = 2131743898;
                        }
                        W2 = org.telegram.messenger.gd.M0(i12, null);
                        m3Var.h = ycVar.getMeasuredWidth();
                        m3Var.r(false);
                        m3Var.n(13.0f, 4.0f, 10.0f, 4.0f);
                        m3Var.f15001f0 = org.telegram.messenger.g0.L(0);
                        m3Var.f14999e0 = -org.telegram.messenger.g0.L(1.0f);
                        f10 = 1.0f;
                    } else if (i15 == Integer.MAX_VALUE) {
                        if (ycVar.f42465q1) {
                            i10 = 2131743892;
                        } else {
                            i10 = 2131743897;
                        }
                        W2 = org.telegram.messenger.gd.M0(i10, null);
                        m3Var.h = ycVar.getMeasuredWidth();
                        m3Var.r(false);
                        m3Var.n(13.0f, 4.0f, 10.0f, 4.0f);
                        m3Var.f15001f0 = org.telegram.messenger.g0.L(0);
                        f10 = 1.0f;
                        m3Var.f14999e0 = -org.telegram.messenger.g0.L(1.0f);
                    } else {
                        f10 = 1.0f;
                        if (i15 > 0) {
                            if (ycVar.f42465q1) {
                                str = "TimerPeriodVideoSetSeconds";
                            } else {
                                str = "TimerPeriodPhotoSetSeconds";
                            }
                            W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.G(i15, str, new Object[0]));
                            m3Var.r(true);
                            m3Var.h = hi.m3.a(W2, m3Var.getTextPaint());
                            m3Var.n(12.0f, 7.0f, 11.0f, 7.0f);
                            m3Var.f15001f0 = org.telegram.messenger.g0.L(2);
                            m3Var.f14999e0 = 0.0f;
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
                    m3Var.setTranslationY(L * f11);
                    m3Var.v(W2);
                    if (i15 > 0) {
                        i11 = 2131624021;
                    } else {
                        i11 = 2131624020;
                    }
                    org.telegram.ui.Components.mh0 mh0Var = new org.telegram.ui.Components.mh0(i11, org.telegram.messenger.g0.L(34.0f), org.telegram.messenger.g0.L(34.0f));
                    mh0Var.start();
                    m3Var.m(mh0Var);
                    m3Var.x();
                    ycVar.f42463o1 = false;
                    org.telegram.messenger.g0.r(ycVar.f42464p1);
                    ycVar.invalidate();
                    return;
                }
                return;
            case 7:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                if (i15 == 0) {
                    chatActivityEnterView.f32652o3 = 0;
                }
                chatActivityEnterView.W0 = null;
                org.telegram.ui.Components.cg cgVar = chatActivityEnterView.V0;
                if (cgVar != null) {
                    if (chatActivityEnterView.f32565c7 == null) {
                        cgVar.setTranslationY(0.0f);
                    }
                    chatActivityEnterView.V0.setVisibility(8);
                    chatActivityEnterView.f32551b2.removeView(chatActivityEnterView.V0);
                    if (chatActivityEnterView.f32694u4) {
                        chatActivityEnterView.f32694u4 = false;
                        chatActivityEnterView.V0 = null;
                    }
                }
                org.telegram.ui.Components.kg kgVar = chatActivityEnterView.N3;
                if (kgVar != null) {
                    kgVar.x(0.0f);
                }
                chatActivityEnterView.requestLayout();
                return;
            case 8:
                ((ji.g) obj).a(Integer.valueOf(i15));
                return;
            case 9:
                ((ji.g) obj).a(Integer.valueOf(i15));
                return;
            case 10:
                org.telegram.ui.Components.om omVar = (org.telegram.ui.Components.om) obj;
                org.telegram.ui.Components.pm pmVar = omVar.Q;
                if (i15 == omVar.P && pmVar.f38490x.isShown()) {
                    pmVar.f38490x.d(1, true);
                    return;
                }
                return;
            case 11:
                org.telegram.ui.ActionBar.x2 x2Var = (org.telegram.ui.ActionBar.x2) obj;
                org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                if (T != null) {
                    x2Var.dismiss();
                    PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "create_bot");
                    premiumPreviewFragment.setCurrentAccount(i15);
                    T.presentFragment(premiumPreviewFragment);
                    return;
                }
                return;
            case 12:
                org.telegram.ui.Components.ry ryVar = (org.telegram.ui.Components.ry) obj;
                if (ryVar.Q1) {
                    org.telegram.ui.Components.rx rxVar = ryVar.f39397u1;
                    if (rxVar != null && rxVar.k()) {
                        try {
                            ryVar.f39410y.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    ryVar.R1 = true;
                    int max = Math.max(50, i15 - 100);
                    org.telegram.messenger.g0.h3(new ii(ryVar, max, 12), max);
                    return;
                }
                return;
            case 13:
                ((org.telegram.ui.Components.u90) obj).f40273b.a(Integer.valueOf(i15));
                return;
            case 14:
                org.telegram.ui.Components.je0 je0Var = (org.telegram.ui.Components.je0) obj;
                dq0 dq0Var = je0Var.f36422a;
                TextView textView = dq0Var.f36746e;
                bi.i3 i3Var = dq0Var.h;
                RadialProgressView radialProgressView = dq0Var.f36748n;
                TextView textView2 = dq0Var.d;
                textView.setVisibility(8);
                dq0Var.f36747f.setVisibility(8);
                LinearLayout linearLayout = dq0Var.f36745c;
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
                    radialProgressView.animate().alpha(0.0f).setDuration(150L).setListener(new org.telegram.ui.Components.ie0(je0Var, 0));
                }
                if (i3Var.getAlpha() == 1.0f) {
                    i3Var.animate().cancel();
                    i3Var.animate().alpha(0.0f).setDuration(150L).setListener(new org.telegram.ui.Components.ie0(je0Var, 1));
                }
                if (i15 != 2) {
                    if (i15 != 5) {
                        if (i15 != 150) {
                            if (i15 != 100) {
                                if (i15 != 101) {
                                    return;
                                }
                            } else {
                                textView2.setText(org.telegram.messenger.gd.M0(2131742573, null));
                                return;
                            }
                        }
                        textView2.setText(org.telegram.messenger.gd.M0(2131742574, null));
                        textView.setText(org.telegram.messenger.gd.M0(2131742572, null));
                        textView.setVisibility(0);
                        textView.setOnClickListener(new org.telegram.ui.Components.h70(je0Var, 6));
                        return;
                    }
                    textView2.setText(org.telegram.messenger.gd.M0(2131742576, null));
                    return;
                }
                textView2.setText(org.telegram.messenger.gd.M0(2131742575, null));
                return;
            case 15:
                org.telegram.ui.Components.kh0 kh0Var = (org.telegram.ui.Components.kh0) obj;
                kh0Var.W0 = false;
                if (kh0Var.X0) {
                    kh0Var.C(true);
                    return;
                }
                kh0Var.f36764b1 = i15;
                kh0Var.I();
                kh0Var.x();
                return;
            case 16:
                org.telegram.ui.Components.k31 k31Var = (org.telegram.ui.Components.k31) obj;
                k31Var.f1();
                k31Var.f36667c2 = i15;
                org.telegram.ui.Components.y21.U0(k31Var.f36666b2);
                k31Var.g1();
                return;
            case 17:
                ((org.telegram.ui.Components.f71) obj).f35016w.y0(i15);
                return;
            case 18:
                org.telegram.ui.Components.w71 w71Var = (org.telegram.ui.Components.w71) obj;
                org.telegram.ui.Components.f61 f61Var = w71Var.f41592a;
                if (i15 == -1) {
                    if (f61Var.d0()) {
                        f61Var.g0();
                        w71Var.n();
                    }
                    w71Var.K = false;
                    return;
                } else if (i15 == 1) {
                    if (w71Var.L) {
                        w71Var.L = false;
                        f61Var.h0();
                        return;
                    }
                    return;
                } else if (i15 != -3 && i15 == -2 && f61Var.d0()) {
                    w71Var.L = true;
                    f61Var.g0();
                    w71Var.n();
                    return;
                } else {
                    return;
                }
            case 19:
                f40 f40Var = (f40) obj;
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.setAudioOutput(i15);
                    f40Var.f47545x5 = Integer.valueOf(i15);
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
                f40 f40Var2 = ((k30) obj).f49169b;
                VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                if (sharedInstance3 != null) {
                    sharedInstance3.setAudioOutput(i15);
                    f40Var2.f47545x5 = Integer.valueOf(i15);
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
                int childCount = z40Var.f54414n.getChildCount();
                for (int i17 = 0; i17 < childCount; i17++) {
                    View childAt = z40Var.f54414n.getChildAt(i17);
                    z40Var.f54414n.getClass();
                    if (RecyclerView.R(childAt) >= i15) {
                        childAt.setAlpha(0.0f);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f);
                        ofFloat.setStartDelay((int) ((Math.min(z40Var.f54414n.getMeasuredHeight(), Math.max(0, childAt.getTop())) / z40Var.f54414n.getMeasuredHeight()) * 100.0f));
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
                u50Var.b(u50Var.f52442w, 23, true);
                u50Var.d();
                Intro.a(i15);
                return;
            case 23:
                pa0 pa0Var = (pa0) obj;
                pa0Var.V.h1(0, -org.telegram.messenger.g0.L(i15));
                pa0Var.N0(false);
                return;
            case 24:
                ((ob0) obj).f50547a.f46283f[i15].D(1.0f);
                return;
            case 25:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj;
                notificationsSettingsActivity.W = true;
                notificationsSettingsActivity.f43129c.g(i15);
                return;
            case 26:
                ((di0) obj).a(Integer.valueOf(i15));
                return;
            case 27:
                ((yl0) obj).f54225e.f47751q0.J.A(1 - i15);
                return;
            case 28:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.Z8;
                int i19 = i15 + 1;
                if (i19 < 6 && (qq0Var = photoViewer.f43208f0) != null) {
                    qq0Var.invalidate();
                    org.telegram.messenger.g0.h3(new ii(photoViewer, i19, 28), 100L);
                    return;
                }
                return;
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                RectF rectF = ProfileActivity.Z6;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, profileActivity.getParentActivity(), profileActivity.A0);
                String M02 = org.telegram.messenger.gd.M0(2131746452, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
                u1Var.S = M02;
                u1Var.U = org.telegram.messenger.gd.M0(2131746453, null);
                alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751587, null), new ai.s1(profileActivity, i15, 20));
                alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                return;
        }
    }

    public ii(Object obj, int i7, int i10) {
        this.f48734a = i10;
        this.f48736c = obj;
        this.f48735b = i7;
    }
}
