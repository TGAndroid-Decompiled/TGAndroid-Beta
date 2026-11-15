package org.telegram.ui.Components;

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.LaunchActivity;
public final class qf implements Runnable {
    public final org.telegram.messenger.gj f38645a;
    public final long f38646b;
    public final TL_keyboard.KeyboardButtonProto f38647c;
    public final org.telegram.messenger.gj d;
    public final TLRPC.User f38648e;
    public final ChatActivityEnterView f38649f;

    public qf(ChatActivityEnterView chatActivityEnterView, org.telegram.messenger.gj gjVar, long j3, TL_keyboard.KeyboardButtonProto keyboardButtonProto, org.telegram.messenger.gj gjVar2, TLRPC.User user) {
        this.f38649f = chatActivityEnterView;
        this.f38645a = gjVar;
        this.f38646b = j3;
        this.f38647c = keyboardButtonProto;
        this.d = gjVar2;
        this.f38648e = user;
    }

    @Override
    public final void run() {
        int i7;
        long j92;
        String F1;
        ChatActivityEnterView chatActivityEnterView = this.f38649f;
        org.telegram.ui.an anVar = chatActivityEnterView.f32319x3;
        if (chatActivityEnterView.U1.Q() <= org.telegram.messenger.g0.L(20.0f) && !chatActivityEnterView.G0()) {
            if (anVar != null) {
                int i10 = chatActivityEnterView.R;
                long j3 = this.f38645a.f23817k.dialog_id;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = this.f38647c;
                String text = keyboardButtonProto.getText();
                String url = keyboardButtonProto.getUrl();
                boolean c10 = cg.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeSimpleWebView.class);
                org.telegram.messenger.gj gjVar = this.d;
                if (gjVar != null) {
                    i7 = gjVar.f23817k.f28072id;
                } else {
                    i7 = 0;
                }
                if (anVar == null) {
                    j92 = 0;
                } else {
                    j92 = anVar.j9();
                }
                ki.k4 b10 = ki.k4.b(i10, j3, this.f38646b, text, url, c10 ? 1 : 0, i7, j92, null, false, null, null, 0, false, false);
                LaunchActivity launchActivity = LaunchActivity.H1;
                if (launchActivity != null && launchActivity.N() != null && LaunchActivity.H1.N().k(b10) != null) {
                    ki.a0 a0Var = chatActivityEnterView.m0;
                    if (a0Var != null) {
                        a0Var.setOpened(false);
                        return;
                    }
                    return;
                }
                TLRPC.User user = this.f38648e;
                if (user == null) {
                    F1 = null;
                } else {
                    F1 = org.telegram.messenger.np.s1(chatActivityEnterView.R).F1(user.restriction_reason);
                }
                if (!TextUtils.isEmpty(F1)) {
                    org.telegram.messenger.np.s1(chatActivityEnterView.R);
                    org.telegram.messenger.np.S4(F1, anVar);
                    return;
                }
                ki.x2 x2Var = new ki.x2(chatActivityEnterView.getContext(), chatActivityEnterView.E4);
                x2Var.m0 = chatActivityEnterView.f32311w3;
                x2Var.x(anVar, b10);
                x2Var.show();
                return;
            }
            return;
        }
        chatActivityEnterView.y0(false);
        org.telegram.messenger.g0.v1(chatActivityEnterView);
        org.telegram.messenger.g0.i3(this, 150L);
    }
}
