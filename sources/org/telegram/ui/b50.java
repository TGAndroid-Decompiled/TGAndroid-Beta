package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class b50 implements Runnable {
    public final int f35588a;
    public final c50 f35589b;

    public b50(c50 c50Var, int i10) {
        this.f35588a = i10;
        this.f35589b = c50Var;
    }

    @Override
    public final void run() {
        switch (this.f35588a) {
            case 0:
                c50 c50Var = this.f35589b;
                x10 x10Var = c50Var.f35835b;
                if (x10Var != null) {
                    x10Var.setVisibility(0);
                }
                AndroidUtilities.runOnUIThread(new b50(c50Var, 2), 16L);
                return;
            case 1:
                x10 x10Var2 = this.f35589b.f35835b;
                if (x10Var2 != null) {
                    x10Var2.setVisibility(4);
                    return;
                }
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }
}
