package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class s80 implements Runnable {
    public final int f26974a;
    public final u80 f26975b;
    public final boolean f26976c;

    public s80(u80 u80Var, boolean z10, int i10) {
        this.f26974a = i10;
        this.f26975b = u80Var;
        this.f26976c = z10;
    }

    @Override
    public final void run() {
        switch (this.f26974a) {
            case 0:
                AndroidUtilities.runOnUIThread(new s80(this.f26975b, this.f26976c, 1));
                return;
            default:
                this.f26975b.setJoinRequest(this.f26976c);
                return;
        }
    }
}
