package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.LaunchActivity;
public final class w1 implements DialogInterface.OnCancelListener {
    public final int f41468a = 1;
    public final int f41469b;
    public final int[] f41470c;
    public final Runnable d;

    public w1(int i7, int[] iArr, org.telegram.ui.i50 i50Var) {
        this.f41469b = i7;
        this.f41470c = iArr;
        this.d = i50Var;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i7 = this.f41468a;
        Runnable runnable = this.d;
        int[] iArr = this.f41470c;
        int i10 = this.f41469b;
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
        this.f41470c = iArr;
        this.f41469b = i7;
        this.d = runnable;
    }
}
