package org.telegram.ui;

import android.graphics.Bitmap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.ui.Components.RLottieDrawable;

public final class QrActivity$$ExternalSyntheticLambda6 implements Runnable {
    public final int $r8$classId;
    public final QrActivity f$0;

    public QrActivity$$ExternalSyntheticLambda6(QrActivity qrActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = qrActivity;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$createView$6$9$1();
                break;
            case 1:
                QrActivity.ThemeListViewController themeListViewController = this.f$0.themesViewController;
                if (themeListViewController != null) {
                    themeListViewController.shareButton.setClickable(true);
                    break;
                }
                break;
            case 2:
                QrActivity qrActivity = this.f$0;
                qrActivity.onItemSelected(0, qrActivity.currentTheme, true);
                RLottieDrawable animatedDrawable = qrActivity.logoImageView.getAnimatedDrawable();
                if (qrActivity.logoOptimal == null && animatedDrawable != null) {
                    qrActivity.logoOptimal = Bitmap.createBitmap(animatedDrawable.width, animatedDrawable.height, Bitmap.Config.ARGB_8888);
                    animatedDrawable.prepareForGenerateCache();
                    animatedDrawable.generateCacheFramePointer = 33;
                    animatedDrawable.getNextFrame(qrActivity.logoOptimal);
                    animatedDrawable.releaseForGenerateCache();
                    break;
                }
                break;
            case 3:
                int i = R.raw.default_pattern;
                QrActivity qrActivity2 = this.f$0;
                AndroidUtilities.runOnUIThread(new QrActivity$$ExternalSyntheticLambda17(0, qrActivity2, SvgHelper.getBitmap(i, qrActivity2.backgroundView.getWidth(), qrActivity2.backgroundView.getHeight(), -16777216)));
                break;
            case 4:
                this.f$0.lambda$onItemSelected$13();
                break;
            default:
                this.f$0.lambda$createView$7$3$2();
                break;
        }
    }
}
