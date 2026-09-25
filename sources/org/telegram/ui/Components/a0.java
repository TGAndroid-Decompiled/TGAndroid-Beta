package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class a0 implements View.OnClickListener {
    public final int f22469a;
    public final Utilities.Callback f22470b;
    public final int f22471c;

    public a0(int i10, int i11, Utilities.Callback callback) {
        this.f22469a = i11;
        this.f22470b = callback;
        this.f22471c = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f22469a) {
            case 0:
                this.f22470b.run(Integer.valueOf(this.f22471c));
                return;
            default:
                Utilities.Callback callback = this.f22470b;
                if (callback != null) {
                    callback.run(Integer.valueOf(this.f22471c));
                    return;
                }
                return;
        }
    }
}
