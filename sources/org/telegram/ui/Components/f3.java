package org.telegram.ui.Components;

import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.LaunchActivity;
public final class f3 implements Runnable {
    public final int f26304a = 1;
    public final int f26305b;
    public final int[] f26306c;
    public final Runnable d;

    public f3(int i10, int[] iArr, org.telegram.ui.n70 n70Var) {
        this.f26305b = i10;
        this.f26306c = iArr;
        this.d = n70Var;
    }

    @Override
    public final void run() {
        int i10 = this.f26304a;
        Runnable runnable = this.d;
        int[] iArr = this.f26306c;
        int i11 = this.f26305b;
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
        this.f26306c = iArr;
        this.f26305b = i10;
        this.d = runnable;
    }
}
