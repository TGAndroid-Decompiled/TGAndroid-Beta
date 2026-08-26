package org.telegram.ui;

import android.animation.AnimatorSet;
import org.telegram.ui.Components.BulletinFactory;

public final class VoIPFragment$8$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;

    public VoIPFragment$8$$ExternalSyntheticLambda1(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((VoIPFragment.AnonymousClass8) this.f$0).lambda$onAccept$0();
                break;
            case 1:
                ((PrivacyControlActivity.MessageCell) this.f$0).invalidate();
                break;
            case 2:
                ((ProfileActivity.AnonymousClass13) this.f$0).lambda$onAllAnimationsDone$0();
                break;
            case 3:
                ((ProfileActivity.AnonymousClass20) this.f$0).lambda$dispatchDraw$0();
                break;
            case 4:
                ((ProfileActivity.AnonymousClass6) this.f$0).lambda$onItemClick$1();
                break;
            case 5:
                ((ProfileActivity.AnonymousClass7) this.f$0).lambda$onMeasure$0();
                break;
            case 6:
                ((ProfileActivity.AnonymousClass9) this.f$0).lambda$onAttachedToWindow$1();
                break;
            case 7:
                ((ProfileActivity.NestedFrameLayout) this.f$0).lambda$onNestedScroll$0();
                break;
            case 8:
                ((ProfileActivity.PagerIndicatorView) this.f$0).updateAvatarItemsInternal();
                break;
            case 9:
                ((ProfileActivity2.ContainerView) this.f$0).lambda$onNestedScroll$0();
                break;
            case 10:
                ProfileBirthdayEffect.ImageReceiverAsset.AnonymousClass1.lambda$didSetImage$0((Runnable[]) this.f$0);
                break;
            case 11:
                ReportBottomSheet.AnonymousClass3.lambda$onReported$0((BulletinFactory) this.f$0);
                break;
            case 12:
                ((SecretMediaViewer.AnonymousClass17) this.f$0).lambda$onAnimationEnd$0();
                break;
            case 13:
                ((SecretVoicePlayer.AnonymousClass5) this.f$0).lambda$onRenderedFirstFrame$0();
                break;
            case 14:
                ((SelectChatUserSheet.AnonymousClass2) this.f$0).lambda$$0();
                break;
            case 15:
                ((TopicsFragment.AnonymousClass10) this.f$0).lambda$onLayoutChildren$0();
                break;
            case 16:
                ((TopicsFragment.AnonymousClass2) this.f$0).lambda$onItemClick$5();
                break;
            case 17:
                ((VoIPFragment.AnonymousClass12) this.f$0).lambda$onFirstFrameRendered$0();
                break;
            case 18:
                ((VoIPFragment.AnonymousClass13) this.f$0).lambda$onFirstFrameRendered$0();
                break;
            case 19:
                ((VoIPFragment.AnonymousClass14) this.f$0).lambda$onAnimationEnd$0();
                break;
            case 20:
                ((TodoItemMenu$$ExternalSyntheticLambda2) this.f$0).run();
                break;
            case 21:
                ((ArchiveSettingsActivity) this.f$0).lambda$createView$0();
                break;
            case 22:
                ((ArticleViewer.BlockChannelCell) this.f$0).setState(2, false);
                break;
            case 23:
                ((AnimatorSet) this.f$0).start();
                break;
            case 24:
                ((ArticleViewer.BlockPhotoCell) this.f$0).lambda$onMeasure$0();
                break;
            case 25:
                ((ArticleViewer.Sheet) this.f$0).lambda$dismiss$1();
                break;
            case 26:
                ((ArticleViewer.WebpageAdapter) this.f$0).lambda$new$1();
                break;
            case 27:
                ((CacheChatsExceptionsFragment) this.f$0).lambda$createView$2();
                break;
            case 28:
                ((ChangeNameActivity) this.f$0).lambda$onTransitionAnimationEnd$4();
                break;
            default:
                ((ChangeUsernameActivity) this.f$0).lambda$createView$1();
                break;
        }
    }
}
