package org.telegram.ui.Components;

import android.net.Uri;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class g7 implements Utilities.Callback {
    public final int f26621a;
    public final l8 f26622b;

    public g7(l8 l8Var, int i10) {
        this.f26621a = i10;
        this.f26622b = l8Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f26621a) {
            case 0:
                l8.w(this.f26622b, (MessageObject) obj);
                return;
            default:
                Uri uri = (Uri) obj;
                l8.z(this.f26622b);
                return;
        }
    }
}
