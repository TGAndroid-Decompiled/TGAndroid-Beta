package org.telegram.ui;

import android.content.DialogInterface;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
public final class kz implements DialogInterface.OnCancelListener {
    public final int f35197a;
    public final int f35198b;
    public final int[] f35199c;

    public kz(int i10, int i11, int[] iArr) {
        this.f35197a = i11;
        this.f35198b = i10;
        this.f35199c = iArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f35197a;
        int[] iArr = this.f35199c;
        int i11 = this.f35198b;
        switch (i10) {
            case 0:
                ArrayList arrayList = ExternalActionActivity.f31075x;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
            default:
                Pattern pattern = LaunchActivity.B1;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
        }
    }
}
