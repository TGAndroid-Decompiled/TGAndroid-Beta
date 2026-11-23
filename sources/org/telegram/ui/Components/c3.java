package org.telegram.ui.Components;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.LaunchActivity;
public final class c3 implements Runnable {
    public final int f33905a = 1;
    public final int f33906b;
    public final int[] f33907c;
    public final Runnable d;

    public c3(int i7, int[] iArr, org.telegram.ui.i50 i50Var) {
        this.f33906b = i7;
        this.f33907c = iArr;
        this.d = i50Var;
    }

    @Override
    public final void run() {
        int i7 = this.f33905a;
        Runnable runnable = this.d;
        int[] iArr = this.f33907c;
        int i10 = this.f33906b;
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
        this.f33907c = iArr;
        this.f33906b = i7;
        this.d = runnable;
    }
}
