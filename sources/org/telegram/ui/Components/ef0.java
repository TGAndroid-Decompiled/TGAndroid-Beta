package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class ef0 {
    public Path f25688a;
    public float f25689b;
    public float f25690c;
    public float d;
    public float f25691e;
    public float f25692f;
    public ArrayList f25693g;

    public final void a(String str, float f7) {
        float f10 = this.f25691e;
        float f11 = this.d;
        float f12 = this.f25690c;
        try {
            ?? obj = new Object();
            obj.f24623a = new ArrayList();
            obj.f24624b = f7 * this.f25692f;
            String[] split = str.split(" ");
            int i10 = 0;
            while (i10 < split.length) {
                char charAt = split[i10].charAt(0);
                if (charAt != 'C') {
                    if (charAt != 'L') {
                        if (charAt == 'M') {
                            ?? obj2 = new Object();
                            obj2.f25340a = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                            i10 += 2;
                            obj2.f25341b = (Float.parseFloat(split[i10]) + f10) * f12;
                            obj.f24623a.add(obj2);
                        }
                    } else {
                        ?? obj3 = new Object();
                        obj3.f24932a = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                        i10 += 2;
                        obj3.f24933b = (Float.parseFloat(split[i10]) + f10) * f12;
                        obj.f24623a.add(obj3);
                    }
                } else {
                    ?? obj4 = new Object();
                    obj4.f24297c = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                    obj4.d = (Float.parseFloat(split[i10 + 2]) + f10) * f12;
                    obj4.f24298e = (Float.parseFloat(split[i10 + 3]) + f11) * f12;
                    obj4.f24299f = (Float.parseFloat(split[i10 + 4]) + f10) * f12;
                    obj4.f24295a = (Float.parseFloat(split[i10 + 5]) + f11) * f12;
                    i10 += 6;
                    obj4.f24296b = (Float.parseFloat(split[i10]) + f10) * f12;
                    obj.f24623a.add(obj4);
                }
                i10++;
            }
            this.f25693g.add(obj);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public final void b(Canvas canvas, Paint paint, float f7) {
        bf0 bf0Var;
        bf0 bf0Var2;
        Object obj;
        float f10;
        ArrayList arrayList = this.f25693g;
        Path path = this.f25688a;
        if (this.f25689b != f7) {
            this.f25689b = f7;
            int size = arrayList.size();
            bf0 bf0Var3 = null;
            bf0 bf0Var4 = null;
            for (int i10 = 0; i10 < size; i10++) {
                bf0 bf0Var5 = (bf0) arrayList.get(i10);
                if ((bf0Var4 == null || bf0Var4.f24624b < bf0Var5.f24624b) && bf0Var5.f24624b <= f7) {
                    bf0Var4 = bf0Var5;
                }
                if ((bf0Var3 == null || bf0Var3.f24624b > bf0Var5.f24624b) && bf0Var5.f24624b >= f7) {
                    bf0Var3 = bf0Var5;
                }
            }
            if (bf0Var3 == bf0Var4) {
                bf0Var4 = null;
            }
            if (bf0Var4 != null && bf0Var3 == null) {
                bf0Var = bf0Var4;
                bf0Var2 = null;
            } else {
                bf0Var = bf0Var3;
                bf0Var2 = bf0Var4;
            }
            if (bf0Var != null) {
                ArrayList arrayList2 = bf0Var.f24623a;
                if (bf0Var2 == null || bf0Var2.f24623a.size() == arrayList2.size()) {
                    path.reset();
                    int size2 = arrayList2.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        if (bf0Var2 != null) {
                            obj = bf0Var2.f24623a.get(i11);
                        } else {
                            obj = null;
                        }
                        Object obj2 = arrayList2.get(i11);
                        if (obj == null || obj.getClass() == obj2.getClass()) {
                            if (bf0Var2 != null) {
                                float f11 = bf0Var2.f24624b;
                                f10 = (f7 - f11) / (bf0Var.f24624b - f11);
                            } else {
                                f10 = 1.0f;
                            }
                            if (obj2 instanceof df0) {
                                df0 df0Var = (df0) obj2;
                                df0 df0Var2 = (df0) obj;
                                if (df0Var2 != null) {
                                    float f12 = df0Var2.f25340a;
                                    float dpf2 = AndroidUtilities.dpf2(((df0Var.f25340a - f12) * f10) + f12);
                                    float f13 = df0Var2.f25341b;
                                    path.moveTo(dpf2, AndroidUtilities.dpf2(((df0Var.f25341b - f13) * f10) + f13));
                                } else {
                                    path.moveTo(AndroidUtilities.dpf2(df0Var.f25340a), AndroidUtilities.dpf2(df0Var.f25341b));
                                }
                            } else if (obj2 instanceof cf0) {
                                cf0 cf0Var = (cf0) obj2;
                                cf0 cf0Var2 = (cf0) obj;
                                if (cf0Var2 != null) {
                                    float f14 = cf0Var2.f24932a;
                                    float dpf22 = AndroidUtilities.dpf2(((cf0Var.f24932a - f14) * f10) + f14);
                                    float f15 = cf0Var2.f24933b;
                                    path.lineTo(dpf22, AndroidUtilities.dpf2(((cf0Var.f24933b - f15) * f10) + f15));
                                } else {
                                    path.lineTo(AndroidUtilities.dpf2(cf0Var.f24932a), AndroidUtilities.dpf2(cf0Var.f24933b));
                                }
                            } else if (obj2 instanceof af0) {
                                af0 af0Var = (af0) obj2;
                                af0 af0Var2 = (af0) obj;
                                if (af0Var2 != null) {
                                    float f16 = af0Var2.f24297c;
                                    float dpf23 = AndroidUtilities.dpf2(((af0Var.f24297c - f16) * f10) + f16);
                                    float f17 = af0Var2.d;
                                    float dpf24 = AndroidUtilities.dpf2(((af0Var.d - f17) * f10) + f17);
                                    float f18 = af0Var2.f24298e;
                                    float dpf25 = AndroidUtilities.dpf2(((af0Var.f24298e - f18) * f10) + f18);
                                    float f19 = af0Var2.f24299f;
                                    float dpf26 = AndroidUtilities.dpf2(((af0Var.f24299f - f19) * f10) + f19);
                                    float f20 = af0Var2.f24295a;
                                    float dpf27 = AndroidUtilities.dpf2(((af0Var.f24295a - f20) * f10) + f20);
                                    float f21 = af0Var2.f24296b;
                                    path.cubicTo(dpf23, dpf24, dpf25, dpf26, dpf27, AndroidUtilities.dpf2(((af0Var.f24296b - f21) * f10) + f21));
                                } else {
                                    path.cubicTo(AndroidUtilities.dpf2(af0Var.f24297c), AndroidUtilities.dpf2(af0Var.d), AndroidUtilities.dpf2(af0Var.f24298e), AndroidUtilities.dpf2(af0Var.f24299f), AndroidUtilities.dpf2(af0Var.f24295a), AndroidUtilities.dpf2(af0Var.f24296b));
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
