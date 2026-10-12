package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class ef0 {
    public Path f25683a;
    public float f25684b;
    public float f25685c;
    public float d;
    public float f25686e;
    public float f25687f;
    public ArrayList f25688g;

    public final void a(String str, float f7) {
        float f10 = this.f25686e;
        float f11 = this.d;
        float f12 = this.f25685c;
        try {
            ?? obj = new Object();
            obj.f24632a = new ArrayList();
            obj.f24633b = f7 * this.f25687f;
            String[] split = str.split(" ");
            int i10 = 0;
            while (i10 < split.length) {
                char charAt = split[i10].charAt(0);
                if (charAt != 'C') {
                    if (charAt != 'L') {
                        if (charAt == 'M') {
                            ?? obj2 = new Object();
                            obj2.f25348a = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                            i10 += 2;
                            obj2.f25349b = (Float.parseFloat(split[i10]) + f10) * f12;
                            obj.f24632a.add(obj2);
                        }
                    } else {
                        ?? obj3 = new Object();
                        obj3.f24937a = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                        i10 += 2;
                        obj3.f24938b = (Float.parseFloat(split[i10]) + f10) * f12;
                        obj.f24632a.add(obj3);
                    }
                } else {
                    ?? obj4 = new Object();
                    obj4.f24301c = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                    obj4.d = (Float.parseFloat(split[i10 + 2]) + f10) * f12;
                    obj4.f24302e = (Float.parseFloat(split[i10 + 3]) + f11) * f12;
                    obj4.f24303f = (Float.parseFloat(split[i10 + 4]) + f10) * f12;
                    obj4.f24299a = (Float.parseFloat(split[i10 + 5]) + f11) * f12;
                    i10 += 6;
                    obj4.f24300b = (Float.parseFloat(split[i10]) + f10) * f12;
                    obj.f24632a.add(obj4);
                }
                i10++;
            }
            this.f25688g.add(obj);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public final void b(Canvas canvas, Paint paint, float f7) {
        bf0 bf0Var;
        bf0 bf0Var2;
        Object obj;
        float f10;
        ArrayList arrayList = this.f25688g;
        Path path = this.f25683a;
        if (this.f25684b != f7) {
            this.f25684b = f7;
            int size = arrayList.size();
            bf0 bf0Var3 = null;
            bf0 bf0Var4 = null;
            for (int i10 = 0; i10 < size; i10++) {
                bf0 bf0Var5 = (bf0) arrayList.get(i10);
                if ((bf0Var4 == null || bf0Var4.f24633b < bf0Var5.f24633b) && bf0Var5.f24633b <= f7) {
                    bf0Var4 = bf0Var5;
                }
                if ((bf0Var3 == null || bf0Var3.f24633b > bf0Var5.f24633b) && bf0Var5.f24633b >= f7) {
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
                ArrayList arrayList2 = bf0Var.f24632a;
                if (bf0Var2 == null || bf0Var2.f24632a.size() == arrayList2.size()) {
                    path.reset();
                    int size2 = arrayList2.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        if (bf0Var2 != null) {
                            obj = bf0Var2.f24632a.get(i11);
                        } else {
                            obj = null;
                        }
                        Object obj2 = arrayList2.get(i11);
                        if (obj == null || obj.getClass() == obj2.getClass()) {
                            if (bf0Var2 != null) {
                                float f11 = bf0Var2.f24633b;
                                f10 = (f7 - f11) / (bf0Var.f24633b - f11);
                            } else {
                                f10 = 1.0f;
                            }
                            if (obj2 instanceof df0) {
                                df0 df0Var = (df0) obj2;
                                df0 df0Var2 = (df0) obj;
                                if (df0Var2 != null) {
                                    float f12 = df0Var2.f25348a;
                                    float dpf2 = AndroidUtilities.dpf2(((df0Var.f25348a - f12) * f10) + f12);
                                    float f13 = df0Var2.f25349b;
                                    path.moveTo(dpf2, AndroidUtilities.dpf2(((df0Var.f25349b - f13) * f10) + f13));
                                } else {
                                    path.moveTo(AndroidUtilities.dpf2(df0Var.f25348a), AndroidUtilities.dpf2(df0Var.f25349b));
                                }
                            } else if (obj2 instanceof cf0) {
                                cf0 cf0Var = (cf0) obj2;
                                cf0 cf0Var2 = (cf0) obj;
                                if (cf0Var2 != null) {
                                    float f14 = cf0Var2.f24937a;
                                    float dpf22 = AndroidUtilities.dpf2(((cf0Var.f24937a - f14) * f10) + f14);
                                    float f15 = cf0Var2.f24938b;
                                    path.lineTo(dpf22, AndroidUtilities.dpf2(((cf0Var.f24938b - f15) * f10) + f15));
                                } else {
                                    path.lineTo(AndroidUtilities.dpf2(cf0Var.f24937a), AndroidUtilities.dpf2(cf0Var.f24938b));
                                }
                            } else if (obj2 instanceof af0) {
                                af0 af0Var = (af0) obj2;
                                af0 af0Var2 = (af0) obj;
                                if (af0Var2 != null) {
                                    float f16 = af0Var2.f24301c;
                                    float dpf23 = AndroidUtilities.dpf2(((af0Var.f24301c - f16) * f10) + f16);
                                    float f17 = af0Var2.d;
                                    float dpf24 = AndroidUtilities.dpf2(((af0Var.d - f17) * f10) + f17);
                                    float f18 = af0Var2.f24302e;
                                    float dpf25 = AndroidUtilities.dpf2(((af0Var.f24302e - f18) * f10) + f18);
                                    float f19 = af0Var2.f24303f;
                                    float dpf26 = AndroidUtilities.dpf2(((af0Var.f24303f - f19) * f10) + f19);
                                    float f20 = af0Var2.f24299a;
                                    float dpf27 = AndroidUtilities.dpf2(((af0Var.f24299a - f20) * f10) + f20);
                                    float f21 = af0Var2.f24300b;
                                    path.cubicTo(dpf23, dpf24, dpf25, dpf26, dpf27, AndroidUtilities.dpf2(((af0Var.f24300b - f21) * f10) + f21));
                                } else {
                                    path.cubicTo(AndroidUtilities.dpf2(af0Var.f24301c), AndroidUtilities.dpf2(af0Var.d), AndroidUtilities.dpf2(af0Var.f24302e), AndroidUtilities.dpf2(af0Var.f24303f), AndroidUtilities.dpf2(af0Var.f24299a), AndroidUtilities.dpf2(af0Var.f24300b));
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
