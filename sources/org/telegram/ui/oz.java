package org.telegram.ui;

import android.content.DialogInterface;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
public final class oz implements DialogInterface.OnCancelListener {
    public final int f36373a;
    public final int f36374b;
    public final int[] f36375c;

    public oz(int i10, int i11, int[] iArr) {
        this.f36373a = i11;
        this.f36374b = i10;
        this.f36375c = iArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f36373a;
        int[] iArr = this.f36375c;
        int i11 = this.f36374b;
        switch (i10) {
            case 0:
                ArrayList arrayList = ExternalActionActivity.f30786x;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
            default:
                Pattern pattern = LaunchActivity.B1;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
        }
    }
}
