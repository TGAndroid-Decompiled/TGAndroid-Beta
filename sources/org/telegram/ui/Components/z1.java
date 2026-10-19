package org.telegram.ui.Components;

import android.content.DialogInterface;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.LaunchActivity;
public final class z1 implements DialogInterface.OnCancelListener {
    public final int f32802a = 1;
    public final int f32803b;
    public final int[] f32804c;
    public final Runnable d;

    public z1(int i10, int[] iArr, org.telegram.ui.z70 z70Var) {
        this.f32803b = i10;
        this.f32804c = iArr;
        this.d = z70Var;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f32802a;
        Runnable runnable = this.d;
        int[] iArr = this.f32804c;
        int i11 = this.f32803b;
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
                Pattern pattern = LaunchActivity.C1;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    public z1(int[] iArr, Runnable runnable, int i10) {
        this.f32804c = iArr;
        this.f32803b = i10;
        this.d = runnable;
    }
}
