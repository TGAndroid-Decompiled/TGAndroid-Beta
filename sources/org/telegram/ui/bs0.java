package org.telegram.ui;

import android.net.Uri;
import org.telegram.messenger.Utilities;
public final class bs0 implements Utilities.Callback {
    public final int f38096a;
    public final hs0 f38097b;
    public final boolean f38098c;

    public bs0(hs0 hs0Var, boolean z10, int i10) {
        this.f38096a = i10;
        this.f38097b = hs0Var;
        this.f38098c = z10;
    }

    @Override
    public final void run(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.f38096a) {
            case 0:
                org.telegram.ui.Components.wc.F(this.f38097b.f39958b.f35670e0, this.f38098c).j();
                return;
            default:
                org.telegram.ui.Components.wc.F(this.f38097b.f39958b.f35670e0, this.f38098c).j();
                return;
        }
    }
}
