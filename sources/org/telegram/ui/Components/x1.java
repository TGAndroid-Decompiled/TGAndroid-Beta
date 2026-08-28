package org.telegram.ui.Components;

import android.content.DialogInterface;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.LaunchActivity;
public final class x1 implements DialogInterface.OnCancelListener {
    public final int f34484a = 1;
    public final int f34485b;
    public final int[] f34486c;
    public final Runnable d;

    public x1(int i9, int[] iArr, org.telegram.ui.x20 x20Var) {
        this.f34485b = i9;
        this.f34486c = iArr;
        this.d = x20Var;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i9 = this.f34484a;
        Runnable runnable = this.d;
        int[] iArr = this.f34486c;
        int i10 = this.f34485b;
        switch (i9) {
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
                Pattern pattern = LaunchActivity.f35493x1;
                ConnectionsManager.getInstance(i10).cancelRequest(iArr[0], true);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    public x1(int[] iArr, Runnable runnable, int i9) {
        this.f34486c = iArr;
        this.f34485b = i9;
        this.d = runnable;
    }
}
