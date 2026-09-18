package org.telegram.ui;

import android.content.DialogInterface;
import java.util.regex.Pattern;
public final class ih implements DialogInterface.OnCancelListener {
    public final int f34570a;
    public final boolean[] f34571b;

    public ih(int i10, boolean[] zArr) {
        this.f34570a = i10;
        this.f34571b = zArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f34570a;
        boolean[] zArr = this.f34571b;
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
