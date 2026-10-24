package org.telegram.ui.Components;

import android.net.Uri;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class d7 implements Utilities.Callback {
    public final int f25612a;
    public final i8 f25613b;

    public d7(i8 i8Var, int i10) {
        this.f25612a = i10;
        this.f25613b = i8Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f25612a) {
            case 0:
                i8.w(this.f25613b, (MessageObject) obj);
                return;
            default:
                Uri uri = (Uri) obj;
                i8.J(this.f25613b);
                return;
        }
    }
}
