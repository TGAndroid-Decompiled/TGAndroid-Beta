package org.telegram.ui;

import android.content.DialogInterface;
import java.util.regex.Pattern;
public final class fh implements DialogInterface.OnCancelListener {
    public final int f37714a;
    public final boolean[] f37715b;

    public fh(int i10, boolean[] zArr) {
        this.f37714a = i10;
        this.f37715b = zArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f37714a;
        boolean[] zArr = this.f37715b;
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
