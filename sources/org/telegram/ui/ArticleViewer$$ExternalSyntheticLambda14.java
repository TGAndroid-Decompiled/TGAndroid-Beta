package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.Components.RecyclerListView;

public final class ArticleViewer$$ExternalSyntheticLambda14 implements ActionBarPopupWindow.OnDispatchKeyEventListener, TextSelectionHelper.OnTranslateListener, PinchToZoomHelper.ClipBoundsListener, RecyclerListView.OnItemLongClickListener {
    public final ArticleViewer f$0;

    public ArticleViewer$$ExternalSyntheticLambda14(ArticleViewer articleViewer) {
        this.f$0 = articleViewer;
    }

    @Override
    public void getClipTopBottom(float[] fArr) {
        this.f$0.lambda$setParentActivity$46(fArr);
    }

    @Override
    public void onDispatchKeyEvent(KeyEvent keyEvent) {
        this.f$0.lambda$showPopup$3(keyEvent);
    }

    @Override
    public boolean onItemClick(View view, int i) {
        return this.f$0.lambda$setParentActivity$15(view, i);
    }
}
