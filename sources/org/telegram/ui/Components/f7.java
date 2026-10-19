package org.telegram.ui.Components;

import android.net.Uri;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class f7 implements Utilities.Callback {
    public final int f26151a;
    public final k8 f26152b;

    public f7(k8 k8Var, int i10) {
        this.f26151a = i10;
        this.f26152b = k8Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f26151a) {
            case 0:
                k8.w(this.f26152b, (MessageObject) obj);
                return;
            default:
                Uri uri = (Uri) obj;
                k8.z(this.f26152b);
                return;
        }
    }
}
