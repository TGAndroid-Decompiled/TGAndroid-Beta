package org.telegram.ui.Components;

import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.LaunchActivity;
public final class w2 implements Runnable {
    public final int f32052a = 1;
    public final int f32053b;
    public final int[] f32054c;
    public final Runnable d;

    public w2(int i10, int[] iArr, org.telegram.ui.y60 y60Var) {
        this.f32053b = i10;
        this.f32054c = iArr;
        this.d = y60Var;
    }

    @Override
    public final void run() {
        int i10 = this.f32052a;
        Runnable runnable = this.d;
        int[] iArr = this.f32054c;
        int i11 = this.f32053b;
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

    public w2(int[] iArr, int i10, Runnable runnable) {
        this.f32054c = iArr;
        this.f32053b = i10;
        this.d = runnable;
    }
}
