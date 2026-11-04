package org.telegram.ui;

import android.os.Looper;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.telegram.messenger.Intro;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class fz implements Runnable {
    public final int f45408a;
    public final Object f45409b;

    public fz(Object obj, int i3) {
        this.f45408a = i3;
        this.f45409b = obj;
    }

    @Override
    public final void run() {
        int i3;
        n50 n50Var;
        EGLDisplay eGLDisplay;
        EGLSurface eGLSurface;
        int i10 = this.f45408a;
        Object obj = this.f45409b;
        switch (i10) {
            case 0:
                wz wzVar = (wz) obj;
                org.telegram.messenger.g0.r(wzVar.f51655o0);
                wzVar.f51636a.a(false, true);
                return;
            case 1:
                wz wzVar2 = ((lz) obj).f47470a;
                wzVar2.h(wzVar2.F, wzVar2.G, wzVar2.I, wzVar2.H, wzVar2.E, wzVar2.K, wzVar2.f51663x, false);
                return;
            case 2:
                ((FiltersSetupActivity) ((xs) obj).f52092g3).getMessagesController().i3();
                return;
            case 3:
                yz yzVar = (yz) obj;
                yzVar.f52461s.a();
                yzVar.f52459n.invalidate();
                yzVar.I.g0(true);
                return;
            case 4:
                FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) ((org.telegram.ui.Components.az) obj).f32006f;
                if (!org.telegram.messenger.h10.i(org.telegram.messenger.h10.f22829t0).q()) {
                    ArrayList T0 = filtersSetupActivity.getMessagesController().T0();
                    int i11 = 0;
                    while (true) {
                        if (i11 < T0.size()) {
                            if (((org.telegram.messenger.mo) T0.get(i11)).e() && i11 != 0) {
                                FiltersSetupActivity filtersSetupActivity2 = filtersSetupActivity.f41266b.f44184e;
                                ArrayList arrayList = filtersSetupActivity2.getMessagesController().Q0;
                                if (i11 < 0 || i11 >= arrayList.size()) {
                                    i3 = 1;
                                } else {
                                    arrayList.add(0, (org.telegram.messenger.mo) arrayList.remove(i11));
                                    for (int i12 = 0; i12 <= i11; i12++) {
                                        ((org.telegram.messenger.mo) arrayList.get(i12)).f24241f = i12;
                                    }
                                    i3 = 1;
                                    filtersSetupActivity2.f41268e = true;
                                    filtersSetupActivity2.g0(true);
                                }
                                filtersSetupActivity.f41265a.v0(0);
                                try {
                                    filtersSetupActivity.fragmentView.performHapticFeedback(3, i3);
                                } catch (Exception unused) {
                                }
                                org.telegram.ui.Components.fc a02 = org.telegram.ui.Components.fc.a0(filtersSetupActivity);
                                Object[] objArr = new Object[i3];
                                objArr[0] = org.telegram.messenger.bd.M0(2131750808, null);
                                a02.J(2131624017, org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("LimitReachedReorderFolder", null, 2131748952, objArr)), org.telegram.messenger.bd.M0(2131747041, null), 5000, false, new xz(filtersSetupActivity, 2)).j();
                            } else {
                                i11++;
                            }
                        }
                    }
                }
                filtersSetupActivity.f0(null);
                return;
            case 5:
                x30 x30Var = ((k10) obj).f46742b;
                x30Var.f51722b4 = null;
                x30Var.M1(x30Var.f51816x3, true);
                return;
            case 6:
                g30 g30Var = (g30) obj;
                x30 x30Var2 = g30Var.f45511f;
                w10 w10Var = x30Var2.f51750j1;
                org.telegram.messenger.ac acVar = g30Var.d;
                if (acVar != null) {
                    w10Var.L0 = acVar;
                    w10Var.f39107r1 = null;
                    w10Var.f39108s1 = null;
                    g30Var.d = null;
                }
                TLRPC.Chat M0 = org.telegram.messenger.hp.s1(x30Var2.f51759l1.f21919a).M0(Long.valueOf(-g30Var.f45510e));
                org.telegram.messenger.ac a10 = org.telegram.messenger.ac.a(0, M0);
                org.telegram.messenger.ac a11 = org.telegram.messenger.ac.a(1, M0);
                if (org.telegram.messenger.ac.e(g30Var.f45508b) == null) {
                    a11 = org.telegram.messenger.ac.e(g30Var.f45509c);
                }
                w10Var.setCreateThumbFromParent(false);
                w10Var.H(null, a10, a11, true);
                g30Var.f45509c = null;
                g30Var.f45508b = null;
                org.telegram.messenger.g0.b4(x30Var2.I1);
                g30Var.a(1.0f);
                return;
            case 7:
                org.telegram.ui.Components.voip.r0 r0Var = (org.telegram.ui.Components.voip.r0) ((g.b) obj).f11653i;
                if (r0Var != null) {
                    r0Var.invalidate();
                    return;
                }
                return;
            case 8:
                y40 y40Var = (y40) obj;
                y40Var.E = null;
                y40Var.F = null;
                y40Var.G = null;
                y40Var.H = null;
                y40Var.J = null;
                y40Var.I = null;
                y40Var.K = 0.0d;
                y40Var.e0(false, true);
                y40Var.d.j(null, null, y40Var.f52186r, null);
                y40Var.f52184f.setAnimation(y40Var.S);
                y40Var.S.M(0);
                return;
            case 9:
                org.telegram.messenger.k5.o(null, 2131749386, org.telegram.ui.Components.fc.a0(((b50) obj).f43930c), 2131623999, 36);
                return;
            case 10:
                o50 o50Var = (o50) obj;
                n50 n50Var2 = o50Var.J;
                int i13 = org.telegram.ui.ActionBar.k6.f27878d6;
                int x02 = org.telegram.ui.ActionBar.k6.x0(null, i13, false);
                int i14 = n50.E;
                n50Var2.a(2131231535, 17, x02, true);
                o50Var.J.c();
                n50 n50Var3 = o50Var.J;
                n50Var3.b(n50Var3.f47890w, 23, true);
                o50Var.J.e();
                Intro.a(org.telegram.ui.ActionBar.k6.x0(null, i13, false));
                return;
            case 11:
                m50 m50Var = (m50) obj;
                m50Var.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                o50 o50Var2 = (o50) m50Var.f47526b;
                Intro.setPage(o50Var2.I);
                Intro.setDate(((float) (currentTimeMillis - o50Var2.K)) / 1000.0f);
                Intro.onDrawFrame(0);
                n50 n50Var4 = o50Var2.J;
                if (n50Var4 != null && n50Var4.isAlive() && (eGLDisplay = (n50Var = o50Var2.J).f47884c) != null && (eGLSurface = n50Var.f47886f) != null) {
                    try {
                        n50Var.f47883b.eglSwapBuffers(eGLDisplay, eGLSurface);
                        return;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                return;
            case 12:
                o50 o50Var3 = (o50) ((org.telegram.messenger.gs) obj).f22763c;
                o50Var3.presentFragment(new xd0(), true);
                o50Var3.N = true;
                return;
            case 13:
                ((n50) obj).finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 14:
                s50 s50Var = (s50) obj;
                s50Var.f49368f.f49703e.smoothScrollTo(0, s50Var.getHeight());
                return;
            case 15:
                ((sf.b) obj).b();
                return;
            case 16:
                g80 g80Var = (g80) obj;
                LaunchActivity launchActivity = g80Var.f45602c;
                launchActivity.Q0 = false;
                boolean z10 = launchActivity.P0;
                launchActivity.E();
                if (z10 != launchActivity.P0) {
                    g80Var.requestLayout();
                    return;
                }
                return;
            case 17:
                ((h80) obj).f45853a.D0.setVisibility(8);
                return;
            case 18:
                k90 k90Var = (k90) obj;
                bi.a1 a1Var = k90Var.d;
                if (a1Var != null) {
                    k90Var.i0(a1Var.getCurrentLink());
                    return;
                }
                return;
            case 19:
                try {
                    org.telegram.ui.Components.tj0 currentListView = ((la0) ((ka0) obj).f46852j0).M0.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().f();
                        return;
                    }
                    return;
                } catch (Throwable unused3) {
                    return;
                }
            case 20:
                EditTextBoldCursor[] editTextBoldCursorArr = ((qb0) obj).f48836b;
                if (editTextBoldCursorArr != null) {
                    editTextBoldCursorArr[0].requestFocus();
                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    org.telegram.messenger.g0.K3(editTextBoldCursorArr[0]);
                    return;
                }
                return;
            case 21:
                vb0 vb0Var = (vb0) obj;
                org.telegram.ui.Components.fh0 fh0Var = vb0Var.f50444e;
                EditTextBoldCursor editTextBoldCursor2 = vb0Var.f50441a;
                if (editTextBoldCursor2 != null) {
                    editTextBoldCursor2.requestFocus();
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                    xd0.a1(vb0Var.E, editTextBoldCursor2);
                    fh0Var.getAnimatedDrawable().N(0, false, false);
                    fh0Var.d();
                    return;
                }
                return;
            case 22:
                ((org.telegram.ui.Components.fh0) obj).d();
                return;
            case 23:
                ((cc0) ((bh.g) obj).I1).getClass();
                return;
            case 24:
                double currentTimeMillis2 = System.currentTimeMillis();
                cc0 cc0Var = (cc0) ((g6.q) obj).f12031b;
                double d = cc0Var.R;
                bd0 bd0Var = cc0Var.f44305w;
                cc0Var.R = currentTimeMillis2;
                int i15 = (int) (cc0Var.Q - (currentTimeMillis2 - d));
                cc0Var.Q = i15;
                if (i15 >= 1000) {
                    int i16 = i15 / 1000;
                    int i17 = i16 / 60;
                    int i18 = i16 - (i17 * 60);
                    bd0Var.setTextSize(1, 13.0f);
                    int i19 = cc0Var.F;
                    if (i19 != 4 && i19 != 3 && i19 != 11) {
                        if (i19 == 2) {
                            bd0Var.setText(org.telegram.messenger.bd.a0(null, null, 2131745306, Integer.valueOf(i17), Integer.valueOf(i18)));
                            return;
                        }
                        return;
                    }
                    bd0Var.setText(org.telegram.messenger.bd.a0(null, null, 2131752629, Integer.valueOf(i17), Integer.valueOf(i18)));
                    return;
                }
                cc0Var.q();
                int i20 = cc0Var.F;
                if (i20 == 3 || i20 == 4 || i20 == 2 || i20 == 11) {
                    bd0Var.setTextSize(1, 15.0f);
                    int i21 = cc0Var.F;
                    if (i21 == 4) {
                        bd0Var.setText(org.telegram.messenger.bd.M0(2131746187, null));
                    } else if (i21 == 15) {
                        bd0Var.setText(org.telegram.messenger.bd.M0(2131751448, null));
                    } else if (i21 != 11 && i21 != 3) {
                        bd0Var.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.bd.M0(2131746188, null), true, 0.0f, 0.0f));
                    } else {
                        bd0Var.setText(org.telegram.messenger.bd.M0(2131746186, null));
                    }
                    int i22 = org.telegram.ui.ActionBar.k6.P9;
                    org.telegram.ui.ActionBar.r6.V(bd0Var, i22, null);
                    bd0Var.setTag(2131296386, Integer.valueOf(i22));
                    return;
                }
                return;
            case 25:
                double currentTimeMillis3 = System.currentTimeMillis();
                dd0 dd0Var = ((cd0) obj).f44321b;
                double d10 = currentTimeMillis3 - dd0Var.f44643e0;
                dd0Var.f44643e0 = currentTimeMillis3;
                int i23 = (int) (dd0Var.f44640c0 - d10);
                dd0Var.f44640c0 = i23;
                if (i23 <= 1000) {
                    dd0.o(dd0Var);
                    dd0Var.f44664w.setVisibility(8);
                    bd0 bd0Var2 = dd0Var.f44666y;
                    if (bd0Var2 != null) {
                        bd0Var2.setVisibility(0);
                    }
                    dd0Var.t();
                    return;
                }
                return;
            case 26:
                double currentTimeMillis4 = System.currentTimeMillis();
                dd0 dd0Var2 = ((cd0) obj).f44321b;
                double d11 = dd0Var2.f44641d0;
                bd0 bd0Var3 = dd0Var2.f44664w;
                dd0Var2.f44641d0 = currentTimeMillis4;
                int i24 = (int) (dd0Var2.f44638b0 - (currentTimeMillis4 - d11));
                dd0Var2.f44638b0 = i24;
                if (i24 >= 1000) {
                    int i25 = i24 / 1000;
                    int i26 = i25 / 60;
                    int i27 = i25 - (i26 * 60);
                    int i28 = dd0Var2.f44649j0;
                    if (i28 != 4 && i28 != 3 && i28 != 11) {
                        if (dd0Var2.f44648i0 == 2 && (i28 == 2 || i28 == 17 || i28 == 16)) {
                            bd0Var3.setText(org.telegram.messenger.bd.a0("ResendSmsAvailableIn", null, 2131746129, Integer.valueOf(i26), Integer.valueOf(i27)));
                            return;
                        } else if (i28 == 2 || i28 == 17 || i28 == 16) {
                            bd0Var3.setText(org.telegram.messenger.bd.a0("SmsAvailableIn", null, 2131745307, Integer.valueOf(i26), Integer.valueOf(i27)));
                            return;
                        } else {
                            return;
                        }
                    }
                    bd0Var3.setText(org.telegram.messenger.bd.a0("CallAvailableIn", null, 2131752630, Integer.valueOf(i26), Integer.valueOf(i27)));
                    return;
                }
                dd0Var2.u();
                int i29 = dd0Var2.f44649j0;
                if (i29 == 3 || i29 == 4 || i29 == 2 || i29 == 17 || i29 == 16 || i29 == 11) {
                    if (i29 == 4) {
                        bd0Var3.setText(org.telegram.messenger.bd.M0(2131746187, "RequestCallButton"));
                    } else if (i29 != 11 && i29 != 3) {
                        bd0Var3.setText(org.telegram.messenger.bd.M0(2131746185, "RequestSmsButton"));
                    } else {
                        bd0Var3.setText(org.telegram.messenger.bd.M0(2131746186, null));
                    }
                    int i30 = org.telegram.ui.ActionBar.k6.P9;
                    org.telegram.ui.ActionBar.r6.V(bd0Var3, i30, null);
                    bd0Var3.setTag(2131296386, Integer.valueOf(i30));
                    return;
                }
                return;
            case 27:
                ((org.telegram.ui.Components.v60) obj).run();
                return;
            case 28:
                ge0.j((ge0) obj);
                return;
            default:
                ((org.telegram.ui.Components.ai) obj).setVisibility(8);
                return;
        }
    }
}
