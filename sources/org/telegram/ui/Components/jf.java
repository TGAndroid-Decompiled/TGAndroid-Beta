package org.telegram.ui.Components;

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.LaunchActivity;
public final class jf implements Runnable {
    public final org.telegram.messenger.ij f34923a;
    public final long f34924b;
    public final TL_keyboard.KeyboardButtonProto f34925c;
    public final org.telegram.messenger.ij d;
    public final TLRPC.User f34926e;
    public final ChatActivityEnterView f34927f;

    public jf(ChatActivityEnterView chatActivityEnterView, org.telegram.messenger.ij ijVar, long j3, TL_keyboard.KeyboardButtonProto keyboardButtonProto, org.telegram.messenger.ij ijVar2, TLRPC.User user) {
        this.f34927f = chatActivityEnterView;
        this.f34923a = ijVar;
        this.f34924b = j3;
        this.f34925c = keyboardButtonProto;
        this.d = ijVar2;
        this.f34926e = user;
    }

    @Override
    public final void run() {
        int i7;
        long i92;
        String F1;
        ChatActivityEnterView chatActivityEnterView = this.f34927f;
        org.telegram.ui.cn cnVar = chatActivityEnterView.P2;
        if (chatActivityEnterView.f31103m1.Q() <= org.telegram.messenger.g0.L(20.0f) && !chatActivityEnterView.s0()) {
            if (cnVar != null) {
                int i10 = chatActivityEnterView.Q;
                long j3 = this.f34923a.f23266k.dialog_id;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = this.f34925c;
                String text = keyboardButtonProto.getText();
                String url = keyboardButtonProto.getUrl();
                boolean c10 = cg.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeSimpleWebView.class);
                org.telegram.messenger.ij ijVar = this.d;
                if (ijVar != null) {
                    i7 = ijVar.f23266k.f26981id;
                } else {
                    i7 = 0;
                }
                if (cnVar == null) {
                    i92 = 0;
                } else {
                    i92 = cnVar.i9();
                }
                hi.q4 b10 = hi.q4.b(i10, j3, this.f34924b, text, url, c10 ? 1 : 0, i7, i92, null, false, null, null, 0, false, false);
                LaunchActivity launchActivity = LaunchActivity.G1;
                if (launchActivity != null && launchActivity.O() != null && LaunchActivity.G1.O().k(b10) != null) {
                    hi.y yVar = chatActivityEnterView.f31098l0;
                    if (yVar != null) {
                        yVar.setOpened(false);
                        return;
                    }
                    return;
                }
                TLRPC.User user = this.f34926e;
                if (user == null) {
                    F1 = null;
                } else {
                    F1 = org.telegram.messenger.qp.s1(chatActivityEnterView.Q).F1(user.restriction_reason);
                }
                if (!TextUtils.isEmpty(F1)) {
                    org.telegram.messenger.qp.s1(chatActivityEnterView.Q);
                    org.telegram.messenger.qp.R4(F1, cnVar);
                    return;
                }
                hi.a3 a3Var = new hi.a3(chatActivityEnterView.getContext(), chatActivityEnterView.W3);
                a3Var.f14528l0 = chatActivityEnterView.O2;
                a3Var.x(cnVar, b10);
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
