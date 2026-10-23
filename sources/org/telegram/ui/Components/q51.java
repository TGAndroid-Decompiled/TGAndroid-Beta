package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class q51 extends s4.r0 {
    public final int f29769a = 0;
    public int f29770b;
    public final Object f29771c;

    public q51(u51 u51Var) {
        this.f29771c = u51Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        org.telegram.ui.Wallet.o8 o8Var;
        switch (this.f29769a) {
            case 0:
                if (i10 == 0) {
                    this.f29770b = 0;
                    return;
                }
                return;
            default:
                if (i10 == 1 && (o8Var = ((org.telegram.ui.Wallet.i4) this.f29771c).f34600b.f34941h0) != null) {
                    o8Var.a();
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f29769a) {
            case 0:
                u51 u51Var = (u51) this.f29771c;
                this.f29770b += i11;
                if (recyclerView.getScrollState() == 1 && Math.abs(this.f29770b) > AndroidUtilities.dp(96.0f)) {
                    View findFocus = u51Var.d.findFocus();
                    if (findFocus == null) {
                        findFocus = u51Var.d;
                    }
                    AndroidUtilities.hideKeyboard(findFocus);
                }
                if (i11 != 0) {
                    u51.m(u51Var);
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.o5 o5Var = ((org.telegram.ui.Wallet.i4) this.f29771c).f34600b;
                if (this.f29770b == 0) {
                    o5Var.z0();
                    return;
                } else {
                    recyclerView.post(new org.telegram.ui.Wallet.o3(o5Var, 14));
                    return;
                }
        }
    }

    public q51(org.telegram.ui.Wallet.i4 i4Var, int i10) {
        this.f29771c = i4Var;
        this.f29770b = i10;
    }
}
