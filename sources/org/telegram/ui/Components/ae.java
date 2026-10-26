package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class ae implements hi.r0, org.telegram.ui.ActionBar.b2, hu, org.telegram.ui.ActionBar.m1 {
    public final ChatActivityEnterView f26490a;

    public ae(ChatActivityEnterView chatActivityEnterView) {
        this.f26490a = chatActivityEnterView;
    }

    @Override
    public void g() {
        ChatActivityEnterView chatActivityEnterView = this.f26490a;
        chatActivityEnterView.E0.invalidateEffects();
        og ogVar = chatActivityEnterView.Z2;
        if (ogVar != null) {
            ogVar.g1(chatActivityEnterView.E0.getTextToUse());
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        int i11 = ChatActivityEnterView.f25843r5;
        ChatActivityEnterView chatActivityEnterView = this.f26490a;
        chatActivityEnterView.L();
        pf pfVar = chatActivityEnterView.E0;
        if (pfVar != null) {
            pfVar.setText("");
        }
    }

    @Override
    public void n(KeyEvent keyEvent) {
        ChatActivityEnterView chatActivityEnterView;
        lf lfVar;
        int i10 = ChatActivityEnterView.f25843r5;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (lfVar = (chatActivityEnterView = this.f26490a).N0) != null && lfVar.isShowing()) {
            chatActivityEnterView.N0.dismiss();
        }
    }
}
