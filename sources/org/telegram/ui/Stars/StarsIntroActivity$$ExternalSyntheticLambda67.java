package org.telegram.ui.Stars;

import android.content.DialogInterface;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.Paint.Views.LPhotoPaintView;
import org.telegram.ui.PhotoViewer;

public final class StarsIntroActivity$$ExternalSyntheticLambda67 implements DialogInterface.OnDismissListener {
    public final int $r8$classId = 0;
    public final int f$0;
    public final NotificationCenter.NotificationCenterDelegate f$1;

    public StarsIntroActivity$$ExternalSyntheticLambda67(int i, StarsIntroActivity.AnonymousClass12 anonymousClass12) {
        this.f$0 = i;
        this.f$1 = anonymousClass12;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.$r8$classId) {
            case 0:
                NotificationCenter.getInstance(this.f$0).removeObserver((StarsIntroActivity.AnonymousClass12) this.f$1, NotificationCenter.starSubscriptionsLoaded);
                break;
            default:
                LPhotoPaintView lPhotoPaintView = (LPhotoPaintView) this.f$1;
                lPhotoPaintView.getClass();
                PhotoViewer photoViewer = PhotoViewer.this;
                if (photoViewer.videoPlayer != null) {
                    photoViewer.manuallyPaused = false;
                    photoViewer.cancelVideoPlayRunnable();
                    photoViewer.videoPlayer.play();
                }
                lPhotoPaintView.switchTab(this.f$0);
                break;
        }
    }

    public StarsIntroActivity$$ExternalSyntheticLambda67(LPhotoPaintView lPhotoPaintView, int i) {
        this.f$1 = lPhotoPaintView;
        this.f$0 = i;
    }
}
