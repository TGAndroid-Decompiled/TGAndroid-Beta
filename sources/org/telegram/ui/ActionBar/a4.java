package org.telegram.ui.ActionBar;

import android.util.Pair;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.xw0;
import ph.y7;
public final class a4 implements Utilities.Callback {
    public final int f19487a;
    public final long f19488b;
    public final Object f19489c;

    public a4(Object obj, long j10, int i10) {
        this.f19487a = i10;
        this.f19489c = obj;
        this.f19488b = j10;
    }

    @Override
    public final void run(Object obj) {
        long j10;
        switch (this.f19487a) {
            case 0:
                ResultCallback resultCallback = (ResultCallback) this.f19489c;
                pf.a aVar = (pf.a) obj;
                if (resultCallback != null) {
                    resultCallback.onComplete(new Pair(Long.valueOf(this.f19488b), aVar));
                    return;
                }
                return;
            case 1:
                xw0 xw0Var = (xw0) this.f19489c;
                TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups = (TLRPC.TL_messages_emojiGroups) obj;
                if (tL_messages_emojiGroups != null) {
                    NotificationCenter.getInstance(UserConfig.selectedAccount).doOnIdle(new i5.v(xw0Var, tL_messages_emojiGroups, this.f19488b, 24));
                    return;
                }
                return;
            default:
                y7 y7Var = (y7) this.f19489c;
                TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) obj;
                d2 d2Var = y7Var.D;
                if (d2Var != null) {
                    d2Var.c(350L);
                    y7Var.D = null;
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
                    y7Var.d(this.f19488b, tL_chatParticipants);
                    return;
                }
                return;
        }
    }
}
