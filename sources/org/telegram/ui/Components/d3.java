package org.telegram.ui.Components;

import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.LaunchActivity;
public final class d3 implements Runnable {
    public final int f23452a = 1;
    public final int f23453b;
    public final int[] f23454c;
    public final Runnable d;

    public d3(int i10, int[] iArr, org.telegram.ui.m80 m80Var) {
        this.f23453b = i10;
        this.f23454c = iArr;
        this.d = m80Var;
    }

    @Override
    public final void run() {
        int i10 = this.f23452a;
        Runnable runnable = this.d;
        int[] iArr = this.f23454c;
        int i11 = this.f23453b;
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
        this.f23454c = iArr;
        this.f23453b = i10;
        this.d = runnable;
    }
}
