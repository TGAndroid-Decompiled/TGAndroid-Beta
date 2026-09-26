package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class a0 implements View.OnClickListener {
    public final int f22468a;
    public final Utilities.Callback f22469b;
    public final int f22470c;

    public a0(int i10, int i11, Utilities.Callback callback) {
        this.f22468a = i11;
        this.f22469b = callback;
        this.f22470c = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f22468a) {
            case 0:
                this.f22469b.run(Integer.valueOf(this.f22470c));
                return;
            default:
                Utilities.Callback callback = this.f22469b;
                if (callback != null) {
                    callback.run(Integer.valueOf(this.f22470c));
                    return;
                }
                return;
        }
    }
}
