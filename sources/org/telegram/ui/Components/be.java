package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class be implements fi.l0, org.telegram.ui.ActionBar.z1, lu, org.telegram.ui.ActionBar.k1 {
    public final ChatActivityEnterView f23441a;

    public be(ChatActivityEnterView chatActivityEnterView) {
        this.f23441a = chatActivityEnterView;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        int i11 = ChatActivityEnterView.f22549n5;
        ChatActivityEnterView chatActivityEnterView = this.f23441a;
        chatActivityEnterView.M();
        rf rfVar = chatActivityEnterView.E0;
        if (rfVar != null) {
            rfVar.setText("");
        }
    }

    @Override
    public void n(KeyEvent keyEvent) {
        ChatActivityEnterView chatActivityEnterView;
        nf nfVar;
        int i10 = ChatActivityEnterView.f22549n5;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (nfVar = (chatActivityEnterView = this.f23441a).N0) != null && nfVar.isShowing()) {
            chatActivityEnterView.N0.dismiss();
        }
    }

    @Override
    public void p() {
        ChatActivityEnterView chatActivityEnterView = this.f23441a;
        chatActivityEnterView.E0.invalidateEffects();
        pg pgVar = chatActivityEnterView.Z2;
        if (pgVar != null) {
            pgVar.r1(chatActivityEnterView.E0.getTextToUse());
        }
    }
}
