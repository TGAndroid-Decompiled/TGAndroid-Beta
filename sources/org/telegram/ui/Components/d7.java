package org.telegram.ui.Components;

import android.net.Uri;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class d7 implements Utilities.Callback {
    public final int f27682a;
    public final g8 f27683b;

    public d7(g8 g8Var, int i10) {
        this.f27682a = i10;
        this.f27683b = g8Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f27682a) {
            case 0:
                g8.u(this.f27683b, (MessageObject) obj);
                return;
            default:
                Uri uri = (Uri) obj;
                g8.x(this.f27683b);
                return;
        }
    }
}
