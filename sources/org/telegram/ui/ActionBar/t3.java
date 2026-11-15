package org.telegram.ui.ActionBar;

import android.view.View;
public final class t3 {
    public final i4 f29663a;
    public boolean f29664b;
    public boolean f29665c;
    public boolean d;
    public boolean f29666e = true;
    public boolean f29667f;
    public long f29668g;

    public t3(i4 i4Var) {
        this.f29663a = i4Var;
    }

    public final void a() {
        if (this.f29667f) {
            boolean z10 = this.f29664b;
            i4 i4Var = this.f29663a;
            if (!z10 && !this.f29665c && !this.d && this.f29666e) {
                View view = i4Var.f28685a;
                w3 w3Var = i4Var.f28694l;
                view.removeOnLayoutChangeListener(w3Var);
                i4Var.f28685a.addOnLayoutChangeListener(w3Var);
                i4Var.c();
                this.f29668g = System.currentTimeMillis();
                return;
            }
            g4 g4Var = i4Var.f28686b;
            if (!g4Var.f()) {
                return;
            }
            g4Var.G = true;
            g4Var.f28582x.start();
            g4Var.D.setEmpty();
        }
    }
}
