package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class a0 implements View.OnClickListener {
    public final int f24167a;
    public final Utilities.Callback f24168b;
    public final int f24169c;

    public a0(int i10, int i11, Utilities.Callback callback) {
        this.f24167a = i11;
        this.f24168b = callback;
        this.f24169c = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f24167a) {
            case 0:
                this.f24168b.run(Integer.valueOf(this.f24169c));
                return;
            default:
                Utilities.Callback callback = this.f24168b;
                if (callback != null) {
                    callback.run(Integer.valueOf(this.f24169c));
                    return;
                }
                return;
        }
    }
}
