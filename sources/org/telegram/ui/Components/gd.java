package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class gd implements DialogInterface.OnDismissListener {
    public final int f35404a;
    public final ChatActivityEnterView f35405b;

    public gd(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.f35404a = i7;
        this.f35405b = chatActivityEnterView;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f35404a) {
            case 0:
                this.f35405b.M0 = null;
                return;
            default:
                this.f35405b.M0 = null;
                return;
        }
    }
}
