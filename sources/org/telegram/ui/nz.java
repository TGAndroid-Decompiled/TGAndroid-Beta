package org.telegram.ui;

import android.content.DialogInterface;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
public final class nz implements DialogInterface.OnCancelListener {
    public final int f40380a;
    public final int f40381b;
    public final int[] f40382c;

    public nz(int i10, int i11, int[] iArr) {
        this.f40380a = i11;
        this.f40381b = i10;
        this.f40382c = iArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f40380a;
        int[] iArr = this.f40382c;
        int i11 = this.f40381b;
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
