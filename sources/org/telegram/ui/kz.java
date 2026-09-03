package org.telegram.ui;

import android.content.DialogInterface;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
public final class kz implements DialogInterface.OnCancelListener {
    public final int f38445a;
    public final int f38446b;
    public final int[] f38447c;

    public kz(int i10, int i11, int[] iArr) {
        this.f38445a = i11;
        this.f38446b = i10;
        this.f38447c = iArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f38445a;
        int[] iArr = this.f38447c;
        int i11 = this.f38446b;
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
