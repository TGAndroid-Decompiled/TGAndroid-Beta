package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class a0 implements View.OnClickListener {
    public final int f24576a;
    public final Utilities.Callback f24577b;
    public final int f24578c;

    public a0(int i10, int i11, Utilities.Callback callback) {
        this.f24576a = i11;
        this.f24577b = callback;
        this.f24578c = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f24576a) {
            case 0:
                this.f24577b.run(Integer.valueOf(this.f24578c));
                return;
            default:
                Utilities.Callback callback = this.f24577b;
                if (callback != null) {
                    callback.run(Integer.valueOf(this.f24578c));
                    return;
                }
                return;
        }
    }
}
