package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class te0 {
    public Path f30510a;
    public float f30511b;
    public float f30512c;
    public float d;
    public float e;
    public float f30513f;
    public ArrayList f30514g;

    public final void a(String str, float f7) {
        float f10 = this.e;
        float f11 = this.d;
        float f12 = this.f30512c;
        try {
            ?? obj = new Object();
            obj.f29564a = new ArrayList();
            obj.f29565b = f7 * this.f30513f;
            String[] split = str.split(" ");
            int i10 = 0;
            while (i10 < split.length) {
                char charAt = split[i10].charAt(0);
                if (charAt != 'C') {
                    if (charAt != 'L') {
                        if (charAt == 'M') {
                            ?? obj2 = new Object();
                            obj2.f30260a = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                            i10 += 2;
                            obj2.f30261b = (Float.parseFloat(split[i10]) + f10) * f12;
                            obj.f29564a.add(obj2);
                        }
                    } else {
                        ?? obj3 = new Object();
                        obj3.f29921a = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                        i10 += 2;
                        obj3.f29922b = (Float.parseFloat(split[i10]) + f10) * f12;
                        obj.f29564a.add(obj3);
                    }
                } else {
                    ?? obj4 = new Object();
                    obj4.f29303c = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                    obj4.d = (Float.parseFloat(split[i10 + 2]) + f10) * f12;
                    obj4.e = (Float.parseFloat(split[i10 + 3]) + f11) * f12;
                    obj4.f29304f = (Float.parseFloat(split[i10 + 4]) + f10) * f12;
                    obj4.f29301a = (Float.parseFloat(split[i10 + 5]) + f11) * f12;
                    i10 += 6;
                    obj4.f29302b = (Float.parseFloat(split[i10]) + f10) * f12;
                    obj.f29564a.add(obj4);
                }
                i10++;
            }
            this.f30514g.add(obj);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void b(Canvas canvas, Paint paint, float f7) {
        qe0 qe0Var;
        qe0 qe0Var2;
        Object obj;
        float f10;
        ArrayList arrayList = this.f30514g;
        Path path = this.f30510a;
        if (this.f30511b != f7) {
            this.f30511b = f7;
            int size = arrayList.size();
            qe0 qe0Var3 = null;
            qe0 qe0Var4 = null;
            for (int i10 = 0; i10 < size; i10++) {
                qe0 qe0Var5 = (qe0) arrayList.get(i10);
                if ((qe0Var4 == null || qe0Var4.f29565b < qe0Var5.f29565b) && qe0Var5.f29565b <= f7) {
                    qe0Var4 = qe0Var5;
                }
                if ((qe0Var3 == null || qe0Var3.f29565b > qe0Var5.f29565b) && qe0Var5.f29565b >= f7) {
                    qe0Var3 = qe0Var5;
                }
            }
            if (qe0Var3 == qe0Var4) {
                qe0Var4 = null;
            }
            if (qe0Var4 != null && qe0Var3 == null) {
                qe0Var = qe0Var4;
                qe0Var2 = null;
            } else {
                qe0Var = qe0Var3;
                qe0Var2 = qe0Var4;
            }
            if (qe0Var != null) {
                ArrayList arrayList2 = qe0Var.f29564a;
                if (qe0Var2 == null || qe0Var2.f29564a.size() == arrayList2.size()) {
                    path.reset();
                    int size2 = arrayList2.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        if (qe0Var2 != null) {
                            obj = qe0Var2.f29564a.get(i11);
                        } else {
                            obj = null;
                        }
                        Object obj2 = arrayList2.get(i11);
                        if (obj == null || obj.getClass() == obj2.getClass()) {
                            if (qe0Var2 != null) {
                                float f11 = qe0Var2.f29565b;
                                f10 = (f7 - f11) / (qe0Var.f29565b - f11);
                            } else {
                                f10 = 1.0f;
                            }
                            if (obj2 instanceof se0) {
                                se0 se0Var = (se0) obj2;
                                se0 se0Var2 = (se0) obj;
                                if (se0Var2 != null) {
                                    float f12 = se0Var2.f30260a;
                                    float dpf2 = AndroidUtilities.dpf2(((se0Var.f30260a - f12) * f10) + f12);
                                    float f13 = se0Var2.f30261b;
                                    path.moveTo(dpf2, AndroidUtilities.dpf2(((se0Var.f30261b - f13) * f10) + f13));
                                } else {
                                    path.moveTo(AndroidUtilities.dpf2(se0Var.f30260a), AndroidUtilities.dpf2(se0Var.f30261b));
                                }
                            } else if (obj2 instanceof re0) {
                                re0 re0Var = (re0) obj2;
                                re0 re0Var2 = (re0) obj;
                                if (re0Var2 != null) {
                                    float f14 = re0Var2.f29921a;
                                    float dpf22 = AndroidUtilities.dpf2(((re0Var.f29921a - f14) * f10) + f14);
                                    float f15 = re0Var2.f29922b;
                                    path.lineTo(dpf22, AndroidUtilities.dpf2(((re0Var.f29922b - f15) * f10) + f15));
                                } else {
                                    path.lineTo(AndroidUtilities.dpf2(re0Var.f29921a), AndroidUtilities.dpf2(re0Var.f29922b));
                                }
                            } else if (obj2 instanceof pe0) {
                                pe0 pe0Var = (pe0) obj2;
                                pe0 pe0Var2 = (pe0) obj;
                                if (pe0Var2 != null) {
                                    float f16 = pe0Var2.f29303c;
                                    float dpf23 = AndroidUtilities.dpf2(((pe0Var.f29303c - f16) * f10) + f16);
                                    float f17 = pe0Var2.d;
                                    float dpf24 = AndroidUtilities.dpf2(((pe0Var.d - f17) * f10) + f17);
                                    float f18 = pe0Var2.e;
                                    float dpf25 = AndroidUtilities.dpf2(((pe0Var.e - f18) * f10) + f18);
                                    float f19 = pe0Var2.f29304f;
                                    float dpf26 = AndroidUtilities.dpf2(((pe0Var.f29304f - f19) * f10) + f19);
                                    float f20 = pe0Var2.f29301a;
                                    float dpf27 = AndroidUtilities.dpf2(((pe0Var.f29301a - f20) * f10) + f20);
                                    float f21 = pe0Var2.f29302b;
                                    path.cubicTo(dpf23, dpf24, dpf25, dpf26, dpf27, AndroidUtilities.dpf2(((pe0Var.f29302b - f21) * f10) + f21));
                                } else {
                                    path.cubicTo(AndroidUtilities.dpf2(pe0Var.f29303c), AndroidUtilities.dpf2(pe0Var.d), AndroidUtilities.dpf2(pe0Var.e), AndroidUtilities.dpf2(pe0Var.f29304f), AndroidUtilities.dpf2(pe0Var.f29301a), AndroidUtilities.dpf2(pe0Var.f29302b));
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
