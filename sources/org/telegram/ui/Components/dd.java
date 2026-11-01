package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class dd implements xh.g0, org.telegram.ui.ActionBar.u1, kt, org.telegram.ui.ActionBar.i1 {
    public final ChatActivityEnterView f25467a;

    public dd(ChatActivityEnterView chatActivityEnterView) {
        this.f25467a = chatActivityEnterView;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        int i11 = ChatActivityEnterView.f23673s5;
        ChatActivityEnterView chatActivityEnterView = this.f25467a;
        chatActivityEnterView.J();
        se seVar = chatActivityEnterView.E0;
        if (seVar != null) {
            seVar.setText("");
        }
    }

    @Override
    public void m() {
        ChatActivityEnterView chatActivityEnterView = this.f25467a;
        chatActivityEnterView.E0.f();
        sf sfVar = chatActivityEnterView.Z2;
        if (sfVar != null) {
            sfVar.g1(chatActivityEnterView.E0.getTextToUse());
        }
    }

    @Override
    public void p(KeyEvent keyEvent) {
        ChatActivityEnterView chatActivityEnterView;
        oe oeVar;
        int i10 = ChatActivityEnterView.f23673s5;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (oeVar = (chatActivityEnterView = this.f25467a).N0) != null && oeVar.isShowing()) {
            chatActivityEnterView.N0.dismiss();
        }
    }
}
