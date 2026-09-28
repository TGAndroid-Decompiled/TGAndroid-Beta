package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class es0 implements Utilities.Callback {
    public final int f33462a;
    public final ks0 f33463b;
    public final boolean f33464c;

    public es0(ks0 ks0Var, boolean z10, int i10) {
        this.f33462a = i10;
        this.f33463b = ks0Var;
        this.f33464c = z10;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f33462a) {
            case 0:
                org.telegram.ui.Components.xc.F(this.f33463b.f35167b.f31223e0, this.f33464c).j();
                return;
            default:
                org.telegram.ui.Components.xc.F(this.f33463b.f35167b.f31223e0, this.f33464c).j();
                return;
        }
    }
}
