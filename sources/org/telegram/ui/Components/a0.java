package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class a0 implements View.OnClickListener {
    public final int f22246a;
    public final Utilities.Callback f22247b;
    public final int f22248c;

    public a0(int i10, int i11, Utilities.Callback callback) {
        this.f22246a = i11;
        this.f22247b = callback;
        this.f22248c = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f22246a) {
            case 0:
                this.f22247b.run(Integer.valueOf(this.f22248c));
                return;
            default:
                Utilities.Callback callback = this.f22247b;
                if (callback != null) {
                    callback.run(Integer.valueOf(this.f22248c));
                    return;
                }
                return;
        }
    }
}
