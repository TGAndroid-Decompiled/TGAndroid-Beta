package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class de0 {
    public Path f24258a;
    public float f24259b;
    public float f24260c;
    public float d;
    public float e;
    public float f24261f;
    public ArrayList f24262g;

    public final void a(String str, float f10) {
        float f11 = this.e;
        float f12 = this.d;
        float f13 = this.f24260c;
        try {
            ?? obj = new Object();
            obj.f23365a = new ArrayList();
            obj.f23366b = f10 * this.f24261f;
            String[] split = str.split(" ");
            int i10 = 0;
            while (i10 < split.length) {
                char charAt = split[i10].charAt(0);
                if (charAt != 'C') {
                    if (charAt != 'L') {
                        if (charAt == 'M') {
                            ?? obj2 = new Object();
                            obj2.f23934a = (Float.parseFloat(split[i10 + 1]) + f12) * f13;
                            i10 += 2;
                            obj2.f23935b = (Float.parseFloat(split[i10]) + f11) * f13;
                            obj.f23365a.add(obj2);
                        }
                    } else {
                        ?? obj3 = new Object();
                        obj3.f23659a = (Float.parseFloat(split[i10 + 1]) + f12) * f13;
                        i10 += 2;
                        obj3.f23660b = (Float.parseFloat(split[i10]) + f11) * f13;
                        obj.f23365a.add(obj3);
                    }
                } else {
                    ?? obj4 = new Object();
                    obj4.f31366c = (Float.parseFloat(split[i10 + 1]) + f12) * f13;
                    obj4.d = (Float.parseFloat(split[i10 + 2]) + f11) * f13;
                    obj4.e = (Float.parseFloat(split[i10 + 3]) + f12) * f13;
                    obj4.f31367f = (Float.parseFloat(split[i10 + 4]) + f11) * f13;
                    obj4.f31364a = (Float.parseFloat(split[i10 + 5]) + f12) * f13;
                    i10 += 6;
                    obj4.f31365b = (Float.parseFloat(split[i10]) + f11) * f13;
                    obj.f23365a.add(obj4);
                }
                i10++;
            }
            this.f24262g.add(obj);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void b(Canvas canvas, Paint paint, float f10) {
        ae0 ae0Var;
        ae0 ae0Var2;
        Object obj;
        float f11;
        ArrayList arrayList = this.f24262g;
        Path path = this.f24258a;
        if (this.f24259b != f10) {
            this.f24259b = f10;
            int size = arrayList.size();
            ae0 ae0Var3 = null;
            ae0 ae0Var4 = null;
            for (int i10 = 0; i10 < size; i10++) {
                ae0 ae0Var5 = (ae0) arrayList.get(i10);
                if ((ae0Var4 == null || ae0Var4.f23366b < ae0Var5.f23366b) && ae0Var5.f23366b <= f10) {
                    ae0Var4 = ae0Var5;
                }
                if ((ae0Var3 == null || ae0Var3.f23366b > ae0Var5.f23366b) && ae0Var5.f23366b >= f10) {
                    ae0Var3 = ae0Var5;
                }
            }
            if (ae0Var3 == ae0Var4) {
                ae0Var4 = null;
            }
            if (ae0Var4 != null && ae0Var3 == null) {
                ae0Var = ae0Var4;
                ae0Var2 = null;
            } else {
                ae0Var = ae0Var3;
                ae0Var2 = ae0Var4;
            }
            if (ae0Var != null) {
                ArrayList arrayList2 = ae0Var.f23365a;
                if (ae0Var2 == null || ae0Var2.f23365a.size() == arrayList2.size()) {
                    path.reset();
                    int size2 = arrayList2.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        if (ae0Var2 != null) {
                            obj = ae0Var2.f23365a.get(i11);
                        } else {
                            obj = null;
                        }
                        Object obj2 = arrayList2.get(i11);
                        if (obj == null || obj.getClass() == obj2.getClass()) {
                            if (ae0Var2 != null) {
                                float f12 = ae0Var2.f23366b;
                                f11 = (f10 - f12) / (ae0Var.f23366b - f12);
                            } else {
                                f11 = 1.0f;
                            }
                            if (obj2 instanceof ce0) {
                                ce0 ce0Var = (ce0) obj2;
                                ce0 ce0Var2 = (ce0) obj;
                                if (ce0Var2 != null) {
                                    float f13 = ce0Var2.f23934a;
                                    float dpf2 = AndroidUtilities.dpf2(((ce0Var.f23934a - f13) * f11) + f13);
                                    float f14 = ce0Var2.f23935b;
                                    path.moveTo(dpf2, AndroidUtilities.dpf2(((ce0Var.f23935b - f14) * f11) + f14));
                                } else {
                                    path.moveTo(AndroidUtilities.dpf2(ce0Var.f23934a), AndroidUtilities.dpf2(ce0Var.f23935b));
                                }
                            } else if (obj2 instanceof be0) {
                                be0 be0Var = (be0) obj2;
                                be0 be0Var2 = (be0) obj;
                                if (be0Var2 != null) {
                                    float f15 = be0Var2.f23659a;
                                    float dpf22 = AndroidUtilities.dpf2(((be0Var.f23659a - f15) * f11) + f15);
                                    float f16 = be0Var2.f23660b;
                                    path.lineTo(dpf22, AndroidUtilities.dpf2(((be0Var.f23660b - f16) * f11) + f16));
                                } else {
                                    path.lineTo(AndroidUtilities.dpf2(be0Var.f23659a), AndroidUtilities.dpf2(be0Var.f23660b));
                                }
                            } else if (obj2 instanceof zd0) {
                                zd0 zd0Var = (zd0) obj2;
                                zd0 zd0Var2 = (zd0) obj;
                                if (zd0Var2 != null) {
                                    float f17 = zd0Var2.f31366c;
                                    float dpf23 = AndroidUtilities.dpf2(((zd0Var.f31366c - f17) * f11) + f17);
                                    float f18 = zd0Var2.d;
                                    float dpf24 = AndroidUtilities.dpf2(((zd0Var.d - f18) * f11) + f18);
                                    float f19 = zd0Var2.e;
                                    float dpf25 = AndroidUtilities.dpf2(((zd0Var.e - f19) * f11) + f19);
                                    float f20 = zd0Var2.f31367f;
                                    float dpf26 = AndroidUtilities.dpf2(((zd0Var.f31367f - f20) * f11) + f20);
                                    float f21 = zd0Var2.f31364a;
                                    float dpf27 = AndroidUtilities.dpf2(((zd0Var.f31364a - f21) * f11) + f21);
                                    float f22 = zd0Var2.f31365b;
                                    path.cubicTo(dpf23, dpf24, dpf25, dpf26, dpf27, AndroidUtilities.dpf2(((zd0Var.f31365b - f22) * f11) + f22));
                                } else {
                                    path.cubicTo(AndroidUtilities.dpf2(zd0Var.f31366c), AndroidUtilities.dpf2(zd0Var.d), AndroidUtilities.dpf2(zd0Var.e), AndroidUtilities.dpf2(zd0Var.f31367f), AndroidUtilities.dpf2(zd0Var.f31364a), AndroidUtilities.dpf2(zd0Var.f31365b));
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
