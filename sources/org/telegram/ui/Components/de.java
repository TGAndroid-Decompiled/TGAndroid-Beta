package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class de implements ei.m0, org.telegram.ui.ActionBar.z1, qu, org.telegram.ui.ActionBar.k1 {
    public final ChatActivityEnterView f25571a;

    public de(ChatActivityEnterView chatActivityEnterView) {
        this.f25571a = chatActivityEnterView;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        int i11 = ChatActivityEnterView.f23842n5;
        ChatActivityEnterView chatActivityEnterView = this.f25571a;
        chatActivityEnterView.M();
        sf sfVar = chatActivityEnterView.E0;
        if (sfVar != null) {
            sfVar.setText("");
        }
    }

    @Override
    public void i() {
        ChatActivityEnterView chatActivityEnterView = this.f25571a;
        chatActivityEnterView.E0.invalidateEffects();
        qg qgVar = chatActivityEnterView.Z2;
        if (qgVar != null) {
            qgVar.B1(chatActivityEnterView.E0.getTextToUse());
        }
    }

    @Override
    public void o(KeyEvent keyEvent) {
        ChatActivityEnterView chatActivityEnterView;
        of ofVar;
        int i10 = ChatActivityEnterView.f23842n5;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (ofVar = (chatActivityEnterView = this.f25571a).N0) != null && ofVar.isShowing()) {
            chatActivityEnterView.N0.dismiss();
        }
    }
}
