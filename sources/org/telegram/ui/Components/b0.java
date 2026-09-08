package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class b0 implements View.OnClickListener {
    public final int f24508a;
    public final Utilities.Callback f24509b;
    public final int f24510c;

    public b0(int i10, int i11, Utilities.Callback callback) {
        this.f24508a = i11;
        this.f24509b = callback;
        this.f24510c = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f24508a) {
            case 0:
                this.f24509b.run(Integer.valueOf(this.f24510c));
                return;
            default:
                Utilities.Callback callback = this.f24509b;
                if (callback != null) {
                    callback.run(Integer.valueOf(this.f24510c));
                    return;
                }
                return;
        }
    }
}
