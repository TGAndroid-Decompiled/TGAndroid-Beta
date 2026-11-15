package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class wc implements DialogInterface.OnDismissListener {
    public final int f41325a;
    public final ChatActivityEnterView f41326b;

    public wc(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.f41325a = i7;
        this.f41326b = chatActivityEnterView;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f41325a) {
            case 0:
                this.f41326b.M0 = null;
                return;
            default:
                this.f41326b.M0 = null;
                return;
        }
    }
}
