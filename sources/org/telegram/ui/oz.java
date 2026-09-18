package org.telegram.ui;

import android.content.DialogInterface;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
public final class oz implements DialogInterface.OnCancelListener {
    public final int f36277a;
    public final int f36278b;
    public final int[] f36279c;

    public oz(int i10, int i11, int[] iArr) {
        this.f36277a = i11;
        this.f36278b = i10;
        this.f36279c = iArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f36277a;
        int[] iArr = this.f36279c;
        int i11 = this.f36278b;
        switch (i10) {
            case 0:
                ArrayList arrayList = ExternalActionActivity.f31033x;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
            default:
                Pattern pattern = LaunchActivity.B1;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
        }
    }
}
