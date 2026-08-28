package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class fd0 {
    public Path f28388a;
    public float f28389b;
    public float f28390c;
    public float d;
    public float f28391e;
    public float f28392f;
    public ArrayList f28393g;

    public final void a(String str, float f10) {
        float f11 = this.f28391e;
        float f12 = this.d;
        float f13 = this.f28390c;
        try {
            ?? obj = new Object();
            obj.f27469a = new ArrayList();
            obj.f27470b = f10 * this.f28392f;
            String[] split = str.split(" ");
            int i9 = 0;
            while (i9 < split.length) {
                char charAt = split[i9].charAt(0);
                if (charAt != 'C') {
                    if (charAt != 'L') {
                        if (charAt == 'M') {
                            ?? obj2 = new Object();
                            obj2.f28006a = (Float.parseFloat(split[i9 + 1]) + f12) * f13;
                            i9 += 2;
                            obj2.f28007b = (Float.parseFloat(split[i9]) + f11) * f13;
                            obj.f27469a.add(obj2);
                        }
                    } else {
                        ?? obj3 = new Object();
                        obj3.f27721a = (Float.parseFloat(split[i9 + 1]) + f12) * f13;
                        i9 += 2;
                        obj3.f27722b = (Float.parseFloat(split[i9]) + f11) * f13;
                        obj.f27469a.add(obj3);
                    }
                } else {
                    ?? obj4 = new Object();
                    obj4.f27176c = (Float.parseFloat(split[i9 + 1]) + f12) * f13;
                    obj4.d = (Float.parseFloat(split[i9 + 2]) + f11) * f13;
                    obj4.f27177e = (Float.parseFloat(split[i9 + 3]) + f12) * f13;
                    obj4.f27178f = (Float.parseFloat(split[i9 + 4]) + f11) * f13;
                    obj4.f27174a = (Float.parseFloat(split[i9 + 5]) + f12) * f13;
                    i9 += 6;
                    obj4.f27175b = (Float.parseFloat(split[i9]) + f11) * f13;
                    obj.f27469a.add(obj4);
                }
                i9++;
            }
            this.f28393g.add(obj);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public final void b(Canvas canvas, Paint paint, float f10) {
        cd0 cd0Var;
        cd0 cd0Var2;
        Object obj;
        float f11;
        ArrayList arrayList = this.f28393g;
        Path path = this.f28388a;
        if (this.f28389b != f10) {
            this.f28389b = f10;
            int size = arrayList.size();
            cd0 cd0Var3 = null;
            cd0 cd0Var4 = null;
            for (int i9 = 0; i9 < size; i9++) {
                cd0 cd0Var5 = (cd0) arrayList.get(i9);
                if ((cd0Var4 == null || cd0Var4.f27470b < cd0Var5.f27470b) && cd0Var5.f27470b <= f10) {
                    cd0Var4 = cd0Var5;
                }
                if ((cd0Var3 == null || cd0Var3.f27470b > cd0Var5.f27470b) && cd0Var5.f27470b >= f10) {
                    cd0Var3 = cd0Var5;
                }
            }
            if (cd0Var3 == cd0Var4) {
                cd0Var4 = null;
            }
            if (cd0Var4 != null && cd0Var3 == null) {
                cd0Var = cd0Var4;
                cd0Var2 = null;
            } else {
                cd0Var = cd0Var3;
                cd0Var2 = cd0Var4;
            }
            if (cd0Var != null) {
                ArrayList arrayList2 = cd0Var.f27469a;
                if (cd0Var2 == null || cd0Var2.f27469a.size() == arrayList2.size()) {
                    path.reset();
                    int size2 = arrayList2.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        if (cd0Var2 != null) {
                            obj = cd0Var2.f27469a.get(i10);
                        } else {
                            obj = null;
                        }
                        Object obj2 = arrayList2.get(i10);
                        if (obj == null || obj.getClass() == obj2.getClass()) {
                            if (cd0Var2 != null) {
                                float f12 = cd0Var2.f27470b;
                                f11 = (f10 - f12) / (cd0Var.f27470b - f12);
                            } else {
                                f11 = 1.0f;
                            }
                            if (obj2 instanceof ed0) {
                                ed0 ed0Var = (ed0) obj2;
                                ed0 ed0Var2 = (ed0) obj;
                                if (ed0Var2 != null) {
                                    float f13 = ed0Var2.f28006a;
                                    float dpf2 = AndroidUtilities.dpf2(((ed0Var.f28006a - f13) * f11) + f13);
                                    float f14 = ed0Var2.f28007b;
                                    path.moveTo(dpf2, AndroidUtilities.dpf2(((ed0Var.f28007b - f14) * f11) + f14));
                                } else {
                                    path.moveTo(AndroidUtilities.dpf2(ed0Var.f28006a), AndroidUtilities.dpf2(ed0Var.f28007b));
                                }
                            } else if (obj2 instanceof dd0) {
                                dd0 dd0Var = (dd0) obj2;
                                dd0 dd0Var2 = (dd0) obj;
                                if (dd0Var2 != null) {
                                    float f15 = dd0Var2.f27721a;
                                    float dpf22 = AndroidUtilities.dpf2(((dd0Var.f27721a - f15) * f11) + f15);
                                    float f16 = dd0Var2.f27722b;
                                    path.lineTo(dpf22, AndroidUtilities.dpf2(((dd0Var.f27722b - f16) * f11) + f16));
                                } else {
                                    path.lineTo(AndroidUtilities.dpf2(dd0Var.f27721a), AndroidUtilities.dpf2(dd0Var.f27722b));
                                }
                            } else if (obj2 instanceof bd0) {
                                bd0 bd0Var = (bd0) obj2;
                                bd0 bd0Var2 = (bd0) obj;
                                if (bd0Var2 != null) {
                                    float f17 = bd0Var2.f27176c;
                                    float dpf23 = AndroidUtilities.dpf2(((bd0Var.f27176c - f17) * f11) + f17);
                                    float f18 = bd0Var2.d;
                                    float dpf24 = AndroidUtilities.dpf2(((bd0Var.d - f18) * f11) + f18);
                                    float f19 = bd0Var2.f27177e;
                                    float dpf25 = AndroidUtilities.dpf2(((bd0Var.f27177e - f19) * f11) + f19);
                                    float f20 = bd0Var2.f27178f;
                                    float dpf26 = AndroidUtilities.dpf2(((bd0Var.f27178f - f20) * f11) + f20);
                                    float f21 = bd0Var2.f27174a;
                                    float dpf27 = AndroidUtilities.dpf2(((bd0Var.f27174a - f21) * f11) + f21);
                                    float f22 = bd0Var2.f27175b;
                                    path.cubicTo(dpf23, dpf24, dpf25, dpf26, dpf27, AndroidUtilities.dpf2(((bd0Var.f27175b - f22) * f11) + f22));
                                } else {
                                    path.cubicTo(AndroidUtilities.dpf2(bd0Var.f27176c), AndroidUtilities.dpf2(bd0Var.d), AndroidUtilities.dpf2(bd0Var.f27177e), AndroidUtilities.dpf2(bd0Var.f27178f), AndroidUtilities.dpf2(bd0Var.f27174a), AndroidUtilities.dpf2(bd0Var.f27175b));
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
