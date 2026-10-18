package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class a0 implements View.OnClickListener {
    public final int f24420a;
    public final Utilities.Callback f24421b;
    public final int f24422c;

    public a0(int i10, int i11, Utilities.Callback callback) {
        this.f24420a = i11;
        this.f24421b = callback;
        this.f24422c = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f24420a) {
            case 0:
                this.f24421b.run(Integer.valueOf(this.f24422c));
                return;
            default:
                Utilities.Callback callback = this.f24421b;
                if (callback != null) {
                    callback.run(Integer.valueOf(this.f24422c));
                    return;
                }
                return;
        }
    }
}
