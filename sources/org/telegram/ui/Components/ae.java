package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class ae implements fi.m0, org.telegram.ui.ActionBar.a2, xt, org.telegram.ui.ActionBar.l1 {
    public final ChatActivityEnterView f24343a;

    public ae(ChatActivityEnterView chatActivityEnterView) {
        this.f24343a = chatActivityEnterView;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11 = ChatActivityEnterView.f23661m5;
        ChatActivityEnterView chatActivityEnterView = this.f24343a;
        chatActivityEnterView.O();
        qf qfVar = chatActivityEnterView.E0;
        if (qfVar != null) {
            qfVar.setText("");
        }
    }

    @Override
    public void j() {
        ChatActivityEnterView chatActivityEnterView = this.f24343a;
        chatActivityEnterView.E0.invalidateEffects();
        og ogVar = chatActivityEnterView.Y2;
        if (ogVar != null) {
            ogVar.p1(chatActivityEnterView.E0.getTextToUse());
        }
    }

    @Override
    public void n(KeyEvent keyEvent) {
        ChatActivityEnterView chatActivityEnterView;
        mf mfVar;
        int i10 = ChatActivityEnterView.f23661m5;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (mfVar = (chatActivityEnterView = this.f24343a).N0) != null && mfVar.isShowing()) {
            chatActivityEnterView.N0.dismiss();
        }
    }
}
