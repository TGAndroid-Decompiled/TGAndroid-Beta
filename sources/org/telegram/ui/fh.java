package org.telegram.ui;

import android.content.DialogInterface;
import java.util.regex.Pattern;
public final class fh implements DialogInterface.OnCancelListener {
    public final int f37606a;
    public final boolean[] f37607b;

    public fh(int i10, boolean[] zArr) {
        this.f37606a = i10;
        this.f37607b = zArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f37606a;
        boolean[] zArr = this.f37607b;
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
