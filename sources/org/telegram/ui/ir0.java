package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class ir0 implements Utilities.Callback {
    public final int f39330a;
    public final or0 f39331b;
    public final boolean f39332c;

    public ir0(or0 or0Var, boolean z10, int i10) {
        this.f39330a = i10;
        this.f39331b = or0Var;
        this.f39332c = z10;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f39330a) {
            case 0:
                org.telegram.ui.Components.tc.F(this.f39331b.f41216b.f35647a0, this.f39332c).j();
                return;
            default:
                org.telegram.ui.Components.tc.F(this.f39331b.f41216b.f35647a0, this.f39332c).j();
                return;
        }
    }
}
