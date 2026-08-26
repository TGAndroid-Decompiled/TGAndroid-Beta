package org.telegram.ui;

import android.content.DialogInterface;
import java.util.regex.Pattern;

public final class ChatActivity$$ExternalSyntheticLambda413 implements DialogInterface.OnCancelListener {
    public final int $r8$classId;
    public final boolean[] f$0;

    public ChatActivity$$ExternalSyntheticLambda413(int i, boolean[] zArr) {
        this.$r8$classId = i;
        this.f$0 = zArr;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        boolean[] zArr = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                zArr[0] = true;
                break;
            default:
                Pattern pattern = LaunchActivity.PREFIX_T_ME_PATTERN;
                zArr[0] = true;
                break;
        }
    }
}
