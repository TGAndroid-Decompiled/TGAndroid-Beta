package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.camera.CameraSessionWrapper;
import org.telegram.messenger.camera.CameraView;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class a implements View.OnClickListener {
    public final int f43542a;
    public final Object f43543b;

    public a(Object obj, int i3) {
        this.f43542a = i3;
        this.f43543b = obj;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.g6 g6Var;
        String str;
        CameraSessionWrapper cameraSession;
        int i3;
        org.telegram.ui.ActionBar.q4 q4Var;
        org.telegram.ui.ActionBar.q4 q4Var2;
        org.telegram.ui.Cells.q8 q8Var;
        int i10 = this.f43542a;
        Object obj = this.f43543b;
        switch (i10) {
            case 0:
                ((ai.e3) obj).run();
                return;
            case 1:
                ((org.telegram.ui.ActionBar.t2[]) obj)[0].dismiss();
                return;
            case 2:
                org.telegram.ui.web.t0 webView = ((l3) obj).f47086f.getWebView();
                if (webView != null) {
                    webView.reload();
                    return;
                }
                return;
            case 3:
                r4 r4Var = (r4) obj;
                if (view == r4Var.f49027e) {
                    org.telegram.ui.Components.t4.k(r4Var.getParentActivity(), null, new f(r4Var, 4));
                    return;
                }
                int i11 = ((q4) view).f48748e;
                if (r4Var.Z() == 0 && i11 > 0) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(r4Var.getParentActivity());
                    String M0 = org.telegram.messenger.bd.M0(2131748595, null);
                    org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                    s1Var.S = M0;
                    s1Var.U = org.telegram.messenger.bd.a0("AutoDeleteConfirmMessage", null, 2131753865, org.telegram.messenger.bd.c0(i11 * 60));
                    alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), new org.telegram.messenger.go(11));
                    alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751161, null), new mi.d4(13, r4Var, view));
                    alertDialog$Builder.p();
                    return;
                }
                r4Var.b0(view, true);
                return;
            case 4:
                ((d5) obj).b(false);
                return;
            case 5:
                r6 r6Var = (r6) obj;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(r6Var.getContext());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(org.telegram.messenger.bd.M0(2131752098, null));
                if (TextUtils.isEmpty(r6Var.f47896c.f33989i)) {
                    str = "";
                } else {
                    str = " (" + ((Object) g6Var.f33989i) + ")";
                }
                sb2.append(str);
                String sb3 = sb2.toString();
                org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder2.f27343a;
                s1Var2.S = sb3;
                s1Var2.U = org.telegram.messenger.bd.M0(2131744824, null);
                alertDialog$Builder2.k(r6Var.f47895b.f33989i, new x0(r6Var, 9));
                alertDialog$Builder2.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                r6Var.d.showDialog(s1Var2);
                View d = s1Var2.d(-1);
                if (d instanceof TextView) {
                    int i12 = org.telegram.ui.ActionBar.k6.f28102p7;
                    org.telegram.ui.ActionBar.r6.V((TextView) d, i12, null);
                    d.setBackground(org.telegram.ui.ActionBar.k6.J0(org.telegram.messenger.g0.L(6.0f), org.telegram.ui.ActionBar.k6.r1(0.12f, org.telegram.ui.ActionBar.k6.x0(null, i12, false))));
                    return;
                }
                return;
            case 6:
                z6 z6Var = (z6) ((x6) obj).f51837f;
                z6Var.M = !z6Var.M;
                z6Var.A0(true);
                z6Var.y0();
                return;
            case 7:
                l7 l7Var = (l7) obj;
                switch (l7Var.f47130f) {
                    case 0:
                        ((m7) l7Var.h).f47548r.G.a(null, (di.b) l7Var.getTag(), true);
                        return;
                    default:
                        ((r7) l7Var.h).f49113n.G.a(null, (di.b) l7Var.getTag(), true);
                        return;
                }
            case 8:
                ((f4) obj).run();
                return;
            case 9:
                org.telegram.ui.Components.fh0 fh0Var = (org.telegram.ui.Components.fh0) ((ci.t4) obj).f6025e;
                if (!fh0Var.b()) {
                    fh0Var.setProgress(0.0f);
                    fh0Var.d();
                    return;
                }
                return;
            case 10:
                s9 s9Var = (s9) obj;
                CameraView cameraView = s9Var.d;
                if (cameraView != null && (cameraSession = cameraView.getCameraSession()) != null) {
                    ShapeDrawable shapeDrawable = (ShapeDrawable) s9Var.f49436s.getBackground();
                    AnimatorSet animatorSet = s9Var.f49437w;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        s9Var.f49437w = null;
                    }
                    s9Var.f49437w = new AnimatorSet();
                    org.telegram.ui.Components.i6 i6Var = org.telegram.ui.Components.k6.f35325e;
                    if (s9Var.f49436s.getTag() == null) {
                        i3 = 68;
                    } else {
                        i3 = 34;
                    }
                    ObjectAnimator ofInt = ObjectAnimator.ofInt(shapeDrawable, i6Var, i3);
                    ofInt.addUpdateListener(new l9(s9Var, 1));
                    s9Var.f49437w.playTogether(ofInt);
                    s9Var.f49437w.setDuration(200L);
                    s9Var.f49437w.setInterpolator(org.telegram.ui.Components.xq.f40452f);
                    s9Var.f49437w.addListener(new ii.v3(s9Var, 20));
                    s9Var.f49437w.start();
                    if (s9Var.f49436s.getTag() == null) {
                        s9Var.f49436s.setTag(1);
                        cameraSession.setCurrentFlashMode("torch");
                        return;
                    }
                    s9Var.f49436s.setTag(null);
                    cameraSession.setCurrentFlashMode("off");
                    return;
                }
                return;
            case 11:
                ((pc) obj).D0();
                return;
            case 12:
                wm wmVar = ((oi) obj).f48298b;
                wmVar.f51359j0.o();
                ei.x2 x2Var = wmVar.Y1;
                if (x2Var != null) {
                    x2Var.w1(0, null);
                }
                wmVar.xa();
                return;
            case 13:
                wm wmVar2 = ((hm) obj).f45934a;
                q4Var = ((org.telegram.ui.ActionBar.d2) wmVar2).parentLayout;
                if (q4Var != null) {
                    q4Var2 = ((org.telegram.ui.ActionBar.d2) wmVar2).parentLayout;
                    ((ActionBarLayout) q4Var2).r();
                    return;
                }
                return;
            case 14:
                ((hp) obj).f45961e.w0(true);
                return;
            case 15:
                ContactsActivity.b0((ContactsActivity) obj);
                return;
            case 16:
                ((org.telegram.ui.Cells.q8[]) obj)[0].setChecked(!q8Var.f30234e.h);
                return;
            case 17:
                ((org.telegram.ui.ActionBar.t2) ((hi.d) obj).f14429b).f28625y0.run();
                return;
            case 18:
                org.telegram.messenger.camera.q.j(3, (org.telegram.ui.ActionBar.d2) obj);
                return;
            case 19:
                final ut utVar = (ut) obj;
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(utVar.getContext());
                String M02 = org.telegram.messenger.bd.M0(2131752098, null);
                org.telegram.ui.ActionBar.s1 s1Var3 = alertDialog$Builder3.f27343a;
                s1Var3.S = M02;
                s1Var3.U = org.telegram.messenger.bd.M0(2131752096, null);
                alertDialog$Builder3.h(org.telegram.messenger.bd.M0(2131752589, null), new org.telegram.ui.ActionBar.p1() {
                    @Override
                    public final void g(org.telegram.ui.ActionBar.s1 s1Var4, int i13) {
                        switch (r2) {
                            case 0:
                                utVar.dismiss();
                                return;
                            default:
                                ut utVar2 = utVar;
                                utVar2.dismiss();
                                m2.t tVar = utVar2.S1;
                                ((z6) tVar.f19007c).o0(utVar2.R1, utVar2.U1, utVar2.Z1);
                                return;
                        }
                    }
                });
                alertDialog$Builder3.k(org.telegram.messenger.bd.M0(2131752101, null), new org.telegram.ui.ActionBar.p1() {
                    @Override
                    public final void g(org.telegram.ui.ActionBar.s1 s1Var4, int i13) {
                        switch (r2) {
                            case 0:
                                utVar.dismiss();
                                return;
                            default:
                                ut utVar2 = utVar;
                                utVar2.dismiss();
                                m2.t tVar = utVar2.S1;
                                ((z6) tVar.f19007c).o0(utVar2.R1, utVar2.U1, utVar2.Z1);
                                return;
                        }
                    }
                });
                s1Var3.show();
                s1Var3.i();
                return;
            case 20:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = ((ActionBarPopupWindow$ActionBarPopupWindowLayout[]) obj)[0];
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                    return;
                }
                return;
            case 21:
                ((sy) obj).d1();
                return;
            case 22:
                ((sy) ((l0) obj).f47060b).dismiss();
                return;
            case 23:
                org.telegram.ui.Components.fh0 fh0Var2 = (org.telegram.ui.Components.fh0) ((l0) obj).f47060b;
                if (!fh0Var2.b()) {
                    fh0Var2.setProgress(0.0f);
                    fh0Var2.d();
                    return;
                }
                return;
            case 24:
                ((yy) obj).c();
                return;
            case 25:
                yz yzVar = (yz) obj;
                org.telegram.ui.Components.w70 w70Var = yzVar.f52461s;
                if ((!yzVar.f52460r || w70Var.c()) && yzVar.f52464y != null) {
                    yzVar.f52460r = true;
                    w70Var.f39925b = -1L;
                    w70Var.f39926c = -1L;
                    yzVar.f52459n.invalidate();
                    sy.f1(yzVar.I, yzVar.f52464y, new fz(yzVar, 3));
                    return;
                }
                return;
            case 26:
                org.telegram.ui.Components.fh0 fh0Var3 = ((zz) obj).f52766a;
                if (!fh0Var3.b()) {
                    fh0Var3.setProgress(0.0f);
                    fh0Var3.d();
                    return;
                }
                return;
            case 27:
                final c00 c00Var = (c00) obj;
                yz yzVar2 = (yz) view.getParent();
                final org.telegram.messenger.mo currentFilter = yzVar2.getCurrentFilter();
                FiltersSetupActivity filtersSetupActivity = c00Var.f44184e;
                org.telegram.ui.Components.f60 H = org.telegram.ui.Components.f60.H(filtersSetupActivity, yzVar2);
                H.c(2131232116, org.telegram.messenger.bd.M0(2131750780, null), new Runnable() {
                    @Override
                    public final void run() {
                        int i13;
                        int i14 = r3;
                        org.telegram.messenger.mo moVar = currentFilter;
                        c00 c00Var2 = c00Var;
                        switch (i14) {
                            case 0:
                                FiltersSetupActivity filtersSetupActivity2 = c00Var2.f44184e;
                                if (moVar.f24250p) {
                                    Context context = c00Var2.d;
                                    i13 = ((org.telegram.ui.ActionBar.d2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new vg.i0(3, i13, context, filtersSetupActivity2, null));
                                    return;
                                }
                                filtersSetupActivity2.presentFragment(new ez(moVar, null));
                                return;
                            default:
                                FiltersSetupActivity filtersSetupActivity3 = c00Var2.f44184e;
                                if (moVar.d()) {
                                    org.telegram.ui.Components.rz.g1(filtersSetupActivity3, moVar.f24237a, new s3(c00Var2, 7));
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                String M03 = org.telegram.messenger.bd.M0(2131750791, null);
                                org.telegram.ui.ActionBar.s1 s1Var4 = alertDialog$Builder4.f27343a;
                                s1Var4.S = M03;
                                s1Var4.U = org.telegram.messenger.bd.M0(2131750790, null);
                                alertDialog$Builder4.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                                alertDialog$Builder4.k(org.telegram.messenger.bd.M0(2131751599, null), new org.telegram.ui.Components.i41(14, c00Var2, moVar));
                                filtersSetupActivity3.showDialog(s1Var4);
                                TextView textView = (TextView) s1Var4.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28122q7, null);
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
                H.c(2131232108, org.telegram.messenger.bd.M0(2131750788, null), new Runnable() {
                    @Override
                    public final void run() {
                        int i13;
                        int i14 = r3;
                        org.telegram.messenger.mo moVar = currentFilter;
                        c00 c00Var2 = c00Var;
                        switch (i14) {
                            case 0:
                                FiltersSetupActivity filtersSetupActivity2 = c00Var2.f44184e;
                                if (moVar.f24250p) {
                                    Context context = c00Var2.d;
                                    i13 = ((org.telegram.ui.ActionBar.d2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new vg.i0(3, i13, context, filtersSetupActivity2, null));
                                    return;
                                }
                                filtersSetupActivity2.presentFragment(new ez(moVar, null));
                                return;
                            default:
                                FiltersSetupActivity filtersSetupActivity3 = c00Var2.f44184e;
                                if (moVar.d()) {
                                    org.telegram.ui.Components.rz.g1(filtersSetupActivity3, moVar.f24237a, new s3(c00Var2, 7));
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                String M03 = org.telegram.messenger.bd.M0(2131750791, null);
                                org.telegram.ui.ActionBar.s1 s1Var4 = alertDialog$Builder4.f27343a;
                                s1Var4.S = M03;
                                s1Var4.U = org.telegram.messenger.bd.M0(2131750790, null);
                                alertDialog$Builder4.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                                alertDialog$Builder4.k(org.telegram.messenger.bd.M0(2131751599, null), new org.telegram.ui.Components.i41(14, c00Var2, moVar));
                                filtersSetupActivity3.showDialog(s1Var4);
                                TextView textView = (TextView) s1Var4.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28122q7, null);
                                    return;
                                }
                                return;
                        }
                    }
                }, true);
                if (org.telegram.messenger.bd.f21784a0) {
                    H.f33729i = 3;
                }
                H.W(filtersSetupActivity.f41265a.U0(yzVar2, false));
                H.Z();
                return;
            case 28:
                ((i30) obj).dismiss();
                return;
            default:
                org.telegram.ui.Components.wo woVar = (org.telegram.ui.Components.wo) obj;
                woVar.a(!woVar.f40035a.f31334q, true);
                org.telegram.messenger.hp.e1().edit().putBoolean("callmiconstart", woVar.f40035a.f31334q).apply();
                return;
        }
    }
}
