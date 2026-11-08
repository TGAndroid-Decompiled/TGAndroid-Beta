package org.telegram.ui.Components;

import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Pair;
import android.view.View;
import java.util.ArrayList;
public final class dv implements oi.m, dj0, pk0, te.b {
    public final int f33093a;
    public final hy f33094b;

    public dv(hy hyVar, int i7) {
        this.f33093a = i7;
        this.f33094b = hyVar;
    }

    @Override
    public void Y(int i7, float f10, float f11, te.c cVar) {
        this.f33094b.R();
    }

    @Override
    public void a(int i7) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        tx txVar;
        switch (this.f33093a) {
            case 2:
                hy hyVar = this.f33094b;
                nx nxVar = hyVar.f34418i0;
                int i15 = hyVar.f34400c1;
                mx mxVar = hyVar.f34432n0;
                px pxVar = hyVar.f34424k0;
                if (i7 != hyVar.f34448s0 || !mxVar.f36133y.isEmpty()) {
                    hyVar.f34415h0.C0();
                    hyVar.f34437p0.k(i7, 0);
                    if (i7 != hyVar.f34444r0 && i7 != hyVar.f34448s0) {
                        ArrayList arrayList = org.telegram.messenger.qp.s1(i15).f24743b4;
                        hyVar.f34421j0.H((String) arrayList.get(i7 - hyVar.f34451t0));
                        int i16 = i7 - hyVar.f34451t0;
                        if (i16 > 0) {
                            pxVar.a((String) arrayList.get(i16 - 1), true);
                        }
                        if (i7 - hyVar.f34451t0 < arrayList.size() - 1) {
                            pxVar.a((String) arrayList.get((i7 - hyVar.f34451t0) + 1), true);
                        }
                    } else {
                        hyVar.f34434o0.d.setText("");
                        if (i7 == hyVar.f34448s0 && (i11 = mxVar.I) >= 1) {
                            nxVar.h1(i11, -org.telegram.messenger.g0.L(4.0f));
                        } else {
                            ix ixVar = hyVar.f34452t1;
                            if (ixVar != null && ixVar.A()) {
                                i10 = 0;
                            } else {
                                i10 = 1;
                            }
                            nxVar.h1(i10, 0);
                        }
                        if (i7 == hyVar.f34448s0) {
                            ArrayList arrayList2 = org.telegram.messenger.qp.s1(i15).f24743b4;
                            if (!arrayList2.isEmpty()) {
                                pxVar.a((String) arrayList2.get(0), true);
                            }
                        }
                    }
                    hyVar.E(2);
                    return;
                }
                return;
            default:
                hy hyVar2 = this.f33094b;
                tv tvVar = hyVar2.G0;
                ArrayList arrayList3 = hyVar2.f34403d1;
                uv uvVar = hyVar2.B0;
                yx yxVar = hyVar2.f34469y0;
                qv qvVar = hyVar2.D0;
                if (!hyVar2.S0) {
                    if (i7 == hyVar2.H1) {
                        hyVar2.f34452t1.o(new t31(hyVar2.getContext(), new bw(hyVar2), hyVar2.f34466x1, hyVar2.f34470y1, hyVar2.f34473z1, null, hyVar2.Z1));
                        return;
                    }
                    if (tvVar != null && (txVar = tvVar.f38771r) != null && txVar.getSelectedCategory() != null) {
                        tvVar.c(null, false);
                        txVar.I1(null);
                    }
                    if (i7 == hyVar2.F1) {
                        qvVar.C0();
                        hyVar2.H(yxVar.E("recent"), 0);
                        hyVar2.E(0);
                        int i17 = hyVar2.F1;
                        if (i17 > 0) {
                            i14 = i17;
                        } else {
                            i14 = hyVar2.E1;
                        }
                        uvVar.k(i17, i14);
                        return;
                    } else if (i7 == hyVar2.G1) {
                        qvVar.C0();
                        hyVar2.H(yxVar.E("fav"), 0);
                        hyVar2.E(0);
                        int i18 = hyVar2.G1;
                        if (i18 > 0) {
                            i13 = i18;
                        } else {
                            i13 = hyVar2.E1;
                        }
                        uvVar.k(i18, i13);
                        return;
                    } else if (i7 == hyVar2.I1) {
                        qvVar.C0();
                        hyVar2.H(yxVar.E("premium"), 0);
                        hyVar2.E(0);
                        int i19 = hyVar2.I1;
                        if (i19 > 0) {
                            i12 = i19;
                        } else {
                            i12 = hyVar2.E1;
                        }
                        uvVar.k(i19, i12);
                        return;
                    } else {
                        int i20 = i7 - hyVar2.E1;
                        if (i20 < arrayList3.size()) {
                            if (i20 >= arrayList3.size()) {
                                i20 = arrayList3.size() - 1;
                            }
                            hyVar2.I0 = false;
                            qvVar.C0();
                            hyVar2.H(yxVar.E(arrayList3.get(i20)), 0);
                            hyVar2.E(0);
                            hyVar2.p(0);
                            int i21 = hyVar2.G1;
                            if (i21 <= 0 && (i21 = hyVar2.F1) <= 0) {
                                i21 = hyVar2.E1;
                            }
                            uvVar.k(i7, i21);
                            hyVar2.X1 = false;
                            hyVar2.Z();
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
        hy hyVar = this.f33094b;
        int i15 = hyVar.C1;
        tw twVar = hyVar.P;
        int[] iArr = hyVar.D1;
        yt ytVar = hyVar.B1;
        if (view instanceof qx) {
            qx qxVar = (qx) view;
            v4.d1 d1Var = null;
            if (qxVar.f37444c) {
                View F = twVar.F(view);
                if (F != null) {
                    d1Var = twVar.T(F);
                }
                if (d1Var != null && d1Var.b() <= hyVar.getRecentEmoji().size()) {
                    hyVar.f34452t1.n();
                }
                twVar.A1(view);
                return true;
            } else if (qxVar.getSpan() == null && (str = (String) qxVar.getTag()) != null) {
                String replace = str.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
                if (!qxVar.f37444c) {
                    str2 = (String) org.telegram.messenger.i6.f23059j.get(replace);
                } else {
                    str2 = null;
                }
                if (org.telegram.messenger.h4.a(replace, null, null) != null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9 || org.telegram.messenger.j6.f23510l.contains(replace)) {
                    hyVar.R1 = qxVar;
                    hyVar.U1 = hyVar.S1;
                    hyVar.V1 = hyVar.T1;
                    if (z9) {
                        replace = hy.g(replace, str2);
                    } else {
                        int indexOf = org.telegram.messenger.h4.f22840a.indexOf(str2) + 1;
                        xt xtVar = ytVar.f40747c;
                        int[] iArr2 = xtVar.f40472n;
                        if (iArr2[0] != indexOf) {
                            iArr2[0] = indexOf;
                            xtVar.invalidate();
                        }
                    }
                    ytVar.getClass();
                    xt xtVar2 = ytVar.f40747c;
                    int i16 = ytVar.f40748e;
                    if (org.telegram.messenger.h4.a(replace, null, null) != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ytVar.d = z10;
                    int i17 = 3;
                    Drawable[] drawableArr = xtVar2.f40468b;
                    int[] iArr3 = xtVar2.f40472n;
                    xtVar2.f40471f = z10;
                    xtVar2.f40470e = replace;
                    int i18 = 5;
                    if (z10) {
                        drawableArr[0] = org.telegram.messenger.h4.a(replace, -1, -1);
                        drawableArr[1] = org.telegram.messenger.h4.a(xtVar2.f40470e, 0, -2);
                        drawableArr[2] = org.telegram.messenger.h4.a(xtVar2.f40470e, 1, -2);
                        drawableArr[3] = org.telegram.messenger.h4.a(xtVar2.f40470e, 2, -2);
                        drawableArr[4] = org.telegram.messenger.h4.a(xtVar2.f40470e, 3, -2);
                        drawableArr[5] = org.telegram.messenger.h4.a(xtVar2.f40470e, 4, -2);
                        drawableArr[6] = org.telegram.messenger.h4.a(xtVar2.f40470e, -2, 0);
                        drawableArr[7] = org.telegram.messenger.h4.a(xtVar2.f40470e, -2, 1);
                        drawableArr[8] = org.telegram.messenger.h4.a(xtVar2.f40470e, -2, 2);
                        drawableArr[9] = org.telegram.messenger.h4.a(xtVar2.f40470e, -2, 3);
                        drawableArr[10] = org.telegram.messenger.h4.a(xtVar2.f40470e, -2, 4);
                        Pair c10 = org.telegram.messenger.h4.c(replace);
                        if (c10 != null) {
                            int intValue = ((Integer) c10.first).intValue();
                            if (iArr3[0] != intValue) {
                                iArr3[0] = intValue;
                                xtVar2.invalidate();
                            }
                            int intValue2 = ((Integer) c10.second).intValue();
                            if (iArr3[1] != intValue2) {
                                iArr3[1] = intValue2;
                                xtVar2.invalidate();
                            }
                            if (iArr3[0] == iArr3[1]) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            xtVar2.G = z11;
                        }
                        xtVar2.I = true;
                    } else {
                        for (int i19 = 0; i19 < 6; i19++) {
                            if (i19 != 0) {
                                str3 = hy.g(replace, (String) org.telegram.messenger.h4.f22840a.get(i19 - 1));
                            } else {
                                str3 = replace;
                            }
                            drawableArr[i19] = org.telegram.messenger.i6.f(str3);
                        }
                    }
                    xtVar2.invalidate();
                    int i20 = i16 * 6;
                    if (ytVar.d) {
                        i10 = 3;
                    } else {
                        i10 = 0;
                    }
                    ytVar.setWidth(org.telegram.messenger.g0.L(i10 + 30) + i20);
                    float f12 = 15.0f;
                    if (ytVar.d) {
                        f10 = 11.66f;
                    } else {
                        f10 = 15.0f;
                    }
                    int L = org.telegram.messenger.g0.L(f10);
                    if (ytVar.d) {
                        i11 = 2;
                    } else {
                        i11 = 1;
                    }
                    ytVar.setHeight((i11 * i16) + L);
                    int i21 = i16 * 6;
                    if (!ytVar.d) {
                        i17 = 0;
                    }
                    int L2 = org.telegram.messenger.g0.L(i17 + 30) + i21;
                    if (ytVar.d) {
                        f12 = 11.66f;
                    }
                    int L3 = org.telegram.messenger.g0.L(f12);
                    if (ytVar.d) {
                        i12 = 2;
                    } else {
                        i12 = 1;
                    }
                    int i22 = (i12 * i16) + L3;
                    qxVar.getLocationOnScreen(iArr);
                    if (!ytVar.d) {
                        int i23 = xtVar2.f40472n[0];
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
                        Point point = org.telegram.messenger.g0.f22563q;
                        if (i26 > point.x - org.telegram.messenger.g0.L(5.0f)) {
                            i13 += ((iArr[0] - i13) + L2) - (point.x - org.telegram.messenger.g0.L(5.0f));
                        }
                    }
                    int i27 = -i13;
                    if (qxVar.getTop() < 0) {
                        i14 = qxVar.getTop();
                    } else {
                        i14 = 0;
                    }
                    if (org.telegram.messenger.g0.Q1()) {
                        f11 = 30.0f;
                    } else {
                        f11 = 22.0f;
                    }
                    xtVar2.setArrowX((org.telegram.messenger.g0.L(f11) - i27) + ((int) org.telegram.messenger.g0.N(0.5f)));
                    ytVar.setFocusable(true);
                    ytVar.showAsDropDown(view, i27, (((view.getMeasuredHeight() - i15) / 2) + ((-view.getMeasuredHeight()) - i22)) - i14);
                    hyVar.h.requestDisallowInterceptTouchEvent(true);
                    twVar.d1(true);
                    twVar.A1(view);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public void l(int i7) {
        hy hyVar = this.f33094b;
        dh.g gVar = hyVar.f34423j2;
        if (Build.VERSION.SDK_INT >= 31 && gVar != null) {
            if (c8.zc.a(i7, 4)) {
                gVar.h(hyVar.f34433n2.e());
            }
            gVar.e(hyVar.f34426k2, hyVar.getWidth(), hyVar.getHeight());
        }
    }

    @Override
    public void F(float f10, int i7) {
    }
}
