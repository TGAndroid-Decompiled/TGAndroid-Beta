package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class a0 implements View.OnClickListener {
    public final int f22470a;
    public final Utilities.Callback f22471b;
    public final int f22472c;

    public a0(int i10, int i11, Utilities.Callback callback) {
        this.f22470a = i11;
        this.f22471b = callback;
        this.f22472c = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f22470a) {
            case 0:
                this.f22471b.run(Integer.valueOf(this.f22472c));
                return;
            default:
                Utilities.Callback callback = this.f22471b;
                if (callback != null) {
                    callback.run(Integer.valueOf(this.f22472c));
                    return;
                }
                return;
        }
    }
}
