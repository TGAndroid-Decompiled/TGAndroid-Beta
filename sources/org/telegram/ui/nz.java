package org.telegram.ui;

import android.content.DialogInterface;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
public final class nz implements DialogInterface.OnCancelListener {
    public final int f36109a;
    public final int f36110b;
    public final int[] f36111c;

    public nz(int i10, int i11, int[] iArr) {
        this.f36109a = i11;
        this.f36110b = i10;
        this.f36111c = iArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f36109a;
        int[] iArr = this.f36111c;
        int i11 = this.f36110b;
        switch (i10) {
            case 0:
                ArrayList arrayList = ExternalActionActivity.f31077x;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
            default:
                Pattern pattern = LaunchActivity.B1;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
        }
    }
}
