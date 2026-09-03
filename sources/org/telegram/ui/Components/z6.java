package org.telegram.ui.Components;

import android.net.Uri;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class z6 implements Utilities.Callback {
    public final int f33807a;
    public final c8 f33808b;

    public z6(c8 c8Var, int i10) {
        this.f33807a = i10;
        this.f33808b = c8Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f33807a) {
            case 0:
                c8.u(this.f33808b, (MessageObject) obj);
                return;
            default:
                Uri uri = (Uri) obj;
                c8.x(this.f33808b);
                return;
        }
    }
}
