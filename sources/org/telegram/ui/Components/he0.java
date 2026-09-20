package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class he0 {
    public Path f24650a;
    public float f24651b;
    public float f24652c;
    public float d;
    public float e;
    public float f24653f;
    public ArrayList f24654g;

    public final void a(String str, float f7) {
        float f10 = this.e;
        float f11 = this.d;
        float f12 = this.f24652c;
        try {
            ?? obj = new Object();
            obj.f23833a = new ArrayList();
            obj.f23834b = f7 * this.f24653f;
            String[] split = str.split(" ");
            int i10 = 0;
            while (i10 < split.length) {
                char charAt = split[i10].charAt(0);
                if (charAt != 'C') {
                    if (charAt != 'L') {
                        if (charAt == 'M') {
                            ?? obj2 = new Object();
                            obj2.f24336a = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                            i10 += 2;
                            obj2.f24337b = (Float.parseFloat(split[i10]) + f10) * f12;
                            obj.f23833a.add(obj2);
                        }
                    } else {
                        ?? obj3 = new Object();
                        obj3.f24105a = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                        i10 += 2;
                        obj3.f24106b = (Float.parseFloat(split[i10]) + f10) * f12;
                        obj.f23833a.add(obj3);
                    }
                } else {
                    ?? obj4 = new Object();
                    obj4.f23581c = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                    obj4.d = (Float.parseFloat(split[i10 + 2]) + f10) * f12;
                    obj4.e = (Float.parseFloat(split[i10 + 3]) + f11) * f12;
                    obj4.f23582f = (Float.parseFloat(split[i10 + 4]) + f10) * f12;
                    obj4.f23579a = (Float.parseFloat(split[i10 + 5]) + f11) * f12;
                    i10 += 6;
                    obj4.f23580b = (Float.parseFloat(split[i10]) + f10) * f12;
                    obj.f23833a.add(obj4);
                }
                i10++;
            }
            this.f24654g.add(obj);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void b(Canvas canvas, Paint paint, float f7) {
        ee0 ee0Var;
        ee0 ee0Var2;
        Object obj;
        float f10;
        ArrayList arrayList = this.f24654g;
        Path path = this.f24650a;
        if (this.f24651b != f7) {
            this.f24651b = f7;
            int size = arrayList.size();
            ee0 ee0Var3 = null;
            ee0 ee0Var4 = null;
            for (int i10 = 0; i10 < size; i10++) {
                ee0 ee0Var5 = (ee0) arrayList.get(i10);
                if ((ee0Var4 == null || ee0Var4.f23834b < ee0Var5.f23834b) && ee0Var5.f23834b <= f7) {
                    ee0Var4 = ee0Var5;
                }
                if ((ee0Var3 == null || ee0Var3.f23834b > ee0Var5.f23834b) && ee0Var5.f23834b >= f7) {
                    ee0Var3 = ee0Var5;
                }
            }
            if (ee0Var3 == ee0Var4) {
                ee0Var4 = null;
            }
            if (ee0Var4 != null && ee0Var3 == null) {
                ee0Var = ee0Var4;
                ee0Var2 = null;
            } else {
                ee0Var = ee0Var3;
                ee0Var2 = ee0Var4;
            }
            if (ee0Var != null) {
                ArrayList arrayList2 = ee0Var.f23833a;
                if (ee0Var2 == null || ee0Var2.f23833a.size() == arrayList2.size()) {
                    path.reset();
                    int size2 = arrayList2.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        if (ee0Var2 != null) {
                            obj = ee0Var2.f23833a.get(i11);
                        } else {
                            obj = null;
                        }
                        Object obj2 = arrayList2.get(i11);
                        if (obj == null || obj.getClass() == obj2.getClass()) {
                            if (ee0Var2 != null) {
                                float f11 = ee0Var2.f23834b;
                                f10 = (f7 - f11) / (ee0Var.f23834b - f11);
                            } else {
                                f10 = 1.0f;
                            }
                            if (obj2 instanceof ge0) {
                                ge0 ge0Var = (ge0) obj2;
                                ge0 ge0Var2 = (ge0) obj;
                                if (ge0Var2 != null) {
                                    float f12 = ge0Var2.f24336a;
                                    float dpf2 = AndroidUtilities.dpf2(((ge0Var.f24336a - f12) * f10) + f12);
                                    float f13 = ge0Var2.f24337b;
                                    path.moveTo(dpf2, AndroidUtilities.dpf2(((ge0Var.f24337b - f13) * f10) + f13));
                                } else {
                                    path.moveTo(AndroidUtilities.dpf2(ge0Var.f24336a), AndroidUtilities.dpf2(ge0Var.f24337b));
                                }
                            } else if (obj2 instanceof fe0) {
                                fe0 fe0Var = (fe0) obj2;
                                fe0 fe0Var2 = (fe0) obj;
                                if (fe0Var2 != null) {
                                    float f14 = fe0Var2.f24105a;
                                    float dpf22 = AndroidUtilities.dpf2(((fe0Var.f24105a - f14) * f10) + f14);
                                    float f15 = fe0Var2.f24106b;
                                    path.lineTo(dpf22, AndroidUtilities.dpf2(((fe0Var.f24106b - f15) * f10) + f15));
                                } else {
                                    path.lineTo(AndroidUtilities.dpf2(fe0Var.f24105a), AndroidUtilities.dpf2(fe0Var.f24106b));
                                }
                            } else if (obj2 instanceof de0) {
                                de0 de0Var = (de0) obj2;
                                de0 de0Var2 = (de0) obj;
                                if (de0Var2 != null) {
                                    float f16 = de0Var2.f23581c;
                                    float dpf23 = AndroidUtilities.dpf2(((de0Var.f23581c - f16) * f10) + f16);
                                    float f17 = de0Var2.d;
                                    float dpf24 = AndroidUtilities.dpf2(((de0Var.d - f17) * f10) + f17);
                                    float f18 = de0Var2.e;
                                    float dpf25 = AndroidUtilities.dpf2(((de0Var.e - f18) * f10) + f18);
                                    float f19 = de0Var2.f23582f;
                                    float dpf26 = AndroidUtilities.dpf2(((de0Var.f23582f - f19) * f10) + f19);
                                    float f20 = de0Var2.f23579a;
                                    float dpf27 = AndroidUtilities.dpf2(((de0Var.f23579a - f20) * f10) + f20);
                                    float f21 = de0Var2.f23580b;
                                    path.cubicTo(dpf23, dpf24, dpf25, dpf26, dpf27, AndroidUtilities.dpf2(((de0Var.f23580b - f21) * f10) + f21));
                                } else {
                                    path.cubicTo(AndroidUtilities.dpf2(de0Var.f23581c), AndroidUtilities.dpf2(de0Var.d), AndroidUtilities.dpf2(de0Var.e), AndroidUtilities.dpf2(de0Var.f23582f), AndroidUtilities.dpf2(de0Var.f23579a), AndroidUtilities.dpf2(de0Var.f23580b));
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
