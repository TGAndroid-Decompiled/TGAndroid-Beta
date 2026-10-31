package org.telegram.ui;

import android.graphics.RectF;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class qd0 implements Runnable {
    public final int f40960a;
    public final Object f40961b;
    public final Object f40962c;
    public final Object d;

    public qd0(Object obj, Object obj2, Object obj3, int i10) {
        this.f40960a = i10;
        this.f40961b = obj;
        this.f40962c = obj2;
        this.d = obj3;
    }

    private final void a() {
        ProfileActivity profileActivity = (ProfileActivity) this.f40961b;
        ArrayList arrayList = (ArrayList) this.f40962c;
        HashSet hashSet = (HashSet) this.d;
        RectF rectF = ProfileActivity.R6;
        profileActivity.getClass();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.User user = (TLRPC.User) arrayList.get(i10);
            if (!hashSet.contains(Long.valueOf(user.f19942id))) {
                TLRPC.ChatFull chatFull = profileActivity.f33908t2;
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
                    channelParticipant.peer.user_id = user.f19942id;
                    channelParticipant.date = profileActivity.getConnectionsManager().getCurrentTime();
                    tL_chatChannelParticipant.user_id = user.f19942id;
                    profileActivity.f33908t2.participants.participants.add(tL_chatChannelParticipant);
                } else {
                    TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                    tL_chatParticipant.user_id = user.f19942id;
                    tL_chatParticipant.inviter_id = org.telegram.messenger.d20.i(profileActivity.getAccountInstance().f14863a).f15165n;
                    profileActivity.f33908t2.participants.participants.add(tL_chatParticipant);
                }
                profileActivity.f33908t2.participants_count++;
                profileActivity.getMessagesController().U3(user, false, false);
            }
        }
        profileActivity.C5(true, false);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qd0.run():void");
    }

    public qd0(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f40960a = i10;
        this.f40961b = obj;
        this.d = obj2;
        this.f40962c = obj3;
    }
}
