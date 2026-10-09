package org.telegram.ui;

import android.content.DialogInterface;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
public final class nz implements DialogInterface.OnCancelListener {
    public final int f40382a;
    public final int f40383b;
    public final int[] f40384c;

    public nz(int i10, int i11, int[] iArr) {
        this.f40382a = i11;
        this.f40383b = i10;
        this.f40384c = iArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f40382a;
        int[] iArr = this.f40384c;
        int i11 = this.f40383b;
        switch (i10) {
            case 0:
                ArrayList arrayList = ExternalActionActivity.f33749x;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
            default:
                Pattern pattern = LaunchActivity.B1;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
        }
    }
}
