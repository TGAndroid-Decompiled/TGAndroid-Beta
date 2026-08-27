package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

public final class wr {

    public final org.telegram.ui.Cells.p2 f34312a;

    public final ArrayList f34313b = new ArrayList();

    public final ArrayList f34314c = new ArrayList();
    public vr d = null;

    public wr(org.telegram.ui.Cells.p2 p2Var) {
        this.f34312a = p2Var;
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
        int iDp = i10 - AndroidUtilities.dp(25.0f);
        int i11 = 0;
        while (true) {
            arrayList = this.f34314c;
            if (i11 >= arrayList.size()) {
                break;
            }
            vr vrVar = (vr) arrayList.get(i11);
            iDp = org.telegram.messenger.rl.u(4.0f, vrVar.f34037e, iDp);
            if (iDp < 0) {
                break;
            }
            if (LocaleController.isRTL) {
                canvas.translate(-vrVar.f34037e, 0.0f);
                vrVar.a(canvas);
                canvas.translate(-AndroidUtilities.dp(4.0f), 0.0f);
            } else {
                vrVar.a(canvas);
                canvas.translate(AndroidUtilities.dp(4.0f) + vrVar.f34037e, 0.0f);
            }
            i11++;
        }
        if (i11 < arrayList.size()) {
            int size = arrayList.size() - i11;
            vr vrVar2 = this.d;
            if (vrVar2 == null || vrVar2.f34034a != size) {
                vr vrVar3 = new vr();
                vrVar3.f34034a = size;
                pz0 pz0Var = new pz0(i0.a.k(size, "+"), 10.0f, AndroidUtilities.bold());
                pz0Var.s(this.f34312a);
                vrVar3.f34036c = pz0Var;
                int iDp2 = AndroidUtilities.dp(9.32f);
                pz0 pz0Var2 = vrVar3.f34036c;
                vrVar3.f34037e = iDp2 + ((int) pz0Var2.f31697c);
                pz0Var2.j();
                vrVar3.d = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23236n8, false);
                this.d = vrVar3;
            }
            if (LocaleController.isRTL) {
                canvas.translate(-this.d.f34037e, 0.0f);
                this.d.a(canvas);
                canvas.translate(-AndroidUtilities.dp(4.0f), 0.0f);
            } else {
                this.d.a(canvas);
                canvas.translate(AndroidUtilities.dp(4.0f) + this.d.f34037e, 0.0f);
            }
        }
        canvas.restore();
    }

    public final boolean b() {
        return this.f34314c.isEmpty();
    }
}
