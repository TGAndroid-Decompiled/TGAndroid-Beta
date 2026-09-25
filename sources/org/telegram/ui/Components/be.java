package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class be implements ei.m0, org.telegram.ui.ActionBar.z1, au, org.telegram.ui.ActionBar.k1 {
    public final ChatActivityEnterView f22998a;

    public be(ChatActivityEnterView chatActivityEnterView) {
        this.f22998a = chatActivityEnterView;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        int i11 = ChatActivityEnterView.f21953n5;
        ChatActivityEnterView chatActivityEnterView = this.f22998a;
        chatActivityEnterView.O();
        qf qfVar = chatActivityEnterView.E0;
        if (qfVar != null) {
            qfVar.setText("");
        }
    }

    @Override
    public void j() {
        ChatActivityEnterView chatActivityEnterView = this.f22998a;
        chatActivityEnterView.E0.invalidateEffects();
        og ogVar = chatActivityEnterView.Z2;
        if (ogVar != null) {
            ogVar.v1(chatActivityEnterView.E0.getTextToUse());
        }
    }

    @Override
    public void p(KeyEvent keyEvent) {
        ChatActivityEnterView chatActivityEnterView;
        mf mfVar;
        int i10 = ChatActivityEnterView.f21953n5;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (mfVar = (chatActivityEnterView = this.f22998a).N0) != null && mfVar.isShowing()) {
            chatActivityEnterView.N0.dismiss();
        }
    }
}
