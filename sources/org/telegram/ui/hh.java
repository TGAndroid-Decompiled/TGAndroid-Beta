package org.telegram.ui;

import android.content.DialogInterface;
import java.util.regex.Pattern;
public final class hh implements DialogInterface.OnCancelListener {
    public final int f33388a;
    public final boolean[] f33389b;

    public hh(int i10, boolean[] zArr) {
        this.f33388a = i10;
        this.f33389b = zArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f33388a;
        boolean[] zArr = this.f33389b;
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
