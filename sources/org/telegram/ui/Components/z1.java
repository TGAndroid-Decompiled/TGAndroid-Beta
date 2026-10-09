package org.telegram.ui.Components;

import android.content.DialogInterface;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.LaunchActivity;
public final class z1 implements DialogInterface.OnCancelListener {
    public final int f33409a = 1;
    public final int f33410b;
    public final int[] f33411c;
    public final Runnable d;

    public z1(int i10, int[] iArr, org.telegram.ui.m70 m70Var) {
        this.f33410b = i10;
        this.f33411c = iArr;
        this.d = m70Var;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f33409a;
        Runnable runnable = this.d;
        int[] iArr = this.f33411c;
        int i11 = this.f33410b;
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
                Pattern pattern = LaunchActivity.B1;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    public z1(int[] iArr, Runnable runnable, int i10) {
        this.f33411c = iArr;
        this.f33410b = i10;
        this.d = runnable;
    }
}
