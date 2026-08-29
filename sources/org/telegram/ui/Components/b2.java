package org.telegram.ui.Components;

import android.content.DialogInterface;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.LaunchActivity;
public final class b2 implements DialogInterface.OnCancelListener {
    public final int f26944a = 1;
    public final int f26945b;
    public final int[] f26946c;
    public final Runnable d;

    public b2(int i10, int[] iArr, org.telegram.ui.x60 x60Var) {
        this.f26945b = i10;
        this.f26946c = iArr;
        this.d = x60Var;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f26944a;
        Runnable runnable = this.d;
        int[] iArr = this.f26946c;
        int i11 = this.f26945b;
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
                Pattern pattern = LaunchActivity.f35560x1;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    public b2(int[] iArr, Runnable runnable, int i10) {
        this.f26946c = iArr;
        this.f26945b = i10;
        this.d = runnable;
    }
}
