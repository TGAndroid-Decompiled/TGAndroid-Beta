package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class a0 implements View.OnClickListener {
    public final int f24387a;
    public final Utilities.Callback f24388b;
    public final int f24389c;

    public a0(int i10, int i11, Utilities.Callback callback) {
        this.f24387a = i11;
        this.f24388b = callback;
        this.f24389c = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f24387a) {
            case 0:
                this.f24388b.run(Integer.valueOf(this.f24389c));
                return;
            default:
                Utilities.Callback callback = this.f24388b;
                if (callback != null) {
                    callback.run(Integer.valueOf(this.f24389c));
                    return;
                }
                return;
        }
    }
}
