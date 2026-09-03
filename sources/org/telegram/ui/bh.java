package org.telegram.ui;

import android.content.DialogInterface;
import java.util.regex.Pattern;
public final class bh implements DialogInterface.OnCancelListener {
    public final int f32884a;
    public final boolean[] f32885b;

    public bh(int i10, boolean[] zArr) {
        this.f32884a = i10;
        this.f32885b = zArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f32884a;
        boolean[] zArr = this.f32885b;
        switch (i10) {
            case 0:
                zArr[0] = true;
                return;
            default:
                Pattern pattern = LaunchActivity.f31586y1;
                zArr[0] = true;
                return;
        }
    }
}
