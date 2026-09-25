package org.telegram.ui.Components;

import android.net.Uri;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class e7 implements Utilities.Callback {
    public final int f23852a;
    public final j8 f23853b;

    public e7(j8 j8Var, int i10) {
        this.f23852a = i10;
        this.f23853b = j8Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f23852a) {
            case 0:
                j8.u(this.f23853b, (MessageObject) obj);
                return;
            default:
                Uri uri = (Uri) obj;
                j8.x(this.f23853b);
                return;
        }
    }
}
