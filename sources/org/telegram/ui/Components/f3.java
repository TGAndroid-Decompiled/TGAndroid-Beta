package org.telegram.ui.Components;

import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.LaunchActivity;
public final class f3 implements Runnable {
    public final int f24564a = 1;
    public final int f24565b;
    public final int[] f24566c;
    public final Runnable d;

    public f3(int i10, int[] iArr, org.telegram.ui.d20 d20Var) {
        this.f24565b = i10;
        this.f24566c = iArr;
        this.d = d20Var;
    }

    @Override
    public final void run() {
        int i10 = this.f24564a;
        Runnable runnable = this.d;
        int[] iArr = this.f24566c;
        int i11 = this.f24565b;
        switch (i10) {
            case 0:
                iArr[0] = i11;
                runnable.run();
                return;
            default:
                Pattern pattern = LaunchActivity.B1;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    public f3(int[] iArr, Runnable runnable, int i10) {
        this.f24566c = iArr;
        this.f24565b = i10;
        this.d = runnable;
    }
}
