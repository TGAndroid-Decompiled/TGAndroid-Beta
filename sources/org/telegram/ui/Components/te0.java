package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class te0 {
    public Path f30514a;
    public float f30515b;
    public float f30516c;
    public float d;
    public float e;
    public float f30517f;
    public ArrayList f30518g;

    public final void a(String str, float f7) {
        float f10 = this.e;
        float f11 = this.d;
        float f12 = this.f30516c;
        try {
            ?? obj = new Object();
            obj.f29568a = new ArrayList();
            obj.f29569b = f7 * this.f30517f;
            String[] split = str.split(" ");
            int i10 = 0;
            while (i10 < split.length) {
                char charAt = split[i10].charAt(0);
                if (charAt != 'C') {
                    if (charAt != 'L') {
                        if (charAt == 'M') {
                            ?? obj2 = new Object();
                            obj2.f30264a = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                            i10 += 2;
                            obj2.f30265b = (Float.parseFloat(split[i10]) + f10) * f12;
                            obj.f29568a.add(obj2);
                        }
                    } else {
                        ?? obj3 = new Object();
                        obj3.f29925a = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                        i10 += 2;
                        obj3.f29926b = (Float.parseFloat(split[i10]) + f10) * f12;
                        obj.f29568a.add(obj3);
                    }
                } else {
                    ?? obj4 = new Object();
                    obj4.f29307c = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                    obj4.d = (Float.parseFloat(split[i10 + 2]) + f10) * f12;
                    obj4.e = (Float.parseFloat(split[i10 + 3]) + f11) * f12;
                    obj4.f29308f = (Float.parseFloat(split[i10 + 4]) + f10) * f12;
                    obj4.f29305a = (Float.parseFloat(split[i10 + 5]) + f11) * f12;
                    i10 += 6;
                    obj4.f29306b = (Float.parseFloat(split[i10]) + f10) * f12;
                    obj.f29568a.add(obj4);
                }
                i10++;
            }
            this.f30518g.add(obj);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void b(Canvas canvas, Paint paint, float f7) {
        qe0 qe0Var;
        qe0 qe0Var2;
        Object obj;
        float f10;
        ArrayList arrayList = this.f30518g;
        Path path = this.f30514a;
        if (this.f30515b != f7) {
            this.f30515b = f7;
            int size = arrayList.size();
            qe0 qe0Var3 = null;
            qe0 qe0Var4 = null;
            for (int i10 = 0; i10 < size; i10++) {
                qe0 qe0Var5 = (qe0) arrayList.get(i10);
                if ((qe0Var4 == null || qe0Var4.f29569b < qe0Var5.f29569b) && qe0Var5.f29569b <= f7) {
                    qe0Var4 = qe0Var5;
                }
                if ((qe0Var3 == null || qe0Var3.f29569b > qe0Var5.f29569b) && qe0Var5.f29569b >= f7) {
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
                ArrayList arrayList2 = qe0Var.f29568a;
                if (qe0Var2 == null || qe0Var2.f29568a.size() == arrayList2.size()) {
                    path.reset();
                    int size2 = arrayList2.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        if (qe0Var2 != null) {
                            obj = qe0Var2.f29568a.get(i11);
                        } else {
                            obj = null;
                        }
                        Object obj2 = arrayList2.get(i11);
                        if (obj == null || obj.getClass() == obj2.getClass()) {
                            if (qe0Var2 != null) {
                                float f11 = qe0Var2.f29569b;
                                f10 = (f7 - f11) / (qe0Var.f29569b - f11);
                            } else {
                                f10 = 1.0f;
                            }
                            if (obj2 instanceof se0) {
                                se0 se0Var = (se0) obj2;
                                se0 se0Var2 = (se0) obj;
                                if (se0Var2 != null) {
                                    float f12 = se0Var2.f30264a;
                                    float dpf2 = AndroidUtilities.dpf2(((se0Var.f30264a - f12) * f10) + f12);
                                    float f13 = se0Var2.f30265b;
                                    path.moveTo(dpf2, AndroidUtilities.dpf2(((se0Var.f30265b - f13) * f10) + f13));
                                } else {
                                    path.moveTo(AndroidUtilities.dpf2(se0Var.f30264a), AndroidUtilities.dpf2(se0Var.f30265b));
                                }
                            } else if (obj2 instanceof re0) {
                                re0 re0Var = (re0) obj2;
                                re0 re0Var2 = (re0) obj;
                                if (re0Var2 != null) {
                                    float f14 = re0Var2.f29925a;
                                    float dpf22 = AndroidUtilities.dpf2(((re0Var.f29925a - f14) * f10) + f14);
                                    float f15 = re0Var2.f29926b;
                                    path.lineTo(dpf22, AndroidUtilities.dpf2(((re0Var.f29926b - f15) * f10) + f15));
                                } else {
                                    path.lineTo(AndroidUtilities.dpf2(re0Var.f29925a), AndroidUtilities.dpf2(re0Var.f29926b));
                                }
                            } else if (obj2 instanceof pe0) {
                                pe0 pe0Var = (pe0) obj2;
                                pe0 pe0Var2 = (pe0) obj;
                                if (pe0Var2 != null) {
                                    float f16 = pe0Var2.f29307c;
                                    float dpf23 = AndroidUtilities.dpf2(((pe0Var.f29307c - f16) * f10) + f16);
                                    float f17 = pe0Var2.d;
                                    float dpf24 = AndroidUtilities.dpf2(((pe0Var.d - f17) * f10) + f17);
                                    float f18 = pe0Var2.e;
                                    float dpf25 = AndroidUtilities.dpf2(((pe0Var.e - f18) * f10) + f18);
                                    float f19 = pe0Var2.f29308f;
                                    float dpf26 = AndroidUtilities.dpf2(((pe0Var.f29308f - f19) * f10) + f19);
                                    float f20 = pe0Var2.f29305a;
                                    float dpf27 = AndroidUtilities.dpf2(((pe0Var.f29305a - f20) * f10) + f20);
                                    float f21 = pe0Var2.f29306b;
                                    path.cubicTo(dpf23, dpf24, dpf25, dpf26, dpf27, AndroidUtilities.dpf2(((pe0Var.f29306b - f21) * f10) + f21));
                                } else {
                                    path.cubicTo(AndroidUtilities.dpf2(pe0Var.f29307c), AndroidUtilities.dpf2(pe0Var.d), AndroidUtilities.dpf2(pe0Var.e), AndroidUtilities.dpf2(pe0Var.f29308f), AndroidUtilities.dpf2(pe0Var.f29305a), AndroidUtilities.dpf2(pe0Var.f29306b));
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
