package org.telegram.ui.Components;

import android.net.Uri;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class d7 implements Utilities.Callback {
    public final int f22304a;
    public final j8 f22305b;

    public d7(j8 j8Var, int i10) {
        this.f22304a = i10;
        this.f22305b = j8Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f22304a) {
            case 0:
                j8.u(this.f22305b, (MessageObject) obj);
                return;
            default:
                Uri uri = (Uri) obj;
                j8.x(this.f22305b);
                return;
        }
    }
}
