package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class js {
    public final org.telegram.ui.Cells.s2 f25514a;
    public final ArrayList f25515b = new ArrayList();
    public final ArrayList f25516c = new ArrayList();
    public is d = null;

    public js(org.telegram.ui.Cells.s2 s2Var) {
        this.f25514a = s2Var;
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
            arrayList = this.f25516c;
            if (i11 >= arrayList.size()) {
                break;
            }
            is isVar = (is) arrayList.get(i11);
            dp = org.telegram.messenger.ok.y(4.0f, isVar.e, dp);
            if (dp < 0) {
                break;
            }
            if (LocaleController.isRTL) {
                canvas.translate(-isVar.e, 0.0f);
                isVar.a(canvas);
                canvas.translate(-AndroidUtilities.dp(4.0f), 0.0f);
            } else {
                isVar.a(canvas);
                canvas.translate(AndroidUtilities.dp(4.0f) + isVar.e, 0.0f);
            }
            i11++;
        }
        if (i11 < arrayList.size()) {
            int size = arrayList.size() - i11;
            is isVar2 = this.d;
            if (isVar2 == null || isVar2.f25184a != size) {
                ?? obj = new Object();
                obj.f25184a = size;
                u01 u01Var = new u01(hg.c.h(size, "+"), 10.0f, AndroidUtilities.bold());
                u01Var.s(this.f25514a);
                obj.f25186c = u01Var;
                int dp2 = AndroidUtilities.dp(9.32f);
                u01 u01Var2 = obj.f25186c;
                obj.e = dp2 + ((int) u01Var2.f28649c);
                u01Var2.j();
                obj.d = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19245n8, false);
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
        return this.f25516c.isEmpty();
    }
}
