package org.telegram.ui.Components;

import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.LaunchActivity;
public final class b3 implements Runnable {
    public final int f22551a = 1;
    public final int f22552b;
    public final int[] f22553c;
    public final Runnable d;

    public b3(int i10, int[] iArr, org.telegram.ui.oa0 oa0Var) {
        this.f22552b = i10;
        this.f22553c = iArr;
        this.d = oa0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f22551a;
        Runnable runnable = this.d;
        int[] iArr = this.f22553c;
        int i11 = this.f22552b;
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

    public b3(int[] iArr, Runnable runnable, int i10) {
        this.f22553c = iArr;
        this.f22552b = i10;
        this.d = runnable;
    }
}
