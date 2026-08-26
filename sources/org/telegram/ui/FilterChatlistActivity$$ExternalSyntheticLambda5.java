package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FactCheckController$$ExternalSyntheticOutline0;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.BulletinFactory;

public final class FilterChatlistActivity$$ExternalSyntheticLambda5 implements RequestDelegate {
    public final int $r8$classId;
    public final FilterChatlistActivity f$0;

    public FilterChatlistActivity$$ExternalSyntheticLambda5(FilterChatlistActivity filterChatlistActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = filterChatlistActivity;
    }

    @Override
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                final FilterChatlistActivity filterChatlistActivity = this.f$0;
                filterChatlistActivity.getClass();
                final int i = 1;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i) {
                            case 0:
                                FilterChatlistActivity filterChatlistActivity2 = filterChatlistActivity;
                                filterChatlistActivity2.savingTitleReqId = 0;
                                if (tL_error == null) {
                                    FactCheckController$$ExternalSyntheticOutline0.m(R.string.FilterInviteNameEdited, BulletinFactory.of(filterChatlistActivity2), R.raw.contact_check, 36);
                                }
                                break;
                            default:
                                filterChatlistActivity.lambda$save$1(tL_error);
                                break;
                        }
                    }
                });
                break;
            default:
                final FilterChatlistActivity filterChatlistActivity2 = this.f$0;
                final int i2 = 0;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i2) {
                            case 0:
                                FilterChatlistActivity filterChatlistActivity3 = filterChatlistActivity2;
                                filterChatlistActivity3.savingTitleReqId = 0;
                                if (tL_error == null) {
                                    FactCheckController$$ExternalSyntheticOutline0.m(R.string.FilterInviteNameEdited, BulletinFactory.of(filterChatlistActivity3), R.raw.contact_check, 36);
                                }
                                break;
                            default:
                                filterChatlistActivity2.lambda$save$1(tL_error);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
