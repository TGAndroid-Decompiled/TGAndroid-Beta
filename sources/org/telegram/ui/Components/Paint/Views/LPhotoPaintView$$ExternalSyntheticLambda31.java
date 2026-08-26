package org.telegram.ui.Components.Paint.Views;

import android.view.KeyEvent;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;

public final class LPhotoPaintView$$ExternalSyntheticLambda31 implements ActionBarPopupWindow.OnDispatchKeyEventListener, Utilities.Callback3Return {
    public final LPhotoPaintView f$0;

    @Override
    public void onDispatchKeyEvent(KeyEvent keyEvent) {
        ActionBarPopupWindow actionBarPopupWindow;
        LPhotoPaintView lPhotoPaintView = this.f$0;
        lPhotoPaintView.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (actionBarPopupWindow = lPhotoPaintView.popupWindow) != null && actionBarPopupWindow.isShowing()) {
            lPhotoPaintView.popupWindow.dismiss(true);
        }
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3) {
        LPhotoPaintView.AnonymousClass17 anonymousClass17CreateSticker = this.f$0.createSticker(obj, (TLRPC.Document) obj2, true);
        if (((Boolean) obj3).booleanValue()) {
            anonymousClass17CreateSticker.setScale(1.5f);
        }
        return Boolean.TRUE;
    }
}
