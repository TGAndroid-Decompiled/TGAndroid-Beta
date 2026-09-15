package org.telegram.ui;

import android.content.DialogInterface;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
public final class oz implements DialogInterface.OnCancelListener {
    public final int f36370a;
    public final int f36371b;
    public final int[] f36372c;

    public oz(int i10, int i11, int[] iArr) {
        this.f36370a = i11;
        this.f36371b = i10;
        this.f36372c = iArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f36370a;
        int[] iArr = this.f36372c;
        int i11 = this.f36371b;
        switch (i10) {
            case 0:
                ArrayList arrayList = ExternalActionActivity.f30789x;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
            default:
                Pattern pattern = LaunchActivity.B1;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
        }
    }
}
