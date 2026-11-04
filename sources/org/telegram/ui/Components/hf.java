package org.telegram.ui.Components;

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.LaunchActivity;
public final class hf implements Runnable {
    public final org.telegram.messenger.zi f34374a;
    public final long f34375b;
    public final TL_keyboard.KeyboardButtonProto f34376c;
    public final org.telegram.messenger.zi d;
    public final TLRPC.User f34377e;
    public final ChatActivityEnterView f34378f;

    public hf(ChatActivityEnterView chatActivityEnterView, org.telegram.messenger.zi ziVar, long j10, TL_keyboard.KeyboardButtonProto keyboardButtonProto, org.telegram.messenger.zi ziVar2, TLRPC.User user) {
        this.f34378f = chatActivityEnterView;
        this.f34374a = ziVar;
        this.f34375b = j10;
        this.f34376c = keyboardButtonProto;
        this.d = ziVar2;
        this.f34377e = user;
    }

    @Override
    public final void run() {
        int i3;
        long h92;
        String F1;
        ChatActivityEnterView chatActivityEnterView = this.f34378f;
        org.telegram.ui.wm wmVar = chatActivityEnterView.Q2;
        if (chatActivityEnterView.f31163n1.Q() <= org.telegram.messenger.g0.L(20.0f) && !chatActivityEnterView.r0()) {
            if (wmVar != null) {
                int i10 = chatActivityEnterView.R;
                long j10 = this.f34374a.f26868k.dialog_id;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = this.f34376c;
                String text = keyboardButtonProto.getText();
                String url = keyboardButtonProto.getUrl();
                boolean c2 = dg.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeSimpleWebView.class);
                org.telegram.messenger.zi ziVar = this.d;
                if (ziVar != null) {
                    i3 = ziVar.f26868k.f27022id;
                } else {
                    i3 = 0;
                }
                if (wmVar == null) {
                    h92 = 0;
                } else {
                    h92 = wmVar.h9();
                }
                ii.q4 b10 = ii.q4.b(i10, j10, this.f34375b, text, url, c2 ? 1 : 0, i3, h92, null, false, null, null, 0, false, false);
                LaunchActivity launchActivity = LaunchActivity.K1;
                if (launchActivity != null && launchActivity.O() != null && LaunchActivity.K1.O().k(b10) != null) {
                    ii.a0 a0Var = chatActivityEnterView.m0;
                    if (a0Var != null) {
                        a0Var.setOpened(false);
                        return;
                    }
                    return;
                }
                TLRPC.User user = this.f34377e;
                if (user == null) {
                    F1 = null;
                } else {
                    F1 = org.telegram.messenger.hp.s1(chatActivityEnterView.R).F1(user.restriction_reason);
                }
                if (!TextUtils.isEmpty(F1)) {
                    org.telegram.messenger.hp.s1(chatActivityEnterView.R);
                    org.telegram.messenger.hp.R4(F1, wmVar);
                    return;
                }
                ii.a3 a3Var = new ii.a3(chatActivityEnterView.getContext(), chatActivityEnterView.X3);
                a3Var.m0 = chatActivityEnterView.P2;
                a3Var.x(wmVar, b10);
                a3Var.show();
                return;
            }
            return;
        }
        chatActivityEnterView.j0(false);
        org.telegram.messenger.g0.v1(chatActivityEnterView);
        org.telegram.messenger.g0.i3(this, 150L);
    }
}
