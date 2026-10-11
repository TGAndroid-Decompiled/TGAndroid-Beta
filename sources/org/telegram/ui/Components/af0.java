package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class af0 {
    public Path f24588a;
    public float f24589b;
    public float f24590c;
    public float d;
    public float f24591e;
    public float f24592f;
    public ArrayList f24593g;

    public final void a(String str, float f7) {
        float f10 = this.f24591e;
        float f11 = this.d;
        float f12 = this.f24590c;
        try {
            ?? obj = new Object();
            obj.f32952a = new ArrayList();
            obj.f32953b = f7 * this.f24592f;
            String[] split = str.split(" ");
            int i10 = 0;
            while (i10 < split.length) {
                char charAt = split[i10].charAt(0);
                if (charAt != 'C') {
                    if (charAt != 'L') {
                        if (charAt == 'M') {
                            ?? obj2 = new Object();
                            obj2.f33614a = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                            i10 += 2;
                            obj2.f33615b = (Float.parseFloat(split[i10]) + f10) * f12;
                            obj.f32952a.add(obj2);
                        }
                    } else {
                        ?? obj3 = new Object();
                        obj3.f33231a = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                        i10 += 2;
                        obj3.f33232b = (Float.parseFloat(split[i10]) + f10) * f12;
                        obj.f32952a.add(obj3);
                    }
                } else {
                    ?? obj4 = new Object();
                    obj4.f32678c = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                    obj4.d = (Float.parseFloat(split[i10 + 2]) + f10) * f12;
                    obj4.f32679e = (Float.parseFloat(split[i10 + 3]) + f11) * f12;
                    obj4.f32680f = (Float.parseFloat(split[i10 + 4]) + f10) * f12;
                    obj4.f32676a = (Float.parseFloat(split[i10 + 5]) + f11) * f12;
                    i10 += 6;
                    obj4.f32677b = (Float.parseFloat(split[i10]) + f10) * f12;
                    obj.f32952a.add(obj4);
                }
                i10++;
            }
            this.f24593g.add(obj);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public final void b(Canvas canvas, Paint paint, float f7) {
        xe0 xe0Var;
        xe0 xe0Var2;
        Object obj;
        float f10;
        ArrayList arrayList = this.f24593g;
        Path path = this.f24588a;
        if (this.f24589b != f7) {
            this.f24589b = f7;
            int size = arrayList.size();
            xe0 xe0Var3 = null;
            xe0 xe0Var4 = null;
            for (int i10 = 0; i10 < size; i10++) {
                xe0 xe0Var5 = (xe0) arrayList.get(i10);
                if ((xe0Var4 == null || xe0Var4.f32953b < xe0Var5.f32953b) && xe0Var5.f32953b <= f7) {
                    xe0Var4 = xe0Var5;
                }
                if ((xe0Var3 == null || xe0Var3.f32953b > xe0Var5.f32953b) && xe0Var5.f32953b >= f7) {
                    xe0Var3 = xe0Var5;
                }
            }
            if (xe0Var3 == xe0Var4) {
                xe0Var4 = null;
            }
            if (xe0Var4 != null && xe0Var3 == null) {
                xe0Var = xe0Var4;
                xe0Var2 = null;
            } else {
                xe0Var = xe0Var3;
                xe0Var2 = xe0Var4;
            }
            if (xe0Var != null) {
                ArrayList arrayList2 = xe0Var.f32952a;
                if (xe0Var2 == null || xe0Var2.f32952a.size() == arrayList2.size()) {
                    path.reset();
                    int size2 = arrayList2.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        if (xe0Var2 != null) {
                            obj = xe0Var2.f32952a.get(i11);
                        } else {
                            obj = null;
                        }
                        Object obj2 = arrayList2.get(i11);
                        if (obj == null || obj.getClass() == obj2.getClass()) {
                            if (xe0Var2 != null) {
                                float f11 = xe0Var2.f32953b;
                                f10 = (f7 - f11) / (xe0Var.f32953b - f11);
                            } else {
                                f10 = 1.0f;
                            }
                            if (obj2 instanceof ze0) {
                                ze0 ze0Var = (ze0) obj2;
                                ze0 ze0Var2 = (ze0) obj;
                                if (ze0Var2 != null) {
                                    float f12 = ze0Var2.f33614a;
                                    float dpf2 = AndroidUtilities.dpf2(((ze0Var.f33614a - f12) * f10) + f12);
                                    float f13 = ze0Var2.f33615b;
                                    path.moveTo(dpf2, AndroidUtilities.dpf2(((ze0Var.f33615b - f13) * f10) + f13));
                                } else {
                                    path.moveTo(AndroidUtilities.dpf2(ze0Var.f33614a), AndroidUtilities.dpf2(ze0Var.f33615b));
                                }
                            } else if (obj2 instanceof ye0) {
                                ye0 ye0Var = (ye0) obj2;
                                ye0 ye0Var2 = (ye0) obj;
                                if (ye0Var2 != null) {
                                    float f14 = ye0Var2.f33231a;
                                    float dpf22 = AndroidUtilities.dpf2(((ye0Var.f33231a - f14) * f10) + f14);
                                    float f15 = ye0Var2.f33232b;
                                    path.lineTo(dpf22, AndroidUtilities.dpf2(((ye0Var.f33232b - f15) * f10) + f15));
                                } else {
                                    path.lineTo(AndroidUtilities.dpf2(ye0Var.f33231a), AndroidUtilities.dpf2(ye0Var.f33232b));
                                }
                            } else if (obj2 instanceof we0) {
                                we0 we0Var = (we0) obj2;
                                we0 we0Var2 = (we0) obj;
                                if (we0Var2 != null) {
                                    float f16 = we0Var2.f32678c;
                                    float dpf23 = AndroidUtilities.dpf2(((we0Var.f32678c - f16) * f10) + f16);
                                    float f17 = we0Var2.d;
                                    float dpf24 = AndroidUtilities.dpf2(((we0Var.d - f17) * f10) + f17);
                                    float f18 = we0Var2.f32679e;
                                    float dpf25 = AndroidUtilities.dpf2(((we0Var.f32679e - f18) * f10) + f18);
                                    float f19 = we0Var2.f32680f;
                                    float dpf26 = AndroidUtilities.dpf2(((we0Var.f32680f - f19) * f10) + f19);
                                    float f20 = we0Var2.f32676a;
                                    float dpf27 = AndroidUtilities.dpf2(((we0Var.f32676a - f20) * f10) + f20);
                                    float f21 = we0Var2.f32677b;
                                    path.cubicTo(dpf23, dpf24, dpf25, dpf26, dpf27, AndroidUtilities.dpf2(((we0Var.f32677b - f21) * f10) + f21));
                                } else {
                                    path.cubicTo(AndroidUtilities.dpf2(we0Var.f32678c), AndroidUtilities.dpf2(we0Var.d), AndroidUtilities.dpf2(we0Var.f32679e), AndroidUtilities.dpf2(we0Var.f32680f), AndroidUtilities.dpf2(we0Var.f32676a), AndroidUtilities.dpf2(we0Var.f32677b));
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
