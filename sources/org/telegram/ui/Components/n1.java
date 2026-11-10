package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.LaunchActivity;
public final class n1 implements DialogInterface.OnCancelListener {
    public final int f36187a = 1;
    public final int f36188b;
    public final int[] f36189c;
    public final Runnable d;

    public n1(int i7, int[] iArr, org.telegram.ui.f10 f10Var) {
        this.f36188b = i7;
        this.f36189c = iArr;
        this.d = f10Var;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i7 = this.f36187a;
        Runnable runnable = this.d;
        int[] iArr = this.f36189c;
        int i10 = this.f36188b;
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

    public n1(int[] iArr, int i7, Runnable runnable) {
        this.f36189c = iArr;
        this.f36188b = i7;
        this.d = runnable;
    }
}
