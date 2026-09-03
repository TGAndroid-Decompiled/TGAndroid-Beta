package org.telegram.ui;

import android.content.DialogInterface;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
public final class lz implements DialogInterface.OnCancelListener {
    public final int f35942a;
    public final int f35943b;
    public final int[] f35944c;

    public lz(int i10, int i11, int[] iArr) {
        this.f35942a = i11;
        this.f35943b = i10;
        this.f35944c = iArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f35942a;
        int[] iArr = this.f35944c;
        int i11 = this.f35943b;
        switch (i10) {
            case 0:
                ArrayList arrayList = ExternalActionActivity.f31561x;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
            default:
                Pattern pattern = LaunchActivity.f31586y1;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
        }
    }
}
