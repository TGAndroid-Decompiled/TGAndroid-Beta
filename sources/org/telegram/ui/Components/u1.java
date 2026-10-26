package org.telegram.ui.Components;

import android.content.DialogInterface;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.LaunchActivity;
public final class u1 implements DialogInterface.OnCancelListener {
    public final int f33201a = 1;
    public final int f33202b;
    public final int[] f33203c;
    public final Runnable d;

    public u1(int i10, int[] iArr, org.telegram.ui.sz szVar) {
        this.f33202b = i10;
        this.f33203c = iArr;
        this.d = szVar;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f33201a;
        Runnable runnable = this.d;
        int[] iArr = this.f33203c;
        int i11 = this.f33202b;
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

    public u1(int[] iArr, Runnable runnable, int i10) {
        this.f33203c = iArr;
        this.f33202b = i10;
        this.d = runnable;
    }
}
