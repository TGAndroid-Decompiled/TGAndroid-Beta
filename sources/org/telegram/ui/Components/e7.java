package org.telegram.ui.Components;

import android.net.Uri;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class e7 implements Utilities.Callback {
    public final int f25980a;
    public final j8 f25981b;

    public e7(j8 j8Var, int i10) {
        this.f25980a = i10;
        this.f25981b = j8Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f25980a) {
            case 0:
                j8.u(this.f25981b, (MessageObject) obj);
                return;
            default:
                Uri uri = (Uri) obj;
                j8.x(this.f25981b);
                return;
        }
    }
}
