package org.telegram.ui.Components;

import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.LaunchActivity;
public final class f3 implements Runnable {
    public final int f26262a = 1;
    public final int f26263b;
    public final int[] f26264c;
    public final Runnable d;

    public f3(int i10, int[] iArr, org.telegram.ui.m70 m70Var) {
        this.f26263b = i10;
        this.f26264c = iArr;
        this.d = m70Var;
    }

    @Override
    public final void run() {
        int i10 = this.f26262a;
        Runnable runnable = this.d;
        int[] iArr = this.f26264c;
        int i11 = this.f26263b;
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
        this.f26264c = iArr;
        this.f26263b = i10;
        this.d = runnable;
    }
}
