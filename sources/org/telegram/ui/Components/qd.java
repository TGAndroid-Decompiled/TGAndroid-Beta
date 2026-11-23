package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class qd implements ki.i0, org.telegram.ui.ActionBar.q1, kt, org.telegram.ui.ActionBar.e1 {
    public final ChatActivityEnterView f38809a;

    public qd(ChatActivityEnterView chatActivityEnterView) {
        this.f38809a = chatActivityEnterView;
    }

    @Override
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        int i10 = ChatActivityEnterView.f32633s7;
        ChatActivityEnterView chatActivityEnterView = this.f38809a;
        chatActivityEnterView.T();
        hf hfVar = chatActivityEnterView.F0;
        if (hfVar != null) {
            hfVar.setText("");
        }
    }

    @Override
    public void m(KeyEvent keyEvent) {
        ChatActivityEnterView chatActivityEnterView;
        df dfVar;
        int i7 = ChatActivityEnterView.f32633s7;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (dfVar = (chatActivityEnterView = this.f38809a).O0) != null && dfVar.isShowing()) {
            chatActivityEnterView.O0.dismiss();
        }
    }

    @Override
    public void u() {
        ChatActivityEnterView chatActivityEnterView = this.f38809a;
        chatActivityEnterView.F0.f();
        mg mgVar = chatActivityEnterView.P3;
        if (mgVar != null) {
            mgVar.u1(chatActivityEnterView.F0.getTextToUse());
        }
    }
}
