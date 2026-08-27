package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;

public final class e3 implements Runnable {

    public final int f33549a;

    public final j3 f33550b;

    public final int f33551c;

    public e3(j3 j3Var, int i10, int i11) {
        this.f33549a = i11;
        this.f33550b = j3Var;
        this.f33551c = i10;
    }

    @Override
    public final void run() {
        switch (this.f33549a) {
            case 0:
                AndroidUtilities.runOnUIThread(new e3(this.f33550b, this.f33551c, 2));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new e3(this.f33550b, this.f33551c, 3));
                break;
            case 2:
                this.f33550b.c(this.f33551c);
                break;
            default:
                this.f33550b.a(this.f33551c);
                break;
        }
    }
}
