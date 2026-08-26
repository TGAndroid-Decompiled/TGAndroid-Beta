package org.telegram.ui.Stars;

import android.content.DialogInterface;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.Paint.Views.LPhotoPaintView;

public final class StarsIntroActivity$$ExternalSyntheticLambda83 implements DialogInterface.OnDismissListener {
    public final int $r8$classId = 0;
    public final int f$0;
    public final NotificationCenter.NotificationCenterDelegate f$1;

    public StarsIntroActivity$$ExternalSyntheticLambda83(int i, StarsIntroActivity.AnonymousClass12 anonymousClass12) {
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
                ((LPhotoPaintView) this.f$1).lambda$openStickersView$21(this.f$0, dialogInterface);
                break;
        }
    }

    public StarsIntroActivity$$ExternalSyntheticLambda83(LPhotoPaintView lPhotoPaintView, int i) {
        this.f$1 = lPhotoPaintView;
        this.f$0 = i;
    }
}
