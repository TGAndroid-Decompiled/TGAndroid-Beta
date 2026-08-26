package org.telegram.ui.ActionBar;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;

public final class ActionBarLayout$$ExternalSyntheticLambda16 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final boolean f$1;
    public final Object f$2;
    public final boolean f$3;
    public final Object f$4;
    public final Object f$5;

    public ActionBarLayout$$ExternalSyntheticLambda16(MessagesController messagesController, TLRPC.TL_error tL_error, BaseFragment baseFragment, TLRPC.TL_channels_editAdmin tL_channels_editAdmin, boolean z, boolean z2) {
        this.$r8$classId = 1;
        this.f$0 = messagesController;
        this.f$2 = tL_error;
        this.f$4 = baseFragment;
        this.f$5 = tL_channels_editAdmin;
        this.f$1 = z;
        this.f$3 = z2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f$0;
                boolean z = this.f$1;
                BaseFragment baseFragment = (BaseFragment) this.f$4;
                if (z) {
                    actionBarLayout.inPreviewMode = true;
                    actionBarLayout.previewMenu = (ActionBarPopupWindow.ActionBarPopupWindowLayout) this.f$2;
                    actionBarLayout.transitionAnimationPreviewMode = false;
                    actionBarLayout.containerView.setScaleX(1.0f);
                    actionBarLayout.containerView.setScaleY(1.0f);
                } else {
                    actionBarLayout.presentFragmentInternalRemoveOld(baseFragment, this.f$3);
                    actionBarLayout.containerView.setTranslationX(0.0f);
                }
                if (baseFragment != null) {
                    baseFragment.onTransitionAnimationEnd(false, false);
                }
                BaseFragment baseFragment2 = (BaseFragment) this.f$5;
                baseFragment2.onTransitionAnimationEnd(true, false);
                baseFragment2.onBecomeFullyVisible();
                break;
            case 1:
                ((MessagesController) this.f$0).lambda$setUserAdminRole$101((TLRPC.TL_error) this.f$2, (BaseFragment) this.f$4, (TLRPC.TL_channels_editAdmin) this.f$5, this.f$1, this.f$3);
                break;
            case 2:
                ((NotificationsController) this.f$0).lambda$processNewMessages$27((ArrayList) this.f$2, (ArrayList) this.f$4, this.f$1, this.f$3, (CountDownLatch) this.f$5);
                break;
            default:
                ((TwoStepVerificationActivity) this.f$0).lambda$loadPasswordInfo$18((TLRPC.TL_error) this.f$2, (TLObject) this.f$4, this.f$1, this.f$3, (Runnable) this.f$5);
                break;
        }
    }

    public ActionBarLayout$$ExternalSyntheticLambda16(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, Object obj2, boolean z, boolean z2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = notificationCenterDelegate;
        this.f$2 = obj;
        this.f$4 = obj2;
        this.f$1 = z;
        this.f$3 = z2;
        this.f$5 = obj3;
    }

    public ActionBarLayout$$ExternalSyntheticLambda16(ActionBarLayout actionBarLayout, boolean z, ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout, boolean z2, BaseFragment baseFragment, BaseFragment baseFragment2) {
        this.$r8$classId = 0;
        this.f$0 = actionBarLayout;
        this.f$1 = z;
        this.f$2 = actionBarPopupWindowLayout;
        this.f$3 = z2;
        this.f$4 = baseFragment;
        this.f$5 = baseFragment2;
    }
}
