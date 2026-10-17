package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class se0 {
    public Path f30250a;
    public float f30251b;
    public float f30252c;
    public float d;
    public float e;
    public float f30253f;
    public ArrayList f30254g;

    public final void a(String str, float f7) {
        float f10 = this.e;
        float f11 = this.d;
        float f12 = this.f30252c;
        try {
            ?? obj = new Object();
            obj.f29276a = new ArrayList();
            obj.f29277b = f7 * this.f30253f;
            String[] split = str.split(" ");
            int i10 = 0;
            while (i10 < split.length) {
                char charAt = split[i10].charAt(0);
                if (charAt != 'C') {
                    if (charAt != 'L') {
                        if (charAt == 'M') {
                            ?? obj2 = new Object();
                            obj2.f29920a = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                            i10 += 2;
                            obj2.f29921b = (Float.parseFloat(split[i10]) + f10) * f12;
                            obj.f29276a.add(obj2);
                        }
                    } else {
                        ?? obj3 = new Object();
                        obj3.f29673a = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                        i10 += 2;
                        obj3.f29674b = (Float.parseFloat(split[i10]) + f10) * f12;
                        obj.f29276a.add(obj3);
                    }
                } else {
                    ?? obj4 = new Object();
                    obj4.f28970c = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                    obj4.d = (Float.parseFloat(split[i10 + 2]) + f10) * f12;
                    obj4.e = (Float.parseFloat(split[i10 + 3]) + f11) * f12;
                    obj4.f28971f = (Float.parseFloat(split[i10 + 4]) + f10) * f12;
                    obj4.f28968a = (Float.parseFloat(split[i10 + 5]) + f11) * f12;
                    i10 += 6;
                    obj4.f28969b = (Float.parseFloat(split[i10]) + f10) * f12;
                    obj.f29276a.add(obj4);
                }
                i10++;
            }
            this.f30254g.add(obj);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void b(float f7, Canvas canvas, Paint paint) {
        pe0 pe0Var;
        pe0 pe0Var2;
        Object obj;
        float f10;
        ArrayList arrayList = this.f30254g;
        Path path = this.f30250a;
        if (this.f30251b != f7) {
            this.f30251b = f7;
            int size = arrayList.size();
            pe0 pe0Var3 = null;
            pe0 pe0Var4 = null;
            for (int i10 = 0; i10 < size; i10++) {
                pe0 pe0Var5 = (pe0) arrayList.get(i10);
                if ((pe0Var4 == null || pe0Var4.f29277b < pe0Var5.f29277b) && pe0Var5.f29277b <= f7) {
                    pe0Var4 = pe0Var5;
                }
                if ((pe0Var3 == null || pe0Var3.f29277b > pe0Var5.f29277b) && pe0Var5.f29277b >= f7) {
                    pe0Var3 = pe0Var5;
                }
            }
            if (pe0Var3 == pe0Var4) {
                pe0Var4 = null;
            }
            if (pe0Var4 != null && pe0Var3 == null) {
                pe0Var = pe0Var4;
                pe0Var2 = null;
            } else {
                pe0Var = pe0Var3;
                pe0Var2 = pe0Var4;
            }
            if (pe0Var != null) {
                ArrayList arrayList2 = pe0Var.f29276a;
                if (pe0Var2 == null || pe0Var2.f29276a.size() == arrayList2.size()) {
                    path.reset();
                    int size2 = arrayList2.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        if (pe0Var2 != null) {
                            obj = pe0Var2.f29276a.get(i11);
                        } else {
                            obj = null;
                        }
                        Object obj2 = arrayList2.get(i11);
                        if (obj == null || obj.getClass() == obj2.getClass()) {
                            if (pe0Var2 != null) {
                                float f11 = pe0Var2.f29277b;
                                f10 = (f7 - f11) / (pe0Var.f29277b - f11);
                            } else {
                                f10 = 1.0f;
                            }
                            if (obj2 instanceof re0) {
                                re0 re0Var = (re0) obj2;
                                re0 re0Var2 = (re0) obj;
                                if (re0Var2 != null) {
                                    float f12 = re0Var2.f29920a;
                                    float dpf2 = AndroidUtilities.dpf2(((re0Var.f29920a - f12) * f10) + f12);
                                    float f13 = re0Var2.f29921b;
                                    path.moveTo(dpf2, AndroidUtilities.dpf2(((re0Var.f29921b - f13) * f10) + f13));
                                } else {
                                    path.moveTo(AndroidUtilities.dpf2(re0Var.f29920a), AndroidUtilities.dpf2(re0Var.f29921b));
                                }
                            } else if (obj2 instanceof qe0) {
                                qe0 qe0Var = (qe0) obj2;
                                qe0 qe0Var2 = (qe0) obj;
                                if (qe0Var2 != null) {
                                    float f14 = qe0Var2.f29673a;
                                    float dpf22 = AndroidUtilities.dpf2(((qe0Var.f29673a - f14) * f10) + f14);
                                    float f15 = qe0Var2.f29674b;
                                    path.lineTo(dpf22, AndroidUtilities.dpf2(((qe0Var.f29674b - f15) * f10) + f15));
                                } else {
                                    path.lineTo(AndroidUtilities.dpf2(qe0Var.f29673a), AndroidUtilities.dpf2(qe0Var.f29674b));
                                }
                            } else if (obj2 instanceof oe0) {
                                oe0 oe0Var = (oe0) obj2;
                                oe0 oe0Var2 = (oe0) obj;
                                if (oe0Var2 != null) {
                                    float f16 = oe0Var2.f28970c;
                                    float dpf23 = AndroidUtilities.dpf2(((oe0Var.f28970c - f16) * f10) + f16);
                                    float f17 = oe0Var2.d;
                                    float dpf24 = AndroidUtilities.dpf2(((oe0Var.d - f17) * f10) + f17);
                                    float f18 = oe0Var2.e;
                                    float dpf25 = AndroidUtilities.dpf2(((oe0Var.e - f18) * f10) + f18);
                                    float f19 = oe0Var2.f28971f;
                                    float dpf26 = AndroidUtilities.dpf2(((oe0Var.f28971f - f19) * f10) + f19);
                                    float f20 = oe0Var2.f28968a;
                                    float dpf27 = AndroidUtilities.dpf2(((oe0Var.f28968a - f20) * f10) + f20);
                                    float f21 = oe0Var2.f28969b;
                                    path.cubicTo(dpf23, dpf24, dpf25, dpf26, dpf27, AndroidUtilities.dpf2(((oe0Var.f28969b - f21) * f10) + f21));
                                } else {
                                    path.cubicTo(AndroidUtilities.dpf2(oe0Var.f28970c), AndroidUtilities.dpf2(oe0Var.d), AndroidUtilities.dpf2(oe0Var.e), AndroidUtilities.dpf2(oe0Var.f28971f), AndroidUtilities.dpf2(oe0Var.f28968a), AndroidUtilities.dpf2(oe0Var.f28969b));
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
