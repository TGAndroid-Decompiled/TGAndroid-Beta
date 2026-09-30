package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class a0 implements View.OnClickListener {
    public final int f22490a;
    public final Utilities.Callback f22491b;
    public final int f22492c;

    public a0(int i10, int i11, Utilities.Callback callback) {
        this.f22490a = i11;
        this.f22491b = callback;
        this.f22492c = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f22490a) {
            case 0:
                this.f22491b.run(Integer.valueOf(this.f22492c));
                return;
            default:
                Utilities.Callback callback = this.f22491b;
                if (callback != null) {
                    callback.run(Integer.valueOf(this.f22492c));
                    return;
                }
                return;
        }
    }
}
