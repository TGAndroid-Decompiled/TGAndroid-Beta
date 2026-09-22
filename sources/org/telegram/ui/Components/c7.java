package org.telegram.ui.Components;

import android.net.Uri;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class c7 implements Utilities.Callback {
    public final int f22963a;
    public final h8 f22964b;

    public c7(h8 h8Var, int i10) {
        this.f22963a = i10;
        this.f22964b = h8Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f22963a) {
            case 0:
                h8.u(this.f22964b, (MessageObject) obj);
                return;
            default:
                Uri uri = (Uri) obj;
                h8.x(this.f22964b);
                return;
        }
    }
}
