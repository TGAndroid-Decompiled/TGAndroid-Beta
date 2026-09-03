package org.telegram.ui.Components;

import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.LaunchActivity;
public final class z2 implements Runnable {
    public final int f33735a = 1;
    public final int f33736b;
    public final int[] f33737c;
    public final Runnable d;

    public z2(int i10, int[] iArr, org.telegram.ui.z10 z10Var) {
        this.f33736b = i10;
        this.f33737c = iArr;
        this.d = z10Var;
    }

    @Override
    public final void run() {
        int i10 = this.f33735a;
        Runnable runnable = this.d;
        int[] iArr = this.f33737c;
        int i11 = this.f33736b;
        switch (i10) {
            case 0:
                iArr[0] = i11;
                runnable.run();
                return;
            default:
                Pattern pattern = LaunchActivity.f34134y1;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    public z2(int[] iArr, Runnable runnable, int i10) {
        this.f33737c = iArr;
        this.f33736b = i10;
        this.d = runnable;
    }
}
