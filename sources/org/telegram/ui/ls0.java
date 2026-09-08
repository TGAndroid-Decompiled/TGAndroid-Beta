package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class ls0 implements Utilities.Callback {
    public final int f38502a;
    public final rs0 f38503b;
    public final boolean f38504c;

    public ls0(rs0 rs0Var, boolean z10, int i10) {
        this.f38502a = i10;
        this.f38503b = rs0Var;
        this.f38504c = z10;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f38502a) {
            case 0:
                org.telegram.ui.Components.yc.F(this.f38503b.f40257b.f33576e0, this.f38504c).j();
                return;
            default:
                org.telegram.ui.Components.yc.F(this.f38503b.f40257b.f33576e0, this.f38504c).j();
                return;
        }
    }
}
