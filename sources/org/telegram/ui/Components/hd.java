package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class hd implements ii.j0, org.telegram.ui.ActionBar.p1, vs, org.telegram.ui.ActionBar.d1 {
    public final ChatActivityEnterView f34369a;

    public hd(ChatActivityEnterView chatActivityEnterView) {
        this.f34369a = chatActivityEnterView;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        int i10 = ChatActivityEnterView.f31082t5;
        ChatActivityEnterView chatActivityEnterView = this.f34369a;
        chatActivityEnterView.J();
        ve veVar = chatActivityEnterView.F0;
        if (veVar != null) {
            veVar.setText("");
        }
    }

    @Override
    public void k(KeyEvent keyEvent) {
        ChatActivityEnterView chatActivityEnterView;
        re reVar;
        int i3 = ChatActivityEnterView.f31082t5;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (reVar = (chatActivityEnterView = this.f34369a).O0) != null && reVar.isShowing()) {
            chatActivityEnterView.O0.dismiss();
        }
    }

    @Override
    public void m() {
        ChatActivityEnterView chatActivityEnterView = this.f34369a;
        chatActivityEnterView.F0.f();
        uf ufVar = chatActivityEnterView.f31087a3;
        if (ufVar != null) {
            ufVar.j1(chatActivityEnterView.F0.getTextToUse());
        }
    }
}
