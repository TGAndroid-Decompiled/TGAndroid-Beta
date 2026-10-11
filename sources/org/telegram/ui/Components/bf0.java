package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class bf0 {
    public Path f24938a;
    public float f24939b;
    public float f24940c;
    public float d;
    public float f24941e;
    public float f24942f;
    public ArrayList f24943g;

    public final void a(String str, float f7) {
        float f10 = this.f24941e;
        float f11 = this.d;
        float f12 = this.f24940c;
        try {
            ?? obj = new Object();
            obj.f33185a = new ArrayList();
            obj.f33186b = f7 * this.f24942f;
            String[] split = str.split(" ");
            int i10 = 0;
            while (i10 < split.length) {
                char charAt = split[i10].charAt(0);
                if (charAt != 'C') {
                    if (charAt != 'L') {
                        if (charAt == 'M') {
                            ?? obj2 = new Object();
                            obj2.f24510a = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                            i10 += 2;
                            obj2.f24511b = (Float.parseFloat(split[i10]) + f10) * f12;
                            obj.f33185a.add(obj2);
                        }
                    } else {
                        ?? obj3 = new Object();
                        obj3.f33495a = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                        i10 += 2;
                        obj3.f33496b = (Float.parseFloat(split[i10]) + f10) * f12;
                        obj.f33185a.add(obj3);
                    }
                } else {
                    ?? obj4 = new Object();
                    obj4.f32878c = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                    obj4.d = (Float.parseFloat(split[i10 + 2]) + f10) * f12;
                    obj4.f32879e = (Float.parseFloat(split[i10 + 3]) + f11) * f12;
                    obj4.f32880f = (Float.parseFloat(split[i10 + 4]) + f10) * f12;
                    obj4.f32876a = (Float.parseFloat(split[i10 + 5]) + f11) * f12;
                    i10 += 6;
                    obj4.f32877b = (Float.parseFloat(split[i10]) + f10) * f12;
                    obj.f33185a.add(obj4);
                }
                i10++;
            }
            this.f24943g.add(obj);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public final void b(Canvas canvas, Paint paint, float f7) {
        ye0 ye0Var;
        ye0 ye0Var2;
        Object obj;
        float f10;
        ArrayList arrayList = this.f24943g;
        Path path = this.f24938a;
        if (this.f24939b != f7) {
            this.f24939b = f7;
            int size = arrayList.size();
            ye0 ye0Var3 = null;
            ye0 ye0Var4 = null;
            for (int i10 = 0; i10 < size; i10++) {
                ye0 ye0Var5 = (ye0) arrayList.get(i10);
                if ((ye0Var4 == null || ye0Var4.f33186b < ye0Var5.f33186b) && ye0Var5.f33186b <= f7) {
                    ye0Var4 = ye0Var5;
                }
                if ((ye0Var3 == null || ye0Var3.f33186b > ye0Var5.f33186b) && ye0Var5.f33186b >= f7) {
                    ye0Var3 = ye0Var5;
                }
            }
            if (ye0Var3 == ye0Var4) {
                ye0Var4 = null;
            }
            if (ye0Var4 != null && ye0Var3 == null) {
                ye0Var = ye0Var4;
                ye0Var2 = null;
            } else {
                ye0Var = ye0Var3;
                ye0Var2 = ye0Var4;
            }
            if (ye0Var != null) {
                ArrayList arrayList2 = ye0Var.f33185a;
                if (ye0Var2 == null || ye0Var2.f33185a.size() == arrayList2.size()) {
                    path.reset();
                    int size2 = arrayList2.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        if (ye0Var2 != null) {
                            obj = ye0Var2.f33185a.get(i11);
                        } else {
                            obj = null;
                        }
                        Object obj2 = arrayList2.get(i11);
                        if (obj == null || obj.getClass() == obj2.getClass()) {
                            if (ye0Var2 != null) {
                                float f11 = ye0Var2.f33186b;
                                f10 = (f7 - f11) / (ye0Var.f33186b - f11);
                            } else {
                                f10 = 1.0f;
                            }
                            if (obj2 instanceof af0) {
                                af0 af0Var = (af0) obj2;
                                af0 af0Var2 = (af0) obj;
                                if (af0Var2 != null) {
                                    float f12 = af0Var2.f24510a;
                                    float dpf2 = AndroidUtilities.dpf2(((af0Var.f24510a - f12) * f10) + f12);
                                    float f13 = af0Var2.f24511b;
                                    path.moveTo(dpf2, AndroidUtilities.dpf2(((af0Var.f24511b - f13) * f10) + f13));
                                } else {
                                    path.moveTo(AndroidUtilities.dpf2(af0Var.f24510a), AndroidUtilities.dpf2(af0Var.f24511b));
                                }
                            } else if (obj2 instanceof ze0) {
                                ze0 ze0Var = (ze0) obj2;
                                ze0 ze0Var2 = (ze0) obj;
                                if (ze0Var2 != null) {
                                    float f14 = ze0Var2.f33495a;
                                    float dpf22 = AndroidUtilities.dpf2(((ze0Var.f33495a - f14) * f10) + f14);
                                    float f15 = ze0Var2.f33496b;
                                    path.lineTo(dpf22, AndroidUtilities.dpf2(((ze0Var.f33496b - f15) * f10) + f15));
                                } else {
                                    path.lineTo(AndroidUtilities.dpf2(ze0Var.f33495a), AndroidUtilities.dpf2(ze0Var.f33496b));
                                }
                            } else if (obj2 instanceof xe0) {
                                xe0 xe0Var = (xe0) obj2;
                                xe0 xe0Var2 = (xe0) obj;
                                if (xe0Var2 != null) {
                                    float f16 = xe0Var2.f32878c;
                                    float dpf23 = AndroidUtilities.dpf2(((xe0Var.f32878c - f16) * f10) + f16);
                                    float f17 = xe0Var2.d;
                                    float dpf24 = AndroidUtilities.dpf2(((xe0Var.d - f17) * f10) + f17);
                                    float f18 = xe0Var2.f32879e;
                                    float dpf25 = AndroidUtilities.dpf2(((xe0Var.f32879e - f18) * f10) + f18);
                                    float f19 = xe0Var2.f32880f;
                                    float dpf26 = AndroidUtilities.dpf2(((xe0Var.f32880f - f19) * f10) + f19);
                                    float f20 = xe0Var2.f32876a;
                                    float dpf27 = AndroidUtilities.dpf2(((xe0Var.f32876a - f20) * f10) + f20);
                                    float f21 = xe0Var2.f32877b;
                                    path.cubicTo(dpf23, dpf24, dpf25, dpf26, dpf27, AndroidUtilities.dpf2(((xe0Var.f32877b - f21) * f10) + f21));
                                } else {
                                    path.cubicTo(AndroidUtilities.dpf2(xe0Var.f32878c), AndroidUtilities.dpf2(xe0Var.d), AndroidUtilities.dpf2(xe0Var.f32879e), AndroidUtilities.dpf2(xe0Var.f32880f), AndroidUtilities.dpf2(xe0Var.f32876a), AndroidUtilities.dpf2(xe0Var.f32877b));
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
