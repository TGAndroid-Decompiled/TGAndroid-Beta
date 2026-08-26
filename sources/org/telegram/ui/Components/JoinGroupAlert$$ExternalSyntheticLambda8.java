package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

public final class JoinGroupAlert$$ExternalSyntheticLambda8 implements Runnable {
    public final int $r8$classId;
    public final JoinGroupAlert f$0;
    public final TLRPC.TL_chatInviteJoinResultWebView f$1;
    public final long f$2;

    public JoinGroupAlert$$ExternalSyntheticLambda8(JoinGroupAlert joinGroupAlert, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = joinGroupAlert;
        this.f$1 = tL_chatInviteJoinResultWebView;
        this.f$2 = j;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$new$9(this.f$1, this.f$2);
                break;
            default:
                this.f$0.lambda$new$4(this.f$1, this.f$2);
                break;
        }
    }
}
