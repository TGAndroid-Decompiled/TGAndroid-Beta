package org.telegram.ui.Components;

import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.LaunchActivity;
public final class d3 implements Runnable {
    public final int f23405a = 1;
    public final int f23406b;
    public final int[] f23407c;
    public final Runnable d;

    public d3(int i10, int[] iArr, org.telegram.ui.y80 y80Var) {
        this.f23406b = i10;
        this.f23407c = iArr;
        this.d = y80Var;
    }

    @Override
    public final void run() {
        int i10 = this.f23405a;
        Runnable runnable = this.d;
        int[] iArr = this.f23407c;
        int i11 = this.f23406b;
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
        this.f23407c = iArr;
        this.f23406b = i10;
        this.d = runnable;
    }
}
