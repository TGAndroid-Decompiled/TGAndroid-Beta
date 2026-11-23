package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
public final class vc0 {
    public Path f40655a;
    public float f40656b;
    public float f40657c;
    public float d;
    public float f40658e;
    public float f40659f;
    public ArrayList f40660g;

    public final void a(String str, float f10) {
        float f11 = this.f40658e;
        float f12 = this.d;
        float f13 = this.f40657c;
        try {
            ?? obj = new Object();
            obj.f39569a = new ArrayList();
            obj.f39570b = f10 * this.f40659f;
            String[] split = str.split(" ");
            int i7 = 0;
            while (i7 < split.length) {
                char charAt = split[i7].charAt(0);
                if (charAt != 'C') {
                    if (charAt != 'L') {
                        if (charAt == 'M') {
                            ?? obj2 = new Object();
                            obj2.f40346a = (Float.parseFloat(split[i7 + 1]) + f12) * f13;
                            i7 += 2;
                            obj2.f40347b = (Float.parseFloat(split[i7]) + f11) * f13;
                            obj.f39569a.add(obj2);
                        }
                    } else {
                        ?? obj3 = new Object();
                        obj3.f39906a = (Float.parseFloat(split[i7 + 1]) + f12) * f13;
                        i7 += 2;
                        obj3.f39907b = (Float.parseFloat(split[i7]) + f11) * f13;
                        obj.f39569a.add(obj3);
                    }
                } else {
                    ?? obj4 = new Object();
                    obj4.f39273c = (Float.parseFloat(split[i7 + 1]) + f12) * f13;
                    obj4.d = (Float.parseFloat(split[i7 + 2]) + f11) * f13;
                    obj4.f39274e = (Float.parseFloat(split[i7 + 3]) + f12) * f13;
                    obj4.f39275f = (Float.parseFloat(split[i7 + 4]) + f11) * f13;
                    obj4.f39271a = (Float.parseFloat(split[i7 + 5]) + f12) * f13;
                    i7 += 6;
                    obj4.f39272b = (Float.parseFloat(split[i7]) + f11) * f13;
                    obj.f39569a.add(obj4);
                }
                i7++;
            }
            this.f40660g.add(obj);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void b(Canvas canvas, Paint paint, float f10) {
        sc0 sc0Var;
        sc0 sc0Var2;
        Object obj;
        float f11;
        ArrayList arrayList = this.f40660g;
        Path path = this.f40655a;
        if (this.f40656b != f10) {
            this.f40656b = f10;
            int size = arrayList.size();
            sc0 sc0Var3 = null;
            sc0 sc0Var4 = null;
            for (int i7 = 0; i7 < size; i7++) {
                sc0 sc0Var5 = (sc0) arrayList.get(i7);
                if ((sc0Var4 == null || sc0Var4.f39570b < sc0Var5.f39570b) && sc0Var5.f39570b <= f10) {
                    sc0Var4 = sc0Var5;
                }
                if ((sc0Var3 == null || sc0Var3.f39570b > sc0Var5.f39570b) && sc0Var5.f39570b >= f10) {
                    sc0Var3 = sc0Var5;
                }
            }
            if (sc0Var3 == sc0Var4) {
                sc0Var4 = null;
            }
            if (sc0Var4 != null && sc0Var3 == null) {
                sc0Var = sc0Var4;
                sc0Var2 = null;
            } else {
                sc0Var = sc0Var3;
                sc0Var2 = sc0Var4;
            }
            if (sc0Var != null) {
                ArrayList arrayList2 = sc0Var.f39569a;
                if (sc0Var2 == null || sc0Var2.f39569a.size() == arrayList2.size()) {
                    path.reset();
                    int size2 = arrayList2.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        if (sc0Var2 != null) {
                            obj = sc0Var2.f39569a.get(i10);
                        } else {
                            obj = null;
                        }
                        Object obj2 = arrayList2.get(i10);
                        if (obj == null || obj.getClass() == obj2.getClass()) {
                            if (sc0Var2 != null) {
                                float f12 = sc0Var2.f39570b;
                                f11 = (f10 - f12) / (sc0Var.f39570b - f12);
                            } else {
                                f11 = 1.0f;
                            }
                            if (obj2 instanceof uc0) {
                                uc0 uc0Var = (uc0) obj2;
                                uc0 uc0Var2 = (uc0) obj;
                                if (uc0Var2 != null) {
                                    float f13 = uc0Var2.f40346a;
                                    float N = org.telegram.messenger.g0.N(((uc0Var.f40346a - f13) * f11) + f13);
                                    float f14 = uc0Var2.f40347b;
                                    path.moveTo(N, org.telegram.messenger.g0.N(((uc0Var.f40347b - f14) * f11) + f14));
                                } else {
                                    path.moveTo(org.telegram.messenger.g0.N(uc0Var.f40346a), org.telegram.messenger.g0.N(uc0Var.f40347b));
                                }
                            } else if (obj2 instanceof tc0) {
                                tc0 tc0Var = (tc0) obj2;
                                tc0 tc0Var2 = (tc0) obj;
                                if (tc0Var2 != null) {
                                    float f15 = tc0Var2.f39906a;
                                    float N2 = org.telegram.messenger.g0.N(((tc0Var.f39906a - f15) * f11) + f15);
                                    float f16 = tc0Var2.f39907b;
                                    path.lineTo(N2, org.telegram.messenger.g0.N(((tc0Var.f39907b - f16) * f11) + f16));
                                } else {
                                    path.lineTo(org.telegram.messenger.g0.N(tc0Var.f39906a), org.telegram.messenger.g0.N(tc0Var.f39907b));
                                }
                            } else if (obj2 instanceof rc0) {
                                rc0 rc0Var = (rc0) obj2;
                                rc0 rc0Var2 = (rc0) obj;
                                if (rc0Var2 != null) {
                                    float f17 = rc0Var2.f39273c;
                                    float N3 = org.telegram.messenger.g0.N(((rc0Var.f39273c - f17) * f11) + f17);
                                    float f18 = rc0Var2.d;
                                    float N4 = org.telegram.messenger.g0.N(((rc0Var.d - f18) * f11) + f18);
                                    float f19 = rc0Var2.f39274e;
                                    float N5 = org.telegram.messenger.g0.N(((rc0Var.f39274e - f19) * f11) + f19);
                                    float f20 = rc0Var2.f39275f;
                                    float N6 = org.telegram.messenger.g0.N(((rc0Var.f39275f - f20) * f11) + f20);
                                    float f21 = rc0Var2.f39271a;
                                    float N7 = org.telegram.messenger.g0.N(((rc0Var.f39271a - f21) * f11) + f21);
                                    float f22 = rc0Var2.f39272b;
                                    path.cubicTo(N3, N4, N5, N6, N7, org.telegram.messenger.g0.N(((rc0Var.f39272b - f22) * f11) + f22));
                                } else {
                                    path.cubicTo(org.telegram.messenger.g0.N(rc0Var.f39273c), org.telegram.messenger.g0.N(rc0Var.d), org.telegram.messenger.g0.N(rc0Var.f39274e), org.telegram.messenger.g0.N(rc0Var.f39275f), org.telegram.messenger.g0.N(rc0Var.f39271a), org.telegram.messenger.g0.N(rc0Var.f39272b));
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
