package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class a0 implements View.OnClickListener {
    public final int f24391a;
    public final Utilities.Callback f24392b;
    public final int f24393c;

    public a0(int i10, int i11, Utilities.Callback callback) {
        this.f24391a = i11;
        this.f24392b = callback;
        this.f24393c = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f24391a) {
            case 0:
                this.f24392b.run(Integer.valueOf(this.f24393c));
                return;
            default:
                Utilities.Callback callback = this.f24392b;
                if (callback != null) {
                    callback.run(Integer.valueOf(this.f24393c));
                    return;
                }
                return;
        }
    }
}
