package org.telegram.ui;

import android.content.DialogInterface;
import java.util.regex.Pattern;
public final class gh implements DialogInterface.OnCancelListener {
    public final int f33902a;
    public final boolean[] f33903b;

    public gh(int i10, boolean[] zArr) {
        this.f33902a = i10;
        this.f33903b = zArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f33902a;
        boolean[] zArr = this.f33903b;
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
