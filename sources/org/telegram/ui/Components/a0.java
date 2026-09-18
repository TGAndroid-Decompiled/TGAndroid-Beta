package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class a0 implements View.OnClickListener {
    public final int f22259a;
    public final Utilities.Callback f22260b;
    public final int f22261c;

    public a0(int i10, int i11, Utilities.Callback callback) {
        this.f22259a = i11;
        this.f22260b = callback;
        this.f22261c = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f22259a) {
            case 0:
                this.f22260b.run(Integer.valueOf(this.f22261c));
                return;
            default:
                Utilities.Callback callback = this.f22260b;
                if (callback != null) {
                    callback.run(Integer.valueOf(this.f22261c));
                    return;
                }
                return;
        }
    }
}
