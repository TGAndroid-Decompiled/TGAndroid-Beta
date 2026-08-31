package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class ee0 {
    public Path f26521a;
    public float f26522b;
    public float f26523c;
    public float d;
    public float f26524e;
    public float f26525f;
    public ArrayList f26526g;

    public final void a(String str, float f10) {
        float f11 = this.f26524e;
        float f12 = this.d;
        float f13 = this.f26523c;
        try {
            ?? obj = new Object();
            obj.f25585a = new ArrayList();
            obj.f25586b = f10 * this.f26525f;
            String[] split = str.split(" ");
            int i10 = 0;
            while (i10 < split.length) {
                char charAt = split[i10].charAt(0);
                if (charAt != 'C') {
                    if (charAt != 'L') {
                        if (charAt == 'M') {
                            ?? obj2 = new Object();
                            obj2.f26261a = (Float.parseFloat(split[i10 + 1]) + f12) * f13;
                            i10 += 2;
                            obj2.f26262b = (Float.parseFloat(split[i10]) + f11) * f13;
                            obj.f25585a.add(obj2);
                        }
                    } else {
                        ?? obj3 = new Object();
                        obj3.f25936a = (Float.parseFloat(split[i10 + 1]) + f12) * f13;
                        i10 += 2;
                        obj3.f25937b = (Float.parseFloat(split[i10]) + f11) * f13;
                        obj.f25585a.add(obj3);
                    }
                } else {
                    ?? obj4 = new Object();
                    obj4.f25241c = (Float.parseFloat(split[i10 + 1]) + f12) * f13;
                    obj4.d = (Float.parseFloat(split[i10 + 2]) + f11) * f13;
                    obj4.f25242e = (Float.parseFloat(split[i10 + 3]) + f12) * f13;
                    obj4.f25243f = (Float.parseFloat(split[i10 + 4]) + f11) * f13;
                    obj4.f25239a = (Float.parseFloat(split[i10 + 5]) + f12) * f13;
                    i10 += 6;
                    obj4.f25240b = (Float.parseFloat(split[i10]) + f11) * f13;
                    obj.f25585a.add(obj4);
                }
                i10++;
            }
            this.f26526g.add(obj);
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    public final void b(Canvas canvas, Paint paint, float f10) {
        be0 be0Var;
        be0 be0Var2;
        Object obj;
        float f11;
        ArrayList arrayList = this.f26526g;
        Path path = this.f26521a;
        if (this.f26522b != f10) {
            this.f26522b = f10;
            int size = arrayList.size();
            be0 be0Var3 = null;
            be0 be0Var4 = null;
            for (int i10 = 0; i10 < size; i10++) {
                be0 be0Var5 = (be0) arrayList.get(i10);
                if ((be0Var4 == null || be0Var4.f25586b < be0Var5.f25586b) && be0Var5.f25586b <= f10) {
                    be0Var4 = be0Var5;
                }
                if ((be0Var3 == null || be0Var3.f25586b > be0Var5.f25586b) && be0Var5.f25586b >= f10) {
                    be0Var3 = be0Var5;
                }
            }
            if (be0Var3 == be0Var4) {
                be0Var4 = null;
            }
            if (be0Var4 != null && be0Var3 == null) {
                be0Var = be0Var4;
                be0Var2 = null;
            } else {
                be0Var = be0Var3;
                be0Var2 = be0Var4;
            }
            if (be0Var != null) {
                ArrayList arrayList2 = be0Var.f25585a;
                if (be0Var2 == null || be0Var2.f25585a.size() == arrayList2.size()) {
                    path.reset();
                    int size2 = arrayList2.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        if (be0Var2 != null) {
                            obj = be0Var2.f25585a.get(i11);
                        } else {
                            obj = null;
                        }
                        Object obj2 = arrayList2.get(i11);
                        if (obj == null || obj.getClass() == obj2.getClass()) {
                            if (be0Var2 != null) {
                                float f12 = be0Var2.f25586b;
                                f11 = (f10 - f12) / (be0Var.f25586b - f12);
                            } else {
                                f11 = 1.0f;
                            }
                            if (obj2 instanceof de0) {
                                de0 de0Var = (de0) obj2;
                                de0 de0Var2 = (de0) obj;
                                if (de0Var2 != null) {
                                    float f13 = de0Var2.f26261a;
                                    float dpf2 = AndroidUtilities.dpf2(((de0Var.f26261a - f13) * f11) + f13);
                                    float f14 = de0Var2.f26262b;
                                    path.moveTo(dpf2, AndroidUtilities.dpf2(((de0Var.f26262b - f14) * f11) + f14));
                                } else {
                                    path.moveTo(AndroidUtilities.dpf2(de0Var.f26261a), AndroidUtilities.dpf2(de0Var.f26262b));
                                }
                            } else if (obj2 instanceof ce0) {
                                ce0 ce0Var = (ce0) obj2;
                                ce0 ce0Var2 = (ce0) obj;
                                if (ce0Var2 != null) {
                                    float f15 = ce0Var2.f25936a;
                                    float dpf22 = AndroidUtilities.dpf2(((ce0Var.f25936a - f15) * f11) + f15);
                                    float f16 = ce0Var2.f25937b;
                                    path.lineTo(dpf22, AndroidUtilities.dpf2(((ce0Var.f25937b - f16) * f11) + f16));
                                } else {
                                    path.lineTo(AndroidUtilities.dpf2(ce0Var.f25936a), AndroidUtilities.dpf2(ce0Var.f25937b));
                                }
                            } else if (obj2 instanceof ae0) {
                                ae0 ae0Var = (ae0) obj2;
                                ae0 ae0Var2 = (ae0) obj;
                                if (ae0Var2 != null) {
                                    float f17 = ae0Var2.f25241c;
                                    float dpf23 = AndroidUtilities.dpf2(((ae0Var.f25241c - f17) * f11) + f17);
                                    float f18 = ae0Var2.d;
                                    float dpf24 = AndroidUtilities.dpf2(((ae0Var.d - f18) * f11) + f18);
                                    float f19 = ae0Var2.f25242e;
                                    float dpf25 = AndroidUtilities.dpf2(((ae0Var.f25242e - f19) * f11) + f19);
                                    float f20 = ae0Var2.f25243f;
                                    float dpf26 = AndroidUtilities.dpf2(((ae0Var.f25243f - f20) * f11) + f20);
                                    float f21 = ae0Var2.f25239a;
                                    float dpf27 = AndroidUtilities.dpf2(((ae0Var.f25239a - f21) * f11) + f21);
                                    float f22 = ae0Var2.f25240b;
                                    path.cubicTo(dpf23, dpf24, dpf25, dpf26, dpf27, AndroidUtilities.dpf2(((ae0Var.f25240b - f22) * f11) + f22));
                                } else {
                                    path.cubicTo(AndroidUtilities.dpf2(ae0Var.f25241c), AndroidUtilities.dpf2(ae0Var.d), AndroidUtilities.dpf2(ae0Var.f25242e), AndroidUtilities.dpf2(ae0Var.f25243f), AndroidUtilities.dpf2(ae0Var.f25239a), AndroidUtilities.dpf2(ae0Var.f25240b));
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
