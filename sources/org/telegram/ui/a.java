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
    public final int f44889a;
    public final Object f44890b;

    public a(Object obj, int i7) {
        this.f44889a = i7;
        this.f44890b = obj;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.g6 g6Var;
        String str;
        CameraSessionWrapper cameraSession;
        int i7;
        org.telegram.ui.ActionBar.o4 o4Var;
        org.telegram.ui.ActionBar.o4 o4Var2;
        org.telegram.ui.Cells.q8 q8Var;
        int i10 = this.f44889a;
        Object obj = this.f44890b;
        switch (i10) {
            case 0:
                ((ai.z0) obj).run();
                return;
            case 1:
                ((org.telegram.ui.ActionBar.u2[]) obj)[0].dismiss();
                return;
            case 2:
                org.telegram.ui.web.s0 webView = ((k3) obj).f48552f.getWebView();
                if (webView != null) {
                    webView.reload();
                    return;
                }
                return;
            case 3:
                p4 p4Var = (p4) obj;
                if (view == p4Var.f50140e) {
                    org.telegram.ui.Components.t4.k(p4Var.getParentActivity(), null, new f(p4Var, 4));
                    return;
                }
                int i11 = ((o4) view).f49803e;
                if (p4Var.Z() == 0 && i11 > 0) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p4Var.getParentActivity());
                    String M0 = org.telegram.messenger.hd.M0(2131748587, null);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                    t1Var.S = M0;
                    t1Var.U = org.telegram.messenger.hd.a0("AutoDeleteConfirmMessage", null, 2131753865, org.telegram.messenger.hd.c0(i11 * 60));
                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), new org.telegram.messenger.fd(18));
                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751160, null), new m2.d(7, p4Var, view));
                    alertDialog$Builder.p();
                    return;
                }
                p4Var.b0(view, true);
                return;
            case 4:
                ((b5) obj).b(false);
                return;
            case 5:
                q6 q6Var = (q6) obj;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(q6Var.getContext());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(org.telegram.messenger.hd.M0(2131752098, null));
                if (TextUtils.isEmpty(q6Var.f49138c.f34836i)) {
                    str = "";
                } else {
                    str = " (" + ((Object) g6Var.f34836i) + ")";
                }
                sb2.append(str);
                String sb3 = sb2.toString();
                org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28392a;
                t1Var2.S = sb3;
                t1Var2.U = org.telegram.messenger.hd.M0(2131744814, null);
                alertDialog$Builder2.k(q6Var.f49137b.f34836i, new w0(q6Var, 9));
                alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                q6Var.d.showDialog(t1Var2);
                View d = t1Var2.d(-1);
                if (d instanceof TextView) {
                    int i12 = org.telegram.ui.ActionBar.j6.f29070p7;
                    org.telegram.ui.ActionBar.q6.U((TextView) d, i12, null);
                    d.setBackground(org.telegram.ui.ActionBar.j6.J0(org.telegram.messenger.g0.L(6.0f), org.telegram.ui.ActionBar.j6.r1(0.12f, org.telegram.ui.ActionBar.j6.x0(null, i12, false))));
                    return;
                }
                return;
            case 6:
                y6 y6Var = (y6) ((w6) obj).f52441f;
                y6Var.M = !y6Var.M;
                y6Var.A0(true);
                y6Var.y0();
                return;
            case 7:
                k7 k7Var = (k7) obj;
                switch (k7Var.f48608f) {
                    case 0:
                        ((l7) k7Var.h).f48879r.G.N(null, (ei.b) k7Var.getTag(), true);
                        return;
                    default:
                        ((q7) k7Var.h).f50485n.G.N(null, (ei.b) k7Var.getTag(), true);
                        return;
                }
            case 8:
                ((f0) obj).run();
                return;
            case 9:
                org.telegram.ui.Components.fh0 fh0Var = (org.telegram.ui.Components.fh0) ((di.k4) obj).f8909e;
                if (!fh0Var.b()) {
                    fh0Var.setProgress(0.0f);
                    fh0Var.d();
                    return;
                }
                return;
            case 10:
                t9 t9Var = (t9) obj;
                CameraView cameraView = t9Var.d;
                if (cameraView != null && (cameraSession = cameraView.getCameraSession()) != null) {
                    ShapeDrawable shapeDrawable = (ShapeDrawable) t9Var.f51506s.getBackground();
                    AnimatorSet animatorSet = t9Var.f51507w;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        t9Var.f51507w = null;
                    }
                    t9Var.f51507w = new AnimatorSet();
                    org.telegram.ui.Components.i6 i6Var = org.telegram.ui.Components.k6.f36300e;
                    if (t9Var.f51506s.getTag() == null) {
                        i7 = 68;
                    } else {
                        i7 = 34;
                    }
                    ObjectAnimator ofInt = ObjectAnimator.ofInt(shapeDrawable, i6Var, i7);
                    ofInt.addUpdateListener(new m9(t9Var, 1));
                    t9Var.f51507w.playTogether(ofInt);
                    t9Var.f51507w.setDuration(200L);
                    t9Var.f51507w.setInterpolator(org.telegram.ui.Components.er.f34420f);
                    t9Var.f51507w.addListener(new ki.s3(t9Var, 20));
                    t9Var.f51507w.start();
                    if (t9Var.f51506s.getTag() == null) {
                        t9Var.f51506s.setTag(1);
                        cameraSession.setCurrentFlashMode("torch");
                        return;
                    }
                    t9Var.f51506s.setTag(null);
                    cameraSession.setCurrentFlashMode("off");
                    return;
                }
                return;
            case 11:
                ((qc) obj).D0();
                return;
            case 12:
                an anVar = ((si) obj).f51228b;
                anVar.f45240j0.p();
                fi.p2 p2Var = anVar.Y1;
                if (p2Var != null) {
                    p2Var.w1(0, null);
                }
                anVar.Aa();
                return;
            case 13:
                an anVar2 = ((lm) obj).f49005a;
                o4Var = ((org.telegram.ui.ActionBar.e2) anVar2).parentLayout;
                if (o4Var != null) {
                    o4Var2 = ((org.telegram.ui.ActionBar.e2) anVar2).parentLayout;
                    ((ActionBarLayout) o4Var2).r();
                    return;
                }
                return;
            case 14:
                ((lp) obj).f49019e.w0(true);
                return;
            case 15:
                ContactsActivity.b0((ContactsActivity) obj);
                return;
            case 16:
                ((org.telegram.ui.Cells.q8[]) obj)[0].setChecked(!q8Var.f31310e.h);
                return;
            case 17:
                ((org.telegram.ui.ActionBar.u2) ((org.telegram.messenger.ou) obj).f25804b).f29724y0.run();
                return;
            case 18:
                org.telegram.messenger.i20.l(3, (org.telegram.ui.ActionBar.e2) obj);
                return;
            case 19:
                final yt ytVar = (yt) obj;
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(ytVar.getContext());
                String M02 = org.telegram.messenger.hd.M0(2131752098, null);
                org.telegram.ui.ActionBar.t1 t1Var3 = alertDialog$Builder3.f28392a;
                t1Var3.S = M02;
                t1Var3.U = org.telegram.messenger.hd.M0(2131752096, null);
                alertDialog$Builder3.h(org.telegram.messenger.hd.M0(2131752589, null), new org.telegram.ui.ActionBar.q1() {
                    @Override
                    public final void h(org.telegram.ui.ActionBar.t1 t1Var4, int i13) {
                        switch (r2) {
                            case 0:
                                ytVar.dismiss();
                                return;
                            default:
                                yt ytVar2 = ytVar;
                                ytVar2.dismiss();
                                k8.a aVar = ytVar2.V1;
                                ((y6) aVar.f17789c).o0(ytVar2.U1, ytVar2.X1, ytVar2.f53626c2);
                                return;
                        }
                    }
                });
                alertDialog$Builder3.k(org.telegram.messenger.hd.M0(2131752101, null), new org.telegram.ui.ActionBar.q1() {
                    @Override
                    public final void h(org.telegram.ui.ActionBar.t1 t1Var4, int i13) {
                        switch (r2) {
                            case 0:
                                ytVar.dismiss();
                                return;
                            default:
                                yt ytVar2 = ytVar;
                                ytVar2.dismiss();
                                k8.a aVar = ytVar2.V1;
                                ((y6) aVar.f17789c).o0(ytVar2.U1, ytVar2.X1, ytVar2.f53626c2);
                                return;
                        }
                    }
                });
                t1Var3.show();
                t1Var3.i();
                return;
            case 20:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = ((ActionBarPopupWindow$ActionBarPopupWindowLayout[]) obj)[0];
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                    return;
                }
                return;
            case 21:
                ((wy) obj).d1();
                return;
            case 22:
                ((wy) ((k0) obj).f48534b).dismiss();
                return;
            case 23:
                org.telegram.ui.Components.fh0 fh0Var2 = (org.telegram.ui.Components.fh0) ((k0) obj).f48534b;
                if (!fh0Var2.b()) {
                    fh0Var2.setProgress(0.0f);
                    fh0Var2.d();
                    return;
                }
                return;
            case 24:
                ((bz) obj).c();
                return;
            case 25:
                c00 c00Var = (c00) obj;
                org.telegram.ui.Components.d80 d80Var = c00Var.f45877s;
                if ((!c00Var.f45876r || d80Var.c()) && c00Var.f45880y != null) {
                    c00Var.f45876r = true;
                    d80Var.f33865b = -1L;
                    d80Var.f33866c = -1L;
                    c00Var.f45875n.invalidate();
                    wy.f1(c00Var.I, c00Var.f45880y, new iz(c00Var, 3));
                    return;
                }
                return;
            case 26:
                org.telegram.ui.Components.fh0 fh0Var3 = ((d00) obj).f46280a;
                if (!fh0Var3.b()) {
                    fh0Var3.setProgress(0.0f);
                    fh0Var3.d();
                    return;
                }
                return;
            case 27:
                final g00 g00Var = (g00) obj;
                c00 c00Var2 = (c00) view.getParent();
                final org.telegram.messenger.so currentFilter = c00Var2.getCurrentFilter();
                FiltersSetupActivity filtersSetupActivity = g00Var.f47264e;
                org.telegram.ui.Components.m60 H = org.telegram.ui.Components.m60.H(filtersSetupActivity, c00Var2);
                H.c(2131232117, org.telegram.messenger.hd.M0(2131750779, null), new Runnable() {
                    @Override
                    public final void run() {
                        int i13;
                        int i14 = r3;
                        org.telegram.messenger.so soVar = currentFilter;
                        g00 g00Var2 = g00Var;
                        switch (i14) {
                            case 0:
                                FiltersSetupActivity filtersSetupActivity2 = g00Var2.f47264e;
                                if (soVar.f26555p) {
                                    Context context = g00Var2.d;
                                    i13 = ((org.telegram.ui.ActionBar.e2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new ug.j0(3, i13, context, filtersSetupActivity2, null));
                                    return;
                                }
                                filtersSetupActivity2.presentFragment(new hz(soVar, null));
                                return;
                            default:
                                FiltersSetupActivity filtersSetupActivity3 = g00Var2.f47264e;
                                if (soVar.d()) {
                                    org.telegram.ui.Components.zz.g1(filtersSetupActivity3, soVar.f26542a, new r3(g00Var2, 7));
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                String M03 = org.telegram.messenger.hd.M0(2131750790, null);
                                org.telegram.ui.ActionBar.t1 t1Var4 = alertDialog$Builder4.f28392a;
                                t1Var4.S = M03;
                                t1Var4.U = org.telegram.messenger.hd.M0(2131750789, null);
                                alertDialog$Builder4.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                alertDialog$Builder4.k(org.telegram.messenger.hd.M0(2131751598, null), new tr(8, g00Var2, soVar));
                                filtersSetupActivity3.showDialog(t1Var4);
                                TextView textView = (TextView) t1Var4.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f29090q7, null);
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
                H.c(2131232109, org.telegram.messenger.hd.M0(2131750787, null), new Runnable() {
                    @Override
                    public final void run() {
                        int i13;
                        int i14 = r3;
                        org.telegram.messenger.so soVar = currentFilter;
                        g00 g00Var2 = g00Var;
                        switch (i14) {
                            case 0:
                                FiltersSetupActivity filtersSetupActivity2 = g00Var2.f47264e;
                                if (soVar.f26555p) {
                                    Context context = g00Var2.d;
                                    i13 = ((org.telegram.ui.ActionBar.e2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new ug.j0(3, i13, context, filtersSetupActivity2, null));
                                    return;
                                }
                                filtersSetupActivity2.presentFragment(new hz(soVar, null));
                                return;
                            default:
                                FiltersSetupActivity filtersSetupActivity3 = g00Var2.f47264e;
                                if (soVar.d()) {
                                    org.telegram.ui.Components.zz.g1(filtersSetupActivity3, soVar.f26542a, new r3(g00Var2, 7));
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                String M03 = org.telegram.messenger.hd.M0(2131750790, null);
                                org.telegram.ui.ActionBar.t1 t1Var4 = alertDialog$Builder4.f28392a;
                                t1Var4.S = M03;
                                t1Var4.U = org.telegram.messenger.hd.M0(2131750789, null);
                                alertDialog$Builder4.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                alertDialog$Builder4.k(org.telegram.messenger.hd.M0(2131751598, null), new tr(8, g00Var2, soVar));
                                filtersSetupActivity3.showDialog(t1Var4);
                                TextView textView = (TextView) t1Var4.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f29090q7, null);
                                    return;
                                }
                                return;
                        }
                    }
                }, true);
                if (org.telegram.messenger.hd.f24101a0) {
                    H.f37093i = 3;
                }
                H.W(filtersSetupActivity.f42604a.U0(c00Var2, false));
                H.Z();
                return;
            case 28:
                ((n30) obj).dismiss();
                return;
            default:
                org.telegram.ui.Components.fp fpVar = (org.telegram.ui.Components.fp) obj;
                fpVar.a(!fpVar.f34663a.f32441q, true);
                org.telegram.messenger.np.e1().edit().putBoolean("callmiconstart", fpVar.f34663a.f32441q).apply();
                return;
        }
    }
}
