package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class zd implements gi.k0, org.telegram.ui.ActionBar.a2, gu, org.telegram.ui.ActionBar.k1 {
    public final ChatActivityEnterView f32876a;

    public zd(ChatActivityEnterView chatActivityEnterView) {
        this.f32876a = chatActivityEnterView;
    }

    @Override
    public void E() {
        ChatActivityEnterView chatActivityEnterView = this.f32876a;
        chatActivityEnterView.E0.invalidateEffects();
        og ogVar = chatActivityEnterView.Z2;
        if (ogVar != null) {
            ogVar.q1(chatActivityEnterView.E0.getTextToUse());
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11 = ChatActivityEnterView.f23908n5;
        ChatActivityEnterView chatActivityEnterView = this.f32876a;
        chatActivityEnterView.M();
        pf pfVar = chatActivityEnterView.E0;
        if (pfVar != null) {
            pfVar.setText("");
        }
    }

    @Override
    public void n(KeyEvent keyEvent) {
        ChatActivityEnterView chatActivityEnterView;
        lf lfVar;
        int i10 = ChatActivityEnterView.f23908n5;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (lfVar = (chatActivityEnterView = this.f32876a).N0) != null && lfVar.isShowing()) {
            chatActivityEnterView.N0.dismiss();
        }
    }
}
