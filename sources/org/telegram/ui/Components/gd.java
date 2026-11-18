package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class gd implements DialogInterface.OnDismissListener {
    public final int f35475a;
    public final ChatActivityEnterView f35476b;

    public gd(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.f35475a = i7;
        this.f35476b = chatActivityEnterView;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f35475a) {
            case 0:
                this.f35476b.M0 = null;
                return;
            default:
                this.f35476b.M0 = null;
                return;
        }
    }
}
