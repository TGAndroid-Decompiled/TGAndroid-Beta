package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.RLottieDrawable;

public final class QrActivity$QrView$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final QrActivity.QrView f$0;

    public QrActivity$QrView$$ExternalSyntheticLambda0(QrActivity.QrView qrView, int i) {
        this.$r8$classId = i;
        this.f$0 = qrView;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                QrActivity.QrView qrView = this.f$0;
                AndroidUtilities.cancelRunOnUIThread(qrView.checkTimerToken);
                boolean z = qrView.hasTimer;
                if (z) {
                    if (z && qrView.loadingMatrix == null) {
                        RLottieDrawable rLottieDrawable = new RLottieDrawable(R.raw.qr_matrix, "qr_matrix", AndroidUtilities.dp(200.0f), AndroidUtilities.dp(200.0f), true, null);
                        qrView.loadingMatrix = rLottieDrawable;
                        rLottieDrawable.masterParent = qrView;
                        rLottieDrawable.getPaint().setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                        qrView.loadingMatrix.setAutoRepeat(1);
                        qrView.loadingMatrix.start();
                    }
                    if (qrView.linkExpires == 0 || System.currentTimeMillis() / 1000 >= qrView.linkExpires) {
                        if (qrView.linkExpires != 0) {
                            qrView.link = null;
                            Utilities.themeQueue.postRunnable(new QrActivity$QrView$$ExternalSyntheticLambda1(qrView, qrView.getWidth(), qrView.getHeight(), 2));
                            qrView.timerTextDrawable.setText("", true, true);
                        }
                        MessagesController.getInstance(UserConfig.selectedAccount).requestContactToken(qrView.linkExpires == 0 ? 750L : 1750L, new PollItemMenu$$ExternalSyntheticLambda14(qrView, 27));
                    }
                    int i = qrView.linkExpires;
                    if (i > 0 && qrView.link != null) {
                        long jMax = Math.max(0L, (((long) i) - (System.currentTimeMillis() / 1000)) - 1);
                        int i2 = (int) (jMax % 60);
                        int iMin = Math.min(99, (int) (jMax / 60));
                        QrActivity.QrView.AnonymousClass1 anonymousClass1 = qrView.timerTextDrawable;
                        StringBuilder sb = new StringBuilder();
                        sb.append(iMin < 10 ? "0" : "");
                        sb.append(iMin);
                        sb.append(":");
                        sb.append(i2 < 10 ? "0" : "");
                        sb.append(i2);
                        anonymousClass1.setText(sb.toString(), true, false);
                    }
                    if (qrView.isAttachedToWindow()) {
                        AndroidUtilities.runOnUIThread(qrView.checkTimerToken, 1000L);
                    }
                    break;
                }
                break;
            default:
                QrActivity.QrView qrView2 = this.f$0;
                qrView2.firstPrepare = false;
                Bitmap bitmap = qrView2.contentBitmap;
                if (bitmap != null) {
                    qrView2.contentBitmap = null;
                    qrView2.contentBitmapAlpha.set(0.0f, true);
                    Bitmap bitmap2 = qrView2.oldContentBitmap;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                    }
                    qrView2.oldContentBitmap = bitmap;
                    qrView2.invalidate();
                }
                break;
        }
    }
}
