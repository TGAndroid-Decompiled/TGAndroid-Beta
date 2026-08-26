package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

public final class LaunchActivity$$ExternalSyntheticLambda115 implements RequestDelegate {
    public final int $r8$classId;
    public final LaunchActivity f$0;
    public final Object f$1;
    public final int f$2;
    public final Object f$3;
    public final Object f$4;
    public final Object f$5;
    public final Object f$6;
    public final Object f$7;

    public LaunchActivity$$ExternalSyntheticLambda115(LaunchActivity launchActivity, Object obj, int i, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i2) {
        this.$r8$classId = i2;
        this.f$0 = launchActivity;
        this.f$1 = obj;
        this.f$2 = i;
        this.f$3 = obj2;
        this.f$4 = obj3;
        this.f$5 = obj4;
        this.f$6 = obj5;
        this.f$7 = obj6;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$runLinkRequest$93((Runnable) this.f$1, this.f$2, (TL_account.authorizationForm) this.f$3, (TL_account.getAuthorizationForm) this.f$4, (String) this.f$5, (String) this.f$6, (String) this.f$7, tLObject, tL_error);
                break;
            case 1:
                this.f$0.lambda$runLinkRequest$95((int[]) this.f$1, this.f$2, (LinkManager$$ExternalSyntheticLambda2) this.f$3, (TL_account.getAuthorizationForm) this.f$4, (String) this.f$5, (String) this.f$6, (String) this.f$7, tLObject, tL_error);
                break;
            default:
                Long l = (Long) this.f$6;
                this.f$0.lambda$runLinkRequest$107((int[]) this.f$1, this.f$2, (LinkManager$$ExternalSyntheticLambda2) this.f$3, (Integer) this.f$4, (Integer) this.f$5, l, (Integer) this.f$7, tLObject, tL_error);
                break;
        }
    }
}
