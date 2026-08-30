package org.telegram.ui.Components;

import android.net.Uri;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class z6 implements Utilities.Callback {
    public final int f31250a;
    public final c8 f31251b;

    public z6(c8 c8Var, int i10) {
        this.f31250a = i10;
        this.f31251b = c8Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f31250a) {
            case 0:
                c8.u(this.f31251b, (MessageObject) obj);
                return;
            default:
                Uri uri = (Uri) obj;
                c8.x(this.f31251b);
                return;
        }
    }
}
