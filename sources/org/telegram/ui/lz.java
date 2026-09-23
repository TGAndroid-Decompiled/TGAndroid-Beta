package org.telegram.ui;

import android.content.DialogInterface;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
public final class lz implements DialogInterface.OnCancelListener {
    public final int f35109a;
    public final int f35110b;
    public final int[] f35111c;

    public lz(int i10, int i11, int[] iArr) {
        this.f35109a = i11;
        this.f35110b = i10;
        this.f35111c = iArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f35109a;
        int[] iArr = this.f35111c;
        int i11 = this.f35110b;
        switch (i10) {
            case 0:
                ArrayList arrayList = ExternalActionActivity.f30760x;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
            default:
                Pattern pattern = LaunchActivity.B1;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
        }
    }
}
