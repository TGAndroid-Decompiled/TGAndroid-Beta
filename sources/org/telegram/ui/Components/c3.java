package org.telegram.ui.Components;

import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.LaunchActivity;
public final class c3 implements Runnable {
    public final int f25162a = 1;
    public final int f25163b;
    public final int[] f25164c;
    public final Runnable d;

    public c3(int i10, int[] iArr, org.telegram.ui.f80 f80Var) {
        this.f25163b = i10;
        this.f25164c = iArr;
        this.d = f80Var;
    }

    @Override
    public final void run() {
        int i10 = this.f25162a;
        Runnable runnable = this.d;
        int[] iArr = this.f25164c;
        int i11 = this.f25163b;
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

    public c3(int[] iArr, Runnable runnable, int i10) {
        this.f25164c = iArr;
        this.f25163b = i10;
        this.d = runnable;
    }
}
