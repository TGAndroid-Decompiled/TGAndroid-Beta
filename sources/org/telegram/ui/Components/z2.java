package org.telegram.ui.Components;

import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.LaunchActivity;
public final class z2 implements Runnable {
    public final int f33698a = 1;
    public final int f33699b;
    public final int[] f33700c;
    public final Runnable d;

    public z2(int i10, int[] iArr, org.telegram.ui.v10 v10Var) {
        this.f33699b = i10;
        this.f33700c = iArr;
        this.d = v10Var;
    }

    @Override
    public final void run() {
        int i10 = this.f33698a;
        Runnable runnable = this.d;
        int[] iArr = this.f33700c;
        int i11 = this.f33699b;
        switch (i10) {
            case 0:
                iArr[0] = i11;
                runnable.run();
                return;
            default:
                Pattern pattern = LaunchActivity.f34134y1;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    public z2(int[] iArr, Runnable runnable, int i10) {
        this.f33700c = iArr;
        this.f33699b = i10;
        this.d = runnable;
    }
}
