package org.telegram.ui;

import android.os.Looper;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.telegram.messenger.Intro;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class lz implements Runnable {
    public final int f49723a;
    public final Object f49724b;

    public lz(Object obj, int i7) {
        this.f49723a = i7;
        this.f49724b = obj;
    }

    @Override
    public final void run() {
        int i7;
        u50 u50Var;
        EGLDisplay eGLDisplay;
        EGLSurface eGLSurface;
        int i10 = this.f49723a;
        Object obj = this.f49724b;
        switch (i10) {
            case 0:
                c00 c00Var = (c00) obj;
                org.telegram.messenger.g0.r(c00Var.f46362o0);
                c00Var.f46343a.a(false, true);
                return;
            case 1:
                c00 c00Var2 = ((rz) obj).f51792a;
                c00Var2.h(c00Var2.F, c00Var2.G, c00Var2.I, c00Var2.H, c00Var2.E, c00Var2.K, c00Var2.f46370x, false);
                return;
            case 2:
                ((FiltersSetupActivity) ((et) obj).f47375g3).getMessagesController().p3();
                return;
            case 3:
                f00 f00Var = (f00) obj;
                f00Var.f47440s.a();
                f00Var.f47438n.invalidate();
                f00Var.I.g0(true);
                return;
            case 4:
                FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) ((org.telegram.ui.Components.qz) obj).f39027f;
                if (!org.telegram.messenger.j10.i(org.telegram.messenger.j10.f24798t0).q()) {
                    ArrayList V0 = filtersSetupActivity.getMessagesController().V0();
                    int i11 = 0;
                    while (true) {
                        if (i11 < V0.size()) {
                            if (((org.telegram.messenger.ro) V0.get(i11)).d() && i11 != 0) {
                                FiltersSetupActivity filtersSetupActivity2 = filtersSetupActivity.f43091b.f48853e;
                                ArrayList arrayList = filtersSetupActivity2.getMessagesController().Q0;
                                if (i11 < 0 || i11 >= arrayList.size()) {
                                    i7 = 1;
                                } else {
                                    arrayList.add(0, (org.telegram.messenger.ro) arrayList.remove(i11));
                                    for (int i12 = 0; i12 <= i11; i12++) {
                                        ((org.telegram.messenger.ro) arrayList.get(i12)).f26704f = i12;
                                    }
                                    i7 = 1;
                                    filtersSetupActivity2.f43093e = true;
                                    filtersSetupActivity2.g0(true);
                                }
                                filtersSetupActivity.f43090a.v0(0);
                                try {
                                    filtersSetupActivity.fragmentView.performHapticFeedback(3, i7);
                                } catch (Exception unused) {
                                }
                                org.telegram.ui.Components.lc b02 = org.telegram.ui.Components.lc.b0(filtersSetupActivity);
                                Object[] objArr = new Object[i7];
                                objArr[0] = org.telegram.messenger.gd.N0(2131750795, null);
                                b02.J(2131624018, org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("LimitReachedReorderFolder", null, 2131748751, objArr)), org.telegram.messenger.gd.N0(2131746839, null), 5000, false, new d00(filtersSetupActivity, 2)).j();
                            } else {
                                i11++;
                            }
                        }
                    }
                }
                filtersSetupActivity.f0(null);
                return;
            case 5:
                f40 f40Var = ((r10) obj).f51425b;
                f40Var.f47500i4 = null;
                f40Var.S1(f40Var.E3, true);
                return;
            case 6:
                ((l30) obj).requestLayout();
                return;
            case 7:
                o30 o30Var = (o30) obj;
                f40 f40Var2 = o30Var.f50446f;
                d20 d20Var = f40Var2.f47513m1;
                org.telegram.messenger.fc fcVar = o30Var.d;
                if (fcVar != null) {
                    d20Var.L0 = fcVar;
                    d20Var.f35900r1 = null;
                    d20Var.f35901s1 = null;
                    o30Var.d = null;
                }
                TLRPC.Chat O0 = org.telegram.messenger.mp.u1(f40Var2.f47522o1.f23246a).O0(Long.valueOf(-o30Var.f50445e));
                org.telegram.messenger.fc a10 = org.telegram.messenger.fc.a(0, O0);
                org.telegram.messenger.fc a11 = org.telegram.messenger.fc.a(1, O0);
                if (org.telegram.messenger.fc.e(o30Var.f50443b) == null) {
                    a11 = org.telegram.messenger.fc.e(o30Var.f50444c);
                }
                d20Var.setCreateThumbFromParent(false);
                d20Var.H(null, a10, a11, true);
                o30Var.f50444c = null;
                o30Var.f50443b = null;
                org.telegram.messenger.g0.Z3(f40Var2.L1);
                o30Var.a(1.0f);
                return;
            case 8:
                uv uvVar = (uv) ((g.b) obj).f12962i;
                if (uvVar != null) {
                    uvVar.invalidate();
                    return;
                }
                return;
            case 9:
                f50 f50Var = (f50) obj;
                f50Var.E = null;
                f50Var.F = null;
                f50Var.G = null;
                f50Var.H = null;
                f50Var.J = null;
                f50Var.I = null;
                f50Var.K = 0.0d;
                f50Var.e0(false, true);
                f50Var.d.j(null, null, f50Var.f47595r, null);
                f50Var.f47593f.setAnimation(f50Var.S);
                f50Var.S.M(0);
                return;
            case 10:
                org.telegram.messenger.f3.n(null, 2131749185, org.telegram.ui.Components.lc.b0(((i50) obj).f48580c), 2131624000, 36);
                return;
            case 11:
                v50 v50Var = (v50) obj;
                u50 u50Var2 = v50Var.J;
                int i13 = org.telegram.ui.ActionBar.m6.f29378d6;
                int x02 = org.telegram.ui.ActionBar.m6.x0(null, i13, false);
                int i14 = u50.E;
                u50Var2.a(2131231536, 17, x02, true);
                v50Var.J.c();
                u50 u50Var3 = v50Var.J;
                u50Var3.b(u50Var3.f52449w, 23, true);
                v50Var.J.d();
                Intro.a(org.telegram.ui.ActionBar.m6.x0(null, i13, false));
                return;
            case 12:
                t50 t50Var = (t50) obj;
                t50Var.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                v50 v50Var2 = (v50) t50Var.f52228b;
                Intro.setPage(v50Var2.I);
                Intro.setDate(((float) (currentTimeMillis - v50Var2.K)) / 1000.0f);
                Intro.onDrawFrame(0);
                u50 u50Var4 = v50Var2.J;
                if (u50Var4 != null && u50Var4.isAlive() && (eGLDisplay = (u50Var = v50Var2.J).f52443c) != null && (eGLSurface = u50Var.f52445f) != null) {
                    try {
                        u50Var.f52442b.eglSwapBuffers(eGLDisplay, eGLSurface);
                        return;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                return;
            case 13:
                v50 v50Var3 = (v50) ((org.telegram.messenger.js) obj).f24948c;
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
                z50Var.f54440f.f45510e.smoothScrollTo(0, z50Var.getHeight());
                return;
            case 16:
                ((vf.b) obj).b();
                return;
            case 17:
                ((n80) obj).f50146a.B0.setVisibility(8);
                return;
            case 18:
                y80 y80Var = (y80) obj;
                LaunchActivity launchActivity = y80Var.f54077c;
                launchActivity.O0 = false;
                boolean z10 = launchActivity.N0;
                launchActivity.E();
                if (z10 != launchActivity.N0) {
                    y80Var.requestLayout();
                    return;
                }
                return;
            case 19:
                q90 q90Var = (q90) obj;
                ci.z0 z0Var = q90Var.d;
                if (z0Var != null) {
                    q90Var.i0(z0Var.getCurrentLink());
                    return;
                }
                return;
            case 20:
                try {
                    org.telegram.ui.Components.ek0 currentListView = ((qa0) ((pa0) obj).f50823j0).R0.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().f();
                        return;
                    }
                    return;
                } catch (Throwable unused3) {
                    return;
                }
            case 21:
                EditTextBoldCursor[] editTextBoldCursorArr = ((ub0) obj).f52517b;
                if (editTextBoldCursorArr != null) {
                    editTextBoldCursorArr[0].requestFocus();
                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    org.telegram.messenger.g0.I3(editTextBoldCursorArr[0]);
                    return;
                }
                return;
            case 22:
                xb0 xb0Var = (xb0) obj;
                org.telegram.ui.Components.rh0 rh0Var = xb0Var.f53812e;
                EditTextBoldCursor editTextBoldCursor2 = xb0Var.f53809a;
                if (editTextBoldCursor2 != null) {
                    editTextBoldCursor2.requestFocus();
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                    de0.b1(xb0Var.E, editTextBoldCursor2);
                    rh0Var.getAnimatedDrawable().N(0, false, false);
                    rh0Var.d();
                    return;
                }
                return;
            case 23:
                ((org.telegram.ui.Components.rh0) obj).d();
                return;
            case 24:
                ((ec0) ((ah.i) obj).N1).getClass();
                return;
            case 25:
                double currentTimeMillis2 = System.currentTimeMillis();
                ec0 ec0Var = (ec0) ((h6.r) obj).f13975b;
                double d = ec0Var.R;
                ed0 ed0Var = ec0Var.f47238w;
                ec0Var.R = currentTimeMillis2;
                int i15 = (int) (ec0Var.Q - (currentTimeMillis2 - d));
                ec0Var.Q = i15;
                if (i15 >= 1000) {
                    int i16 = i15 / 1000;
                    int i17 = i16 / 60;
                    int i18 = i16 - (i17 * 60);
                    ed0Var.setTextSize(1, 13.0f);
                    int i19 = ec0Var.F;
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
                ec0Var.q();
                int i20 = ec0Var.F;
                if (i20 == 3 || i20 == 4 || i20 == 2 || i20 == 11) {
                    ed0Var.setTextSize(1, 15.0f);
                    int i21 = ec0Var.F;
                    if (i21 == 4) {
                        ed0Var.setText(org.telegram.messenger.gd.N0(2131745981, null));
                    } else if (i21 == 15) {
                        ed0Var.setText(org.telegram.messenger.gd.N0(2131751435, null));
                    } else if (i21 != 11 && i21 != 3) {
                        ed0Var.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.gd.N0(2131745982, null), true, 0.0f, 0.0f));
                    } else {
                        ed0Var.setText(org.telegram.messenger.gd.N0(2131745980, null));
                    }
                    int i22 = org.telegram.ui.ActionBar.m6.P9;
                    org.telegram.ui.ActionBar.t6.U(ed0Var, i22, null);
                    ed0Var.setTag(2131296388, Integer.valueOf(i22));
                    return;
                }
                return;
            case 26:
                double currentTimeMillis3 = System.currentTimeMillis();
                gd0 gd0Var = ((fd0) obj).f47669b;
                double d2 = currentTimeMillis3 - gd0Var.f48060e0;
                gd0Var.f48060e0 = currentTimeMillis3;
                int i23 = (int) (gd0Var.f48057c0 - d2);
                gd0Var.f48057c0 = i23;
                if (i23 <= 1000) {
                    gd0.o(gd0Var);
                    gd0Var.f48081w.setVisibility(8);
                    ed0 ed0Var2 = gd0Var.f48083y;
                    if (ed0Var2 != null) {
                        ed0Var2.setVisibility(0);
                    }
                    gd0Var.t();
                    return;
                }
                return;
            case 27:
                double currentTimeMillis4 = System.currentTimeMillis();
                gd0 gd0Var2 = ((fd0) obj).f47669b;
                double d10 = gd0Var2.f48058d0;
                ed0 ed0Var3 = gd0Var2.f48081w;
                gd0Var2.f48058d0 = currentTimeMillis4;
                int i24 = (int) (gd0Var2.f48055b0 - (currentTimeMillis4 - d10));
                gd0Var2.f48055b0 = i24;
                if (i24 >= 1000) {
                    int i25 = i24 / 1000;
                    int i26 = i25 / 60;
                    int i27 = i25 - (i26 * 60);
                    int i28 = gd0Var2.f48066j0;
                    if (i28 != 4 && i28 != 3 && i28 != 11) {
                        if (gd0Var2.f48065i0 == 2 && (i28 == 2 || i28 == 17 || i28 == 16)) {
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
                int i29 = gd0Var2.f48066j0;
                if (i29 == 3 || i29 == 4 || i29 == 2 || i29 == 17 || i29 == 16 || i29 == 11) {
                    if (i29 == 4) {
                        ed0Var3.setText(org.telegram.messenger.gd.N0(2131745981, "RequestCallButton"));
                    } else if (i29 != 11 && i29 != 3) {
                        ed0Var3.setText(org.telegram.messenger.gd.N0(2131745979, "RequestSmsButton"));
                    } else {
                        ed0Var3.setText(org.telegram.messenger.gd.N0(2131745980, null));
                    }
                    int i30 = org.telegram.ui.ActionBar.m6.P9;
                    org.telegram.ui.ActionBar.t6.U(ed0Var3, i30, null);
                    ed0Var3.setTag(2131296388, Integer.valueOf(i30));
                    return;
                }
                return;
            case 28:
                ((org.telegram.ui.Components.q20) obj).run();
                return;
            default:
                oe0.k((oe0) obj);
                return;
        }
    }
}
