package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class a0 implements View.OnClickListener {
    public final int f22467a;
    public final Utilities.Callback f22468b;
    public final int f22469c;

    public a0(int i10, int i11, Utilities.Callback callback) {
        this.f22467a = i11;
        this.f22468b = callback;
        this.f22469c = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f22467a) {
            case 0:
                this.f22468b.run(Integer.valueOf(this.f22469c));
                return;
            default:
                Utilities.Callback callback = this.f22468b;
                if (callback != null) {
                    callback.run(Integer.valueOf(this.f22469c));
                    return;
                }
                return;
        }
    }
}
