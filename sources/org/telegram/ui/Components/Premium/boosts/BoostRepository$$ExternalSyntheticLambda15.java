package org.telegram.ui.Components.Premium.boosts;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme$$ExternalSyntheticLambda17;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda66;

public final class BoostRepository$$ExternalSyntheticLambda15 implements RequestDelegate {
    public final int $r8$classId;
    public final Utilities.Callback f$0;
    public final Utilities.Callback f$1;

    public BoostRepository$$ExternalSyntheticLambda15(Utilities.Callback callback, Utilities.Callback callback2, int i) {
        this.$r8$classId = i;
        this.f$0 = callback;
        this.f$1 = callback2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                AndroidUtilities.runOnUIThread(new Theme$$ExternalSyntheticLambda17(tL_error, this.f$0, tLObject, this.f$1, 17));
                break;
            default:
                AndroidUtilities.runOnUIThread(new StarGiftSheet$$ExternalSyntheticLambda66(tL_error, this.f$0, this.f$1, 6));
                break;
        }
    }
}
