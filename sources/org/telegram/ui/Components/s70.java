package org.telegram.ui.Components;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
public final class s70 implements RequestDelegate {
    public final int f30229a = 0;
    public final long f30230b;
    public final boolean f30231c;
    public final Object d;
    public final Object e;

    public s70(u70 u70Var, long j10, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.d = u70Var;
        this.f30230b = j10;
        this.f30231c = z10;
        this.e = tL_messages_importChatInvite;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f30229a) {
            case 0:
                u70 u70Var = (u70) this.d;
                TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = (TLRPC.TL_messages_importChatInvite) this.e;
                if (tLObject instanceof TLRPC.TL_chatInviteJoinResultOk) {
                    org.telegram.messenger.wp.r1(u70Var.f21584a).L3(((TLRPC.TL_chatInviteJoinResultOk) tLObject).updates, false);
                } else if (tLObject instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                    org.telegram.messenger.i0.g3(new n70(u70Var, (TLRPC.TL_chatInviteJoinResultWebView) tLObject, this.f30230b, 0));
                }
                org.telegram.messenger.i0.g3(new org.telegram.ui.kp(u70Var, tL_error, this.f30231c, tL_messages_importChatInvite, 3));
                return;
            case 1:
                org.telegram.messenger.i0.g3(new hf((org.telegram.ui.ta0) this.d, tLObject, this.f30230b, (String) this.e, this.f30231c, tL_error));
                return;
            default:
                org.telegram.messenger.i0.g3(new hf((rh.i) this.d, tL_error, tLObject, (TwoStepVerificationActivity) this.e, this.f30231c, this.f30230b));
                return;
        }
    }

    public s70(org.telegram.ui.ta0 ta0Var, long j10, String str, boolean z10) {
        this.d = ta0Var;
        this.f30230b = j10;
        this.e = str;
        this.f30231c = z10;
    }

    public s70(rh.i iVar, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, long j10) {
        this.d = iVar;
        this.e = twoStepVerificationActivity;
        this.f30231c = z10;
        this.f30230b = j10;
    }
}
