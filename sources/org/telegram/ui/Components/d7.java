package org.telegram.ui.Components;

import android.net.Uri;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class d7 implements Utilities.Callback {
    public final int f23576a;
    public final i8 f23577b;

    public d7(i8 i8Var, int i10) {
        this.f23576a = i10;
        this.f23577b = i8Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f23576a) {
            case 0:
                i8.u(this.f23577b, (MessageObject) obj);
                return;
            default:
                Uri uri = (Uri) obj;
                i8.x(this.f23577b);
                return;
        }
    }
}
