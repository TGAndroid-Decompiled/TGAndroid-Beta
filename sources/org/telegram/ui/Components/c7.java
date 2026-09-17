package org.telegram.ui.Components;

import android.net.Uri;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class c7 implements Utilities.Callback {
    public final int f22948a;
    public final h8 f22949b;

    public c7(h8 h8Var, int i10) {
        this.f22948a = i10;
        this.f22949b = h8Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f22948a) {
            case 0:
                h8.u(this.f22949b, (MessageObject) obj);
                return;
            default:
                Uri uri = (Uri) obj;
                h8.x(this.f22949b);
                return;
        }
    }
}
