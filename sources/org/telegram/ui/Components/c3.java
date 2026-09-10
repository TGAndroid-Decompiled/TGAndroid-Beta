package org.telegram.ui.Components;

import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.LaunchActivity;
public final class c3 implements Runnable {
    public final int f21980a = 1;
    public final int f21981b;
    public final int[] f21982c;
    public final Runnable d;

    public c3(int i10, int[] iArr, org.telegram.ui.h90 h90Var) {
        this.f21981b = i10;
        this.f21982c = iArr;
        this.d = h90Var;
    }

    @Override
    public final void run() {
        int i10 = this.f21980a;
        Runnable runnable = this.d;
        int[] iArr = this.f21982c;
        int i11 = this.f21981b;
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

    public c3(int[] iArr, Runnable runnable, int i10) {
        this.f21982c = iArr;
        this.f21981b = i10;
        this.d = runnable;
    }
}
