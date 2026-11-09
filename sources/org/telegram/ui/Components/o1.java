package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.LaunchActivity;
public final class o1 implements DialogInterface.OnCancelListener {
    public final int f36595a = 1;
    public final int f36596b;
    public final int[] f36597c;
    public final Runnable d;

    public o1(int i7, int[] iArr, org.telegram.ui.s10 s10Var) {
        this.f36596b = i7;
        this.f36597c = iArr;
        this.d = s10Var;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i7 = this.f36595a;
        Runnable runnable = this.d;
        int[] iArr = this.f36597c;
        int i10 = this.f36596b;
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
                String str = LaunchActivity.B1;
                ConnectionsManager.getInstance(i10).cancelRequest(iArr[0], true);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    public o1(int[] iArr, int i7, Runnable runnable) {
        this.f36597c = iArr;
        this.f36596b = i7;
        this.d = runnable;
    }
}
