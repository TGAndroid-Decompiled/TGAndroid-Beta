package org.telegram.ui;

import android.content.DialogInterface;
import java.util.regex.Pattern;
public final class ih implements DialogInterface.OnCancelListener {
    public final int f38906a;
    public final boolean[] f38907b;

    public ih(int i10, boolean[] zArr) {
        this.f38906a = i10;
        this.f38907b = zArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f38906a;
        boolean[] zArr = this.f38907b;
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
