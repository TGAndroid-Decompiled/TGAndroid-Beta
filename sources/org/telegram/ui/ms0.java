package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class ms0 implements Utilities.Callback {
    public final int f35735a;
    public final ss0 f35736b;
    public final boolean f35737c;

    public ms0(ss0 ss0Var, boolean z10, int i10) {
        this.f35735a = i10;
        this.f35736b = ss0Var;
        this.f35737c = z10;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f35735a) {
            case 0:
                org.telegram.ui.Components.xc.F(this.f35736b.f37466b.f31181e0, this.f35737c).j();
                return;
            default:
                org.telegram.ui.Components.xc.F(this.f35736b.f37466b.f31181e0, this.f35737c).j();
                return;
        }
    }
}
