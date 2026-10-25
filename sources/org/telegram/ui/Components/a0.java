package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class a0 implements View.OnClickListener {
    public final int f26367a;
    public final Utilities.Callback f26368b;
    public final int f26369c;

    public a0(int i10, int i11, Utilities.Callback callback) {
        this.f26367a = i11;
        this.f26368b = callback;
        this.f26369c = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f26367a) {
            case 0:
                this.f26368b.run(Integer.valueOf(this.f26369c));
                return;
            default:
                Utilities.Callback callback = this.f26368b;
                if (callback != null) {
                    callback.run(Integer.valueOf(this.f26369c));
                    return;
                }
                return;
        }
    }
}
