package org.telegram.ui;

import android.content.DialogInterface;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
public final class nz implements DialogInterface.OnCancelListener {
    public final int f40426a;
    public final int f40427b;
    public final int[] f40428c;

    public nz(int i10, int i11, int[] iArr) {
        this.f40426a = i11;
        this.f40427b = i10;
        this.f40428c = iArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f40426a;
        int[] iArr = this.f40428c;
        int i11 = this.f40427b;
        switch (i10) {
            case 0:
                ArrayList arrayList = ExternalActionActivity.f33787x;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
            default:
                Pattern pattern = LaunchActivity.B1;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
        }
    }
}
