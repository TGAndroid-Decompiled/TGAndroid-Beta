package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class a0 implements View.OnClickListener {
    public final int f24393a;
    public final Utilities.Callback f24394b;
    public final int f24395c;

    public a0(int i10, int i11, Utilities.Callback callback) {
        this.f24393a = i11;
        this.f24394b = callback;
        this.f24395c = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f24393a) {
            case 0:
                this.f24394b.run(Integer.valueOf(this.f24395c));
                return;
            default:
                Utilities.Callback callback = this.f24394b;
                if (callback != null) {
                    callback.run(Integer.valueOf(this.f24395c));
                    return;
                }
                return;
        }
    }
}
