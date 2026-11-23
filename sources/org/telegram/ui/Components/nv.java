package org.telegram.ui.Components;

import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Pair;
import android.view.View;
import java.util.ArrayList;
public final class nv implements ri.m, sj0, el0, te.b {
    public final int f37924a;
    public final qy f37925b;

    public nv(qy qyVar, int i7) {
        this.f37924a = i7;
        this.f37925b = qyVar;
    }

    @Override
    public void K(int i7, float f10, float f11, te.c cVar) {
        this.f37925b.S();
    }

    @Override
    public void a(int i7) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        cy cyVar;
        switch (this.f37924a) {
            case 2:
                qy qyVar = this.f37925b;
                vx vxVar = qyVar.f39065j0;
                int i15 = qyVar.f39047d1;
                ux uxVar = qyVar.f39078o0;
                xx xxVar = qyVar.f39071l0;
                if (i7 != qyVar.f39095t0 || !uxVar.f40499y.isEmpty()) {
                    qyVar.f39062i0.C0();
                    qyVar.f39084q0.k(i7, 0);
                    if (i7 != qyVar.f39092s0 && i7 != qyVar.f39095t0) {
                        ArrayList arrayList = org.telegram.messenger.mp.u1(i15).f25731e4;
                        qyVar.f39068k0.H((String) arrayList.get(i7 - qyVar.f39098u0));
                        int i16 = i7 - qyVar.f39098u0;
                        if (i16 > 0) {
                            xxVar.a((String) arrayList.get(i16 - 1), true);
                        }
                        if (i7 - qyVar.f39098u0 < arrayList.size() - 1) {
                            xxVar.a((String) arrayList.get((i7 - qyVar.f39098u0) + 1), true);
                        }
                    } else {
                        qyVar.f39081p0.d.setText("");
                        if (i7 == qyVar.f39095t0 && (i11 = uxVar.J) >= 1) {
                            vxVar.h1(i11, -org.telegram.messenger.g0.L(4.0f));
                        } else {
                            qx qxVar = qyVar.f39099u1;
                            if (qxVar != null && qxVar.A()) {
                                i10 = 0;
                            } else {
                                i10 = 1;
                            }
                            vxVar.h1(i10, 0);
                        }
                        if (i7 == qyVar.f39095t0) {
                            ArrayList arrayList2 = org.telegram.messenger.mp.u1(i15).f25731e4;
                            if (!arrayList2.isEmpty()) {
                                xxVar.a((String) arrayList2.get(0), true);
                            }
                        }
                    }
                    qyVar.E(2);
                    return;
                }
                return;
            default:
                qy qyVar2 = this.f37925b;
                dw dwVar = qyVar2.H0;
                ArrayList arrayList3 = qyVar2.f39050e1;
                ew ewVar = qyVar2.C0;
                iy iyVar = qyVar2.f39116z0;
                aw awVar = qyVar2.E0;
                if (!qyVar2.T0) {
                    if (i7 == qyVar2.I1) {
                        qyVar2.f39099u1.o(new j41(qyVar2.getContext(), new lw(qyVar2), qyVar2.f39114y1, qyVar2.f39117z1, qyVar2.A1, null, qyVar2.f39037a2));
                        return;
                    }
                    if (dwVar != null && (cyVar = dwVar.f34486r) != null && cyVar.getSelectedCategory() != null) {
                        dwVar.c(null, false);
                        cyVar.I1(null);
                    }
                    if (i7 == qyVar2.G1) {
                        awVar.C0();
                        qyVar2.H(iyVar.E("recent"), 0);
                        qyVar2.E(0);
                        int i17 = qyVar2.G1;
                        if (i17 > 0) {
                            i14 = i17;
                        } else {
                            i14 = qyVar2.F1;
                        }
                        ewVar.k(i17, i14);
                        return;
                    } else if (i7 == qyVar2.H1) {
                        awVar.C0();
                        qyVar2.H(iyVar.E("fav"), 0);
                        qyVar2.E(0);
                        int i18 = qyVar2.H1;
                        if (i18 > 0) {
                            i13 = i18;
                        } else {
                            i13 = qyVar2.F1;
                        }
                        ewVar.k(i18, i13);
                        return;
                    } else if (i7 == qyVar2.J1) {
                        awVar.C0();
                        qyVar2.H(iyVar.E("premium"), 0);
                        qyVar2.E(0);
                        int i19 = qyVar2.J1;
                        if (i19 > 0) {
                            i12 = i19;
                        } else {
                            i12 = qyVar2.F1;
                        }
                        ewVar.k(i19, i12);
                        return;
                    } else {
                        int i20 = i7 - qyVar2.F1;
                        if (i20 < arrayList3.size()) {
                            if (i20 >= arrayList3.size()) {
                                i20 = arrayList3.size() - 1;
                            }
                            qyVar2.J0 = false;
                            awVar.C0();
                            qyVar2.H(iyVar.E(arrayList3.get(i20)), 0);
                            qyVar2.E(0);
                            qyVar2.p(0);
                            int i21 = qyVar2.H1;
                            if (i21 <= 0 && (i21 = qyVar2.G1) <= 0) {
                                i21 = qyVar2.F1;
                            }
                            ewVar.k(i7, i21);
                            qyVar2.Y1 = false;
                            qyVar2.Z();
                            return;
                        }
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public boolean b(int i7, View view) {
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
        qy qyVar = this.f37925b;
        int i15 = qyVar.D1;
        dx dxVar = qyVar.Q;
        int[] iArr = qyVar.E1;
        iu iuVar = qyVar.C1;
        if (view instanceof yx) {
            yx yxVar = (yx) view;
            v4.f1 f1Var = null;
            if (yxVar.f42580c) {
                View F = dxVar.F(view);
                if (F != null) {
                    f1Var = dxVar.T(F);
                }
                if (f1Var != null && f1Var.b() <= qyVar.getRecentEmoji().size()) {
                    qyVar.f39099u1.n();
                }
                dxVar.A1(view);
                return true;
            } else if (yxVar.getSpan() == null && (str = (String) yxVar.getTag()) != null) {
                String replace = str.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
                if (!yxVar.f42580c) {
                    str2 = (String) org.telegram.messenger.j6.f24927j.get(replace);
                } else {
                    str2 = null;
                }
                if (org.telegram.messenger.j4.a(replace, null, null) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 || org.telegram.messenger.k6.f25095l.contains(replace)) {
                    qyVar.S1 = yxVar;
                    qyVar.V1 = qyVar.T1;
                    qyVar.W1 = qyVar.U1;
                    if (z10) {
                        replace = qy.g(replace, str2);
                    } else {
                        int indexOf = org.telegram.messenger.j4.f24916a.indexOf(str2) + 1;
                        hu huVar = iuVar.f36173c;
                        int[] iArr2 = huVar.f35825n;
                        if (iArr2[0] != indexOf) {
                            iArr2[0] = indexOf;
                            huVar.invalidate();
                        }
                    }
                    iuVar.getClass();
                    hu huVar2 = iuVar.f36173c;
                    int i16 = iuVar.f36174e;
                    if (org.telegram.messenger.j4.a(replace, null, null) != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    iuVar.d = z11;
                    int i17 = 3;
                    Drawable[] drawableArr = huVar2.f35821b;
                    int[] iArr3 = huVar2.f35825n;
                    huVar2.f35824f = z11;
                    huVar2.f35823e = replace;
                    int i18 = 5;
                    if (z11) {
                        drawableArr[0] = org.telegram.messenger.j4.a(replace, -1, -1);
                        drawableArr[1] = org.telegram.messenger.j4.a(huVar2.f35823e, 0, -2);
                        drawableArr[2] = org.telegram.messenger.j4.a(huVar2.f35823e, 1, -2);
                        drawableArr[3] = org.telegram.messenger.j4.a(huVar2.f35823e, 2, -2);
                        drawableArr[4] = org.telegram.messenger.j4.a(huVar2.f35823e, 3, -2);
                        drawableArr[5] = org.telegram.messenger.j4.a(huVar2.f35823e, 4, -2);
                        drawableArr[6] = org.telegram.messenger.j4.a(huVar2.f35823e, -2, 0);
                        drawableArr[7] = org.telegram.messenger.j4.a(huVar2.f35823e, -2, 1);
                        drawableArr[8] = org.telegram.messenger.j4.a(huVar2.f35823e, -2, 2);
                        drawableArr[9] = org.telegram.messenger.j4.a(huVar2.f35823e, -2, 3);
                        drawableArr[10] = org.telegram.messenger.j4.a(huVar2.f35823e, -2, 4);
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
                                str3 = qy.g(replace, (String) org.telegram.messenger.j4.f24916a.get(i19 - 1));
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
                    yxVar.getLocationOnScreen(iArr);
                    if (!iuVar.d) {
                        int i23 = huVar2.f35825n[0];
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
                        Point point = org.telegram.messenger.g0.f24226q;
                        if (i26 > point.x - org.telegram.messenger.g0.L(5.0f)) {
                            i13 += ((iArr[0] - i13) + L2) - (point.x - org.telegram.messenger.g0.L(5.0f));
                        }
                    }
                    int i27 = -i13;
                    if (yxVar.getTop() < 0) {
                        i14 = yxVar.getTop();
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
                    qyVar.h.requestDisallowInterceptTouchEvent(true);
                    dxVar.d1(true);
                    dxVar.A1(view);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public void k(int i7) {
        qy qyVar = this.f37925b;
        dh.g gVar = qyVar.f39070k2;
        if (Build.VERSION.SDK_INT >= 31 && gVar != null) {
            if (c8.ed.a(i7, 4)) {
                gVar.h(qyVar.f39080o2.e());
            }
            gVar.e(qyVar.f39072l2, qyVar.getWidth(), qyVar.getHeight());
        }
    }

    @Override
    public void G(float f10, int i7) {
    }
}
