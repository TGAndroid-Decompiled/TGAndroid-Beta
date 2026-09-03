package org.telegram.ui.Components;

import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.LaunchActivity;
public final class z2 implements Runnable {
    public final int f31230a = 1;
    public final int f31231b;
    public final int[] f31232c;
    public final Runnable d;

    public z2(int i10, int[] iArr, org.telegram.ui.w10 w10Var) {
        this.f31231b = i10;
        this.f31232c = iArr;
        this.d = w10Var;
    }

    @Override
    public final void run() {
        int i10 = this.f31230a;
        Runnable runnable = this.d;
        int[] iArr = this.f31232c;
        int i11 = this.f31231b;
        switch (i10) {
            case 0:
                iArr[0] = i11;
                runnable.run();
                return;
            default:
                Pattern pattern = LaunchActivity.f31586y1;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    public z2(int[] iArr, Runnable runnable, int i10) {
        this.f31232c = iArr;
        this.f31231b = i10;
        this.d = runnable;
    }
}
