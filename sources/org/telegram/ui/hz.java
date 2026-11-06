package org.telegram.ui;

import android.os.Looper;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.telegram.messenger.Intro;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class hz implements Runnable {
    public final int f46530a;
    public final Object f46531b;

    public hz(Object obj, int i7) {
        this.f46530a = i7;
        this.f46531b = obj;
    }

    @Override
    public final void run() {
        int i7;
        t50 t50Var;
        EGLDisplay eGLDisplay;
        EGLSurface eGLSurface;
        int i10 = this.f46530a;
        Object obj = this.f46531b;
        switch (i10) {
            case 0:
                yz yzVar = (yz) obj;
                org.telegram.messenger.g0.r(yzVar.f52398n0);
                yzVar.f52380a.a(false, true);
                return;
            case 1:
                yz yzVar2 = ((nz) obj).f48178a;
                yzVar2.h(yzVar2.E, yzVar2.F, yzVar2.H, yzVar2.G, yzVar2.D, yzVar2.J, yzVar2.f52406x, false);
                return;
            case 2:
                ((FiltersSetupActivity) ((zs) obj).f52669f3).getMessagesController().i3();
                return;
            case 3:
                a00 a00Var = (a00) obj;
                a00Var.f43510s.a();
                a00Var.f43508n.invalidate();
                a00Var.H.g0(true);
                return;
            case 4:
                FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) ((org.telegram.ui.Components.dz) obj).f33072f;
                if (!org.telegram.messenger.p10.i(org.telegram.messenger.p10.f24459s0).q()) {
                    ArrayList T0 = filtersSetupActivity.getMessagesController().T0();
                    int i11 = 0;
                    while (true) {
                        if (i11 < T0.size()) {
                            if (((org.telegram.messenger.vo) T0.get(i11)).e() && i11 != 0) {
                                FiltersSetupActivity filtersSetupActivity2 = filtersSetupActivity.f41234b.f45171e;
                                ArrayList arrayList = filtersSetupActivity2.getMessagesController().P0;
                                if (i11 < 0 || i11 >= arrayList.size()) {
                                    i7 = 1;
                                } else {
                                    arrayList.add(0, (org.telegram.messenger.vo) arrayList.remove(i11));
                                    for (int i12 = 0; i12 <= i11; i12++) {
                                        ((org.telegram.messenger.vo) arrayList.get(i12)).f26060f = i12;
                                    }
                                    i7 = 1;
                                    filtersSetupActivity2.f41236e = true;
                                    filtersSetupActivity2.g0(true);
                                }
                                filtersSetupActivity.f41233a.v0(0);
                                try {
                                    filtersSetupActivity.fragmentView.performHapticFeedback(3, i7);
                                } catch (Exception unused) {
                                }
                                org.telegram.ui.Components.hc a02 = org.telegram.ui.Components.hc.a0(filtersSetupActivity);
                                Object[] objArr = new Object[i7];
                                objArr[0] = org.telegram.messenger.hd.M0(2131750808, null);
                                a02.J(2131624017, org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("LimitReachedReorderFolder", null, 2131748943, objArr)), org.telegram.messenger.hd.M0(2131747032, null), 5000, false, new zz(filtersSetupActivity, 2)).j();
                            } else {
                                i11++;
                            }
                        }
                    }
                }
                filtersSetupActivity.f0(null);
                return;
            case 5:
                c40 c40Var = ((o10) obj).f48209b;
                c40Var.f44548a4 = null;
                c40Var.P1(c40Var.f44642w3, true);
                return;
            case 6:
                ((i30) obj).requestLayout();
                return;
            case 7:
                l30 l30Var = (l30) obj;
                c40 c40Var2 = l30Var.f47400f;
                b20 b20Var = c40Var2.f44577i1;
                org.telegram.messenger.hc hcVar = l30Var.d;
                if (hcVar != null) {
                    b20Var.K0 = hcVar;
                    b20Var.f38042q1 = null;
                    b20Var.f38043r1 = null;
                    l30Var.d = null;
                }
                TLRPC.Chat M0 = org.telegram.messenger.qp.s1(c40Var2.f44586k1.f21723a).M0(Long.valueOf(-l30Var.f47399e));
                org.telegram.messenger.hc a10 = org.telegram.messenger.hc.a(0, M0);
                org.telegram.messenger.hc a11 = org.telegram.messenger.hc.a(1, M0);
                if (org.telegram.messenger.hc.e(l30Var.f47397b) == null) {
                    a11 = org.telegram.messenger.hc.e(l30Var.f47398c);
                }
                b20Var.setCreateThumbFromParent(false);
                b20Var.H(null, a10, a11, true);
                l30Var.f47398c = null;
                l30Var.f47397b = null;
                org.telegram.messenger.g0.b4(c40Var2.H1);
                l30Var.a(1.0f);
                return;
            case 8:
                l00 l00Var = (l00) ((g.b) obj).f13269i;
                if (l00Var != null) {
                    l00Var.invalidate();
                    return;
                }
                return;
            case 9:
                d50 d50Var = (d50) obj;
                d50Var.D = null;
                d50Var.E = null;
                d50Var.F = null;
                d50Var.G = null;
                d50Var.I = null;
                d50Var.H = null;
                d50Var.J = 0.0d;
                d50Var.e0(false, true);
                d50Var.d.j(null, null, d50Var.f44953r, null);
                d50Var.f44951f.setAnimation(d50Var.R);
                d50Var.R.M(0);
                return;
            case 10:
                org.telegram.messenger.k5.o(null, 2131749377, org.telegram.ui.Components.hc.a0(((g50) obj).f45866c), 2131623999, 36);
                return;
            case 11:
                u50 u50Var = (u50) obj;
                t50 t50Var2 = u50Var.I;
                int i13 = org.telegram.ui.ActionBar.k6.f27848d6;
                int x02 = org.telegram.ui.ActionBar.k6.x0(null, i13, false);
                int i14 = t50.D;
                t50Var2.a(2131231535, 17, x02, true);
                u50Var.I.c();
                t50 t50Var3 = u50Var.I;
                t50Var3.b(t50Var3.f49947w, 23, true);
                u50Var.I.d();
                Intro.a(org.telegram.ui.ActionBar.k6.x0(null, i13, false));
                return;
            case 12:
                s50 s50Var = (s50) obj;
                s50Var.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                u50 u50Var2 = (u50) s50Var.f49657b;
                Intro.setPage(u50Var2.H);
                Intro.setDate(((float) (currentTimeMillis - u50Var2.J)) / 1000.0f);
                Intro.onDrawFrame(0);
                t50 t50Var4 = u50Var2.I;
                if (t50Var4 != null && t50Var4.isAlive() && (eGLDisplay = (t50Var = u50Var2.I).f49941c) != null && (eGLSurface = t50Var.f49943f) != null) {
                    try {
                        t50Var.f49940b.eglSwapBuffers(eGLDisplay, eGLSurface);
                        return;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                return;
            case 13:
                u50 u50Var3 = (u50) ((org.telegram.messenger.ps) obj).f24605c;
                u50Var3.presentFragment(new ce0(), true);
                u50Var3.M = true;
                return;
            case 14:
                ((t50) obj).finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 15:
                y50 y50Var = (y50) obj;
                y50Var.f52097f.f52480e.smoothScrollTo(0, y50Var.getHeight());
                return;
            case 16:
                ((vf.b) obj).b();
                return;
            case 17:
                ((k80) obj).f47140a.A0.setVisibility(8);
                return;
            case 18:
                v80 v80Var = (v80) obj;
                LaunchActivity launchActivity = v80Var.f50612c;
                launchActivity.N0 = false;
                boolean z9 = launchActivity.M0;
                launchActivity.E();
                if (z9 != launchActivity.M0) {
                    v80Var.requestLayout();
                    return;
                }
                return;
            case 19:
                n90 n90Var = (n90) obj;
                ai.l1 l1Var = n90Var.d;
                if (l1Var != null) {
                    n90Var.i0(l1Var.getCurrentLink());
                    return;
                }
                return;
            case 20:
                try {
                    org.telegram.ui.Components.pj0 currentListView = ((pa0) ((oa0) obj).f48346i0).L0.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().f();
                        return;
                    }
                    return;
                } catch (Throwable unused3) {
                    return;
                }
            case 21:
                EditTextBoldCursor[] editTextBoldCursorArr = ((ub0) obj).f50378b;
                if (editTextBoldCursorArr != null) {
                    editTextBoldCursorArr[0].requestFocus();
                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    org.telegram.messenger.g0.K3(editTextBoldCursorArr[0]);
                    return;
                }
                return;
            case 22:
                xb0 xb0Var = (xb0) obj;
                org.telegram.ui.Components.ch0 ch0Var = xb0Var.f51821e;
                EditTextBoldCursor editTextBoldCursor2 = xb0Var.f51818a;
                if (editTextBoldCursor2 != null) {
                    editTextBoldCursor2.requestFocus();
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                    ce0.b1(xb0Var.D, editTextBoldCursor2);
                    ch0Var.getAnimatedDrawable().N(0, false, false);
                    ch0Var.d();
                    return;
                }
                return;
            case 23:
                ((org.telegram.ui.Components.ch0) obj).d();
                return;
            case 24:
                ((ec0) ((ah.i) obj).H1).getClass();
                return;
            case 25:
                double currentTimeMillis2 = System.currentTimeMillis();
                ec0 ec0Var = (ec0) ((fi.h2) obj).f12127b;
                double d = ec0Var.Q;
                ed0 ed0Var = ec0Var.f45269w;
                ec0Var.Q = currentTimeMillis2;
                int i15 = (int) (ec0Var.P - (currentTimeMillis2 - d));
                ec0Var.P = i15;
                if (i15 >= 1000) {
                    int i16 = i15 / 1000;
                    int i17 = i16 / 60;
                    int i18 = i16 - (i17 * 60);
                    ed0Var.setTextSize(1, 13.0f);
                    int i19 = ec0Var.E;
                    if (i19 != 4 && i19 != 3 && i19 != 11) {
                        if (i19 == 2) {
                            ed0Var.setText(org.telegram.messenger.hd.a0(null, null, 2131745297, Integer.valueOf(i17), Integer.valueOf(i18)));
                            return;
                        }
                        return;
                    }
                    ed0Var.setText(org.telegram.messenger.hd.a0(null, null, 2131752629, Integer.valueOf(i17), Integer.valueOf(i18)));
                    return;
                }
                ec0Var.q();
                int i20 = ec0Var.E;
                if (i20 == 3 || i20 == 4 || i20 == 2 || i20 == 11) {
                    ed0Var.setTextSize(1, 15.0f);
                    int i21 = ec0Var.E;
                    if (i21 == 4) {
                        ed0Var.setText(org.telegram.messenger.hd.M0(2131746178, null));
                    } else if (i21 == 15) {
                        ed0Var.setText(org.telegram.messenger.hd.M0(2131751448, null));
                    } else if (i21 != 11 && i21 != 3) {
                        ed0Var.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.hd.M0(2131746179, null), true, 0.0f, 0.0f));
                    } else {
                        ed0Var.setText(org.telegram.messenger.hd.M0(2131746177, null));
                    }
                    int i22 = org.telegram.ui.ActionBar.k6.P9;
                    org.telegram.ui.ActionBar.r6.V(ed0Var, i22, null);
                    ed0Var.setTag(2131296386, Integer.valueOf(i22));
                    return;
                }
                return;
            case 26:
                double currentTimeMillis3 = System.currentTimeMillis();
                gd0 gd0Var = ((fd0) obj).f45613b;
                double d2 = currentTimeMillis3 - gd0Var.f45960d0;
                gd0Var.f45960d0 = currentTimeMillis3;
                int i23 = (int) (gd0Var.f45957b0 - d2);
                gd0Var.f45957b0 = i23;
                if (i23 <= 1000) {
                    gd0.o(gd0Var);
                    gd0Var.f45982w.setVisibility(8);
                    ed0 ed0Var2 = gd0Var.f45984y;
                    if (ed0Var2 != null) {
                        ed0Var2.setVisibility(0);
                    }
                    gd0Var.t();
                    return;
                }
                return;
            case 27:
                double currentTimeMillis4 = System.currentTimeMillis();
                gd0 gd0Var2 = ((fd0) obj).f45613b;
                double d10 = gd0Var2.f45959c0;
                ed0 ed0Var3 = gd0Var2.f45982w;
                gd0Var2.f45959c0 = currentTimeMillis4;
                int i24 = (int) (gd0Var2.f45955a0 - (currentTimeMillis4 - d10));
                gd0Var2.f45955a0 = i24;
                if (i24 >= 1000) {
                    int i25 = i24 / 1000;
                    int i26 = i25 / 60;
                    int i27 = i25 - (i26 * 60);
                    int i28 = gd0Var2.f45967i0;
                    if (i28 != 4 && i28 != 3 && i28 != 11) {
                        if (gd0Var2.f45966h0 == 2 && (i28 == 2 || i28 == 17 || i28 == 16)) {
                            ed0Var3.setText(org.telegram.messenger.hd.a0("ResendSmsAvailableIn", null, 2131746120, Integer.valueOf(i26), Integer.valueOf(i27)));
                            return;
                        } else if (i28 == 2 || i28 == 17 || i28 == 16) {
                            ed0Var3.setText(org.telegram.messenger.hd.a0("SmsAvailableIn", null, 2131745298, Integer.valueOf(i26), Integer.valueOf(i27)));
                            return;
                        } else {
                            return;
                        }
                    }
                    ed0Var3.setText(org.telegram.messenger.hd.a0("CallAvailableIn", null, 2131752630, Integer.valueOf(i26), Integer.valueOf(i27)));
                    return;
                }
                gd0Var2.u();
                int i29 = gd0Var2.f45967i0;
                if (i29 == 3 || i29 == 4 || i29 == 2 || i29 == 17 || i29 == 16 || i29 == 11) {
                    if (i29 == 4) {
                        ed0Var3.setText(org.telegram.messenger.hd.M0(2131746178, "RequestCallButton"));
                    } else if (i29 != 11 && i29 != 3) {
                        ed0Var3.setText(org.telegram.messenger.hd.M0(2131746176, "RequestSmsButton"));
                    } else {
                        ed0Var3.setText(org.telegram.messenger.hd.M0(2131746177, null));
                    }
                    int i30 = org.telegram.ui.ActionBar.k6.P9;
                    org.telegram.ui.ActionBar.r6.V(ed0Var3, i30, null);
                    ed0Var3.setTag(2131296386, Integer.valueOf(i30));
                    return;
                }
                return;
            case 28:
                ((org.telegram.ui.Components.kn0) obj).run();
                return;
            default:
                le0.j((le0) obj);
                return;
        }
    }
}
