package org.telegram.ui.Components;

import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.LaunchActivity;
public final class f3 implements Runnable {
    public final int f24870a = 1;
    public final int f24871b;
    public final int[] f24872c;
    public final Runnable d;

    public f3(int i10, int[] iArr, org.telegram.ui.o00 o00Var) {
        this.f24871b = i10;
        this.f24872c = iArr;
        this.d = o00Var;
    }

    @Override
    public final void run() {
        int i10 = this.f24870a;
        Runnable runnable = this.d;
        int[] iArr = this.f24872c;
        int i11 = this.f24871b;
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
        this.f24872c = iArr;
        this.f24871b = i10;
        this.d = runnable;
    }
}
