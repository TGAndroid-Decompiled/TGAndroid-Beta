package org.telegram.ui.Components;

import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.LaunchActivity;
public final class f3 implements Runnable {
    public final int f28046a = 1;
    public final int f28047b;
    public final int[] f28048c;
    public final Runnable d;

    public f3(int i10, int[] iArr, org.telegram.ui.sz szVar) {
        this.f28047b = i10;
        this.f28048c = iArr;
        this.d = szVar;
    }

    @Override
    public final void run() {
        int i10 = this.f28046a;
        Runnable runnable = this.d;
        int[] iArr = this.f28048c;
        int i11 = this.f28047b;
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

    public f3(int[] iArr, Runnable runnable, int i10) {
        this.f28048c = iArr;
        this.f28047b = i10;
        this.d = runnable;
    }
}
