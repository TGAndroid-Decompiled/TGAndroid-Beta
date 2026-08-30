package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class ce0 {
    public Path f23975a;
    public float f23976b;
    public float f23977c;
    public float d;
    public float e;
    public float f23978f;
    public ArrayList f23979g;

    public final void a(String str, float f10) {
        float f11 = this.e;
        float f12 = this.d;
        float f13 = this.f23977c;
        try {
            ?? obj = new Object();
            obj.f31332a = new ArrayList();
            obj.f31333b = f10 * this.f23978f;
            String[] split = str.split(" ");
            int i10 = 0;
            while (i10 < split.length) {
                char charAt = split[i10].charAt(0);
                if (charAt != 'C') {
                    if (charAt != 'L') {
                        if (charAt == 'M') {
                            ?? obj2 = new Object();
                            obj2.f23662a = (Float.parseFloat(split[i10 + 1]) + f12) * f13;
                            i10 += 2;
                            obj2.f23663b = (Float.parseFloat(split[i10]) + f11) * f13;
                            obj.f31332a.add(obj2);
                        }
                    } else {
                        ?? obj3 = new Object();
                        obj3.f23368a = (Float.parseFloat(split[i10 + 1]) + f12) * f13;
                        i10 += 2;
                        obj3.f23369b = (Float.parseFloat(split[i10]) + f11) * f13;
                        obj.f31332a.add(obj3);
                    }
                } else {
                    ?? obj4 = new Object();
                    obj4.f30998c = (Float.parseFloat(split[i10 + 1]) + f12) * f13;
                    obj4.d = (Float.parseFloat(split[i10 + 2]) + f11) * f13;
                    obj4.e = (Float.parseFloat(split[i10 + 3]) + f12) * f13;
                    obj4.f30999f = (Float.parseFloat(split[i10 + 4]) + f11) * f13;
                    obj4.f30996a = (Float.parseFloat(split[i10 + 5]) + f12) * f13;
                    i10 += 6;
                    obj4.f30997b = (Float.parseFloat(split[i10]) + f11) * f13;
                    obj.f31332a.add(obj4);
                }
                i10++;
            }
            this.f23979g.add(obj);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void b(Canvas canvas, Paint paint, float f10) {
        zd0 zd0Var;
        zd0 zd0Var2;
        Object obj;
        float f11;
        ArrayList arrayList = this.f23979g;
        Path path = this.f23975a;
        if (this.f23976b != f10) {
            this.f23976b = f10;
            int size = arrayList.size();
            zd0 zd0Var3 = null;
            zd0 zd0Var4 = null;
            for (int i10 = 0; i10 < size; i10++) {
                zd0 zd0Var5 = (zd0) arrayList.get(i10);
                if ((zd0Var4 == null || zd0Var4.f31333b < zd0Var5.f31333b) && zd0Var5.f31333b <= f10) {
                    zd0Var4 = zd0Var5;
                }
                if ((zd0Var3 == null || zd0Var3.f31333b > zd0Var5.f31333b) && zd0Var5.f31333b >= f10) {
                    zd0Var3 = zd0Var5;
                }
            }
            if (zd0Var3 == zd0Var4) {
                zd0Var4 = null;
            }
            if (zd0Var4 != null && zd0Var3 == null) {
                zd0Var = zd0Var4;
                zd0Var2 = null;
            } else {
                zd0Var = zd0Var3;
                zd0Var2 = zd0Var4;
            }
            if (zd0Var != null) {
                ArrayList arrayList2 = zd0Var.f31332a;
                if (zd0Var2 == null || zd0Var2.f31332a.size() == arrayList2.size()) {
                    path.reset();
                    int size2 = arrayList2.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        if (zd0Var2 != null) {
                            obj = zd0Var2.f31332a.get(i11);
                        } else {
                            obj = null;
                        }
                        Object obj2 = arrayList2.get(i11);
                        if (obj == null || obj.getClass() == obj2.getClass()) {
                            if (zd0Var2 != null) {
                                float f12 = zd0Var2.f31333b;
                                f11 = (f10 - f12) / (zd0Var.f31333b - f12);
                            } else {
                                f11 = 1.0f;
                            }
                            if (obj2 instanceof be0) {
                                be0 be0Var = (be0) obj2;
                                be0 be0Var2 = (be0) obj;
                                if (be0Var2 != null) {
                                    float f13 = be0Var2.f23662a;
                                    float dpf2 = AndroidUtilities.dpf2(((be0Var.f23662a - f13) * f11) + f13);
                                    float f14 = be0Var2.f23663b;
                                    path.moveTo(dpf2, AndroidUtilities.dpf2(((be0Var.f23663b - f14) * f11) + f14));
                                } else {
                                    path.moveTo(AndroidUtilities.dpf2(be0Var.f23662a), AndroidUtilities.dpf2(be0Var.f23663b));
                                }
                            } else if (obj2 instanceof ae0) {
                                ae0 ae0Var = (ae0) obj2;
                                ae0 ae0Var2 = (ae0) obj;
                                if (ae0Var2 != null) {
                                    float f15 = ae0Var2.f23368a;
                                    float dpf22 = AndroidUtilities.dpf2(((ae0Var.f23368a - f15) * f11) + f15);
                                    float f16 = ae0Var2.f23369b;
                                    path.lineTo(dpf22, AndroidUtilities.dpf2(((ae0Var.f23369b - f16) * f11) + f16));
                                } else {
                                    path.lineTo(AndroidUtilities.dpf2(ae0Var.f23368a), AndroidUtilities.dpf2(ae0Var.f23369b));
                                }
                            } else if (obj2 instanceof yd0) {
                                yd0 yd0Var = (yd0) obj2;
                                yd0 yd0Var2 = (yd0) obj;
                                if (yd0Var2 != null) {
                                    float f17 = yd0Var2.f30998c;
                                    float dpf23 = AndroidUtilities.dpf2(((yd0Var.f30998c - f17) * f11) + f17);
                                    float f18 = yd0Var2.d;
                                    float dpf24 = AndroidUtilities.dpf2(((yd0Var.d - f18) * f11) + f18);
                                    float f19 = yd0Var2.e;
                                    float dpf25 = AndroidUtilities.dpf2(((yd0Var.e - f19) * f11) + f19);
                                    float f20 = yd0Var2.f30999f;
                                    float dpf26 = AndroidUtilities.dpf2(((yd0Var.f30999f - f20) * f11) + f20);
                                    float f21 = yd0Var2.f30996a;
                                    float dpf27 = AndroidUtilities.dpf2(((yd0Var.f30996a - f21) * f11) + f21);
                                    float f22 = yd0Var2.f30997b;
                                    path.cubicTo(dpf23, dpf24, dpf25, dpf26, dpf27, AndroidUtilities.dpf2(((yd0Var.f30997b - f22) * f11) + f22));
                                } else {
                                    path.cubicTo(AndroidUtilities.dpf2(yd0Var.f30998c), AndroidUtilities.dpf2(yd0Var.d), AndroidUtilities.dpf2(yd0Var.e), AndroidUtilities.dpf2(yd0Var.f30999f), AndroidUtilities.dpf2(yd0Var.f30996a), AndroidUtilities.dpf2(yd0Var.f30997b));
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
