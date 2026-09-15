package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class ms0 implements Utilities.Callback {
    public final int f35800a;
    public final ss0 f35801b;
    public final boolean f35802c;

    public ms0(ss0 ss0Var, boolean z10, int i10) {
        this.f35800a = i10;
        this.f35801b = ss0Var;
        this.f35802c = z10;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f35800a) {
            case 0:
                org.telegram.ui.Components.vc.F(this.f35801b.f37448b.f30936e0, this.f35802c).j();
                return;
            default:
                org.telegram.ui.Components.vc.F(this.f35801b.f37448b.f30936e0, this.f35802c).j();
                return;
        }
    }
}
