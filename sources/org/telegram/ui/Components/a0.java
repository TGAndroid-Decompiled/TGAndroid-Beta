package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class a0 implements View.OnClickListener {
    public final int f22483a;
    public final Utilities.Callback f22484b;
    public final int f22485c;

    public a0(int i10, int i11, Utilities.Callback callback) {
        this.f22483a = i11;
        this.f22484b = callback;
        this.f22485c = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f22483a) {
            case 0:
                this.f22484b.run(Integer.valueOf(this.f22485c));
                return;
            default:
                Utilities.Callback callback = this.f22484b;
                if (callback != null) {
                    callback.run(Integer.valueOf(this.f22485c));
                    return;
                }
                return;
        }
    }
}
