package org.telegram.ui;

import android.content.DialogInterface;
public final class fg implements DialogInterface.OnCancelListener {
    public final int f47134a;
    public final boolean[] f47135b;

    public fg(int i7, boolean[] zArr) {
        this.f47134a = i7;
        this.f47135b = zArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i7 = this.f47134a;
        boolean[] zArr = this.f47135b;
        switch (i7) {
            case 0:
                zArr[0] = true;
                return;
            default:
                String str = LaunchActivity.C1;
                zArr[0] = true;
                return;
        }
    }
}
