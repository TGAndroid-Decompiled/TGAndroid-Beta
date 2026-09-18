package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class j80 implements Runnable {
    public final int f25178a;
    public final k80 f25179b;
    public final boolean f25180c;
    public final boolean d;

    public j80(k80 k80Var, boolean z10, boolean z11, int i10) {
        this.f25178a = i10;
        this.f25179b = k80Var;
        this.f25180c = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f25178a) {
            case 0:
                AndroidUtilities.runOnUIThread(new j80(this.f25179b, this.f25180c, this.d, 1));
                return;
            default:
                k80 k80Var = this.f25179b;
                k80Var.setJoinRequest(this.f25180c);
                k80Var.setJoinToSend(this.d);
                return;
        }
    }
}
