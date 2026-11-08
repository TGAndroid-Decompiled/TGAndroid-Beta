package org.telegram.ui.Components;

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.LaunchActivity;
public final class kf implements Runnable {
    public final org.telegram.messenger.ij f35289a;
    public final long f35290b;
    public final TL_keyboard.KeyboardButtonProto f35291c;
    public final org.telegram.messenger.ij d;
    public final TLRPC.User f35292e;
    public final ChatActivityEnterView f35293f;

    public kf(ChatActivityEnterView chatActivityEnterView, org.telegram.messenger.ij ijVar, long j3, TL_keyboard.KeyboardButtonProto keyboardButtonProto, org.telegram.messenger.ij ijVar2, TLRPC.User user) {
        this.f35293f = chatActivityEnterView;
        this.f35289a = ijVar;
        this.f35290b = j3;
        this.f35291c = keyboardButtonProto;
        this.d = ijVar2;
        this.f35292e = user;
    }

    @Override
    public final void run() {
        int i7;
        long h92;
        String F1;
        ChatActivityEnterView chatActivityEnterView = this.f35293f;
        org.telegram.ui.an anVar = chatActivityEnterView.P2;
        if (chatActivityEnterView.f31087m1.Q() <= org.telegram.messenger.g0.L(20.0f) && !chatActivityEnterView.s0()) {
            if (anVar != null) {
                int i10 = chatActivityEnterView.Q;
                long j3 = this.f35289a.f23262k.dialog_id;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = this.f35291c;
                String text = keyboardButtonProto.getText();
                String url = keyboardButtonProto.getUrl();
                boolean c10 = cg.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeSimpleWebView.class);
                org.telegram.messenger.ij ijVar = this.d;
                if (ijVar != null) {
                    i7 = ijVar.f23262k.f26977id;
                } else {
                    i7 = 0;
                }
                if (anVar == null) {
                    h92 = 0;
                } else {
                    h92 = anVar.h9();
                }
                hi.q4 b10 = hi.q4.b(i10, j3, this.f35290b, text, url, c10 ? 1 : 0, i7, h92, null, false, null, null, 0, false, false);
                LaunchActivity launchActivity = LaunchActivity.G1;
                if (launchActivity != null && launchActivity.O() != null && LaunchActivity.G1.O().k(b10) != null) {
                    hi.y yVar = chatActivityEnterView.f31082l0;
                    if (yVar != null) {
                        yVar.setOpened(false);
                        return;
                    }
                    return;
                }
                TLRPC.User user = this.f35292e;
                if (user == null) {
                    F1 = null;
                } else {
                    F1 = org.telegram.messenger.qp.s1(chatActivityEnterView.Q).F1(user.restriction_reason);
                }
                if (!TextUtils.isEmpty(F1)) {
                    org.telegram.messenger.qp.s1(chatActivityEnterView.Q);
                    org.telegram.messenger.qp.R4(F1, anVar);
                    return;
                }
                hi.a3 a3Var = new hi.a3(chatActivityEnterView.getContext(), chatActivityEnterView.W3);
                a3Var.f14526l0 = chatActivityEnterView.O2;
                a3Var.x(anVar, b10);
                a3Var.show();
                return;
            }
            return;
        }
        chatActivityEnterView.k0(false);
        org.telegram.messenger.g0.v1(chatActivityEnterView);
        org.telegram.messenger.g0.i3(this, 150L);
    }
}
