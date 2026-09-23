package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class is {
    public final org.telegram.ui.Cells.r2 f25055a;
    public final ArrayList f25056b = new ArrayList();
    public final ArrayList f25057c = new ArrayList();
    public hs d = null;

    public is(org.telegram.ui.Cells.r2 r2Var) {
        this.f25055a = r2Var;
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
            arrayList = this.f25057c;
            if (i11 >= arrayList.size()) {
                break;
            }
            hs hsVar = (hs) arrayList.get(i11);
            dp = org.telegram.messenger.ul.w(4.0f, hsVar.e, dp);
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
            if (hsVar2 == null || hsVar2.f24816a != size) {
                ?? obj = new Object();
                obj.f24816a = size;
                f01 f01Var = new f01(hg.c.i(size, "+"), 10.0f, AndroidUtilities.bold());
                f01Var.s(this.f25055a);
                obj.f24818c = f01Var;
                int dp2 = AndroidUtilities.dp(9.32f);
                f01 f01Var2 = obj.f24818c;
                obj.e = dp2 + ((int) f01Var2.f23785c);
                f01Var2.j();
                obj.d = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18975n8, false);
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
        return this.f25057c.isEmpty();
    }
}
