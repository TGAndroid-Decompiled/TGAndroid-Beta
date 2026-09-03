package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class no0 implements Utilities.Callback {
    public final int f36548a;
    public final np0 f36549b;

    public no0(np0 np0Var, int i10) {
        this.f36548a = i10;
        this.f36549b = np0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f36548a) {
            case 0:
                np0 np0Var = this.f36549b;
                np0Var.f36566r = false;
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
                gk gkVar = this.f36549b.F;
                if (gkVar != null) {
                    gkVar.D(num.intValue());
                    return;
                }
                return;
        }
    }
}
