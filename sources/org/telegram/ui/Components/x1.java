package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.LaunchActivity;
public final class x1 implements DialogInterface.OnCancelListener {
    public final int f41898a = 1;
    public final int f41899b;
    public final int[] f41900c;
    public final Runnable d;

    public x1(int i7, int[] iArr, org.telegram.ui.o60 o60Var) {
        this.f41899b = i7;
        this.f41900c = iArr;
        this.d = o60Var;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i7 = this.f41898a;
        Runnable runnable = this.d;
        int[] iArr = this.f41900c;
        int i10 = this.f41899b;
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

    public x1(int[] iArr, int i7, Runnable runnable) {
        this.f41900c = iArr;
        this.f41899b = i7;
        this.d = runnable;
    }
}
