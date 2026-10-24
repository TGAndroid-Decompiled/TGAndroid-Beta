package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class xd implements gi.k0, org.telegram.ui.ActionBar.z1, eu, org.telegram.ui.ActionBar.k1 {
    public final ChatActivityEnterView f32562a;

    public xd(ChatActivityEnterView chatActivityEnterView) {
        this.f32562a = chatActivityEnterView;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        int i11 = ChatActivityEnterView.f24051r5;
        ChatActivityEnterView chatActivityEnterView = this.f32562a;
        chatActivityEnterView.L();
        nf nfVar = chatActivityEnterView.E0;
        if (nfVar != null) {
            nfVar.setText("");
        }
    }

    @Override
    public void h() {
        ChatActivityEnterView chatActivityEnterView = this.f32562a;
        chatActivityEnterView.E0.invalidateEffects();
        mg mgVar = chatActivityEnterView.Z2;
        if (mgVar != null) {
            mgVar.q1(chatActivityEnterView.E0.getTextToUse());
        }
    }

    @Override
    public void j(KeyEvent keyEvent) {
        ChatActivityEnterView chatActivityEnterView;
        jf jfVar;
        int i10 = ChatActivityEnterView.f24051r5;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (jfVar = (chatActivityEnterView = this.f32562a).N0) != null && jfVar.isShowing()) {
            chatActivityEnterView.N0.dismiss();
        }
    }
}
