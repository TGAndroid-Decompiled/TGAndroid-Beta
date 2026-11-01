package org.telegram.ui.Components;

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.LaunchActivity;
public final class ef implements Runnable {
    public final org.telegram.messenger.kj f25802a;
    public final long f25803b;
    public final TL_keyboard.KeyboardButtonProto f25804c;
    public final org.telegram.messenger.kj d;
    public final TLRPC.User e;
    public final ChatActivityEnterView f25805f;

    public ef(ChatActivityEnterView chatActivityEnterView, org.telegram.messenger.kj kjVar, long j10, TL_keyboard.KeyboardButtonProto keyboardButtonProto, org.telegram.messenger.kj kjVar2, TLRPC.User user) {
        this.f25805f = chatActivityEnterView;
        this.f25802a = kjVar;
        this.f25803b = j10;
        this.f25804c = keyboardButtonProto;
        this.d = kjVar2;
        this.e = user;
    }

    @Override
    public final void run() {
        int i10;
        long e92;
        String E1;
        ChatActivityEnterView chatActivityEnterView = this.f25805f;
        org.telegram.ui.un unVar = chatActivityEnterView.P2;
        if (chatActivityEnterView.f23747m1.Q() <= org.telegram.messenger.i0.L(20.0f) && !chatActivityEnterView.q0()) {
            if (unVar != null) {
                int i11 = chatActivityEnterView.Q;
                long j10 = this.f25802a.f16690k.dialog_id;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = this.f25804c;
                String text = keyboardButtonProto.getText();
                String url = keyboardButtonProto.getUrl();
                boolean c10 = sf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeSimpleWebView.class);
                org.telegram.messenger.kj kjVar = this.d;
                if (kjVar != null) {
                    i10 = kjVar.f16690k.f19815id;
                } else {
                    i10 = 0;
                }
                if (unVar == null) {
                    e92 = 0;
                } else {
                    e92 = unVar.e9();
                }
                xh.t3 b10 = xh.t3.b(i11, j10, this.f25803b, text, url, c10 ? 1 : 0, i10, e92, null, false, null, null, 0, false, false);
                LaunchActivity launchActivity = LaunchActivity.I1;
                if (launchActivity != null && launchActivity.N() != null && LaunchActivity.I1.N().m(b10) != null) {
                    xh.w wVar = chatActivityEnterView.f23743l0;
                    if (wVar != null) {
                        wVar.setOpened(false);
                        return;
                    }
                    return;
                }
                TLRPC.User user = this.e;
                if (user == null) {
                    E1 = null;
                } else {
                    E1 = org.telegram.messenger.wp.r1(chatActivityEnterView.Q).E1(user.restriction_reason);
                }
                if (!TextUtils.isEmpty(E1)) {
                    org.telegram.messenger.wp.r1(chatActivityEnterView.Q);
                    org.telegram.messenger.wp.O4(E1, unVar);
                    return;
                }
                xh.m2 m2Var = new xh.m2(chatActivityEnterView.getContext(), chatActivityEnterView.W3);
                m2Var.f53906l0 = chatActivityEnterView.O2;
                m2Var.x(unVar, b10);
                m2Var.show();
                return;
            }
            return;
        }
        chatActivityEnterView.i0(false);
        org.telegram.messenger.i0.v1(chatActivityEnterView);
        org.telegram.messenger.i0.h3(this, 150L);
    }
}
