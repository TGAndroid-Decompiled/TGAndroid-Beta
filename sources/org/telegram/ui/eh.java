package org.telegram.ui;

import android.content.DialogInterface;
import java.util.regex.Pattern;
public final class eh implements DialogInterface.OnCancelListener {
    public final int f36024a;
    public final boolean[] f36025b;

    public eh(int i10, boolean[] zArr) {
        this.f36024a = i10;
        this.f36025b = zArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f36024a;
        boolean[] zArr = this.f36025b;
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
