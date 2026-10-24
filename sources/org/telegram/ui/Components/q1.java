package org.telegram.ui.Components;

import android.content.DialogInterface;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.LaunchActivity;
public final class q1 implements DialogInterface.OnCancelListener {
    public final int f29747a = 1;
    public final int f29748b;
    public final int[] f29749c;
    public final Runnable d;

    public q1(int i10, int[] iArr, org.telegram.ui.f80 f80Var) {
        this.f29748b = i10;
        this.f29749c = iArr;
        this.d = f80Var;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f29747a;
        Runnable runnable = this.d;
        int[] iArr = this.f29749c;
        int i11 = this.f29748b;
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

    public q1(int[] iArr, Runnable runnable, int i10) {
        this.f29749c = iArr;
        this.f29748b = i10;
        this.d = runnable;
    }
}
