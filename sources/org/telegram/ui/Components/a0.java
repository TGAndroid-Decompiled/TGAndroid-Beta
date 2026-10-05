package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class a0 implements View.OnClickListener {
    public final int f24394a;
    public final Utilities.Callback f24395b;
    public final int f24396c;

    public a0(int i10, int i11, Utilities.Callback callback) {
        this.f24394a = i11;
        this.f24395b = callback;
        this.f24396c = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f24394a) {
            case 0:
                this.f24395b.run(Integer.valueOf(this.f24396c));
                return;
            default:
                Utilities.Callback callback = this.f24395b;
                if (callback != null) {
                    callback.run(Integer.valueOf(this.f24396c));
                    return;
                }
                return;
        }
    }
}
