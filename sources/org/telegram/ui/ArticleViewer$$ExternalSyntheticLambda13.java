package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.Components.RecyclerListView;

public final class ArticleViewer$$ExternalSyntheticLambda13 implements PinchToZoomHelper.ClipBoundsListener, RecyclerListView.OnItemLongClickListener, ActionBarPopupWindow.OnDispatchKeyEventListener {
    public final ArticleViewer f$0;

    public ArticleViewer$$ExternalSyntheticLambda13(ArticleViewer articleViewer) {
        this.f$0 = articleViewer;
    }

    @Override
    public void getClipTopBottom(float[] fArr) {
        ArticleViewer articleViewer = this.f$0;
        fArr[0] = articleViewer.currentHeaderHeight;
        fArr[1] = articleViewer.pages[0].listView.getMeasuredHeight();
    }

    @Override
    public void onDispatchKeyEvent(KeyEvent keyEvent) {
        ActionBarPopupWindow actionBarPopupWindow;
        ArticleViewer articleViewer = this.f$0;
        articleViewer.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (actionBarPopupWindow = articleViewer.popupWindow) != null && actionBarPopupWindow.isShowing()) {
            articleViewer.popupWindow.dismiss(true);
        }
    }

    @Override
    public boolean onItemClick(int i, View view) {
        ArticleViewer articleViewer = this.f$0;
        articleViewer.getClass();
        if (!(view instanceof ArticleViewer.BlockRelatedArticlesCell)) {
            return false;
        }
        ArticleViewer.TL_pageBlockRelatedArticlesChild tL_pageBlockRelatedArticlesChild = ((ArticleViewer.BlockRelatedArticlesCell) view).currentBlock;
        articleViewer.showCopyPopup(tL_pageBlockRelatedArticlesChild.parent.articles.get(tL_pageBlockRelatedArticlesChild.num).url);
        return true;
    }
}
