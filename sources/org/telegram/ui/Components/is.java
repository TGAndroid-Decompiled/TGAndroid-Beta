package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class is {
    public final org.telegram.ui.Cells.r2 f27898a;
    public final ArrayList f27899b = new ArrayList();
    public final ArrayList f27900c = new ArrayList();
    public hs d = null;

    public is(org.telegram.ui.Cells.r2 r2Var) {
        this.f27898a = r2Var;
    }

    public final void a(Canvas canvas, int i10) {
        ArrayList arrayList;
        canvas.clipRect(0, 0, i10, AndroidUtilities.dp(14.66f));
        RectF rectF = AndroidUtilities.rectTmp;
        float f10 = i10;
        rectF.set(0.0f, 0.0f, f10, AndroidUtilities.dp(14.66f));
        canvas.saveLayerAlpha(rectF, 255, 31);
        if (LocaleController.isRTL) {
            canvas.translate(f10, 0.0f);
        }
        int dp = i10 - AndroidUtilities.dp(25.0f);
        int i11 = 0;
        while (true) {
            arrayList = this.f27900c;
            if (i11 >= arrayList.size()) {
                break;
            }
            hs hsVar = (hs) arrayList.get(i11);
            dp = org.telegram.ui.b.t(4.0f, hsVar.f27573e, dp);
            if (dp < 0) {
                break;
            }
            if (LocaleController.isRTL) {
                canvas.translate(-hsVar.f27573e, 0.0f);
                hsVar.a(canvas);
                canvas.translate(-AndroidUtilities.dp(4.0f), 0.0f);
            } else {
                hsVar.a(canvas);
                canvas.translate(AndroidUtilities.dp(4.0f) + hsVar.f27573e, 0.0f);
            }
            i11++;
        }
        if (i11 < arrayList.size()) {
            int size = arrayList.size() - i11;
            hs hsVar2 = this.d;
            if (hsVar2 == null || hsVar2.f27570a != size) {
                ?? obj = new Object();
                obj.f27570a = size;
                l01 l01Var = new l01(l.d.j(size, "+"), 10.0f, AndroidUtilities.bold());
                l01Var.s(this.f27898a);
                obj.f27572c = l01Var;
                int dp2 = AndroidUtilities.dp(9.32f);
                l01 l01Var2 = obj.f27572c;
                obj.f27573e = dp2 + ((int) l01Var2.f28521c);
                l01Var2.j();
                obj.d = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21841n8, false);
                this.d = obj;
            }
            if (LocaleController.isRTL) {
                canvas.translate(-this.d.f27573e, 0.0f);
                this.d.a(canvas);
                canvas.translate(-AndroidUtilities.dp(4.0f), 0.0f);
            } else {
                this.d.a(canvas);
                canvas.translate(AndroidUtilities.dp(4.0f) + this.d.f27573e, 0.0f);
            }
        }
        canvas.restore();
    }

    public final boolean b() {
        return this.f27900c.isEmpty();
    }
}
