package org.telegram.ui;

import android.content.DialogInterface;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
public final class kz implements DialogInterface.OnCancelListener {
    public final int f35165a;
    public final int f35166b;
    public final int[] f35167c;

    public kz(int i10, int i11, int[] iArr) {
        this.f35165a = i11;
        this.f35166b = i10;
        this.f35167c = iArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f35165a;
        int[] iArr = this.f35167c;
        int i11 = this.f35166b;
        switch (i10) {
            case 0:
                ArrayList arrayList = ExternalActionActivity.f31061x;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
            default:
                Pattern pattern = LaunchActivity.B1;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                return;
        }
    }
}
