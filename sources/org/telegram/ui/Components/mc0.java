package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
public final class mc0 {
    public Path f36061a;
    public float f36062b;
    public float f36063c;
    public float d;
    public float f36064e;
    public float f36065f;
    public ArrayList f36066g;

    public final void a(String str, float f10) {
        float f11 = this.f36064e;
        float f12 = this.d;
        float f13 = this.f36063c;
        try {
            ?? obj = new Object();
            obj.f34981a = new ArrayList();
            obj.f34982b = f10 * this.f36065f;
            String[] split = str.split(" ");
            int i7 = 0;
            while (i7 < split.length) {
                char charAt = split[i7].charAt(0);
                if (charAt != 'C') {
                    if (charAt != 'L') {
                        if (charAt == 'M') {
                            ?? obj2 = new Object();
                            obj2.f35689a = (Float.parseFloat(split[i7 + 1]) + f12) * f13;
                            i7 += 2;
                            obj2.f35690b = (Float.parseFloat(split[i7]) + f11) * f13;
                            obj.f34981a.add(obj2);
                        }
                    } else {
                        ?? obj3 = new Object();
                        obj3.f35310a = (Float.parseFloat(split[i7 + 1]) + f12) * f13;
                        i7 += 2;
                        obj3.f35311b = (Float.parseFloat(split[i7]) + f11) * f13;
                        obj.f34981a.add(obj3);
                    }
                } else {
                    ?? obj4 = new Object();
                    obj4.f34706c = (Float.parseFloat(split[i7 + 1]) + f12) * f13;
                    obj4.d = (Float.parseFloat(split[i7 + 2]) + f11) * f13;
                    obj4.f34707e = (Float.parseFloat(split[i7 + 3]) + f12) * f13;
                    obj4.f34708f = (Float.parseFloat(split[i7 + 4]) + f11) * f13;
                    obj4.f34704a = (Float.parseFloat(split[i7 + 5]) + f12) * f13;
                    i7 += 6;
                    obj4.f34705b = (Float.parseFloat(split[i7]) + f11) * f13;
                    obj.f34981a.add(obj4);
                }
                i7++;
            }
            this.f36066g.add(obj);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void b(Canvas canvas, Paint paint, float f10) {
        jc0 jc0Var;
        jc0 jc0Var2;
        Object obj;
        float f11;
        ArrayList arrayList = this.f36066g;
        Path path = this.f36061a;
        if (this.f36062b != f10) {
            this.f36062b = f10;
            int size = arrayList.size();
            jc0 jc0Var3 = null;
            jc0 jc0Var4 = null;
            for (int i7 = 0; i7 < size; i7++) {
                jc0 jc0Var5 = (jc0) arrayList.get(i7);
                if ((jc0Var4 == null || jc0Var4.f34982b < jc0Var5.f34982b) && jc0Var5.f34982b <= f10) {
                    jc0Var4 = jc0Var5;
                }
                if ((jc0Var3 == null || jc0Var3.f34982b > jc0Var5.f34982b) && jc0Var5.f34982b >= f10) {
                    jc0Var3 = jc0Var5;
                }
            }
            if (jc0Var3 == jc0Var4) {
                jc0Var4 = null;
            }
            if (jc0Var4 != null && jc0Var3 == null) {
                jc0Var = jc0Var4;
                jc0Var2 = null;
            } else {
                jc0Var = jc0Var3;
                jc0Var2 = jc0Var4;
            }
            if (jc0Var != null) {
                ArrayList arrayList2 = jc0Var.f34981a;
                if (jc0Var2 == null || jc0Var2.f34981a.size() == arrayList2.size()) {
                    path.reset();
                    int size2 = arrayList2.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        if (jc0Var2 != null) {
                            obj = jc0Var2.f34981a.get(i10);
                        } else {
                            obj = null;
                        }
                        Object obj2 = arrayList2.get(i10);
                        if (obj == null || obj.getClass() == obj2.getClass()) {
                            if (jc0Var2 != null) {
                                float f12 = jc0Var2.f34982b;
                                f11 = (f10 - f12) / (jc0Var.f34982b - f12);
                            } else {
                                f11 = 1.0f;
                            }
                            if (obj2 instanceof lc0) {
                                lc0 lc0Var = (lc0) obj2;
                                lc0 lc0Var2 = (lc0) obj;
                                if (lc0Var2 != null) {
                                    float f13 = lc0Var2.f35689a;
                                    float N = org.telegram.messenger.g0.N(((lc0Var.f35689a - f13) * f11) + f13);
                                    float f14 = lc0Var2.f35690b;
                                    path.moveTo(N, org.telegram.messenger.g0.N(((lc0Var.f35690b - f14) * f11) + f14));
                                } else {
                                    path.moveTo(org.telegram.messenger.g0.N(lc0Var.f35689a), org.telegram.messenger.g0.N(lc0Var.f35690b));
                                }
                            } else if (obj2 instanceof kc0) {
                                kc0 kc0Var = (kc0) obj2;
                                kc0 kc0Var2 = (kc0) obj;
                                if (kc0Var2 != null) {
                                    float f15 = kc0Var2.f35310a;
                                    float N2 = org.telegram.messenger.g0.N(((kc0Var.f35310a - f15) * f11) + f15);
                                    float f16 = kc0Var2.f35311b;
                                    path.lineTo(N2, org.telegram.messenger.g0.N(((kc0Var.f35311b - f16) * f11) + f16));
                                } else {
                                    path.lineTo(org.telegram.messenger.g0.N(kc0Var.f35310a), org.telegram.messenger.g0.N(kc0Var.f35311b));
                                }
                            } else if (obj2 instanceof ic0) {
                                ic0 ic0Var = (ic0) obj2;
                                ic0 ic0Var2 = (ic0) obj;
                                if (ic0Var2 != null) {
                                    float f17 = ic0Var2.f34706c;
                                    float N3 = org.telegram.messenger.g0.N(((ic0Var.f34706c - f17) * f11) + f17);
                                    float f18 = ic0Var2.d;
                                    float N4 = org.telegram.messenger.g0.N(((ic0Var.d - f18) * f11) + f18);
                                    float f19 = ic0Var2.f34707e;
                                    float N5 = org.telegram.messenger.g0.N(((ic0Var.f34707e - f19) * f11) + f19);
                                    float f20 = ic0Var2.f34708f;
                                    float N6 = org.telegram.messenger.g0.N(((ic0Var.f34708f - f20) * f11) + f20);
                                    float f21 = ic0Var2.f34704a;
                                    float N7 = org.telegram.messenger.g0.N(((ic0Var.f34704a - f21) * f11) + f21);
                                    float f22 = ic0Var2.f34705b;
                                    path.cubicTo(N3, N4, N5, N6, N7, org.telegram.messenger.g0.N(((ic0Var.f34705b - f22) * f11) + f22));
                                } else {
                                    path.cubicTo(org.telegram.messenger.g0.N(ic0Var.f34706c), org.telegram.messenger.g0.N(ic0Var.d), org.telegram.messenger.g0.N(ic0Var.f34707e), org.telegram.messenger.g0.N(ic0Var.f34708f), org.telegram.messenger.g0.N(ic0Var.f34704a), org.telegram.messenger.g0.N(ic0Var.f34705b));
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
