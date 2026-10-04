package org.telegram.ui;

import android.content.DialogInterface;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
public final class oz implements DialogInterface.OnCancelListener {
    public final int f39299a;
    public final int f39300b;
    public final int[] f39301c;

    public oz(int i10, int i11, int[] iArr) {
        this.f39299a = i11;
        this.f39300b = i10;
        this.f39301c = iArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f39299a;
        int[] iArr = this.f39301c;
        int i11 = this.f39300b;
        switch (i10) {
            case 0:
                ArrayList arrayList = ExternalActionActivity.f33740x;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
            default:
                Pattern pattern = LaunchActivity.B1;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
        }
    }
}
