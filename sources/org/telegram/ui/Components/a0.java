package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class a0 implements View.OnClickListener {
    public final int f23065a;
    public final Utilities.Callback f23066b;
    public final int f23067c;

    public a0(int i10, int i11, Utilities.Callback callback) {
        this.f23065a = i11;
        this.f23066b = callback;
        this.f23067c = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f23065a) {
            case 0:
                this.f23066b.run(Integer.valueOf(this.f23067c));
                return;
            default:
                Utilities.Callback callback = this.f23066b;
                if (callback != null) {
                    callback.run(Integer.valueOf(this.f23067c));
                    return;
                }
                return;
        }
    }
}
