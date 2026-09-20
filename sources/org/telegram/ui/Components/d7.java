package org.telegram.ui.Components;

import android.net.Uri;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class d7 implements Utilities.Callback {
    public final int f23508a;
    public final i8 f23509b;

    public d7(i8 i8Var, int i10) {
        this.f23508a = i10;
        this.f23509b = i8Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f23508a) {
            case 0:
                i8.u(this.f23509b, (MessageObject) obj);
                return;
            default:
                Uri uri = (Uri) obj;
                i8.x(this.f23509b);
                return;
        }
    }
}
