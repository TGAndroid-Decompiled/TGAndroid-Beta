package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class a0 implements View.OnClickListener {
    public final int f24577a;
    public final Utilities.Callback f24578b;
    public final int f24579c;

    public a0(int i10, int i11, Utilities.Callback callback) {
        this.f24577a = i11;
        this.f24578b = callback;
        this.f24579c = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f24577a) {
            case 0:
                this.f24578b.run(Integer.valueOf(this.f24579c));
                return;
            default:
                Utilities.Callback callback = this.f24578b;
                if (callback != null) {
                    callback.run(Integer.valueOf(this.f24579c));
                    return;
                }
                return;
        }
    }
}
