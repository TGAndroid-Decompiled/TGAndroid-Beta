package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class a0 implements View.OnClickListener {
    public final int f24424a;
    public final Utilities.Callback f24425b;
    public final int f24426c;

    public a0(int i10, int i11, Utilities.Callback callback) {
        this.f24424a = i11;
        this.f24425b = callback;
        this.f24426c = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f24424a) {
            case 0:
                this.f24425b.run(Integer.valueOf(this.f24426c));
                return;
            default:
                Utilities.Callback callback = this.f24425b;
                if (callback != null) {
                    callback.run(Integer.valueOf(this.f24426c));
                    return;
                }
                return;
        }
    }
}
