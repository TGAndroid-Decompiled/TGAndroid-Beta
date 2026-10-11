package org.telegram.ui;

import android.content.DialogInterface;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
public final class mz implements DialogInterface.OnCancelListener {
    public final int f40127a;
    public final int f40128b;
    public final int[] f40129c;

    public mz(int i10, int i11, int[] iArr) {
        this.f40127a = i11;
        this.f40128b = i10;
        this.f40129c = iArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f40127a;
        int[] iArr = this.f40129c;
        int i11 = this.f40128b;
        switch (i10) {
            case 0:
                ArrayList arrayList = ExternalActionActivity.f33811x;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
            default:
                Pattern pattern = LaunchActivity.B1;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
        }
    }
}
