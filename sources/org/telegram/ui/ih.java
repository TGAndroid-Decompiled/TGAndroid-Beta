package org.telegram.ui;

import android.content.DialogInterface;
import java.util.regex.Pattern;
public final class ih implements DialogInterface.OnCancelListener {
    public final int f34565a;
    public final boolean[] f34566b;

    public ih(int i10, boolean[] zArr) {
        this.f34565a = i10;
        this.f34566b = zArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f34565a;
        boolean[] zArr = this.f34566b;
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
