package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;

public final class LaunchActivity$$ExternalSyntheticLambda82 implements Runnable {
    public final int $r8$classId;
    public final LaunchActivity$$ExternalSyntheticLambda13 f$0;

    public LaunchActivity$$ExternalSyntheticLambda82(LaunchActivity$$ExternalSyntheticLambda13 launchActivity$$ExternalSyntheticLambda13, int i) {
        this.$r8$classId = i;
        this.f$0 = launchActivity$$ExternalSyntheticLambda13;
    }

    @Override
    public final void run() {
        LaunchActivity$$ExternalSyntheticLambda13 launchActivity$$ExternalSyntheticLambda13 = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                Pattern pattern = LaunchActivity.PREFIX_T_ME_PATTERN;
                try {
                    launchActivity$$ExternalSyntheticLambda13.run();
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
                break;
            case 1:
                Pattern pattern2 = LaunchActivity.PREFIX_T_ME_PATTERN;
                try {
                    launchActivity$$ExternalSyntheticLambda13.run();
                } catch (Exception e2) {
                    FileLog.e(e2);
                    return;
                }
                break;
            default:
                Pattern pattern3 = LaunchActivity.PREFIX_T_ME_PATTERN;
                try {
                    launchActivity$$ExternalSyntheticLambda13.run();
                } catch (Exception e3) {
                    FileLog.e(e3);
                }
                break;
        }
    }
}
