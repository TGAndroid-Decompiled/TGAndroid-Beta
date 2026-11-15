package org.telegram.ui.Components;

import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Pair;
import android.view.View;
import java.util.ArrayList;
public final class iv implements ri.m, ij0, uk0, te.b {
    public final int f35726a;
    public final ly f35727b;

    public iv(ly lyVar, int i7) {
        this.f35726a = i7;
        this.f35727b = lyVar;
    }

    @Override
    public void G(int i7, float f10, float f11, te.c cVar) {
        this.f35727b.S();
    }

    @Override
    public void a(int i7) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        xx xxVar;
        switch (this.f35726a) {
            case 2:
                ly lyVar = this.f35727b;
                rx rxVar = lyVar.f36959j0;
                int i15 = lyVar.f36941d1;
                qx qxVar = lyVar.f36972o0;
                tx txVar = lyVar.f36965l0;
                if (i7 != lyVar.f36989t0 || !qxVar.f38788y.isEmpty()) {
                    lyVar.f36956i0.C0();
                    lyVar.f36978q0.k(i7, 0);
                    if (i7 != lyVar.f36986s0 && i7 != lyVar.f36989t0) {
                        ArrayList arrayList = org.telegram.messenger.np.s1(i15).f25252c4;
                        lyVar.f36962k0.H((String) arrayList.get(i7 - lyVar.f36992u0));
                        int i16 = i7 - lyVar.f36992u0;
                        if (i16 > 0) {
                            txVar.a((String) arrayList.get(i16 - 1), true);
                        }
                        if (i7 - lyVar.f36992u0 < arrayList.size() - 1) {
                            txVar.a((String) arrayList.get((i7 - lyVar.f36992u0) + 1), true);
                        }
                    } else {
                        lyVar.f36975p0.d.setText("");
                        if (i7 == lyVar.f36989t0 && (i11 = qxVar.J) >= 1) {
                            rxVar.h1(i11, -org.telegram.messenger.g0.L(4.0f));
                        } else {
                            mx mxVar = lyVar.f36993u1;
                            if (mxVar != null && mxVar.A()) {
                                i10 = 0;
                            } else {
                                i10 = 1;
                            }
                            rxVar.h1(i10, 0);
                        }
                        if (i7 == lyVar.f36989t0) {
                            ArrayList arrayList2 = org.telegram.messenger.np.s1(i15).f25252c4;
                            if (!arrayList2.isEmpty()) {
                                txVar.a((String) arrayList2.get(0), true);
                            }
                        }
                    }
                    lyVar.F(2);
                    return;
                }
                return;
            default:
                ly lyVar2 = this.f35727b;
                yv yvVar = lyVar2.H0;
                ArrayList arrayList3 = lyVar2.f36944e1;
                zv zvVar = lyVar2.C0;
                dy dyVar = lyVar2.f37010z0;
                vv vvVar = lyVar2.E0;
                if (!lyVar2.T0) {
                    if (i7 == lyVar2.I1) {
                        lyVar2.f36993u1.o(new x31(lyVar2.getContext(), new gw(lyVar2), lyVar2.f37008y1, lyVar2.f37011z1, lyVar2.A1, null, lyVar2.f36931a2));
                        return;
                    }
                    if (yvVar != null && (xxVar = yvVar.f42181r) != null && xxVar.getSelectedCategory() != null) {
                        yvVar.c(null, false);
                        xxVar.I1(null);
                    }
                    if (i7 == lyVar2.G1) {
                        vvVar.C0();
                        lyVar2.I(dyVar.E("recent"), 0);
                        lyVar2.F(0);
                        int i17 = lyVar2.G1;
                        if (i17 > 0) {
                            i14 = i17;
                        } else {
                            i14 = lyVar2.F1;
                        }
                        zvVar.k(i17, i14);
                        return;
                    } else if (i7 == lyVar2.H1) {
                        vvVar.C0();
                        lyVar2.I(dyVar.E("fav"), 0);
                        lyVar2.F(0);
                        int i18 = lyVar2.H1;
                        if (i18 > 0) {
                            i13 = i18;
                        } else {
                            i13 = lyVar2.F1;
                        }
                        zvVar.k(i18, i13);
                        return;
                    } else if (i7 == lyVar2.J1) {
                        vvVar.C0();
                        lyVar2.I(dyVar.E("premium"), 0);
                        lyVar2.F(0);
                        int i19 = lyVar2.J1;
                        if (i19 > 0) {
                            i12 = i19;
                        } else {
                            i12 = lyVar2.F1;
                        }
                        zvVar.k(i19, i12);
                        return;
                    } else {
                        int i20 = i7 - lyVar2.F1;
                        if (i20 < arrayList3.size()) {
                            if (i20 >= arrayList3.size()) {
                                i20 = arrayList3.size() - 1;
                            }
                            lyVar2.J0 = false;
                            vvVar.C0();
                            lyVar2.I(dyVar.E(arrayList3.get(i20)), 0);
                            lyVar2.F(0);
                            lyVar2.p(0);
                            int i21 = lyVar2.H1;
                            if (i21 <= 0 && (i21 = lyVar2.G1) <= 0) {
                                i21 = lyVar2.F1;
                            }
                            zvVar.k(i7, i21);
                            lyVar2.Y1 = false;
                            lyVar2.Z();
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
        ly lyVar = this.f35727b;
        int i15 = lyVar.D1;
        yw ywVar = lyVar.Q;
        int[] iArr = lyVar.E1;
        du duVar = lyVar.C1;
        if (view instanceof ux) {
            ux uxVar = (ux) view;
            v4.e1 e1Var = null;
            if (uxVar.f40181c) {
                View F = ywVar.F(view);
                if (F != null) {
                    e1Var = ywVar.T(F);
                }
                if (e1Var != null && e1Var.b() <= lyVar.getRecentEmoji().size()) {
                    lyVar.f36993u1.n();
                }
                ywVar.A1(view);
                return true;
            } else if (uxVar.getSpan() == null && (str = (String) uxVar.getTag()) != null) {
                String replace = str.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
                if (!uxVar.f40181c) {
                    str2 = (String) org.telegram.messenger.j6.f24532j.get(replace);
                } else {
                    str2 = null;
                }
                if (org.telegram.messenger.h4.a(replace, null, null) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 || org.telegram.messenger.k6.f24651l.contains(replace)) {
                    lyVar.S1 = uxVar;
                    lyVar.V1 = lyVar.T1;
                    lyVar.W1 = lyVar.U1;
                    if (z10) {
                        replace = ly.g(replace, str2);
                    } else {
                        int indexOf = org.telegram.messenger.h4.f24056a.indexOf(str2) + 1;
                        cu cuVar = duVar.f34056c;
                        int[] iArr2 = cuVar.f33680n;
                        if (iArr2[0] != indexOf) {
                            iArr2[0] = indexOf;
                            cuVar.invalidate();
                        }
                    }
                    duVar.getClass();
                    cu cuVar2 = duVar.f34056c;
                    int i16 = duVar.f34057e;
                    if (org.telegram.messenger.h4.a(replace, null, null) != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    duVar.d = z11;
                    int i17 = 3;
                    Drawable[] drawableArr = cuVar2.f33676b;
                    int[] iArr3 = cuVar2.f33680n;
                    cuVar2.f33679f = z11;
                    cuVar2.f33678e = replace;
                    int i18 = 5;
                    if (z11) {
                        drawableArr[0] = org.telegram.messenger.h4.a(replace, -1, -1);
                        drawableArr[1] = org.telegram.messenger.h4.a(cuVar2.f33678e, 0, -2);
                        drawableArr[2] = org.telegram.messenger.h4.a(cuVar2.f33678e, 1, -2);
                        drawableArr[3] = org.telegram.messenger.h4.a(cuVar2.f33678e, 2, -2);
                        drawableArr[4] = org.telegram.messenger.h4.a(cuVar2.f33678e, 3, -2);
                        drawableArr[5] = org.telegram.messenger.h4.a(cuVar2.f33678e, 4, -2);
                        drawableArr[6] = org.telegram.messenger.h4.a(cuVar2.f33678e, -2, 0);
                        drawableArr[7] = org.telegram.messenger.h4.a(cuVar2.f33678e, -2, 1);
                        drawableArr[8] = org.telegram.messenger.h4.a(cuVar2.f33678e, -2, 2);
                        drawableArr[9] = org.telegram.messenger.h4.a(cuVar2.f33678e, -2, 3);
                        drawableArr[10] = org.telegram.messenger.h4.a(cuVar2.f33678e, -2, 4);
                        Pair c10 = org.telegram.messenger.h4.c(replace);
                        if (c10 != null) {
                            int intValue = ((Integer) c10.first).intValue();
                            if (iArr3[0] != intValue) {
                                iArr3[0] = intValue;
                                cuVar2.invalidate();
                            }
                            int intValue2 = ((Integer) c10.second).intValue();
                            if (iArr3[1] != intValue2) {
                                iArr3[1] = intValue2;
                                cuVar2.invalidate();
                            }
                            if (iArr3[0] == iArr3[1]) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            cuVar2.H = z12;
                        }
                        cuVar2.J = true;
                    } else {
                        for (int i19 = 0; i19 < 6; i19++) {
                            if (i19 != 0) {
                                str3 = ly.g(replace, (String) org.telegram.messenger.h4.f24056a.get(i19 - 1));
                            } else {
                                str3 = replace;
                            }
                            drawableArr[i19] = org.telegram.messenger.j6.f(str3);
                        }
                    }
                    cuVar2.invalidate();
                    int i20 = i16 * 6;
                    if (duVar.d) {
                        i10 = 3;
                    } else {
                        i10 = 0;
                    }
                    duVar.setWidth(org.telegram.messenger.g0.L(i10 + 30) + i20);
                    float f12 = 15.0f;
                    if (duVar.d) {
                        f10 = 11.66f;
                    } else {
                        f10 = 15.0f;
                    }
                    int L = org.telegram.messenger.g0.L(f10);
                    if (duVar.d) {
                        i11 = 2;
                    } else {
                        i11 = 1;
                    }
                    duVar.setHeight((i11 * i16) + L);
                    int i21 = i16 * 6;
                    if (!duVar.d) {
                        i17 = 0;
                    }
                    int L2 = org.telegram.messenger.g0.L(i17 + 30) + i21;
                    if (duVar.d) {
                        f12 = 11.66f;
                    }
                    int L3 = org.telegram.messenger.g0.L(f12);
                    if (duVar.d) {
                        i12 = 2;
                    } else {
                        i12 = 1;
                    }
                    int i22 = (i12 * i16) + L3;
                    uxVar.getLocationOnScreen(iArr);
                    if (!duVar.d) {
                        int i23 = cuVar2.f33680n[0];
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
                        i13 = org.telegram.messenger.i20.D(5.0f, iArr[0] - i13, i13);
                    } else {
                        int i26 = (iArr[0] - i13) + L2;
                        Point point = org.telegram.messenger.g0.f23611q;
                        if (i26 > point.x - org.telegram.messenger.g0.L(5.0f)) {
                            i13 += ((iArr[0] - i13) + L2) - (point.x - org.telegram.messenger.g0.L(5.0f));
                        }
                    }
                    int i27 = -i13;
                    if (uxVar.getTop() < 0) {
                        i14 = uxVar.getTop();
                    } else {
                        i14 = 0;
                    }
                    if (org.telegram.messenger.g0.Q1()) {
                        f11 = 30.0f;
                    } else {
                        f11 = 22.0f;
                    }
                    cuVar2.setArrowX((org.telegram.messenger.g0.L(f11) - i27) + ((int) org.telegram.messenger.g0.N(0.5f)));
                    duVar.setFocusable(true);
                    duVar.showAsDropDown(view, i27, (((view.getMeasuredHeight() - i15) / 2) + ((-view.getMeasuredHeight()) - i22)) - i14);
                    lyVar.h.requestDisallowInterceptTouchEvent(true);
                    ywVar.d1(true);
                    ywVar.A1(view);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public void l(int i7) {
        ly lyVar = this.f35727b;
        dh.g gVar = lyVar.f36964k2;
        if (Build.VERSION.SDK_INT >= 31 && gVar != null) {
            if (c8.zc.a(i7, 4)) {
                gVar.h(lyVar.f36974o2.e());
            }
            gVar.e(lyVar.f36966l2, lyVar.getWidth(), lyVar.getHeight());
        }
    }

    @Override
    public void E(float f10, int i7) {
    }
}
