package org.telegram.ui.Components;

import android.net.Uri;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class h7 implements Utilities.Callback {
    public final int f28851a;
    public final m8 f28852b;

    public h7(m8 m8Var, int i10) {
        this.f28851a = i10;
        this.f28852b = m8Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f28851a) {
            case 0:
                m8.v(this.f28852b, (MessageObject) obj);
                return;
            default:
                Uri uri = (Uri) obj;
                m8.J(this.f28852b);
                return;
        }
    }
}
