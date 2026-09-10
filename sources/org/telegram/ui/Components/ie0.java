package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class ie0 {
    public Path f24010a;
    public float f24011b;
    public float f24012c;
    public float d;
    public float e;
    public float f24013f;
    public ArrayList f24014g;

    public final void a(String str, float f7) {
        float f10 = this.e;
        float f11 = this.d;
        float f12 = this.f24012c;
        try {
            ?? obj = new Object();
            obj.f22994a = new ArrayList();
            obj.f22995b = f7 * this.f24013f;
            String[] split = str.split(" ");
            int i10 = 0;
            while (i10 < split.length) {
                char charAt = split[i10].charAt(0);
                if (charAt != 'C') {
                    if (charAt != 'L') {
                        if (charAt == 'M') {
                            ?? obj2 = new Object();
                            obj2.f23610a = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                            i10 += 2;
                            obj2.f23611b = (Float.parseFloat(split[i10]) + f10) * f12;
                            obj.f22994a.add(obj2);
                        }
                    } else {
                        ?? obj3 = new Object();
                        obj3.f23351a = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                        i10 += 2;
                        obj3.f23352b = (Float.parseFloat(split[i10]) + f10) * f12;
                        obj.f22994a.add(obj3);
                    }
                } else {
                    ?? obj4 = new Object();
                    obj4.f22689c = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                    obj4.d = (Float.parseFloat(split[i10 + 2]) + f10) * f12;
                    obj4.e = (Float.parseFloat(split[i10 + 3]) + f11) * f12;
                    obj4.f22690f = (Float.parseFloat(split[i10 + 4]) + f10) * f12;
                    obj4.f22687a = (Float.parseFloat(split[i10 + 5]) + f11) * f12;
                    i10 += 6;
                    obj4.f22688b = (Float.parseFloat(split[i10]) + f10) * f12;
                    obj.f22994a.add(obj4);
                }
                i10++;
            }
            this.f24014g.add(obj);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void b(Canvas canvas, Paint paint, float f7) {
        fe0 fe0Var;
        fe0 fe0Var2;
        Object obj;
        float f10;
        ArrayList arrayList = this.f24014g;
        Path path = this.f24010a;
        if (this.f24011b != f7) {
            this.f24011b = f7;
            int size = arrayList.size();
            fe0 fe0Var3 = null;
            fe0 fe0Var4 = null;
            for (int i10 = 0; i10 < size; i10++) {
                fe0 fe0Var5 = (fe0) arrayList.get(i10);
                if ((fe0Var4 == null || fe0Var4.f22995b < fe0Var5.f22995b) && fe0Var5.f22995b <= f7) {
                    fe0Var4 = fe0Var5;
                }
                if ((fe0Var3 == null || fe0Var3.f22995b > fe0Var5.f22995b) && fe0Var5.f22995b >= f7) {
                    fe0Var3 = fe0Var5;
                }
            }
            if (fe0Var3 == fe0Var4) {
                fe0Var4 = null;
            }
            if (fe0Var4 != null && fe0Var3 == null) {
                fe0Var = fe0Var4;
                fe0Var2 = null;
            } else {
                fe0Var = fe0Var3;
                fe0Var2 = fe0Var4;
            }
            if (fe0Var != null) {
                ArrayList arrayList2 = fe0Var.f22994a;
                if (fe0Var2 == null || fe0Var2.f22994a.size() == arrayList2.size()) {
                    path.reset();
                    int size2 = arrayList2.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        if (fe0Var2 != null) {
                            obj = fe0Var2.f22994a.get(i11);
                        } else {
                            obj = null;
                        }
                        Object obj2 = arrayList2.get(i11);
                        if (obj == null || obj.getClass() == obj2.getClass()) {
                            if (fe0Var2 != null) {
                                float f11 = fe0Var2.f22995b;
                                f10 = (f7 - f11) / (fe0Var.f22995b - f11);
                            } else {
                                f10 = 1.0f;
                            }
                            if (obj2 instanceof he0) {
                                he0 he0Var = (he0) obj2;
                                he0 he0Var2 = (he0) obj;
                                if (he0Var2 != null) {
                                    float f12 = he0Var2.f23610a;
                                    float dpf2 = AndroidUtilities.dpf2(((he0Var.f23610a - f12) * f10) + f12);
                                    float f13 = he0Var2.f23611b;
                                    path.moveTo(dpf2, AndroidUtilities.dpf2(((he0Var.f23611b - f13) * f10) + f13));
                                } else {
                                    path.moveTo(AndroidUtilities.dpf2(he0Var.f23610a), AndroidUtilities.dpf2(he0Var.f23611b));
                                }
                            } else if (obj2 instanceof ge0) {
                                ge0 ge0Var = (ge0) obj2;
                                ge0 ge0Var2 = (ge0) obj;
                                if (ge0Var2 != null) {
                                    float f14 = ge0Var2.f23351a;
                                    float dpf22 = AndroidUtilities.dpf2(((ge0Var.f23351a - f14) * f10) + f14);
                                    float f15 = ge0Var2.f23352b;
                                    path.lineTo(dpf22, AndroidUtilities.dpf2(((ge0Var.f23352b - f15) * f10) + f15));
                                } else {
                                    path.lineTo(AndroidUtilities.dpf2(ge0Var.f23351a), AndroidUtilities.dpf2(ge0Var.f23352b));
                                }
                            } else if (obj2 instanceof ee0) {
                                ee0 ee0Var = (ee0) obj2;
                                ee0 ee0Var2 = (ee0) obj;
                                if (ee0Var2 != null) {
                                    float f16 = ee0Var2.f22689c;
                                    float dpf23 = AndroidUtilities.dpf2(((ee0Var.f22689c - f16) * f10) + f16);
                                    float f17 = ee0Var2.d;
                                    float dpf24 = AndroidUtilities.dpf2(((ee0Var.d - f17) * f10) + f17);
                                    float f18 = ee0Var2.e;
                                    float dpf25 = AndroidUtilities.dpf2(((ee0Var.e - f18) * f10) + f18);
                                    float f19 = ee0Var2.f22690f;
                                    float dpf26 = AndroidUtilities.dpf2(((ee0Var.f22690f - f19) * f10) + f19);
                                    float f20 = ee0Var2.f22687a;
                                    float dpf27 = AndroidUtilities.dpf2(((ee0Var.f22687a - f20) * f10) + f20);
                                    float f21 = ee0Var2.f22688b;
                                    path.cubicTo(dpf23, dpf24, dpf25, dpf26, dpf27, AndroidUtilities.dpf2(((ee0Var.f22688b - f21) * f10) + f21));
                                } else {
                                    path.cubicTo(AndroidUtilities.dpf2(ee0Var.f22689c), AndroidUtilities.dpf2(ee0Var.d), AndroidUtilities.dpf2(ee0Var.e), AndroidUtilities.dpf2(ee0Var.f22690f), AndroidUtilities.dpf2(ee0Var.f22687a), AndroidUtilities.dpf2(ee0Var.f22688b));
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
