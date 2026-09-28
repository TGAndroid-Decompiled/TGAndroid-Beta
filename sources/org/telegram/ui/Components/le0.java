package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class le0 {
    public Path f25986a;
    public float f25987b;
    public float f25988c;
    public float d;
    public float e;
    public float f25989f;
    public ArrayList f25990g;

    public final void a(String str, float f7) {
        float f10 = this.e;
        float f11 = this.d;
        float f12 = this.f25988c;
        try {
            ?? obj = new Object();
            obj.f25097a = new ArrayList();
            obj.f25098b = f7 * this.f25989f;
            String[] split = str.split(" ");
            int i10 = 0;
            while (i10 < split.length) {
                char charAt = split[i10].charAt(0);
                if (charAt != 'C') {
                    if (charAt != 'L') {
                        if (charAt == 'M') {
                            ?? obj2 = new Object();
                            obj2.f25681a = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                            i10 += 2;
                            obj2.f25682b = (Float.parseFloat(split[i10]) + f10) * f12;
                            obj.f25097a.add(obj2);
                        }
                    } else {
                        ?? obj3 = new Object();
                        obj3.f25456a = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                        i10 += 2;
                        obj3.f25457b = (Float.parseFloat(split[i10]) + f10) * f12;
                        obj.f25097a.add(obj3);
                    }
                } else {
                    ?? obj4 = new Object();
                    obj4.f24810c = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                    obj4.d = (Float.parseFloat(split[i10 + 2]) + f10) * f12;
                    obj4.e = (Float.parseFloat(split[i10 + 3]) + f11) * f12;
                    obj4.f24811f = (Float.parseFloat(split[i10 + 4]) + f10) * f12;
                    obj4.f24808a = (Float.parseFloat(split[i10 + 5]) + f11) * f12;
                    i10 += 6;
                    obj4.f24809b = (Float.parseFloat(split[i10]) + f10) * f12;
                    obj.f25097a.add(obj4);
                }
                i10++;
            }
            this.f25990g.add(obj);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void b(Canvas canvas, Paint paint, float f7) {
        ie0 ie0Var;
        ie0 ie0Var2;
        Object obj;
        float f10;
        ArrayList arrayList = this.f25990g;
        Path path = this.f25986a;
        if (this.f25987b != f7) {
            this.f25987b = f7;
            int size = arrayList.size();
            ie0 ie0Var3 = null;
            ie0 ie0Var4 = null;
            for (int i10 = 0; i10 < size; i10++) {
                ie0 ie0Var5 = (ie0) arrayList.get(i10);
                if ((ie0Var4 == null || ie0Var4.f25098b < ie0Var5.f25098b) && ie0Var5.f25098b <= f7) {
                    ie0Var4 = ie0Var5;
                }
                if ((ie0Var3 == null || ie0Var3.f25098b > ie0Var5.f25098b) && ie0Var5.f25098b >= f7) {
                    ie0Var3 = ie0Var5;
                }
            }
            if (ie0Var3 == ie0Var4) {
                ie0Var4 = null;
            }
            if (ie0Var4 != null && ie0Var3 == null) {
                ie0Var = ie0Var4;
                ie0Var2 = null;
            } else {
                ie0Var = ie0Var3;
                ie0Var2 = ie0Var4;
            }
            if (ie0Var != null) {
                ArrayList arrayList2 = ie0Var.f25097a;
                if (ie0Var2 == null || ie0Var2.f25097a.size() == arrayList2.size()) {
                    path.reset();
                    int size2 = arrayList2.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        if (ie0Var2 != null) {
                            obj = ie0Var2.f25097a.get(i11);
                        } else {
                            obj = null;
                        }
                        Object obj2 = arrayList2.get(i11);
                        if (obj == null || obj.getClass() == obj2.getClass()) {
                            if (ie0Var2 != null) {
                                float f11 = ie0Var2.f25098b;
                                f10 = (f7 - f11) / (ie0Var.f25098b - f11);
                            } else {
                                f10 = 1.0f;
                            }
                            if (obj2 instanceof ke0) {
                                ke0 ke0Var = (ke0) obj2;
                                ke0 ke0Var2 = (ke0) obj;
                                if (ke0Var2 != null) {
                                    float f12 = ke0Var2.f25681a;
                                    float dpf2 = AndroidUtilities.dpf2(((ke0Var.f25681a - f12) * f10) + f12);
                                    float f13 = ke0Var2.f25682b;
                                    path.moveTo(dpf2, AndroidUtilities.dpf2(((ke0Var.f25682b - f13) * f10) + f13));
                                } else {
                                    path.moveTo(AndroidUtilities.dpf2(ke0Var.f25681a), AndroidUtilities.dpf2(ke0Var.f25682b));
                                }
                            } else if (obj2 instanceof je0) {
                                je0 je0Var = (je0) obj2;
                                je0 je0Var2 = (je0) obj;
                                if (je0Var2 != null) {
                                    float f14 = je0Var2.f25456a;
                                    float dpf22 = AndroidUtilities.dpf2(((je0Var.f25456a - f14) * f10) + f14);
                                    float f15 = je0Var2.f25457b;
                                    path.lineTo(dpf22, AndroidUtilities.dpf2(((je0Var.f25457b - f15) * f10) + f15));
                                } else {
                                    path.lineTo(AndroidUtilities.dpf2(je0Var.f25456a), AndroidUtilities.dpf2(je0Var.f25457b));
                                }
                            } else if (obj2 instanceof he0) {
                                he0 he0Var = (he0) obj2;
                                he0 he0Var2 = (he0) obj;
                                if (he0Var2 != null) {
                                    float f16 = he0Var2.f24810c;
                                    float dpf23 = AndroidUtilities.dpf2(((he0Var.f24810c - f16) * f10) + f16);
                                    float f17 = he0Var2.d;
                                    float dpf24 = AndroidUtilities.dpf2(((he0Var.d - f17) * f10) + f17);
                                    float f18 = he0Var2.e;
                                    float dpf25 = AndroidUtilities.dpf2(((he0Var.e - f18) * f10) + f18);
                                    float f19 = he0Var2.f24811f;
                                    float dpf26 = AndroidUtilities.dpf2(((he0Var.f24811f - f19) * f10) + f19);
                                    float f20 = he0Var2.f24808a;
                                    float dpf27 = AndroidUtilities.dpf2(((he0Var.f24808a - f20) * f10) + f20);
                                    float f21 = he0Var2.f24809b;
                                    path.cubicTo(dpf23, dpf24, dpf25, dpf26, dpf27, AndroidUtilities.dpf2(((he0Var.f24809b - f21) * f10) + f21));
                                } else {
                                    path.cubicTo(AndroidUtilities.dpf2(he0Var.f24810c), AndroidUtilities.dpf2(he0Var.d), AndroidUtilities.dpf2(he0Var.e), AndroidUtilities.dpf2(he0Var.f24811f), AndroidUtilities.dpf2(he0Var.f24808a), AndroidUtilities.dpf2(he0Var.f24809b));
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
