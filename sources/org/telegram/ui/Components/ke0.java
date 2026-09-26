package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class ke0 {
    public Path f25712a;
    public float f25713b;
    public float f25714c;
    public float d;
    public float e;
    public float f25715f;
    public ArrayList f25716g;

    public final void a(String str, float f7) {
        float f10 = this.e;
        float f11 = this.d;
        float f12 = this.f25714c;
        try {
            ?? obj = new Object();
            obj.f24778a = new ArrayList();
            obj.f24779b = f7 * this.f25715f;
            String[] split = str.split(" ");
            int i10 = 0;
            while (i10 < split.length) {
                char charAt = split[i10].charAt(0);
                if (charAt != 'C') {
                    if (charAt != 'L') {
                        if (charAt == 'M') {
                            ?? obj2 = new Object();
                            obj2.f25388a = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                            i10 += 2;
                            obj2.f25389b = (Float.parseFloat(split[i10]) + f10) * f12;
                            obj.f24778a.add(obj2);
                        }
                    } else {
                        ?? obj3 = new Object();
                        obj3.f25086a = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                        i10 += 2;
                        obj3.f25087b = (Float.parseFloat(split[i10]) + f10) * f12;
                        obj.f24778a.add(obj3);
                    }
                } else {
                    ?? obj4 = new Object();
                    obj4.f24484c = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                    obj4.d = (Float.parseFloat(split[i10 + 2]) + f10) * f12;
                    obj4.e = (Float.parseFloat(split[i10 + 3]) + f11) * f12;
                    obj4.f24485f = (Float.parseFloat(split[i10 + 4]) + f10) * f12;
                    obj4.f24482a = (Float.parseFloat(split[i10 + 5]) + f11) * f12;
                    i10 += 6;
                    obj4.f24483b = (Float.parseFloat(split[i10]) + f10) * f12;
                    obj.f24778a.add(obj4);
                }
                i10++;
            }
            this.f25716g.add(obj);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void b(Canvas canvas, Paint paint, float f7) {
        he0 he0Var;
        he0 he0Var2;
        Object obj;
        float f10;
        ArrayList arrayList = this.f25716g;
        Path path = this.f25712a;
        if (this.f25713b != f7) {
            this.f25713b = f7;
            int size = arrayList.size();
            he0 he0Var3 = null;
            he0 he0Var4 = null;
            for (int i10 = 0; i10 < size; i10++) {
                he0 he0Var5 = (he0) arrayList.get(i10);
                if ((he0Var4 == null || he0Var4.f24779b < he0Var5.f24779b) && he0Var5.f24779b <= f7) {
                    he0Var4 = he0Var5;
                }
                if ((he0Var3 == null || he0Var3.f24779b > he0Var5.f24779b) && he0Var5.f24779b >= f7) {
                    he0Var3 = he0Var5;
                }
            }
            if (he0Var3 == he0Var4) {
                he0Var4 = null;
            }
            if (he0Var4 != null && he0Var3 == null) {
                he0Var = he0Var4;
                he0Var2 = null;
            } else {
                he0Var = he0Var3;
                he0Var2 = he0Var4;
            }
            if (he0Var != null) {
                ArrayList arrayList2 = he0Var.f24778a;
                if (he0Var2 == null || he0Var2.f24778a.size() == arrayList2.size()) {
                    path.reset();
                    int size2 = arrayList2.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        if (he0Var2 != null) {
                            obj = he0Var2.f24778a.get(i11);
                        } else {
                            obj = null;
                        }
                        Object obj2 = arrayList2.get(i11);
                        if (obj == null || obj.getClass() == obj2.getClass()) {
                            if (he0Var2 != null) {
                                float f11 = he0Var2.f24779b;
                                f10 = (f7 - f11) / (he0Var.f24779b - f11);
                            } else {
                                f10 = 1.0f;
                            }
                            if (obj2 instanceof je0) {
                                je0 je0Var = (je0) obj2;
                                je0 je0Var2 = (je0) obj;
                                if (je0Var2 != null) {
                                    float f12 = je0Var2.f25388a;
                                    float dpf2 = AndroidUtilities.dpf2(((je0Var.f25388a - f12) * f10) + f12);
                                    float f13 = je0Var2.f25389b;
                                    path.moveTo(dpf2, AndroidUtilities.dpf2(((je0Var.f25389b - f13) * f10) + f13));
                                } else {
                                    path.moveTo(AndroidUtilities.dpf2(je0Var.f25388a), AndroidUtilities.dpf2(je0Var.f25389b));
                                }
                            } else if (obj2 instanceof ie0) {
                                ie0 ie0Var = (ie0) obj2;
                                ie0 ie0Var2 = (ie0) obj;
                                if (ie0Var2 != null) {
                                    float f14 = ie0Var2.f25086a;
                                    float dpf22 = AndroidUtilities.dpf2(((ie0Var.f25086a - f14) * f10) + f14);
                                    float f15 = ie0Var2.f25087b;
                                    path.lineTo(dpf22, AndroidUtilities.dpf2(((ie0Var.f25087b - f15) * f10) + f15));
                                } else {
                                    path.lineTo(AndroidUtilities.dpf2(ie0Var.f25086a), AndroidUtilities.dpf2(ie0Var.f25087b));
                                }
                            } else if (obj2 instanceof ge0) {
                                ge0 ge0Var = (ge0) obj2;
                                ge0 ge0Var2 = (ge0) obj;
                                if (ge0Var2 != null) {
                                    float f16 = ge0Var2.f24484c;
                                    float dpf23 = AndroidUtilities.dpf2(((ge0Var.f24484c - f16) * f10) + f16);
                                    float f17 = ge0Var2.d;
                                    float dpf24 = AndroidUtilities.dpf2(((ge0Var.d - f17) * f10) + f17);
                                    float f18 = ge0Var2.e;
                                    float dpf25 = AndroidUtilities.dpf2(((ge0Var.e - f18) * f10) + f18);
                                    float f19 = ge0Var2.f24485f;
                                    float dpf26 = AndroidUtilities.dpf2(((ge0Var.f24485f - f19) * f10) + f19);
                                    float f20 = ge0Var2.f24482a;
                                    float dpf27 = AndroidUtilities.dpf2(((ge0Var.f24482a - f20) * f10) + f20);
                                    float f21 = ge0Var2.f24483b;
                                    path.cubicTo(dpf23, dpf24, dpf25, dpf26, dpf27, AndroidUtilities.dpf2(((ge0Var.f24483b - f21) * f10) + f21));
                                } else {
                                    path.cubicTo(AndroidUtilities.dpf2(ge0Var.f24484c), AndroidUtilities.dpf2(ge0Var.d), AndroidUtilities.dpf2(ge0Var.e), AndroidUtilities.dpf2(ge0Var.f24485f), AndroidUtilities.dpf2(ge0Var.f24482a), AndroidUtilities.dpf2(ge0Var.f24483b));
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
