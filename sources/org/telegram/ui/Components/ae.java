package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class ae implements ei.m0, org.telegram.ui.ActionBar.a2, au, org.telegram.ui.ActionBar.l1 {
    public final ChatActivityEnterView f22426a;

    public ae(ChatActivityEnterView chatActivityEnterView) {
        this.f22426a = chatActivityEnterView;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11 = ChatActivityEnterView.f21701n5;
        ChatActivityEnterView chatActivityEnterView = this.f22426a;
        chatActivityEnterView.P();
        pf pfVar = chatActivityEnterView.E0;
        if (pfVar != null) {
            pfVar.setText("");
        }
    }

    @Override
    public void i() {
        ChatActivityEnterView chatActivityEnterView = this.f22426a;
        chatActivityEnterView.E0.invalidateEffects();
        ng ngVar = chatActivityEnterView.Y2;
        if (ngVar != null) {
            ngVar.v1(chatActivityEnterView.E0.getTextToUse());
        }
    }

    @Override
    public void o(KeyEvent keyEvent) {
        ChatActivityEnterView chatActivityEnterView;
        lf lfVar;
        int i10 = ChatActivityEnterView.f21701n5;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (lfVar = (chatActivityEnterView = this.f22426a).N0) != null && lfVar.isShowing()) {
            chatActivityEnterView.N0.dismiss();
        }
    }
}
