package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.LaunchActivity;
public final class o1 implements DialogInterface.OnCancelListener {
    public final int f36559a = 1;
    public final int f36560b;
    public final int[] f36561c;
    public final Runnable d;

    public o1(int i7, int[] iArr, org.telegram.ui.q10 q10Var) {
        this.f36560b = i7;
        this.f36561c = iArr;
        this.d = q10Var;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i7 = this.f36559a;
        Runnable runnable = this.d;
        int[] iArr = this.f36561c;
        int i10 = this.f36560b;
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
        this.f36561c = iArr;
        this.f36560b = i7;
        this.d = runnable;
    }
}
