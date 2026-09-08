package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
public final class kh implements DialogInterface.OnCancelListener {
    public final int f27851a;
    public final KeyEvent.Callback f27852b;

    public kh(KeyEvent.Callback callback, int i10) {
        this.f27851a = i10;
        this.f27852b = callback;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f27851a) {
            case 0:
                vi.p((vi) this.f27852b);
                return;
            default:
                ((View) this.f27852b).setTag(null);
                return;
        }
    }
}
