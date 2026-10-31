package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.us;
import org.telegram.messenger.zs;
import org.telegram.ui.f70;
public final class z implements Runnable, us {
    public boolean f35432a;
    public final zs f35433b;
    public final f70 f35434c;
    public final k0 d;

    public z(zs zsVar, f70 f70Var, k0 k0Var) {
        this.f35433b = zsVar;
        this.f35434c = f70Var;
        this.d = k0Var;
    }

    public final void a() {
        if (!this.f35432a) {
            k0 k0Var = this.d;
            if (k0Var.e != null) {
                ArrayList arrayList = k0Var.G;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    if (((g0) obj).d) {
                        return;
                    }
                }
                run();
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == zs.f19582a4) {
            a();
        }
    }

    @Override
    public final void run() {
        if (this.f35432a) {
            return;
        }
        this.f35432a = true;
        org.telegram.messenger.i0.r(this);
        this.f35433b.n(this, zs.f19582a4);
        this.f35434c.run();
    }
}
