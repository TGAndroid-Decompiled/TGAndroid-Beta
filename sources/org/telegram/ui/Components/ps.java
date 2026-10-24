package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class ps {
    public final org.telegram.ui.Cells.q2 f29652a;
    public final ArrayList f29653b = new ArrayList();
    public final ArrayList f29654c = new ArrayList();
    public os d = null;

    public ps(org.telegram.ui.Cells.q2 q2Var) {
        this.f29652a = q2Var;
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
            arrayList = this.f29654c;
            if (i11 >= arrayList.size()) {
                break;
            }
            os osVar = (os) arrayList.get(i11);
            dp = org.telegram.messenger.tl.y(4.0f, osVar.f29367g, dp);
            if (dp < 0) {
                break;
            }
            if (LocaleController.isRTL) {
                canvas.translate(-osVar.f29367g, 0.0f);
                osVar.a(canvas);
                canvas.translate(-AndroidUtilities.dp(4.0f), 0.0f);
            } else {
                osVar.a(canvas);
                canvas.translate(AndroidUtilities.dp(4.0f) + osVar.f29367g, 0.0f);
            }
            i11++;
        }
        if (i11 < arrayList.size()) {
            int size = arrayList.size() - i11;
            os osVar2 = this.d;
            if (osVar2 == null || osVar2.f29363a != size) {
                ?? obj = new Object();
                obj.f29363a = size;
                h11 h11Var = new h11(i2.o1.k(size, "+"), 10.0f, AndroidUtilities.bold());
                h11Var.s(this.f29652a);
                obj.f29365c = h11Var;
                int dp2 = AndroidUtilities.dp(9.32f);
                h11 h11Var2 = obj.f29365c;
                obj.f29367g = dp2 + ((int) h11Var2.f26843c);
                h11Var2.j();
                int i12 = org.telegram.ui.ActionBar.k6.f21369n8;
                obj.f29366f = i12;
                obj.e = true;
                obj.d = org.telegram.ui.ActionBar.k6.x0(null, i12, false);
                this.d = obj;
            }
            if (LocaleController.isRTL) {
                canvas.translate(-this.d.f29367g, 0.0f);
                this.d.a(canvas);
                canvas.translate(-AndroidUtilities.dp(4.0f), 0.0f);
            } else {
                this.d.a(canvas);
                canvas.translate(AndroidUtilities.dp(4.0f) + this.d.f29367g, 0.0f);
            }
        }
        canvas.restore();
    }

    public final boolean b() {
        return this.f29654c.isEmpty();
    }
}
