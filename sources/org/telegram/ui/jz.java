package org.telegram.ui;

import android.content.DialogInterface;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
public final class jz implements DialogInterface.OnCancelListener {
    public final int f35530a;
    public final int f35531b;
    public final int[] f35532c;

    public jz(int i10, int i11, int[] iArr) {
        this.f35530a = i11;
        this.f35531b = i10;
        this.f35532c = iArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f35530a;
        int[] iArr = this.f35532c;
        int i11 = this.f35531b;
        switch (i10) {
            case 0:
                ArrayList arrayList = ExternalActionActivity.f31587x;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
            default:
                Pattern pattern = LaunchActivity.f31612y1;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
        }
    }
}
