package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class id implements hi.h0, org.telegram.ui.ActionBar.r1, ws, org.telegram.ui.ActionBar.e1 {
    public final ChatActivityEnterView f34592a;

    public id(ChatActivityEnterView chatActivityEnterView) {
        this.f34592a = chatActivityEnterView;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        int i10 = ChatActivityEnterView.s5;
        ChatActivityEnterView chatActivityEnterView = this.f34592a;
        chatActivityEnterView.J();
        we weVar = chatActivityEnterView.E0;
        if (weVar != null) {
            weVar.setText("");
        }
    }

    @Override
    public void j(KeyEvent keyEvent) {
        ChatActivityEnterView chatActivityEnterView;
        se seVar;
        int i7 = ChatActivityEnterView.s5;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (seVar = (chatActivityEnterView = this.f34592a).N0) != null && seVar.isShowing()) {
            chatActivityEnterView.N0.dismiss();
        }
    }

    @Override
    public void m() {
        ChatActivityEnterView chatActivityEnterView = this.f34592a;
        chatActivityEnterView.E0.f();
        vf vfVar = chatActivityEnterView.Z2;
        if (vfVar != null) {
            vfVar.k1(chatActivityEnterView.E0.getTextToUse());
        }
    }
}
