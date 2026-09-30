package org.telegram.ui;

import android.content.DialogInterface;
import java.util.regex.Pattern;
public final class gh implements DialogInterface.OnCancelListener {
    public final int f33941a;
    public final boolean[] f33942b;

    public gh(int i10, boolean[] zArr) {
        this.f33941a = i10;
        this.f33942b = zArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f33941a;
        boolean[] zArr = this.f33942b;
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
