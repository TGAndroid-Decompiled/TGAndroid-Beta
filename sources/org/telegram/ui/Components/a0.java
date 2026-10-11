package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class a0 implements View.OnClickListener {
    public final int f24417a;
    public final Utilities.Callback f24418b;
    public final int f24419c;

    public a0(int i10, int i11, Utilities.Callback callback) {
        this.f24417a = i11;
        this.f24418b = callback;
        this.f24419c = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f24417a) {
            case 0:
                this.f24418b.run(Integer.valueOf(this.f24419c));
                return;
            default:
                Utilities.Callback callback = this.f24418b;
                if (callback != null) {
                    callback.run(Integer.valueOf(this.f24419c));
                    return;
                }
                return;
        }
    }
}
