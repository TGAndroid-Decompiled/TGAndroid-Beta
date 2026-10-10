package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class bf0 {
    public Path f24945a;
    public float f24946b;
    public float f24947c;
    public float d;
    public float f24948e;
    public float f24949f;
    public ArrayList f24950g;

    public final void a(String str, float f7) {
        float f10 = this.f24948e;
        float f11 = this.d;
        float f12 = this.f24947c;
        try {
            ?? obj = new Object();
            obj.f33184a = new ArrayList();
            obj.f33185b = f7 * this.f24949f;
            String[] split = str.split(" ");
            int i10 = 0;
            while (i10 < split.length) {
                char charAt = split[i10].charAt(0);
                if (charAt != 'C') {
                    if (charAt != 'L') {
                        if (charAt == 'M') {
                            ?? obj2 = new Object();
                            obj2.f24562a = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                            i10 += 2;
                            obj2.f24563b = (Float.parseFloat(split[i10]) + f10) * f12;
                            obj.f33184a.add(obj2);
                        }
                    } else {
                        ?? obj3 = new Object();
                        obj3.f33583a = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                        i10 += 2;
                        obj3.f33584b = (Float.parseFloat(split[i10]) + f10) * f12;
                        obj.f33184a.add(obj3);
                    }
                } else {
                    ?? obj4 = new Object();
                    obj4.f32902c = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                    obj4.d = (Float.parseFloat(split[i10 + 2]) + f10) * f12;
                    obj4.f32903e = (Float.parseFloat(split[i10 + 3]) + f11) * f12;
                    obj4.f32904f = (Float.parseFloat(split[i10 + 4]) + f10) * f12;
                    obj4.f32900a = (Float.parseFloat(split[i10 + 5]) + f11) * f12;
                    i10 += 6;
                    obj4.f32901b = (Float.parseFloat(split[i10]) + f10) * f12;
                    obj.f33184a.add(obj4);
                }
                i10++;
            }
            this.f24950g.add(obj);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public final void b(Canvas canvas, Paint paint, float f7) {
        ye0 ye0Var;
        ye0 ye0Var2;
        Object obj;
        float f10;
        ArrayList arrayList = this.f24950g;
        Path path = this.f24945a;
        if (this.f24946b != f7) {
            this.f24946b = f7;
            int size = arrayList.size();
            ye0 ye0Var3 = null;
            ye0 ye0Var4 = null;
            for (int i10 = 0; i10 < size; i10++) {
                ye0 ye0Var5 = (ye0) arrayList.get(i10);
                if ((ye0Var4 == null || ye0Var4.f33185b < ye0Var5.f33185b) && ye0Var5.f33185b <= f7) {
                    ye0Var4 = ye0Var5;
                }
                if ((ye0Var3 == null || ye0Var3.f33185b > ye0Var5.f33185b) && ye0Var5.f33185b >= f7) {
                    ye0Var3 = ye0Var5;
                }
            }
            if (ye0Var3 == ye0Var4) {
                ye0Var4 = null;
            }
            if (ye0Var4 != null && ye0Var3 == null) {
                ye0Var = ye0Var4;
                ye0Var2 = null;
            } else {
                ye0Var = ye0Var3;
                ye0Var2 = ye0Var4;
            }
            if (ye0Var != null) {
                ArrayList arrayList2 = ye0Var.f33184a;
                if (ye0Var2 == null || ye0Var2.f33184a.size() == arrayList2.size()) {
                    path.reset();
                    int size2 = arrayList2.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        if (ye0Var2 != null) {
                            obj = ye0Var2.f33184a.get(i11);
                        } else {
                            obj = null;
                        }
                        Object obj2 = arrayList2.get(i11);
                        if (obj == null || obj.getClass() == obj2.getClass()) {
                            if (ye0Var2 != null) {
                                float f11 = ye0Var2.f33185b;
                                f10 = (f7 - f11) / (ye0Var.f33185b - f11);
                            } else {
                                f10 = 1.0f;
                            }
                            if (obj2 instanceof af0) {
                                af0 af0Var = (af0) obj2;
                                af0 af0Var2 = (af0) obj;
                                if (af0Var2 != null) {
                                    float f12 = af0Var2.f24562a;
                                    float dpf2 = AndroidUtilities.dpf2(((af0Var.f24562a - f12) * f10) + f12);
                                    float f13 = af0Var2.f24563b;
                                    path.moveTo(dpf2, AndroidUtilities.dpf2(((af0Var.f24563b - f13) * f10) + f13));
                                } else {
                                    path.moveTo(AndroidUtilities.dpf2(af0Var.f24562a), AndroidUtilities.dpf2(af0Var.f24563b));
                                }
                            } else if (obj2 instanceof ze0) {
                                ze0 ze0Var = (ze0) obj2;
                                ze0 ze0Var2 = (ze0) obj;
                                if (ze0Var2 != null) {
                                    float f14 = ze0Var2.f33583a;
                                    float dpf22 = AndroidUtilities.dpf2(((ze0Var.f33583a - f14) * f10) + f14);
                                    float f15 = ze0Var2.f33584b;
                                    path.lineTo(dpf22, AndroidUtilities.dpf2(((ze0Var.f33584b - f15) * f10) + f15));
                                } else {
                                    path.lineTo(AndroidUtilities.dpf2(ze0Var.f33583a), AndroidUtilities.dpf2(ze0Var.f33584b));
                                }
                            } else if (obj2 instanceof xe0) {
                                xe0 xe0Var = (xe0) obj2;
                                xe0 xe0Var2 = (xe0) obj;
                                if (xe0Var2 != null) {
                                    float f16 = xe0Var2.f32902c;
                                    float dpf23 = AndroidUtilities.dpf2(((xe0Var.f32902c - f16) * f10) + f16);
                                    float f17 = xe0Var2.d;
                                    float dpf24 = AndroidUtilities.dpf2(((xe0Var.d - f17) * f10) + f17);
                                    float f18 = xe0Var2.f32903e;
                                    float dpf25 = AndroidUtilities.dpf2(((xe0Var.f32903e - f18) * f10) + f18);
                                    float f19 = xe0Var2.f32904f;
                                    float dpf26 = AndroidUtilities.dpf2(((xe0Var.f32904f - f19) * f10) + f19);
                                    float f20 = xe0Var2.f32900a;
                                    float dpf27 = AndroidUtilities.dpf2(((xe0Var.f32900a - f20) * f10) + f20);
                                    float f21 = xe0Var2.f32901b;
                                    path.cubicTo(dpf23, dpf24, dpf25, dpf26, dpf27, AndroidUtilities.dpf2(((xe0Var.f32901b - f21) * f10) + f21));
                                } else {
                                    path.cubicTo(AndroidUtilities.dpf2(xe0Var.f32902c), AndroidUtilities.dpf2(xe0Var.d), AndroidUtilities.dpf2(xe0Var.f32903e), AndroidUtilities.dpf2(xe0Var.f32904f), AndroidUtilities.dpf2(xe0Var.f32900a), AndroidUtilities.dpf2(xe0Var.f32901b));
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
