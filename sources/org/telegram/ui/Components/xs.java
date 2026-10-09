package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class xs {
    public final org.telegram.ui.Cells.s2 f33001a;
    public final ArrayList f33002b = new ArrayList();
    public final ArrayList f33003c = new ArrayList();
    public ws d = null;

    public xs(org.telegram.ui.Cells.s2 s2Var) {
        this.f33001a = s2Var;
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
            arrayList = this.f33003c;
            if (i11 >= arrayList.size()) {
                break;
            }
            ws wsVar = (ws) arrayList.get(i11);
            dp = org.telegram.messenger.bi.z(4.0f, wsVar.f32670e, dp);
            if (dp < 0) {
                break;
            }
            if (LocaleController.isRTL) {
                canvas.translate(-wsVar.f32670e, 0.0f);
                wsVar.a(canvas);
                canvas.translate(-AndroidUtilities.dp(4.0f), 0.0f);
            } else {
                wsVar.a(canvas);
                canvas.translate(AndroidUtilities.dp(4.0f) + wsVar.f32670e, 0.0f);
            }
            i11++;
        }
        if (i11 < arrayList.size()) {
            int size = arrayList.size() - i11;
            ws wsVar2 = this.d;
            if (wsVar2 == null || wsVar2.f32667a != size) {
                ?? obj = new Object();
                obj.f32667a = size;
                l11 l11Var = new l11(hg.c.h(size, "+"), 10.0f, AndroidUtilities.bold());
                l11Var.s(this.f33001a);
                obj.f32669c = l11Var;
                int dp2 = AndroidUtilities.dp(9.32f);
                l11 l11Var2 = obj.f32669c;
                obj.f32670e = dp2 + ((int) l11Var2.f28222c);
                l11Var2.j();
                obj.d = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20984n8, false);
                this.d = obj;
            }
            if (LocaleController.isRTL) {
                canvas.translate(-this.d.f32670e, 0.0f);
                this.d.a(canvas);
                canvas.translate(-AndroidUtilities.dp(4.0f), 0.0f);
            } else {
                this.d.a(canvas);
                canvas.translate(AndroidUtilities.dp(4.0f) + this.d.f32670e, 0.0f);
            }
        }
        canvas.restore();
    }

    public final boolean b() {
        return this.f33003c.isEmpty();
    }
}
