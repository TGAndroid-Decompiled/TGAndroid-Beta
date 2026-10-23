package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class zd implements gi.k0, org.telegram.ui.ActionBar.z1, gu, org.telegram.ui.ActionBar.k1 {
    public final ChatActivityEnterView f33202a;

    public zd(ChatActivityEnterView chatActivityEnterView) {
        this.f33202a = chatActivityEnterView;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        int i11 = ChatActivityEnterView.f24050r5;
        ChatActivityEnterView chatActivityEnterView = this.f33202a;
        chatActivityEnterView.L();
        pf pfVar = chatActivityEnterView.E0;
        if (pfVar != null) {
            pfVar.setText("");
        }
    }

    @Override
    public void h() {
        ChatActivityEnterView chatActivityEnterView = this.f33202a;
        chatActivityEnterView.E0.invalidateEffects();
        og ogVar = chatActivityEnterView.Z2;
        if (ogVar != null) {
            ogVar.q1(chatActivityEnterView.E0.getTextToUse());
        }
    }

    @Override
    public void j(KeyEvent keyEvent) {
        ChatActivityEnterView chatActivityEnterView;
        lf lfVar;
        int i10 = ChatActivityEnterView.f24050r5;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (lfVar = (chatActivityEnterView = this.f33202a).N0) != null && lfVar.isShowing()) {
            chatActivityEnterView.N0.dismiss();
        }
    }
}
