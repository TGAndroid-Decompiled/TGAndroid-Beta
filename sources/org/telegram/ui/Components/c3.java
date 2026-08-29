package org.telegram.ui.Components;

import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.LaunchActivity;
public final class c3 implements Runnable {
    public final int f27291a = 1;
    public final int f27292b;
    public final int[] f27293c;
    public final Runnable d;

    public c3(int i10, int[] iArr, org.telegram.ui.x60 x60Var) {
        this.f27292b = i10;
        this.f27293c = iArr;
        this.d = x60Var;
    }

    @Override
    public final void run() {
        int i10 = this.f27291a;
        Runnable runnable = this.d;
        int[] iArr = this.f27293c;
        int i11 = this.f27292b;
        switch (i10) {
            case 0:
                iArr[0] = i11;
                runnable.run();
                return;
            default:
                Pattern pattern = LaunchActivity.f35560x1;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    public c3(int[] iArr, Runnable runnable, int i10) {
        this.f27293c = iArr;
        this.f27292b = i10;
        this.d = runnable;
    }
}
