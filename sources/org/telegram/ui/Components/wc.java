package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class wc implements DialogInterface.OnDismissListener {
    public final int f41328a;
    public final ChatActivityEnterView f41329b;

    public wc(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.f41328a = i7;
        this.f41329b = chatActivityEnterView;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f41328a) {
            case 0:
                this.f41329b.M0 = null;
                return;
            default:
                this.f41329b.M0 = null;
                return;
        }
    }
}
