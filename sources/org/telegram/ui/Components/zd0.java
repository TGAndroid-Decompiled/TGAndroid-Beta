package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class zd0 {
    public Path f33139a;
    public float f33140b;
    public float f33141c;
    public float d;
    public float f33142e;
    public float f33143f;
    public ArrayList f33144g;

    public final void a(String str, float f7) {
        float f10 = this.f33142e;
        float f11 = this.d;
        float f12 = this.f33141c;
        try {
            ?? obj = new Object();
            obj.f32246a = new ArrayList();
            obj.f32247b = f7 * this.f33143f;
            String[] split = str.split(" ");
            int i10 = 0;
            while (i10 < split.length) {
                char charAt = split[i10].charAt(0);
                if (charAt != 'C') {
                    if (charAt != 'L') {
                        if (charAt == 'M') {
                            ?? obj2 = new Object();
                            obj2.f32887a = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                            i10 += 2;
                            obj2.f32888b = (Float.parseFloat(split[i10]) + f10) * f12;
                            obj.f32246a.add(obj2);
                        }
                    } else {
                        ?? obj3 = new Object();
                        obj3.f32520a = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                        i10 += 2;
                        obj3.f32521b = (Float.parseFloat(split[i10]) + f10) * f12;
                        obj.f32246a.add(obj3);
                    }
                } else {
                    ?? obj4 = new Object();
                    obj4.f31203c = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                    obj4.d = (Float.parseFloat(split[i10 + 2]) + f10) * f12;
                    obj4.f31204e = (Float.parseFloat(split[i10 + 3]) + f11) * f12;
                    obj4.f31205f = (Float.parseFloat(split[i10 + 4]) + f10) * f12;
                    obj4.f31201a = (Float.parseFloat(split[i10 + 5]) + f11) * f12;
                    i10 += 6;
                    obj4.f31202b = (Float.parseFloat(split[i10]) + f10) * f12;
                    obj.f32246a.add(obj4);
                }
                i10++;
            }
            this.f33144g.add(obj);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public final void b(Canvas canvas, Paint paint, float f7) {
        wd0 wd0Var;
        wd0 wd0Var2;
        Object obj;
        float f10;
        ArrayList arrayList = this.f33144g;
        Path path = this.f33139a;
        if (this.f33140b != f7) {
            this.f33140b = f7;
            int size = arrayList.size();
            wd0 wd0Var3 = null;
            wd0 wd0Var4 = null;
            for (int i10 = 0; i10 < size; i10++) {
                wd0 wd0Var5 = (wd0) arrayList.get(i10);
                if ((wd0Var4 == null || wd0Var4.f32247b < wd0Var5.f32247b) && wd0Var5.f32247b <= f7) {
                    wd0Var4 = wd0Var5;
                }
                if ((wd0Var3 == null || wd0Var3.f32247b > wd0Var5.f32247b) && wd0Var5.f32247b >= f7) {
                    wd0Var3 = wd0Var5;
                }
            }
            if (wd0Var3 == wd0Var4) {
                wd0Var4 = null;
            }
            if (wd0Var4 != null && wd0Var3 == null) {
                wd0Var = wd0Var4;
                wd0Var2 = null;
            } else {
                wd0Var = wd0Var3;
                wd0Var2 = wd0Var4;
            }
            if (wd0Var != null) {
                ArrayList arrayList2 = wd0Var.f32246a;
                if (wd0Var2 == null || wd0Var2.f32246a.size() == arrayList2.size()) {
                    path.reset();
                    int size2 = arrayList2.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        if (wd0Var2 != null) {
                            obj = wd0Var2.f32246a.get(i11);
                        } else {
                            obj = null;
                        }
                        Object obj2 = arrayList2.get(i11);
                        if (obj == null || obj.getClass() == obj2.getClass()) {
                            if (wd0Var2 != null) {
                                float f11 = wd0Var2.f32247b;
                                f10 = (f7 - f11) / (wd0Var.f32247b - f11);
                            } else {
                                f10 = 1.0f;
                            }
                            if (obj2 instanceof yd0) {
                                yd0 yd0Var = (yd0) obj2;
                                yd0 yd0Var2 = (yd0) obj;
                                if (yd0Var2 != null) {
                                    float f12 = yd0Var2.f32887a;
                                    float dpf2 = AndroidUtilities.dpf2(((yd0Var.f32887a - f12) * f10) + f12);
                                    float f13 = yd0Var2.f32888b;
                                    path.moveTo(dpf2, AndroidUtilities.dpf2(((yd0Var.f32888b - f13) * f10) + f13));
                                } else {
                                    path.moveTo(AndroidUtilities.dpf2(yd0Var.f32887a), AndroidUtilities.dpf2(yd0Var.f32888b));
                                }
                            } else if (obj2 instanceof xd0) {
                                xd0 xd0Var = (xd0) obj2;
                                xd0 xd0Var2 = (xd0) obj;
                                if (xd0Var2 != null) {
                                    float f14 = xd0Var2.f32520a;
                                    float dpf22 = AndroidUtilities.dpf2(((xd0Var.f32520a - f14) * f10) + f14);
                                    float f15 = xd0Var2.f32521b;
                                    path.lineTo(dpf22, AndroidUtilities.dpf2(((xd0Var.f32521b - f15) * f10) + f15));
                                } else {
                                    path.lineTo(AndroidUtilities.dpf2(xd0Var.f32520a), AndroidUtilities.dpf2(xd0Var.f32521b));
                                }
                            } else if (obj2 instanceof vd0) {
                                vd0 vd0Var = (vd0) obj2;
                                vd0 vd0Var2 = (vd0) obj;
                                if (vd0Var2 != null) {
                                    float f16 = vd0Var2.f31203c;
                                    float dpf23 = AndroidUtilities.dpf2(((vd0Var.f31203c - f16) * f10) + f16);
                                    float f17 = vd0Var2.d;
                                    float dpf24 = AndroidUtilities.dpf2(((vd0Var.d - f17) * f10) + f17);
                                    float f18 = vd0Var2.f31204e;
                                    float dpf25 = AndroidUtilities.dpf2(((vd0Var.f31204e - f18) * f10) + f18);
                                    float f19 = vd0Var2.f31205f;
                                    float dpf26 = AndroidUtilities.dpf2(((vd0Var.f31205f - f19) * f10) + f19);
                                    float f20 = vd0Var2.f31201a;
                                    float dpf27 = AndroidUtilities.dpf2(((vd0Var.f31201a - f20) * f10) + f20);
                                    float f21 = vd0Var2.f31202b;
                                    path.cubicTo(dpf23, dpf24, dpf25, dpf26, dpf27, AndroidUtilities.dpf2(((vd0Var.f31202b - f21) * f10) + f21));
                                } else {
                                    path.cubicTo(AndroidUtilities.dpf2(vd0Var.f31203c), AndroidUtilities.dpf2(vd0Var.d), AndroidUtilities.dpf2(vd0Var.f31204e), AndroidUtilities.dpf2(vd0Var.f31205f), AndroidUtilities.dpf2(vd0Var.f31201a), AndroidUtilities.dpf2(vd0Var.f31202b));
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
