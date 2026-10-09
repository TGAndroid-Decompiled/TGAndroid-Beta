package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class a0 implements View.OnClickListener {
    public final int f24389a;
    public final Utilities.Callback f24390b;
    public final int f24391c;

    public a0(int i10, int i11, Utilities.Callback callback) {
        this.f24389a = i11;
        this.f24390b = callback;
        this.f24391c = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f24389a) {
            case 0:
                this.f24390b.run(Integer.valueOf(this.f24391c));
                return;
            default:
                Utilities.Callback callback = this.f24390b;
                if (callback != null) {
                    callback.run(Integer.valueOf(this.f24391c));
                    return;
                }
                return;
        }
    }
}
