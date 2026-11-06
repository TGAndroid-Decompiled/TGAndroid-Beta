package org.telegram.ui;

import android.content.DialogInterface;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
public final class px implements DialogInterface.OnCancelListener {
    public final int f48941a;
    public final int f48942b;
    public final int[] f48943c;

    public px(int i7, int i10, int[] iArr) {
        this.f48941a = i10;
        this.f48942b = i7;
        this.f48943c = iArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i7 = this.f48941a;
        int[] iArr = this.f48943c;
        int i10 = this.f48942b;
        switch (i7) {
            case 0:
                ArrayList arrayList = ExternalActionActivity.f41197y;
                ConnectionsManager.getInstance(i10).cancelRequest(iArr[0], true);
                return;
            default:
                String str = LaunchActivity.B1;
                ConnectionsManager.getInstance(i10).cancelRequest(iArr[0], true);
                return;
        }
    }
}
