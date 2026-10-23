package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class rs {
    public final org.telegram.ui.Cells.r2 f30007a;
    public final ArrayList f30008b = new ArrayList();
    public final ArrayList f30009c = new ArrayList();
    public qs d = null;

    public rs(org.telegram.ui.Cells.r2 r2Var) {
        this.f30007a = r2Var;
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
            arrayList = this.f30009c;
            if (i11 >= arrayList.size()) {
                break;
            }
            qs qsVar = (qs) arrayList.get(i11);
            dp = org.telegram.messenger.nk.y(4.0f, qsVar.e, dp);
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
            if (qsVar2 == null || qsVar2.f29698a != size) {
                ?? obj = new Object();
                obj.f29698a = size;
                f11 f11Var = new f11(i2.e.j(size, "+"), 10.0f, AndroidUtilities.bold());
                f11Var.s(this.f30007a);
                obj.f29700c = f11Var;
                int dp2 = AndroidUtilities.dp(9.32f);
                f11 f11Var2 = obj.f29700c;
                obj.e = dp2 + ((int) f11Var2.f26025c);
                f11Var2.j();
                obj.d = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21179n8, false);
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
        return this.f30009c.isEmpty();
    }
}
