package org.telegram.ui;

public final class PhotoViewer$$ExternalSyntheticLambda60 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;

    public PhotoViewer$$ExternalSyntheticLambda60(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((PhotoViewer.FrameLayoutDrawer) this.f$0).invalidate();
                break;
            case 1:
                ((LaunchActivity.AnonymousClass3) this.f$0).lambda$onLayoutChange$0();
                break;
            case 2:
                ((LinkManager.AnonymousClass2) this.f$0).performShare();
                break;
            case 3:
                ((LocationActivity.NestedFrameLayout) this.f$0).lambda$onNestedScroll$0();
                break;
            case 4:
                ((LoginActivity.LoginActivityPhraseView.AnonymousClass1) this.f$0).lambda$onTextContextMenuItem$0();
                break;
            case 5:
                ((LoginActivity.LoginActivityPhraseView.AnonymousClass4) this.f$0).lambda$run$0();
                break;
            case 6:
                ((LoginActivity.LoginActivitySmsView.AnonymousClass7) this.f$0).lambda$run$0();
                break;
            case 7:
                ((LoginActivity.LoginActivitySmsView.AnonymousClass8) this.f$0).lambda$run$0();
                break;
            case 8:
                ((NewContactBottomSheet.AnonymousClass2) this.f$0).lambda$didSelectCountry$0();
                break;
            case 9:
                ((PasscodeActivity.AnonymousClass8) this.f$0).lambda$processNextPressed$0();
                break;
            case 10:
                ((PassportActivity.AnonymousClass3) this.f$0).lambda$onItemClick$4();
                break;
            case 11:
                ((PassportActivity.AnonymousClass8) this.f$0).lambda$run$11();
                break;
            case 12:
                ((PassportActivity.PhoneConfirmationView.AnonymousClass4) this.f$0).lambda$run$0();
                break;
            case 13:
                ((PassportActivity.PhoneConfirmationView.AnonymousClass5) this.f$0).lambda$run$2();
                break;
            case 14:
                ((PaymentFormActivity.AnonymousClass19) this.f$0).lambda$onRenderProcessGone$0();
                break;
            case 15:
                ((PaymentFormActivity.AnonymousClass26) this.f$0).lambda$onSuccess$0();
                break;
            case 16:
                ((PaymentFormActivity.AnonymousClass6) this.f$0).lambda$onRenderProcessGone$0();
                break;
            case 17:
                ((PhotoPickerActivity.AnonymousClass4) this.f$0).lambda$$0();
                break;
            case 18:
                ((PhotoPickerActivity.AnonymousClass5) this.f$0).lambda$onMeasure$0();
                break;
            case 19:
                ((PhotoViewer.AnonymousClass27) this.f$0).lambda$seekTo$0();
                break;
            case 20:
                ((PhotoViewer.AnonymousClass38) this.f$0).lambda$onDismiss$0();
                break;
            case 21:
                ((PhotoViewer.AnonymousClass40) this.f$0).lambda$dismissInternal$1();
                break;
            case 22:
                ((PhotoViewer.AnonymousClass41.AnonymousClass1) this.f$0).lambda$onAnimationEnd$0();
                break;
            case 23:
                ((PhotoViewer.AnonymousClass59) this.f$0).lambda$onVideoThumbClick$0();
                break;
            case 24:
                ((PhotoViewer.AnonymousClass77.AnonymousClass1) this.f$0).lambda$onAnimationEnd$0();
                break;
            case 25:
                ((PhotoViewer.AnonymousClass80) this.f$0).lambda$onAnimationEnd$0();
                break;
            case 26:
                ((PhotoViewer.BackgroundDrawable) this.f$0).checkAllowDrawContent();
                break;
            case 27:
                ((PhotoViewer.FirstFrameView) this.f$0).lambda$checkFromPlayer$1();
                break;
            case 28:
                ((PhotoViewer.PhotoViewerWindowView) this.f$0).lambda$onLayout$0();
                break;
            default:
                ((PremiumPreviewFragment.Adapter) this.f$0).lambda$onBindViewHolder$0();
                break;
        }
    }
}
