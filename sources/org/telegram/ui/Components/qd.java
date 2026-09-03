package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class qd implements rh.i0, org.telegram.ui.ActionBar.c2, st, org.telegram.ui.ActionBar.n1 {
    public final ChatActivityEnterView f28144a;

    public qd(ChatActivityEnterView chatActivityEnterView) {
        this.f28144a = chatActivityEnterView;
    }

    @Override
    public void J() {
        ChatActivityEnterView chatActivityEnterView = this.f28144a;
        chatActivityEnterView.B0.invalidateEffects();
        eg egVar = chatActivityEnterView.V2;
        if (egVar != null) {
            egVar.A1(chatActivityEnterView.B0.getTextToUse());
        }
    }

    @Override
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        int i11 = ChatActivityEnterView.f22702j5;
        ChatActivityEnterView chatActivityEnterView = this.f28144a;
        chatActivityEnterView.O();
        ff ffVar = chatActivityEnterView.B0;
        if (ffVar != null) {
            ffVar.setText("");
        }
    }

    @Override
    public void n(KeyEvent keyEvent) {
        ChatActivityEnterView chatActivityEnterView;
        bf bfVar;
        int i10 = ChatActivityEnterView.f22702j5;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (bfVar = (chatActivityEnterView = this.f28144a).K0) != null && bfVar.isShowing()) {
            chatActivityEnterView.K0.dismiss();
        }
    }
}
