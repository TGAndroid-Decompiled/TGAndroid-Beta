package org.telegram.ui;

import android.content.DialogInterface;
import java.util.regex.Pattern;
public final class ih implements DialogInterface.OnCancelListener {
    public final int f34481a;
    public final boolean[] f34482b;

    public ih(int i10, boolean[] zArr) {
        this.f34481a = i10;
        this.f34482b = zArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f34481a;
        boolean[] zArr = this.f34482b;
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
