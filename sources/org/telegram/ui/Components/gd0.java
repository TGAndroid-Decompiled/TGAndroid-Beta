package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
public final class gd0 {
    public Path f26422a;
    public float f26423b;
    public float f26424c;
    public float d;
    public float e;
    public float f26425f;
    public ArrayList f26426g;

    public final void a(String str, float f7) {
        float f10 = this.e;
        float f11 = this.d;
        float f12 = this.f26424c;
        try {
            ?? obj = new Object();
            obj.f25468a = new ArrayList();
            obj.f25469b = f7 * this.f26425f;
            String[] split = str.split(" ");
            int i10 = 0;
            while (i10 < split.length) {
                char charAt = split[i10].charAt(0);
                if (charAt != 'C') {
                    if (charAt != 'L') {
                        if (charAt == 'M') {
                            ?? obj2 = new Object();
                            obj2.f26132a = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                            i10 += 2;
                            obj2.f26133b = (Float.parseFloat(split[i10]) + f10) * f12;
                            obj.f25468a.add(obj2);
                        }
                    } else {
                        ?? obj3 = new Object();
                        obj3.f25798a = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                        i10 += 2;
                        obj3.f25799b = (Float.parseFloat(split[i10]) + f10) * f12;
                        obj.f25468a.add(obj3);
                    }
                } else {
                    ?? obj4 = new Object();
                    obj4.f25094c = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                    obj4.d = (Float.parseFloat(split[i10 + 2]) + f10) * f12;
                    obj4.e = (Float.parseFloat(split[i10 + 3]) + f11) * f12;
                    obj4.f25095f = (Float.parseFloat(split[i10 + 4]) + f10) * f12;
                    obj4.f25092a = (Float.parseFloat(split[i10 + 5]) + f11) * f12;
                    i10 += 6;
                    obj4.f25093b = (Float.parseFloat(split[i10]) + f10) * f12;
                    obj.f25468a.add(obj4);
                }
                i10++;
            }
            this.f26426g.add(obj);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final void b(Canvas canvas, Paint paint, float f7) {
        dd0 dd0Var;
        dd0 dd0Var2;
        Object obj;
        float f10;
        ArrayList arrayList = this.f26426g;
        Path path = this.f26422a;
        if (this.f26423b != f7) {
            this.f26423b = f7;
            int size = arrayList.size();
            dd0 dd0Var3 = null;
            dd0 dd0Var4 = null;
            for (int i10 = 0; i10 < size; i10++) {
                dd0 dd0Var5 = (dd0) arrayList.get(i10);
                if ((dd0Var4 == null || dd0Var4.f25469b < dd0Var5.f25469b) && dd0Var5.f25469b <= f7) {
                    dd0Var4 = dd0Var5;
                }
                if ((dd0Var3 == null || dd0Var3.f25469b > dd0Var5.f25469b) && dd0Var5.f25469b >= f7) {
                    dd0Var3 = dd0Var5;
                }
            }
            if (dd0Var3 == dd0Var4) {
                dd0Var4 = null;
            }
            if (dd0Var4 != null && dd0Var3 == null) {
                dd0Var = dd0Var4;
                dd0Var2 = null;
            } else {
                dd0Var = dd0Var3;
                dd0Var2 = dd0Var4;
            }
            if (dd0Var != null) {
                ArrayList arrayList2 = dd0Var.f25468a;
                if (dd0Var2 == null || dd0Var2.f25468a.size() == arrayList2.size()) {
                    path.reset();
                    int size2 = arrayList2.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        if (dd0Var2 != null) {
                            obj = dd0Var2.f25468a.get(i11);
                        } else {
                            obj = null;
                        }
                        Object obj2 = arrayList2.get(i11);
                        if (obj == null || obj.getClass() == obj2.getClass()) {
                            if (dd0Var2 != null) {
                                float f11 = dd0Var2.f25469b;
                                f10 = (f7 - f11) / (dd0Var.f25469b - f11);
                            } else {
                                f10 = 1.0f;
                            }
                            if (obj2 instanceof fd0) {
                                fd0 fd0Var = (fd0) obj2;
                                fd0 fd0Var2 = (fd0) obj;
                                if (fd0Var2 != null) {
                                    float f12 = fd0Var2.f26132a;
                                    float N = org.telegram.messenger.i0.N(((fd0Var.f26132a - f12) * f10) + f12);
                                    float f13 = fd0Var2.f26133b;
                                    path.moveTo(N, org.telegram.messenger.i0.N(((fd0Var.f26133b - f13) * f10) + f13));
                                } else {
                                    path.moveTo(org.telegram.messenger.i0.N(fd0Var.f26132a), org.telegram.messenger.i0.N(fd0Var.f26133b));
                                }
                            } else if (obj2 instanceof ed0) {
                                ed0 ed0Var = (ed0) obj2;
                                ed0 ed0Var2 = (ed0) obj;
                                if (ed0Var2 != null) {
                                    float f14 = ed0Var2.f25798a;
                                    float N2 = org.telegram.messenger.i0.N(((ed0Var.f25798a - f14) * f10) + f14);
                                    float f15 = ed0Var2.f25799b;
                                    path.lineTo(N2, org.telegram.messenger.i0.N(((ed0Var.f25799b - f15) * f10) + f15));
                                } else {
                                    path.lineTo(org.telegram.messenger.i0.N(ed0Var.f25798a), org.telegram.messenger.i0.N(ed0Var.f25799b));
                                }
                            } else if (obj2 instanceof cd0) {
                                cd0 cd0Var = (cd0) obj2;
                                cd0 cd0Var2 = (cd0) obj;
                                if (cd0Var2 != null) {
                                    float f16 = cd0Var2.f25094c;
                                    float N3 = org.telegram.messenger.i0.N(((cd0Var.f25094c - f16) * f10) + f16);
                                    float f17 = cd0Var2.d;
                                    float N4 = org.telegram.messenger.i0.N(((cd0Var.d - f17) * f10) + f17);
                                    float f18 = cd0Var2.e;
                                    float N5 = org.telegram.messenger.i0.N(((cd0Var.e - f18) * f10) + f18);
                                    float f19 = cd0Var2.f25095f;
                                    float N6 = org.telegram.messenger.i0.N(((cd0Var.f25095f - f19) * f10) + f19);
                                    float f20 = cd0Var2.f25092a;
                                    float N7 = org.telegram.messenger.i0.N(((cd0Var.f25092a - f20) * f10) + f20);
                                    float f21 = cd0Var2.f25093b;
                                    path.cubicTo(N3, N4, N5, N6, N7, org.telegram.messenger.i0.N(((cd0Var.f25093b - f21) * f10) + f21));
                                } else {
                                    path.cubicTo(org.telegram.messenger.i0.N(cd0Var.f25094c), org.telegram.messenger.i0.N(cd0Var.d), org.telegram.messenger.i0.N(cd0Var.e), org.telegram.messenger.i0.N(cd0Var.f25095f), org.telegram.messenger.i0.N(cd0Var.f25092a), org.telegram.messenger.i0.N(cd0Var.f25093b));
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
