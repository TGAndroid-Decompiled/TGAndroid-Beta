package org.telegram.ui;

import android.content.DialogInterface;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
public final class oz implements DialogInterface.OnCancelListener {
    public final int f39361a;
    public final int f39362b;
    public final int[] f39363c;

    public oz(int i10, int i11, int[] iArr) {
        this.f39361a = i11;
        this.f39362b = i10;
        this.f39363c = iArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f39361a;
        int[] iArr = this.f39363c;
        int i11 = this.f39362b;
        switch (i10) {
            case 0:
                ArrayList arrayList = ExternalActionActivity.f33396x;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
            default:
                Pattern pattern = LaunchActivity.B1;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
        }
    }
}
