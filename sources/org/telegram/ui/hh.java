package org.telegram.ui;

import android.content.DialogInterface;
import java.util.regex.Pattern;
public final class hh implements DialogInterface.OnCancelListener {
    public final int f37026a;
    public final boolean[] f37027b;

    public hh(int i10, boolean[] zArr) {
        this.f37026a = i10;
        this.f37027b = zArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f37026a;
        boolean[] zArr = this.f37027b;
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
