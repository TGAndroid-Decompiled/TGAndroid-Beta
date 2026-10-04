package org.telegram.ui;

import android.content.DialogInterface;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
public final class oz implements DialogInterface.OnCancelListener {
    public final int f39298a;
    public final int f39299b;
    public final int[] f39300c;

    public oz(int i10, int i11, int[] iArr) {
        this.f39298a = i11;
        this.f39299b = i10;
        this.f39300c = iArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f39298a;
        int[] iArr = this.f39300c;
        int i11 = this.f39299b;
        switch (i10) {
            case 0:
                ArrayList arrayList = ExternalActionActivity.f33739x;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
            default:
                Pattern pattern = LaunchActivity.B1;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
        }
    }
}
