package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class ys {
    public final org.telegram.ui.Cells.s2 f33327a;
    public final ArrayList f33328b = new ArrayList();
    public final ArrayList f33329c = new ArrayList();
    public xs d = null;

    public ys(org.telegram.ui.Cells.s2 s2Var) {
        this.f33327a = s2Var;
    }

    public final void a(Canvas canvas, int i10) {
        ArrayList arrayList;
        canvas.clipRect(0, 0, i10, AndroidUtilities.dp(14.66f));
        RectF rectF = AndroidUtilities.rectTmp;
        float f7 = i10;
        rectF.set(0.0f, 0.0f, f7, AndroidUtilities.dp(14.66f));
        canvas.saveLayerAlpha(rectF, 255, 31);
        if (LocaleController.isRTL) {
            canvas.translate(f7, 0.0f);
        }
        int dp = i10 - AndroidUtilities.dp(25.0f);
        int i11 = 0;
        while (true) {
            arrayList = this.f33329c;
            if (i11 >= arrayList.size()) {
                break;
            }
            xs xsVar = (xs) arrayList.get(i11);
            dp = org.telegram.messenger.ai.z(4.0f, xsVar.f33022e, dp);
            if (dp < 0) {
                break;
            }
            if (LocaleController.isRTL) {
                canvas.translate(-xsVar.f33022e, 0.0f);
                xsVar.a(canvas);
                canvas.translate(-AndroidUtilities.dp(4.0f), 0.0f);
            } else {
                xsVar.a(canvas);
                canvas.translate(AndroidUtilities.dp(4.0f) + xsVar.f33022e, 0.0f);
            }
            i11++;
        }
        if (i11 < arrayList.size()) {
            int size = arrayList.size() - i11;
            xs xsVar2 = this.d;
            if (xsVar2 == null || xsVar2.f33019a != size) {
                ?? obj = new Object();
                obj.f33019a = size;
                n11 n11Var = new n11(hg.c.h(size, "+"), 10.0f, AndroidUtilities.bold());
                n11Var.s(this.f33327a);
                obj.f33021c = n11Var;
                int dp2 = AndroidUtilities.dp(9.32f);
                n11 n11Var2 = obj.f33021c;
                obj.f33022e = dp2 + ((int) n11Var2.f28902c);
                n11Var2.j();
                obj.d = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20973n8, false);
                this.d = obj;
            }
            if (LocaleController.isRTL) {
                canvas.translate(-this.d.f33022e, 0.0f);
                this.d.a(canvas);
                canvas.translate(-AndroidUtilities.dp(4.0f), 0.0f);
            } else {
                this.d.a(canvas);
                canvas.translate(AndroidUtilities.dp(4.0f) + this.d.f33022e, 0.0f);
            }
        }
        canvas.restore();
    }

    public final boolean b() {
        return this.f33329c.isEmpty();
    }
}
