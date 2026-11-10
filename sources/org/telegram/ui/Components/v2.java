package org.telegram.ui.Components;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.LaunchActivity;
public final class v2 implements Runnable {
    public final int f38818a = 1;
    public final int f38819b;
    public final int[] f38820c;
    public final Runnable d;

    public v2(int i7, int[] iArr, org.telegram.ui.f10 f10Var) {
        this.f38819b = i7;
        this.f38820c = iArr;
        this.d = f10Var;
    }

    @Override
    public final void run() {
        int i7 = this.f38818a;
        Runnable runnable = this.d;
        int[] iArr = this.f38820c;
        int i10 = this.f38819b;
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

    public v2(int[] iArr, int i7, Runnable runnable) {
        this.f38820c = iArr;
        this.f38819b = i7;
        this.d = runnable;
    }
}
