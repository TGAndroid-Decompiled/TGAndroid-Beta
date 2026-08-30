package org.telegram.ui.Components;

import android.content.DialogInterface;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.LaunchActivity;
public final class z1 implements DialogInterface.OnCancelListener {
    public final int f31202a = 1;
    public final int f31203b;
    public final int[] f31204c;
    public final Runnable d;

    public z1(int i10, int[] iArr, org.telegram.ui.g00 g00Var) {
        this.f31203b = i10;
        this.f31204c = iArr;
        this.d = g00Var;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f31202a;
        Runnable runnable = this.d;
        int[] iArr = this.f31204c;
        int i11 = this.f31203b;
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
                Pattern pattern = LaunchActivity.f31612y1;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    public z1(int[] iArr, Runnable runnable, int i10) {
        this.f31204c = iArr;
        this.f31203b = i10;
        this.d = runnable;
    }
}
