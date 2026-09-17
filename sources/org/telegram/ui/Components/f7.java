package org.telegram.ui.Components;

import android.net.Uri;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class f7 implements Utilities.Callback {
    public final int f25970a;
    public final k8 f25971b;

    public f7(k8 k8Var, int i10) {
        this.f25970a = i10;
        this.f25971b = k8Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f25970a) {
            case 0:
                k8.u(this.f25971b, (MessageObject) obj);
                return;
            default:
                Uri uri = (Uri) obj;
                k8.x(this.f25971b);
                return;
        }
    }
}
