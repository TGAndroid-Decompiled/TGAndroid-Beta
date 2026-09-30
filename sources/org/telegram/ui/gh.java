package org.telegram.ui;

import android.content.DialogInterface;
import java.util.regex.Pattern;
public final class gh implements DialogInterface.OnCancelListener {
    public final int f34081a;
    public final boolean[] f34082b;

    public gh(int i10, boolean[] zArr) {
        this.f34081a = i10;
        this.f34082b = zArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f34081a;
        boolean[] zArr = this.f34082b;
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
