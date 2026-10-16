package org.telegram.ui.Components;

import android.net.Uri;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public final class h7 implements Utilities.Callback {
    public final int f25194a;
    public final m8 f25195b;

    public h7(m8 m8Var, int i10) {
        this.f25194a = i10;
        this.f25195b = m8Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f25194a) {
            case 0:
                m8.w(this.f25195b, (MessageObject) obj);
                return;
            default:
                Uri uri = (Uri) obj;
                m8.z(this.f25195b);
                return;
        }
    }
}
