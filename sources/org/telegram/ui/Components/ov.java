package org.telegram.ui.Components;

import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Pair;
import android.view.View;
import java.util.ArrayList;
public final class ov implements ei.n, jk0, tl0, fe.e {
    public final int f29231a;
    public final vy f29232b;

    public ov(vy vyVar, int i10) {
        this.f29231a = i10;
        this.f29232b = vyVar;
    }

    @Override
    public void a(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        hy hyVar;
        switch (this.f29231a) {
            case 2:
                vy vyVar = this.f29232b;
                ay ayVar = vyVar.f31961i0;
                int i16 = vyVar.f31943c1;
                zx zxVar = vyVar.f31975n0;
                dy dyVar = vyVar.f31967k0;
                if (i10 != vyVar.f31992s0 || !zxVar.f33253y.isEmpty()) {
                    vyVar.f31958h0.C0();
                    vyVar.f31981p0.k(i10, 0);
                    if (i10 != vyVar.f31988r0 && i10 != vyVar.f31992s0) {
                        ArrayList arrayList = org.telegram.messenger.wp.r1(i16).f19109d4;
                        vyVar.f31964j0.H((String) arrayList.get(i10 - vyVar.f31995t0));
                        int i17 = i10 - vyVar.f31995t0;
                        if (i17 > 0) {
                            dyVar.a((String) arrayList.get(i17 - 1), true);
                        }
                        if (i10 - vyVar.f31995t0 < arrayList.size() - 1) {
                            dyVar.a((String) arrayList.get((i10 - vyVar.f31995t0) + 1), true);
                        }
                    } else {
                        vyVar.f31978o0.d.setText("");
                        if (i10 == vyVar.f31992s0 && (i12 = zxVar.I) >= 1) {
                            ayVar.h1(i12, -org.telegram.messenger.i0.L(4.0f));
                        } else {
                            vx vxVar = vyVar.f31996t1;
                            if (vxVar != null && vxVar.A()) {
                                i11 = 0;
                            } else {
                                i11 = 1;
                            }
                            ayVar.h1(i11, 0);
                        }
                        if (i10 == vyVar.f31992s0) {
                            ArrayList arrayList2 = org.telegram.messenger.wp.r1(i16).f19109d4;
                            if (!arrayList2.isEmpty()) {
                                dyVar.a((String) arrayList2.get(0), true);
                            }
                        }
                    }
                    vyVar.G(2);
                    return;
                }
                return;
            default:
                vy vyVar2 = this.f29232b;
                fw fwVar = vyVar2.G0;
                ArrayList arrayList3 = vyVar2.f31946d1;
                gw gwVar = vyVar2.B0;
                ny nyVar = vyVar2.f32013y0;
                bw bwVar = vyVar2.D0;
                if (!vyVar2.S0) {
                    if (i10 == vyVar2.H1) {
                        vyVar2.f31996t1.o(new x41(vyVar2.getContext(), new ow(vyVar2), vyVar2.f32010x1, vyVar2.f32014y1, vyVar2.f32017z1, null, vyVar2.Z1));
                        return;
                    }
                    if (fwVar != null && (hyVar = fwVar.f27204r) != null && hyVar.getSelectedCategory() != null) {
                        fwVar.c(null, false);
                        hyVar.I1(null);
                    }
                    if (i10 == vyVar2.F1) {
                        bwVar.C0();
                        vyVar2.I(nyVar.E("recent"), 0);
                        vyVar2.G(0);
                        int i18 = vyVar2.F1;
                        if (i18 > 0) {
                            i15 = i18;
                        } else {
                            i15 = vyVar2.E1;
                        }
                        gwVar.k(i18, i15);
                        return;
                    } else if (i10 == vyVar2.G1) {
                        bwVar.C0();
                        vyVar2.I(nyVar.E("fav"), 0);
                        vyVar2.G(0);
                        int i19 = vyVar2.G1;
                        if (i19 > 0) {
                            i14 = i19;
                        } else {
                            i14 = vyVar2.E1;
                        }
                        gwVar.k(i19, i14);
                        return;
                    } else if (i10 == vyVar2.I1) {
                        bwVar.C0();
                        vyVar2.I(nyVar.E("premium"), 0);
                        vyVar2.G(0);
                        int i20 = vyVar2.I1;
                        if (i20 > 0) {
                            i13 = i20;
                        } else {
                            i13 = vyVar2.E1;
                        }
                        gwVar.k(i20, i13);
                        return;
                    } else {
                        int i21 = i10 - vyVar2.E1;
                        if (i21 < arrayList3.size()) {
                            if (i21 >= arrayList3.size()) {
                                i21 = arrayList3.size() - 1;
                            }
                            vyVar2.I0 = false;
                            bwVar.C0();
                            vyVar2.I(nyVar.E(arrayList3.get(i21)), 0);
                            vyVar2.G(0);
                            vyVar2.p(0);
                            int i22 = vyVar2.G1;
                            if (i22 <= 0 && (i22 = vyVar2.F1) <= 0) {
                                i22 = vyVar2.E1;
                            }
                            gwVar.k(i10, i22);
                            vyVar2.X1 = false;
                            vyVar2.Z();
                            return;
                        }
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public boolean f(int i10, View view) {
        String str;
        String str2;
        boolean z10;
        boolean z11;
        String str3;
        int i11;
        float f7;
        int i12;
        int i13;
        int i14;
        int i15;
        float f10;
        boolean z12;
        vy vyVar = this.f29232b;
        int i16 = vyVar.C1;
        hx hxVar = vyVar.P;
        int[] iArr = vyVar.D1;
        ju juVar = vyVar.B1;
        if (view instanceof ey) {
            ey eyVar = (ey) view;
            s4.c1 c1Var = null;
            if (eyVar.f25967c) {
                View F = hxVar.F(view);
                if (F != null) {
                    c1Var = hxVar.T(F);
                }
                if (c1Var != null && c1Var.b() <= vyVar.getRecentEmoji().size()) {
                    vyVar.f31996t1.n();
                }
                hxVar.A1(view);
                return true;
            } else if (eyVar.getSpan() == null && (str = (String) eyVar.getTag()) != null) {
                String replace = str.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
                if (!eyVar.f25967c) {
                    str2 = (String) org.telegram.messenger.k6.f16570j.get(replace);
                } else {
                    str2 = null;
                }
                if (org.telegram.messenger.k4.a(replace, null, null) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 || org.telegram.messenger.l6.f16899l.contains(replace)) {
                    vyVar.R1 = eyVar;
                    vyVar.U1 = vyVar.S1;
                    vyVar.V1 = vyVar.T1;
                    if (z10) {
                        replace = vy.g(replace, str2);
                    } else {
                        int indexOf = org.telegram.messenger.k4.f16557a.indexOf(str2) + 1;
                        iu iuVar = juVar.f27577c;
                        int[] iArr2 = iuVar.f27171n;
                        if (iArr2[0] != indexOf) {
                            iArr2[0] = indexOf;
                            iuVar.invalidate();
                        }
                    }
                    juVar.getClass();
                    iu iuVar2 = juVar.f27577c;
                    int i17 = juVar.e;
                    if (org.telegram.messenger.k4.a(replace, null, null) != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    juVar.d = z11;
                    int i18 = 3;
                    Drawable[] drawableArr = iuVar2.f27168b;
                    int[] iArr3 = iuVar2.f27171n;
                    iuVar2.f27170f = z11;
                    iuVar2.e = replace;
                    int i19 = 5;
                    if (z11) {
                        drawableArr[0] = org.telegram.messenger.k4.a(replace, -1, -1);
                        drawableArr[1] = org.telegram.messenger.k4.a(iuVar2.e, 0, -2);
                        drawableArr[2] = org.telegram.messenger.k4.a(iuVar2.e, 1, -2);
                        drawableArr[3] = org.telegram.messenger.k4.a(iuVar2.e, 2, -2);
                        drawableArr[4] = org.telegram.messenger.k4.a(iuVar2.e, 3, -2);
                        drawableArr[5] = org.telegram.messenger.k4.a(iuVar2.e, 4, -2);
                        drawableArr[6] = org.telegram.messenger.k4.a(iuVar2.e, -2, 0);
                        drawableArr[7] = org.telegram.messenger.k4.a(iuVar2.e, -2, 1);
                        drawableArr[8] = org.telegram.messenger.k4.a(iuVar2.e, -2, 2);
                        drawableArr[9] = org.telegram.messenger.k4.a(iuVar2.e, -2, 3);
                        drawableArr[10] = org.telegram.messenger.k4.a(iuVar2.e, -2, 4);
                        Pair c10 = org.telegram.messenger.k4.c(replace);
                        if (c10 != null) {
                            int intValue = ((Integer) c10.first).intValue();
                            if (iArr3[0] != intValue) {
                                iArr3[0] = intValue;
                                iuVar2.invalidate();
                            }
                            int intValue2 = ((Integer) c10.second).intValue();
                            if (iArr3[1] != intValue2) {
                                iArr3[1] = intValue2;
                                iuVar2.invalidate();
                            }
                            if (iArr3[0] == iArr3[1]) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            iuVar2.G = z12;
                        }
                        iuVar2.I = true;
                    } else {
                        for (int i20 = 0; i20 < 6; i20++) {
                            if (i20 != 0) {
                                str3 = vy.g(replace, (String) org.telegram.messenger.k4.f16557a.get(i20 - 1));
                            } else {
                                str3 = replace;
                            }
                            drawableArr[i20] = org.telegram.messenger.k6.f(str3);
                        }
                    }
                    iuVar2.invalidate();
                    int i21 = i17 * 6;
                    if (juVar.d) {
                        i11 = 3;
                    } else {
                        i11 = 0;
                    }
                    juVar.setWidth(org.telegram.messenger.i0.L(i11 + 30) + i21);
                    float f11 = 15.0f;
                    if (juVar.d) {
                        f7 = 11.66f;
                    } else {
                        f7 = 15.0f;
                    }
                    int L = org.telegram.messenger.i0.L(f7);
                    if (juVar.d) {
                        i12 = 2;
                    } else {
                        i12 = 1;
                    }
                    juVar.setHeight((i12 * i17) + L);
                    int i22 = i17 * 6;
                    if (!juVar.d) {
                        i18 = 0;
                    }
                    int L2 = org.telegram.messenger.i0.L(i18 + 30) + i22;
                    if (juVar.d) {
                        f11 = 11.66f;
                    }
                    int L3 = org.telegram.messenger.i0.L(f11);
                    if (juVar.d) {
                        i13 = 2;
                    } else {
                        i13 = 1;
                    }
                    int i23 = (i13 * i17) + L3;
                    eyVar.getLocationOnScreen(iArr);
                    if (!juVar.d) {
                        int i24 = iuVar2.f27171n[0];
                        int i25 = i24 * i16;
                        int i26 = i24 * 4;
                        if (!org.telegram.messenger.i0.Q1()) {
                            i19 = 1;
                        }
                        i14 = org.telegram.messenger.i0.L(i26 - i19) + i25;
                    } else {
                        i14 = 0;
                    }
                    if (iArr[0] - i14 < org.telegram.messenger.i0.L(5.0f)) {
                        i14 = org.telegram.messenger.a30.D(5.0f, iArr[0] - i14, i14);
                    } else {
                        int i27 = (iArr[0] - i14) + L2;
                        Point point = org.telegram.messenger.i0.f16172q;
                        if (i27 > point.x - org.telegram.messenger.i0.L(5.0f)) {
                            i14 += ((iArr[0] - i14) + L2) - (point.x - org.telegram.messenger.i0.L(5.0f));
                        }
                    }
                    int i28 = -i14;
                    if (eyVar.getTop() < 0) {
                        i15 = eyVar.getTop();
                    } else {
                        i15 = 0;
                    }
                    if (org.telegram.messenger.i0.Q1()) {
                        f10 = 30.0f;
                    } else {
                        f10 = 22.0f;
                    }
                    iuVar2.setArrowX((org.telegram.messenger.i0.L(f10) - i28) + ((int) org.telegram.messenger.i0.N(0.5f)));
                    juVar.setFocusable(true);
                    juVar.showAsDropDown(view, i28, (((view.getMeasuredHeight() - i16) / 2) + ((-view.getMeasuredHeight()) - i23)) - i15);
                    vyVar.h.requestDisallowInterceptTouchEvent(true);
                    hxVar.d1(true);
                    hxVar.A1(view);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public void j(int i10) {
        vy vyVar = this.f29232b;
        tg.f fVar = vyVar.f31966j2;
        if (Build.VERSION.SDK_INT >= 31 && fVar != null) {
            if (v7.u7.a(i10, 4)) {
                fVar.h(vyVar.f31977n2.e());
            }
            fVar.e(vyVar.f31969k2, vyVar.getWidth(), vyVar.getHeight());
        }
    }

    @Override
    public void v(int i10, float f7, float f10, fe.f fVar) {
        this.f29232b.S();
    }

    @Override
    public void E(float f7, int i10) {
    }
}
