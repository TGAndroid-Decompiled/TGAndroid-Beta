package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
public final class xc0 {
    public Path f42046a;
    public float f42047b;
    public float f42048c;
    public float d;
    public float f42049e;
    public float f42050f;
    public ArrayList f42051g;

    public final void a(String str, float f10) {
        float f11 = this.f42049e;
        float f12 = this.d;
        float f13 = this.f42048c;
        try {
            ?? obj = new Object();
            obj.f40324a = new ArrayList();
            obj.f40325b = f10 * this.f42050f;
            String[] split = str.split(" ");
            int i7 = 0;
            while (i7 < split.length) {
                char charAt = split[i7].charAt(0);
                if (charAt != 'C') {
                    if (charAt != 'L') {
                        if (charAt == 'M') {
                            ?? obj2 = new Object();
                            obj2.f41782a = (Float.parseFloat(split[i7 + 1]) + f12) * f13;
                            i7 += 2;
                            obj2.f41783b = (Float.parseFloat(split[i7]) + f11) * f13;
                            obj.f40324a.add(obj2);
                        }
                    } else {
                        ?? obj3 = new Object();
                        obj3.f40795a = (Float.parseFloat(split[i7 + 1]) + f12) * f13;
                        i7 += 2;
                        obj3.f40796b = (Float.parseFloat(split[i7]) + f11) * f13;
                        obj.f40324a.add(obj3);
                    }
                } else {
                    ?? obj4 = new Object();
                    obj4.f39872c = (Float.parseFloat(split[i7 + 1]) + f12) * f13;
                    obj4.d = (Float.parseFloat(split[i7 + 2]) + f11) * f13;
                    obj4.f39873e = (Float.parseFloat(split[i7 + 3]) + f12) * f13;
                    obj4.f39874f = (Float.parseFloat(split[i7 + 4]) + f11) * f13;
                    obj4.f39870a = (Float.parseFloat(split[i7 + 5]) + f12) * f13;
                    i7 += 6;
                    obj4.f39871b = (Float.parseFloat(split[i7]) + f11) * f13;
                    obj.f40324a.add(obj4);
                }
                i7++;
            }
            this.f42051g.add(obj);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void b(Canvas canvas, Paint paint, float f10) {
        uc0 uc0Var;
        uc0 uc0Var2;
        Object obj;
        float f11;
        ArrayList arrayList = this.f42051g;
        Path path = this.f42046a;
        if (this.f42047b != f10) {
            this.f42047b = f10;
            int size = arrayList.size();
            uc0 uc0Var3 = null;
            uc0 uc0Var4 = null;
            for (int i7 = 0; i7 < size; i7++) {
                uc0 uc0Var5 = (uc0) arrayList.get(i7);
                if ((uc0Var4 == null || uc0Var4.f40325b < uc0Var5.f40325b) && uc0Var5.f40325b <= f10) {
                    uc0Var4 = uc0Var5;
                }
                if ((uc0Var3 == null || uc0Var3.f40325b > uc0Var5.f40325b) && uc0Var5.f40325b >= f10) {
                    uc0Var3 = uc0Var5;
                }
            }
            if (uc0Var3 == uc0Var4) {
                uc0Var4 = null;
            }
            if (uc0Var4 != null && uc0Var3 == null) {
                uc0Var = uc0Var4;
                uc0Var2 = null;
            } else {
                uc0Var = uc0Var3;
                uc0Var2 = uc0Var4;
            }
            if (uc0Var != null) {
                ArrayList arrayList2 = uc0Var.f40324a;
                if (uc0Var2 == null || uc0Var2.f40324a.size() == arrayList2.size()) {
                    path.reset();
                    int size2 = arrayList2.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        if (uc0Var2 != null) {
                            obj = uc0Var2.f40324a.get(i10);
                        } else {
                            obj = null;
                        }
                        Object obj2 = arrayList2.get(i10);
                        if (obj == null || obj.getClass() == obj2.getClass()) {
                            if (uc0Var2 != null) {
                                float f12 = uc0Var2.f40325b;
                                f11 = (f10 - f12) / (uc0Var.f40325b - f12);
                            } else {
                                f11 = 1.0f;
                            }
                            if (obj2 instanceof wc0) {
                                wc0 wc0Var = (wc0) obj2;
                                wc0 wc0Var2 = (wc0) obj;
                                if (wc0Var2 != null) {
                                    float f13 = wc0Var2.f41782a;
                                    float N = org.telegram.messenger.g0.N(((wc0Var.f41782a - f13) * f11) + f13);
                                    float f14 = wc0Var2.f41783b;
                                    path.moveTo(N, org.telegram.messenger.g0.N(((wc0Var.f41783b - f14) * f11) + f14));
                                } else {
                                    path.moveTo(org.telegram.messenger.g0.N(wc0Var.f41782a), org.telegram.messenger.g0.N(wc0Var.f41783b));
                                }
                            } else if (obj2 instanceof vc0) {
                                vc0 vc0Var = (vc0) obj2;
                                vc0 vc0Var2 = (vc0) obj;
                                if (vc0Var2 != null) {
                                    float f15 = vc0Var2.f40795a;
                                    float N2 = org.telegram.messenger.g0.N(((vc0Var.f40795a - f15) * f11) + f15);
                                    float f16 = vc0Var2.f40796b;
                                    path.lineTo(N2, org.telegram.messenger.g0.N(((vc0Var.f40796b - f16) * f11) + f16));
                                } else {
                                    path.lineTo(org.telegram.messenger.g0.N(vc0Var.f40795a), org.telegram.messenger.g0.N(vc0Var.f40796b));
                                }
                            } else if (obj2 instanceof tc0) {
                                tc0 tc0Var = (tc0) obj2;
                                tc0 tc0Var2 = (tc0) obj;
                                if (tc0Var2 != null) {
                                    float f17 = tc0Var2.f39872c;
                                    float N3 = org.telegram.messenger.g0.N(((tc0Var.f39872c - f17) * f11) + f17);
                                    float f18 = tc0Var2.d;
                                    float N4 = org.telegram.messenger.g0.N(((tc0Var.d - f18) * f11) + f18);
                                    float f19 = tc0Var2.f39873e;
                                    float N5 = org.telegram.messenger.g0.N(((tc0Var.f39873e - f19) * f11) + f19);
                                    float f20 = tc0Var2.f39874f;
                                    float N6 = org.telegram.messenger.g0.N(((tc0Var.f39874f - f20) * f11) + f20);
                                    float f21 = tc0Var2.f39870a;
                                    float N7 = org.telegram.messenger.g0.N(((tc0Var.f39870a - f21) * f11) + f21);
                                    float f22 = tc0Var2.f39871b;
                                    path.cubicTo(N3, N4, N5, N6, N7, org.telegram.messenger.g0.N(((tc0Var.f39871b - f22) * f11) + f22));
                                } else {
                                    path.cubicTo(org.telegram.messenger.g0.N(tc0Var.f39872c), org.telegram.messenger.g0.N(tc0Var.d), org.telegram.messenger.g0.N(tc0Var.f39873e), org.telegram.messenger.g0.N(tc0Var.f39874f), org.telegram.messenger.g0.N(tc0Var.f39870a), org.telegram.messenger.g0.N(tc0Var.f39871b));
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
