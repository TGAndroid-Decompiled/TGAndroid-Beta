package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

public final class c implements Runnable {

    public final int f27232a;

    public final e0 f27233b;

    public c(e0 e0Var, int i10) {
        this.f27232a = i10;
        this.f27233b = e0Var;
    }

    @Override
    public final void run() {
        switch (this.f27232a) {
            case 0:
                e0 e0Var = this.f27233b;
                if (!e0Var.G0) {
                    e0Var.f27902z0.setVisibility(8);
                }
                break;
            case 1:
                e0 e0Var2 = this.f27233b;
                if (e0Var2.G0) {
                    e0Var2.f27901y0.setVisibility(8);
                }
                break;
            case 2:
                AndroidUtilities.showKeyboard(this.f27233b.f27899w0.f24370b);
                break;
            case 3:
                e0 e0Var3 = this.f27233b;
                e0Var3.l0(0, 0, false);
                e0Var3.dismiss();
                break;
            default:
                e0.Q(this.f27233b);
                break;
        }
    }
}
