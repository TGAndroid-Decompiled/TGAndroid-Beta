package org.telegram.ui;

import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.SpringAnimation;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.R;
import org.telegram.ui.Cells.ShareDialogCell;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.Bulletin$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.SenderSelectPopup;
import org.telegram.ui.Components.SenderSelectView;
import org.telegram.ui.Components.ShareAlert;

public final class CameraScanActivity$$ExternalSyntheticLambda14 implements DynamicAnimation.OnAnimationEndListener {
    public final int $r8$classId;
    public final Object f$0;

    public CameraScanActivity$$ExternalSyntheticLambda14(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
        switch (this.$r8$classId) {
            case 0:
                CameraScanActivity cameraScanActivity = (CameraScanActivity) this.f$0;
                SpringAnimation springAnimation = cameraScanActivity.qrAppearing;
                if (springAnimation != null) {
                    springAnimation.cancel();
                    cameraScanActivity.qrAppearing = null;
                }
                break;
            case 1:
                ((ShareDialogCell) this.f$0).topicTextView.setTag(R.id.spring_tag, null);
                break;
            case 2:
                Bulletin bulletin = (Bulletin) this.f$0;
                if (bulletin.bottomOffsetSpring == dynamicAnimation) {
                    bulletin.bottomOffsetSpring = null;
                }
                break;
            case 3:
                if (!z) {
                    ((Bulletin$$ExternalSyntheticLambda0) this.f$0).run();
                }
                break;
            case 4:
                SenderSelectPopup senderSelectPopup = (SenderSelectPopup) this.f$0;
                senderSelectPopup.runningCustomSprings = false;
                senderSelectPopup.dismiss();
                break;
            case 5:
                SenderSelectView senderSelectView = (SenderSelectView) this.f$0;
                senderSelectView.scaleIn = false;
                senderSelectView.scaleOut = false;
                if (!z) {
                    dynamicAnimation.cancel();
                }
                if (dynamicAnimation == senderSelectView.menuSpring) {
                    senderSelectView.menuSpring = null;
                }
                break;
            case 6:
                ShareAlert shareAlert = (ShareAlert) this.f$0;
                shareAlert.topicsGridView.setVisibility(8);
                shareAlert.topicsBackActionBar.setVisibility(8);
                ShareAlert.ShareTopicsAdapter shareTopicsAdapter = shareAlert.shareTopicsAdapter;
                shareTopicsAdapter.topics = null;
                shareTopicsAdapter.mObservable.notifyChanged();
                shareAlert.topicsAnimation = null;
                shareAlert.searchWasVisibleBeforeTopics = false;
                break;
            case 7:
                ShareAlert shareAlert2 = ShareAlert.this;
                shareAlert2.gridView.setVisibility(8);
                shareAlert2.searchGridView.setVisibility(8);
                shareAlert2.searchView.setVisibility(8);
                shareAlert2.topicsAnimation = null;
                break;
            case 8:
                PaymentFormActivity.BottomFrameLayout bottomFrameLayout = (PaymentFormActivity.BottomFrameLayout) this.f$0;
                if (dynamicAnimation == bottomFrameLayout.springAnimation) {
                    bottomFrameLayout.springAnimation = null;
                }
                break;
            case 9:
                ((PhotoViewer.CaptionScrollView) this.f$0).onScrollEnd();
                break;
            default:
                ((AnimationNotificationsLocker) this.f$0).unlock();
                break;
        }
    }
}
