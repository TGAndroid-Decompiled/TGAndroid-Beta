package org.telegram.ui;

import android.content.DialogInterface;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
public final class pz implements DialogInterface.OnCancelListener {
    public final int f41116a;
    public final int f41117b;
    public final int[] f41118c;

    public pz(int i10, int i11, int[] iArr) {
        this.f41116a = i11;
        this.f41117b = i10;
        this.f41118c = iArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f41116a;
        int[] iArr = this.f41118c;
        int i11 = this.f41117b;
        switch (i10) {
            case 0:
                ArrayList arrayList = ExternalActionActivity.f33586x;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
            default:
                Pattern pattern = LaunchActivity.B1;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
        }
    }
}
