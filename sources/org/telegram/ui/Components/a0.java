package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class a0 implements View.OnClickListener {
    public final int f24386a;
    public final Utilities.Callback f24387b;
    public final int f24388c;

    public a0(int i10, int i11, Utilities.Callback callback) {
        this.f24386a = i11;
        this.f24387b = callback;
        this.f24388c = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f24386a) {
            case 0:
                this.f24387b.run(Integer.valueOf(this.f24388c));
                return;
            default:
                Utilities.Callback callback = this.f24387b;
                if (callback != null) {
                    callback.run(Integer.valueOf(this.f24388c));
                    return;
                }
                return;
        }
    }
}
