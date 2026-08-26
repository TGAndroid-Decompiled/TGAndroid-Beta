package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;

public final class BulletinFactory$$ExternalSyntheticLambda5 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final long f$2;

    public BulletinFactory$$ExternalSyntheticLambda5(Object obj, long j, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$2 = j;
        this.f$1 = obj2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                BulletinFactory.lambda$createForwardedBulletin$7((AlertsCreator$$ExternalSyntheticLambda145) this.f$0, (BaseFragment) this.f$1, this.f$2);
                break;
            case 1:
                ((ChatAttachAlertPhotoLayoutPreview.PreviewGroupsView) this.f$0).lambda$onTouchEvent$2(this.f$2, (ChatAttachAlertPhotoLayoutPreview.PreviewGroupsView.PreviewGroupCell.MediaCell) this.f$1);
                break;
            case 2:
                ((JoinGroupAlert.AnonymousClass1) this.f$0).lambda$onBecomeFullyVisible$0(this.f$2, (TLRPC.Chat) this.f$1);
                break;
            case 3:
                ((ChatActivityEnterView) this.f$0).lambda$didPressedBotButton$91((Runnable) this.f$1, this.f$2);
                break;
            case 4:
                ((ChatAttachAlert) this.f$0).lambda$new$31(this.f$2, (Theme.ResourcesProvider) this.f$1);
                break;
            default:
                ((SharedMediaLayout) this.f$0).lambda$new$16(this.f$2, (MessageObject) this.f$1);
                break;
        }
    }

    public BulletinFactory$$ExternalSyntheticLambda5(Object obj, Object obj2, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = j;
    }
}
