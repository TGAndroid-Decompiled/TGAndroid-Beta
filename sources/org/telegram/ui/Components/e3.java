package org.telegram.ui.Components;

import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.LaunchActivity;
public final class e3 implements Runnable {
    public final int f25747a = 1;
    public final int f25748b;
    public final int[] f25749c;
    public final Runnable d;

    public e3(int i10, int[] iArr, org.telegram.ui.z70 z70Var) {
        this.f25748b = i10;
        this.f25749c = iArr;
        this.d = z70Var;
    }

    @Override
    public final void run() {
        int i10 = this.f25747a;
        Runnable runnable = this.d;
        int[] iArr = this.f25749c;
        int i11 = this.f25748b;
        switch (i10) {
            case 0:
                iArr[0] = i11;
                runnable.run();
                return;
            default:
                Pattern pattern = LaunchActivity.C1;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    public e3(int[] iArr, Runnable runnable, int i10) {
        this.f25749c = iArr;
        this.f25748b = i10;
        this.d = runnable;
    }
}
