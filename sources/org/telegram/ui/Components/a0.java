package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class a0 implements View.OnClickListener {
    public final int f26371a;
    public final Utilities.Callback f26372b;
    public final int f26373c;

    public a0(int i10, int i11, Utilities.Callback callback) {
        this.f26371a = i11;
        this.f26372b = callback;
        this.f26373c = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f26371a) {
            case 0:
                this.f26372b.run(Integer.valueOf(this.f26373c));
                return;
            default:
                Utilities.Callback callback = this.f26372b;
                if (callback != null) {
                    callback.run(Integer.valueOf(this.f26373c));
                    return;
                }
                return;
        }
    }
}
