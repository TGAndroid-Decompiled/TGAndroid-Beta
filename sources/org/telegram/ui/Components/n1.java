package org.telegram.ui.Components;

import android.content.DialogInterface;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.LaunchActivity;
public final class n1 implements DialogInterface.OnCancelListener {
    public final int f28651a = 1;
    public final int f28652b;
    public final int[] f28653c;
    public final Runnable d;

    public n1(int i10, int[] iArr, org.telegram.ui.f70 f70Var) {
        this.f28652b = i10;
        this.f28653c = iArr;
        this.d = f70Var;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f28651a;
        Runnable runnable = this.d;
        int[] iArr = this.f28653c;
        int i11 = this.f28652b;
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
        this.f28653c = iArr;
        this.f28652b = i10;
        this.d = runnable;
    }
}
