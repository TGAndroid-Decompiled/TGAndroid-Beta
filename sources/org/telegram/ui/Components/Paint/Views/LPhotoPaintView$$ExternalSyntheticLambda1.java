package org.telegram.ui.Components.Paint.Views;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda67;
import org.telegram.ui.Stories.recorder.EmojiBottomSheet;
import org.telegram.ui.web.WebActionBar$$ExternalSyntheticLambda9;

public final class LPhotoPaintView$$ExternalSyntheticLambda1 implements View.OnClickListener {
    public final int $r8$classId;
    public final LPhotoPaintView f$0;

    public LPhotoPaintView$$ExternalSyntheticLambda1(LPhotoPaintView lPhotoPaintView, int i) {
        this.$r8$classId = i;
        this.f$0 = lPhotoPaintView;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                LPhotoPaintView lPhotoPaintView = this.f$0;
                if (lPhotoPaintView.editingText) {
                    lPhotoPaintView.selectEntity(null, true);
                } else {
                    lPhotoPaintView.switchTab(0);
                }
                break;
            case 1:
                LPhotoPaintView lPhotoPaintView2 = this.f$0;
                EntityView entityView = lPhotoPaintView2.currentEntityView;
                if ((entityView instanceof TextPaintView) && !lPhotoPaintView2.editingText) {
                    TextPaintView textPaintView = (TextPaintView) entityView;
                    lPhotoPaintView2.editingText = true;
                    textPaintView.beginEditing();
                    View focusedView = textPaintView.getFocusedView();
                    focusedView.requestFocus();
                    AndroidUtilities.showKeyboard(focusedView);
                }
                ActionBarPopupWindow actionBarPopupWindow = lPhotoPaintView2.popupWindow;
                if (actionBarPopupWindow != null && actionBarPopupWindow.isShowing()) {
                    lPhotoPaintView2.popupWindow.dismiss(true);
                    break;
                }
                break;
            case 2:
                this.f$0.lambda$showMenuForEntity$39();
                break;
            case 3:
                LPhotoPaintView lPhotoPaintView3 = this.f$0;
                int i = lPhotoPaintView3.tabsSelectedIndex;
                lPhotoPaintView3.switchTab(1);
                lPhotoPaintView3.postDelayed(new LPhotoPaintView$$ExternalSyntheticLambda21(lPhotoPaintView3, 1), 350L);
                LPhotoPaintView.AnonymousClass14 anonymousClass14 = new LPhotoPaintView.AnonymousClass14(lPhotoPaintView3.getContext(), lPhotoPaintView3.resourcesProvider, false, false);
                anonymousClass14.onDocumentSelected = new LPhotoPaintView$$ExternalSyntheticLambda31(lPhotoPaintView3);
                anonymousClass14.onWidgetSelected = new WebActionBar$$ExternalSyntheticLambda9(lPhotoPaintView3, 3);
                for (View view2 : anonymousClass14.viewPager.getViewPages()) {
                    if (view2 instanceof EmojiBottomSheet.Page) {
                        EmojiBottomSheet.Page.Adapter adapter = ((EmojiBottomSheet.Page) view2).adapter;
                        if (adapter.query == null) {
                            adapter.updateItems$1(null);
                        }
                    }
                }
                anonymousClass14.setOnDismissListener(new StarsIntroActivity$$ExternalSyntheticLambda67(lPhotoPaintView3, i));
                anonymousClass14.show();
                PhotoViewer photoViewer = PhotoViewer.this;
                if (photoViewer.videoPlayer != null) {
                    photoViewer.manuallyPaused = false;
                    photoViewer.cancelVideoPlayRunnable();
                    photoViewer.videoPlayer.pause();
                    break;
                }
                break;
            default:
                LPhotoPaintView lPhotoPaintView4 = this.f$0;
                lPhotoPaintView4.switchTab(2);
                if (!(lPhotoPaintView4.currentEntityView instanceof TextPaintView)) {
                    lPhotoPaintView4.createText(true);
                }
                break;
        }
    }
}
