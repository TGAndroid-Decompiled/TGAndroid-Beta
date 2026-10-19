package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class se0 {
    public Path f30242a;
    public float f30243b;
    public float f30244c;
    public float d;
    public float e;
    public float f30245f;
    public ArrayList f30246g;

    public final void a(String str, float f7) {
        float f10 = this.e;
        float f11 = this.d;
        float f12 = this.f30244c;
        try {
            ?? obj = new Object();
            obj.f29246a = new ArrayList();
            obj.f29247b = f7 * this.f30245f;
            String[] split = str.split(" ");
            int i10 = 0;
            while (i10 < split.length) {
                char charAt = split[i10].charAt(0);
                if (charAt != 'C') {
                    if (charAt != 'L') {
                        if (charAt == 'M') {
                            ?? obj2 = new Object();
                            obj2.f29926a = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                            i10 += 2;
                            obj2.f29927b = (Float.parseFloat(split[i10]) + f10) * f12;
                            obj.f29246a.add(obj2);
                        }
                    } else {
                        ?? obj3 = new Object();
                        obj3.f29628a = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                        i10 += 2;
                        obj3.f29629b = (Float.parseFloat(split[i10]) + f10) * f12;
                        obj.f29246a.add(obj3);
                    }
                } else {
                    ?? obj4 = new Object();
                    obj4.f28996c = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                    obj4.d = (Float.parseFloat(split[i10 + 2]) + f10) * f12;
                    obj4.e = (Float.parseFloat(split[i10 + 3]) + f11) * f12;
                    obj4.f28997f = (Float.parseFloat(split[i10 + 4]) + f10) * f12;
                    obj4.f28994a = (Float.parseFloat(split[i10 + 5]) + f11) * f12;
                    i10 += 6;
                    obj4.f28995b = (Float.parseFloat(split[i10]) + f10) * f12;
                    obj.f29246a.add(obj4);
                }
                i10++;
            }
            this.f30246g.add(obj);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void b(Canvas canvas, Paint paint, float f7) {
        pe0 pe0Var;
        pe0 pe0Var2;
        Object obj;
        float f10;
        ArrayList arrayList = this.f30246g;
        Path path = this.f30242a;
        if (this.f30243b != f7) {
            this.f30243b = f7;
            int size = arrayList.size();
            pe0 pe0Var3 = null;
            pe0 pe0Var4 = null;
            for (int i10 = 0; i10 < size; i10++) {
                pe0 pe0Var5 = (pe0) arrayList.get(i10);
                if ((pe0Var4 == null || pe0Var4.f29247b < pe0Var5.f29247b) && pe0Var5.f29247b <= f7) {
                    pe0Var4 = pe0Var5;
                }
                if ((pe0Var3 == null || pe0Var3.f29247b > pe0Var5.f29247b) && pe0Var5.f29247b >= f7) {
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
                ArrayList arrayList2 = pe0Var.f29246a;
                if (pe0Var2 == null || pe0Var2.f29246a.size() == arrayList2.size()) {
                    path.reset();
                    int size2 = arrayList2.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        if (pe0Var2 != null) {
                            obj = pe0Var2.f29246a.get(i11);
                        } else {
                            obj = null;
                        }
                        Object obj2 = arrayList2.get(i11);
                        if (obj == null || obj.getClass() == obj2.getClass()) {
                            if (pe0Var2 != null) {
                                float f11 = pe0Var2.f29247b;
                                f10 = (f7 - f11) / (pe0Var.f29247b - f11);
                            } else {
                                f10 = 1.0f;
                            }
                            if (obj2 instanceof re0) {
                                re0 re0Var = (re0) obj2;
                                re0 re0Var2 = (re0) obj;
                                if (re0Var2 != null) {
                                    float f12 = re0Var2.f29926a;
                                    float dpf2 = AndroidUtilities.dpf2(((re0Var.f29926a - f12) * f10) + f12);
                                    float f13 = re0Var2.f29927b;
                                    path.moveTo(dpf2, AndroidUtilities.dpf2(((re0Var.f29927b - f13) * f10) + f13));
                                } else {
                                    path.moveTo(AndroidUtilities.dpf2(re0Var.f29926a), AndroidUtilities.dpf2(re0Var.f29927b));
                                }
                            } else if (obj2 instanceof qe0) {
                                qe0 qe0Var = (qe0) obj2;
                                qe0 qe0Var2 = (qe0) obj;
                                if (qe0Var2 != null) {
                                    float f14 = qe0Var2.f29628a;
                                    float dpf22 = AndroidUtilities.dpf2(((qe0Var.f29628a - f14) * f10) + f14);
                                    float f15 = qe0Var2.f29629b;
                                    path.lineTo(dpf22, AndroidUtilities.dpf2(((qe0Var.f29629b - f15) * f10) + f15));
                                } else {
                                    path.lineTo(AndroidUtilities.dpf2(qe0Var.f29628a), AndroidUtilities.dpf2(qe0Var.f29629b));
                                }
                            } else if (obj2 instanceof oe0) {
                                oe0 oe0Var = (oe0) obj2;
                                oe0 oe0Var2 = (oe0) obj;
                                if (oe0Var2 != null) {
                                    float f16 = oe0Var2.f28996c;
                                    float dpf23 = AndroidUtilities.dpf2(((oe0Var.f28996c - f16) * f10) + f16);
                                    float f17 = oe0Var2.d;
                                    float dpf24 = AndroidUtilities.dpf2(((oe0Var.d - f17) * f10) + f17);
                                    float f18 = oe0Var2.e;
                                    float dpf25 = AndroidUtilities.dpf2(((oe0Var.e - f18) * f10) + f18);
                                    float f19 = oe0Var2.f28997f;
                                    float dpf26 = AndroidUtilities.dpf2(((oe0Var.f28997f - f19) * f10) + f19);
                                    float f20 = oe0Var2.f28994a;
                                    float dpf27 = AndroidUtilities.dpf2(((oe0Var.f28994a - f20) * f10) + f20);
                                    float f21 = oe0Var2.f28995b;
                                    path.cubicTo(dpf23, dpf24, dpf25, dpf26, dpf27, AndroidUtilities.dpf2(((oe0Var.f28995b - f21) * f10) + f21));
                                } else {
                                    path.cubicTo(AndroidUtilities.dpf2(oe0Var.f28996c), AndroidUtilities.dpf2(oe0Var.d), AndroidUtilities.dpf2(oe0Var.e), AndroidUtilities.dpf2(oe0Var.f28997f), AndroidUtilities.dpf2(oe0Var.f28994a), AndroidUtilities.dpf2(oe0Var.f28995b));
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
