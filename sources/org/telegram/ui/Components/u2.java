package org.telegram.ui.Components;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.LaunchActivity;
public final class u2 implements Runnable {
    public final int f38614a = 1;
    public final int f38615b;
    public final int[] f38616c;
    public final Runnable d;

    public u2(int i3, int[] iArr, org.telegram.ui.ly lyVar) {
        this.f38615b = i3;
        this.f38616c = iArr;
        this.d = lyVar;
    }

    @Override
    public final void run() {
        int i3 = this.f38614a;
        Runnable runnable = this.d;
        int[] iArr = this.f38616c;
        int i10 = this.f38615b;
        switch (i3) {
            case 0:
                iArr[0] = i10;
                runnable.run();
                return;
            default:
                String str = LaunchActivity.E1;
                ConnectionsManager.getInstance(i10).cancelRequest(iArr[0], true);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    public u2(int[] iArr, int i3, Runnable runnable) {
        this.f38616c = iArr;
        this.f38615b = i3;
        this.d = runnable;
    }
}
