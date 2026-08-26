package org.telegram.ui.Components.Premium.boosts;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ChatUsersActivity$$ExternalSyntheticLambda13;
import org.telegram.ui.Components.FilterGLThread$$ExternalSyntheticLambda1;

public final class BoostRepository$$ExternalSyntheticLambda6 implements RequestDelegate {
    public final int $r8$classId;
    public final Utilities.Callback f$0;
    public final Utilities.Callback f$1;

    public BoostRepository$$ExternalSyntheticLambda6(Utilities.Callback callback, Utilities.Callback callback2, int i) {
        this.$r8$classId = i;
        this.f$0 = callback;
        this.f$1 = callback2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                AndroidUtilities.runOnUIThread(new ChatUsersActivity$$ExternalSyntheticLambda13((Object) tL_error, (Object) this.f$0, tLObject, (Object) this.f$1, 19));
                break;
            default:
                AndroidUtilities.runOnUIThread(new FilterGLThread$$ExternalSyntheticLambda1(tL_error, this.f$0, this.f$1, 22));
                break;
        }
    }
}
