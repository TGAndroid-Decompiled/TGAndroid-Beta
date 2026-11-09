package org.telegram.ui.Components;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.LaunchActivity;
public final class w2 implements Runnable {
    public final int f39877a = 1;
    public final int f39878b;
    public final int[] f39879c;
    public final Runnable d;

    public w2(int i7, int[] iArr, org.telegram.ui.s10 s10Var) {
        this.f39878b = i7;
        this.f39879c = iArr;
        this.d = s10Var;
    }

    @Override
    public final void run() {
        int i7 = this.f39877a;
        Runnable runnable = this.d;
        int[] iArr = this.f39879c;
        int i10 = this.f39878b;
        switch (i7) {
            case 0:
                iArr[0] = i10;
                runnable.run();
                return;
            default:
                String str = LaunchActivity.B1;
                ConnectionsManager.getInstance(i10).cancelRequest(iArr[0], true);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    public w2(int[] iArr, int i7, Runnable runnable) {
        this.f39879c = iArr;
        this.f39878b = i7;
        this.d = runnable;
    }
}
