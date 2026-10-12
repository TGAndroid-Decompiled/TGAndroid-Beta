package org.telegram.ui;

import android.content.DialogInterface;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
public final class pz implements DialogInterface.OnCancelListener {
    public final int f41118a;
    public final int f41119b;
    public final int[] f41120c;

    public pz(int i10, int i11, int[] iArr) {
        this.f41118a = i11;
        this.f41119b = i10;
        this.f41120c = iArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f41118a;
        int[] iArr = this.f41120c;
        int i11 = this.f41119b;
        switch (i10) {
            case 0:
                ArrayList arrayList = ExternalActionActivity.f33588x;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
            default:
                Pattern pattern = LaunchActivity.B1;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
        }
    }
}
