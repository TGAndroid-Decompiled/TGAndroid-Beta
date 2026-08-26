package org.telegram.ui;

import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

public final class PrivacyControlActivity$$ExternalSyntheticLambda20 implements Runnable {
    public final int $r8$classId;
    public final PrivacyControlActivity f$0;
    public final TLRPC.GlobalPrivacySettings f$1;
    public final TL_account.setGlobalPrivacySettings f$2;
    public final AtomicInteger f$3;

    public PrivacyControlActivity$$ExternalSyntheticLambda20(PrivacyControlActivity privacyControlActivity, TLRPC.GlobalPrivacySettings globalPrivacySettings, TL_account.setGlobalPrivacySettings setglobalprivacysettings, AtomicInteger atomicInteger, int i) {
        this.$r8$classId = i;
        this.f$0 = privacyControlActivity;
        this.f$1 = globalPrivacySettings;
        this.f$2 = setglobalprivacysettings;
        this.f$3 = atomicInteger;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$applyCurrentPrivacySettings$22(this.f$1, this.f$2, this.f$3);
                break;
            default:
                this.f$0.lambda$applyCurrentPrivacySettings$24(this.f$1, this.f$2, this.f$3);
                break;
        }
    }
}
