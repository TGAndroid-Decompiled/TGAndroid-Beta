package org.telegram.ui.Components;

import android.net.Uri;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class f7 implements Utilities.Callback {
    public final int f26154a;
    public final k8 f26155b;

    public f7(k8 k8Var, int i10) {
        this.f26154a = i10;
        this.f26155b = k8Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f26154a) {
            case 0:
                k8.w(this.f26155b, (MessageObject) obj);
                return;
            default:
                Uri uri = (Uri) obj;
                k8.z(this.f26155b);
                return;
        }
    }
}
