package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class a0 implements View.OnClickListener {
    public final int f22256a;
    public final Utilities.Callback f22257b;
    public final int f22258c;

    public a0(int i10, int i11, Utilities.Callback callback) {
        this.f22256a = i11;
        this.f22257b = callback;
        this.f22258c = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f22256a) {
            case 0:
                this.f22257b.run(Integer.valueOf(this.f22258c));
                return;
            default:
                Utilities.Callback callback = this.f22257b;
                if (callback != null) {
                    callback.run(Integer.valueOf(this.f22258c));
                    return;
                }
                return;
        }
    }
}
