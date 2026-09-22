package org.telegram.ui;

import android.content.DialogInterface;
import java.util.regex.Pattern;
public final class jh implements DialogInterface.OnCancelListener {
    public final int f34951a;
    public final boolean[] f34952b;

    public jh(int i10, boolean[] zArr) {
        this.f34951a = i10;
        this.f34952b = zArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f34951a;
        boolean[] zArr = this.f34952b;
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
