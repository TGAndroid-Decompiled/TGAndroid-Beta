package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class is {
    public final org.telegram.ui.Cells.r2 f27893a;
    public final ArrayList f27894b = new ArrayList();
    public final ArrayList f27895c = new ArrayList();
    public hs d = null;

    public is(org.telegram.ui.Cells.r2 r2Var) {
        this.f27893a = r2Var;
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
            arrayList = this.f27895c;
            if (i11 >= arrayList.size()) {
                break;
            }
            hs hsVar = (hs) arrayList.get(i11);
            dp = org.telegram.ui.b.t(4.0f, hsVar.f27612e, dp);
            if (dp < 0) {
                break;
            }
            if (LocaleController.isRTL) {
                canvas.translate(-hsVar.f27612e, 0.0f);
                hsVar.a(canvas);
                canvas.translate(-AndroidUtilities.dp(4.0f), 0.0f);
            } else {
                hsVar.a(canvas);
                canvas.translate(AndroidUtilities.dp(4.0f) + hsVar.f27612e, 0.0f);
            }
            i11++;
        }
        if (i11 < arrayList.size()) {
            int size = arrayList.size() - i11;
            hs hsVar2 = this.d;
            if (hsVar2 == null || hsVar2.f27609a != size) {
                ?? obj = new Object();
                obj.f27609a = size;
                k01 k01Var = new k01(l.d.j(size, "+"), 10.0f, AndroidUtilities.bold());
                k01Var.s(this.f27893a);
                obj.f27611c = k01Var;
                int dp2 = AndroidUtilities.dp(9.32f);
                k01 k01Var2 = obj.f27611c;
                obj.f27612e = dp2 + ((int) k01Var2.f28227c);
                k01Var2.j();
                obj.d = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21843n8, false);
                this.d = obj;
            }
            if (LocaleController.isRTL) {
                canvas.translate(-this.d.f27612e, 0.0f);
                this.d.a(canvas);
                canvas.translate(-AndroidUtilities.dp(4.0f), 0.0f);
            } else {
                this.d.a(canvas);
                canvas.translate(AndroidUtilities.dp(4.0f) + this.d.f27612e, 0.0f);
            }
        }
        canvas.restore();
    }

    public final boolean b() {
        return this.f27895c.isEmpty();
    }
}
