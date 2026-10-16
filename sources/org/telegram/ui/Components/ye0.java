package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class ye0 {
    public Path f31233a;
    public float f31234b;
    public float f31235c;
    public float d;
    public float e;
    public float f31236f;
    public ArrayList f31237g;

    public final void a(String str, float f7) {
        float f10 = this.e;
        float f11 = this.d;
        float f12 = this.f31235c;
        try {
            ?? obj = new Object();
            obj.f29631a = new ArrayList();
            obj.f29632b = f7 * this.f31236f;
            String[] split = str.split(" ");
            int i10 = 0;
            while (i10 < split.length) {
                char charAt = split[i10].charAt(0);
                if (charAt != 'C') {
                    if (charAt != 'L') {
                        if (charAt == 'M') {
                            ?? obj2 = new Object();
                            obj2.f30925a = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                            i10 += 2;
                            obj2.f30926b = (Float.parseFloat(split[i10]) + f10) * f12;
                            obj.f29631a.add(obj2);
                        }
                    } else {
                        ?? obj3 = new Object();
                        obj3.f30536a = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                        i10 += 2;
                        obj3.f30537b = (Float.parseFloat(split[i10]) + f10) * f12;
                        obj.f29631a.add(obj3);
                    }
                } else {
                    ?? obj4 = new Object();
                    obj4.f29363c = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                    obj4.d = (Float.parseFloat(split[i10 + 2]) + f10) * f12;
                    obj4.e = (Float.parseFloat(split[i10 + 3]) + f11) * f12;
                    obj4.f29364f = (Float.parseFloat(split[i10 + 4]) + f10) * f12;
                    obj4.f29361a = (Float.parseFloat(split[i10 + 5]) + f11) * f12;
                    i10 += 6;
                    obj4.f29362b = (Float.parseFloat(split[i10]) + f10) * f12;
                    obj.f29631a.add(obj4);
                }
                i10++;
            }
            this.f31237g.add(obj);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void b(Canvas canvas, Paint paint, float f7) {
        ve0 ve0Var;
        ve0 ve0Var2;
        Object obj;
        float f10;
        ArrayList arrayList = this.f31237g;
        Path path = this.f31233a;
        if (this.f31234b != f7) {
            this.f31234b = f7;
            int size = arrayList.size();
            ve0 ve0Var3 = null;
            ve0 ve0Var4 = null;
            for (int i10 = 0; i10 < size; i10++) {
                ve0 ve0Var5 = (ve0) arrayList.get(i10);
                if ((ve0Var4 == null || ve0Var4.f29632b < ve0Var5.f29632b) && ve0Var5.f29632b <= f7) {
                    ve0Var4 = ve0Var5;
                }
                if ((ve0Var3 == null || ve0Var3.f29632b > ve0Var5.f29632b) && ve0Var5.f29632b >= f7) {
                    ve0Var3 = ve0Var5;
                }
            }
            if (ve0Var3 == ve0Var4) {
                ve0Var4 = null;
            }
            if (ve0Var4 != null && ve0Var3 == null) {
                ve0Var = ve0Var4;
                ve0Var2 = null;
            } else {
                ve0Var = ve0Var3;
                ve0Var2 = ve0Var4;
            }
            if (ve0Var != null) {
                ArrayList arrayList2 = ve0Var.f29631a;
                if (ve0Var2 == null || ve0Var2.f29631a.size() == arrayList2.size()) {
                    path.reset();
                    int size2 = arrayList2.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        if (ve0Var2 != null) {
                            obj = ve0Var2.f29631a.get(i11);
                        } else {
                            obj = null;
                        }
                        Object obj2 = arrayList2.get(i11);
                        if (obj == null || obj.getClass() == obj2.getClass()) {
                            if (ve0Var2 != null) {
                                float f11 = ve0Var2.f29632b;
                                f10 = (f7 - f11) / (ve0Var.f29632b - f11);
                            } else {
                                f10 = 1.0f;
                            }
                            if (obj2 instanceof xe0) {
                                xe0 xe0Var = (xe0) obj2;
                                xe0 xe0Var2 = (xe0) obj;
                                if (xe0Var2 != null) {
                                    float f12 = xe0Var2.f30925a;
                                    float dpf2 = AndroidUtilities.dpf2(((xe0Var.f30925a - f12) * f10) + f12);
                                    float f13 = xe0Var2.f30926b;
                                    path.moveTo(dpf2, AndroidUtilities.dpf2(((xe0Var.f30926b - f13) * f10) + f13));
                                } else {
                                    path.moveTo(AndroidUtilities.dpf2(xe0Var.f30925a), AndroidUtilities.dpf2(xe0Var.f30926b));
                                }
                            } else if (obj2 instanceof we0) {
                                we0 we0Var = (we0) obj2;
                                we0 we0Var2 = (we0) obj;
                                if (we0Var2 != null) {
                                    float f14 = we0Var2.f30536a;
                                    float dpf22 = AndroidUtilities.dpf2(((we0Var.f30536a - f14) * f10) + f14);
                                    float f15 = we0Var2.f30537b;
                                    path.lineTo(dpf22, AndroidUtilities.dpf2(((we0Var.f30537b - f15) * f10) + f15));
                                } else {
                                    path.lineTo(AndroidUtilities.dpf2(we0Var.f30536a), AndroidUtilities.dpf2(we0Var.f30537b));
                                }
                            } else if (obj2 instanceof ue0) {
                                ue0 ue0Var = (ue0) obj2;
                                ue0 ue0Var2 = (ue0) obj;
                                if (ue0Var2 != null) {
                                    float f16 = ue0Var2.f29363c;
                                    float dpf23 = AndroidUtilities.dpf2(((ue0Var.f29363c - f16) * f10) + f16);
                                    float f17 = ue0Var2.d;
                                    float dpf24 = AndroidUtilities.dpf2(((ue0Var.d - f17) * f10) + f17);
                                    float f18 = ue0Var2.e;
                                    float dpf25 = AndroidUtilities.dpf2(((ue0Var.e - f18) * f10) + f18);
                                    float f19 = ue0Var2.f29364f;
                                    float dpf26 = AndroidUtilities.dpf2(((ue0Var.f29364f - f19) * f10) + f19);
                                    float f20 = ue0Var2.f29361a;
                                    float dpf27 = AndroidUtilities.dpf2(((ue0Var.f29361a - f20) * f10) + f20);
                                    float f21 = ue0Var2.f29362b;
                                    path.cubicTo(dpf23, dpf24, dpf25, dpf26, dpf27, AndroidUtilities.dpf2(((ue0Var.f29362b - f21) * f10) + f21));
                                } else {
                                    path.cubicTo(AndroidUtilities.dpf2(ue0Var.f29363c), AndroidUtilities.dpf2(ue0Var.d), AndroidUtilities.dpf2(ue0Var.e), AndroidUtilities.dpf2(ue0Var.f29364f), AndroidUtilities.dpf2(ue0Var.f29361a), AndroidUtilities.dpf2(ue0Var.f29362b));
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
