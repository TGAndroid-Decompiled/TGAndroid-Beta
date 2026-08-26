package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.UniversalAdapter;

public final class PasskeysActivity$$ExternalSyntheticLambda2 implements Utilities.Callback2 {
    public final int $r8$classId;
    public final PasskeysActivity f$0;

    public PasskeysActivity$$ExternalSyntheticLambda2(PasskeysActivity passkeysActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = passkeysActivity;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.fillItems((ArrayList) obj, (UniversalAdapter) obj2);
                break;
            default:
                this.f$0.lambda$onItemClick$4((TL_account.Passkey) obj, (String) obj2);
                break;
        }
    }
}
