package org.telegram.ui.Components;

import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Pair;
import android.view.View;
import java.util.ArrayList;
public final class cv implements oi.m, dj0, pk0, te.b {
    public final int f32671a;
    public final gy f32672b;

    public cv(gy gyVar, int i7) {
        this.f32671a = i7;
        this.f32672b = gyVar;
    }

    @Override
    public void Y(int i7, float f10, float f11, te.c cVar) {
        this.f32672b.R();
    }

    @Override
    public void a(int i7) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        sx sxVar;
        switch (this.f32671a) {
            case 2:
                gy gyVar = this.f32672b;
                mx mxVar = gyVar.f34050i0;
                int i15 = gyVar.f34032c1;
                lx lxVar = gyVar.f34064n0;
                ox oxVar = gyVar.f34056k0;
                if (i7 != gyVar.f34080s0 || !lxVar.f35788y.isEmpty()) {
                    gyVar.f34047h0.C0();
                    gyVar.f34069p0.k(i7, 0);
                    if (i7 != gyVar.f34076r0 && i7 != gyVar.f34080s0) {
                        ArrayList arrayList = org.telegram.messenger.qp.s1(i15).f24736b4;
                        gyVar.f34053j0.H((String) arrayList.get(i7 - gyVar.f34083t0));
                        int i16 = i7 - gyVar.f34083t0;
                        if (i16 > 0) {
                            oxVar.a((String) arrayList.get(i16 - 1), true);
                        }
                        if (i7 - gyVar.f34083t0 < arrayList.size() - 1) {
                            oxVar.a((String) arrayList.get((i7 - gyVar.f34083t0) + 1), true);
                        }
                    } else {
                        gyVar.f34066o0.d.setText("");
                        if (i7 == gyVar.f34080s0 && (i11 = lxVar.I) >= 1) {
                            mxVar.h1(i11, -org.telegram.messenger.g0.L(4.0f));
                        } else {
                            hx hxVar = gyVar.f34084t1;
                            if (hxVar != null && hxVar.A()) {
                                i10 = 0;
                            } else {
                                i10 = 1;
                            }
                            mxVar.h1(i10, 0);
                        }
                        if (i7 == gyVar.f34080s0) {
                            ArrayList arrayList2 = org.telegram.messenger.qp.s1(i15).f24736b4;
                            if (!arrayList2.isEmpty()) {
                                oxVar.a((String) arrayList2.get(0), true);
                            }
                        }
                    }
                    gyVar.E(2);
                    return;
                }
                return;
            default:
                gy gyVar2 = this.f32672b;
                sv svVar = gyVar2.G0;
                ArrayList arrayList3 = gyVar2.f34035d1;
                tv tvVar = gyVar2.B0;
                xx xxVar = gyVar2.f34101y0;
                pv pvVar = gyVar2.D0;
                if (!gyVar2.S0) {
                    if (i7 == gyVar2.H1) {
                        gyVar2.f34084t1.o(new t31(gyVar2.getContext(), new aw(gyVar2), gyVar2.f34098x1, gyVar2.f34102y1, gyVar2.f34105z1, null, gyVar2.Z1));
                        return;
                    }
                    if (svVar != null && (sxVar = svVar.f38414r) != null && sxVar.getSelectedCategory() != null) {
                        svVar.c(null, false);
                        sxVar.I1(null);
                    }
                    if (i7 == gyVar2.F1) {
                        pvVar.C0();
                        gyVar2.H(xxVar.E("recent"), 0);
                        gyVar2.E(0);
                        int i17 = gyVar2.F1;
                        if (i17 > 0) {
                            i14 = i17;
                        } else {
                            i14 = gyVar2.E1;
                        }
                        tvVar.k(i17, i14);
                        return;
                    } else if (i7 == gyVar2.G1) {
                        pvVar.C0();
                        gyVar2.H(xxVar.E("fav"), 0);
                        gyVar2.E(0);
                        int i18 = gyVar2.G1;
                        if (i18 > 0) {
                            i13 = i18;
                        } else {
                            i13 = gyVar2.E1;
                        }
                        tvVar.k(i18, i13);
                        return;
                    } else if (i7 == gyVar2.I1) {
                        pvVar.C0();
                        gyVar2.H(xxVar.E("premium"), 0);
                        gyVar2.E(0);
                        int i19 = gyVar2.I1;
                        if (i19 > 0) {
                            i12 = i19;
                        } else {
                            i12 = gyVar2.E1;
                        }
                        tvVar.k(i19, i12);
                        return;
                    } else {
                        int i20 = i7 - gyVar2.E1;
                        if (i20 < arrayList3.size()) {
                            if (i20 >= arrayList3.size()) {
                                i20 = arrayList3.size() - 1;
                            }
                            gyVar2.I0 = false;
                            pvVar.C0();
                            gyVar2.H(xxVar.E(arrayList3.get(i20)), 0);
                            gyVar2.E(0);
                            gyVar2.p(0);
                            int i21 = gyVar2.G1;
                            if (i21 <= 0 && (i21 = gyVar2.F1) <= 0) {
                                i21 = gyVar2.E1;
                            }
                            tvVar.k(i7, i21);
                            gyVar2.X1 = false;
                            gyVar2.Z();
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
        boolean z9;
        boolean z10;
        String str3;
        int i10;
        float f10;
        int i11;
        int i12;
        int i13;
        int i14;
        float f11;
        boolean z11;
        gy gyVar = this.f32672b;
        int i15 = gyVar.C1;
        sw swVar = gyVar.P;
        int[] iArr = gyVar.D1;
        xt xtVar = gyVar.B1;
        if (view instanceof px) {
            px pxVar = (px) view;
            v4.d1 d1Var = null;
            if (pxVar.f37090c) {
                View F = swVar.F(view);
                if (F != null) {
                    d1Var = swVar.T(F);
                }
                if (d1Var != null && d1Var.b() <= gyVar.getRecentEmoji().size()) {
                    gyVar.f34084t1.n();
                }
                swVar.A1(view);
                return true;
            } else if (pxVar.getSpan() == null && (str = (String) pxVar.getTag()) != null) {
                String replace = str.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
                if (!pxVar.f37090c) {
                    str2 = (String) org.telegram.messenger.i6.f23069j.get(replace);
                } else {
                    str2 = null;
                }
                if (org.telegram.messenger.h4.a(replace, null, null) != null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9 || org.telegram.messenger.j6.f23491l.contains(replace)) {
                    gyVar.R1 = pxVar;
                    gyVar.U1 = gyVar.S1;
                    gyVar.V1 = gyVar.T1;
                    if (z9) {
                        replace = gy.g(replace, str2);
                    } else {
                        int indexOf = org.telegram.messenger.h4.f22834a.indexOf(str2) + 1;
                        wt wtVar = xtVar.f40450c;
                        int[] iArr2 = wtVar.f40094n;
                        if (iArr2[0] != indexOf) {
                            iArr2[0] = indexOf;
                            wtVar.invalidate();
                        }
                    }
                    xtVar.getClass();
                    wt wtVar2 = xtVar.f40450c;
                    int i16 = xtVar.f40451e;
                    if (org.telegram.messenger.h4.a(replace, null, null) != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    xtVar.d = z10;
                    int i17 = 3;
                    Drawable[] drawableArr = wtVar2.f40090b;
                    int[] iArr3 = wtVar2.f40094n;
                    wtVar2.f40093f = z10;
                    wtVar2.f40092e = replace;
                    int i18 = 5;
                    if (z10) {
                        drawableArr[0] = org.telegram.messenger.h4.a(replace, -1, -1);
                        drawableArr[1] = org.telegram.messenger.h4.a(wtVar2.f40092e, 0, -2);
                        drawableArr[2] = org.telegram.messenger.h4.a(wtVar2.f40092e, 1, -2);
                        drawableArr[3] = org.telegram.messenger.h4.a(wtVar2.f40092e, 2, -2);
                        drawableArr[4] = org.telegram.messenger.h4.a(wtVar2.f40092e, 3, -2);
                        drawableArr[5] = org.telegram.messenger.h4.a(wtVar2.f40092e, 4, -2);
                        drawableArr[6] = org.telegram.messenger.h4.a(wtVar2.f40092e, -2, 0);
                        drawableArr[7] = org.telegram.messenger.h4.a(wtVar2.f40092e, -2, 1);
                        drawableArr[8] = org.telegram.messenger.h4.a(wtVar2.f40092e, -2, 2);
                        drawableArr[9] = org.telegram.messenger.h4.a(wtVar2.f40092e, -2, 3);
                        drawableArr[10] = org.telegram.messenger.h4.a(wtVar2.f40092e, -2, 4);
                        Pair c10 = org.telegram.messenger.h4.c(replace);
                        if (c10 != null) {
                            int intValue = ((Integer) c10.first).intValue();
                            if (iArr3[0] != intValue) {
                                iArr3[0] = intValue;
                                wtVar2.invalidate();
                            }
                            int intValue2 = ((Integer) c10.second).intValue();
                            if (iArr3[1] != intValue2) {
                                iArr3[1] = intValue2;
                                wtVar2.invalidate();
                            }
                            if (iArr3[0] == iArr3[1]) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            wtVar2.G = z11;
                        }
                        wtVar2.I = true;
                    } else {
                        for (int i19 = 0; i19 < 6; i19++) {
                            if (i19 != 0) {
                                str3 = gy.g(replace, (String) org.telegram.messenger.h4.f22834a.get(i19 - 1));
                            } else {
                                str3 = replace;
                            }
                            drawableArr[i19] = org.telegram.messenger.i6.f(str3);
                        }
                    }
                    wtVar2.invalidate();
                    int i20 = i16 * 6;
                    if (xtVar.d) {
                        i10 = 3;
                    } else {
                        i10 = 0;
                    }
                    xtVar.setWidth(org.telegram.messenger.g0.L(i10 + 30) + i20);
                    float f12 = 15.0f;
                    if (xtVar.d) {
                        f10 = 11.66f;
                    } else {
                        f10 = 15.0f;
                    }
                    int L = org.telegram.messenger.g0.L(f10);
                    if (xtVar.d) {
                        i11 = 2;
                    } else {
                        i11 = 1;
                    }
                    xtVar.setHeight((i11 * i16) + L);
                    int i21 = i16 * 6;
                    if (!xtVar.d) {
                        i17 = 0;
                    }
                    int L2 = org.telegram.messenger.g0.L(i17 + 30) + i21;
                    if (xtVar.d) {
                        f12 = 11.66f;
                    }
                    int L3 = org.telegram.messenger.g0.L(f12);
                    if (xtVar.d) {
                        i12 = 2;
                    } else {
                        i12 = 1;
                    }
                    int i22 = (i12 * i16) + L3;
                    pxVar.getLocationOnScreen(iArr);
                    if (!xtVar.d) {
                        int i23 = wtVar2.f40094n[0];
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
                        Point point = org.telegram.messenger.g0.f22544q;
                        if (i26 > point.x - org.telegram.messenger.g0.L(5.0f)) {
                            i13 += ((iArr[0] - i13) + L2) - (point.x - org.telegram.messenger.g0.L(5.0f));
                        }
                    }
                    int i27 = -i13;
                    if (pxVar.getTop() < 0) {
                        i14 = pxVar.getTop();
                    } else {
                        i14 = 0;
                    }
                    if (org.telegram.messenger.g0.Q1()) {
                        f11 = 30.0f;
                    } else {
                        f11 = 22.0f;
                    }
                    wtVar2.setArrowX((org.telegram.messenger.g0.L(f11) - i27) + ((int) org.telegram.messenger.g0.N(0.5f)));
                    xtVar.setFocusable(true);
                    xtVar.showAsDropDown(view, i27, (((view.getMeasuredHeight() - i15) / 2) + ((-view.getMeasuredHeight()) - i22)) - i14);
                    gyVar.h.requestDisallowInterceptTouchEvent(true);
                    swVar.d1(true);
                    swVar.A1(view);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public void l(int i7) {
        gy gyVar = this.f32672b;
        dh.g gVar = gyVar.f34055j2;
        if (Build.VERSION.SDK_INT >= 31 && gVar != null) {
            if (c8.zc.a(i7, 4)) {
                gVar.h(gyVar.f34065n2.e());
            }
            gVar.e(gyVar.f34058k2, gyVar.getWidth(), gyVar.getHeight());
        }
    }

    @Override
    public void F(float f10, int i7) {
    }
}
