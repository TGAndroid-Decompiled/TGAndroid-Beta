package org.telegram.ui.Components;

import android.content.DialogInterface;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.LaunchActivity;
public final class y1 implements DialogInterface.OnCancelListener {
    public final int f30125a = 1;
    public final int f30126b;
    public final int[] f30127c;
    public final Runnable d;

    public y1(int i10, int[] iArr, org.telegram.ui.ma0 ma0Var) {
        this.f30126b = i10;
        this.f30127c = iArr;
        this.d = ma0Var;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f30125a;
        Runnable runnable = this.d;
        int[] iArr = this.f30127c;
        int i11 = this.f30126b;
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

    public y1(int[] iArr, Runnable runnable, int i10) {
        this.f30127c = iArr;
        this.f30126b = i10;
        this.d = runnable;
    }
}
