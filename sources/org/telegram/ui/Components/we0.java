package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class we0 {
    public Path f32233a;
    public float f32234b;
    public float f32235c;
    public float d;
    public float e;
    public float f32236f;
    public ArrayList f32237g;

    public final void a(String str, float f7) {
        float f10 = this.e;
        float f11 = this.d;
        float f12 = this.f32235c;
        try {
            ?? obj = new Object();
            obj.f30688a = new ArrayList();
            obj.f30689b = f7 * this.f32236f;
            String[] split = str.split(" ");
            int i10 = 0;
            while (i10 < split.length) {
                char charAt = split[i10].charAt(0);
                if (charAt != 'C') {
                    if (charAt != 'L') {
                        if (charAt == 'M') {
                            ?? obj2 = new Object();
                            obj2.f31434a = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                            i10 += 2;
                            obj2.f31435b = (Float.parseFloat(split[i10]) + f10) * f12;
                            obj.f30688a.add(obj2);
                        }
                    } else {
                        ?? obj3 = new Object();
                        obj3.f31142a = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                        i10 += 2;
                        obj3.f31143b = (Float.parseFloat(split[i10]) + f10) * f12;
                        obj.f30688a.add(obj3);
                    }
                } else {
                    ?? obj4 = new Object();
                    obj4.f30476c = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                    obj4.d = (Float.parseFloat(split[i10 + 2]) + f10) * f12;
                    obj4.e = (Float.parseFloat(split[i10 + 3]) + f11) * f12;
                    obj4.f30477f = (Float.parseFloat(split[i10 + 4]) + f10) * f12;
                    obj4.f30474a = (Float.parseFloat(split[i10 + 5]) + f11) * f12;
                    i10 += 6;
                    obj4.f30475b = (Float.parseFloat(split[i10]) + f10) * f12;
                    obj.f30688a.add(obj4);
                }
                i10++;
            }
            this.f32237g.add(obj);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void b(Canvas canvas, Paint paint, float f7) {
        te0 te0Var;
        te0 te0Var2;
        Object obj;
        float f10;
        ArrayList arrayList = this.f32237g;
        Path path = this.f32233a;
        if (this.f32234b != f7) {
            this.f32234b = f7;
            int size = arrayList.size();
            te0 te0Var3 = null;
            te0 te0Var4 = null;
            for (int i10 = 0; i10 < size; i10++) {
                te0 te0Var5 = (te0) arrayList.get(i10);
                if ((te0Var4 == null || te0Var4.f30689b < te0Var5.f30689b) && te0Var5.f30689b <= f7) {
                    te0Var4 = te0Var5;
                }
                if ((te0Var3 == null || te0Var3.f30689b > te0Var5.f30689b) && te0Var5.f30689b >= f7) {
                    te0Var3 = te0Var5;
                }
            }
            if (te0Var3 == te0Var4) {
                te0Var4 = null;
            }
            if (te0Var4 != null && te0Var3 == null) {
                te0Var = te0Var4;
                te0Var2 = null;
            } else {
                te0Var = te0Var3;
                te0Var2 = te0Var4;
            }
            if (te0Var != null) {
                ArrayList arrayList2 = te0Var.f30688a;
                if (te0Var2 == null || te0Var2.f30688a.size() == arrayList2.size()) {
                    path.reset();
                    int size2 = arrayList2.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        if (te0Var2 != null) {
                            obj = te0Var2.f30688a.get(i11);
                        } else {
                            obj = null;
                        }
                        Object obj2 = arrayList2.get(i11);
                        if (obj == null || obj.getClass() == obj2.getClass()) {
                            if (te0Var2 != null) {
                                float f11 = te0Var2.f30689b;
                                f10 = (f7 - f11) / (te0Var.f30689b - f11);
                            } else {
                                f10 = 1.0f;
                            }
                            if (obj2 instanceof ve0) {
                                ve0 ve0Var = (ve0) obj2;
                                ve0 ve0Var2 = (ve0) obj;
                                if (ve0Var2 != null) {
                                    float f12 = ve0Var2.f31434a;
                                    float dpf2 = AndroidUtilities.dpf2(((ve0Var.f31434a - f12) * f10) + f12);
                                    float f13 = ve0Var2.f31435b;
                                    path.moveTo(dpf2, AndroidUtilities.dpf2(((ve0Var.f31435b - f13) * f10) + f13));
                                } else {
                                    path.moveTo(AndroidUtilities.dpf2(ve0Var.f31434a), AndroidUtilities.dpf2(ve0Var.f31435b));
                                }
                            } else if (obj2 instanceof ue0) {
                                ue0 ue0Var = (ue0) obj2;
                                ue0 ue0Var2 = (ue0) obj;
                                if (ue0Var2 != null) {
                                    float f14 = ue0Var2.f31142a;
                                    float dpf22 = AndroidUtilities.dpf2(((ue0Var.f31142a - f14) * f10) + f14);
                                    float f15 = ue0Var2.f31143b;
                                    path.lineTo(dpf22, AndroidUtilities.dpf2(((ue0Var.f31143b - f15) * f10) + f15));
                                } else {
                                    path.lineTo(AndroidUtilities.dpf2(ue0Var.f31142a), AndroidUtilities.dpf2(ue0Var.f31143b));
                                }
                            } else if (obj2 instanceof se0) {
                                se0 se0Var = (se0) obj2;
                                se0 se0Var2 = (se0) obj;
                                if (se0Var2 != null) {
                                    float f16 = se0Var2.f30476c;
                                    float dpf23 = AndroidUtilities.dpf2(((se0Var.f30476c - f16) * f10) + f16);
                                    float f17 = se0Var2.d;
                                    float dpf24 = AndroidUtilities.dpf2(((se0Var.d - f17) * f10) + f17);
                                    float f18 = se0Var2.e;
                                    float dpf25 = AndroidUtilities.dpf2(((se0Var.e - f18) * f10) + f18);
                                    float f19 = se0Var2.f30477f;
                                    float dpf26 = AndroidUtilities.dpf2(((se0Var.f30477f - f19) * f10) + f19);
                                    float f20 = se0Var2.f30474a;
                                    float dpf27 = AndroidUtilities.dpf2(((se0Var.f30474a - f20) * f10) + f20);
                                    float f21 = se0Var2.f30475b;
                                    path.cubicTo(dpf23, dpf24, dpf25, dpf26, dpf27, AndroidUtilities.dpf2(((se0Var.f30475b - f21) * f10) + f21));
                                } else {
                                    path.cubicTo(AndroidUtilities.dpf2(se0Var.f30476c), AndroidUtilities.dpf2(se0Var.d), AndroidUtilities.dpf2(se0Var.e), AndroidUtilities.dpf2(se0Var.f30477f), AndroidUtilities.dpf2(se0Var.f30474a), AndroidUtilities.dpf2(se0Var.f30475b));
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
