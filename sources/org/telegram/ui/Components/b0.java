package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class b0 implements View.OnClickListener {
    public final int f24482a;
    public final Utilities.Callback f24483b;
    public final int f24484c;

    public b0(int i10, int i11, Utilities.Callback callback) {
        this.f24482a = i11;
        this.f24483b = callback;
        this.f24484c = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f24482a) {
            case 0:
                this.f24483b.run(Integer.valueOf(this.f24484c));
                return;
            default:
                Utilities.Callback callback = this.f24483b;
                if (callback != null) {
                    callback.run(Integer.valueOf(this.f24484c));
                    return;
                }
                return;
        }
    }
}
