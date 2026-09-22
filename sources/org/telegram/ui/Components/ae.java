package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class ae implements ei.m0, org.telegram.ui.ActionBar.a2, zt, org.telegram.ui.ActionBar.l1 {
    public final ChatActivityEnterView f22639a;

    public ae(ChatActivityEnterView chatActivityEnterView) {
        this.f22639a = chatActivityEnterView;
    }

    @Override
    public void i() {
        ChatActivityEnterView chatActivityEnterView = this.f22639a;
        chatActivityEnterView.E0.invalidateEffects();
        ng ngVar = chatActivityEnterView.Z2;
        if (ngVar != null) {
            ngVar.w1(chatActivityEnterView.E0.getTextToUse());
        }
    }

    @Override
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11 = ChatActivityEnterView.f21967n5;
        ChatActivityEnterView chatActivityEnterView = this.f22639a;
        chatActivityEnterView.O();
        pf pfVar = chatActivityEnterView.E0;
        if (pfVar != null) {
            pfVar.setText("");
        }
    }

    @Override
    public void o(KeyEvent keyEvent) {
        ChatActivityEnterView chatActivityEnterView;
        lf lfVar;
        int i10 = ChatActivityEnterView.f21967n5;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (lfVar = (chatActivityEnterView = this.f22639a).N0) != null && lfVar.isShowing()) {
            chatActivityEnterView.N0.dismiss();
        }
    }
}
