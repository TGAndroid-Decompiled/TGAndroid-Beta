package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class ns {
    public final org.telegram.ui.Cells.r2 f25579a;
    public final ArrayList f25580b = new ArrayList();
    public final ArrayList f25581c = new ArrayList();
    public ms d = null;

    public ns(org.telegram.ui.Cells.r2 r2Var) {
        this.f25579a = r2Var;
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
            arrayList = this.f25581c;
            if (i11 >= arrayList.size()) {
                break;
            }
            ms msVar = (ms) arrayList.get(i11);
            dp = org.telegram.messenger.em.v(4.0f, msVar.e, dp);
            if (dp < 0) {
                break;
            }
            if (LocaleController.isRTL) {
                canvas.translate(-msVar.e, 0.0f);
                msVar.a(canvas);
                canvas.translate(-AndroidUtilities.dp(4.0f), 0.0f);
            } else {
                msVar.a(canvas);
                canvas.translate(AndroidUtilities.dp(4.0f) + msVar.e, 0.0f);
            }
            i11++;
        }
        if (i11 < arrayList.size()) {
            int size = arrayList.size() - i11;
            ms msVar2 = this.d;
            if (msVar2 == null || msVar2.f25278a != size) {
                ?? obj = new Object();
                obj.f25278a = size;
                t01 t01Var = new t01(hc.b.j(size, "+"), 10.0f, AndroidUtilities.bold());
                t01Var.s(this.f25579a);
                obj.f25280c = t01Var;
                int dp2 = AndroidUtilities.dp(9.32f);
                t01 t01Var2 = obj.f25280c;
                obj.e = dp2 + ((int) t01Var2.f27247c);
                t01Var2.j();
                obj.d = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18112n8, false);
                this.d = obj;
            }
            if (LocaleController.isRTL) {
                canvas.translate(-this.d.e, 0.0f);
                this.d.a(canvas);
                canvas.translate(-AndroidUtilities.dp(4.0f), 0.0f);
            } else {
                this.d.a(canvas);
                canvas.translate(AndroidUtilities.dp(4.0f) + this.d.e, 0.0f);
            }
        }
        canvas.restore();
    }

    public final boolean b() {
        return this.f25581c.isEmpty();
    }
}
