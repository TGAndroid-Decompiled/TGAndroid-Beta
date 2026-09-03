package org.telegram.ui;

import android.content.DialogInterface;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
public final class a90 implements DialogInterface.OnDismissListener {
    public final int f32519a;
    public final LaunchActivity f32520b;

    public a90(LaunchActivity launchActivity, int i10) {
        this.f32519a = i10;
        this.f32520b = launchActivity;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f32519a;
        LaunchActivity launchActivity = this.f32520b;
        switch (i10) {
            case 0:
                launchActivity.f31623s1 = false;
                return;
            case 1:
                Pattern pattern = LaunchActivity.f31586y1;
                AndroidUtilities.runOnUIThread(new z80(launchActivity, 9), 30000L);
                return;
            default:
                Pattern pattern2 = LaunchActivity.f31586y1;
                AndroidUtilities.runOnUIThread(new z80(launchActivity, 10), 30000L);
                return;
        }
    }
}
