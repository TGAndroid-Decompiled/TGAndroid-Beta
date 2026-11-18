package org.telegram.ui.Components;

import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Pair;
import android.view.View;
import java.util.ArrayList;
public final class nv implements ri.m, qj0, cl0, te.b {
    public final int f37858a;
    public final ry f37859b;

    public nv(ry ryVar, int i7) {
        this.f37858a = i7;
        this.f37859b = ryVar;
    }

    @Override
    public void H(int i7, float f10, float f11, te.c cVar) {
        this.f37859b.S();
    }

    @Override
    public void a(int i7) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        dy dyVar;
        switch (this.f37858a) {
            case 2:
                ry ryVar = this.f37859b;
                wx wxVar = ryVar.f39363j0;
                int i15 = ryVar.f39345d1;
                vx vxVar = ryVar.f39376o0;
                yx yxVar = ryVar.f39369l0;
                if (i7 != ryVar.f39393t0 || !vxVar.f41479y.isEmpty()) {
                    ryVar.f39360i0.C0();
                    ryVar.f39382q0.k(i7, 0);
                    if (i7 != ryVar.f39390s0 && i7 != ryVar.f39393t0) {
                        ArrayList arrayList = org.telegram.messenger.mp.u1(i15).f25636e4;
                        ryVar.f39366k0.H((String) arrayList.get(i7 - ryVar.f39396u0));
                        int i16 = i7 - ryVar.f39396u0;
                        if (i16 > 0) {
                            yxVar.a((String) arrayList.get(i16 - 1), true);
                        }
                        if (i7 - ryVar.f39396u0 < arrayList.size() - 1) {
                            yxVar.a((String) arrayList.get((i7 - ryVar.f39396u0) + 1), true);
                        }
                    } else {
                        ryVar.f39379p0.d.setText("");
                        if (i7 == ryVar.f39393t0 && (i11 = vxVar.J) >= 1) {
                            wxVar.h1(i11, -org.telegram.messenger.g0.L(4.0f));
                        } else {
                            rx rxVar = ryVar.f39397u1;
                            if (rxVar != null && rxVar.A()) {
                                i10 = 0;
                            } else {
                                i10 = 1;
                            }
                            wxVar.h1(i10, 0);
                        }
                        if (i7 == ryVar.f39393t0) {
                            ArrayList arrayList2 = org.telegram.messenger.mp.u1(i15).f25636e4;
                            if (!arrayList2.isEmpty()) {
                                yxVar.a((String) arrayList2.get(0), true);
                            }
                        }
                    }
                    ryVar.F(2);
                    return;
                }
                return;
            default:
                ry ryVar2 = this.f37859b;
                ew ewVar = ryVar2.H0;
                ArrayList arrayList3 = ryVar2.f39348e1;
                fw fwVar = ryVar2.C0;
                jy jyVar = ryVar2.f39414z0;
                aw awVar = ryVar2.E0;
                if (!ryVar2.T0) {
                    if (i7 == ryVar2.I1) {
                        ryVar2.f39397u1.o(new h41(ryVar2.getContext(), new mw(ryVar2), ryVar2.f39412y1, ryVar2.f39415z1, ryVar2.A1, null, ryVar2.f39335a2));
                        return;
                    }
                    if (ewVar != null && (dyVar = ewVar.f34841r) != null && dyVar.getSelectedCategory() != null) {
                        ewVar.c(null, false);
                        dyVar.I1(null);
                    }
                    if (i7 == ryVar2.G1) {
                        awVar.C0();
                        ryVar2.I(jyVar.E("recent"), 0);
                        ryVar2.F(0);
                        int i17 = ryVar2.G1;
                        if (i17 > 0) {
                            i14 = i17;
                        } else {
                            i14 = ryVar2.F1;
                        }
                        fwVar.k(i17, i14);
                        return;
                    } else if (i7 == ryVar2.H1) {
                        awVar.C0();
                        ryVar2.I(jyVar.E("fav"), 0);
                        ryVar2.F(0);
                        int i18 = ryVar2.H1;
                        if (i18 > 0) {
                            i13 = i18;
                        } else {
                            i13 = ryVar2.F1;
                        }
                        fwVar.k(i18, i13);
                        return;
                    } else if (i7 == ryVar2.J1) {
                        awVar.C0();
                        ryVar2.I(jyVar.E("premium"), 0);
                        ryVar2.F(0);
                        int i19 = ryVar2.J1;
                        if (i19 > 0) {
                            i12 = i19;
                        } else {
                            i12 = ryVar2.F1;
                        }
                        fwVar.k(i19, i12);
                        return;
                    } else {
                        int i20 = i7 - ryVar2.F1;
                        if (i20 < arrayList3.size()) {
                            if (i20 >= arrayList3.size()) {
                                i20 = arrayList3.size() - 1;
                            }
                            ryVar2.J0 = false;
                            awVar.C0();
                            ryVar2.I(jyVar.E(arrayList3.get(i20)), 0);
                            ryVar2.F(0);
                            ryVar2.p(0);
                            int i21 = ryVar2.H1;
                            if (i21 <= 0 && (i21 = ryVar2.G1) <= 0) {
                                i21 = ryVar2.F1;
                            }
                            fwVar.k(i7, i21);
                            ryVar2.Y1 = false;
                            ryVar2.Z();
                            return;
                        }
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public boolean c(int i7, View view) {
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
        ry ryVar = this.f37859b;
        int i15 = ryVar.D1;
        ex exVar = ryVar.Q;
        int[] iArr = ryVar.E1;
        iu iuVar = ryVar.C1;
        if (view instanceof zx) {
            zx zxVar = (zx) view;
            v4.f1 f1Var = null;
            if (zxVar.f42962c) {
                View F = exVar.F(view);
                if (F != null) {
                    f1Var = exVar.T(F);
                }
                if (f1Var != null && f1Var.b() <= ryVar.getRecentEmoji().size()) {
                    ryVar.f39397u1.n();
                }
                exVar.A1(view);
                return true;
            } else if (zxVar.getSpan() == null && (str = (String) zxVar.getTag()) != null) {
                String replace = str.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
                if (!zxVar.f42962c) {
                    str2 = (String) org.telegram.messenger.j6.f24817j.get(replace);
                } else {
                    str2 = null;
                }
                if (org.telegram.messenger.j4.a(replace, null, null) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 || org.telegram.messenger.k6.f24996l.contains(replace)) {
                    ryVar.S1 = zxVar;
                    ryVar.V1 = ryVar.T1;
                    ryVar.W1 = ryVar.U1;
                    if (z10) {
                        replace = ry.g(replace, str2);
                    } else {
                        int indexOf = org.telegram.messenger.j4.f24806a.indexOf(str2) + 1;
                        hu huVar = iuVar.f36199c;
                        int[] iArr2 = huVar.f35974n;
                        if (iArr2[0] != indexOf) {
                            iArr2[0] = indexOf;
                            huVar.invalidate();
                        }
                    }
                    iuVar.getClass();
                    hu huVar2 = iuVar.f36199c;
                    int i16 = iuVar.f36200e;
                    if (org.telegram.messenger.j4.a(replace, null, null) != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    iuVar.d = z11;
                    int i17 = 3;
                    Drawable[] drawableArr = huVar2.f35970b;
                    int[] iArr3 = huVar2.f35974n;
                    huVar2.f35973f = z11;
                    huVar2.f35972e = replace;
                    int i18 = 5;
                    if (z11) {
                        drawableArr[0] = org.telegram.messenger.j4.a(replace, -1, -1);
                        drawableArr[1] = org.telegram.messenger.j4.a(huVar2.f35972e, 0, -2);
                        drawableArr[2] = org.telegram.messenger.j4.a(huVar2.f35972e, 1, -2);
                        drawableArr[3] = org.telegram.messenger.j4.a(huVar2.f35972e, 2, -2);
                        drawableArr[4] = org.telegram.messenger.j4.a(huVar2.f35972e, 3, -2);
                        drawableArr[5] = org.telegram.messenger.j4.a(huVar2.f35972e, 4, -2);
                        drawableArr[6] = org.telegram.messenger.j4.a(huVar2.f35972e, -2, 0);
                        drawableArr[7] = org.telegram.messenger.j4.a(huVar2.f35972e, -2, 1);
                        drawableArr[8] = org.telegram.messenger.j4.a(huVar2.f35972e, -2, 2);
                        drawableArr[9] = org.telegram.messenger.j4.a(huVar2.f35972e, -2, 3);
                        drawableArr[10] = org.telegram.messenger.j4.a(huVar2.f35972e, -2, 4);
                        Pair c10 = org.telegram.messenger.j4.c(replace);
                        if (c10 != null) {
                            int intValue = ((Integer) c10.first).intValue();
                            if (iArr3[0] != intValue) {
                                iArr3[0] = intValue;
                                huVar2.invalidate();
                            }
                            int intValue2 = ((Integer) c10.second).intValue();
                            if (iArr3[1] != intValue2) {
                                iArr3[1] = intValue2;
                                huVar2.invalidate();
                            }
                            if (iArr3[0] == iArr3[1]) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            huVar2.H = z12;
                        }
                        huVar2.J = true;
                    } else {
                        for (int i19 = 0; i19 < 6; i19++) {
                            if (i19 != 0) {
                                str3 = ry.g(replace, (String) org.telegram.messenger.j4.f24806a.get(i19 - 1));
                            } else {
                                str3 = replace;
                            }
                            drawableArr[i19] = org.telegram.messenger.j6.f(str3);
                        }
                    }
                    huVar2.invalidate();
                    int i20 = i16 * 6;
                    if (iuVar.d) {
                        i10 = 3;
                    } else {
                        i10 = 0;
                    }
                    iuVar.setWidth(org.telegram.messenger.g0.L(i10 + 30) + i20);
                    float f12 = 15.0f;
                    if (iuVar.d) {
                        f10 = 11.66f;
                    } else {
                        f10 = 15.0f;
                    }
                    int L = org.telegram.messenger.g0.L(f10);
                    if (iuVar.d) {
                        i11 = 2;
                    } else {
                        i11 = 1;
                    }
                    iuVar.setHeight((i11 * i16) + L);
                    int i21 = i16 * 6;
                    if (!iuVar.d) {
                        i17 = 0;
                    }
                    int L2 = org.telegram.messenger.g0.L(i17 + 30) + i21;
                    if (iuVar.d) {
                        f12 = 11.66f;
                    }
                    int L3 = org.telegram.messenger.g0.L(f12);
                    if (iuVar.d) {
                        i12 = 2;
                    } else {
                        i12 = 1;
                    }
                    int i22 = (i12 * i16) + L3;
                    zxVar.getLocationOnScreen(iArr);
                    if (!iuVar.d) {
                        int i23 = huVar2.f35974n[0];
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
                        i13 = org.telegram.ui.Cells.c0.i(5.0f, iArr[0] - i13, i13);
                    } else {
                        int i26 = (iArr[0] - i13) + L2;
                        Point point = org.telegram.messenger.g0.f24118q;
                        if (i26 > point.x - org.telegram.messenger.g0.L(5.0f)) {
                            i13 += ((iArr[0] - i13) + L2) - (point.x - org.telegram.messenger.g0.L(5.0f));
                        }
                    }
                    int i27 = -i13;
                    if (zxVar.getTop() < 0) {
                        i14 = zxVar.getTop();
                    } else {
                        i14 = 0;
                    }
                    if (org.telegram.messenger.g0.Q1()) {
                        f11 = 30.0f;
                    } else {
                        f11 = 22.0f;
                    }
                    huVar2.setArrowX((org.telegram.messenger.g0.L(f11) - i27) + ((int) org.telegram.messenger.g0.N(0.5f)));
                    iuVar.setFocusable(true);
                    iuVar.showAsDropDown(view, i27, (((view.getMeasuredHeight() - i15) / 2) + ((-view.getMeasuredHeight()) - i22)) - i14);
                    ryVar.h.requestDisallowInterceptTouchEvent(true);
                    exVar.d1(true);
                    exVar.A1(view);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public void l(int i7) {
        ry ryVar = this.f37859b;
        dh.g gVar = ryVar.f39368k2;
        if (Build.VERSION.SDK_INT >= 31 && gVar != null) {
            if (c8.dd.a(i7, 4)) {
                gVar.h(ryVar.f39378o2.e());
            }
            gVar.e(ryVar.f39370l2, ryVar.getWidth(), ryVar.getHeight());
        }
    }

    @Override
    public void D(float f10, int i7) {
    }
}
