package org.telegram.ui.Stories.recorder;

import android.view.KeyEvent;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;

public final class PaintView$$ExternalSyntheticLambda6 implements ActionBarPopupWindow.OnDispatchKeyEventListener, Utilities.Callback3Return {
    public final PaintView f$0;

    public PaintView$$ExternalSyntheticLambda6(PaintView paintView) {
        this.f$0 = paintView;
    }

    @Override
    public void onDispatchKeyEvent(KeyEvent keyEvent) {
        ActionBarPopupWindow actionBarPopupWindow;
        PaintView paintView = this.f$0;
        paintView.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (actionBarPopupWindow = paintView.popupWindow) != null && actionBarPopupWindow.isShowing()) {
            paintView.popupWindow.dismiss(true);
        }
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3) {
        PaintView paintView = this.f$0;
        paintView.forceChanges = true;
        PaintView.AnonymousClass27 anonymousClass27CreateSticker$1 = paintView.createSticker$1(obj, (TLRPC.Document) obj2);
        if (((Boolean) obj3).booleanValue()) {
            anonymousClass27CreateSticker$1.setScale(1.5f);
        }
        paintView.appearAnimation(anonymousClass27CreateSticker$1);
        return Boolean.TRUE;
    }
}
