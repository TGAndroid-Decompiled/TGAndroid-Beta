package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class pd implements mh.l0, org.telegram.ui.ActionBar.b2, kt, org.telegram.ui.ActionBar.m1 {
    public final ChatActivityEnterView f31615a;

    public pd(ChatActivityEnterView chatActivityEnterView) {
        this.f31615a = chatActivityEnterView;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        int i10 = ChatActivityEnterView.f26074i5;
        ChatActivityEnterView chatActivityEnterView = this.f31615a;
        chatActivityEnterView.N();
        ff ffVar = chatActivityEnterView.A0;
        if (ffVar != null) {
            ffVar.setText("");
        }
    }

    @Override
    public void k(KeyEvent keyEvent) {
        ChatActivityEnterView chatActivityEnterView;
        bf bfVar;
        int i9 = ChatActivityEnterView.f26074i5;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (bfVar = (chatActivityEnterView = this.f31615a).J0) != null && bfVar.isShowing()) {
            chatActivityEnterView.J0.dismiss();
        }
    }

    @Override
    public void m1() {
        ChatActivityEnterView chatActivityEnterView = this.f31615a;
        chatActivityEnterView.A0.invalidateEffects();
        eg egVar = chatActivityEnterView.U2;
        if (egVar != null) {
            egVar.m1(chatActivityEnterView.A0.getTextToUse());
        }
    }
}
