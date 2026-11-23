package org.telegram.ui.Components;

import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Pair;
import android.view.View;
import java.util.ArrayList;
public final class pv implements ri.m, sj0, el0, te.b {
    public final int f38621a;
    public final ty f38622b;

    public pv(ty tyVar, int i7) {
        this.f38621a = i7;
        this.f38622b = tyVar;
    }

    @Override
    public void H(int i7, float f10, float f11, te.c cVar) {
        this.f38622b.S();
    }

    @Override
    public void a(int i7) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        fy fyVar;
        switch (this.f38621a) {
            case 2:
                ty tyVar = this.f38622b;
                yx yxVar = tyVar.f40092j0;
                int i15 = tyVar.f40074d1;
                xx xxVar = tyVar.f40105o0;
                ay ayVar = tyVar.f40098l0;
                if (i7 != tyVar.f40122t0 || !xxVar.f42221y.isEmpty()) {
                    tyVar.f40089i0.C0();
                    tyVar.f40111q0.k(i7, 0);
                    if (i7 != tyVar.f40119s0 && i7 != tyVar.f40122t0) {
                        ArrayList arrayList = org.telegram.messenger.np.u1(i15).f25799e4;
                        tyVar.f40095k0.H((String) arrayList.get(i7 - tyVar.f40125u0));
                        int i16 = i7 - tyVar.f40125u0;
                        if (i16 > 0) {
                            ayVar.a((String) arrayList.get(i16 - 1), true);
                        }
                        if (i7 - tyVar.f40125u0 < arrayList.size() - 1) {
                            ayVar.a((String) arrayList.get((i7 - tyVar.f40125u0) + 1), true);
                        }
                    } else {
                        tyVar.f40108p0.d.setText("");
                        if (i7 == tyVar.f40122t0 && (i11 = xxVar.J) >= 1) {
                            yxVar.h1(i11, -org.telegram.messenger.g0.L(4.0f));
                        } else {
                            tx txVar = tyVar.f40126u1;
                            if (txVar != null && txVar.A()) {
                                i10 = 0;
                            } else {
                                i10 = 1;
                            }
                            yxVar.h1(i10, 0);
                        }
                        if (i7 == tyVar.f40122t0) {
                            ArrayList arrayList2 = org.telegram.messenger.np.u1(i15).f25799e4;
                            if (!arrayList2.isEmpty()) {
                                ayVar.a((String) arrayList2.get(0), true);
                            }
                        }
                    }
                    tyVar.F(2);
                    return;
                }
                return;
            default:
                ty tyVar2 = this.f38622b;
                gw gwVar = tyVar2.H0;
                ArrayList arrayList3 = tyVar2.f40077e1;
                hw hwVar = tyVar2.C0;
                ly lyVar = tyVar2.f40143z0;
                cw cwVar = tyVar2.E0;
                if (!tyVar2.T0) {
                    if (i7 == tyVar2.I1) {
                        tyVar2.f40126u1.o(new k41(tyVar2.getContext(), new ow(tyVar2), tyVar2.f40141y1, tyVar2.f40144z1, tyVar2.A1, null, tyVar2.f40064a2));
                        return;
                    }
                    if (gwVar != null && (fyVar = gwVar.f35671r) != null && fyVar.getSelectedCategory() != null) {
                        gwVar.c(null, false);
                        fyVar.I1(null);
                    }
                    if (i7 == tyVar2.G1) {
                        cwVar.C0();
                        tyVar2.I(lyVar.E("recent"), 0);
                        tyVar2.F(0);
                        int i17 = tyVar2.G1;
                        if (i17 > 0) {
                            i14 = i17;
                        } else {
                            i14 = tyVar2.F1;
                        }
                        hwVar.k(i17, i14);
                        return;
                    } else if (i7 == tyVar2.H1) {
                        cwVar.C0();
                        tyVar2.I(lyVar.E("fav"), 0);
                        tyVar2.F(0);
                        int i18 = tyVar2.H1;
                        if (i18 > 0) {
                            i13 = i18;
                        } else {
                            i13 = tyVar2.F1;
                        }
                        hwVar.k(i18, i13);
                        return;
                    } else if (i7 == tyVar2.J1) {
                        cwVar.C0();
                        tyVar2.I(lyVar.E("premium"), 0);
                        tyVar2.F(0);
                        int i19 = tyVar2.J1;
                        if (i19 > 0) {
                            i12 = i19;
                        } else {
                            i12 = tyVar2.F1;
                        }
                        hwVar.k(i19, i12);
                        return;
                    } else {
                        int i20 = i7 - tyVar2.F1;
                        if (i20 < arrayList3.size()) {
                            if (i20 >= arrayList3.size()) {
                                i20 = arrayList3.size() - 1;
                            }
                            tyVar2.J0 = false;
                            cwVar.C0();
                            tyVar2.I(lyVar.E(arrayList3.get(i20)), 0);
                            tyVar2.F(0);
                            tyVar2.p(0);
                            int i21 = tyVar2.H1;
                            if (i21 <= 0 && (i21 = tyVar2.G1) <= 0) {
                                i21 = tyVar2.F1;
                            }
                            hwVar.k(i7, i21);
                            tyVar2.Y1 = false;
                            tyVar2.Z();
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
        ty tyVar = this.f38622b;
        int i15 = tyVar.D1;
        gx gxVar = tyVar.Q;
        int[] iArr = tyVar.E1;
        ku kuVar = tyVar.C1;
        if (view instanceof cy) {
            cy cyVar = (cy) view;
            v4.e1 e1Var = null;
            if (cyVar.f34289c) {
                View F = gxVar.F(view);
                if (F != null) {
                    e1Var = gxVar.T(F);
                }
                if (e1Var != null && e1Var.b() <= tyVar.getRecentEmoji().size()) {
                    tyVar.f40126u1.n();
                }
                gxVar.A1(view);
                return true;
            } else if (cyVar.getSpan() == null && (str = (String) cyVar.getTag()) != null) {
                String replace = str.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
                if (!cyVar.f34289c) {
                    str2 = (String) org.telegram.messenger.j6.f24801j.get(replace);
                } else {
                    str2 = null;
                }
                if (org.telegram.messenger.j4.a(replace, null, null) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 || org.telegram.messenger.k6.f24990l.contains(replace)) {
                    tyVar.S1 = cyVar;
                    tyVar.V1 = tyVar.T1;
                    tyVar.W1 = tyVar.U1;
                    if (z10) {
                        replace = ty.g(replace, str2);
                    } else {
                        int indexOf = org.telegram.messenger.j4.f24790a.indexOf(str2) + 1;
                        ju juVar = kuVar.f36952c;
                        int[] iArr2 = juVar.f36646n;
                        if (iArr2[0] != indexOf) {
                            iArr2[0] = indexOf;
                            juVar.invalidate();
                        }
                    }
                    kuVar.getClass();
                    ju juVar2 = kuVar.f36952c;
                    int i16 = kuVar.f36953e;
                    if (org.telegram.messenger.j4.a(replace, null, null) != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    kuVar.d = z11;
                    int i17 = 3;
                    Drawable[] drawableArr = juVar2.f36642b;
                    int[] iArr3 = juVar2.f36646n;
                    juVar2.f36645f = z11;
                    juVar2.f36644e = replace;
                    int i18 = 5;
                    if (z11) {
                        drawableArr[0] = org.telegram.messenger.j4.a(replace, -1, -1);
                        drawableArr[1] = org.telegram.messenger.j4.a(juVar2.f36644e, 0, -2);
                        drawableArr[2] = org.telegram.messenger.j4.a(juVar2.f36644e, 1, -2);
                        drawableArr[3] = org.telegram.messenger.j4.a(juVar2.f36644e, 2, -2);
                        drawableArr[4] = org.telegram.messenger.j4.a(juVar2.f36644e, 3, -2);
                        drawableArr[5] = org.telegram.messenger.j4.a(juVar2.f36644e, 4, -2);
                        drawableArr[6] = org.telegram.messenger.j4.a(juVar2.f36644e, -2, 0);
                        drawableArr[7] = org.telegram.messenger.j4.a(juVar2.f36644e, -2, 1);
                        drawableArr[8] = org.telegram.messenger.j4.a(juVar2.f36644e, -2, 2);
                        drawableArr[9] = org.telegram.messenger.j4.a(juVar2.f36644e, -2, 3);
                        drawableArr[10] = org.telegram.messenger.j4.a(juVar2.f36644e, -2, 4);
                        Pair c10 = org.telegram.messenger.j4.c(replace);
                        if (c10 != null) {
                            int intValue = ((Integer) c10.first).intValue();
                            if (iArr3[0] != intValue) {
                                iArr3[0] = intValue;
                                juVar2.invalidate();
                            }
                            int intValue2 = ((Integer) c10.second).intValue();
                            if (iArr3[1] != intValue2) {
                                iArr3[1] = intValue2;
                                juVar2.invalidate();
                            }
                            if (iArr3[0] == iArr3[1]) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            juVar2.H = z12;
                        }
                        juVar2.J = true;
                    } else {
                        for (int i19 = 0; i19 < 6; i19++) {
                            if (i19 != 0) {
                                str3 = ty.g(replace, (String) org.telegram.messenger.j4.f24790a.get(i19 - 1));
                            } else {
                                str3 = replace;
                            }
                            drawableArr[i19] = org.telegram.messenger.j6.f(str3);
                        }
                    }
                    juVar2.invalidate();
                    int i20 = i16 * 6;
                    if (kuVar.d) {
                        i10 = 3;
                    } else {
                        i10 = 0;
                    }
                    kuVar.setWidth(org.telegram.messenger.g0.L(i10 + 30) + i20);
                    float f12 = 15.0f;
                    if (kuVar.d) {
                        f10 = 11.66f;
                    } else {
                        f10 = 15.0f;
                    }
                    int L = org.telegram.messenger.g0.L(f10);
                    if (kuVar.d) {
                        i11 = 2;
                    } else {
                        i11 = 1;
                    }
                    kuVar.setHeight((i11 * i16) + L);
                    int i21 = i16 * 6;
                    if (!kuVar.d) {
                        i17 = 0;
                    }
                    int L2 = org.telegram.messenger.g0.L(i17 + 30) + i21;
                    if (kuVar.d) {
                        f12 = 11.66f;
                    }
                    int L3 = org.telegram.messenger.g0.L(f12);
                    if (kuVar.d) {
                        i12 = 2;
                    } else {
                        i12 = 1;
                    }
                    int i22 = (i12 * i16) + L3;
                    cyVar.getLocationOnScreen(iArr);
                    if (!kuVar.d) {
                        int i23 = juVar2.f36646n[0];
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
                        Point point = org.telegram.messenger.g0.f24010q;
                        if (i26 > point.x - org.telegram.messenger.g0.L(5.0f)) {
                            i13 += ((iArr[0] - i13) + L2) - (point.x - org.telegram.messenger.g0.L(5.0f));
                        }
                    }
                    int i27 = -i13;
                    if (cyVar.getTop() < 0) {
                        i14 = cyVar.getTop();
                    } else {
                        i14 = 0;
                    }
                    if (org.telegram.messenger.g0.Q1()) {
                        f11 = 30.0f;
                    } else {
                        f11 = 22.0f;
                    }
                    juVar2.setArrowX((org.telegram.messenger.g0.L(f11) - i27) + ((int) org.telegram.messenger.g0.N(0.5f)));
                    kuVar.setFocusable(true);
                    kuVar.showAsDropDown(view, i27, (((view.getMeasuredHeight() - i15) / 2) + ((-view.getMeasuredHeight()) - i22)) - i14);
                    tyVar.h.requestDisallowInterceptTouchEvent(true);
                    gxVar.d1(true);
                    gxVar.A1(view);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public void l(int i7) {
        ty tyVar = this.f38622b;
        dh.g gVar = tyVar.f40097k2;
        if (Build.VERSION.SDK_INT >= 31 && gVar != null) {
            if (c8.ed.a(i7, 4)) {
                gVar.h(tyVar.f40107o2.e());
            }
            gVar.e(tyVar.f40099l2, tyVar.getWidth(), tyVar.getHeight());
        }
    }

    @Override
    public void D(float f10, int i7) {
    }
}
