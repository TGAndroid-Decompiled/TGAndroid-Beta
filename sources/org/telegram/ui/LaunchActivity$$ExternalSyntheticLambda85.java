package org.telegram.ui;

import android.content.DialogInterface;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;

public final class LaunchActivity$$ExternalSyntheticLambda85 implements DialogInterface.OnCancelListener {
    public final int $r8$classId = 0;
    public final int f$0;
    public final int[] f$1;
    public final Runnable f$2;

    public LaunchActivity$$ExternalSyntheticLambda85(int i, int[] iArr, LaunchActivity$$ExternalSyntheticLambda13 launchActivity$$ExternalSyntheticLambda13) {
        this.f$0 = i;
        this.f$1 = iArr;
        this.f$2 = launchActivity$$ExternalSyntheticLambda13;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) throws Throwable {
        Runnable runnable = this.f$2;
        int i = this.f$0;
        int[] iArr = this.f$1;
        switch (this.$r8$classId) {
            case 0:
                Pattern pattern = LaunchActivity.PREFIX_T_ME_PATTERN;
                ConnectionsManager.getInstance(i).cancelRequest(iArr[0], true);
                LaunchActivity$$ExternalSyntheticLambda13 launchActivity$$ExternalSyntheticLambda13 = (LaunchActivity$$ExternalSyntheticLambda13) runnable;
                if (launchActivity$$ExternalSyntheticLambda13 != null) {
                    launchActivity$$ExternalSyntheticLambda13.run();
                }
                break;
            default:
                for (int i2 : iArr) {
                    if (i2 != 0) {
                        ConnectionsManager.getInstance(i).cancelRequest(i2, true);
                    }
                }
                ChatActivity$$ExternalSyntheticLambda5 chatActivity$$ExternalSyntheticLambda5 = (ChatActivity$$ExternalSyntheticLambda5) runnable;
                if (chatActivity$$ExternalSyntheticLambda5 != null) {
                    chatActivity$$ExternalSyntheticLambda5.run();
                }
                break;
        }
    }

    public LaunchActivity$$ExternalSyntheticLambda85(int[] iArr, int i, ChatActivity$$ExternalSyntheticLambda5 chatActivity$$ExternalSyntheticLambda5) {
        this.f$1 = iArr;
        this.f$0 = i;
        this.f$2 = chatActivity$$ExternalSyntheticLambda5;
    }
}
