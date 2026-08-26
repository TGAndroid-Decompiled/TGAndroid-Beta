package org.telegram.ui.Components;

import android.content.SharedPreferences;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;

public final class AlertsCreator$$ExternalSyntheticLambda55 implements RequestDelegate {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final int f$2;
    public final Object f$3;

    public AlertsCreator$$ExternalSyntheticLambda55(Object obj, Object obj2, int i, Object obj3, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = i;
        this.f$3 = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                BaseFragment baseFragment = (BaseFragment) this.f$3;
                AlertsCreator.lambda$performAskAQuestion$50((SharedPreferences) this.f$0, (AlertDialog) this.f$1, this.f$2, baseFragment, tLObject, tL_error);
                break;
            case 1:
                ((DeleteMessagesBottomSheet) this.f$0).lambda$updateParticipantMessageCounts$7((TLRPC.InputPeer) this.f$1, this.f$2, (int[]) this.f$3, tLObject, tL_error);
                break;
            default:
                ((SharedMediaLayout) this.f$0).lambda$new$23((AlertDialog[]) this.f$1, this.f$2, (TLRPC.TL_messages_editMessage) this.f$3, tLObject, tL_error);
                break;
        }
    }
}
