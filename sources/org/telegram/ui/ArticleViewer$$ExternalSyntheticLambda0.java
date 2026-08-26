package org.telegram.ui;

import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.LineProgressView;
import org.telegram.ui.web.WebBrowserSettings;

public final class ArticleViewer$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final ArticleViewer f$0;

    public ArticleViewer$$ExternalSyntheticLambda0(ArticleViewer articleViewer, int i) {
        this.$r8$classId = i;
        this.f$0 = articleViewer;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ArticleViewer articleViewer = this.f$0;
                articleViewer.getClass();
                AndroidUtilities.runOnUIThread(new ArticleViewer$$ExternalSyntheticLambda0(articleViewer, 6));
                break;
            case 1:
                ArticleViewer articleViewer2 = this.f$0;
                float currentProgress = 0.7f - articleViewer2.actionBar.lineProgressView.getCurrentProgress();
                if (currentProgress > 0.0f) {
                    float f = currentProgress < 0.25f ? 0.01f : 0.02f;
                    LineProgressView lineProgressView = articleViewer2.actionBar.lineProgressView;
                    lineProgressView.setProgress(lineProgressView.getCurrentProgress() + f, true);
                    AndroidUtilities.runOnUIThread(articleViewer2.lineProgressTickRunnable, 100L);
                }
                break;
            case 2:
                ArticleViewer articleViewer3 = this.f$0;
                articleViewer3.getClass();
                AndroidUtilities.runOnUIThread(new ArticleViewer$$ExternalSyntheticLambda0(articleViewer3, 6));
                break;
            case 3:
                ArticleViewer articleViewer4 = this.f$0;
                ChatActivity.AnonymousClass60 anonymousClass60 = articleViewer4.containerView;
                if (anonymousClass60 != null) {
                    anonymousClass60.setLayerType(0, null);
                    articleViewer4.animationInProgress = 0;
                    articleViewer4.onClosed();
                    break;
                }
                break;
            case 4:
                this.f$0.sheet.dismiss(true);
                break;
            case 5:
                this.f$0.sheet.dismiss(true);
                break;
            case 6:
                this.f$0.updatePages();
                break;
            case 7:
                this.f$0.showRestrictedWebsiteToast();
                break;
            case 8:
                this.f$0.updateSearchButtons();
                break;
            case 9:
                ArticleViewer articleViewer5 = this.f$0;
                articleViewer5.getClass();
                try {
                    if (articleViewer5.windowView.getParent() != null) {
                        ((WindowManager) articleViewer5.parentActivity.getSystemService("window")).removeView(articleViewer5.windowView);
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
                break;
            case 10:
                ArticleViewer articleViewer6 = this.f$0;
                articleViewer6.getClass();
                BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                if (safeLastFragment != null) {
                    BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
                    bottomSheetParams.transitionFromLeft = true;
                    safeLastFragment.showAsSheet(new WebBrowserSettings(new ArticleViewer$$ExternalSyntheticLambda10(articleViewer6, 3)), bottomSheetParams);
                }
                break;
            default:
                ArticleViewer articleViewer7 = this.f$0;
                ChatActivity.AnonymousClass60 anonymousClass61 = articleViewer7.containerView;
                if (anonymousClass61 != null && articleViewer7.windowView != null) {
                    anonymousClass61.setLayerType(0, null);
                    articleViewer7.animationInProgress = 0;
                    AndroidUtilities.hideKeyboard(articleViewer7.parentActivity.getCurrentFocus());
                    break;
                }
                break;
        }
    }
}
