package org.telegram.ui;

import android.content.DialogInterface;
import java.util.regex.Pattern;
public final class eh implements DialogInterface.OnCancelListener {
    public final int f36023a;
    public final boolean[] f36024b;

    public eh(int i10, boolean[] zArr) {
        this.f36023a = i10;
        this.f36024b = zArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f36023a;
        boolean[] zArr = this.f36024b;
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
