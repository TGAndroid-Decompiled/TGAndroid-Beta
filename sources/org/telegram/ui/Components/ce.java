package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class ce implements ei.m0, org.telegram.ui.ActionBar.z1, cu, org.telegram.ui.ActionBar.k1 {
    public final ChatActivityEnterView f23296a;

    public ce(ChatActivityEnterView chatActivityEnterView) {
        this.f23296a = chatActivityEnterView;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        int i11 = ChatActivityEnterView.f21974n5;
        ChatActivityEnterView chatActivityEnterView = this.f23296a;
        chatActivityEnterView.O();
        rf rfVar = chatActivityEnterView.E0;
        if (rfVar != null) {
            rfVar.setText("");
        }
    }

    @Override
    public void j() {
        ChatActivityEnterView chatActivityEnterView = this.f23296a;
        chatActivityEnterView.E0.invalidateEffects();
        pg pgVar = chatActivityEnterView.Z2;
        if (pgVar != null) {
            pgVar.v1(chatActivityEnterView.E0.getTextToUse());
        }
    }

    @Override
    public void p(KeyEvent keyEvent) {
        ChatActivityEnterView chatActivityEnterView;
        nf nfVar;
        int i10 = ChatActivityEnterView.f21974n5;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (nfVar = (chatActivityEnterView = this.f23296a).N0) != null && nfVar.isShowing()) {
            chatActivityEnterView.N0.dismiss();
        }
    }
}
