package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class no0 implements Utilities.Callback {
    public final int f39418a;
    public final np0 f39419b;

    public no0(np0 np0Var, int i10) {
        this.f39418a = i10;
        this.f39419b = np0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f39418a) {
            case 0:
                np0 np0Var = this.f39419b;
                np0Var.f39436r = false;
                np0Var.N.setLoading(false);
                if (((Boolean) obj).booleanValue()) {
                    np0Var.x0();
                    np0Var.finishFragment();
                    np0Var.E0();
                    return;
                }
                return;
            default:
                Integer num = (Integer) obj;
                ek ekVar = this.f39419b.F;
                if (ekVar != null) {
                    ekVar.D(num.intValue());
                    return;
                }
                return;
        }
    }
}
