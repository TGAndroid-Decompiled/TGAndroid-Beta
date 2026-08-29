package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class cs {
    public final org.telegram.ui.Cells.p2 f27561a;
    public final ArrayList f27562b = new ArrayList();
    public final ArrayList f27563c = new ArrayList();
    public bs d = null;

    public cs(org.telegram.ui.Cells.p2 p2Var) {
        this.f27561a = p2Var;
    }

    public final void a(Canvas canvas, int i10) {
        ArrayList arrayList;
        canvas.clipRect(0, 0, i10, AndroidUtilities.dp(14.66f));
        RectF rectF = AndroidUtilities.rectTmp;
        float f9 = i10;
        rectF.set(0.0f, 0.0f, f9, AndroidUtilities.dp(14.66f));
        canvas.saveLayerAlpha(rectF, 255, 31);
        if (LocaleController.isRTL) {
            canvas.translate(f9, 0.0f);
        }
        int dp = i10 - AndroidUtilities.dp(25.0f);
        int i11 = 0;
        while (true) {
            arrayList = this.f27563c;
            if (i11 >= arrayList.size()) {
                break;
            }
            bs bsVar = (bs) arrayList.get(i11);
            dp = org.telegram.ui.b.u(4.0f, bsVar.f27215e, dp);
            if (dp < 0) {
                break;
            }
            if (LocaleController.isRTL) {
                canvas.translate(-bsVar.f27215e, 0.0f);
                bsVar.a(canvas);
                canvas.translate(-AndroidUtilities.dp(4.0f), 0.0f);
            } else {
                bsVar.a(canvas);
                canvas.translate(AndroidUtilities.dp(4.0f) + bsVar.f27215e, 0.0f);
            }
            i11++;
        }
        if (i11 < arrayList.size()) {
            int size = arrayList.size() - i11;
            bs bsVar2 = this.d;
            if (bsVar2 == null || bsVar2.f27212a != size) {
                ?? obj = new Object();
                obj.f27212a = size;
                zz0 zz0Var = new zz0(j7.l1.k(size, "+"), 10.0f, AndroidUtilities.bold());
                zz0Var.s(this.f27561a);
                obj.f27214c = zz0Var;
                int dp2 = AndroidUtilities.dp(9.32f);
                zz0 zz0Var2 = obj.f27214c;
                obj.f27215e = dp2 + ((int) zz0Var2.f35462c);
                zz0Var2.j();
                obj.d = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23243n8, false);
                this.d = obj;
            }
            if (LocaleController.isRTL) {
                canvas.translate(-this.d.f27215e, 0.0f);
                this.d.a(canvas);
                canvas.translate(-AndroidUtilities.dp(4.0f), 0.0f);
            } else {
                this.d.a(canvas);
                canvas.translate(AndroidUtilities.dp(4.0f) + this.d.f27215e, 0.0f);
            }
        }
        canvas.restore();
    }

    public final boolean b() {
        return this.f27563c.isEmpty();
    }
}
