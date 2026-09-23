package org.telegram.ui.Components;

import android.content.DialogInterface;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.LaunchActivity;
public final class z1 implements DialogInterface.OnCancelListener {
    public final int f30501a = 1;
    public final int f30502b;
    public final int[] f30503c;
    public final Runnable d;

    public z1(int i10, int[] iArr, org.telegram.ui.ia0 ia0Var) {
        this.f30502b = i10;
        this.f30503c = iArr;
        this.d = ia0Var;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f30501a;
        Runnable runnable = this.d;
        int[] iArr = this.f30503c;
        int i11 = this.f30502b;
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
        this.f30503c = iArr;
        this.f30502b = i10;
        this.d = runnable;
    }
}
