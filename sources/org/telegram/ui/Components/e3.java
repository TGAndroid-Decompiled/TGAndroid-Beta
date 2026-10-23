package org.telegram.ui.Components;

import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.LaunchActivity;
public final class e3 implements Runnable {
    public final int f25705a = 1;
    public final int f25706b;
    public final int[] f25707c;
    public final Runnable d;

    public e3(int i10, int[] iArr, org.telegram.ui.z70 z70Var) {
        this.f25706b = i10;
        this.f25707c = iArr;
        this.d = z70Var;
    }

    @Override
    public final void run() {
        int i10 = this.f25705a;
        Runnable runnable = this.d;
        int[] iArr = this.f25707c;
        int i11 = this.f25706b;
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
        this.f25707c = iArr;
        this.f25706b = i10;
        this.d = runnable;
    }
}
