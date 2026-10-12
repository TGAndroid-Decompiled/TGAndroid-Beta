package org.telegram.ui.Components;

import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.LaunchActivity;
public final class f3 implements Runnable {
    public final int f25871a = 1;
    public final int f25872b;
    public final int[] f25873c;
    public final Runnable d;

    public f3(int i10, int[] iArr, org.telegram.ui.q70 q70Var) {
        this.f25872b = i10;
        this.f25873c = iArr;
        this.d = q70Var;
    }

    @Override
    public final void run() {
        int i10 = this.f25871a;
        Runnable runnable = this.d;
        int[] iArr = this.f25873c;
        int i11 = this.f25872b;
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
        this.f25873c = iArr;
        this.f25872b = i10;
        this.d = runnable;
    }
}
