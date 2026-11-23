package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class gd implements DialogInterface.OnDismissListener {
    public final int f35503a;
    public final ChatActivityEnterView f35504b;

    public gd(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.f35503a = i7;
        this.f35504b = chatActivityEnterView;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f35503a) {
            case 0:
                this.f35504b.M0 = null;
                return;
            default:
                this.f35504b.M0 = null;
                return;
        }
    }
}
