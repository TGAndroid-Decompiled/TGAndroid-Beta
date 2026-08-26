package org.telegram.ui.Components;

import android.view.View;
import androidx.dynamicanimation.animation.DynamicAnimation;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Cells.ShareDialogCell;

public final class ShareAlert$$ExternalSyntheticLambda9 implements DynamicAnimation.OnAnimationUpdateListener {
    public final int $r8$classId;
    public final NotificationCenter.NotificationCenterDelegate f$0;
    public final View f$1;
    public final int[] f$2;

    public ShareAlert$$ExternalSyntheticLambda9(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, View view, int[] iArr, int i) {
        this.$r8$classId = i;
        this.f$0 = notificationCenterDelegate;
        this.f$1 = view;
        this.f$2 = iArr;
    }

    @Override
    public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f, float f2) {
        switch (this.$r8$classId) {
            case 0:
                ((ShareAlert) this.f$0).lambda$collapseTopics$22((ShareDialogCell) this.f$1, this.f$2, dynamicAnimation, f, f2);
                break;
            default:
                ((ShareAlert.AnonymousClass27) this.f$0).lambda$didReceivedNotification$0(this.f$1, this.f$2, dynamicAnimation, f, f2);
                break;
        }
    }
}
