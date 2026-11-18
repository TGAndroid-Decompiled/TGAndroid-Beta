package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
public final class wc0 {
    public Path f41682a;
    public float f41683b;
    public float f41684c;
    public float d;
    public float f41685e;
    public float f41686f;
    public ArrayList f41687g;

    public final void a(String str, float f10) {
        float f11 = this.f41685e;
        float f12 = this.d;
        float f13 = this.f41684c;
        try {
            ?? obj = new Object();
            obj.f39980a = new ArrayList();
            obj.f39981b = f10 * this.f41686f;
            String[] split = str.split(" ");
            int i7 = 0;
            while (i7 < split.length) {
                char charAt = split[i7].charAt(0);
                if (charAt != 'C') {
                    if (charAt != 'L') {
                        if (charAt == 'M') {
                            ?? obj2 = new Object();
                            obj2.f40590a = (Float.parseFloat(split[i7 + 1]) + f12) * f13;
                            i7 += 2;
                            obj2.f40591b = (Float.parseFloat(split[i7]) + f11) * f13;
                            obj.f39980a.add(obj2);
                        }
                    } else {
                        ?? obj3 = new Object();
                        obj3.f40300a = (Float.parseFloat(split[i7 + 1]) + f12) * f13;
                        i7 += 2;
                        obj3.f40301b = (Float.parseFloat(split[i7]) + f11) * f13;
                        obj.f39980a.add(obj3);
                    }
                } else {
                    ?? obj4 = new Object();
                    obj4.f39597c = (Float.parseFloat(split[i7 + 1]) + f12) * f13;
                    obj4.d = (Float.parseFloat(split[i7 + 2]) + f11) * f13;
                    obj4.f39598e = (Float.parseFloat(split[i7 + 3]) + f12) * f13;
                    obj4.f39599f = (Float.parseFloat(split[i7 + 4]) + f11) * f13;
                    obj4.f39595a = (Float.parseFloat(split[i7 + 5]) + f12) * f13;
                    i7 += 6;
                    obj4.f39596b = (Float.parseFloat(split[i7]) + f11) * f13;
                    obj.f39980a.add(obj4);
                }
                i7++;
            }
            this.f41687g.add(obj);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void b(Canvas canvas, Paint paint, float f10) {
        tc0 tc0Var;
        tc0 tc0Var2;
        Object obj;
        float f11;
        ArrayList arrayList = this.f41687g;
        Path path = this.f41682a;
        if (this.f41683b != f10) {
            this.f41683b = f10;
            int size = arrayList.size();
            tc0 tc0Var3 = null;
            tc0 tc0Var4 = null;
            for (int i7 = 0; i7 < size; i7++) {
                tc0 tc0Var5 = (tc0) arrayList.get(i7);
                if ((tc0Var4 == null || tc0Var4.f39981b < tc0Var5.f39981b) && tc0Var5.f39981b <= f10) {
                    tc0Var4 = tc0Var5;
                }
                if ((tc0Var3 == null || tc0Var3.f39981b > tc0Var5.f39981b) && tc0Var5.f39981b >= f10) {
                    tc0Var3 = tc0Var5;
                }
            }
            if (tc0Var3 == tc0Var4) {
                tc0Var4 = null;
            }
            if (tc0Var4 != null && tc0Var3 == null) {
                tc0Var = tc0Var4;
                tc0Var2 = null;
            } else {
                tc0Var = tc0Var3;
                tc0Var2 = tc0Var4;
            }
            if (tc0Var != null) {
                ArrayList arrayList2 = tc0Var.f39980a;
                if (tc0Var2 == null || tc0Var2.f39980a.size() == arrayList2.size()) {
                    path.reset();
                    int size2 = arrayList2.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        if (tc0Var2 != null) {
                            obj = tc0Var2.f39980a.get(i10);
                        } else {
                            obj = null;
                        }
                        Object obj2 = arrayList2.get(i10);
                        if (obj == null || obj.getClass() == obj2.getClass()) {
                            if (tc0Var2 != null) {
                                float f12 = tc0Var2.f39981b;
                                f11 = (f10 - f12) / (tc0Var.f39981b - f12);
                            } else {
                                f11 = 1.0f;
                            }
                            if (obj2 instanceof vc0) {
                                vc0 vc0Var = (vc0) obj2;
                                vc0 vc0Var2 = (vc0) obj;
                                if (vc0Var2 != null) {
                                    float f13 = vc0Var2.f40590a;
                                    float N = org.telegram.messenger.g0.N(((vc0Var.f40590a - f13) * f11) + f13);
                                    float f14 = vc0Var2.f40591b;
                                    path.moveTo(N, org.telegram.messenger.g0.N(((vc0Var.f40591b - f14) * f11) + f14));
                                } else {
                                    path.moveTo(org.telegram.messenger.g0.N(vc0Var.f40590a), org.telegram.messenger.g0.N(vc0Var.f40591b));
                                }
                            } else if (obj2 instanceof uc0) {
                                uc0 uc0Var = (uc0) obj2;
                                uc0 uc0Var2 = (uc0) obj;
                                if (uc0Var2 != null) {
                                    float f15 = uc0Var2.f40300a;
                                    float N2 = org.telegram.messenger.g0.N(((uc0Var.f40300a - f15) * f11) + f15);
                                    float f16 = uc0Var2.f40301b;
                                    path.lineTo(N2, org.telegram.messenger.g0.N(((uc0Var.f40301b - f16) * f11) + f16));
                                } else {
                                    path.lineTo(org.telegram.messenger.g0.N(uc0Var.f40300a), org.telegram.messenger.g0.N(uc0Var.f40301b));
                                }
                            } else if (obj2 instanceof sc0) {
                                sc0 sc0Var = (sc0) obj2;
                                sc0 sc0Var2 = (sc0) obj;
                                if (sc0Var2 != null) {
                                    float f17 = sc0Var2.f39597c;
                                    float N3 = org.telegram.messenger.g0.N(((sc0Var.f39597c - f17) * f11) + f17);
                                    float f18 = sc0Var2.d;
                                    float N4 = org.telegram.messenger.g0.N(((sc0Var.d - f18) * f11) + f18);
                                    float f19 = sc0Var2.f39598e;
                                    float N5 = org.telegram.messenger.g0.N(((sc0Var.f39598e - f19) * f11) + f19);
                                    float f20 = sc0Var2.f39599f;
                                    float N6 = org.telegram.messenger.g0.N(((sc0Var.f39599f - f20) * f11) + f20);
                                    float f21 = sc0Var2.f39595a;
                                    float N7 = org.telegram.messenger.g0.N(((sc0Var.f39595a - f21) * f11) + f21);
                                    float f22 = sc0Var2.f39596b;
                                    path.cubicTo(N3, N4, N5, N6, N7, org.telegram.messenger.g0.N(((sc0Var.f39596b - f22) * f11) + f22));
                                } else {
                                    path.cubicTo(org.telegram.messenger.g0.N(sc0Var.f39597c), org.telegram.messenger.g0.N(sc0Var.d), org.telegram.messenger.g0.N(sc0Var.f39598e), org.telegram.messenger.g0.N(sc0Var.f39599f), org.telegram.messenger.g0.N(sc0Var.f39595a), org.telegram.messenger.g0.N(sc0Var.f39596b));
                                }
                            }
                        } else {
                            return;
                        }
                    }
                    path.close();
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        canvas.drawPath(path, paint);
    }
}
