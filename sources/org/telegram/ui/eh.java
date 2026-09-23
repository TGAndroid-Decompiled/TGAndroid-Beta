package org.telegram.ui;

import android.content.DialogInterface;
import java.util.regex.Pattern;
public final class eh implements DialogInterface.OnCancelListener {
    public final int f32921a;
    public final boolean[] f32922b;

    public eh(int i10, boolean[] zArr) {
        this.f32921a = i10;
        this.f32922b = zArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f32921a;
        boolean[] zArr = this.f32922b;
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
