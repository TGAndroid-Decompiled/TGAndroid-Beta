package org.telegram.ui;

import android.content.DialogInterface;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
public final class kz implements DialogInterface.OnCancelListener {
    public final int f38534a;
    public final int f38535b;
    public final int[] f38536c;

    public kz(int i10, int i11, int[] iArr) {
        this.f38534a = i11;
        this.f38535b = i10;
        this.f38536c = iArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f38534a;
        int[] iArr = this.f38536c;
        int i11 = this.f38535b;
        switch (i10) {
            case 0:
                ArrayList arrayList = ExternalActionActivity.f34106x;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
            default:
                Pattern pattern = LaunchActivity.f34134y1;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
        }
    }
}
