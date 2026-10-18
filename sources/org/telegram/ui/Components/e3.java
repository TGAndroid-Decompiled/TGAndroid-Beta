package org.telegram.ui.Components;

import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.LaunchActivity;
public final class e3 implements Runnable {
    public final int f25793a = 1;
    public final int f25794b;
    public final int[] f25795c;
    public final Runnable d;

    public e3(int i10, int[] iArr, org.telegram.ui.b80 b80Var) {
        this.f25794b = i10;
        this.f25795c = iArr;
        this.d = b80Var;
    }

    @Override
    public final void run() {
        int i10 = this.f25793a;
        Runnable runnable = this.d;
        int[] iArr = this.f25795c;
        int i11 = this.f25794b;
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
        this.f25795c = iArr;
        this.f25794b = i10;
        this.d = runnable;
    }
}
