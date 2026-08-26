package org.telegram.ui;

import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;

public final class CallLogActivity$9$$ExternalSyntheticLambda3 implements Runnable {
    public final int $r8$classId = 0;
    public final TLObject f$0;
    public final int f$1;
    public final boolean f$2;
    public final Object f$3;
    public final Object f$4;
    public final Object f$5;

    public CallLogActivity$9$$ExternalSyntheticLambda3(int i, boolean z, HashSet hashSet, BaseFragment baseFragment, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f$0 = tLObject;
        this.f$1 = i;
        this.f$2 = z;
        this.f$3 = hashSet;
        this.f$4 = tL_error;
        this.f$5 = baseFragment;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                CallLogActivity.AnonymousClass9.lambda$onCallUsersSelected$2(this.f$0, this.f$1, this.f$2, (HashSet) this.f$3, (TLRPC.TL_error) this.f$4, (BaseFragment) this.f$5);
                break;
            default:
                ((PhotoPickerActivity) this.f$3).lambda$searchImages$12((String) this.f$4, this.f$1, this.f$0, this.f$2, (TLRPC.User) this.f$5);
                break;
        }
    }

    public CallLogActivity$9$$ExternalSyntheticLambda3(PhotoPickerActivity photoPickerActivity, String str, int i, TLObject tLObject, boolean z, TLRPC.User user) {
        this.f$3 = photoPickerActivity;
        this.f$4 = str;
        this.f$1 = i;
        this.f$0 = tLObject;
        this.f$2 = z;
        this.f$5 = user;
    }
}
