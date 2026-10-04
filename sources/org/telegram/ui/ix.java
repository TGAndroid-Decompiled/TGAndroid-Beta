package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ix {
    public final int f37509a;
    public final jx f37510b;
    public final View f37511c;

    public ix(jx jxVar, View view, int i10) {
        this.f37509a = i10;
        this.f37510b = jxVar;
        this.f37511c = view;
    }

    public final void a(boolean z10) {
        switch (this.f37509a) {
            case 0:
                View view = this.f37511c;
                if (view instanceof ai.a0) {
                    this.f37510b.O0.E0.i((ai.a0) view, false);
                    if (z10) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.uh(17), 500L);
                        return;
                    }
                    return;
                }
                return;
            default:
                View view2 = this.f37511c;
                if (view2 instanceof ai.a0) {
                    this.f37510b.O0.E0.i((ai.a0) view2, false);
                    if (z10) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.uh(17), 500L);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
