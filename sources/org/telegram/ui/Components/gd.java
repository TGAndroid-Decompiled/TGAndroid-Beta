package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class gd implements DialogInterface.OnDismissListener {
    public final int f35522a;
    public final ChatActivityEnterView f35523b;

    public gd(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.f35522a = i7;
        this.f35523b = chatActivityEnterView;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f35522a) {
            case 0:
                this.f35523b.M0 = null;
                return;
            default:
                this.f35523b.M0 = null;
                return;
        }
    }
}
