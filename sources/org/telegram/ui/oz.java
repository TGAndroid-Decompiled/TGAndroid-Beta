package org.telegram.ui;

import android.content.DialogInterface;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
public final class oz implements DialogInterface.OnCancelListener {
    public final int f39387a;
    public final int f39388b;
    public final int[] f39389c;

    public oz(int i10, int i11, int[] iArr) {
        this.f39387a = i11;
        this.f39388b = i10;
        this.f39389c = iArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f39387a;
        int[] iArr = this.f39389c;
        int i11 = this.f39388b;
        switch (i10) {
            case 0:
                ArrayList arrayList = ExternalActionActivity.f33422x;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
            default:
                Pattern pattern = LaunchActivity.B1;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
        }
    }
}
