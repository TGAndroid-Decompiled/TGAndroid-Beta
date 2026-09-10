package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class c0 implements View.OnClickListener {
    public final int f21928a;
    public final Utilities.Callback f21929b;
    public final int f21930c;

    public c0(int i10, int i11, Utilities.Callback callback) {
        this.f21928a = i11;
        this.f21929b = callback;
        this.f21930c = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f21928a) {
            case 0:
                this.f21929b.run(Integer.valueOf(this.f21930c));
                return;
            default:
                Utilities.Callback callback = this.f21929b;
                if (callback != null) {
                    callback.run(Integer.valueOf(this.f21930c));
                    return;
                }
                return;
        }
    }
}
