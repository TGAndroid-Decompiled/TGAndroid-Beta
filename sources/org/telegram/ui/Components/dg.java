package org.telegram.ui.Components;

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.LaunchActivity;
public final class dg implements Runnable {
    public final org.telegram.messenger.fj f34496a;
    public final long f34497b;
    public final TL_keyboard.KeyboardButtonProto f34498c;
    public final org.telegram.messenger.fj d;
    public final TLRPC.User f34499e;
    public final ChatActivityEnterView f34500f;

    public dg(ChatActivityEnterView chatActivityEnterView, org.telegram.messenger.fj fjVar, long j3, TL_keyboard.KeyboardButtonProto keyboardButtonProto, org.telegram.messenger.fj fjVar2, TLRPC.User user) {
        this.f34500f = chatActivityEnterView;
        this.f34496a = fjVar;
        this.f34497b = j3;
        this.f34498c = keyboardButtonProto;
        this.d = fjVar2;
        this.f34499e = user;
    }

    @Override
    public final void run() {
        int i7;
        long j92;
        String H1;
        ChatActivityEnterView chatActivityEnterView = this.f34500f;
        org.telegram.ui.bn bnVar = chatActivityEnterView.F3;
        if (chatActivityEnterView.f32588c2.Q() <= org.telegram.messenger.g0.L(20.0f) && !chatActivityEnterView.S0()) {
            if (bnVar != null) {
                int i10 = chatActivityEnterView.R;
                long j3 = this.f34496a.f23993k.dialog_id;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = this.f34498c;
                String text = keyboardButtonProto.getText();
                String url = keyboardButtonProto.getUrl();
                boolean c10 = cg.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeSimpleWebView.class);
                org.telegram.messenger.fj fjVar = this.d;
                if (fjVar != null) {
                    i7 = fjVar.f23993k.f28452id;
                } else {
                    i7 = 0;
                }
                if (bnVar == null) {
                    j92 = 0;
                } else {
                    j92 = bnVar.j9();
                }
                ki.e4 b10 = ki.e4.b(i10, j3, this.f34497b, text, url, c10 ? 1 : 0, i7, j92, null, false, null, null, 0, false, false);
                LaunchActivity launchActivity = LaunchActivity.H1;
                if (launchActivity != null && launchActivity.N() != null && LaunchActivity.H1.N().k(b10) != null) {
                    ki.y yVar = chatActivityEnterView.m0;
                    if (yVar != null) {
                        yVar.setOpened(false);
                        return;
                    }
                    return;
                }
                TLRPC.User user = this.f34499e;
                if (user == null) {
                    H1 = null;
                } else {
                    H1 = org.telegram.messenger.mp.u1(chatActivityEnterView.R).H1(user.restriction_reason);
                }
                if (!TextUtils.isEmpty(H1)) {
                    org.telegram.messenger.mp.u1(chatActivityEnterView.R);
                    org.telegram.messenger.mp.d5(H1, bnVar);
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
