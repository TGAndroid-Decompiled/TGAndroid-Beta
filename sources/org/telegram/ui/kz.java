package org.telegram.ui;

import android.os.Looper;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.telegram.messenger.Intro;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class kz implements Runnable {
    public final int f47466a;
    public final Object f47467b;

    public kz(Object obj, int i7) {
        this.f47466a = i7;
        this.f47467b = obj;
    }

    @Override
    public final void run() {
        int i7;
        w50 w50Var;
        EGLDisplay eGLDisplay;
        EGLSurface eGLSurface;
        int i10 = this.f47466a;
        Object obj = this.f47467b;
        switch (i10) {
            case 0:
                b00 b00Var = (b00) obj;
                org.telegram.messenger.g0.r(b00Var.f43878n0);
                b00Var.f43860a.a(false, true);
                return;
            case 1:
                b00 b00Var2 = ((qz) obj).f49179a;
                b00Var2.h(b00Var2.E, b00Var2.F, b00Var2.H, b00Var2.G, b00Var2.D, b00Var2.J, b00Var2.f43886x, false);
                return;
            case 2:
                ((FiltersSetupActivity) ((ct) obj).f44802f3).getMessagesController().i3();
                return;
            case 3:
                d00 d00Var = (d00) obj;
                d00Var.f44860s.a();
                d00Var.f44858n.invalidate();
                d00Var.H.g0(true);
                return;
            case 4:
                FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) ((org.telegram.ui.Components.dz) obj).f33103f;
                if (!org.telegram.messenger.p10.i(org.telegram.messenger.p10.f24474s0).q()) {
                    ArrayList T0 = filtersSetupActivity.getMessagesController().T0();
                    int i11 = 0;
                    while (true) {
                        if (i11 < T0.size()) {
                            if (((org.telegram.messenger.vo) T0.get(i11)).e() && i11 != 0) {
                                FiltersSetupActivity filtersSetupActivity2 = filtersSetupActivity.f41235b.f46189e;
                                ArrayList arrayList = filtersSetupActivity2.getMessagesController().P0;
                                if (i11 < 0 || i11 >= arrayList.size()) {
                                    i7 = 1;
                                } else {
                                    arrayList.add(0, (org.telegram.messenger.vo) arrayList.remove(i11));
                                    for (int i12 = 0; i12 <= i11; i12++) {
                                        ((org.telegram.messenger.vo) arrayList.get(i12)).f26078f = i12;
                                    }
                                    i7 = 1;
                                    filtersSetupActivity2.f41237e = true;
                                    filtersSetupActivity2.g0(true);
                                }
                                filtersSetupActivity.f41234a.v0(0);
                                try {
                                    filtersSetupActivity.fragmentView.performHapticFeedback(3, i7);
                                } catch (Exception unused) {
                                }
                                org.telegram.ui.Components.gc a02 = org.telegram.ui.Components.gc.a0(filtersSetupActivity);
                                Object[] objArr = new Object[i7];
                                objArr[0] = org.telegram.messenger.id.M0(2131750807, null);
                                a02.J(2131624017, org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("LimitReachedReorderFolder", null, 2131748944, objArr)), org.telegram.messenger.id.M0(2131747033, null), 5000, false, new c00(filtersSetupActivity, 2)).j();
                            } else {
                                i11++;
                            }
                        }
                    }
                }
                filtersSetupActivity.f0(null);
                return;
            case 5:
                f40 f40Var = ((s10) obj).f49618b;
                f40Var.f45517d4 = null;
                f40Var.P1(f40Var.f45612z3, true);
                return;
            case 6:
                ((l30) obj).requestLayout();
                return;
            case 7:
                o30 o30Var = (o30) obj;
                f40 f40Var2 = o30Var.f48407f;
                e20 e20Var = f40Var2.l1;
                org.telegram.messenger.hc hcVar = o30Var.d;
                if (hcVar != null) {
                    e20Var.K0 = hcVar;
                    e20Var.f37983q1 = null;
                    e20Var.f37984r1 = null;
                    o30Var.d = null;
                }
                TLRPC.Chat M0 = org.telegram.messenger.qp.s1(f40Var2.n1.f21770a).M0(Long.valueOf(-o30Var.f48406e));
                org.telegram.messenger.hc a10 = org.telegram.messenger.hc.a(0, M0);
                org.telegram.messenger.hc a11 = org.telegram.messenger.hc.a(1, M0);
                if (org.telegram.messenger.hc.e(o30Var.f48404b) == null) {
                    a11 = org.telegram.messenger.hc.e(o30Var.f48405c);
                }
                e20Var.setCreateThumbFromParent(false);
                e20Var.H(null, a10, a11, true);
                o30Var.f48405c = null;
                o30Var.f48404b = null;
                org.telegram.messenger.g0.b4(f40Var2.K1);
                o30Var.a(1.0f);
                return;
            case 8:
                o00 o00Var = (o00) ((g.b) obj).f13271i;
                if (o00Var != null) {
                    o00Var.invalidate();
                    return;
                }
                return;
            case 9:
                g50 g50Var = (g50) obj;
                g50Var.D = null;
                g50Var.E = null;
                g50Var.F = null;
                g50Var.G = null;
                g50Var.I = null;
                g50Var.H = null;
                g50Var.J = 0.0d;
                g50Var.e0(false, true);
                g50Var.d.j(null, null, g50Var.f45984r, null);
                g50Var.f45982f.setAnimation(g50Var.R);
                g50Var.R.M(0);
                return;
            case 10:
                org.telegram.messenger.k5.o(null, 2131749378, org.telegram.ui.Components.gc.a0(((j50) obj).f46824c), 2131623999, 36);
                return;
            case 11:
                x50 x50Var = (x50) obj;
                w50 w50Var2 = x50Var.I;
                int i13 = org.telegram.ui.ActionBar.m6.f27890d6;
                int x02 = org.telegram.ui.ActionBar.m6.x0(null, i13, false);
                int i14 = w50.D;
                w50Var2.a(2131231535, 17, x02, true);
                x50Var.I.c();
                w50 w50Var3 = x50Var.I;
                w50Var3.b(w50Var3.f50916w, 23, true);
                x50Var.I.d();
                Intro.a(org.telegram.ui.ActionBar.m6.x0(null, i13, false));
                return;
            case 12:
                v50 v50Var = (v50) obj;
                v50Var.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                x50 x50Var2 = (x50) v50Var.f50634b;
                Intro.setPage(x50Var2.H);
                Intro.setDate(((float) (currentTimeMillis - x50Var2.J)) / 1000.0f);
                Intro.onDrawFrame(0);
                w50 w50Var4 = x50Var2.I;
                if (w50Var4 != null && w50Var4.isAlive() && (eGLDisplay = (w50Var = x50Var2.I).f50910c) != null && (eGLSurface = w50Var.f50912f) != null) {
                    try {
                        w50Var.f50909b.eglSwapBuffers(eGLDisplay, eGLSurface);
                        return;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                return;
            case 13:
                x50 x50Var3 = (x50) ((org.telegram.messenger.ps) obj).f24625c;
                x50Var3.presentFragment(new fe0(), true);
                x50Var3.M = true;
                return;
            case 14:
                ((w50) obj).finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 15:
                b60 b60Var = (b60) obj;
                b60Var.f43938f.f44255e.smoothScrollTo(0, b60Var.getHeight());
                return;
            case 16:
                ((vf.b) obj).b();
                return;
            case 17:
                ((n80) obj).f48158a.A0.setVisibility(8);
                return;
            case 18:
                y80 y80Var = (y80) obj;
                LaunchActivity launchActivity = y80Var.f51963c;
                launchActivity.N0 = false;
                boolean z9 = launchActivity.M0;
                launchActivity.E();
                if (z9 != launchActivity.M0) {
                    y80Var.requestLayout();
                    return;
                }
                return;
            case 19:
                q90 q90Var = (q90) obj;
                ai.l1 l1Var = q90Var.d;
                if (l1Var != null) {
                    q90Var.i0(l1Var.getCurrentLink());
                    return;
                }
                return;
            case 20:
                try {
                    org.telegram.ui.Components.pj0 currentListView = ((sa0) ((ra0) obj).f49327i0).L0.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().f();
                        return;
                    }
                    return;
                } catch (Throwable unused3) {
                    return;
                }
            case 21:
                EditTextBoldCursor[] editTextBoldCursorArr = ((xb0) obj).f51671b;
                if (editTextBoldCursorArr != null) {
                    editTextBoldCursorArr[0].requestFocus();
                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    org.telegram.messenger.g0.K3(editTextBoldCursorArr[0]);
                    return;
                }
                return;
            case 22:
                ac0 ac0Var = (ac0) obj;
                org.telegram.ui.Components.ch0 ch0Var = ac0Var.f43637e;
                EditTextBoldCursor editTextBoldCursor2 = ac0Var.f43634a;
                if (editTextBoldCursor2 != null) {
                    editTextBoldCursor2.requestFocus();
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                    fe0.b1(ac0Var.D, editTextBoldCursor2);
                    ch0Var.getAnimatedDrawable().N(0, false, false);
                    ch0Var.d();
                    return;
                }
                return;
            case 23:
                ((org.telegram.ui.Components.ch0) obj).d();
                return;
            case 24:
                ((hc0) ((ah.i) obj).H1).getClass();
                return;
            case 25:
                double currentTimeMillis2 = System.currentTimeMillis();
                hc0 hc0Var = (hc0) ((fi.h2) obj).f12131b;
                double d = hc0Var.Q;
                hd0 hd0Var = hc0Var.f46315w;
                hc0Var.Q = currentTimeMillis2;
                int i15 = (int) (hc0Var.P - (currentTimeMillis2 - d));
                hc0Var.P = i15;
                if (i15 >= 1000) {
                    int i16 = i15 / 1000;
                    int i17 = i16 / 60;
                    int i18 = i16 - (i17 * 60);
                    hd0Var.setTextSize(1, 13.0f);
                    int i19 = hc0Var.E;
                    if (i19 != 4 && i19 != 3 && i19 != 11) {
                        if (i19 == 2) {
                            hd0Var.setText(org.telegram.messenger.id.a0(null, null, 2131745296, Integer.valueOf(i17), Integer.valueOf(i18)));
                            return;
                        }
                        return;
                    }
                    hd0Var.setText(org.telegram.messenger.id.a0(null, null, 2131752629, Integer.valueOf(i17), Integer.valueOf(i18)));
                    return;
                }
                hc0Var.q();
                int i20 = hc0Var.E;
                if (i20 == 3 || i20 == 4 || i20 == 2 || i20 == 11) {
                    hd0Var.setTextSize(1, 15.0f);
                    int i21 = hc0Var.E;
                    if (i21 == 4) {
                        hd0Var.setText(org.telegram.messenger.id.M0(2131746177, null));
                    } else if (i21 == 15) {
                        hd0Var.setText(org.telegram.messenger.id.M0(2131751447, null));
                    } else if (i21 != 11 && i21 != 3) {
                        hd0Var.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.id.M0(2131746178, null), true, 0.0f, 0.0f));
                    } else {
                        hd0Var.setText(org.telegram.messenger.id.M0(2131746176, null));
                    }
                    int i22 = org.telegram.ui.ActionBar.m6.P9;
                    org.telegram.ui.ActionBar.t6.U(hd0Var, i22, null);
                    hd0Var.setTag(2131296386, Integer.valueOf(i22));
                    return;
                }
                return;
            case 26:
                double currentTimeMillis3 = System.currentTimeMillis();
                jd0 jd0Var = ((id0) obj).f46622b;
                double d2 = currentTimeMillis3 - jd0Var.f46964d0;
                jd0Var.f46964d0 = currentTimeMillis3;
                int i23 = (int) (jd0Var.f46961b0 - d2);
                jd0Var.f46961b0 = i23;
                if (i23 <= 1000) {
                    jd0.o(jd0Var);
                    jd0Var.f46986w.setVisibility(8);
                    hd0 hd0Var2 = jd0Var.f46988y;
                    if (hd0Var2 != null) {
                        hd0Var2.setVisibility(0);
                    }
                    jd0Var.t();
                    return;
                }
                return;
            case 27:
                double currentTimeMillis4 = System.currentTimeMillis();
                jd0 jd0Var2 = ((id0) obj).f46622b;
                double d10 = jd0Var2.f46963c0;
                hd0 hd0Var3 = jd0Var2.f46986w;
                jd0Var2.f46963c0 = currentTimeMillis4;
                int i24 = (int) (jd0Var2.f46959a0 - (currentTimeMillis4 - d10));
                jd0Var2.f46959a0 = i24;
                if (i24 >= 1000) {
                    int i25 = i24 / 1000;
                    int i26 = i25 / 60;
                    int i27 = i25 - (i26 * 60);
                    int i28 = jd0Var2.f46971i0;
                    if (i28 != 4 && i28 != 3 && i28 != 11) {
                        if (jd0Var2.f46970h0 == 2 && (i28 == 2 || i28 == 17 || i28 == 16)) {
                            hd0Var3.setText(org.telegram.messenger.id.a0("ResendSmsAvailableIn", null, 2131746119, Integer.valueOf(i26), Integer.valueOf(i27)));
                            return;
                        } else if (i28 == 2 || i28 == 17 || i28 == 16) {
                            hd0Var3.setText(org.telegram.messenger.id.a0("SmsAvailableIn", null, 2131745297, Integer.valueOf(i26), Integer.valueOf(i27)));
                            return;
                        } else {
                            return;
                        }
                    }
                    hd0Var3.setText(org.telegram.messenger.id.a0("CallAvailableIn", null, 2131752630, Integer.valueOf(i26), Integer.valueOf(i27)));
                    return;
                }
                jd0Var2.u();
                int i29 = jd0Var2.f46971i0;
                if (i29 == 3 || i29 == 4 || i29 == 2 || i29 == 17 || i29 == 16 || i29 == 11) {
                    if (i29 == 4) {
                        hd0Var3.setText(org.telegram.messenger.id.M0(2131746177, "RequestCallButton"));
                    } else if (i29 != 11 && i29 != 3) {
                        hd0Var3.setText(org.telegram.messenger.id.M0(2131746175, "RequestSmsButton"));
                    } else {
                        hd0Var3.setText(org.telegram.messenger.id.M0(2131746176, null));
                    }
                    int i30 = org.telegram.ui.ActionBar.m6.P9;
                    org.telegram.ui.ActionBar.t6.U(hd0Var3, i30, null);
                    hd0Var3.setTag(2131296386, Integer.valueOf(i30));
                    return;
                }
                return;
            case 28:
                ((org.telegram.ui.Components.kn0) obj).run();
                return;
            default:
                oe0.j((oe0) obj);
                return;
        }
    }
}
