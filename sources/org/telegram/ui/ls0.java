package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class ls0 implements Utilities.Callback {
    public final int f38503a;
    public final rs0 f38504b;
    public final boolean f38505c;

    public ls0(rs0 rs0Var, boolean z10, int i10) {
        this.f38503a = i10;
        this.f38504b = rs0Var;
        this.f38505c = z10;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f38503a) {
            case 0:
                org.telegram.ui.Components.yc.F(this.f38504b.f40258b.f33577e0, this.f38505c).j();
                return;
            default:
                org.telegram.ui.Components.yc.F(this.f38504b.f40258b.f33577e0, this.f38505c).j();
                return;
        }
    }
}
