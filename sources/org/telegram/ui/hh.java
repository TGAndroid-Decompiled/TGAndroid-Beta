package org.telegram.ui;

import android.content.DialogInterface;
import java.util.regex.Pattern;
public final class hh implements DialogInterface.OnCancelListener {
    public final int f37025a;
    public final boolean[] f37026b;

    public hh(int i10, boolean[] zArr) {
        this.f37025a = i10;
        this.f37026b = zArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f37025a;
        boolean[] zArr = this.f37026b;
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
