package org.telegram.ui;

import android.content.DialogInterface;
import java.util.regex.Pattern;
public final class jh implements DialogInterface.OnCancelListener {
    public final int f37055a;
    public final boolean[] f37056b;

    public jh(int i10, boolean[] zArr) {
        this.f37055a = i10;
        this.f37056b = zArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f37055a;
        boolean[] zArr = this.f37056b;
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
