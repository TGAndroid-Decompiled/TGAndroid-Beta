package org.telegram.ui;

import android.content.DialogInterface;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
public final class kz implements DialogInterface.OnCancelListener {
    public final int f35286a;
    public final int f35287b;
    public final int[] f35288c;

    public kz(int i10, int i11, int[] iArr) {
        this.f35286a = i11;
        this.f35287b = i10;
        this.f35288c = iArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f35286a;
        int[] iArr = this.f35288c;
        int i11 = this.f35287b;
        switch (i10) {
            case 0:
                ArrayList arrayList = ExternalActionActivity.f31149x;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
            default:
                Pattern pattern = LaunchActivity.B1;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
        }
    }
}
