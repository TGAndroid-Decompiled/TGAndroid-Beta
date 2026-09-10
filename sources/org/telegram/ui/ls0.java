package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class ls0 implements Utilities.Callback {
    public final int f34766a;
    public final rs0 f34767b;
    public final boolean f34768c;

    public ls0(rs0 rs0Var, boolean z10, int i10) {
        this.f34766a = i10;
        this.f34767b = rs0Var;
        this.f34768c = z10;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f34766a) {
            case 0:
                org.telegram.ui.Components.wc.F(this.f34767b.f36451b.f30049e0, this.f34768c).j();
                return;
            default:
                org.telegram.ui.Components.wc.F(this.f34767b.f36451b.f30049e0, this.f34768c).j();
                return;
        }
    }
}
