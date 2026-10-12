package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class os0 implements Utilities.Callback {
    public final int f40768a;
    public final us0 f40769b;
    public final boolean f40770c;

    public os0(us0 us0Var, boolean z10, int i10) {
        this.f40768a = i10;
        this.f40769b = us0Var;
        this.f40770c = z10;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f40768a) {
            case 0:
                org.telegram.ui.Components.zc.F(this.f40769b.f42563b.f33743e0, this.f40770c).j();
                return;
            default:
                org.telegram.ui.Components.zc.F(this.f40769b.f42563b.f33743e0, this.f40770c).j();
                return;
        }
    }
}
