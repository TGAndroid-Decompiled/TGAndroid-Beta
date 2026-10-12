package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class a0 implements View.OnClickListener {
    public final int f24166a;
    public final Utilities.Callback f24167b;
    public final int f24168c;

    public a0(int i10, int i11, Utilities.Callback callback) {
        this.f24166a = i11;
        this.f24167b = callback;
        this.f24168c = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f24166a) {
            case 0:
                this.f24167b.run(Integer.valueOf(this.f24168c));
                return;
            default:
                Utilities.Callback callback = this.f24167b;
                if (callback != null) {
                    callback.run(Integer.valueOf(this.f24168c));
                    return;
                }
                return;
        }
    }
}
