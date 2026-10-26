package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class a0 implements View.OnClickListener {
    public final int f26369a;
    public final Utilities.Callback f26370b;
    public final int f26371c;

    public a0(int i10, int i11, Utilities.Callback callback) {
        this.f26369a = i11;
        this.f26370b = callback;
        this.f26371c = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f26369a) {
            case 0:
                this.f26370b.run(Integer.valueOf(this.f26371c));
                return;
            default:
                Utilities.Callback callback = this.f26370b;
                if (callback != null) {
                    callback.run(Integer.valueOf(this.f26371c));
                    return;
                }
                return;
        }
    }
}
