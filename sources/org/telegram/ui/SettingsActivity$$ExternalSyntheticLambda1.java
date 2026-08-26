package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class SettingsActivity$$ExternalSyntheticLambda1 implements RequestDelegate {
    public final int $r8$classId;
    public final SettingsActivity f$0;

    public SettingsActivity$$ExternalSyntheticLambda1(SettingsActivity settingsActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = settingsActivity;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$openDebugMenu$18(tLObject, tL_error);
                break;
            default:
                this.f$0.lambda$openDebugMenu$19(tLObject, tL_error);
                break;
        }
    }
}
