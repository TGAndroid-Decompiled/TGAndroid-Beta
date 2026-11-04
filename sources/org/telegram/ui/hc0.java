package org.telegram.ui;

import android.graphics.RectF;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class hc0 implements Runnable {
    public final int f45896a;
    public final Object f45897b;
    public final Object f45898c;
    public final Object d;

    public hc0(Object obj, Object obj2, Object obj3, int i3) {
        this.f45896a = i3;
        this.f45897b = obj;
        this.f45898c = obj2;
        this.d = obj3;
    }

    private final void a() {
        ProfileActivity profileActivity = (ProfileActivity) this.f45897b;
        ArrayList arrayList = (ArrayList) this.f45898c;
        HashSet hashSet = (HashSet) this.d;
        RectF rectF = ProfileActivity.T6;
        profileActivity.getClass();
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            TLRPC.User user = (TLRPC.User) arrayList.get(i3);
            if (!hashSet.contains(Long.valueOf(user.f27150id))) {
                TLRPC.ChatFull chatFull = profileActivity.f41861u2;
                if (chatFull.participants == null) {
                    chatFull.participants = new TLRPC.TL_chatParticipants();
                }
                if (org.telegram.messenger.t3.T(profileActivity.E2)) {
                    TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
                    TLRPC.TL_channelParticipant tL_channelParticipant = new TLRPC.TL_channelParticipant();
                    tL_chatChannelParticipant.channelParticipant = tL_channelParticipant;
                    tL_channelParticipant.inviter_id = profileActivity.getUserConfig().e();
                    tL_chatChannelParticipant.channelParticipant.peer = new TLRPC.TL_peerUser();
                    TLRPC.ChannelParticipant channelParticipant = tL_chatChannelParticipant.channelParticipant;
                    channelParticipant.peer.user_id = user.f27150id;
                    channelParticipant.date = profileActivity.getConnectionsManager().getCurrentTime();
                    tL_chatChannelParticipant.user_id = user.f27150id;
                    profileActivity.f41861u2.participants.participants.add(tL_chatChannelParticipant);
                } else {
                    TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                    tL_chatParticipant.user_id = user.f27150id;
                    tL_chatParticipant.inviter_id = org.telegram.messenger.h10.i(profileActivity.getAccountInstance().f21919a).f22848n;
                    profileActivity.f41861u2.participants.participants.add(tL_chatParticipant);
                }
                profileActivity.f41861u2.participants_count++;
                profileActivity.getMessagesController().X3(user, false, false);
            }
        }
        profileActivity.D5(true, false);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hc0.run():void");
    }

    public hc0(Object obj, Object obj2, Object obj3, boolean z10, int i3) {
        this.f45896a = i3;
        this.f45897b = obj;
        this.d = obj2;
        this.f45898c = obj3;
    }
}
