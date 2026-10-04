package org.telegram.ui;

import android.content.DialogInterface;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
public final class oz implements DialogInterface.OnCancelListener {
    public final int f39304a;
    public final int f39305b;
    public final int[] f39306c;

    public oz(int i10, int i11, int[] iArr) {
        this.f39304a = i11;
        this.f39305b = i10;
        this.f39306c = iArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f39304a;
        int[] iArr = this.f39306c;
        int i11 = this.f39305b;
        switch (i10) {
            case 0:
                ArrayList arrayList = ExternalActionActivity.f33746x;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
            default:
                Pattern pattern = LaunchActivity.B1;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
        }
    }
}
