package org.telegram.messenger;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.ee0;
import org.telegram.ui.Components.gp;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.cr0;
import org.telegram.ui.fp;
import org.telegram.ui.i70;
import org.telegram.ui.ln;
import org.telegram.ui.lo;
import org.telegram.ui.lo0;
import org.telegram.ui.mq0;
import org.telegram.ui.rm0;
import org.telegram.ui.ro;
import org.telegram.ui.wg1;
public final class zd implements RequestDelegate {
    public final int f19116a;
    public final boolean f19117b;
    public final Object f19118c;

    public zd(int i10, Object obj, boolean z4) {
        this.f19116a = i10;
        this.f19118c = obj;
        this.f19117b = z4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f19116a;
        boolean z4 = this.f19117b;
        Object obj = this.f19118c;
        switch (i10) {
            case 0:
                ((MessagesController) obj).lambda$updateTimerProc$156(z4, tLObject, tL_error);
                return;
            case 1:
                ((VoIPService) obj).lambda$acknowledgeCall$13(z4, tLObject, tL_error);
                return;
            case 2:
                org.telegram.ui.n9 n9Var = (org.telegram.ui.n9) obj;
                if (tLObject != null) {
                    TLRPC.TL_messages_affectedFoundMessages tL_messages_affectedFoundMessages = (TLRPC.TL_messages_affectedFoundMessages) tLObject;
                    TL_update.TL_updateDeleteMessages tL_updateDeleteMessages = new TL_update.TL_updateDeleteMessages();
                    tL_updateDeleteMessages.messages = tL_messages_affectedFoundMessages.messages;
                    tL_updateDeleteMessages.pts = tL_messages_affectedFoundMessages.pts;
                    tL_updateDeleteMessages.pts_count = tL_messages_affectedFoundMessages.pts_count;
                    TLRPC.TL_updates tL_updates = new TLRPC.TL_updates();
                    tL_updates.updates.add(tL_updateDeleteMessages);
                    n9Var.getMessagesController().processUpdates(tL_updates, false);
                    if (tL_messages_affectedFoundMessages.offset != 0) {
                        TLRPC.TL_messages_deletePhoneCallHistory tL_messages_deletePhoneCallHistory = new TLRPC.TL_messages_deletePhoneCallHistory();
                        tL_messages_deletePhoneCallHistory.revoke = z4;
                        n9Var.getConnectionsManager().sendRequest(tL_messages_deletePhoneCallHistory, new zd(2, n9Var, z4));
                        return;
                    }
                    return;
                }
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new lh.r5((ln) obj, tLObject, z4, 9));
                return;
            case 4:
                ro roVar = (ro) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    roVar.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(new jh.f(19, roVar, z4));
                    return;
                }
                AndroidUtilities.runOnUIThread(new lo(roVar, 3));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new cg.u0((fp) obj, tL_error, tLObject, this.f19117b, 9));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new gp((ee0) obj, tL_error, tLObject, z4));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new cg.u0((i70) obj, tL_error, tLObject, this.f19117b, 18));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new cg.u0((rm0) obj, tL_error, tLObject, this.f19117b, 19));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new cg.u0((lo0) obj, tL_error, tLObject, this.f19117b, 22));
                return;
            case 10:
                mq0 mq0Var = (mq0) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new lh.r5(mq0Var, tLObject, z4, 28));
                    return;
                }
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new cg.u0((wg1) obj, tL_error, tLObject, this.f19117b, 24));
                return;
            case 12:
                int[][] iArr = WallpapersListActivity.f32371h0;
                AndroidUtilities.runOnUIThread(new cr0((WallpapersListActivity) obj, tLObject, z4, 5));
                return;
            default:
                AndroidUtilities.runOnUIThread(new cr0((ph.z2) obj, tLObject, z4, 9));
                return;
        }
    }
}
