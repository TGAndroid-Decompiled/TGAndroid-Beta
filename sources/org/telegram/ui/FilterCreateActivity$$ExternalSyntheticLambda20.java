package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class FilterCreateActivity$$ExternalSyntheticLambda20 implements RequestDelegate {
    public final int $r8$classId;
    public final FilterCreateActivity f$0;

    public FilterCreateActivity$$ExternalSyntheticLambda20(FilterCreateActivity filterCreateActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = filterCreateActivity;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                AndroidUtilities.runOnUIThread(new LaunchActivity$$ExternalSyntheticLambda13(1, this.f$0, tLObject));
                break;
            default:
                FilterCreateActivity filterCreateActivity = this.f$0;
                filterCreateActivity.getClass();
                AndroidUtilities.runOnUIThread(new IntroActivity$$ExternalSyntheticLambda5(filterCreateActivity, tL_error, tLObject, 19));
                break;
        }
    }
}
