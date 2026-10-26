package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class rs0 implements Utilities.Callback {
    public final int f32321a;
    public final aw0 f32322b;

    public rs0(aw0 aw0Var, int i10) {
        this.f32321a = i10;
        this.f32322b = aw0Var;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f32321a;
        aw0 aw0Var = this.f32322b;
        di.a7 a7Var = (di.a7) obj;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new t90(18, aw0Var, a7Var), 100L);
                return;
            default:
                int[] iArr = aw0.f26634p2;
                AndroidUtilities.runOnUIThread(new t90(18, aw0Var, a7Var), 100L);
                return;
        }
    }
}
