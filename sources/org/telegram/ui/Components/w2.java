package org.telegram.ui.Components;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.LaunchActivity;
public final class w2 implements Runnable {
    public final int f39781a = 1;
    public final int f39782b;
    public final int[] f39783c;
    public final Runnable d;

    public w2(int i7, int[] iArr, org.telegram.ui.q10 q10Var) {
        this.f39782b = i7;
        this.f39783c = iArr;
        this.d = q10Var;
    }

    @Override
    public final void run() {
        int i7 = this.f39781a;
        Runnable runnable = this.d;
        int[] iArr = this.f39783c;
        int i10 = this.f39782b;
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
        this.f39783c = iArr;
        this.f39782b = i7;
        this.d = runnable;
    }
}
