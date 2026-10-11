package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class a0 implements View.OnClickListener {
    public final int f24381a;
    public final Utilities.Callback f24382b;
    public final int f24383c;

    public a0(int i10, int i11, Utilities.Callback callback) {
        this.f24381a = i11;
        this.f24382b = callback;
        this.f24383c = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f24381a) {
            case 0:
                this.f24382b.run(Integer.valueOf(this.f24383c));
                return;
            default:
                Utilities.Callback callback = this.f24382b;
                if (callback != null) {
                    callback.run(Integer.valueOf(this.f24383c));
                    return;
                }
                return;
        }
    }
}
