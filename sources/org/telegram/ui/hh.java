package org.telegram.ui;

import android.content.DialogInterface;
import java.util.regex.Pattern;
public final class hh implements DialogInterface.OnCancelListener {
    public final int f36999a;
    public final boolean[] f37000b;

    public hh(int i10, boolean[] zArr) {
        this.f36999a = i10;
        this.f37000b = zArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f36999a;
        boolean[] zArr = this.f37000b;
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
