package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class gs {
    public final org.telegram.ui.Cells.r2 f26497a;
    public final ArrayList f26498b = new ArrayList();
    public final ArrayList f26499c = new ArrayList();
    public fs d = null;

    public gs(org.telegram.ui.Cells.r2 r2Var) {
        this.f26497a = r2Var;
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
            arrayList = this.f26499c;
            if (i11 >= arrayList.size()) {
                break;
            }
            fs fsVar = (fs) arrayList.get(i11);
            dp = org.telegram.messenger.vl.v(4.0f, fsVar.f26181e, dp);
            if (dp < 0) {
                break;
            }
            if (LocaleController.isRTL) {
                canvas.translate(-fsVar.f26181e, 0.0f);
                fsVar.a(canvas);
                canvas.translate(-AndroidUtilities.dp(4.0f), 0.0f);
            } else {
                fsVar.a(canvas);
                canvas.translate(AndroidUtilities.dp(4.0f) + fsVar.f26181e, 0.0f);
            }
            i11++;
        }
        if (i11 < arrayList.size()) {
            int size = arrayList.size() - i11;
            fs fsVar2 = this.d;
            if (fsVar2 == null || fsVar2.f26178a != size) {
                ?? obj = new Object();
                obj.f26178a = size;
                f01 f01Var = new f01(i2.g.i(size, "+"), 10.0f, AndroidUtilities.bold());
                f01Var.s(this.f26497a);
                obj.f26180c = f01Var;
                int dp2 = AndroidUtilities.dp(9.32f);
                f01 f01Var2 = obj.f26180c;
                obj.f26181e = dp2 + ((int) f01Var2.f25848c);
                f01Var2.j();
                obj.d = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20849n8, false);
                this.d = obj;
            }
            if (LocaleController.isRTL) {
                canvas.translate(-this.d.f26181e, 0.0f);
                this.d.a(canvas);
                canvas.translate(-AndroidUtilities.dp(4.0f), 0.0f);
            } else {
                this.d.a(canvas);
                canvas.translate(AndroidUtilities.dp(4.0f) + this.d.f26181e, 0.0f);
            }
        }
        canvas.restore();
    }

    public final boolean b() {
        return this.f26499c.isEmpty();
    }
}
