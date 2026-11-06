package org.telegram.ui;

import android.content.DialogInterface;
public final class ig implements DialogInterface.OnCancelListener {
    public final int f46666a;
    public final boolean[] f46667b;

    public ig(int i7, boolean[] zArr) {
        this.f46666a = i7;
        this.f46667b = zArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i7 = this.f46666a;
        boolean[] zArr = this.f46667b;
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
