package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class ud0 {
    public Path f33211a;
    public float f33212b;
    public float f33213c;
    public float d;
    public float f33214e;
    public float f33215f;
    public ArrayList f33216g;

    public final void a(String str, float f9) {
        float f10 = this.f33214e;
        float f11 = this.d;
        float f12 = this.f33213c;
        try {
            ?? obj = new Object();
            obj.f32269a = new ArrayList();
            obj.f32270b = f9 * this.f33215f;
            String[] split = str.split(" ");
            int i10 = 0;
            while (i10 < split.length) {
                char charAt = split[i10].charAt(0);
                if (charAt != 'C') {
                    if (charAt != 'L') {
                        if (charAt == 'M') {
                            ?? obj2 = new Object();
                            obj2.f32926a = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                            i10 += 2;
                            obj2.f32927b = (Float.parseFloat(split[i10]) + f10) * f12;
                            obj.f32269a.add(obj2);
                        }
                    } else {
                        ?? obj3 = new Object();
                        obj3.f32627a = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                        i10 += 2;
                        obj3.f32628b = (Float.parseFloat(split[i10]) + f10) * f12;
                        obj.f32269a.add(obj3);
                    }
                } else {
                    ?? obj4 = new Object();
                    obj4.f31925c = (Float.parseFloat(split[i10 + 1]) + f11) * f12;
                    obj4.d = (Float.parseFloat(split[i10 + 2]) + f10) * f12;
                    obj4.f31926e = (Float.parseFloat(split[i10 + 3]) + f11) * f12;
                    obj4.f31927f = (Float.parseFloat(split[i10 + 4]) + f10) * f12;
                    obj4.f31923a = (Float.parseFloat(split[i10 + 5]) + f11) * f12;
                    i10 += 6;
                    obj4.f31924b = (Float.parseFloat(split[i10]) + f10) * f12;
                    obj.f32269a.add(obj4);
                }
                i10++;
            }
            this.f33216g.add(obj);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public final void b(Canvas canvas, Paint paint, float f9) {
        rd0 rd0Var;
        rd0 rd0Var2;
        Object obj;
        float f10;
        ArrayList arrayList = this.f33216g;
        Path path = this.f33211a;
        if (this.f33212b != f9) {
            this.f33212b = f9;
            int size = arrayList.size();
            rd0 rd0Var3 = null;
            rd0 rd0Var4 = null;
            for (int i10 = 0; i10 < size; i10++) {
                rd0 rd0Var5 = (rd0) arrayList.get(i10);
                if ((rd0Var4 == null || rd0Var4.f32270b < rd0Var5.f32270b) && rd0Var5.f32270b <= f9) {
                    rd0Var4 = rd0Var5;
                }
                if ((rd0Var3 == null || rd0Var3.f32270b > rd0Var5.f32270b) && rd0Var5.f32270b >= f9) {
                    rd0Var3 = rd0Var5;
                }
            }
            if (rd0Var3 == rd0Var4) {
                rd0Var4 = null;
            }
            if (rd0Var4 != null && rd0Var3 == null) {
                rd0Var = rd0Var4;
                rd0Var2 = null;
            } else {
                rd0Var = rd0Var3;
                rd0Var2 = rd0Var4;
            }
            if (rd0Var != null) {
                ArrayList arrayList2 = rd0Var.f32269a;
                if (rd0Var2 == null || rd0Var2.f32269a.size() == arrayList2.size()) {
                    path.reset();
                    int size2 = arrayList2.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        if (rd0Var2 != null) {
                            obj = rd0Var2.f32269a.get(i11);
                        } else {
                            obj = null;
                        }
                        Object obj2 = arrayList2.get(i11);
                        if (obj == null || obj.getClass() == obj2.getClass()) {
                            if (rd0Var2 != null) {
                                float f11 = rd0Var2.f32270b;
                                f10 = (f9 - f11) / (rd0Var.f32270b - f11);
                            } else {
                                f10 = 1.0f;
                            }
                            if (obj2 instanceof td0) {
                                td0 td0Var = (td0) obj2;
                                td0 td0Var2 = (td0) obj;
                                if (td0Var2 != null) {
                                    float f12 = td0Var2.f32926a;
                                    float dpf2 = AndroidUtilities.dpf2(((td0Var.f32926a - f12) * f10) + f12);
                                    float f13 = td0Var2.f32927b;
                                    path.moveTo(dpf2, AndroidUtilities.dpf2(((td0Var.f32927b - f13) * f10) + f13));
                                } else {
                                    path.moveTo(AndroidUtilities.dpf2(td0Var.f32926a), AndroidUtilities.dpf2(td0Var.f32927b));
                                }
                            } else if (obj2 instanceof sd0) {
                                sd0 sd0Var = (sd0) obj2;
                                sd0 sd0Var2 = (sd0) obj;
                                if (sd0Var2 != null) {
                                    float f14 = sd0Var2.f32627a;
                                    float dpf22 = AndroidUtilities.dpf2(((sd0Var.f32627a - f14) * f10) + f14);
                                    float f15 = sd0Var2.f32628b;
                                    path.lineTo(dpf22, AndroidUtilities.dpf2(((sd0Var.f32628b - f15) * f10) + f15));
                                } else {
                                    path.lineTo(AndroidUtilities.dpf2(sd0Var.f32627a), AndroidUtilities.dpf2(sd0Var.f32628b));
                                }
                            } else if (obj2 instanceof qd0) {
                                qd0 qd0Var = (qd0) obj2;
                                qd0 qd0Var2 = (qd0) obj;
                                if (qd0Var2 != null) {
                                    float f16 = qd0Var2.f31925c;
                                    float dpf23 = AndroidUtilities.dpf2(((qd0Var.f31925c - f16) * f10) + f16);
                                    float f17 = qd0Var2.d;
                                    float dpf24 = AndroidUtilities.dpf2(((qd0Var.d - f17) * f10) + f17);
                                    float f18 = qd0Var2.f31926e;
                                    float dpf25 = AndroidUtilities.dpf2(((qd0Var.f31926e - f18) * f10) + f18);
                                    float f19 = qd0Var2.f31927f;
                                    float dpf26 = AndroidUtilities.dpf2(((qd0Var.f31927f - f19) * f10) + f19);
                                    float f20 = qd0Var2.f31923a;
                                    float dpf27 = AndroidUtilities.dpf2(((qd0Var.f31923a - f20) * f10) + f20);
                                    float f21 = qd0Var2.f31924b;
                                    path.cubicTo(dpf23, dpf24, dpf25, dpf26, dpf27, AndroidUtilities.dpf2(((qd0Var.f31924b - f21) * f10) + f21));
                                } else {
                                    path.cubicTo(AndroidUtilities.dpf2(qd0Var.f31925c), AndroidUtilities.dpf2(qd0Var.d), AndroidUtilities.dpf2(qd0Var.f31926e), AndroidUtilities.dpf2(qd0Var.f31927f), AndroidUtilities.dpf2(qd0Var.f31923a), AndroidUtilities.dpf2(qd0Var.f31924b));
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
