package org.telegram.ui.Wallet;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class s2 implements View.OnClickListener {
    public final int f37214a;
    public final Object f37215b;

    public s2(Object obj, int i10) {
        this.f37214a = i10;
        this.f37215b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37214a) {
            case 0:
                ((y2) this.f37215b).dismiss();
                return;
            case 1:
                qf.d.t((Activity) this.f37215b, "https://fragment.com/");
                return;
            case 2:
                ((i4) this.f37215b).dismiss();
                return;
            case 3:
                ((Runnable) this.f37215b).run();
                return;
            case 4:
                l6 l6Var = (l6) this.f37215b;
                if (!l6Var.f36866x && l6Var.f36863r && !l6Var.h.b()) {
                    l6Var.h.setProgress(0.0f);
                    l6Var.h.d();
                    return;
                }
                return;
            case 5:
                n8 n8Var = (n8) this.f37215b;
                n8Var.b(!n8Var.f37039x);
                return;
            case 6:
                org.telegram.ui.Cells.y1 y1Var = (org.telegram.ui.Cells.y1) this.f37215b;
                y1Var.c(!y1Var.b(), true);
                return;
            default:
                d9 d9Var = ((h9) this.f37215b).f36643c;
                d9Var.requestFocus();
                AndroidUtilities.showKeyboard(d9Var);
                return;
        }
    }
}
