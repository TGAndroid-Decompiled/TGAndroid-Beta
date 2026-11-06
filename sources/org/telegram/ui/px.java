package org.telegram.ui;

import android.content.DialogInterface;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
public final class px implements DialogInterface.OnCancelListener {
    public final int f48967a;
    public final int f48968b;
    public final int[] f48969c;

    public px(int i7, int i10, int[] iArr) {
        this.f48967a = i10;
        this.f48968b = i7;
        this.f48969c = iArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i7 = this.f48967a;
        int[] iArr = this.f48969c;
        int i10 = this.f48968b;
        switch (i7) {
            case 0:
                ArrayList arrayList = ExternalActionActivity.f41221y;
                ConnectionsManager.getInstance(i10).cancelRequest(iArr[0], true);
                return;
            default:
                String str = LaunchActivity.B1;
                ConnectionsManager.getInstance(i10).cancelRequest(iArr[0], true);
                return;
        }
    }
}
