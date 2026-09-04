package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
public final class kh implements DialogInterface.OnCancelListener {
    public final int f27824a;
    public final KeyEvent.Callback f27825b;

    public kh(KeyEvent.Callback callback, int i10) {
        this.f27824a = i10;
        this.f27825b = callback;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f27824a) {
            case 0:
                vi.p((vi) this.f27825b);
                return;
            default:
                ((View) this.f27825b).setTag(null);
                return;
        }
    }
}
