package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class hs {
    public final org.telegram.ui.Cells.s2 f24875a;
    public final ArrayList f24876b = new ArrayList();
    public final ArrayList f24877c = new ArrayList();
    public gs d = null;

    public hs(org.telegram.ui.Cells.s2 s2Var) {
        this.f24875a = s2Var;
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
            arrayList = this.f24877c;
            if (i11 >= arrayList.size()) {
                break;
            }
            gs gsVar = (gs) arrayList.get(i11);
            dp = org.telegram.messenger.rk.x(4.0f, gsVar.e, dp);
            if (dp < 0) {
                break;
            }
            if (LocaleController.isRTL) {
                canvas.translate(-gsVar.e, 0.0f);
                gsVar.a(canvas);
                canvas.translate(-AndroidUtilities.dp(4.0f), 0.0f);
            } else {
                gsVar.a(canvas);
                canvas.translate(AndroidUtilities.dp(4.0f) + gsVar.e, 0.0f);
            }
            i11++;
        }
        if (i11 < arrayList.size()) {
            int size = arrayList.size() - i11;
            gs gsVar2 = this.d;
            if (gsVar2 == null || gsVar2.f24614a != size) {
                ?? obj = new Object();
                obj.f24614a = size;
                w01 w01Var = new w01(hg.k0.h(size, "+"), 10.0f, AndroidUtilities.bold());
                w01Var.s(this.f24875a);
                obj.f24616c = w01Var;
                int dp2 = AndroidUtilities.dp(9.32f);
                w01 w01Var2 = obj.f24616c;
                obj.e = dp2 + ((int) w01Var2.f29862c);
                w01Var2.j();
                obj.d = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19296n8, false);
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
        return this.f24877c.isEmpty();
    }
}
