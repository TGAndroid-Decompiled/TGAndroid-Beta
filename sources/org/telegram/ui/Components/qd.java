package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class qd implements ki.i0, org.telegram.ui.ActionBar.q1, mt, org.telegram.ui.ActionBar.e1 {
    public final ChatActivityEnterView f38898a;

    public qd(ChatActivityEnterView chatActivityEnterView) {
        this.f38898a = chatActivityEnterView;
    }

    @Override
    public void g() {
        ChatActivityEnterView chatActivityEnterView = this.f38898a;
        chatActivityEnterView.F0.f();
        ng ngVar = chatActivityEnterView.P3;
        if (ngVar != null) {
            ngVar.u1(chatActivityEnterView.F0.getTextToUse());
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        int i10 = ChatActivityEnterView.f32566s7;
        ChatActivityEnterView chatActivityEnterView = this.f38898a;
        chatActivityEnterView.T();
        gf gfVar = chatActivityEnterView.F0;
        if (gfVar != null) {
            gfVar.setText("");
        }
    }

    @Override
    public void j(KeyEvent keyEvent) {
        ChatActivityEnterView chatActivityEnterView;
        cf cfVar;
        int i7 = ChatActivityEnterView.f32566s7;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (cfVar = (chatActivityEnterView = this.f38898a).O0) != null && cfVar.isShowing()) {
            chatActivityEnterView.O0.dismiss();
        }
    }
}
