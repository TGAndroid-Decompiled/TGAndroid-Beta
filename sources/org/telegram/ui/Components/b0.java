package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class b0 implements View.OnClickListener {
    public final int f24481a;
    public final Utilities.Callback f24482b;
    public final int f24483c;

    public b0(int i10, int i11, Utilities.Callback callback) {
        this.f24481a = i11;
        this.f24482b = callback;
        this.f24483c = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f24481a) {
            case 0:
                this.f24482b.run(Integer.valueOf(this.f24483c));
                return;
            default:
                Utilities.Callback callback = this.f24482b;
                if (callback != null) {
                    callback.run(Integer.valueOf(this.f24483c));
                    return;
                }
                return;
        }
    }
}
