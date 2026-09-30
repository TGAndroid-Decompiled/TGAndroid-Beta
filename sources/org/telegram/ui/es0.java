package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class es0 implements Utilities.Callback {
    public final int f33547a;
    public final ks0 f33548b;
    public final boolean f33549c;

    public es0(ks0 ks0Var, boolean z10, int i10) {
        this.f33547a = i10;
        this.f33548b = ks0Var;
        this.f33549c = z10;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f33547a) {
            case 0:
                org.telegram.ui.Components.yc.F(this.f33548b.f35256b.f31297e0, this.f33549c).j();
                return;
            default:
                org.telegram.ui.Components.yc.F(this.f33548b.f35256b.f31297e0, this.f33549c).j();
                return;
        }
    }
}
