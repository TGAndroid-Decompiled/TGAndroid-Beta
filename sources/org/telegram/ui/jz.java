package org.telegram.ui;

import android.os.Looper;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.telegram.messenger.Intro;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class jz implements Runnable {
    public final int f47132a;
    public final Object f47133b;

    public jz(Object obj, int i7) {
        this.f47132a = i7;
        this.f47133b = obj;
    }

    @Override
    public final void run() {
        int i7;
        v50 v50Var;
        EGLDisplay eGLDisplay;
        EGLSurface eGLSurface;
        int i10 = this.f47132a;
        Object obj = this.f47133b;
        switch (i10) {
            case 0:
                a00 a00Var = (a00) obj;
                org.telegram.messenger.g0.r(a00Var.f43528n0);
                a00Var.f43510a.a(false, true);
                return;
            case 1:
                a00 a00Var2 = ((pz) obj).f48834a;
                a00Var2.h(a00Var2.E, a00Var2.F, a00Var2.H, a00Var2.G, a00Var2.D, a00Var2.J, a00Var2.f43536x, false);
                return;
            case 2:
                ((FiltersSetupActivity) ((bt) obj).f44130f3).getMessagesController().i3();
                return;
            case 3:
                c00 c00Var = (c00) obj;
                c00Var.f44178s.a();
                c00Var.f44176n.invalidate();
                c00Var.H.g0(true);
                return;
            case 4:
                FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) ((org.telegram.ui.Components.ez) obj).f33523f;
                if (!org.telegram.messenger.p10.i(org.telegram.messenger.p10.f24470s0).q()) {
                    ArrayList T0 = filtersSetupActivity.getMessagesController().T0();
                    int i11 = 0;
                    while (true) {
                        if (i11 < T0.size()) {
                            if (((org.telegram.messenger.vo) T0.get(i11)).e() && i11 != 0) {
                                FiltersSetupActivity filtersSetupActivity2 = filtersSetupActivity.f41244b.f45835e;
                                ArrayList arrayList = filtersSetupActivity2.getMessagesController().P0;
                                if (i11 < 0 || i11 >= arrayList.size()) {
                                    i7 = 1;
                                } else {
                                    arrayList.add(0, (org.telegram.messenger.vo) arrayList.remove(i11));
                                    for (int i12 = 0; i12 <= i11; i12++) {
                                        ((org.telegram.messenger.vo) arrayList.get(i12)).f26074f = i12;
                                    }
                                    i7 = 1;
                                    filtersSetupActivity2.f41246e = true;
                                    filtersSetupActivity2.g0(true);
                                }
                                filtersSetupActivity.f41243a.v0(0);
                                try {
                                    filtersSetupActivity.fragmentView.performHapticFeedback(3, i7);
                                } catch (Exception unused) {
                                }
                                org.telegram.ui.Components.hc a02 = org.telegram.ui.Components.hc.a0(filtersSetupActivity);
                                Object[] objArr = new Object[i7];
                                objArr[0] = org.telegram.messenger.id.M0(2131750807, null);
                                a02.J(2131624017, org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("LimitReachedReorderFolder", null, 2131748944, objArr)), org.telegram.messenger.id.M0(2131747033, null), 5000, false, new b00(filtersSetupActivity, 2)).j();
                            } else {
                                i11++;
                            }
                        }
                    }
                }
                filtersSetupActivity.f0(null);
                return;
            case 5:
                e40 e40Var = ((q10) obj).f48865b;
                e40Var.f45190a4 = null;
                e40Var.P1(e40Var.f45284w3, true);
                return;
            case 6:
                ((k30) obj).requestLayout();
                return;
            case 7:
                n30 n30Var = (n30) obj;
                e40 e40Var2 = n30Var.f48073f;
                d20 d20Var = e40Var2.f45219i1;
                org.telegram.messenger.hc hcVar = n30Var.d;
                if (hcVar != null) {
                    d20Var.K0 = hcVar;
                    d20Var.f38409q1 = null;
                    d20Var.f38410r1 = null;
                    n30Var.d = null;
                }
                TLRPC.Chat M0 = org.telegram.messenger.qp.s1(e40Var2.f45228k1.f21765a).M0(Long.valueOf(-n30Var.f48072e));
                org.telegram.messenger.hc a10 = org.telegram.messenger.hc.a(0, M0);
                org.telegram.messenger.hc a11 = org.telegram.messenger.hc.a(1, M0);
                if (org.telegram.messenger.hc.e(n30Var.f48070b) == null) {
                    a11 = org.telegram.messenger.hc.e(n30Var.f48071c);
                }
                d20Var.setCreateThumbFromParent(false);
                d20Var.H(null, a10, a11, true);
                n30Var.f48071c = null;
                n30Var.f48070b = null;
                org.telegram.messenger.g0.b4(e40Var2.H1);
                n30Var.a(1.0f);
                return;
            case 8:
                n00 n00Var = (n00) ((g.b) obj).f13269i;
                if (n00Var != null) {
                    n00Var.invalidate();
                    return;
                }
                return;
            case 9:
                f50 f50Var = (f50) obj;
                f50Var.D = null;
                f50Var.E = null;
                f50Var.F = null;
                f50Var.G = null;
                f50Var.I = null;
                f50Var.H = null;
                f50Var.J = 0.0d;
                f50Var.e0(false, true);
                f50Var.d.j(null, null, f50Var.f45590r, null);
                f50Var.f45588f.setAnimation(f50Var.R);
                f50Var.R.M(0);
                return;
            case 10:
                org.telegram.messenger.k5.o(null, 2131749378, org.telegram.ui.Components.hc.a0(((i50) obj).f46471c), 2131623999, 36);
                return;
            case 11:
                w50 w50Var = (w50) obj;
                v50 v50Var2 = w50Var.I;
                int i13 = org.telegram.ui.ActionBar.l6.f27865d6;
                int x02 = org.telegram.ui.ActionBar.l6.x0(null, i13, false);
                int i14 = v50.D;
                v50Var2.a(2131231535, 17, x02, true);
                w50Var.I.c();
                v50 v50Var3 = w50Var.I;
                v50Var3.b(v50Var3.f50577w, 23, true);
                w50Var.I.d();
                Intro.a(org.telegram.ui.ActionBar.l6.x0(null, i13, false));
                return;
            case 12:
                u50 u50Var = (u50) obj;
                u50Var.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                w50 w50Var2 = (w50) u50Var.f50293b;
                Intro.setPage(w50Var2.H);
                Intro.setDate(((float) (currentTimeMillis - w50Var2.J)) / 1000.0f);
                Intro.onDrawFrame(0);
                v50 v50Var4 = w50Var2.I;
                if (v50Var4 != null && v50Var4.isAlive() && (eGLDisplay = (v50Var = w50Var2.I).f50571c) != null && (eGLSurface = v50Var.f50573f) != null) {
                    try {
                        v50Var.f50570b.eglSwapBuffers(eGLDisplay, eGLSurface);
                        return;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                return;
            case 13:
                w50 w50Var3 = (w50) ((org.telegram.messenger.ps) obj).f24621c;
                w50Var3.presentFragment(new ee0(), true);
                w50Var3.M = true;
                return;
            case 14:
                ((v50) obj).finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 15:
                a60 a60Var = (a60) obj;
                a60Var.f43597f.f43911e.smoothScrollTo(0, a60Var.getHeight());
                return;
            case 16:
                ((vf.b) obj).b();
                return;
            case 17:
                ((m80) obj).f47792a.A0.setVisibility(8);
                return;
            case 18:
                x80 x80Var = (x80) obj;
                LaunchActivity launchActivity = x80Var.f51593c;
                launchActivity.N0 = false;
                boolean z9 = launchActivity.M0;
                launchActivity.E();
                if (z9 != launchActivity.M0) {
                    x80Var.requestLayout();
                    return;
                }
                return;
            case 19:
                p90 p90Var = (p90) obj;
                ai.l1 l1Var = p90Var.d;
                if (l1Var != null) {
                    p90Var.i0(l1Var.getCurrentLink());
                    return;
                }
                return;
            case 20:
                try {
                    org.telegram.ui.Components.qj0 currentListView = ((ra0) ((qa0) obj).f48995i0).L0.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().f();
                        return;
                    }
                    return;
                } catch (Throwable unused3) {
                    return;
                }
            case 21:
                EditTextBoldCursor[] editTextBoldCursorArr = ((wb0) obj).f51015b;
                if (editTextBoldCursorArr != null) {
                    editTextBoldCursorArr[0].requestFocus();
                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    org.telegram.messenger.g0.K3(editTextBoldCursorArr[0]);
                    return;
                }
                return;
            case 22:
                zb0 zb0Var = (zb0) obj;
                org.telegram.ui.Components.dh0 dh0Var = zb0Var.f52487e;
                EditTextBoldCursor editTextBoldCursor2 = zb0Var.f52484a;
                if (editTextBoldCursor2 != null) {
                    editTextBoldCursor2.requestFocus();
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                    ee0.b1(zb0Var.D, editTextBoldCursor2);
                    dh0Var.getAnimatedDrawable().N(0, false, false);
                    dh0Var.d();
                    return;
                }
                return;
            case 23:
                ((org.telegram.ui.Components.dh0) obj).d();
                return;
            case 24:
                ((gc0) ((ah.i) obj).H1).getClass();
                return;
            case 25:
                double currentTimeMillis2 = System.currentTimeMillis();
                gc0 gc0Var = (gc0) ((fi.h2) obj).f12127b;
                double d = gc0Var.Q;
                gd0 gd0Var = gc0Var.f45971w;
                gc0Var.Q = currentTimeMillis2;
                int i15 = (int) (gc0Var.P - (currentTimeMillis2 - d));
                gc0Var.P = i15;
                if (i15 >= 1000) {
                    int i16 = i15 / 1000;
                    int i17 = i16 / 60;
                    int i18 = i16 - (i17 * 60);
                    gd0Var.setTextSize(1, 13.0f);
                    int i19 = gc0Var.E;
                    if (i19 != 4 && i19 != 3 && i19 != 11) {
                        if (i19 == 2) {
                            gd0Var.setText(org.telegram.messenger.id.a0(null, null, 2131745296, Integer.valueOf(i17), Integer.valueOf(i18)));
                            return;
                        }
                        return;
                    }
                    gd0Var.setText(org.telegram.messenger.id.a0(null, null, 2131752629, Integer.valueOf(i17), Integer.valueOf(i18)));
                    return;
                }
                gc0Var.q();
                int i20 = gc0Var.E;
                if (i20 == 3 || i20 == 4 || i20 == 2 || i20 == 11) {
                    gd0Var.setTextSize(1, 15.0f);
                    int i21 = gc0Var.E;
                    if (i21 == 4) {
                        gd0Var.setText(org.telegram.messenger.id.M0(2131746177, null));
                    } else if (i21 == 15) {
                        gd0Var.setText(org.telegram.messenger.id.M0(2131751447, null));
                    } else if (i21 != 11 && i21 != 3) {
                        gd0Var.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.id.M0(2131746178, null), true, 0.0f, 0.0f));
                    } else {
                        gd0Var.setText(org.telegram.messenger.id.M0(2131746176, null));
                    }
                    int i22 = org.telegram.ui.ActionBar.l6.P9;
                    org.telegram.ui.ActionBar.s6.U(gd0Var, i22, null);
                    gd0Var.setTag(2131296386, Integer.valueOf(i22));
                    return;
                }
                return;
            case 26:
                double currentTimeMillis3 = System.currentTimeMillis();
                id0 id0Var = ((hd0) obj).f46297b;
                double d2 = currentTimeMillis3 - id0Var.f46628d0;
                id0Var.f46628d0 = currentTimeMillis3;
                int i23 = (int) (id0Var.f46625b0 - d2);
                id0Var.f46625b0 = i23;
                if (i23 <= 1000) {
                    id0.o(id0Var);
                    id0Var.f46650w.setVisibility(8);
                    gd0 gd0Var2 = id0Var.f46652y;
                    if (gd0Var2 != null) {
                        gd0Var2.setVisibility(0);
                    }
                    id0Var.t();
                    return;
                }
                return;
            case 27:
                double currentTimeMillis4 = System.currentTimeMillis();
                id0 id0Var2 = ((hd0) obj).f46297b;
                double d10 = id0Var2.f46627c0;
                gd0 gd0Var3 = id0Var2.f46650w;
                id0Var2.f46627c0 = currentTimeMillis4;
                int i24 = (int) (id0Var2.f46623a0 - (currentTimeMillis4 - d10));
                id0Var2.f46623a0 = i24;
                if (i24 >= 1000) {
                    int i25 = i24 / 1000;
                    int i26 = i25 / 60;
                    int i27 = i25 - (i26 * 60);
                    int i28 = id0Var2.f46635i0;
                    if (i28 != 4 && i28 != 3 && i28 != 11) {
                        if (id0Var2.f46634h0 == 2 && (i28 == 2 || i28 == 17 || i28 == 16)) {
                            gd0Var3.setText(org.telegram.messenger.id.a0("ResendSmsAvailableIn", null, 2131746119, Integer.valueOf(i26), Integer.valueOf(i27)));
                            return;
                        } else if (i28 == 2 || i28 == 17 || i28 == 16) {
                            gd0Var3.setText(org.telegram.messenger.id.a0("SmsAvailableIn", null, 2131745297, Integer.valueOf(i26), Integer.valueOf(i27)));
                            return;
                        } else {
                            return;
                        }
                    }
                    gd0Var3.setText(org.telegram.messenger.id.a0("CallAvailableIn", null, 2131752630, Integer.valueOf(i26), Integer.valueOf(i27)));
                    return;
                }
                id0Var2.u();
                int i29 = id0Var2.f46635i0;
                if (i29 == 3 || i29 == 4 || i29 == 2 || i29 == 17 || i29 == 16 || i29 == 11) {
                    if (i29 == 4) {
                        gd0Var3.setText(org.telegram.messenger.id.M0(2131746177, "RequestCallButton"));
                    } else if (i29 != 11 && i29 != 3) {
                        gd0Var3.setText(org.telegram.messenger.id.M0(2131746175, "RequestSmsButton"));
                    } else {
                        gd0Var3.setText(org.telegram.messenger.id.M0(2131746176, null));
                    }
                    int i30 = org.telegram.ui.ActionBar.l6.P9;
                    org.telegram.ui.ActionBar.s6.U(gd0Var3, i30, null);
                    gd0Var3.setTag(2131296386, Integer.valueOf(i30));
                    return;
                }
                return;
            case 28:
                ((org.telegram.ui.Components.ln0) obj).run();
                return;
            default:
                ne0.j((ne0) obj);
                return;
        }
    }
}
