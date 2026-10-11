package org.telegram.ui.ActionBar;

import android.view.View;
public final class f4 {
    public final v4 f20598a;
    public boolean f20599b;
    public boolean f20600c;
    public boolean d;
    public boolean f20601e = true;
    public boolean f20602f;
    public long f20603g;

    public f4(v4 v4Var) {
        this.f20598a = v4Var;
    }

    public final void a() {
        if (this.f20602f) {
            boolean z10 = this.f20599b;
            v4 v4Var = this.f20598a;
            if (!z10 && !this.f20600c && !this.d && this.f20601e) {
                View view = v4Var.f21628a;
                i4 i4Var = v4Var.f21637l;
                view.removeOnLayoutChangeListener(i4Var);
                v4Var.f21628a.addOnLayoutChangeListener(i4Var);
                v4Var.c();
                this.f20603g = System.currentTimeMillis();
                return;
            }
            t4 t4Var = v4Var.f21629b;
            if (!t4Var.f()) {
                return;
            }
            t4Var.G = true;
            t4Var.f21522x.start();
            t4Var.D.setEmpty();
        }
    }
}
