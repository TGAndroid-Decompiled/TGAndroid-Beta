package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class ss0 implements Utilities.Callback {
    public final int f32670a;
    public final bw0 f32671b;

    public ss0(bw0 bw0Var, int i10) {
        this.f32670a = i10;
        this.f32671b = bw0Var;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f32670a;
        bw0 bw0Var = this.f32671b;
        di.a7 a7Var = (di.a7) obj;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new u90(18, bw0Var, a7Var), 100L);
                return;
            default:
                int[] iArr = bw0.f26922p2;
                AndroidUtilities.runOnUIThread(new u90(18, bw0Var, a7Var), 100L);
                return;
        }
    }
}
