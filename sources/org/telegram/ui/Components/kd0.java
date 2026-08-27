package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

public final class kd0 {

    public Path f30075a;

    public float f30076b;

    public float f30077c;
    public float d;

    public float f30078e;

    public float f30079f;

    public ArrayList f30080g;

    public final void a(String str, float f10) {
        float f11 = this.f30078e;
        float f12 = this.d;
        float f13 = this.f30077c;
        try {
            hd0 hd0Var = new hd0();
            hd0Var.f28980a = new ArrayList();
            hd0Var.f28981b = f10 * this.f30079f;
            String[] strArrSplit = str.split(" ");
            int i10 = 0;
            while (i10 < strArrSplit.length) {
                char cCharAt = strArrSplit[i10].charAt(0);
                if (cCharAt == 'C') {
                    gd0 gd0Var = new gd0();
                    gd0Var.f28596c = (Float.parseFloat(strArrSplit[i10 + 1]) + f12) * f13;
                    gd0Var.d = (Float.parseFloat(strArrSplit[i10 + 2]) + f11) * f13;
                    gd0Var.f28597e = (Float.parseFloat(strArrSplit[i10 + 3]) + f12) * f13;
                    gd0Var.f28598f = (Float.parseFloat(strArrSplit[i10 + 4]) + f11) * f13;
                    gd0Var.f28594a = (Float.parseFloat(strArrSplit[i10 + 5]) + f12) * f13;
                    i10 += 6;
                    gd0Var.f28595b = (Float.parseFloat(strArrSplit[i10]) + f11) * f13;
                    hd0Var.f28980a.add(gd0Var);
                } else if (cCharAt == 'L') {
                    id0 id0Var = new id0();
                    id0Var.f29337a = (Float.parseFloat(strArrSplit[i10 + 1]) + f12) * f13;
                    i10 += 2;
                    id0Var.f29338b = (Float.parseFloat(strArrSplit[i10]) + f11) * f13;
                    hd0Var.f28980a.add(id0Var);
                } else if (cCharAt == 'M') {
                    jd0 jd0Var = new jd0();
                    jd0Var.f29677a = (Float.parseFloat(strArrSplit[i10 + 1]) + f12) * f13;
                    i10 += 2;
                    jd0Var.f29678b = (Float.parseFloat(strArrSplit[i10]) + f11) * f13;
                    hd0Var.f28980a.add(jd0Var);
                }
                i10++;
            }
            this.f30080g.add(hd0Var);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public final void b(Canvas canvas, Paint paint, float f10) {
        hd0 hd0Var;
        hd0 hd0Var2;
        float f11;
        ArrayList arrayList = this.f30080g;
        Path path = this.f30075a;
        if (this.f30076b != f10) {
            this.f30076b = f10;
            int size = arrayList.size();
            hd0 hd0Var3 = null;
            hd0 hd0Var4 = null;
            for (int i10 = 0; i10 < size; i10++) {
                hd0 hd0Var5 = (hd0) arrayList.get(i10);
                if ((hd0Var4 == null || hd0Var4.f28981b < hd0Var5.f28981b) && hd0Var5.f28981b <= f10) {
                    hd0Var4 = hd0Var5;
                }
                if ((hd0Var3 == null || hd0Var3.f28981b > hd0Var5.f28981b) && hd0Var5.f28981b >= f10) {
                    hd0Var3 = hd0Var5;
                }
            }
            if (hd0Var3 == hd0Var4) {
                hd0Var4 = null;
            }
            if (hd0Var4 == null || hd0Var3 != null) {
                hd0Var = hd0Var3;
                hd0Var2 = hd0Var4;
            } else {
                hd0Var = hd0Var4;
                hd0Var2 = null;
            }
            if (hd0Var == null) {
                return;
            }
            ArrayList arrayList2 = hd0Var.f28980a;
            if (hd0Var2 != null && hd0Var2.f28980a.size() != arrayList2.size()) {
                return;
            }
            path.reset();
            int size2 = arrayList2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                Object obj = hd0Var2 != null ? hd0Var2.f28980a.get(i11) : null;
                Object obj2 = arrayList2.get(i11);
                if (obj != null && obj.getClass() != obj2.getClass()) {
                    return;
                }
                if (hd0Var2 != null) {
                    float f12 = hd0Var2.f28981b;
                    f11 = (f10 - f12) / (hd0Var.f28981b - f12);
                } else {
                    f11 = 1.0f;
                }
                if (obj2 instanceof jd0) {
                    jd0 jd0Var = (jd0) obj2;
                    jd0 jd0Var2 = (jd0) obj;
                    if (jd0Var2 != null) {
                        float f13 = jd0Var2.f29677a;
                        float fDpf2 = AndroidUtilities.dpf2(((jd0Var.f29677a - f13) * f11) + f13);
                        float f14 = jd0Var2.f29678b;
                        path.moveTo(fDpf2, AndroidUtilities.dpf2(((jd0Var.f29678b - f14) * f11) + f14));
                    } else {
                        path.moveTo(AndroidUtilities.dpf2(jd0Var.f29677a), AndroidUtilities.dpf2(jd0Var.f29678b));
                    }
                } else if (obj2 instanceof id0) {
                    id0 id0Var = (id0) obj2;
                    id0 id0Var2 = (id0) obj;
                    if (id0Var2 != null) {
                        float f15 = id0Var2.f29337a;
                        float fDpf3 = AndroidUtilities.dpf2(((id0Var.f29337a - f15) * f11) + f15);
                        float f16 = id0Var2.f29338b;
                        path.lineTo(fDpf3, AndroidUtilities.dpf2(((id0Var.f29338b - f16) * f11) + f16));
                    } else {
                        path.lineTo(AndroidUtilities.dpf2(id0Var.f29337a), AndroidUtilities.dpf2(id0Var.f29338b));
                    }
                } else if (obj2 instanceof gd0) {
                    gd0 gd0Var = (gd0) obj2;
                    gd0 gd0Var2 = (gd0) obj;
                    if (gd0Var2 != null) {
                        float f17 = gd0Var2.f28596c;
                        float fDpf4 = AndroidUtilities.dpf2(((gd0Var.f28596c - f17) * f11) + f17);
                        float f18 = gd0Var2.d;
                        float fDpf5 = AndroidUtilities.dpf2(((gd0Var.d - f18) * f11) + f18);
                        float f19 = gd0Var2.f28597e;
                        float fDpf6 = AndroidUtilities.dpf2(((gd0Var.f28597e - f19) * f11) + f19);
                        float f20 = gd0Var2.f28598f;
                        float fDpf7 = AndroidUtilities.dpf2(((gd0Var.f28598f - f20) * f11) + f20);
                        float f21 = gd0Var2.f28594a;
                        float fDpf8 = AndroidUtilities.dpf2(((gd0Var.f28594a - f21) * f11) + f21);
                        float f22 = gd0Var2.f28595b;
                        path.cubicTo(fDpf4, fDpf5, fDpf6, fDpf7, fDpf8, AndroidUtilities.dpf2(((gd0Var.f28595b - f22) * f11) + f22));
                    } else {
                        path.cubicTo(AndroidUtilities.dpf2(gd0Var.f28596c), AndroidUtilities.dpf2(gd0Var.d), AndroidUtilities.dpf2(gd0Var.f28597e), AndroidUtilities.dpf2(gd0Var.f28598f), AndroidUtilities.dpf2(gd0Var.f28594a), AndroidUtilities.dpf2(gd0Var.f28595b));
                    }
                }
            }
            path.close();
        }
        canvas.drawPath(path, paint);
    }
}
