package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.LaunchActivity;
public final class x1 implements DialogInterface.OnCancelListener {
    public final int f41948a = 1;
    public final int f41949b;
    public final int[] f41950c;
    public final Runnable d;

    public x1(int i7, int[] iArr, org.telegram.ui.h60 h60Var) {
        this.f41949b = i7;
        this.f41950c = iArr;
        this.d = h60Var;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i7 = this.f41948a;
        Runnable runnable = this.d;
        int[] iArr = this.f41950c;
        int i10 = this.f41949b;
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
        this.f41950c = iArr;
        this.f41949b = i7;
        this.d = runnable;
    }
}
