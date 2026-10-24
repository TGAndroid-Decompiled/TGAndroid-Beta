package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class p51 extends s4.r0 {
    public final int f29494a = 0;
    public int f29495b;
    public final Object f29496c;

    public p51(t51 t51Var) {
        this.f29496c = t51Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        org.telegram.ui.Wallet.o8 o8Var;
        switch (this.f29494a) {
            case 0:
                if (i10 == 0) {
                    this.f29495b = 0;
                    return;
                }
                return;
            default:
                if (i10 == 1 && (o8Var = ((org.telegram.ui.Wallet.i4) this.f29496c).f34602b.f34943h0) != null) {
                    o8Var.a();
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f29494a) {
            case 0:
                t51 t51Var = (t51) this.f29496c;
                this.f29495b += i11;
                if (recyclerView.getScrollState() == 1 && Math.abs(this.f29495b) > AndroidUtilities.dp(96.0f)) {
                    View findFocus = t51Var.d.findFocus();
                    if (findFocus == null) {
                        findFocus = t51Var.d;
                    }
                    AndroidUtilities.hideKeyboard(findFocus);
                }
                if (i11 != 0) {
                    t51.m(t51Var);
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.o5 o5Var = ((org.telegram.ui.Wallet.i4) this.f29496c).f34602b;
                if (this.f29495b == 0) {
                    o5Var.z0();
                    return;
                } else {
                    recyclerView.post(new org.telegram.ui.Wallet.o3(o5Var, 14));
                    return;
                }
        }
    }

    public p51(org.telegram.ui.Wallet.i4 i4Var, int i10) {
        this.f29496c = i4Var;
        this.f29495b = i10;
    }
}
