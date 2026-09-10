package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class yd implements di.p0, org.telegram.ui.ActionBar.c2, du, org.telegram.ui.ActionBar.n1 {
    public final ChatActivityEnterView f29305a;

    public yd(ChatActivityEnterView chatActivityEnterView) {
        this.f29305a = chatActivityEnterView;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        int i11 = ChatActivityEnterView.f20816m5;
        ChatActivityEnterView chatActivityEnterView = this.f29305a;
        chatActivityEnterView.O();
        rf rfVar = chatActivityEnterView.E0;
        if (rfVar != null) {
            rfVar.setText("");
        }
    }

    @Override
    public void j() {
        ChatActivityEnterView chatActivityEnterView = this.f29305a;
        chatActivityEnterView.E0.invalidateEffects();
        qg qgVar = chatActivityEnterView.Y2;
        if (qgVar != null) {
            qgVar.u1(chatActivityEnterView.E0.getTextToUse());
        }
    }

    @Override
    public void o(KeyEvent keyEvent) {
        ChatActivityEnterView chatActivityEnterView;
        nf nfVar;
        int i10 = ChatActivityEnterView.f20816m5;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (nfVar = (chatActivityEnterView = this.f29305a).N0) != null && nfVar.isShowing()) {
            chatActivityEnterView.N0.dismiss();
        }
    }
}
