package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class qd implements ki.i0, org.telegram.ui.ActionBar.q1, mt, org.telegram.ui.ActionBar.e1 {
    public final ChatActivityEnterView f38845a;

    public qd(ChatActivityEnterView chatActivityEnterView) {
        this.f38845a = chatActivityEnterView;
    }

    @Override
    public void g() {
        ChatActivityEnterView chatActivityEnterView = this.f38845a;
        chatActivityEnterView.F0.f();
        mg mgVar = chatActivityEnterView.P3;
        if (mgVar != null) {
            mgVar.u1(chatActivityEnterView.F0.getTextToUse());
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        int i10 = ChatActivityEnterView.f32535s7;
        ChatActivityEnterView chatActivityEnterView = this.f38845a;
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
        int i7 = ChatActivityEnterView.f32535s7;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (cfVar = (chatActivityEnterView = this.f38845a).O0) != null && cfVar.isShowing()) {
            chatActivityEnterView.O0.dismiss();
        }
    }
}
