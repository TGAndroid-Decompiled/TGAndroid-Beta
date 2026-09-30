package org.telegram.ui.Components;

import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.LaunchActivity;
public final class d3 implements Runnable {
    public final int f23476a = 1;
    public final int f23477b;
    public final int[] f23478c;
    public final Runnable d;

    public d3(int i10, int[] iArr, org.telegram.ui.m80 m80Var) {
        this.f23477b = i10;
        this.f23478c = iArr;
        this.d = m80Var;
    }

    @Override
    public final void run() {
        int i10 = this.f23476a;
        Runnable runnable = this.d;
        int[] iArr = this.f23478c;
        int i11 = this.f23477b;
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
        this.f23478c = iArr;
        this.f23477b = i10;
        this.d = runnable;
    }
}
