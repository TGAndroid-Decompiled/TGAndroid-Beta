package org.telegram.ui.Components;

import android.content.DialogInterface;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.LaunchActivity;

public final class x1 implements DialogInterface.OnCancelListener {

    public final int f34415a = 1;

    public final int f34416b;

    public final int[] f34417c;
    public final Runnable d;

    public x1(int i10, int[] iArr, org.telegram.ui.a30 a30Var) {
        this.f34416b = i10;
        this.f34417c = iArr;
        this.d = a30Var;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f34415a;
        Runnable runnable = this.d;
        int[] iArr = this.f34417c;
        int i11 = this.f34416b;
        switch (i10) {
            case 0:
                for (int i12 : iArr) {
                    if (i12 != 0) {
                        ConnectionsManager.getInstance(i11).cancelRequest(i12, true);
                    }
                }
                if (runnable != null) {
                    runnable.run();
                }
                break;
            default:
                Pattern pattern = LaunchActivity.f35496x1;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                if (runnable != null) {
                    runnable.run();
                }
                break;
        }
    }

    public x1(int[] iArr, Runnable runnable, int i10) {
        this.f34417c = iArr;
        this.f34416b = i10;
        this.d = runnable;
    }
}
