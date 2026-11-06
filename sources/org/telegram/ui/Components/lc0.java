package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
public final class lc0 {
    public Path f35624a;
    public float f35625b;
    public float f35626c;
    public float d;
    public float f35627e;
    public float f35628f;
    public ArrayList f35629g;

    public final void a(String str, float f10) {
        float f11 = this.f35627e;
        float f12 = this.d;
        float f13 = this.f35626c;
        try {
            ?? obj = new Object();
            obj.f34557a = new ArrayList();
            obj.f34558b = f10 * this.f35628f;
            String[] split = str.split(" ");
            int i7 = 0;
            while (i7 < split.length) {
                char charAt = split[i7].charAt(0);
                if (charAt != 'C') {
                    if (charAt != 'L') {
                        if (charAt == 'M') {
                            ?? obj2 = new Object();
                            obj2.f35259a = (Float.parseFloat(split[i7 + 1]) + f12) * f13;
                            i7 += 2;
                            obj2.f35260b = (Float.parseFloat(split[i7]) + f11) * f13;
                            obj.f34557a.add(obj2);
                        }
                    } else {
                        ?? obj3 = new Object();
                        obj3.f34906a = (Float.parseFloat(split[i7 + 1]) + f12) * f13;
                        i7 += 2;
                        obj3.f34907b = (Float.parseFloat(split[i7]) + f11) * f13;
                        obj.f34557a.add(obj3);
                    }
                } else {
                    ?? obj4 = new Object();
                    obj4.f34242c = (Float.parseFloat(split[i7 + 1]) + f12) * f13;
                    obj4.d = (Float.parseFloat(split[i7 + 2]) + f11) * f13;
                    obj4.f34243e = (Float.parseFloat(split[i7 + 3]) + f12) * f13;
                    obj4.f34244f = (Float.parseFloat(split[i7 + 4]) + f11) * f13;
                    obj4.f34240a = (Float.parseFloat(split[i7 + 5]) + f12) * f13;
                    i7 += 6;
                    obj4.f34241b = (Float.parseFloat(split[i7]) + f11) * f13;
                    obj.f34557a.add(obj4);
                }
                i7++;
            }
            this.f35629g.add(obj);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void b(Canvas canvas, Paint paint, float f10) {
        ic0 ic0Var;
        ic0 ic0Var2;
        Object obj;
        float f11;
        ArrayList arrayList = this.f35629g;
        Path path = this.f35624a;
        if (this.f35625b != f10) {
            this.f35625b = f10;
            int size = arrayList.size();
            ic0 ic0Var3 = null;
            ic0 ic0Var4 = null;
            for (int i7 = 0; i7 < size; i7++) {
                ic0 ic0Var5 = (ic0) arrayList.get(i7);
                if ((ic0Var4 == null || ic0Var4.f34558b < ic0Var5.f34558b) && ic0Var5.f34558b <= f10) {
                    ic0Var4 = ic0Var5;
                }
                if ((ic0Var3 == null || ic0Var3.f34558b > ic0Var5.f34558b) && ic0Var5.f34558b >= f10) {
                    ic0Var3 = ic0Var5;
                }
            }
            if (ic0Var3 == ic0Var4) {
                ic0Var4 = null;
            }
            if (ic0Var4 != null && ic0Var3 == null) {
                ic0Var = ic0Var4;
                ic0Var2 = null;
            } else {
                ic0Var = ic0Var3;
                ic0Var2 = ic0Var4;
            }
            if (ic0Var != null) {
                ArrayList arrayList2 = ic0Var.f34557a;
                if (ic0Var2 == null || ic0Var2.f34557a.size() == arrayList2.size()) {
                    path.reset();
                    int size2 = arrayList2.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        if (ic0Var2 != null) {
                            obj = ic0Var2.f34557a.get(i10);
                        } else {
                            obj = null;
                        }
                        Object obj2 = arrayList2.get(i10);
                        if (obj == null || obj.getClass() == obj2.getClass()) {
                            if (ic0Var2 != null) {
                                float f12 = ic0Var2.f34558b;
                                f11 = (f10 - f12) / (ic0Var.f34558b - f12);
                            } else {
                                f11 = 1.0f;
                            }
                            if (obj2 instanceof kc0) {
                                kc0 kc0Var = (kc0) obj2;
                                kc0 kc0Var2 = (kc0) obj;
                                if (kc0Var2 != null) {
                                    float f13 = kc0Var2.f35259a;
                                    float N = org.telegram.messenger.g0.N(((kc0Var.f35259a - f13) * f11) + f13);
                                    float f14 = kc0Var2.f35260b;
                                    path.moveTo(N, org.telegram.messenger.g0.N(((kc0Var.f35260b - f14) * f11) + f14));
                                } else {
                                    path.moveTo(org.telegram.messenger.g0.N(kc0Var.f35259a), org.telegram.messenger.g0.N(kc0Var.f35260b));
                                }
                            } else if (obj2 instanceof jc0) {
                                jc0 jc0Var = (jc0) obj2;
                                jc0 jc0Var2 = (jc0) obj;
                                if (jc0Var2 != null) {
                                    float f15 = jc0Var2.f34906a;
                                    float N2 = org.telegram.messenger.g0.N(((jc0Var.f34906a - f15) * f11) + f15);
                                    float f16 = jc0Var2.f34907b;
                                    path.lineTo(N2, org.telegram.messenger.g0.N(((jc0Var.f34907b - f16) * f11) + f16));
                                } else {
                                    path.lineTo(org.telegram.messenger.g0.N(jc0Var.f34906a), org.telegram.messenger.g0.N(jc0Var.f34907b));
                                }
                            } else if (obj2 instanceof hc0) {
                                hc0 hc0Var = (hc0) obj2;
                                hc0 hc0Var2 = (hc0) obj;
                                if (hc0Var2 != null) {
                                    float f17 = hc0Var2.f34242c;
                                    float N3 = org.telegram.messenger.g0.N(((hc0Var.f34242c - f17) * f11) + f17);
                                    float f18 = hc0Var2.d;
                                    float N4 = org.telegram.messenger.g0.N(((hc0Var.d - f18) * f11) + f18);
                                    float f19 = hc0Var2.f34243e;
                                    float N5 = org.telegram.messenger.g0.N(((hc0Var.f34243e - f19) * f11) + f19);
                                    float f20 = hc0Var2.f34244f;
                                    float N6 = org.telegram.messenger.g0.N(((hc0Var.f34244f - f20) * f11) + f20);
                                    float f21 = hc0Var2.f34240a;
                                    float N7 = org.telegram.messenger.g0.N(((hc0Var.f34240a - f21) * f11) + f21);
                                    float f22 = hc0Var2.f34241b;
                                    path.cubicTo(N3, N4, N5, N6, N7, org.telegram.messenger.g0.N(((hc0Var.f34241b - f22) * f11) + f22));
                                } else {
                                    path.cubicTo(org.telegram.messenger.g0.N(hc0Var.f34242c), org.telegram.messenger.g0.N(hc0Var.d), org.telegram.messenger.g0.N(hc0Var.f34243e), org.telegram.messenger.g0.N(hc0Var.f34244f), org.telegram.messenger.g0.N(hc0Var.f34240a), org.telegram.messenger.g0.N(hc0Var.f34241b));
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
