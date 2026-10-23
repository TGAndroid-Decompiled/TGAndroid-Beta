package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class a0 implements View.OnClickListener {
    public final int f24428a;
    public final Utilities.Callback f24429b;
    public final int f24430c;

    public a0(int i10, int i11, Utilities.Callback callback) {
        this.f24428a = i11;
        this.f24429b = callback;
        this.f24430c = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f24428a) {
            case 0:
                this.f24429b.run(Integer.valueOf(this.f24430c));
                return;
            default:
                Utilities.Callback callback = this.f24429b;
                if (callback != null) {
                    callback.run(Integer.valueOf(this.f24430c));
                    return;
                }
                return;
        }
    }
}
