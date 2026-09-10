package org.telegram.ui.Components;

import android.content.DialogInterface;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.LaunchActivity;
public final class a2 implements DialogInterface.OnCancelListener {
    public final int f21358a = 1;
    public final int f21359b;
    public final int[] f21360c;
    public final Runnable d;

    public a2(int i10, int[] iArr, org.telegram.ui.h90 h90Var) {
        this.f21359b = i10;
        this.f21360c = iArr;
        this.d = h90Var;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f21358a;
        Runnable runnable = this.d;
        int[] iArr = this.f21360c;
        int i11 = this.f21359b;
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

    public a2(int[] iArr, Runnable runnable, int i10) {
        this.f21360c = iArr;
        this.f21359b = i10;
        this.d = runnable;
    }
}
