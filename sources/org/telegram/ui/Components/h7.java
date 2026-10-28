package org.telegram.ui.Components;

import android.net.Uri;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class h7 implements Utilities.Callback {
    public final int f28905a;
    public final m8 f28906b;

    public h7(m8 m8Var, int i10) {
        this.f28905a = i10;
        this.f28906b = m8Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f28905a) {
            case 0:
                m8.v(this.f28906b, (MessageObject) obj);
                return;
            default:
                Uri uri = (Uri) obj;
                m8.J(this.f28906b);
                return;
        }
    }
}
