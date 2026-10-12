package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class zs {
    public final org.telegram.ui.Cells.s2 f33486a;
    public final ArrayList f33487b = new ArrayList();
    public final ArrayList f33488c = new ArrayList();
    public ys d = null;

    public zs(org.telegram.ui.Cells.s2 s2Var) {
        this.f33486a = s2Var;
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
            arrayList = this.f33488c;
            if (i11 >= arrayList.size()) {
                break;
            }
            ys ysVar = (ys) arrayList.get(i11);
            dp = org.telegram.messenger.am.y(4.0f, ysVar.f33171e, dp);
            if (dp < 0) {
                break;
            }
            if (LocaleController.isRTL) {
                canvas.translate(-ysVar.f33171e, 0.0f);
                ysVar.a(canvas);
                canvas.translate(-AndroidUtilities.dp(4.0f), 0.0f);
            } else {
                ysVar.a(canvas);
                canvas.translate(AndroidUtilities.dp(4.0f) + ysVar.f33171e, 0.0f);
            }
            i11++;
        }
        if (i11 < arrayList.size()) {
            int size = arrayList.size() - i11;
            ys ysVar2 = this.d;
            if (ysVar2 == null || ysVar2.f33168a != size) {
                ?? obj = new Object();
                obj.f33168a = size;
                r11 r11Var = new r11(hg.c.i(size, "+"), 10.0f, AndroidUtilities.bold());
                r11Var.s(this.f33486a);
                obj.f33170c = r11Var;
                int dp2 = AndroidUtilities.dp(9.32f);
                r11 r11Var2 = obj.f33170c;
                obj.f33171e = dp2 + ((int) r11Var2.f29989c);
                r11Var2.j();
                obj.d = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20747n8, false);
                this.d = obj;
            }
            if (LocaleController.isRTL) {
                canvas.translate(-this.d.f33171e, 0.0f);
                this.d.a(canvas);
                canvas.translate(-AndroidUtilities.dp(4.0f), 0.0f);
            } else {
                this.d.a(canvas);
                canvas.translate(AndroidUtilities.dp(4.0f) + this.d.f33171e, 0.0f);
            }
        }
        canvas.restore();
    }

    public final boolean b() {
        return this.f33488c.isEmpty();
    }
}
