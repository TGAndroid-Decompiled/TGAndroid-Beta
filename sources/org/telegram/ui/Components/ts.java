package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class ts {
    public final org.telegram.ui.Cells.p2 f33138a;
    public final ArrayList f33139b = new ArrayList();
    public final ArrayList f33140c = new ArrayList();
    public ss d = null;

    public ts(org.telegram.ui.Cells.p2 p2Var) {
        this.f33138a = p2Var;
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
            arrayList = this.f33140c;
            if (i11 >= arrayList.size()) {
                break;
            }
            ss ssVar = (ss) arrayList.get(i11);
            dp = org.telegram.messenger.vh.z(4.0f, ssVar.f32665g, dp);
            if (dp < 0) {
                break;
            }
            if (LocaleController.isRTL) {
                canvas.translate(-ssVar.f32665g, 0.0f);
                ssVar.a(canvas);
                canvas.translate(-AndroidUtilities.dp(4.0f), 0.0f);
            } else {
                ssVar.a(canvas);
                canvas.translate(AndroidUtilities.dp(4.0f) + ssVar.f32665g, 0.0f);
            }
            i11++;
        }
        if (i11 < arrayList.size()) {
            int size = arrayList.size() - i11;
            ss ssVar2 = this.d;
            if (ssVar2 == null || ssVar2.f32661a != size) {
                ?? obj = new Object();
                obj.f32661a = size;
                q11 q11Var = new q11(ic.a.i(size, "+"), 10.0f, AndroidUtilities.bold());
                q11Var.s(this.f33138a);
                obj.f32663c = q11Var;
                int dp2 = AndroidUtilities.dp(9.32f);
                q11 q11Var2 = obj.f32663c;
                obj.f32665g = dp2 + ((int) q11Var2.f31790c);
                q11Var2.j();
                int i12 = org.telegram.ui.ActionBar.y6.f23542n8;
                obj.f32664f = i12;
                obj.e = true;
                obj.d = org.telegram.ui.ActionBar.y6.x0(null, i12, false);
                this.d = obj;
            }
            if (LocaleController.isRTL) {
                canvas.translate(-this.d.f32665g, 0.0f);
                this.d.a(canvas);
                canvas.translate(-AndroidUtilities.dp(4.0f), 0.0f);
            } else {
                this.d.a(canvas);
                canvas.translate(AndroidUtilities.dp(4.0f) + this.d.f32665g, 0.0f);
            }
        }
        canvas.restore();
    }

    public final boolean b() {
        return this.f33140c.isEmpty();
    }
}
