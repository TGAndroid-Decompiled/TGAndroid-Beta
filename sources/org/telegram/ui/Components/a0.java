package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class a0 implements View.OnClickListener {
    public final int f24423a;
    public final Utilities.Callback f24424b;
    public final int f24425c;

    public a0(int i10, int i11, Utilities.Callback callback) {
        this.f24423a = i11;
        this.f24424b = callback;
        this.f24425c = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f24423a) {
            case 0:
                this.f24424b.run(Integer.valueOf(this.f24425c));
                return;
            default:
                Utilities.Callback callback = this.f24424b;
                if (callback != null) {
                    callback.run(Integer.valueOf(this.f24425c));
                    return;
                }
                return;
        }
    }
}
