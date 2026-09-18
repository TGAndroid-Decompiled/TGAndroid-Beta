package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class yd implements ei.m0, org.telegram.ui.ActionBar.b2, zt, org.telegram.ui.ActionBar.m1 {
    public final ChatActivityEnterView f30180a;

    public yd(ChatActivityEnterView chatActivityEnterView) {
        this.f30180a = chatActivityEnterView;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        int i11 = ChatActivityEnterView.f21743n5;
        ChatActivityEnterView chatActivityEnterView = this.f30180a;
        chatActivityEnterView.P();
        of ofVar = chatActivityEnterView.E0;
        if (ofVar != null) {
            ofVar.setText("");
        }
    }

    @Override
    public void i() {
        ChatActivityEnterView chatActivityEnterView = this.f30180a;
        chatActivityEnterView.E0.invalidateEffects();
        mg mgVar = chatActivityEnterView.Y2;
        if (mgVar != null) {
            mgVar.v1(chatActivityEnterView.E0.getTextToUse());
        }
    }

    @Override
    public void o(KeyEvent keyEvent) {
        ChatActivityEnterView chatActivityEnterView;
        jf jfVar;
        int i10 = ChatActivityEnterView.f21743n5;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (jfVar = (chatActivityEnterView = this.f30180a).N0) != null && jfVar.isShowing()) {
            chatActivityEnterView.N0.dismiss();
        }
    }
}
