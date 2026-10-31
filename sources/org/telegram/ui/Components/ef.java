package org.telegram.ui.Components;

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.LaunchActivity;
public final class ef implements Runnable {
    public final org.telegram.messenger.jj f25768a;
    public final long f25769b;
    public final TL_keyboard.KeyboardButtonProto f25770c;
    public final org.telegram.messenger.jj d;
    public final TLRPC.User e;
    public final ChatActivityEnterView f25771f;

    public ef(ChatActivityEnterView chatActivityEnterView, org.telegram.messenger.jj jjVar, long j10, TL_keyboard.KeyboardButtonProto keyboardButtonProto, org.telegram.messenger.jj jjVar2, TLRPC.User user) {
        this.f25771f = chatActivityEnterView;
        this.f25768a = jjVar;
        this.f25769b = j10;
        this.f25770c = keyboardButtonProto;
        this.d = jjVar2;
        this.e = user;
    }

    @Override
    public final void run() {
        int i10;
        long a92;
        String E1;
        ChatActivityEnterView chatActivityEnterView = this.f25771f;
        org.telegram.ui.un unVar = chatActivityEnterView.P2;
        if (chatActivityEnterView.f23746m1.Q() <= org.telegram.messenger.i0.L(20.0f) && !chatActivityEnterView.q0()) {
            if (unVar != null) {
                int i11 = chatActivityEnterView.Q;
                long j10 = this.f25768a.f16337k.dialog_id;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = this.f25770c;
                String text = keyboardButtonProto.getText();
                String url = keyboardButtonProto.getUrl();
                boolean c10 = sf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeSimpleWebView.class);
                org.telegram.messenger.jj jjVar = this.d;
                if (jjVar != null) {
                    i10 = jjVar.f16337k.f19814id;
                } else {
                    i10 = 0;
                }
                if (unVar == null) {
                    a92 = 0;
                } else {
                    a92 = unVar.a9();
                }
                xh.s3 b10 = xh.s3.b(i11, j10, this.f25769b, text, url, c10 ? 1 : 0, i10, a92, null, false, null, null, 0, false, false);
                LaunchActivity launchActivity = LaunchActivity.I1;
                if (launchActivity != null && launchActivity.O() != null && LaunchActivity.I1.O().m(b10) != null) {
                    xh.w wVar = chatActivityEnterView.f23742l0;
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
                    E1 = org.telegram.messenger.vp.r1(chatActivityEnterView.Q).E1(user.restriction_reason);
                }
                if (!TextUtils.isEmpty(E1)) {
                    org.telegram.messenger.vp.r1(chatActivityEnterView.Q);
                    org.telegram.messenger.vp.O4(E1, unVar);
                    return;
                }
                xh.m2 m2Var = new xh.m2(chatActivityEnterView.getContext(), chatActivityEnterView.W3);
                m2Var.f53889l0 = chatActivityEnterView.O2;
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
