package org.telegram.ui.Components;

import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.LaunchActivity;
public final class y2 implements Runnable {
    public final int f34836a = 1;
    public final int f34837b;
    public final int[] f34838c;
    public final Runnable d;

    public y2(int i9, int[] iArr, org.telegram.ui.x20 x20Var) {
        this.f34837b = i9;
        this.f34838c = iArr;
        this.d = x20Var;
    }

    @Override
    public final void run() {
        int i9 = this.f34836a;
        Runnable runnable = this.d;
        int[] iArr = this.f34838c;
        int i10 = this.f34837b;
        switch (i9) {
            case 0:
                iArr[0] = i10;
                runnable.run();
                return;
            default:
                Pattern pattern = LaunchActivity.f35493x1;
                ConnectionsManager.getInstance(i10).cancelRequest(iArr[0], true);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    public y2(int[] iArr, Runnable runnable, int i9) {
        this.f34838c = iArr;
        this.f34837b = i9;
        this.d = runnable;
    }
}
