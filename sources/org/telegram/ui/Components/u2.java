package org.telegram.ui.Components;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.LaunchActivity;
public final class u2 implements Runnable {
    public final int f39870a = 1;
    public final int f39871b;
    public final int[] f39872c;
    public final Runnable d;

    public u2(int i7, int[] iArr, org.telegram.ui.g50 g50Var) {
        this.f39871b = i7;
        this.f39872c = iArr;
        this.d = g50Var;
    }

    @Override
    public final void run() {
        int i7 = this.f39870a;
        Runnable runnable = this.d;
        int[] iArr = this.f39872c;
        int i10 = this.f39871b;
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

    public u2(int[] iArr, int i7, Runnable runnable) {
        this.f39872c = iArr;
        this.f39871b = i7;
        this.d = runnable;
    }
}
