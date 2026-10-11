package org.telegram.ui;

import android.content.DialogInterface;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
public final class mz implements DialogInterface.OnCancelListener {
    public final int f40093a;
    public final int f40094b;
    public final int[] f40095c;

    public mz(int i10, int i11, int[] iArr) {
        this.f40093a = i11;
        this.f40094b = i10;
        this.f40095c = iArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f40093a;
        int[] iArr = this.f40095c;
        int i11 = this.f40094b;
        switch (i10) {
            case 0:
                ArrayList arrayList = ExternalActionActivity.f33777x;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
            default:
                Pattern pattern = LaunchActivity.B1;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
        }
    }
}
