package org.telegram.ui.Components.Paint.Views;

import android.view.KeyEvent;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.Components.Paint.UndoStore;

public final class LPhotoPaintView$$ExternalSyntheticLambda11 implements ActionBarPopupWindow.OnDispatchKeyEventListener, UndoStore.UndoStoreDelegate, Utilities.Callback3Return {
    public final LPhotoPaintView f$0;

    public LPhotoPaintView$$ExternalSyntheticLambda11(LPhotoPaintView lPhotoPaintView) {
        this.f$0 = lPhotoPaintView;
    }

    @Override
    public void historyChanged() {
        this.f$0.lambda$new$1();
    }

    @Override
    public void onDispatchKeyEvent(KeyEvent keyEvent) {
        this.f$0.lambda$showPopup$43(keyEvent);
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3) {
        return this.f$0.lambda$openStickersView$19(obj, (TLRPC.Document) obj2, (Boolean) obj3);
    }
}
