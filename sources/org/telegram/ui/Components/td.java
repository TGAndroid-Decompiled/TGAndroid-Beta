package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class td implements ph.i0, org.telegram.ui.ActionBar.b2, qt, org.telegram.ui.ActionBar.m1 {
    public final ChatActivityEnterView f32925a;

    public td(ChatActivityEnterView chatActivityEnterView) {
        this.f32925a = chatActivityEnterView;
    }

    @Override
    public void e1() {
        ChatActivityEnterView chatActivityEnterView = this.f32925a;
        chatActivityEnterView.A0.invalidateEffects();
        hg hgVar = chatActivityEnterView.U2;
        if (hgVar != null) {
            hgVar.v1(chatActivityEnterView.A0.getTextToUse());
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        int i11 = ChatActivityEnterView.f26085i5;
        ChatActivityEnterView chatActivityEnterView = this.f32925a;
        chatActivityEnterView.O();
        jf jfVar = chatActivityEnterView.A0;
        if (jfVar != null) {
            jfVar.setText("");
        }
    }

    @Override
    public void o(KeyEvent keyEvent) {
        ChatActivityEnterView chatActivityEnterView;
        ef efVar;
        int i10 = ChatActivityEnterView.f26085i5;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (efVar = (chatActivityEnterView = this.f32925a).J0) != null && efVar.isShowing()) {
            chatActivityEnterView.J0.dismiss();
        }
    }
}
