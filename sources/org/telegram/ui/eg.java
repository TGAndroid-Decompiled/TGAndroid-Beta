package org.telegram.ui;

import android.content.DialogInterface;
public final class eg implements DialogInterface.OnCancelListener {
    public final int f44979a;
    public final boolean[] f44980b;

    public eg(int i3, boolean[] zArr) {
        this.f44979a = i3;
        this.f44980b = zArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i3 = this.f44979a;
        boolean[] zArr = this.f44980b;
        switch (i3) {
            case 0:
                zArr[0] = true;
                return;
            default:
                String str = LaunchActivity.E1;
                zArr[0] = true;
                return;
        }
    }
}
