package org.telegram.ui;

import java.util.HashSet;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;

public final class CallLogActivity$9$$ExternalSyntheticLambda1 implements RequestDelegate {
    public final int $r8$classId = 1;
    public final Object f$0;
    public final int f$1;
    public final Object f$2;
    public final boolean f$3;

    public CallLogActivity$9$$ExternalSyntheticLambda1(int i, boolean z, HashSet hashSet, BaseFragment baseFragment) {
        this.f$1 = i;
        this.f$3 = z;
        this.f$0 = hashSet;
        this.f$2 = baseFragment;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                ((CallLogActivity.AnonymousClass9) this.f$0).lambda$onCallUsersSelected$1(this.f$1, (TLRPC.User) this.f$2, this.f$3, tLObject, tL_error);
                break;
            default:
                CallLogActivity.AnonymousClass9.lambda$onCallUsersSelected$3(this.f$1, this.f$3, (HashSet) this.f$0, (BaseFragment) this.f$2, tLObject, tL_error);
                break;
        }
    }

    public CallLogActivity$9$$ExternalSyntheticLambda1(CallLogActivity.AnonymousClass9 anonymousClass9, int i, TLRPC.User user, boolean z) {
        this.f$0 = anonymousClass9;
        this.f$1 = i;
        this.f$2 = user;
        this.f$3 = z;
    }
}
