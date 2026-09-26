package org.telegram.ui;

import android.content.DialogInterface;
import java.util.regex.Pattern;
public final class gh implements DialogInterface.OnCancelListener {
    public final int f33939a;
    public final boolean[] f33940b;

    public gh(int i10, boolean[] zArr) {
        this.f33939a = i10;
        this.f33940b = zArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f33939a;
        boolean[] zArr = this.f33940b;
        switch (i10) {
            case 0:
                zArr[0] = true;
                return;
            default:
                Pattern pattern = LaunchActivity.B1;
                zArr[0] = true;
                return;
        }
    }
}
