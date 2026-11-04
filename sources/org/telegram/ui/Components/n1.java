package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.LaunchActivity;
public final class n1 implements DialogInterface.OnCancelListener {
    public final int f36324a = 1;
    public final int f36325b;
    public final int[] f36326c;
    public final Runnable d;

    public n1(int i3, int[] iArr, org.telegram.ui.ly lyVar) {
        this.f36325b = i3;
        this.f36326c = iArr;
        this.d = lyVar;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i3 = this.f36324a;
        Runnable runnable = this.d;
        int[] iArr = this.f36326c;
        int i10 = this.f36325b;
        switch (i3) {
            case 0:
                for (int i11 : iArr) {
                    if (i11 != 0) {
                        ConnectionsManager.getInstance(i10).cancelRequest(i11, true);
                    }
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                String str = LaunchActivity.E1;
                ConnectionsManager.getInstance(i10).cancelRequest(iArr[0], true);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    public n1(int[] iArr, int i3, Runnable runnable) {
        this.f36326c = iArr;
        this.f36325b = i3;
        this.d = runnable;
    }
}
