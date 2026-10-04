package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class ks {
    public final org.telegram.ui.Cells.s2 f28189a;
    public final ArrayList f28190b = new ArrayList();
    public final ArrayList f28191c = new ArrayList();
    public js d = null;

    public ks(org.telegram.ui.Cells.s2 s2Var) {
        this.f28189a = s2Var;
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
            arrayList = this.f28191c;
            if (i11 >= arrayList.size()) {
                break;
            }
            js jsVar = (js) arrayList.get(i11);
            dp = org.telegram.messenger.ok.y(4.0f, jsVar.f27887e, dp);
            if (dp < 0) {
                break;
            }
            if (LocaleController.isRTL) {
                canvas.translate(-jsVar.f27887e, 0.0f);
                jsVar.a(canvas);
                canvas.translate(-AndroidUtilities.dp(4.0f), 0.0f);
            } else {
                jsVar.a(canvas);
                canvas.translate(AndroidUtilities.dp(4.0f) + jsVar.f27887e, 0.0f);
            }
            i11++;
        }
        if (i11 < arrayList.size()) {
            int size = arrayList.size() - i11;
            js jsVar2 = this.d;
            if (jsVar2 == null || jsVar2.f27884a != size) {
                ?? obj = new Object();
                obj.f27884a = size;
                e11 e11Var = new e11(hg.k0.h(size, "+"), 10.0f, AndroidUtilities.bold());
                e11Var.s(this.f28189a);
                obj.f27886c = e11Var;
                int dp2 = AndroidUtilities.dp(9.32f);
                e11 e11Var2 = obj.f27886c;
                obj.f27887e = dp2 + ((int) e11Var2.f25878c);
                e11Var2.j();
                obj.d = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21005n8, false);
                this.d = obj;
            }
            if (LocaleController.isRTL) {
                canvas.translate(-this.d.f27887e, 0.0f);
                this.d.a(canvas);
                canvas.translate(-AndroidUtilities.dp(4.0f), 0.0f);
            } else {
                this.d.a(canvas);
                canvas.translate(AndroidUtilities.dp(4.0f) + this.d.f27887e, 0.0f);
            }
        }
        canvas.restore();
    }

    public final boolean b() {
        return this.f28191c.isEmpty();
    }
}
