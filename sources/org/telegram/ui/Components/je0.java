package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class je0 {
    public Path f25400a;
    public float f25401b;
    public float f25402c;
    public float d;
    public float e;
    public float f25403f;
    public ArrayList f25404g;

    public final void a(String str, float f7) {
        float f10 = this.e;
        float f11 = this.d;
        float f12 = this.f25402c;
        try {
            ?? obj = new Object();
            obj.f24437a = new ArrayList();
            obj.f24438b = f7 * this.f25403f;
            String[] split = str.split(" ");
            int i10 = 0;
            while (i10 < split.length) {
                char charAt = split[i10].charAt(0);
                if (charAt != 'C') {
                    if (charAt != 'L') {
                        if (charAt == 'M') {
                            ?? obj2 = new Object();
                            obj2.f25010a = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                            i10 += 2;
                            obj2.f25011b = (Float.parseFloat(split[i10]) + f10) * f12;
                            obj.f24437a.add(obj2);
                        }
                    } else {
                        ?? obj3 = new Object();
                        obj3.f24733a = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                        i10 += 2;
                        obj3.f24734b = (Float.parseFloat(split[i10]) + f10) * f12;
                        obj.f24437a.add(obj3);
                    }
                } else {
                    ?? obj4 = new Object();
                    obj4.f24153c = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                    obj4.d = (Float.parseFloat(split[i10 + 2]) + f10) * f12;
                    obj4.e = (Float.parseFloat(split[i10 + 3]) + f11) * f12;
                    obj4.f24154f = (Float.parseFloat(split[i10 + 4]) + f10) * f12;
                    obj4.f24151a = (Float.parseFloat(split[i10 + 5]) + f11) * f12;
                    i10 += 6;
                    obj4.f24152b = (Float.parseFloat(split[i10]) + f10) * f12;
                    obj.f24437a.add(obj4);
                }
                i10++;
            }
            this.f25404g.add(obj);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void b(Canvas canvas, Paint paint, float f7) {
        ge0 ge0Var;
        ge0 ge0Var2;
        Object obj;
        float f10;
        ArrayList arrayList = this.f25404g;
        Path path = this.f25400a;
        if (this.f25401b != f7) {
            this.f25401b = f7;
            int size = arrayList.size();
            ge0 ge0Var3 = null;
            ge0 ge0Var4 = null;
            for (int i10 = 0; i10 < size; i10++) {
                ge0 ge0Var5 = (ge0) arrayList.get(i10);
                if ((ge0Var4 == null || ge0Var4.f24438b < ge0Var5.f24438b) && ge0Var5.f24438b <= f7) {
                    ge0Var4 = ge0Var5;
                }
                if ((ge0Var3 == null || ge0Var3.f24438b > ge0Var5.f24438b) && ge0Var5.f24438b >= f7) {
                    ge0Var3 = ge0Var5;
                }
            }
            if (ge0Var3 == ge0Var4) {
                ge0Var4 = null;
            }
            if (ge0Var4 != null && ge0Var3 == null) {
                ge0Var = ge0Var4;
                ge0Var2 = null;
            } else {
                ge0Var = ge0Var3;
                ge0Var2 = ge0Var4;
            }
            if (ge0Var != null) {
                ArrayList arrayList2 = ge0Var.f24437a;
                if (ge0Var2 == null || ge0Var2.f24437a.size() == arrayList2.size()) {
                    path.reset();
                    int size2 = arrayList2.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        if (ge0Var2 != null) {
                            obj = ge0Var2.f24437a.get(i11);
                        } else {
                            obj = null;
                        }
                        Object obj2 = arrayList2.get(i11);
                        if (obj == null || obj.getClass() == obj2.getClass()) {
                            if (ge0Var2 != null) {
                                float f11 = ge0Var2.f24438b;
                                f10 = (f7 - f11) / (ge0Var.f24438b - f11);
                            } else {
                                f10 = 1.0f;
                            }
                            if (obj2 instanceof ie0) {
                                ie0 ie0Var = (ie0) obj2;
                                ie0 ie0Var2 = (ie0) obj;
                                if (ie0Var2 != null) {
                                    float f12 = ie0Var2.f25010a;
                                    float dpf2 = AndroidUtilities.dpf2(((ie0Var.f25010a - f12) * f10) + f12);
                                    float f13 = ie0Var2.f25011b;
                                    path.moveTo(dpf2, AndroidUtilities.dpf2(((ie0Var.f25011b - f13) * f10) + f13));
                                } else {
                                    path.moveTo(AndroidUtilities.dpf2(ie0Var.f25010a), AndroidUtilities.dpf2(ie0Var.f25011b));
                                }
                            } else if (obj2 instanceof he0) {
                                he0 he0Var = (he0) obj2;
                                he0 he0Var2 = (he0) obj;
                                if (he0Var2 != null) {
                                    float f14 = he0Var2.f24733a;
                                    float dpf22 = AndroidUtilities.dpf2(((he0Var.f24733a - f14) * f10) + f14);
                                    float f15 = he0Var2.f24734b;
                                    path.lineTo(dpf22, AndroidUtilities.dpf2(((he0Var.f24734b - f15) * f10) + f15));
                                } else {
                                    path.lineTo(AndroidUtilities.dpf2(he0Var.f24733a), AndroidUtilities.dpf2(he0Var.f24734b));
                                }
                            } else if (obj2 instanceof fe0) {
                                fe0 fe0Var = (fe0) obj2;
                                fe0 fe0Var2 = (fe0) obj;
                                if (fe0Var2 != null) {
                                    float f16 = fe0Var2.f24153c;
                                    float dpf23 = AndroidUtilities.dpf2(((fe0Var.f24153c - f16) * f10) + f16);
                                    float f17 = fe0Var2.d;
                                    float dpf24 = AndroidUtilities.dpf2(((fe0Var.d - f17) * f10) + f17);
                                    float f18 = fe0Var2.e;
                                    float dpf25 = AndroidUtilities.dpf2(((fe0Var.e - f18) * f10) + f18);
                                    float f19 = fe0Var2.f24154f;
                                    float dpf26 = AndroidUtilities.dpf2(((fe0Var.f24154f - f19) * f10) + f19);
                                    float f20 = fe0Var2.f24151a;
                                    float dpf27 = AndroidUtilities.dpf2(((fe0Var.f24151a - f20) * f10) + f20);
                                    float f21 = fe0Var2.f24152b;
                                    path.cubicTo(dpf23, dpf24, dpf25, dpf26, dpf27, AndroidUtilities.dpf2(((fe0Var.f24152b - f21) * f10) + f21));
                                } else {
                                    path.cubicTo(AndroidUtilities.dpf2(fe0Var.f24153c), AndroidUtilities.dpf2(fe0Var.d), AndroidUtilities.dpf2(fe0Var.e), AndroidUtilities.dpf2(fe0Var.f24154f), AndroidUtilities.dpf2(fe0Var.f24151a), AndroidUtilities.dpf2(fe0Var.f24152b));
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
