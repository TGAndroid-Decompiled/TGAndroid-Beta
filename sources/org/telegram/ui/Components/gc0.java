package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
public final class gc0 {
    public Path f34051a;
    public float f34052b;
    public float f34053c;
    public float d;
    public float f34054e;
    public float f34055f;
    public ArrayList f34056g;

    public final void a(String str, float f10) {
        float f11 = this.f34054e;
        float f12 = this.d;
        float f13 = this.f34053c;
        try {
            ?? obj = new Object();
            obj.f33053a = new ArrayList();
            obj.f33054b = f10 * this.f34055f;
            String[] split = str.split(" ");
            int i3 = 0;
            while (i3 < split.length) {
                char charAt = split[i3].charAt(0);
                if (charAt != 'C') {
                    if (charAt != 'L') {
                        if (charAt == 'M') {
                            ?? obj2 = new Object();
                            obj2.f33775a = (Float.parseFloat(split[i3 + 1]) + f12) * f13;
                            i3 += 2;
                            obj2.f33776b = (Float.parseFloat(split[i3]) + f11) * f13;
                            obj.f33053a.add(obj2);
                        }
                    } else {
                        ?? obj3 = new Object();
                        obj3.f33356a = (Float.parseFloat(split[i3 + 1]) + f12) * f13;
                        i3 += 2;
                        obj3.f33357b = (Float.parseFloat(split[i3]) + f11) * f13;
                        obj.f33053a.add(obj3);
                    }
                } else {
                    ?? obj4 = new Object();
                    obj4.f32686c = (Float.parseFloat(split[i3 + 1]) + f12) * f13;
                    obj4.d = (Float.parseFloat(split[i3 + 2]) + f11) * f13;
                    obj4.f32687e = (Float.parseFloat(split[i3 + 3]) + f12) * f13;
                    obj4.f32688f = (Float.parseFloat(split[i3 + 4]) + f11) * f13;
                    obj4.f32684a = (Float.parseFloat(split[i3 + 5]) + f12) * f13;
                    i3 += 6;
                    obj4.f32685b = (Float.parseFloat(split[i3]) + f11) * f13;
                    obj.f33053a.add(obj4);
                }
                i3++;
            }
            this.f34056g.add(obj);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void b(Canvas canvas, Paint paint, float f10) {
        dc0 dc0Var;
        dc0 dc0Var2;
        Object obj;
        float f11;
        ArrayList arrayList = this.f34056g;
        Path path = this.f34051a;
        if (this.f34052b != f10) {
            this.f34052b = f10;
            int size = arrayList.size();
            dc0 dc0Var3 = null;
            dc0 dc0Var4 = null;
            for (int i3 = 0; i3 < size; i3++) {
                dc0 dc0Var5 = (dc0) arrayList.get(i3);
                if ((dc0Var4 == null || dc0Var4.f33054b < dc0Var5.f33054b) && dc0Var5.f33054b <= f10) {
                    dc0Var4 = dc0Var5;
                }
                if ((dc0Var3 == null || dc0Var3.f33054b > dc0Var5.f33054b) && dc0Var5.f33054b >= f10) {
                    dc0Var3 = dc0Var5;
                }
            }
            if (dc0Var3 == dc0Var4) {
                dc0Var4 = null;
            }
            if (dc0Var4 != null && dc0Var3 == null) {
                dc0Var = dc0Var4;
                dc0Var2 = null;
            } else {
                dc0Var = dc0Var3;
                dc0Var2 = dc0Var4;
            }
            if (dc0Var != null) {
                ArrayList arrayList2 = dc0Var.f33053a;
                if (dc0Var2 == null || dc0Var2.f33053a.size() == arrayList2.size()) {
                    path.reset();
                    int size2 = arrayList2.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        if (dc0Var2 != null) {
                            obj = dc0Var2.f33053a.get(i10);
                        } else {
                            obj = null;
                        }
                        Object obj2 = arrayList2.get(i10);
                        if (obj == null || obj.getClass() == obj2.getClass()) {
                            if (dc0Var2 != null) {
                                float f12 = dc0Var2.f33054b;
                                f11 = (f10 - f12) / (dc0Var.f33054b - f12);
                            } else {
                                f11 = 1.0f;
                            }
                            if (obj2 instanceof fc0) {
                                fc0 fc0Var = (fc0) obj2;
                                fc0 fc0Var2 = (fc0) obj;
                                if (fc0Var2 != null) {
                                    float f13 = fc0Var2.f33775a;
                                    float N = org.telegram.messenger.g0.N(((fc0Var.f33775a - f13) * f11) + f13);
                                    float f14 = fc0Var2.f33776b;
                                    path.moveTo(N, org.telegram.messenger.g0.N(((fc0Var.f33776b - f14) * f11) + f14));
                                } else {
                                    path.moveTo(org.telegram.messenger.g0.N(fc0Var.f33775a), org.telegram.messenger.g0.N(fc0Var.f33776b));
                                }
                            } else if (obj2 instanceof ec0) {
                                ec0 ec0Var = (ec0) obj2;
                                ec0 ec0Var2 = (ec0) obj;
                                if (ec0Var2 != null) {
                                    float f15 = ec0Var2.f33356a;
                                    float N2 = org.telegram.messenger.g0.N(((ec0Var.f33356a - f15) * f11) + f15);
                                    float f16 = ec0Var2.f33357b;
                                    path.lineTo(N2, org.telegram.messenger.g0.N(((ec0Var.f33357b - f16) * f11) + f16));
                                } else {
                                    path.lineTo(org.telegram.messenger.g0.N(ec0Var.f33356a), org.telegram.messenger.g0.N(ec0Var.f33357b));
                                }
                            } else if (obj2 instanceof cc0) {
                                cc0 cc0Var = (cc0) obj2;
                                cc0 cc0Var2 = (cc0) obj;
                                if (cc0Var2 != null) {
                                    float f17 = cc0Var2.f32686c;
                                    float N3 = org.telegram.messenger.g0.N(((cc0Var.f32686c - f17) * f11) + f17);
                                    float f18 = cc0Var2.d;
                                    float N4 = org.telegram.messenger.g0.N(((cc0Var.d - f18) * f11) + f18);
                                    float f19 = cc0Var2.f32687e;
                                    float N5 = org.telegram.messenger.g0.N(((cc0Var.f32687e - f19) * f11) + f19);
                                    float f20 = cc0Var2.f32688f;
                                    float N6 = org.telegram.messenger.g0.N(((cc0Var.f32688f - f20) * f11) + f20);
                                    float f21 = cc0Var2.f32684a;
                                    float N7 = org.telegram.messenger.g0.N(((cc0Var.f32684a - f21) * f11) + f21);
                                    float f22 = cc0Var2.f32685b;
                                    path.cubicTo(N3, N4, N5, N6, N7, org.telegram.messenger.g0.N(((cc0Var.f32685b - f22) * f11) + f22));
                                } else {
                                    path.cubicTo(org.telegram.messenger.g0.N(cc0Var.f32686c), org.telegram.messenger.g0.N(cc0Var.d), org.telegram.messenger.g0.N(cc0Var.f32687e), org.telegram.messenger.g0.N(cc0Var.f32688f), org.telegram.messenger.g0.N(cc0Var.f32684a), org.telegram.messenger.g0.N(cc0Var.f32685b));
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
