package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class qd implements rh.j0, org.telegram.ui.ActionBar.c2, tt, org.telegram.ui.ActionBar.n1 {
    public final ChatActivityEnterView f28115a;

    public qd(ChatActivityEnterView chatActivityEnterView) {
        this.f28115a = chatActivityEnterView;
    }

    @Override
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        int i11 = ChatActivityEnterView.f22729j5;
        ChatActivityEnterView chatActivityEnterView = this.f28115a;
        chatActivityEnterView.O();
        ff ffVar = chatActivityEnterView.B0;
        if (ffVar != null) {
            ffVar.setText("");
        }
    }

    @Override
    public void j0() {
        ChatActivityEnterView chatActivityEnterView = this.f28115a;
        chatActivityEnterView.B0.invalidateEffects();
        eg egVar = chatActivityEnterView.V2;
        if (egVar != null) {
            egVar.y1(chatActivityEnterView.B0.getTextToUse());
        }
    }

    @Override
    public void n(KeyEvent keyEvent) {
        ChatActivityEnterView chatActivityEnterView;
        bf bfVar;
        int i10 = ChatActivityEnterView.f22729j5;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (bfVar = (chatActivityEnterView = this.f28115a).K0) != null && bfVar.isShowing()) {
            chatActivityEnterView.K0.dismiss();
        }
    }
}
