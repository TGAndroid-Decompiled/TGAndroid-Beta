package org.telegram.messenger;

import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.fe0;
import org.telegram.ui.Components.jp;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.ep;
import org.telegram.ui.h70;
import org.telegram.ui.hq0;
import org.telegram.ui.jn;
import org.telegram.ui.jo;
import org.telegram.ui.lo0;
import org.telegram.ui.po;
import org.telegram.ui.qg1;
import org.telegram.ui.rm0;
import org.telegram.ui.xq0;
public final class zd implements RequestDelegate {
    public final int f20797a;
    public final boolean f20798b;
    public final Object f20799c;

    public zd(int i10, Object obj, boolean z4) {
        this.f20797a = i10;
        this.f20799c = obj;
        this.f20798b = z4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f20797a;
        boolean z4 = this.f20798b;
        Object obj = this.f20799c;
        switch (i10) {
            case 0:
                ((MessagesController) obj).lambda$updateTimerProc$156(z4, tLObject, tL_error);
                return;
            case 1:
                ((VoIPService) obj).lambda$acknowledgeCall$13(z4, tLObject, tL_error);
                return;
            case 2:
                org.telegram.ui.l9 l9Var = (org.telegram.ui.l9) obj;
                if (tLObject != null) {
                    TLRPC.TL_messages_affectedFoundMessages tL_messages_affectedFoundMessages = (TLRPC.TL_messages_affectedFoundMessages) tLObject;
                    TL_update.TL_updateDeleteMessages tL_updateDeleteMessages = new TL_update.TL_updateDeleteMessages();
                    tL_updateDeleteMessages.messages = tL_messages_affectedFoundMessages.messages;
                    tL_updateDeleteMessages.pts = tL_messages_affectedFoundMessages.pts;
                    tL_updateDeleteMessages.pts_count = tL_messages_affectedFoundMessages.pts_count;
                    TLRPC.TL_updates tL_updates = new TLRPC.TL_updates();
                    tL_updates.updates.add(tL_updateDeleteMessages);
                    l9Var.getMessagesController().processUpdates(tL_updates, false);
                    if (tL_messages_affectedFoundMessages.offset != 0) {
                        TLRPC.TL_messages_deletePhoneCallHistory tL_messages_deletePhoneCallHistory = new TLRPC.TL_messages_deletePhoneCallHistory();
                        tL_messages_deletePhoneCallHistory.revoke = z4;
                        l9Var.getConnectionsManager().sendRequest(tL_messages_deletePhoneCallHistory, new zd(2, l9Var, z4));
                        return;
                    }
                    return;
                }
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new mh.r5((jn) obj, tLObject, z4, 9));
                return;
            case 4:
                po poVar = (po) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    poVar.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(new kh.f(18, poVar, z4));
                    return;
                }
                AndroidUtilities.runOnUIThread(new jo(poVar, 3));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new dg.t0((ep) obj, tL_error, tLObject, this.f20798b, 9));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new jp((fe0) obj, tL_error, tLObject, z4));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new dg.t0((h70) obj, tL_error, tLObject, this.f20798b, 18));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new dg.t0((rm0) obj, tL_error, tLObject, this.f20798b, 19));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new dg.t0((lo0) obj, tL_error, tLObject, this.f20798b, 22));
                return;
            case 10:
                hq0 hq0Var = (hq0) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new mh.r5(hq0Var, tLObject, z4, 28));
                    return;
                }
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new dg.t0((qg1) obj, tL_error, tLObject, this.f20798b, 24));
                return;
            case 12:
                int[][] iArr = WallpapersListActivity.f34941h0;
                AndroidUtilities.runOnUIThread(new xq0((WallpapersListActivity) obj, tLObject, z4, 5));
                return;
            default:
                AndroidUtilities.runOnUIThread(new xq0((qh.z2) obj, tLObject, z4, 9));
                return;
        }
    }
}
