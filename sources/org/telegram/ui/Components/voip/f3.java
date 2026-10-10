package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
public final class f3 implements Runnable {
    public final int f32000a;
    public final k3 f32001b;
    public final int f32002c;

    public f3(k3 k3Var, int i10, int i11) {
        this.f32000a = i11;
        this.f32001b = k3Var;
        this.f32002c = i10;
    }

    @Override
    public final void run() {
        switch (this.f32000a) {
            case 0:
                AndroidUtilities.runOnUIThread(new f3(this.f32001b, this.f32002c, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new f3(this.f32001b, this.f32002c, 3));
                return;
            case 2:
                this.f32001b.c(this.f32002c);
                return;
            default:
                this.f32001b.a(this.f32002c);
                return;
        }
    }
}
