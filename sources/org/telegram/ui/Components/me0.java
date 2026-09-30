package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class me0 {
    public Path f26275a;
    public float f26276b;
    public float f26277c;
    public float d;
    public float e;
    public float f26278f;
    public ArrayList f26279g;

    public final void a(String str, float f7) {
        float f10 = this.e;
        float f11 = this.d;
        float f12 = this.f26277c;
        try {
            ?? obj = new Object();
            obj.f25431a = new ArrayList();
            obj.f25432b = f7 * this.f26278f;
            String[] split = str.split(" ");
            int i10 = 0;
            while (i10 < split.length) {
                char charAt = split[i10].charAt(0);
                if (charAt != 'C') {
                    if (charAt != 'L') {
                        if (charAt == 'M') {
                            ?? obj2 = new Object();
                            obj2.f25972a = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                            i10 += 2;
                            obj2.f25973b = (Float.parseFloat(split[i10]) + f10) * f12;
                            obj.f25431a.add(obj2);
                        }
                    } else {
                        ?? obj3 = new Object();
                        obj3.f25763a = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                        i10 += 2;
                        obj3.f25764b = (Float.parseFloat(split[i10]) + f10) * f12;
                        obj.f25431a.add(obj3);
                    }
                } else {
                    ?? obj4 = new Object();
                    obj4.f25109c = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                    obj4.d = (Float.parseFloat(split[i10 + 2]) + f10) * f12;
                    obj4.e = (Float.parseFloat(split[i10 + 3]) + f11) * f12;
                    obj4.f25110f = (Float.parseFloat(split[i10 + 4]) + f10) * f12;
                    obj4.f25107a = (Float.parseFloat(split[i10 + 5]) + f11) * f12;
                    i10 += 6;
                    obj4.f25108b = (Float.parseFloat(split[i10]) + f10) * f12;
                    obj.f25431a.add(obj4);
                }
                i10++;
            }
            this.f26279g.add(obj);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void b(Canvas canvas, Paint paint, float f7) {
        je0 je0Var;
        je0 je0Var2;
        Object obj;
        float f10;
        ArrayList arrayList = this.f26279g;
        Path path = this.f26275a;
        if (this.f26276b != f7) {
            this.f26276b = f7;
            int size = arrayList.size();
            je0 je0Var3 = null;
            je0 je0Var4 = null;
            for (int i10 = 0; i10 < size; i10++) {
                je0 je0Var5 = (je0) arrayList.get(i10);
                if ((je0Var4 == null || je0Var4.f25432b < je0Var5.f25432b) && je0Var5.f25432b <= f7) {
                    je0Var4 = je0Var5;
                }
                if ((je0Var3 == null || je0Var3.f25432b > je0Var5.f25432b) && je0Var5.f25432b >= f7) {
                    je0Var3 = je0Var5;
                }
            }
            if (je0Var3 == je0Var4) {
                je0Var4 = null;
            }
            if (je0Var4 != null && je0Var3 == null) {
                je0Var = je0Var4;
                je0Var2 = null;
            } else {
                je0Var = je0Var3;
                je0Var2 = je0Var4;
            }
            if (je0Var != null) {
                ArrayList arrayList2 = je0Var.f25431a;
                if (je0Var2 == null || je0Var2.f25431a.size() == arrayList2.size()) {
                    path.reset();
                    int size2 = arrayList2.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        if (je0Var2 != null) {
                            obj = je0Var2.f25431a.get(i11);
                        } else {
                            obj = null;
                        }
                        Object obj2 = arrayList2.get(i11);
                        if (obj == null || obj.getClass() == obj2.getClass()) {
                            if (je0Var2 != null) {
                                float f11 = je0Var2.f25432b;
                                f10 = (f7 - f11) / (je0Var.f25432b - f11);
                            } else {
                                f10 = 1.0f;
                            }
                            if (obj2 instanceof le0) {
                                le0 le0Var = (le0) obj2;
                                le0 le0Var2 = (le0) obj;
                                if (le0Var2 != null) {
                                    float f12 = le0Var2.f25972a;
                                    float dpf2 = AndroidUtilities.dpf2(((le0Var.f25972a - f12) * f10) + f12);
                                    float f13 = le0Var2.f25973b;
                                    path.moveTo(dpf2, AndroidUtilities.dpf2(((le0Var.f25973b - f13) * f10) + f13));
                                } else {
                                    path.moveTo(AndroidUtilities.dpf2(le0Var.f25972a), AndroidUtilities.dpf2(le0Var.f25973b));
                                }
                            } else if (obj2 instanceof ke0) {
                                ke0 ke0Var = (ke0) obj2;
                                ke0 ke0Var2 = (ke0) obj;
                                if (ke0Var2 != null) {
                                    float f14 = ke0Var2.f25763a;
                                    float dpf22 = AndroidUtilities.dpf2(((ke0Var.f25763a - f14) * f10) + f14);
                                    float f15 = ke0Var2.f25764b;
                                    path.lineTo(dpf22, AndroidUtilities.dpf2(((ke0Var.f25764b - f15) * f10) + f15));
                                } else {
                                    path.lineTo(AndroidUtilities.dpf2(ke0Var.f25763a), AndroidUtilities.dpf2(ke0Var.f25764b));
                                }
                            } else if (obj2 instanceof ie0) {
                                ie0 ie0Var = (ie0) obj2;
                                ie0 ie0Var2 = (ie0) obj;
                                if (ie0Var2 != null) {
                                    float f16 = ie0Var2.f25109c;
                                    float dpf23 = AndroidUtilities.dpf2(((ie0Var.f25109c - f16) * f10) + f16);
                                    float f17 = ie0Var2.d;
                                    float dpf24 = AndroidUtilities.dpf2(((ie0Var.d - f17) * f10) + f17);
                                    float f18 = ie0Var2.e;
                                    float dpf25 = AndroidUtilities.dpf2(((ie0Var.e - f18) * f10) + f18);
                                    float f19 = ie0Var2.f25110f;
                                    float dpf26 = AndroidUtilities.dpf2(((ie0Var.f25110f - f19) * f10) + f19);
                                    float f20 = ie0Var2.f25107a;
                                    float dpf27 = AndroidUtilities.dpf2(((ie0Var.f25107a - f20) * f10) + f20);
                                    float f21 = ie0Var2.f25108b;
                                    path.cubicTo(dpf23, dpf24, dpf25, dpf26, dpf27, AndroidUtilities.dpf2(((ie0Var.f25108b - f21) * f10) + f21));
                                } else {
                                    path.cubicTo(AndroidUtilities.dpf2(ie0Var.f25109c), AndroidUtilities.dpf2(ie0Var.d), AndroidUtilities.dpf2(ie0Var.e), AndroidUtilities.dpf2(ie0Var.f25110f), AndroidUtilities.dpf2(ie0Var.f25107a), AndroidUtilities.dpf2(ie0Var.f25108b));
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
