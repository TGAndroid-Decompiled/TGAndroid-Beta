package org.telegram.ui.Wallet;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class s2 implements View.OnClickListener {
    public final int f37238a;
    public final Object f37239b;

    public s2(Object obj, int i10) {
        this.f37238a = i10;
        this.f37239b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37238a) {
            case 0:
                ((y2) this.f37239b).dismiss();
                return;
            case 1:
                qf.d.t((Activity) this.f37239b, "https://fragment.com/");
                return;
            case 2:
                ((i4) this.f37239b).dismiss();
                return;
            case 3:
                ((Runnable) this.f37239b).run();
                return;
            case 4:
                m6 m6Var = (m6) this.f37239b;
                if (!m6Var.f36993x && m6Var.f36990r && !m6Var.h.b()) {
                    m6Var.h.setProgress(0.0f);
                    m6Var.h.d();
                    return;
                }
                return;
            case 5:
                n8 n8Var = (n8) this.f37239b;
                n8Var.b(!n8Var.f37064x);
                return;
            case 6:
                org.telegram.ui.Cells.y1 y1Var = (org.telegram.ui.Cells.y1) this.f37239b;
                y1Var.c(!y1Var.b(), true);
                return;
            default:
                d9 d9Var = ((h9) this.f37239b).f36668c;
                d9Var.requestFocus();
                AndroidUtilities.showKeyboard(d9Var);
                return;
        }
    }
}
