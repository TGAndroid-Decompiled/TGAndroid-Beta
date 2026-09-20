package org.telegram.ui;

import android.content.DialogInterface;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
public final class oz implements DialogInterface.OnCancelListener {
    public final int f36405a;
    public final int f36406b;
    public final int[] f36407c;

    public oz(int i10, int i11, int[] iArr) {
        this.f36405a = i11;
        this.f36406b = i10;
        this.f36407c = iArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f36405a;
        int[] iArr = this.f36407c;
        int i11 = this.f36406b;
        switch (i10) {
            case 0:
                ArrayList arrayList = ExternalActionActivity.f31073x;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
            default:
                Pattern pattern = LaunchActivity.B1;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
        }
    }
}
