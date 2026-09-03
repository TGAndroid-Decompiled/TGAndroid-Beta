package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class fs {
    public final org.telegram.ui.Cells.q2 f24961a;
    public final ArrayList f24962b = new ArrayList();
    public final ArrayList f24963c = new ArrayList();
    public es d = null;

    public fs(org.telegram.ui.Cells.q2 q2Var) {
        this.f24961a = q2Var;
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
            arrayList = this.f24963c;
            if (i11 >= arrayList.size()) {
                break;
            }
            es esVar = (es) arrayList.get(i11);
            dp = org.telegram.ui.b.t(4.0f, esVar.e, dp);
            if (dp < 0) {
                break;
            }
            if (LocaleController.isRTL) {
                canvas.translate(-esVar.e, 0.0f);
                esVar.a(canvas);
                canvas.translate(-AndroidUtilities.dp(4.0f), 0.0f);
            } else {
                esVar.a(canvas);
                canvas.translate(AndroidUtilities.dp(4.0f) + esVar.e, 0.0f);
            }
            i11++;
        }
        if (i11 < arrayList.size()) {
            int size = arrayList.size() - i11;
            es esVar2 = this.d;
            if (esVar2 == null || esVar2.f24679a != size) {
                ?? obj = new Object();
                obj.f24679a = size;
                k01 k01Var = new k01(kf.k0.j(size, "+"), 10.0f, AndroidUtilities.bold());
                k01Var.s(this.f24961a);
                obj.f24681c = k01Var;
                int dp2 = AndroidUtilities.dp(9.32f);
                k01 k01Var2 = obj.f24681c;
                obj.e = dp2 + ((int) k01Var2.f26124c);
                k01Var2.j();
                obj.d = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20062n8, false);
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
        return this.f24963c.isEmpty();
    }
}
