package org.telegram.ui;

import android.content.DialogInterface;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
public final class kz implements DialogInterface.OnCancelListener {
    public final int f35196a;
    public final int f35197b;
    public final int[] f35198c;

    public kz(int i10, int i11, int[] iArr) {
        this.f35196a = i11;
        this.f35197b = i10;
        this.f35198c = iArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f35196a;
        int[] iArr = this.f35198c;
        int i11 = this.f35197b;
        switch (i10) {
            case 0:
                ArrayList arrayList = ExternalActionActivity.f31074x;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
            default:
                Pattern pattern = LaunchActivity.B1;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
        }
    }
}
