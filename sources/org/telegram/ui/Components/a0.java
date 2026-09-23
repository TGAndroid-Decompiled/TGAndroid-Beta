package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class a0 implements View.OnClickListener {
    public final int f22217a;
    public final Utilities.Callback f22218b;
    public final int f22219c;

    public a0(int i10, int i11, Utilities.Callback callback) {
        this.f22217a = i11;
        this.f22218b = callback;
        this.f22219c = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f22217a) {
            case 0:
                this.f22218b.run(Integer.valueOf(this.f22219c));
                return;
            default:
                Utilities.Callback callback = this.f22218b;
                if (callback != null) {
                    callback.run(Integer.valueOf(this.f22219c));
                    return;
                }
                return;
        }
    }
}
