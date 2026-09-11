package org.telegram.ui;

import android.content.DialogInterface;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
public final class oz implements DialogInterface.OnCancelListener {
    public final int f39360a;
    public final int f39361b;
    public final int[] f39362c;

    public oz(int i10, int i11, int[] iArr) {
        this.f39360a = i11;
        this.f39361b = i10;
        this.f39362c = iArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f39360a;
        int[] iArr = this.f39362c;
        int i11 = this.f39361b;
        switch (i10) {
            case 0:
                ArrayList arrayList = ExternalActionActivity.f33395x;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
            default:
                Pattern pattern = LaunchActivity.B1;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
        }
    }
}
