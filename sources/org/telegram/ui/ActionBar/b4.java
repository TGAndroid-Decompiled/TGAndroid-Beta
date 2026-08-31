package org.telegram.ui.ActionBar;

import android.util.Pair;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.yw0;
import qh.x7;
public final class b4 implements Utilities.Callback {
    public final int f21194a;
    public final long f21195b;
    public final Object f21196c;

    public b4(Object obj, long j10, int i10) {
        this.f21194a = i10;
        this.f21196c = obj;
        this.f21195b = j10;
    }

    @Override
    public final void run(Object obj) {
        long j10;
        switch (this.f21194a) {
            case 0:
                ResultCallback resultCallback = (ResultCallback) this.f21196c;
                qf.a aVar = (qf.a) obj;
                if (resultCallback != null) {
                    resultCallback.onComplete(new Pair(Long.valueOf(this.f21195b), aVar));
                    return;
                }
                return;
            case 1:
                yw0 yw0Var = (yw0) this.f21196c;
                TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups = (TLRPC.TL_messages_emojiGroups) obj;
                if (tL_messages_emojiGroups != null) {
                    NotificationCenter.getInstance(UserConfig.selectedAccount).doOnIdle(new i5.v(yw0Var, tL_messages_emojiGroups, this.f21195b, 24));
                    return;
                }
                return;
            default:
                x7 x7Var = (x7) this.f21196c;
                TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) obj;
                d2 d2Var = x7Var.D;
                if (d2Var != null) {
                    d2Var.c(350L);
                    x7Var.D = null;
                }
                if (tL_channels_channelParticipants != null && !tL_channels_channelParticipants.participants.isEmpty()) {
                    TLRPC.TL_chatParticipants tL_chatParticipants = new TLRPC.TL_chatParticipants();
                    for (int i10 = 0; i10 < tL_channels_channelParticipants.participants.size(); i10++) {
                        TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i10);
                        TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                        TLRPC.Peer peer = channelParticipant.peer;
                        if (peer != null) {
                            j10 = DialogObject.getPeerDialogId(peer);
                            if (j10 < 0) {
                            }
                        } else {
                            j10 = channelParticipant.user_id;
                        }
                        tL_chatParticipant.user_id = j10;
                        tL_chatParticipants.participants.add(tL_chatParticipant);
                    }
                    x7Var.d(this.f21195b, tL_chatParticipants);
                    return;
                }
                return;
        }
    }
}
