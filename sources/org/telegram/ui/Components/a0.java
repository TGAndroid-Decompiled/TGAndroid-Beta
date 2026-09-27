package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class a0 implements View.OnClickListener {
    public final int f22471a;
    public final Utilities.Callback f22472b;
    public final int f22473c;

    public a0(int i10, int i11, Utilities.Callback callback) {
        this.f22471a = i11;
        this.f22472b = callback;
        this.f22473c = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f22471a) {
            case 0:
                this.f22472b.run(Integer.valueOf(this.f22473c));
                return;
            default:
                Utilities.Callback callback = this.f22472b;
                if (callback != null) {
                    callback.run(Integer.valueOf(this.f22473c));
                    return;
                }
                return;
        }
    }
}
