package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.LaunchActivity;
public final class w1 implements DialogInterface.OnCancelListener {
    public final int f41517a = 1;
    public final int f41518b;
    public final int[] f41519c;
    public final Runnable d;

    public w1(int i7, int[] iArr, org.telegram.ui.o60 o60Var) {
        this.f41518b = i7;
        this.f41519c = iArr;
        this.d = o60Var;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i7 = this.f41517a;
        Runnable runnable = this.d;
        int[] iArr = this.f41519c;
        int i10 = this.f41518b;
        switch (i7) {
            case 0:
                for (int i11 : iArr) {
                    if (i11 != 0) {
                        ConnectionsManager.getInstance(i10).cancelRequest(i11, true);
                    }
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                String str = LaunchActivity.C1;
                ConnectionsManager.getInstance(i10).cancelRequest(iArr[0], true);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    public w1(int[] iArr, int i7, Runnable runnable) {
        this.f41519c = iArr;
        this.f41518b = i7;
        this.d = runnable;
    }
}
