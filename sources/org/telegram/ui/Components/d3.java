package org.telegram.ui.Components;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.LaunchActivity;
public final class d3 implements Runnable {
    public final int f34325a = 1;
    public final int f34326b;
    public final int[] f34327c;
    public final Runnable d;

    public d3(int i7, int[] iArr, org.telegram.ui.o60 o60Var) {
        this.f34326b = i7;
        this.f34327c = iArr;
        this.d = o60Var;
    }

    @Override
    public final void run() {
        int i7 = this.f34325a;
        Runnable runnable = this.d;
        int[] iArr = this.f34327c;
        int i10 = this.f34326b;
        switch (i7) {
            case 0:
                iArr[0] = i10;
                runnable.run();
                return;
            default:
                String str = LaunchActivity.C1;
                ConnectionsManager.getInstance(i10).cancelRequest(iArr[0], true);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    public d3(int[] iArr, int i7, Runnable runnable) {
        this.f34327c = iArr;
        this.f34326b = i7;
        this.d = runnable;
    }
}
