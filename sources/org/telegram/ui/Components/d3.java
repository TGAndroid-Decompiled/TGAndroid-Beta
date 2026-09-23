package org.telegram.ui.Components;

import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.LaunchActivity;
public final class d3 implements Runnable {
    public final int f23212a = 1;
    public final int f23213b;
    public final int[] f23214c;
    public final Runnable d;

    public d3(int i10, int[] iArr, org.telegram.ui.ia0 ia0Var) {
        this.f23213b = i10;
        this.f23214c = iArr;
        this.d = ia0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f23212a;
        Runnable runnable = this.d;
        int[] iArr = this.f23214c;
        int i11 = this.f23213b;
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

    public d3(int[] iArr, Runnable runnable, int i10) {
        this.f23214c = iArr;
        this.f23213b = i10;
        this.d = runnable;
    }
}
