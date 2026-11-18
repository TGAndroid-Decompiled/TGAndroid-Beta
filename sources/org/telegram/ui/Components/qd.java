package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class qd implements ki.j0, org.telegram.ui.ActionBar.r1, kt, org.telegram.ui.ActionBar.f1 {
    public final ChatActivityEnterView f38761a;

    public qd(ChatActivityEnterView chatActivityEnterView) {
        this.f38761a = chatActivityEnterView;
    }

    @Override
    public void g() {
        ChatActivityEnterView chatActivityEnterView = this.f38761a;
        chatActivityEnterView.F0.f();
        kg kgVar = chatActivityEnterView.N3;
        if (kgVar != null) {
            kgVar.u1(chatActivityEnterView.F0.getTextToUse());
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        int i10 = ChatActivityEnterView.f32538n7;
        ChatActivityEnterView chatActivityEnterView = this.f38761a;
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
        int i7 = ChatActivityEnterView.f32538n7;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (cfVar = (chatActivityEnterView = this.f38761a).O0) != null && cfVar.isShowing()) {
            chatActivityEnterView.O0.dismiss();
        }
    }
}
