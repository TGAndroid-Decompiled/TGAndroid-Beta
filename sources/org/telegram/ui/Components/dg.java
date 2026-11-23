package org.telegram.ui.Components;

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.LaunchActivity;
public final class dg implements Runnable {
    public final org.telegram.messenger.gj f34491a;
    public final long f34492b;
    public final TL_keyboard.KeyboardButtonProto f34493c;
    public final org.telegram.messenger.gj d;
    public final TLRPC.User f34494e;
    public final ChatActivityEnterView f34495f;

    public dg(ChatActivityEnterView chatActivityEnterView, org.telegram.messenger.gj gjVar, long j3, TL_keyboard.KeyboardButtonProto keyboardButtonProto, org.telegram.messenger.gj gjVar2, TLRPC.User user) {
        this.f34495f = chatActivityEnterView;
        this.f34491a = gjVar;
        this.f34492b = j3;
        this.f34493c = keyboardButtonProto;
        this.d = gjVar2;
        this.f34494e = user;
    }

    @Override
    public final void run() {
        int i7;
        long j92;
        String H1;
        ChatActivityEnterView chatActivityEnterView = this.f34495f;
        org.telegram.ui.bn bnVar = chatActivityEnterView.F3;
        if (chatActivityEnterView.f32591c2.Q() <= org.telegram.messenger.g0.L(20.0f) && !chatActivityEnterView.S0()) {
            if (bnVar != null) {
                int i10 = chatActivityEnterView.R;
                long j3 = this.f34491a.f24213k.dialog_id;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = this.f34493c;
                String text = keyboardButtonProto.getText();
                String url = keyboardButtonProto.getUrl();
                boolean c10 = cg.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeSimpleWebView.class);
                org.telegram.messenger.gj gjVar = this.d;
                if (gjVar != null) {
                    i7 = gjVar.f24213k.f28455id;
                } else {
                    i7 = 0;
                }
                if (bnVar == null) {
                    j92 = 0;
                } else {
                    j92 = bnVar.j9();
                }
                ki.e4 b10 = ki.e4.b(i10, j3, this.f34492b, text, url, c10 ? 1 : 0, i7, j92, null, false, null, null, 0, false, false);
                LaunchActivity launchActivity = LaunchActivity.H1;
                if (launchActivity != null && launchActivity.N() != null && LaunchActivity.H1.N().k(b10) != null) {
                    ki.y yVar = chatActivityEnterView.m0;
                    if (yVar != null) {
                        yVar.setOpened(false);
                        return;
                    }
                    return;
                }
                TLRPC.User user = this.f34494e;
                if (user == null) {
                    H1 = null;
                } else {
                    H1 = org.telegram.messenger.np.u1(chatActivityEnterView.R).H1(user.restriction_reason);
                }
                if (!TextUtils.isEmpty(H1)) {
                    org.telegram.messenger.np.u1(chatActivityEnterView.R);
                    org.telegram.messenger.np.d5(H1, bnVar);
                    return;
                }
                ki.s2 s2Var = new ki.s2(chatActivityEnterView.getContext(), chatActivityEnterView.M4);
                s2Var.m0 = chatActivityEnterView.E3;
                s2Var.x(bnVar, b10);
                s2Var.show();
                return;
            }
            return;
        }
        chatActivityEnterView.K0(false);
        org.telegram.messenger.g0.v1(chatActivityEnterView);
        org.telegram.messenger.g0.h3(this, 150L);
    }
}
