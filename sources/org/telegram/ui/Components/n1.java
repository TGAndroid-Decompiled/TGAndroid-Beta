package org.telegram.ui.Components;

import android.content.DialogInterface;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.LaunchActivity;
public final class n1 implements DialogInterface.OnCancelListener {
    public final int f28632a = 1;
    public final int f28633b;
    public final int[] f28634c;
    public final Runnable d;

    public n1(int i10, int[] iArr, org.telegram.ui.y60 y60Var) {
        this.f28633b = i10;
        this.f28634c = iArr;
        this.d = y60Var;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f28632a;
        Runnable runnable = this.d;
        int[] iArr = this.f28634c;
        int i11 = this.f28633b;
        switch (i10) {
            case 0:
                for (int i12 : iArr) {
                    if (i12 != 0) {
                        ConnectionsManager.getInstance(i11).cancelRequest(i12, true);
                    }
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
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

    public n1(int[] iArr, int i10, Runnable runnable) {
        this.f28634c = iArr;
        this.f28633b = i10;
        this.d = runnable;
    }
}
