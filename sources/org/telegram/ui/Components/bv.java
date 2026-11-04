package org.telegram.ui.Components;

import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Pair;
import android.view.View;
import java.util.ArrayList;
public final class bv implements pi.m, hj0, tk0, qe.b {
    public final int f32408a;
    public final ey f32409b;

    public bv(ey eyVar, int i3) {
        this.f32408a = i3;
        this.f32409b = eyVar;
    }

    @Override
    public void Y(int i3, float f10, float f11, qe.c cVar) {
        this.f32409b.R();
    }

    @Override
    public void a(int i3) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        qx qxVar;
        switch (this.f32408a) {
            case 2:
                ey eyVar = this.f32409b;
                kx kxVar = eyVar.f33548j0;
                int i15 = eyVar.f33529d1;
                jx jxVar = eyVar.f33561o0;
                mx mxVar = eyVar.f33553l0;
                if (i3 != eyVar.f33578t0 || !jxVar.f35214y.isEmpty()) {
                    eyVar.f33545i0.C0();
                    eyVar.f33567q0.k(i3, 0);
                    if (i3 != eyVar.f33575s0 && i3 != eyVar.f33578t0) {
                        ArrayList arrayList = org.telegram.messenger.hp.s1(i15).f22977c4;
                        eyVar.f33551k0.H((String) arrayList.get(i3 - eyVar.f33581u0));
                        int i16 = i3 - eyVar.f33581u0;
                        if (i16 > 0) {
                            mxVar.a((String) arrayList.get(i16 - 1), true);
                        }
                        if (i3 - eyVar.f33581u0 < arrayList.size() - 1) {
                            mxVar.a((String) arrayList.get((i3 - eyVar.f33581u0) + 1), true);
                        }
                    } else {
                        eyVar.f33564p0.d.setText("");
                        if (i3 == eyVar.f33578t0 && (i11 = jxVar.J) >= 1) {
                            kxVar.h1(i11, -org.telegram.messenger.g0.L(4.0f));
                        } else {
                            fx fxVar = eyVar.f33582u1;
                            if (fxVar != null && fxVar.A()) {
                                i10 = 0;
                            } else {
                                i10 = 1;
                            }
                            kxVar.h1(i10, 0);
                        }
                        if (i3 == eyVar.f33578t0) {
                            ArrayList arrayList2 = org.telegram.messenger.hp.s1(i15).f22977c4;
                            if (!arrayList2.isEmpty()) {
                                mxVar.a((String) arrayList2.get(0), true);
                            }
                        }
                    }
                    eyVar.E(2);
                    return;
                }
                return;
            default:
                ey eyVar2 = this.f32409b;
                rv rvVar = eyVar2.H0;
                ArrayList arrayList3 = eyVar2.f33533e1;
                sv svVar = eyVar2.C0;
                vx vxVar = eyVar2.f33599z0;
                ov ovVar = eyVar2.E0;
                if (!eyVar2.T0) {
                    if (i3 == eyVar2.I1) {
                        eyVar2.f33582u1.o(new n31(eyVar2.getContext(), new zv(eyVar2), eyVar2.f33597y1, eyVar2.f33600z1, eyVar2.A1, null, eyVar2.f33520a2));
                        return;
                    }
                    if (rvVar != null && (qxVar = rvVar.f37831r) != null && qxVar.getSelectedCategory() != null) {
                        rvVar.c(null, false);
                        qxVar.I1(null);
                    }
                    if (i3 == eyVar2.G1) {
                        ovVar.C0();
                        eyVar2.H(vxVar.E("recent"), 0);
                        eyVar2.E(0);
                        int i17 = eyVar2.G1;
                        if (i17 > 0) {
                            i14 = i17;
                        } else {
                            i14 = eyVar2.F1;
                        }
                        svVar.k(i17, i14);
                        return;
                    } else if (i3 == eyVar2.H1) {
                        ovVar.C0();
                        eyVar2.H(vxVar.E("fav"), 0);
                        eyVar2.E(0);
                        int i18 = eyVar2.H1;
                        if (i18 > 0) {
                            i13 = i18;
                        } else {
                            i13 = eyVar2.F1;
                        }
                        svVar.k(i18, i13);
                        return;
                    } else if (i3 == eyVar2.J1) {
                        ovVar.C0();
                        eyVar2.H(vxVar.E("premium"), 0);
                        eyVar2.E(0);
                        int i19 = eyVar2.J1;
                        if (i19 > 0) {
                            i12 = i19;
                        } else {
                            i12 = eyVar2.F1;
                        }
                        svVar.k(i19, i12);
                        return;
                    } else {
                        int i20 = i3 - eyVar2.F1;
                        if (i20 < arrayList3.size()) {
                            if (i20 >= arrayList3.size()) {
                                i20 = arrayList3.size() - 1;
                            }
                            eyVar2.J0 = false;
                            ovVar.C0();
                            eyVar2.H(vxVar.E(arrayList3.get(i20)), 0);
                            eyVar2.E(0);
                            eyVar2.p(0);
                            int i21 = eyVar2.H1;
                            if (i21 <= 0 && (i21 = eyVar2.G1) <= 0) {
                                i21 = eyVar2.F1;
                            }
                            svVar.k(i3, i21);
                            eyVar2.Y1 = false;
                            eyVar2.Z();
                            return;
                        }
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public boolean f(int i3, View view) {
        String str;
        String str2;
        boolean z10;
        boolean z11;
        String str3;
        int i10;
        float f10;
        int i11;
        int i12;
        int i13;
        int i14;
        float f11;
        boolean z12;
        ey eyVar = this.f32409b;
        int i15 = eyVar.D1;
        rw rwVar = eyVar.Q;
        int[] iArr = eyVar.E1;
        wt wtVar = eyVar.C1;
        if (view instanceof nx) {
            nx nxVar = (nx) view;
            u4.d1 d1Var = null;
            if (nxVar.f36638c) {
                View F = rwVar.F(view);
                if (F != null) {
                    d1Var = rwVar.T(F);
                }
                if (d1Var != null && d1Var.b() <= eyVar.getRecentEmoji().size()) {
                    eyVar.f33582u1.n();
                }
                rwVar.A1(view);
                return true;
            } else if (nxVar.getSpan() == null && (str = (String) nxVar.getTag()) != null) {
                String replace = str.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
                if (!nxVar.f36638c) {
                    str2 = (String) org.telegram.messenger.i6.f23453j.get(replace);
                } else {
                    str2 = null;
                }
                if (org.telegram.messenger.h4.a(replace, null, null) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 || org.telegram.messenger.j6.f23649l.contains(replace)) {
                    eyVar.S1 = nxVar;
                    eyVar.V1 = eyVar.T1;
                    eyVar.W1 = eyVar.U1;
                    if (z10) {
                        replace = ey.g(replace, str2);
                    } else {
                        int indexOf = org.telegram.messenger.h4.f22883a.indexOf(str2) + 1;
                        vt vtVar = wtVar.f40149c;
                        int[] iArr2 = vtVar.f39789n;
                        if (iArr2[0] != indexOf) {
                            iArr2[0] = indexOf;
                            vtVar.invalidate();
                        }
                    }
                    wtVar.getClass();
                    vt vtVar2 = wtVar.f40149c;
                    int i16 = wtVar.f40150e;
                    if (org.telegram.messenger.h4.a(replace, null, null) != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    wtVar.d = z11;
                    int i17 = 3;
                    Drawable[] drawableArr = vtVar2.f39785b;
                    int[] iArr3 = vtVar2.f39789n;
                    vtVar2.f39788f = z11;
                    vtVar2.f39787e = replace;
                    int i18 = 5;
                    if (z11) {
                        drawableArr[0] = org.telegram.messenger.h4.a(replace, -1, -1);
                        drawableArr[1] = org.telegram.messenger.h4.a(vtVar2.f39787e, 0, -2);
                        drawableArr[2] = org.telegram.messenger.h4.a(vtVar2.f39787e, 1, -2);
                        drawableArr[3] = org.telegram.messenger.h4.a(vtVar2.f39787e, 2, -2);
                        drawableArr[4] = org.telegram.messenger.h4.a(vtVar2.f39787e, 3, -2);
                        drawableArr[5] = org.telegram.messenger.h4.a(vtVar2.f39787e, 4, -2);
                        drawableArr[6] = org.telegram.messenger.h4.a(vtVar2.f39787e, -2, 0);
                        drawableArr[7] = org.telegram.messenger.h4.a(vtVar2.f39787e, -2, 1);
                        drawableArr[8] = org.telegram.messenger.h4.a(vtVar2.f39787e, -2, 2);
                        drawableArr[9] = org.telegram.messenger.h4.a(vtVar2.f39787e, -2, 3);
                        drawableArr[10] = org.telegram.messenger.h4.a(vtVar2.f39787e, -2, 4);
                        Pair c2 = org.telegram.messenger.h4.c(replace);
                        if (c2 != null) {
                            int intValue = ((Integer) c2.first).intValue();
                            if (iArr3[0] != intValue) {
                                iArr3[0] = intValue;
                                vtVar2.invalidate();
                            }
                            int intValue2 = ((Integer) c2.second).intValue();
                            if (iArr3[1] != intValue2) {
                                iArr3[1] = intValue2;
                                vtVar2.invalidate();
                            }
                            if (iArr3[0] == iArr3[1]) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            vtVar2.H = z12;
                        }
                        vtVar2.J = true;
                    } else {
                        for (int i19 = 0; i19 < 6; i19++) {
                            if (i19 != 0) {
                                str3 = ey.g(replace, (String) org.telegram.messenger.h4.f22883a.get(i19 - 1));
                            } else {
                                str3 = replace;
                            }
                            drawableArr[i19] = org.telegram.messenger.i6.f(str3);
                        }
                    }
                    vtVar2.invalidate();
                    int i20 = i16 * 6;
                    if (wtVar.d) {
                        i10 = 3;
                    } else {
                        i10 = 0;
                    }
                    wtVar.setWidth(org.telegram.messenger.g0.L(i10 + 30) + i20);
                    float f12 = 15.0f;
                    if (wtVar.d) {
                        f10 = 11.66f;
                    } else {
                        f10 = 15.0f;
                    }
                    int L = org.telegram.messenger.g0.L(f10);
                    if (wtVar.d) {
                        i11 = 2;
                    } else {
                        i11 = 1;
                    }
                    wtVar.setHeight((i11 * i16) + L);
                    int i21 = i16 * 6;
                    if (!wtVar.d) {
                        i17 = 0;
                    }
                    int L2 = org.telegram.messenger.g0.L(i17 + 30) + i21;
                    if (wtVar.d) {
                        f12 = 11.66f;
                    }
                    int L3 = org.telegram.messenger.g0.L(f12);
                    if (wtVar.d) {
                        i12 = 2;
                    } else {
                        i12 = 1;
                    }
                    int i22 = (i12 * i16) + L3;
                    nxVar.getLocationOnScreen(iArr);
                    if (!wtVar.d) {
                        int i23 = vtVar2.f39789n[0];
                        int i24 = i23 * i15;
                        int i25 = i23 * 4;
                        if (!org.telegram.messenger.g0.Q1()) {
                            i18 = 1;
                        }
                        i13 = org.telegram.messenger.g0.L(i25 - i18) + i24;
                    } else {
                        i13 = 0;
                    }
                    if (iArr[0] - i13 < org.telegram.messenger.g0.L(5.0f)) {
                        i13 = org.telegram.messenger.camera.q.D(5.0f, iArr[0] - i13, i13);
                    } else {
                        int i26 = (iArr[0] - i13) + L2;
                        Point point = org.telegram.messenger.g0.f22608q;
                        if (i26 > point.x - org.telegram.messenger.g0.L(5.0f)) {
                            i13 += ((iArr[0] - i13) + L2) - (point.x - org.telegram.messenger.g0.L(5.0f));
                        }
                    }
                    int i27 = -i13;
                    if (nxVar.getTop() < 0) {
                        i14 = nxVar.getTop();
                    } else {
                        i14 = 0;
                    }
                    if (org.telegram.messenger.g0.Q1()) {
                        f11 = 30.0f;
                    } else {
                        f11 = 22.0f;
                    }
                    vtVar2.setArrowX((org.telegram.messenger.g0.L(f11) - i27) + ((int) org.telegram.messenger.g0.N(0.5f)));
                    wtVar.setFocusable(true);
                    wtVar.showAsDropDown(view, i27, (((view.getMeasuredHeight() - i15) / 2) + ((-view.getMeasuredHeight()) - i22)) - i14);
                    eyVar.h.requestDisallowInterceptTouchEvent(true);
                    rwVar.d1(true);
                    rwVar.A1(view);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public void l(int i3) {
        ey eyVar = this.f32409b;
        eh.g gVar = eyVar.f33552k2;
        if (Build.VERSION.SDK_INT >= 31 && gVar != null) {
            if (x7.u.a(i3, 4)) {
                gVar.h(eyVar.f33563o2.e());
            }
            gVar.e(eyVar.f33555l2, eyVar.getWidth(), eyVar.getHeight());
        }
    }

    @Override
    public void F(float f10, int i3) {
    }
}
