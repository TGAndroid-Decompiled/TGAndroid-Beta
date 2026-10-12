package org.telegram.ui;

import android.content.DialogInterface;
import java.util.regex.Pattern;
public final class jh implements DialogInterface.OnCancelListener {
    public final int f37380a;
    public final boolean[] f37381b;

    public jh(int i10, boolean[] zArr) {
        this.f37380a = i10;
        this.f37381b = zArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f37380a;
        boolean[] zArr = this.f37381b;
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
