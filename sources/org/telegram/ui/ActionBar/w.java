package org.telegram.ui.ActionBar;

import android.view.KeyEvent;
import android.view.View;
public final class w implements View.OnClickListener {
    public final int f21824a;
    public final KeyEvent.Callback f21825b;

    public w(KeyEvent.Callback callback, int i10) {
        this.f21824a = i10;
        this.f21825b = callback;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f21824a) {
            case 0:
                y yVar = (y) this.f21825b;
                k kVar = yVar.f21890b;
                u0 u0Var = (u0) view;
                if (u0Var.q()) {
                    if (kVar.f21510u0.a()) {
                        u0Var.M(null, null);
                        return;
                    }
                    return;
                } else if (u0Var.G) {
                    kVar.w(u0Var.L(true));
                    return;
                } else {
                    yVar.o(((Integer) view.getTag()).intValue());
                    return;
                }
            case 1:
                ((f2) this.f21825b).dismiss();
                return;
            default:
                f3 f3Var = (f3) this.f21825b;
                f3Var.getClass();
                f3Var.dismissWithButtonClick(((Integer) view.getTag()).intValue());
                return;
        }
    }
}
