package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class rs {
    public final org.telegram.ui.Cells.q2 f30256a;
    public final ArrayList f30257b = new ArrayList();
    public final ArrayList f30258c = new ArrayList();
    public qs d = null;

    public rs(org.telegram.ui.Cells.q2 q2Var) {
        this.f30256a = q2Var;
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
            arrayList = this.f30258c;
            if (i11 >= arrayList.size()) {
                break;
            }
            qs qsVar = (qs) arrayList.get(i11);
            dp = org.telegram.messenger.sl.y(4.0f, qsVar.f29973g, dp);
            if (dp < 0) {
                break;
            }
            if (LocaleController.isRTL) {
                canvas.translate(-qsVar.f29973g, 0.0f);
                qsVar.a(canvas);
                canvas.translate(-AndroidUtilities.dp(4.0f), 0.0f);
            } else {
                qsVar.a(canvas);
                canvas.translate(AndroidUtilities.dp(4.0f) + qsVar.f29973g, 0.0f);
            }
            i11++;
        }
        if (i11 < arrayList.size()) {
            int size = arrayList.size() - i11;
            qs qsVar2 = this.d;
            if (qsVar2 == null || qsVar2.f29969a != size) {
                ?? obj = new Object();
                obj.f29969a = size;
                i11 i11Var = new i11(i2.o1.k(size, "+"), 10.0f, AndroidUtilities.bold());
                i11Var.s(this.f30256a);
                obj.f29971c = i11Var;
                int dp2 = AndroidUtilities.dp(9.32f);
                i11 i11Var2 = obj.f29971c;
                obj.f29973g = dp2 + ((int) i11Var2.f27164c);
                i11Var2.j();
                int i12 = org.telegram.ui.ActionBar.k6.f21368n8;
                obj.f29972f = i12;
                obj.e = true;
                obj.d = org.telegram.ui.ActionBar.k6.x0(null, i12, false);
                this.d = obj;
            }
            if (LocaleController.isRTL) {
                canvas.translate(-this.d.f29973g, 0.0f);
                this.d.a(canvas);
                canvas.translate(-AndroidUtilities.dp(4.0f), 0.0f);
            } else {
                this.d.a(canvas);
                canvas.translate(AndroidUtilities.dp(4.0f) + this.d.f29973g, 0.0f);
            }
        }
        canvas.restore();
    }

    public final boolean b() {
        return this.f30258c.isEmpty();
    }
}
