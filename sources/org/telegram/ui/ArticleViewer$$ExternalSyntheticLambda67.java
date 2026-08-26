package org.telegram.ui;

import android.view.View;
import android.widget.PopupWindow;
import org.telegram.ui.Components.CustomPopupMenu;
import org.telegram.ui.Components.Paint.Views.LPhotoPaintView;
import org.telegram.ui.Stories.recorder.PaintView;

public final class ArticleViewer$$ExternalSyntheticLambda67 implements PopupWindow.OnDismissListener {
    public final int $r8$classId;
    public final Object f$0;

    public ArticleViewer$$ExternalSyntheticLambda67(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void onDismiss() {
        switch (this.$r8$classId) {
            case 0:
                ArticleViewer articleViewer = (ArticleViewer) this.f$0;
                View view = articleViewer.pressedLinkOwnerView;
                if (view != null) {
                    articleViewer.pressedLinkOwnerLayout = null;
                    view.invalidate();
                    articleViewer.pressedLinkOwnerView = null;
                }
                break;
            case 1:
                ChatActivity chatActivity = (ChatActivity) this.f$0;
                chatActivity.scrimPopupWindow = null;
                chatActivity.menuDeleteItem = null;
                chatActivity.scrimPopupWindowItems = null;
                chatActivity.chatLayoutManager.canScrollVertically = true;
                chatActivity.dimBehindView(false, true, 0.0f);
                ChatActivity.AnonymousClass39 anonymousClass39 = chatActivity.chatActivityEnterView;
                if (anonymousClass39 != null && anonymousClass39.getEditField() != null) {
                    chatActivity.chatActivityEnterView.getEditField().setAllowDrawCursor(true);
                    break;
                }
                break;
            case 2:
                ChatActivity.AnonymousClass17 anonymousClass17 = (ChatActivity.AnonymousClass17) this.f$0;
                anonymousClass17.submenu = null;
                ChatActivity chatActivity2 = ChatActivity.this;
                chatActivity2.scrimPopupWindow = null;
                chatActivity2.menuDeleteItem = null;
                chatActivity2.scrimPopupWindowItems = null;
                chatActivity2.chatLayoutManager.canScrollVertically = true;
                if (chatActivity2.scrimPopupWindowHideDimOnDismiss) {
                    chatActivity2.dimBehindView(false, true, 0.0f);
                } else {
                    chatActivity2.scrimPopupWindowHideDimOnDismiss = true;
                }
                ChatActivity.AnonymousClass39 anonymousClass310 = chatActivity2.chatActivityEnterView;
                if (anonymousClass310 != null && anonymousClass310.getEditField() != null) {
                    chatActivity2.chatActivityEnterView.getEditField().setAllowDrawCursor(true);
                    break;
                }
                break;
            case 3:
                CustomPopupMenu customPopupMenu = (CustomPopupMenu) this.f$0;
                customPopupMenu.onDismissed();
                customPopupMenu.isShowing = false;
                break;
            case 4:
                ((LPhotoPaintView) this.f$0).popupLayout.linearLayout.removeAllViews();
                break;
            case 5:
                ((ProfileActivity) this.f$0).dimBehindView(0.0f);
                break;
            default:
                ((PaintView) this.f$0).popupLayout.linearLayout.removeAllViews();
                break;
        }
    }
}
