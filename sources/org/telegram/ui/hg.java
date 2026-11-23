package org.telegram.ui;

import android.content.DialogInterface;
public final class hg implements DialogInterface.OnCancelListener {
    public final int f48392a;
    public final boolean[] f48393b;

    public hg(int i7, boolean[] zArr) {
        this.f48392a = i7;
        this.f48393b = zArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i7 = this.f48392a;
        boolean[] zArr = this.f48393b;
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
