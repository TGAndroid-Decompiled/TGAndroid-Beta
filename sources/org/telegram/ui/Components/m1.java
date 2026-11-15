package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.LaunchActivity;
public final class m1 implements DialogInterface.OnCancelListener {
    public final int f37023a = 1;
    public final int f37024b;
    public final int[] f37025c;
    public final Runnable d;

    public m1(int i7, int[] iArr, org.telegram.ui.g50 g50Var) {
        this.f37024b = i7;
        this.f37025c = iArr;
        this.d = g50Var;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i7 = this.f37023a;
        Runnable runnable = this.d;
        int[] iArr = this.f37025c;
        int i10 = this.f37024b;
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

    public m1(int[] iArr, int i7, Runnable runnable) {
        this.f37025c = iArr;
        this.f37024b = i7;
        this.d = runnable;
    }
}
