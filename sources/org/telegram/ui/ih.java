package org.telegram.ui;

import android.content.DialogInterface;
import java.util.regex.Pattern;
public final class ih implements DialogInterface.OnCancelListener {
    public final int f34528a;
    public final boolean[] f34529b;

    public ih(int i10, boolean[] zArr) {
        this.f34528a = i10;
        this.f34529b = zArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f34528a;
        boolean[] zArr = this.f34529b;
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
