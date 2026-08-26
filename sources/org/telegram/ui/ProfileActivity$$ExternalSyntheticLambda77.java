package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.AlertDialog;

public final class ProfileActivity$$ExternalSyntheticLambda77 implements Utilities.Callback {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final long f$2;

    public ProfileActivity$$ExternalSyntheticLambda77(Object obj, Object obj2, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = j;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ((ProfileActivity) this.f$0).lambda$createView$19((Context) this.f$1, this.f$2, (TL_payments.connectedBotStarRef) obj);
                break;
            case 1:
                ((DialogsActivity.AnonymousClass30) this.f$0).lambda$didFinishChatCreation$5((AlertDialog) this.f$1, this.f$2, (Runnable) obj);
                break;
            default:
                ((DataSettingsActivity) this.f$0).lambda$loadCacheSize$1((DataSettingsActivity$$ExternalSyntheticLambda4) this.f$1, this.f$2, (Long) obj);
                break;
        }
    }
}
