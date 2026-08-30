package org.telegram.ui.Components;

import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.LaunchActivity;
public final class z2 implements Runnable {
    public final int f31219a = 1;
    public final int f31220b;
    public final int[] f31221c;
    public final Runnable d;

    public z2(int i10, int[] iArr, org.telegram.ui.g00 g00Var) {
        this.f31220b = i10;
        this.f31221c = iArr;
        this.d = g00Var;
    }

    @Override
    public final void run() {
        int i10 = this.f31219a;
        Runnable runnable = this.d;
        int[] iArr = this.f31221c;
        int i11 = this.f31220b;
        switch (i10) {
            case 0:
                iArr[0] = i11;
                runnable.run();
                return;
            default:
                Pattern pattern = LaunchActivity.f31612y1;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    public z2(int[] iArr, Runnable runnable, int i10) {
        this.f31221c = iArr;
        this.f31220b = i10;
        this.d = runnable;
    }
}
