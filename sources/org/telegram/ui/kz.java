package org.telegram.ui;

import android.os.Looper;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.telegram.messenger.Intro;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class kz implements Runnable {
    public final int f49554a;
    public final Object f49555b;

    public kz(Object obj, int i7) {
        this.f49554a = i7;
        this.f49555b = obj;
    }

    @Override
    public final void run() {
        int i7;
        u50 u50Var;
        EGLDisplay eGLDisplay;
        EGLSurface eGLSurface;
        int i10 = this.f49554a;
        Object obj = this.f49555b;
        switch (i10) {
            case 0:
                b00 b00Var = (b00) obj;
                org.telegram.messenger.g0.r(b00Var.f45862o0);
                b00Var.f45843a.a(false, true);
                return;
            case 1:
                b00 b00Var2 = ((qz) obj).f51560a;
                b00Var2.h(b00Var2.F, b00Var2.G, b00Var2.I, b00Var2.H, b00Var2.E, b00Var2.K, b00Var2.f45870x, false);
                return;
            case 2:
                ((FiltersSetupActivity) ((dt) obj).f47222g3).getMessagesController().p3();
                return;
            case 3:
                e00 e00Var = (e00) obj;
                e00Var.f47285s.a();
                e00Var.f47283n.invalidate();
                e00Var.I.g0(true);
                return;
            case 4:
                FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) ((org.telegram.ui.Components.nz) obj).f37959f;
                if (!org.telegram.messenger.i10.i(org.telegram.messenger.i10.f24637t0).q()) {
                    ArrayList V0 = filtersSetupActivity.getMessagesController().V0();
                    int i11 = 0;
                    while (true) {
                        if (i11 < V0.size()) {
                            if (((org.telegram.messenger.ro) V0.get(i11)).d() && i11 != 0) {
                                FiltersSetupActivity filtersSetupActivity2 = filtersSetupActivity.f43170b.f48676e;
                                ArrayList arrayList = filtersSetupActivity2.getMessagesController().Q0;
                                if (i11 < 0 || i11 >= arrayList.size()) {
                                    i7 = 1;
                                } else {
                                    arrayList.add(0, (org.telegram.messenger.ro) arrayList.remove(i11));
                                    for (int i12 = 0; i12 <= i11; i12++) {
                                        ((org.telegram.messenger.ro) arrayList.get(i12)).f26777f = i12;
                                    }
                                    i7 = 1;
                                    filtersSetupActivity2.f43172e = true;
                                    filtersSetupActivity2.g0(true);
                                }
                                filtersSetupActivity.f43169a.v0(0);
                                try {
                                    filtersSetupActivity.fragmentView.performHapticFeedback(3, i7);
                                } catch (Exception unused) {
                                }
                                org.telegram.ui.Components.kc b02 = org.telegram.ui.Components.kc.b0(filtersSetupActivity);
                                Object[] objArr = new Object[i7];
                                objArr[0] = org.telegram.messenger.gd.N0(2131750795, null);
                                b02.J(2131624018, org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("LimitReachedReorderFolder", null, 2131748751, objArr)), org.telegram.messenger.gd.N0(2131746839, null), 5000, false, new c00(filtersSetupActivity, 2)).j();
                            } else {
                                i11++;
                            }
                        }
                    }
                }
                filtersSetupActivity.f0(null);
                return;
            case 5:
                e40 e40Var = ((q10) obj).f51221b;
                e40Var.f47354i4 = null;
                e40Var.R1(e40Var.E3, true);
                return;
            case 6:
                ((k30) obj).requestLayout();
                return;
            case 7:
                n30 n30Var = (n30) obj;
                e40 e40Var2 = n30Var.f50187f;
                c20 c20Var = e40Var2.f47367m1;
                org.telegram.messenger.fc fcVar = n30Var.d;
                if (fcVar != null) {
                    c20Var.L0 = fcVar;
                    c20Var.f35428r1 = null;
                    c20Var.f35429s1 = null;
                    n30Var.d = null;
                }
                TLRPC.Chat O0 = org.telegram.messenger.mp.u1(e40Var2.f47376o1.f23343a).O0(Long.valueOf(-n30Var.f50186e));
                org.telegram.messenger.fc a10 = org.telegram.messenger.fc.a(0, O0);
                org.telegram.messenger.fc a11 = org.telegram.messenger.fc.a(1, O0);
                if (org.telegram.messenger.fc.e(n30Var.f50184b) == null) {
                    a11 = org.telegram.messenger.fc.e(n30Var.f50185c);
                }
                c20Var.setCreateThumbFromParent(false);
                c20Var.H(null, a10, a11, true);
                n30Var.f50185c = null;
                n30Var.f50184b = null;
                org.telegram.messenger.g0.Z3(e40Var2.L1);
                n30Var.a(1.0f);
                return;
            case 8:
                tv tvVar = (tv) ((g.b) obj).f12927i;
                if (tvVar != null) {
                    tvVar.invalidate();
                    return;
                }
                return;
            case 9:
                e50 e50Var = (e50) obj;
                e50Var.E = null;
                e50Var.F = null;
                e50Var.G = null;
                e50Var.H = null;
                e50Var.J = null;
                e50Var.I = null;
                e50Var.K = 0.0d;
                e50Var.e0(false, true);
                e50Var.d.j(null, null, e50Var.f47442r, null);
                e50Var.f47440f.setAnimation(e50Var.S);
                e50Var.S.M(0);
                return;
            case 10:
                org.telegram.messenger.f3.n(null, 2131749185, org.telegram.ui.Components.kc.b0(((h50) obj).f48433c), 2131624000, 36);
                return;
            case 11:
                v50 v50Var = (v50) obj;
                u50 u50Var2 = v50Var.J;
                int i13 = org.telegram.ui.ActionBar.n6.f29451d6;
                int x02 = org.telegram.ui.ActionBar.n6.x0(null, i13, false);
                int i14 = u50.E;
                u50Var2.a(2131231539, 17, x02, true);
                v50Var.J.c();
                u50 u50Var3 = v50Var.J;
                u50Var3.b(u50Var3.f52540w, 23, true);
                v50Var.J.d();
                Intro.a(org.telegram.ui.ActionBar.n6.x0(null, i13, false));
                return;
            case 12:
                t50 t50Var = (t50) obj;
                t50Var.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                v50 v50Var2 = (v50) t50Var.f52259b;
                Intro.setPage(v50Var2.I);
                Intro.setDate(((float) (currentTimeMillis - v50Var2.K)) / 1000.0f);
                Intro.onDrawFrame(0);
                u50 u50Var4 = v50Var2.J;
                if (u50Var4 != null && u50Var4.isAlive() && (eGLDisplay = (u50Var = v50Var2.J).f52534c) != null && (eGLSurface = u50Var.f52536f) != null) {
                    try {
                        u50Var.f52533b.eglSwapBuffers(eGLDisplay, eGLSurface);
                        return;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                return;
            case 13:
                v50 v50Var3 = (v50) ((org.telegram.messenger.js) obj).f25030c;
                v50Var3.presentFragment(new de0(), true);
                v50Var3.N = true;
                return;
            case 14:
                ((u50) obj).finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 15:
                z50 z50Var = (z50) obj;
                z50Var.f54532f.f45598e.smoothScrollTo(0, z50Var.getHeight());
                return;
            case 16:
                ((vf.b) obj).b();
                return;
            case 17:
                ((m80) obj).f50009a.B0.setVisibility(8);
                return;
            case 18:
                x80 x80Var = (x80) obj;
                LaunchActivity launchActivity = x80Var.f53884c;
                launchActivity.O0 = false;
                boolean z10 = launchActivity.N0;
                launchActivity.E();
                if (z10 != launchActivity.N0) {
                    x80Var.requestLayout();
                    return;
                }
                return;
            case 19:
                p90 p90Var = (p90) obj;
                ci.z0 z0Var = p90Var.d;
                if (z0Var != null) {
                    p90Var.i0(z0Var.getCurrentLink());
                    return;
                }
                return;
            case 20:
                try {
                    org.telegram.ui.Components.ek0 currentListView = ((pa0) ((oa0) obj).f50615j0).R0.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().f();
                        return;
                    }
                    return;
                } catch (Throwable unused3) {
                    return;
                }
            case 21:
                EditTextBoldCursor[] editTextBoldCursorArr = ((tb0) obj).f52340b;
                if (editTextBoldCursorArr != null) {
                    editTextBoldCursorArr[0].requestFocus();
                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    org.telegram.messenger.g0.I3(editTextBoldCursorArr[0]);
                    return;
                }
                return;
            case 22:
                wb0 wb0Var = (wb0) obj;
                org.telegram.ui.Components.qh0 qh0Var = wb0Var.f53281e;
                EditTextBoldCursor editTextBoldCursor2 = wb0Var.f53278a;
                if (editTextBoldCursor2 != null) {
                    editTextBoldCursor2.requestFocus();
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                    de0.b1(wb0Var.E, editTextBoldCursor2);
                    qh0Var.getAnimatedDrawable().N(0, false, false);
                    qh0Var.d();
                    return;
                }
                return;
            case 23:
                ((org.telegram.ui.Components.qh0) obj).d();
                return;
            case 24:
                ((dc0) ((ah.i) obj).N1).getClass();
                return;
            case 25:
                double currentTimeMillis2 = System.currentTimeMillis();
                dc0 dc0Var = (dc0) ((h6.s) obj).f13943b;
                double d = dc0Var.R;
                ed0 ed0Var = dc0Var.f47038w;
                dc0Var.R = currentTimeMillis2;
                int i15 = (int) (dc0Var.Q - (currentTimeMillis2 - d));
                dc0Var.Q = i15;
                if (i15 >= 1000) {
                    int i16 = i15 / 1000;
                    int i17 = i16 / 60;
                    int i18 = i16 - (i17 * 60);
                    ed0Var.setTextSize(1, 13.0f);
                    int i19 = dc0Var.F;
                    if (i19 != 4 && i19 != 3 && i19 != 11) {
                        if (i19 == 2) {
                            ed0Var.setText(org.telegram.messenger.gd.a0(null, null, 2131745100, Integer.valueOf(i17), Integer.valueOf(i18)));
                            return;
                        }
                        return;
                    }
                    ed0Var.setText(org.telegram.messenger.gd.a0(null, null, 2131752617, Integer.valueOf(i17), Integer.valueOf(i18)));
                    return;
                }
                dc0Var.q();
                int i20 = dc0Var.F;
                if (i20 == 3 || i20 == 4 || i20 == 2 || i20 == 11) {
                    ed0Var.setTextSize(1, 15.0f);
                    int i21 = dc0Var.F;
                    if (i21 == 4) {
                        ed0Var.setText(org.telegram.messenger.gd.N0(2131745981, null));
                    } else if (i21 == 15) {
                        ed0Var.setText(org.telegram.messenger.gd.N0(2131751435, null));
                    } else if (i21 != 11 && i21 != 3) {
                        ed0Var.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.gd.N0(2131745982, null), true, 0.0f, 0.0f));
                    } else {
                        ed0Var.setText(org.telegram.messenger.gd.N0(2131745980, null));
                    }
                    int i22 = org.telegram.ui.ActionBar.n6.P9;
                    org.telegram.ui.ActionBar.u6.U(ed0Var, i22, null);
                    ed0Var.setTag(2131296388, Integer.valueOf(i22));
                    return;
                }
                return;
            case 26:
                double currentTimeMillis3 = System.currentTimeMillis();
                gd0 gd0Var = ((fd0) obj).f47802b;
                double d2 = currentTimeMillis3 - gd0Var.f48255e0;
                gd0Var.f48255e0 = currentTimeMillis3;
                int i23 = (int) (gd0Var.f48252c0 - d2);
                gd0Var.f48252c0 = i23;
                if (i23 <= 1000) {
                    gd0.o(gd0Var);
                    gd0Var.f48276w.setVisibility(8);
                    ed0 ed0Var2 = gd0Var.f48278y;
                    if (ed0Var2 != null) {
                        ed0Var2.setVisibility(0);
                    }
                    gd0Var.t();
                    return;
                }
                return;
            case 27:
                double currentTimeMillis4 = System.currentTimeMillis();
                gd0 gd0Var2 = ((fd0) obj).f47802b;
                double d10 = gd0Var2.f48253d0;
                ed0 ed0Var3 = gd0Var2.f48276w;
                gd0Var2.f48253d0 = currentTimeMillis4;
                int i24 = (int) (gd0Var2.f48250b0 - (currentTimeMillis4 - d10));
                gd0Var2.f48250b0 = i24;
                if (i24 >= 1000) {
                    int i25 = i24 / 1000;
                    int i26 = i25 / 60;
                    int i27 = i25 - (i26 * 60);
                    int i28 = gd0Var2.f48261j0;
                    if (i28 != 4 && i28 != 3 && i28 != 11) {
                        if (gd0Var2.f48260i0 == 2 && (i28 == 2 || i28 == 17 || i28 == 16)) {
                            ed0Var3.setText(org.telegram.messenger.gd.a0("ResendSmsAvailableIn", null, 2131745923, Integer.valueOf(i26), Integer.valueOf(i27)));
                            return;
                        } else if (i28 == 2 || i28 == 17 || i28 == 16) {
                            ed0Var3.setText(org.telegram.messenger.gd.a0("SmsAvailableIn", null, 2131745101, Integer.valueOf(i26), Integer.valueOf(i27)));
                            return;
                        } else {
                            return;
                        }
                    }
                    ed0Var3.setText(org.telegram.messenger.gd.a0("CallAvailableIn", null, 2131752618, Integer.valueOf(i26), Integer.valueOf(i27)));
                    return;
                }
                gd0Var2.u();
                int i29 = gd0Var2.f48261j0;
                if (i29 == 3 || i29 == 4 || i29 == 2 || i29 == 17 || i29 == 16 || i29 == 11) {
                    if (i29 == 4) {
                        ed0Var3.setText(org.telegram.messenger.gd.N0(2131745981, "RequestCallButton"));
                    } else if (i29 != 11 && i29 != 3) {
                        ed0Var3.setText(org.telegram.messenger.gd.N0(2131745979, "RequestSmsButton"));
                    } else {
                        ed0Var3.setText(org.telegram.messenger.gd.N0(2131745980, null));
                    }
                    int i30 = org.telegram.ui.ActionBar.n6.P9;
                    org.telegram.ui.ActionBar.u6.U(ed0Var3, i30, null);
                    ed0Var3.setTag(2131296388, Integer.valueOf(i30));
                    return;
                }
                return;
            case 28:
                ((org.telegram.ui.Components.xz) obj).run();
                return;
            default:
                ne0.k((ne0) obj);
                return;
        }
    }
}
