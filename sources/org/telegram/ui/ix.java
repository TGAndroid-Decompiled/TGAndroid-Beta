package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ix {
    public final int f37508a;
    public final jx f37509b;
    public final View f37510c;

    public ix(jx jxVar, View view, int i10) {
        this.f37508a = i10;
        this.f37509b = jxVar;
        this.f37510c = view;
    }

    public final void a(boolean z10) {
        switch (this.f37508a) {
            case 0:
                View view = this.f37510c;
                if (view instanceof ai.a0) {
                    this.f37509b.O0.E0.i((ai.a0) view, false);
                    if (z10) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.uh(17), 500L);
                        return;
                    }
                    return;
                }
                return;
            default:
                View view2 = this.f37510c;
                if (view2 instanceof ai.a0) {
                    this.f37509b.O0.E0.i((ai.a0) view2, false);
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
