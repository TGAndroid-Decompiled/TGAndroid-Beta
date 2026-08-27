package org.telegram.ui.Components;

import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.LaunchActivity;

public final class y2 implements Runnable {

    public final int f34789a = 1;

    public final int f34790b;

    public final int[] f34791c;
    public final Runnable d;

    public y2(int i10, int[] iArr, org.telegram.ui.a30 a30Var) {
        this.f34790b = i10;
        this.f34791c = iArr;
        this.d = a30Var;
    }

    @Override
    public final void run() {
        int i10 = this.f34789a;
        Runnable runnable = this.d;
        int[] iArr = this.f34791c;
        int i11 = this.f34790b;
        switch (i10) {
            case 0:
                iArr[0] = i11;
                runnable.run();
                break;
            default:
                Pattern pattern = LaunchActivity.f35496x1;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                if (runnable != null) {
                    runnable.run();
                }
                break;
        }
    }

    public y2(int[] iArr, Runnable runnable, int i10) {
        this.f34791c = iArr;
        this.f34790b = i10;
        this.d = runnable;
    }
}
