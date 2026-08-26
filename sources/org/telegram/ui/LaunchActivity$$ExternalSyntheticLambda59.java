package org.telegram.ui;

import android.content.DialogInterface;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;

public final class LaunchActivity$$ExternalSyntheticLambda59 implements DialogInterface.OnCancelListener {
    public final int $r8$classId;
    public final int f$0;
    public final int[] f$1;

    public LaunchActivity$$ExternalSyntheticLambda59(int i, int i2, int[] iArr) {
        this.$r8$classId = i2;
        this.f$0 = i;
        this.f$1 = iArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        int[] iArr = this.f$1;
        int i = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                Pattern pattern = LaunchActivity.PREFIX_T_ME_PATTERN;
                ConnectionsManager.getInstance(i).cancelRequest(iArr[0], true);
                break;
            default:
                ArrayList arrayList = ExternalActionActivity.mainFragmentsStack;
                ConnectionsManager.getInstance(i).cancelRequest(iArr[0], true);
                break;
        }
    }
}
