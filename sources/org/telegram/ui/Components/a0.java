package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class a0 implements View.OnClickListener {
    public final int f24427a;
    public final Utilities.Callback f24428b;
    public final int f24429c;

    public a0(int i10, int i11, Utilities.Callback callback) {
        this.f24427a = i11;
        this.f24428b = callback;
        this.f24429c = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f24427a) {
            case 0:
                this.f24428b.run(Integer.valueOf(this.f24429c));
                return;
            default:
                Utilities.Callback callback = this.f24428b;
                if (callback != null) {
                    callback.run(Integer.valueOf(this.f24429c));
                    return;
                }
                return;
        }
    }
}
