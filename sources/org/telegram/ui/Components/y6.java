package org.telegram.ui.Components;

import android.net.Uri;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class y6 implements Utilities.Callback {
    public final int f34869a;
    public final c8 f34870b;

    public y6(c8 c8Var, int i9) {
        this.f34869a = i9;
        this.f34870b = c8Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f34869a) {
            case 0:
                c8.u(this.f34870b, (MessageObject) obj);
                return;
            default:
                Uri uri = (Uri) obj;
                c8.x(this.f34870b);
                return;
        }
    }
}
