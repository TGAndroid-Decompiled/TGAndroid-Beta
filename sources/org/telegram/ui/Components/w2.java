package org.telegram.ui.Components;

import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.LaunchActivity;
public final class w2 implements Runnable {
    public final int f31967a = 1;
    public final int f31968b;
    public final int[] f31969c;
    public final Runnable d;

    public w2(int i10, int[] iArr, org.telegram.ui.f70 f70Var) {
        this.f31968b = i10;
        this.f31969c = iArr;
        this.d = f70Var;
    }

    @Override
    public final void run() {
        int i10 = this.f31967a;
        Runnable runnable = this.d;
        int[] iArr = this.f31969c;
        int i11 = this.f31968b;
        switch (i10) {
            case 0:
                iArr[0] = i11;
                runnable.run();
                return;
            default:
                Pattern pattern = LaunchActivity.D1;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    public w2(int[] iArr, int i10, Runnable runnable) {
        this.f31969c = iArr;
        this.f31968b = i10;
        this.d = runnable;
    }
}
