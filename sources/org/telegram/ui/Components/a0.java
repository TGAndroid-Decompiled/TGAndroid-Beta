package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class a0 implements View.OnClickListener {
    public final int f24421a;
    public final Utilities.Callback f24422b;
    public final int f24423c;

    public a0(int i10, int i11, Utilities.Callback callback) {
        this.f24421a = i11;
        this.f24422b = callback;
        this.f24423c = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f24421a) {
            case 0:
                this.f24422b.run(Integer.valueOf(this.f24423c));
                return;
            default:
                Utilities.Callback callback = this.f24422b;
                if (callback != null) {
                    callback.run(Integer.valueOf(this.f24423c));
                    return;
                }
                return;
        }
    }
}
