package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class a0 implements View.OnClickListener {
    public final int f22454a;
    public final Utilities.Callback f22455b;
    public final int f22456c;

    public a0(int i10, int i11, Utilities.Callback callback) {
        this.f22454a = i11;
        this.f22455b = callback;
        this.f22456c = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f22454a) {
            case 0:
                this.f22455b.run(Integer.valueOf(this.f22456c));
                return;
            default:
                Utilities.Callback callback = this.f22455b;
                if (callback != null) {
                    callback.run(Integer.valueOf(this.f22456c));
                    return;
                }
                return;
        }
    }
}
