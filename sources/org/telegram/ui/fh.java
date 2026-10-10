package org.telegram.ui;

import android.content.DialogInterface;
import java.util.regex.Pattern;
public final class fh implements DialogInterface.OnCancelListener {
    public final int f37650a;
    public final boolean[] f37651b;

    public fh(int i10, boolean[] zArr) {
        this.f37650a = i10;
        this.f37651b = zArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f37650a;
        boolean[] zArr = this.f37651b;
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
