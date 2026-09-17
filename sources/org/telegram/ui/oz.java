package org.telegram.ui;

import android.content.DialogInterface;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
public final class oz implements DialogInterface.OnCancelListener {
    public final int f39388a;
    public final int f39389b;
    public final int[] f39390c;

    public oz(int i10, int i11, int[] iArr) {
        this.f39388a = i11;
        this.f39389b = i10;
        this.f39390c = iArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f39388a;
        int[] iArr = this.f39390c;
        int i11 = this.f39389b;
        switch (i10) {
            case 0:
                ArrayList arrayList = ExternalActionActivity.f33423x;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
            default:
                Pattern pattern = LaunchActivity.B1;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
        }
    }
}
