package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class hd implements ki.j0, org.telegram.ui.ActionBar.q1, dt, org.telegram.ui.ActionBar.e1 {
    public final ChatActivityEnterView f35217a;

    public hd(ChatActivityEnterView chatActivityEnterView) {
        this.f35217a = chatActivityEnterView;
    }

    @Override
    public void E() {
        ChatActivityEnterView chatActivityEnterView = this.f35217a;
        chatActivityEnterView.F0.f();
        cg cgVar = chatActivityEnterView.H3;
        if (cgVar != null) {
            cgVar.u1(chatActivityEnterView.F0.getTextToUse());
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        int i10 = ChatActivityEnterView.N6;
        ChatActivityEnterView chatActivityEnterView = this.f35217a;
        chatActivityEnterView.R();
        xe xeVar = chatActivityEnterView.F0;
        if (xeVar != null) {
            xeVar.setText("");
        }
    }

    @Override
    public void j(KeyEvent keyEvent) {
        ChatActivityEnterView chatActivityEnterView;
        te teVar;
        int i7 = ChatActivityEnterView.N6;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (teVar = (chatActivityEnterView = this.f35217a).O0) != null && teVar.isShowing()) {
            chatActivityEnterView.O0.dismiss();
        }
    }
}
