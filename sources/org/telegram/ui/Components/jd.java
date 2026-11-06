package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class jd implements hi.h0, org.telegram.ui.ActionBar.r1, ws, org.telegram.ui.ActionBar.e1 {
    public final ChatActivityEnterView f34947a;

    public jd(ChatActivityEnterView chatActivityEnterView) {
        this.f34947a = chatActivityEnterView;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        int i10 = ChatActivityEnterView.s5;
        ChatActivityEnterView chatActivityEnterView = this.f34947a;
        chatActivityEnterView.J();
        xe xeVar = chatActivityEnterView.E0;
        if (xeVar != null) {
            xeVar.setText("");
        }
    }

    @Override
    public void j(KeyEvent keyEvent) {
        ChatActivityEnterView chatActivityEnterView;
        te teVar;
        int i7 = ChatActivityEnterView.s5;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (teVar = (chatActivityEnterView = this.f34947a).N0) != null && teVar.isShowing()) {
            chatActivityEnterView.N0.dismiss();
        }
    }

    @Override
    public void m() {
        ChatActivityEnterView chatActivityEnterView = this.f34947a;
        chatActivityEnterView.E0.f();
        wf wfVar = chatActivityEnterView.Z2;
        if (wfVar != null) {
            wfVar.k1(chatActivityEnterView.E0.getTextToUse());
        }
    }
}
