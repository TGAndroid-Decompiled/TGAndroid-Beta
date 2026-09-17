package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class b0 implements View.OnClickListener {
    public final int f24509a;
    public final Utilities.Callback f24510b;
    public final int f24511c;

    public b0(int i10, int i11, Utilities.Callback callback) {
        this.f24509a = i11;
        this.f24510b = callback;
        this.f24511c = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f24509a) {
            case 0:
                this.f24510b.run(Integer.valueOf(this.f24511c));
                return;
            default:
                Utilities.Callback callback = this.f24510b;
                if (callback != null) {
                    callback.run(Integer.valueOf(this.f24511c));
                    return;
                }
                return;
        }
    }
}
