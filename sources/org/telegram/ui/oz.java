package org.telegram.ui;

import android.content.DialogInterface;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
public final class oz implements DialogInterface.OnCancelListener {
    public final int f39314a;
    public final int f39315b;
    public final int[] f39316c;

    public oz(int i10, int i11, int[] iArr) {
        this.f39314a = i11;
        this.f39315b = i10;
        this.f39316c = iArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f39314a;
        int[] iArr = this.f39316c;
        int i11 = this.f39315b;
        switch (i10) {
            case 0:
                ArrayList arrayList = ExternalActionActivity.f33759x;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
            default:
                Pattern pattern = LaunchActivity.B1;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
        }
    }
}
