package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class os0 implements Utilities.Callback {
    public final int f36418a;
    public final us0 f36419b;
    public final boolean f36420c;

    public os0(us0 us0Var, boolean z10, int i10) {
        this.f36418a = i10;
        this.f36419b = us0Var;
        this.f36420c = z10;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f36418a) {
            case 0:
                org.telegram.ui.Components.vc.F(this.f36419b.f38192b.f30950e0, this.f36420c).j();
                return;
            default:
                org.telegram.ui.Components.vc.F(this.f36419b.f38192b.f30950e0, this.f36420c).j();
                return;
        }
    }
}
