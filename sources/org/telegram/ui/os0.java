package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class os0 implements Utilities.Callback {
    public final int f36423a;
    public final us0 f36424b;
    public final boolean f36425c;

    public os0(us0 us0Var, boolean z10, int i10) {
        this.f36423a = i10;
        this.f36424b = us0Var;
        this.f36425c = z10;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f36423a) {
            case 0:
                org.telegram.ui.Components.vc.F(this.f36424b.f38197b.f30954e0, this.f36425c).j();
                return;
            default:
                org.telegram.ui.Components.vc.F(this.f36424b.f38197b.f30954e0, this.f36425c).j();
                return;
        }
    }
}
