package org.telegram.ui.Components;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.LaunchActivity;
public final class d3 implements Runnable {
    public final int f34367a = 1;
    public final int f34368b;
    public final int[] f34369c;
    public final Runnable d;

    public d3(int i7, int[] iArr, org.telegram.ui.h60 h60Var) {
        this.f34368b = i7;
        this.f34369c = iArr;
        this.d = h60Var;
    }

    @Override
    public final void run() {
        int i7 = this.f34367a;
        Runnable runnable = this.d;
        int[] iArr = this.f34369c;
        int i10 = this.f34368b;
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
        this.f34369c = iArr;
        this.f34368b = i7;
        this.d = runnable;
    }
}
