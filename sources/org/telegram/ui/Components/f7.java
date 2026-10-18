package org.telegram.ui.Components;

import android.net.Uri;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class f7 implements Utilities.Callback {
    public final int f26161a;
    public final k8 f26162b;

    public f7(k8 k8Var, int i10) {
        this.f26161a = i10;
        this.f26162b = k8Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f26161a) {
            case 0:
                k8.w(this.f26162b, (MessageObject) obj);
                return;
            default:
                Uri uri = (Uri) obj;
                k8.z(this.f26162b);
                return;
        }
    }
}
