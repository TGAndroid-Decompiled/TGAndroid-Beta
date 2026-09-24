package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class is {
    public final org.telegram.ui.Cells.s2 f25134a;
    public final ArrayList f25135b = new ArrayList();
    public final ArrayList f25136c = new ArrayList();
    public hs d = null;

    public is(org.telegram.ui.Cells.s2 s2Var) {
        this.f25134a = s2Var;
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
            arrayList = this.f25136c;
            if (i11 >= arrayList.size()) {
                break;
            }
            hs hsVar = (hs) arrayList.get(i11);
            dp = org.telegram.messenger.ok.y(4.0f, hsVar.e, dp);
            if (dp < 0) {
                break;
            }
            if (LocaleController.isRTL) {
                canvas.translate(-hsVar.e, 0.0f);
                hsVar.a(canvas);
                canvas.translate(-AndroidUtilities.dp(4.0f), 0.0f);
            } else {
                hsVar.a(canvas);
                canvas.translate(AndroidUtilities.dp(4.0f) + hsVar.e, 0.0f);
            }
            i11++;
        }
        if (i11 < arrayList.size()) {
            int size = arrayList.size() - i11;
            hs hsVar2 = this.d;
            if (hsVar2 == null || hsVar2.f24835a != size) {
                ?? obj = new Object();
                obj.f24835a = size;
                t01 t01Var = new t01(hg.c.h(size, "+"), 10.0f, AndroidUtilities.bold());
                t01Var.s(this.f25134a);
                obj.f24837c = t01Var;
                int dp2 = AndroidUtilities.dp(9.32f);
                t01 t01Var2 = obj.f24837c;
                obj.e = dp2 + ((int) t01Var2.f28357c);
                t01Var2.j();
                obj.d = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19231n8, false);
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
        return this.f25136c.isEmpty();
    }
}
