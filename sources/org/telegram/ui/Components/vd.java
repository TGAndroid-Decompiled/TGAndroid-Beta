package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class vd implements f5, ei.m0, org.telegram.ui.ActionBar.z1, su, org.telegram.ui.ActionBar.k1 {
    public final ChatActivityEnterView f31492a;

    public vd(ChatActivityEnterView chatActivityEnterView) {
        this.f31492a = chatActivityEnterView;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        int i12 = ChatActivityEnterView.Q5;
        this.f31492a.W0(i10, z10, i11, true, 0L);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        int i11 = ChatActivityEnterView.Q5;
        ChatActivityEnterView chatActivityEnterView = this.f31492a;
        chatActivityEnterView.P();
        uf ufVar = chatActivityEnterView.E0;
        if (ufVar != null) {
            ufVar.setText("");
        }
    }

    @Override
    public void i() {
        ChatActivityEnterView chatActivityEnterView = this.f31492a;
        chatActivityEnterView.E0.invalidateEffects();
        if (chatActivityEnterView.f23691m3) {
            chatActivityEnterView.U1();
            chatActivityEnterView.J0.invalidate();
            return;
        }
        sg sgVar = chatActivityEnterView.Z2;
        if (sgVar != null) {
            sgVar.C1(chatActivityEnterView.E0.getTextToUse());
        }
    }

    @Override
    public void o(KeyEvent keyEvent) {
        ChatActivityEnterView chatActivityEnterView;
        qf qfVar;
        int i10 = ChatActivityEnterView.Q5;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (qfVar = (chatActivityEnterView = this.f31492a).N0) != null && qfVar.isShowing()) {
            chatActivityEnterView.N0.dismiss();
        }
    }
}
