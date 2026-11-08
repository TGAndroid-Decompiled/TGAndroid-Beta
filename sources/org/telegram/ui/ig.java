package org.telegram.ui;

import android.content.DialogInterface;
public final class ig implements DialogInterface.OnCancelListener {
    public final int f46668a;
    public final boolean[] f46669b;

    public ig(int i7, boolean[] zArr) {
        this.f46668a = i7;
        this.f46669b = zArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i7 = this.f46668a;
        boolean[] zArr = this.f46669b;
        switch (i7) {
            case 0:
                zArr[0] = true;
                return;
            default:
                String str = LaunchActivity.B1;
                zArr[0] = true;
                return;
        }
    }
}
