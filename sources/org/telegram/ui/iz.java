package org.telegram.ui;

import android.os.Looper;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.telegram.messenger.Intro;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class iz implements Runnable {
    public final int f48147a;
    public final Object f48148b;

    public iz(Object obj, int i7) {
        this.f48147a = i7;
        this.f48148b = obj;
    }

    @Override
    public final void run() {
        int i7;
        s50 s50Var;
        EGLDisplay eGLDisplay;
        EGLSurface eGLSurface;
        int i10 = this.f48147a;
        Object obj = this.f48148b;
        switch (i10) {
            case 0:
                zz zzVar = (zz) obj;
                org.telegram.messenger.g0.r(zzVar.f54092o0);
                zzVar.f54073a.a(false, true);
                return;
            case 1:
                zz zzVar2 = ((oz) obj).f50068a;
                zzVar2.h(zzVar2.F, zzVar2.G, zzVar2.I, zzVar2.H, zzVar2.E, zzVar2.K, zzVar2.f54100x, false);
                return;
            case 2:
                ((FiltersSetupActivity) ((ct) obj).f46213g3).getMessagesController().i3();
                return;
            case 3:
                c00 c00Var = (c00) obj;
                c00Var.f45866s.a();
                c00Var.f45864n.invalidate();
                c00Var.I.g0(true);
                return;
            case 4:
                FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) ((org.telegram.ui.Components.hz) obj).f35369f;
                if (!org.telegram.messenger.m10.i(org.telegram.messenger.m10.f24940t0).q()) {
                    ArrayList T0 = filtersSetupActivity.getMessagesController().T0();
                    int i11 = 0;
                    while (true) {
                        if (i11 < T0.size()) {
                            if (((org.telegram.messenger.so) T0.get(i11)).e() && i11 != 0) {
                                FiltersSetupActivity filtersSetupActivity2 = filtersSetupActivity.f42605b.f47254e;
                                ArrayList arrayList = filtersSetupActivity2.getMessagesController().Q0;
                                if (i11 < 0 || i11 >= arrayList.size()) {
                                    i7 = 1;
                                } else {
                                    arrayList.add(0, (org.telegram.messenger.so) arrayList.remove(i11));
                                    for (int i12 = 0; i12 <= i11; i12++) {
                                        ((org.telegram.messenger.so) arrayList.get(i12)).f26556f = i12;
                                    }
                                    i7 = 1;
                                    filtersSetupActivity2.f42607e = true;
                                    filtersSetupActivity2.g0(true);
                                }
                                filtersSetupActivity.f42604a.v0(0);
                                try {
                                    filtersSetupActivity.fragmentView.performHapticFeedback(3, i7);
                                } catch (Exception unused) {
                                }
                                org.telegram.ui.Components.cc a02 = org.telegram.ui.Components.cc.a0(filtersSetupActivity);
                                Object[] objArr = new Object[i7];
                                objArr[0] = org.telegram.messenger.hd.M0(2131750807, null);
                                a02.J(2131624018, org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("LimitReachedReorderFolder", null, 2131748944, objArr)), org.telegram.messenger.hd.M0(2131747033, null), 5000, false, new a00(filtersSetupActivity, 2)).j();
                            } else {
                                i11++;
                            }
                        }
                    }
                }
                filtersSetupActivity.f0(null);
                return;
            case 5:
                c40 c40Var = ((o10) obj).f49747b;
                c40Var.f45918i4 = null;
                c40Var.R1(c40Var.E3, true);
                return;
            case 6:
                ((i30) obj).requestLayout();
                return;
            case 7:
                l30 l30Var = (l30) obj;
                c40 c40Var2 = l30Var.f48819f;
                a20 a20Var = c40Var2.f45931m1;
                org.telegram.messenger.gc gcVar = l30Var.d;
                if (gcVar != null) {
                    a20Var.L0 = gcVar;
                    a20Var.f40408r1 = null;
                    a20Var.f40409s1 = null;
                    l30Var.d = null;
                }
                TLRPC.Chat M0 = org.telegram.messenger.np.s1(c40Var2.f45940o1.f22782a).M0(Long.valueOf(-l30Var.f48818e));
                org.telegram.messenger.gc a10 = org.telegram.messenger.gc.a(0, M0);
                org.telegram.messenger.gc a11 = org.telegram.messenger.gc.a(1, M0);
                if (org.telegram.messenger.gc.e(l30Var.f48816b) == null) {
                    a11 = org.telegram.messenger.gc.e(l30Var.f48817c);
                }
                a20Var.setCreateThumbFromParent(false);
                a20Var.H(null, a10, a11, true);
                l30Var.f48817c = null;
                l30Var.f48816b = null;
                org.telegram.messenger.g0.a4(c40Var2.L1);
                l30Var.a(1.0f);
                return;
            case 8:
                rv rvVar = (rv) ((g.b) obj).f12619i;
                if (rvVar != null) {
                    rvVar.invalidate();
                    return;
                }
                return;
            case 9:
                c50 c50Var = (c50) obj;
                c50Var.E = null;
                c50Var.F = null;
                c50Var.G = null;
                c50Var.H = null;
                c50Var.J = null;
                c50Var.I = null;
                c50Var.K = 0.0d;
                c50Var.e0(false, true);
                c50Var.d.j(null, null, c50Var.f46012r, null);
                c50Var.f46010f.setAnimation(c50Var.S);
                c50Var.S.M(0);
                return;
            case 10:
                org.telegram.messenger.k5.n(null, 2131749378, org.telegram.ui.Components.cc.a0(((f50) obj).f46994c), 2131624000, 36);
                return;
            case 11:
                t50 t50Var = (t50) obj;
                s50 s50Var2 = t50Var.J;
                int i13 = org.telegram.ui.ActionBar.j6.f28849d6;
                int x02 = org.telegram.ui.ActionBar.j6.x0(null, i13, false);
                int i14 = s50.E;
                s50Var2.a(2131231535, 17, x02, true);
                t50Var.J.c();
                s50 s50Var3 = t50Var.J;
                s50Var3.b(s50Var3.f51108w, 23, true);
                t50Var.J.d();
                Intro.a(org.telegram.ui.ActionBar.j6.x0(null, i13, false));
                return;
            case 12:
                r50 r50Var = (r50) obj;
                r50Var.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                t50 t50Var2 = (t50) r50Var.f50847b;
                Intro.setPage(t50Var2.I);
                Intro.setDate(((float) (currentTimeMillis - t50Var2.K)) / 1000.0f);
                Intro.onDrawFrame(0);
                s50 s50Var4 = t50Var2.J;
                if (s50Var4 != null && s50Var4.isAlive() && (eGLDisplay = (s50Var = t50Var2.J).f51102c) != null && (eGLSurface = s50Var.f51104f) != null) {
                    try {
                        s50Var.f51101b.eglSwapBuffers(eGLDisplay, eGLSurface);
                        return;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                return;
            case 13:
                t50 t50Var3 = (t50) ((org.telegram.messenger.ms) obj).f25096c;
                t50Var3.presentFragment(new ce0(), true);
                t50Var3.N = true;
                return;
            case 14:
                ((s50) obj).finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 15:
                x50 x50Var = (x50) obj;
                x50Var.f53101f.f53424e.smoothScrollTo(0, x50Var.getHeight());
                return;
            case 16:
                ((vf.b) obj).b();
                return;
            case 17:
                ((k80) obj).f48598a.B0.setVisibility(8);
                return;
            case 18:
                v80 v80Var = (v80) obj;
                LaunchActivity launchActivity = v80Var.f52162c;
                launchActivity.O0 = false;
                boolean z10 = launchActivity.N0;
                launchActivity.E();
                if (z10 != launchActivity.N0) {
                    v80Var.requestLayout();
                    return;
                }
                return;
            case 19:
                o90 o90Var = (o90) obj;
                ci.z0 z0Var = o90Var.d;
                if (z0Var != null) {
                    o90Var.i0(z0Var.getCurrentLink());
                    return;
                }
                return;
            case 20:
                try {
                    org.telegram.ui.Components.uj0 currentListView = ((pa0) ((oa0) obj).f49875j0).M0.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().f();
                        return;
                    }
                    return;
                } catch (Throwable unused3) {
                    return;
                }
            case 21:
                EditTextBoldCursor[] editTextBoldCursorArr = ((tb0) obj).f51525b;
                if (editTextBoldCursorArr != null) {
                    editTextBoldCursorArr[0].requestFocus();
                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    org.telegram.messenger.g0.J3(editTextBoldCursorArr[0]);
                    return;
                }
                return;
            case 22:
                wb0 wb0Var = (wb0) obj;
                org.telegram.ui.Components.fh0 fh0Var = wb0Var.f52533e;
                EditTextBoldCursor editTextBoldCursor2 = wb0Var.f52530a;
                if (editTextBoldCursor2 != null) {
                    editTextBoldCursor2.requestFocus();
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                    ce0.b1(wb0Var.E, editTextBoldCursor2);
                    fh0Var.getAnimatedDrawable().N(0, false, false);
                    fh0Var.d();
                    return;
                }
                return;
            case 23:
                ((org.telegram.ui.Components.fh0) obj).d();
                return;
            case 24:
                ((dc0) ((ah.i) obj).N1).getClass();
                return;
            case 25:
                double currentTimeMillis2 = System.currentTimeMillis();
                dc0 dc0Var = (dc0) ((h6.r) obj).f13634b;
                double d = dc0Var.R;
                cd0 cd0Var = dc0Var.f46336w;
                dc0Var.R = currentTimeMillis2;
                int i15 = (int) (dc0Var.Q - (currentTimeMillis2 - d));
                dc0Var.Q = i15;
                if (i15 >= 1000) {
                    int i16 = i15 / 1000;
                    int i17 = i16 / 60;
                    int i18 = i16 - (i17 * 60);
                    cd0Var.setTextSize(1, 13.0f);
                    int i19 = dc0Var.F;
                    if (i19 != 4 && i19 != 3 && i19 != 11) {
                        if (i19 == 2) {
                            cd0Var.setText(org.telegram.messenger.hd.a0(null, null, 2131745296, Integer.valueOf(i17), Integer.valueOf(i18)));
                            return;
                        }
                        return;
                    }
                    cd0Var.setText(org.telegram.messenger.hd.a0(null, null, 2131752629, Integer.valueOf(i17), Integer.valueOf(i18)));
                    return;
                }
                dc0Var.q();
                int i20 = dc0Var.F;
                if (i20 == 3 || i20 == 4 || i20 == 2 || i20 == 11) {
                    cd0Var.setTextSize(1, 15.0f);
                    int i21 = dc0Var.F;
                    if (i21 == 4) {
                        cd0Var.setText(org.telegram.messenger.hd.M0(2131746177, null));
                    } else if (i21 == 15) {
                        cd0Var.setText(org.telegram.messenger.hd.M0(2131751447, null));
                    } else if (i21 != 11 && i21 != 3) {
                        cd0Var.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.hd.M0(2131746178, null), true, 0.0f, 0.0f));
                    } else {
                        cd0Var.setText(org.telegram.messenger.hd.M0(2131746176, null));
                    }
                    int i22 = org.telegram.ui.ActionBar.j6.P9;
                    org.telegram.ui.ActionBar.q6.U(cd0Var, i22, null);
                    cd0Var.setTag(2131296386, Integer.valueOf(i22));
                    return;
                }
                return;
            case 26:
                double currentTimeMillis3 = System.currentTimeMillis();
                ed0 ed0Var = ((dd0) obj).f46346b;
                double d2 = currentTimeMillis3 - ed0Var.f46729e0;
                ed0Var.f46729e0 = currentTimeMillis3;
                int i23 = (int) (ed0Var.f46726c0 - d2);
                ed0Var.f46726c0 = i23;
                if (i23 <= 1000) {
                    ed0.o(ed0Var);
                    ed0Var.f46750w.setVisibility(8);
                    cd0 cd0Var2 = ed0Var.f46752y;
                    if (cd0Var2 != null) {
                        cd0Var2.setVisibility(0);
                    }
                    ed0Var.t();
                    return;
                }
                return;
            case 27:
                double currentTimeMillis4 = System.currentTimeMillis();
                ed0 ed0Var2 = ((dd0) obj).f46346b;
                double d10 = ed0Var2.f46727d0;
                cd0 cd0Var3 = ed0Var2.f46750w;
                ed0Var2.f46727d0 = currentTimeMillis4;
                int i24 = (int) (ed0Var2.f46724b0 - (currentTimeMillis4 - d10));
                ed0Var2.f46724b0 = i24;
                if (i24 >= 1000) {
                    int i25 = i24 / 1000;
                    int i26 = i25 / 60;
                    int i27 = i25 - (i26 * 60);
                    int i28 = ed0Var2.f46735j0;
                    if (i28 != 4 && i28 != 3 && i28 != 11) {
                        if (ed0Var2.f46734i0 == 2 && (i28 == 2 || i28 == 17 || i28 == 16)) {
                            cd0Var3.setText(org.telegram.messenger.hd.a0("ResendSmsAvailableIn", null, 2131746119, Integer.valueOf(i26), Integer.valueOf(i27)));
                            return;
                        } else if (i28 == 2 || i28 == 17 || i28 == 16) {
                            cd0Var3.setText(org.telegram.messenger.hd.a0("SmsAvailableIn", null, 2131745297, Integer.valueOf(i26), Integer.valueOf(i27)));
                            return;
                        } else {
                            return;
                        }
                    }
                    cd0Var3.setText(org.telegram.messenger.hd.a0("CallAvailableIn", null, 2131752630, Integer.valueOf(i26), Integer.valueOf(i27)));
                    return;
                }
                ed0Var2.u();
                int i29 = ed0Var2.f46735j0;
                if (i29 == 3 || i29 == 4 || i29 == 2 || i29 == 17 || i29 == 16 || i29 == 11) {
                    if (i29 == 4) {
                        cd0Var3.setText(org.telegram.messenger.hd.M0(2131746177, "RequestCallButton"));
                    } else if (i29 != 11 && i29 != 3) {
                        cd0Var3.setText(org.telegram.messenger.hd.M0(2131746175, "RequestSmsButton"));
                    } else {
                        cd0Var3.setText(org.telegram.messenger.hd.M0(2131746176, null));
                    }
                    int i30 = org.telegram.ui.ActionBar.j6.P9;
                    org.telegram.ui.ActionBar.q6.U(cd0Var3, i30, null);
                    cd0Var3.setTag(2131296386, Integer.valueOf(i30));
                    return;
                }
                return;
            case 28:
                ((org.telegram.ui.Components.u80) obj).run();
                return;
            default:
                le0.j((le0) obj);
                return;
        }
    }
}
