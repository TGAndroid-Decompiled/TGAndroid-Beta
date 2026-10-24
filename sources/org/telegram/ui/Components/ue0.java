package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class ue0 {
    public Path f31102a;
    public float f31103b;
    public float f31104c;
    public float d;
    public float e;
    public float f31105f;
    public ArrayList f31106g;

    public final void a(String str, float f7) {
        float f10 = this.e;
        float f11 = this.d;
        float f12 = this.f31104c;
        try {
            ?? obj = new Object();
            obj.f30120a = new ArrayList();
            obj.f30121b = f7 * this.f31105f;
            String[] split = str.split(" ");
            int i10 = 0;
            while (i10 < split.length) {
                char charAt = split[i10].charAt(0);
                if (charAt != 'C') {
                    if (charAt != 'L') {
                        if (charAt == 'M') {
                            ?? obj2 = new Object();
                            obj2.f30808a = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                            i10 += 2;
                            obj2.f30809b = (Float.parseFloat(split[i10]) + f10) * f12;
                            obj.f30120a.add(obj2);
                        }
                    } else {
                        ?? obj3 = new Object();
                        obj3.f30485a = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                        i10 += 2;
                        obj3.f30486b = (Float.parseFloat(split[i10]) + f10) * f12;
                        obj.f30120a.add(obj3);
                    }
                } else {
                    ?? obj4 = new Object();
                    obj4.f29899c = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                    obj4.d = (Float.parseFloat(split[i10 + 2]) + f10) * f12;
                    obj4.e = (Float.parseFloat(split[i10 + 3]) + f11) * f12;
                    obj4.f29900f = (Float.parseFloat(split[i10 + 4]) + f10) * f12;
                    obj4.f29897a = (Float.parseFloat(split[i10 + 5]) + f11) * f12;
                    i10 += 6;
                    obj4.f29898b = (Float.parseFloat(split[i10]) + f10) * f12;
                    obj.f30120a.add(obj4);
                }
                i10++;
            }
            this.f31106g.add(obj);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void b(Canvas canvas, Paint paint, float f7) {
        re0 re0Var;
        re0 re0Var2;
        Object obj;
        float f10;
        ArrayList arrayList = this.f31106g;
        Path path = this.f31102a;
        if (this.f31103b != f7) {
            this.f31103b = f7;
            int size = arrayList.size();
            re0 re0Var3 = null;
            re0 re0Var4 = null;
            for (int i10 = 0; i10 < size; i10++) {
                re0 re0Var5 = (re0) arrayList.get(i10);
                if ((re0Var4 == null || re0Var4.f30121b < re0Var5.f30121b) && re0Var5.f30121b <= f7) {
                    re0Var4 = re0Var5;
                }
                if ((re0Var3 == null || re0Var3.f30121b > re0Var5.f30121b) && re0Var5.f30121b >= f7) {
                    re0Var3 = re0Var5;
                }
            }
            if (re0Var3 == re0Var4) {
                re0Var4 = null;
            }
            if (re0Var4 != null && re0Var3 == null) {
                re0Var = re0Var4;
                re0Var2 = null;
            } else {
                re0Var = re0Var3;
                re0Var2 = re0Var4;
            }
            if (re0Var != null) {
                ArrayList arrayList2 = re0Var.f30120a;
                if (re0Var2 == null || re0Var2.f30120a.size() == arrayList2.size()) {
                    path.reset();
                    int size2 = arrayList2.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        if (re0Var2 != null) {
                            obj = re0Var2.f30120a.get(i11);
                        } else {
                            obj = null;
                        }
                        Object obj2 = arrayList2.get(i11);
                        if (obj == null || obj.getClass() == obj2.getClass()) {
                            if (re0Var2 != null) {
                                float f11 = re0Var2.f30121b;
                                f10 = (f7 - f11) / (re0Var.f30121b - f11);
                            } else {
                                f10 = 1.0f;
                            }
                            if (obj2 instanceof te0) {
                                te0 te0Var = (te0) obj2;
                                te0 te0Var2 = (te0) obj;
                                if (te0Var2 != null) {
                                    float f12 = te0Var2.f30808a;
                                    float dpf2 = AndroidUtilities.dpf2(((te0Var.f30808a - f12) * f10) + f12);
                                    float f13 = te0Var2.f30809b;
                                    path.moveTo(dpf2, AndroidUtilities.dpf2(((te0Var.f30809b - f13) * f10) + f13));
                                } else {
                                    path.moveTo(AndroidUtilities.dpf2(te0Var.f30808a), AndroidUtilities.dpf2(te0Var.f30809b));
                                }
                            } else if (obj2 instanceof se0) {
                                se0 se0Var = (se0) obj2;
                                se0 se0Var2 = (se0) obj;
                                if (se0Var2 != null) {
                                    float f14 = se0Var2.f30485a;
                                    float dpf22 = AndroidUtilities.dpf2(((se0Var.f30485a - f14) * f10) + f14);
                                    float f15 = se0Var2.f30486b;
                                    path.lineTo(dpf22, AndroidUtilities.dpf2(((se0Var.f30486b - f15) * f10) + f15));
                                } else {
                                    path.lineTo(AndroidUtilities.dpf2(se0Var.f30485a), AndroidUtilities.dpf2(se0Var.f30486b));
                                }
                            } else if (obj2 instanceof qe0) {
                                qe0 qe0Var = (qe0) obj2;
                                qe0 qe0Var2 = (qe0) obj;
                                if (qe0Var2 != null) {
                                    float f16 = qe0Var2.f29899c;
                                    float dpf23 = AndroidUtilities.dpf2(((qe0Var.f29899c - f16) * f10) + f16);
                                    float f17 = qe0Var2.d;
                                    float dpf24 = AndroidUtilities.dpf2(((qe0Var.d - f17) * f10) + f17);
                                    float f18 = qe0Var2.e;
                                    float dpf25 = AndroidUtilities.dpf2(((qe0Var.e - f18) * f10) + f18);
                                    float f19 = qe0Var2.f29900f;
                                    float dpf26 = AndroidUtilities.dpf2(((qe0Var.f29900f - f19) * f10) + f19);
                                    float f20 = qe0Var2.f29897a;
                                    float dpf27 = AndroidUtilities.dpf2(((qe0Var.f29897a - f20) * f10) + f20);
                                    float f21 = qe0Var2.f29898b;
                                    path.cubicTo(dpf23, dpf24, dpf25, dpf26, dpf27, AndroidUtilities.dpf2(((qe0Var.f29898b - f21) * f10) + f21));
                                } else {
                                    path.cubicTo(AndroidUtilities.dpf2(qe0Var.f29899c), AndroidUtilities.dpf2(qe0Var.d), AndroidUtilities.dpf2(qe0Var.e), AndroidUtilities.dpf2(qe0Var.f29900f), AndroidUtilities.dpf2(qe0Var.f29897a), AndroidUtilities.dpf2(qe0Var.f29898b));
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
