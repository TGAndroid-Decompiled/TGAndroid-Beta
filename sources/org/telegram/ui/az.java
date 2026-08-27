package org.telegram.ui;

import android.content.DialogInterface;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;

public final class az implements DialogInterface.OnCancelListener {

    public final int f36653a;

    public final int f36654b;

    public final int[] f36655c;

    public az(int i10, int i11, int[] iArr) {
        this.f36653a = i11;
        this.f36654b = i10;
        this.f36655c = iArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f36653a;
        int[] iArr = this.f36655c;
        int i11 = this.f36654b;
        switch (i10) {
            case 0:
                ArrayList arrayList = ExternalActionActivity.f35468x;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                break;
            default:
                Pattern pattern = LaunchActivity.f35496x1;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                break;
        }
    }
}
