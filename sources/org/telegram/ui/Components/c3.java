package org.telegram.ui.Components;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.LaunchActivity;
public final class c3 implements Runnable {
    public final int f33865a = 1;
    public final int f33866b;
    public final int[] f33867c;
    public final Runnable d;

    public c3(int i7, int[] iArr, org.telegram.ui.n60 n60Var) {
        this.f33866b = i7;
        this.f33867c = iArr;
        this.d = n60Var;
    }

    @Override
    public final void run() {
        int i7 = this.f33865a;
        Runnable runnable = this.d;
        int[] iArr = this.f33867c;
        int i10 = this.f33866b;
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

    public c3(int[] iArr, int i7, Runnable runnable) {
        this.f33867c = iArr;
        this.f33866b = i7;
        this.d = runnable;
    }
}
