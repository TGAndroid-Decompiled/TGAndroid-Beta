package org.telegram.ui;

import android.content.DialogInterface;
public final class fg implements DialogInterface.OnCancelListener {
    public final int f47118a;
    public final boolean[] f47119b;

    public fg(int i7, boolean[] zArr) {
        this.f47118a = i7;
        this.f47119b = zArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i7 = this.f47118a;
        boolean[] zArr = this.f47119b;
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
