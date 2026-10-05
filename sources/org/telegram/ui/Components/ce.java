package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class ce implements ei.n0, org.telegram.ui.ActionBar.a2, cu, org.telegram.ui.ActionBar.l1 {
    public final ChatActivityEnterView f25406a;

    public ce(ChatActivityEnterView chatActivityEnterView) {
        this.f25406a = chatActivityEnterView;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11 = ChatActivityEnterView.f23854n5;
        ChatActivityEnterView chatActivityEnterView = this.f25406a;
        chatActivityEnterView.M();
        rf rfVar = chatActivityEnterView.E0;
        if (rfVar != null) {
            rfVar.setText("");
        }
    }

    @Override
    public void j() {
        ChatActivityEnterView chatActivityEnterView = this.f25406a;
        chatActivityEnterView.E0.invalidateEffects();
        pg pgVar = chatActivityEnterView.Z2;
        if (pgVar != null) {
            pgVar.v1(chatActivityEnterView.E0.getTextToUse());
        }
    }

    @Override
    public void o(KeyEvent keyEvent) {
        ChatActivityEnterView chatActivityEnterView;
        nf nfVar;
        int i10 = ChatActivityEnterView.f23854n5;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (nfVar = (chatActivityEnterView = this.f25406a).N0) != null && nfVar.isShowing()) {
            chatActivityEnterView.N0.dismiss();
        }
    }
}
