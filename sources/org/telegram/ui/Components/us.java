package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class us {
    public final org.telegram.ui.Cells.s2 f29432a;
    public final ArrayList f29433b = new ArrayList();
    public final ArrayList f29434c = new ArrayList();
    public ts d = null;

    public us(org.telegram.ui.Cells.s2 s2Var) {
        this.f29432a = s2Var;
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
            arrayList = this.f29434c;
            if (i11 >= arrayList.size()) {
                break;
            }
            ts tsVar = (ts) arrayList.get(i11);
            dp = org.telegram.messenger.sk.z(4.0f, tsVar.e, dp);
            if (dp < 0) {
                break;
            }
            if (LocaleController.isRTL) {
                canvas.translate(-tsVar.e, 0.0f);
                tsVar.a(canvas);
                canvas.translate(-AndroidUtilities.dp(4.0f), 0.0f);
            } else {
                tsVar.a(canvas);
                canvas.translate(AndroidUtilities.dp(4.0f) + tsVar.e, 0.0f);
            }
            i11++;
        }
        if (i11 < arrayList.size()) {
            int size = arrayList.size() - i11;
            ts tsVar2 = this.d;
            if (tsVar2 == null || tsVar2.f29184a != size) {
                ?? obj = new Object();
                obj.f29184a = size;
                i11 i11Var = new i11(i2.d.j(size, "+"), 10.0f, AndroidUtilities.bold());
                i11Var.s(this.f29432a);
                obj.f29186c = i11Var;
                int dp2 = AndroidUtilities.dp(9.32f);
                i11 i11Var2 = obj.f29186c;
                obj.e = dp2 + ((int) i11Var2.f25455c);
                i11Var2.j();
                obj.d = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19786n8, false);
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
        return this.f29434c.isEmpty();
    }
}
