package org.telegram.ui;

import android.content.DialogInterface;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
public final class mx implements DialogInterface.OnCancelListener {
    public final int f47807a;
    public final int f47808b;
    public final int[] f47809c;

    public mx(int i3, int i10, int[] iArr) {
        this.f47807a = i10;
        this.f47808b = i3;
        this.f47809c = iArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i3 = this.f47807a;
        int[] iArr = this.f47809c;
        int i10 = this.f47808b;
        switch (i3) {
            case 0:
                ArrayList arrayList = ExternalActionActivity.f41254y;
                ConnectionsManager.getInstance(i10).cancelRequest(iArr[0], true);
                return;
            default:
                String str = LaunchActivity.E1;
                ConnectionsManager.getInstance(i10).cancelRequest(iArr[0], true);
                return;
        }
    }
}
