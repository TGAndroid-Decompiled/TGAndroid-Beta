package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class a0 implements View.OnClickListener {
    public final int f23365a;
    public final Utilities.Callback f23366b;
    public final int f23367c;

    public a0(int i10, int i11, Utilities.Callback callback) {
        this.f23365a = i11;
        this.f23366b = callback;
        this.f23367c = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f23365a) {
            case 0:
                this.f23366b.run(Integer.valueOf(this.f23367c));
                return;
            default:
                Utilities.Callback callback = this.f23366b;
                if (callback != null) {
                    callback.run(Integer.valueOf(this.f23367c));
                    return;
                }
                return;
        }
    }
}
