package org.telegram.ui;

import android.graphics.RectF;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class pd0 implements Runnable {
    public final int f40461a;
    public final Object f40462b;
    public final Object f40463c;
    public final Object d;

    public pd0(Object obj, Object obj2, Object obj3, int i10) {
        this.f40461a = i10;
        this.f40462b = obj;
        this.f40463c = obj2;
        this.d = obj3;
    }

    private final void a() {
        ProfileActivity profileActivity = (ProfileActivity) this.f40462b;
        ArrayList arrayList = (ArrayList) this.f40463c;
        HashSet hashSet = (HashSet) this.d;
        RectF rectF = ProfileActivity.S6;
        profileActivity.getClass();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.User user = (TLRPC.User) arrayList.get(i10);
            if (!hashSet.contains(Long.valueOf(user.f19943id))) {
                TLRPC.ChatFull chatFull = profileActivity.f33915t2;
                if (chatFull.participants == null) {
                    chatFull.participants = new TLRPC.TL_chatParticipants();
                }
                if (org.telegram.messenger.w3.T(profileActivity.D2)) {
                    TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
                    TLRPC.TL_channelParticipant tL_channelParticipant = new TLRPC.TL_channelParticipant();
                    tL_chatChannelParticipant.channelParticipant = tL_channelParticipant;
                    tL_channelParticipant.inviter_id = profileActivity.getUserConfig().e();
                    tL_chatChannelParticipant.channelParticipant.peer = new TLRPC.TL_peerUser();
                    TLRPC.ChannelParticipant channelParticipant = tL_chatChannelParticipant.channelParticipant;
                    channelParticipant.peer.user_id = user.f19943id;
                    channelParticipant.date = profileActivity.getConnectionsManager().getCurrentTime();
                    tL_chatChannelParticipant.user_id = user.f19943id;
                    profileActivity.f33915t2.participants.participants.add(tL_chatChannelParticipant);
                } else {
                    TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                    tL_chatParticipant.user_id = user.f19943id;
                    tL_chatParticipant.inviter_id = org.telegram.messenger.e20.i(profileActivity.getAccountInstance().f15043a).f15524n;
                    profileActivity.f33915t2.participants.participants.add(tL_chatParticipant);
                }
                profileActivity.f33915t2.participants_count++;
                profileActivity.getMessagesController().U3(user, false, false);
            }
        }
        profileActivity.D5(true, false);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pd0.run():void");
    }

    public pd0(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f40461a = i10;
        this.f40462b = obj;
        this.d = obj2;
        this.f40463c = obj3;
    }
}
