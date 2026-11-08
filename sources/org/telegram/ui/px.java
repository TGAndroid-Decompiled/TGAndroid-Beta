package org.telegram.ui;

import android.content.DialogInterface;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
public final class px implements DialogInterface.OnCancelListener {
    public final int f48970a;
    public final int f48971b;
    public final int[] f48972c;

    public px(int i7, int i10, int[] iArr) {
        this.f48970a = i10;
        this.f48971b = i7;
        this.f48972c = iArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i7 = this.f48970a;
        int[] iArr = this.f48972c;
        int i10 = this.f48971b;
        switch (i7) {
            case 0:
                ArrayList arrayList = ExternalActionActivity.f41225y;
                ConnectionsManager.getInstance(i10).cancelRequest(iArr[0], true);
                return;
            default:
                String str = LaunchActivity.B1;
                ConnectionsManager.getInstance(i10).cancelRequest(iArr[0], true);
                return;
        }
    }
}
