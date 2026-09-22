package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class a0 implements View.OnClickListener {
    public final int f22243a;
    public final Utilities.Callback f22244b;
    public final int f22245c;

    public a0(int i10, int i11, Utilities.Callback callback) {
        this.f22243a = i11;
        this.f22244b = callback;
        this.f22245c = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f22243a) {
            case 0:
                this.f22244b.run(Integer.valueOf(this.f22245c));
                return;
            default:
                Utilities.Callback callback = this.f22244b;
                if (callback != null) {
                    callback.run(Integer.valueOf(this.f22245c));
                    return;
                }
                return;
        }
    }
}
