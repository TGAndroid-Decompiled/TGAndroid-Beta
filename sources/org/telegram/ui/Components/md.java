package org.telegram.ui.Components;

import android.view.KeyEvent;

public final class md implements nh.k0, org.telegram.ui.ActionBar.a2, jt, org.telegram.ui.ActionBar.l1 {

    public final ChatActivityEnterView f30646a;

    public md(ChatActivityEnterView chatActivityEnterView) {
        this.f30646a = chatActivityEnterView;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11 = ChatActivityEnterView.f26070i5;
        ChatActivityEnterView chatActivityEnterView = this.f30646a;
        chatActivityEnterView.O();
        bf bfVar = chatActivityEnterView.A0;
        if (bfVar != null) {
            bfVar.setText("");
        }
    }

    @Override
    public void k(KeyEvent keyEvent) {
        ChatActivityEnterView chatActivityEnterView;
        xe xeVar;
        int i10 = ChatActivityEnterView.f26070i5;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (xeVar = (chatActivityEnterView = this.f30646a).J0) != null && xeVar.isShowing()) {
            chatActivityEnterView.J0.dismiss();
        }
    }

    @Override
    public void k1() {
        ChatActivityEnterView chatActivityEnterView = this.f30646a;
        chatActivityEnterView.A0.invalidateEffects();
        ag agVar = chatActivityEnterView.U2;
        if (agVar != null) {
            agVar.n1(chatActivityEnterView.A0.getTextToUse());
        }
    }
}
