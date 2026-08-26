package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.ui.ActionBar.ActionBarLayout;

public final class ContentPreviewViewer$$ExternalSyntheticLambda3 implements View.OnClickListener {
    public final int $r8$classId;
    public final ContentPreviewViewer f$0;

    public ContentPreviewViewer$$ExternalSyntheticLambda3(ContentPreviewViewer contentPreviewViewer, int i) {
        this.$r8$classId = i;
        this.f$0 = contentPreviewViewer;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                ContentPreviewViewer contentPreviewViewer = this.f$0;
                contentPreviewViewer.menuVisible = false;
                contentPreviewViewer.containerView.invalidate();
                contentPreviewViewer.close();
                break;
            case 1:
                ContentPreviewViewer contentPreviewViewer2 = this.f$0;
                Activity activity = contentPreviewViewer2.parentActivity;
                if (activity instanceof LaunchActivity) {
                    LaunchActivity launchActivity = (LaunchActivity) activity;
                    if (launchActivity.getActionBarLayout() != null && ((ActionBarLayout) launchActivity.getActionBarLayout()).getLastFragment() != null) {
                        ((ActionBarLayout) launchActivity.getActionBarLayout()).getLastFragment().dismissCurrentDialog();
                    }
                    launchActivity.presentFragment(new PremiumPreviewFragment(0, PremiumPreviewFragment.featureTypeToServerString(5)));
                }
                contentPreviewViewer2.menuVisible = false;
                contentPreviewViewer2.containerView.invalidate();
                contentPreviewViewer2.close();
                break;
            case 2:
                ContentPreviewViewer contentPreviewViewer3 = this.f$0;
                ContentPreviewViewer.ContentPreviewViewerDelegate contentPreviewViewerDelegate = contentPreviewViewer3.delegate;
                if (contentPreviewViewerDelegate != null) {
                    contentPreviewViewerDelegate.sendVote();
                }
                contentPreviewViewer3.dismissPopupWindow();
                break;
            default:
                ContentPreviewViewer contentPreviewViewer4 = this.f$0;
                ContentPreviewViewer.ContentPreviewViewerDelegate contentPreviewViewerDelegate2 = contentPreviewViewer4.delegate;
                if (contentPreviewViewerDelegate2 != null) {
                    contentPreviewViewerDelegate2.retractVote();
                }
                contentPreviewViewer4.dismissPopupWindow();
                break;
        }
    }
}
