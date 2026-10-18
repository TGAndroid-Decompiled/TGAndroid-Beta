package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class rs {
    public final org.telegram.ui.Cells.r2 f30033a;
    public final ArrayList f30034b = new ArrayList();
    public final ArrayList f30035c = new ArrayList();
    public qs d = null;

    public rs(org.telegram.ui.Cells.r2 r2Var) {
        this.f30033a = r2Var;
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
            arrayList = this.f30035c;
            if (i11 >= arrayList.size()) {
                break;
            }
            qs qsVar = (qs) arrayList.get(i11);
            dp = org.telegram.messenger.lk.y(4.0f, qsVar.e, dp);
            if (dp < 0) {
                break;
            }
            if (LocaleController.isRTL) {
                canvas.translate(-qsVar.e, 0.0f);
                qsVar.a(canvas);
                canvas.translate(-AndroidUtilities.dp(4.0f), 0.0f);
            } else {
                qsVar.a(canvas);
                canvas.translate(AndroidUtilities.dp(4.0f) + qsVar.e, 0.0f);
            }
            i11++;
        }
        if (i11 < arrayList.size()) {
            int size = arrayList.size() - i11;
            qs qsVar2 = this.d;
            if (qsVar2 == null || qsVar2.f29727a != size) {
                ?? obj = new Object();
                obj.f29727a = size;
                d11 d11Var = new d11(i2.d.j(size, "+"), 10.0f, AndroidUtilities.bold());
                d11Var.s(this.f30033a);
                obj.f29729c = d11Var;
                int dp2 = AndroidUtilities.dp(9.32f);
                d11 d11Var2 = obj.f29729c;
                obj.e = dp2 + ((int) d11Var2.f25437c);
                d11Var2.j();
                obj.d = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21171n8, false);
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
        return this.f30035c.isEmpty();
    }
}
