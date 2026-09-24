package org.telegram.ui;

import android.content.DialogInterface;
import java.util.regex.Pattern;
public final class gh implements DialogInterface.OnCancelListener {
    public final int f33925a;
    public final boolean[] f33926b;

    public gh(int i10, boolean[] zArr) {
        this.f33925a = i10;
        this.f33926b = zArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f33925a;
        boolean[] zArr = this.f33926b;
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
