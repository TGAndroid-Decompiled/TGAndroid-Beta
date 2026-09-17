package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class gs {
    public final org.telegram.ui.Cells.r2 f26524a;
    public final ArrayList f26525b = new ArrayList();
    public final ArrayList f26526c = new ArrayList();
    public fs d = null;

    public gs(org.telegram.ui.Cells.r2 r2Var) {
        this.f26524a = r2Var;
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
            arrayList = this.f26526c;
            if (i11 >= arrayList.size()) {
                break;
            }
            fs fsVar = (fs) arrayList.get(i11);
            dp = org.telegram.messenger.vl.v(4.0f, fsVar.f26208e, dp);
            if (dp < 0) {
                break;
            }
            if (LocaleController.isRTL) {
                canvas.translate(-fsVar.f26208e, 0.0f);
                fsVar.a(canvas);
                canvas.translate(-AndroidUtilities.dp(4.0f), 0.0f);
            } else {
                fsVar.a(canvas);
                canvas.translate(AndroidUtilities.dp(4.0f) + fsVar.f26208e, 0.0f);
            }
            i11++;
        }
        if (i11 < arrayList.size()) {
            int size = arrayList.size() - i11;
            fs fsVar2 = this.d;
            if (fsVar2 == null || fsVar2.f26205a != size) {
                ?? obj = new Object();
                obj.f26205a = size;
                f01 f01Var = new f01(i2.g.i(size, "+"), 10.0f, AndroidUtilities.bold());
                f01Var.s(this.f26524a);
                obj.f26207c = f01Var;
                int dp2 = AndroidUtilities.dp(9.32f);
                f01 f01Var2 = obj.f26207c;
                obj.f26208e = dp2 + ((int) f01Var2.f25875c);
                f01Var2.j();
                obj.d = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20876n8, false);
                this.d = obj;
            }
            if (LocaleController.isRTL) {
                canvas.translate(-this.d.f26208e, 0.0f);
                this.d.a(canvas);
                canvas.translate(-AndroidUtilities.dp(4.0f), 0.0f);
            } else {
                this.d.a(canvas);
                canvas.translate(AndroidUtilities.dp(4.0f) + this.d.f26208e, 0.0f);
            }
        }
        canvas.restore();
    }

    public final boolean b() {
        return this.f26526c.isEmpty();
    }
}
