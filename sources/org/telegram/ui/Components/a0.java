package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class a0 implements View.OnClickListener {
    public final int f22432a;
    public final Utilities.Callback f22433b;
    public final int f22434c;

    public a0(int i10, int i11, Utilities.Callback callback) {
        this.f22432a = i11;
        this.f22433b = callback;
        this.f22434c = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f22432a) {
            case 0:
                this.f22433b.run(Integer.valueOf(this.f22434c));
                return;
            default:
                Utilities.Callback callback = this.f22433b;
                if (callback != null) {
                    callback.run(Integer.valueOf(this.f22434c));
                    return;
                }
                return;
        }
    }
}
