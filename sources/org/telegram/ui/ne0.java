package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class ne0 implements Runnable {
    public final int f41782a;
    public final Object f41783b;
    public final Object f41784c;
    public final Object d;

    public ne0(Object obj, Object obj2, Object obj3, int i10) {
        this.f41782a = i10;
        this.f41783b = obj;
        this.f41784c = obj2;
        this.d = obj3;
    }

    private final void a() {
        ProfileActivity profileActivity = (ProfileActivity) this.f41783b;
        ArrayList arrayList = (ArrayList) this.f41784c;
        HashSet hashSet = (HashSet) this.d;
        int i10 = ProfileActivity.R6;
        profileActivity.getClass();
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            TLRPC.User user = (TLRPC.User) arrayList.get(i11);
            if (!hashSet.contains(Long.valueOf(user.f22177id))) {
                TLRPC.ChatFull chatFull = profileActivity.f36115u2;
                if (chatFull.participants == null) {
                    chatFull.participants = new TLRPC.TL_chatParticipants();
                }
                if (ChatObject.isChannel(profileActivity.E2)) {
                    TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
                    TLRPC.TL_channelParticipant tL_channelParticipant = new TLRPC.TL_channelParticipant();
                    tL_chatChannelParticipant.channelParticipant = tL_channelParticipant;
                    tL_channelParticipant.inviter_id = profileActivity.getUserConfig().getClientUserId();
                    tL_chatChannelParticipant.channelParticipant.peer = new TLRPC.TL_peerUser();
                    TLRPC.ChannelParticipant channelParticipant = tL_chatChannelParticipant.channelParticipant;
                    channelParticipant.peer.user_id = user.f22177id;
                    channelParticipant.date = profileActivity.getConnectionsManager().getCurrentTime();
                    tL_chatChannelParticipant.user_id = user.f22177id;
                    profileActivity.f36115u2.participants.participants.add(tL_chatChannelParticipant);
                } else {
                    TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                    tL_chatParticipant.user_id = user.f22177id;
                    tL_chatParticipant.inviter_id = profileActivity.getAccountInstance().getUserConfig().clientUserId;
                    profileActivity.f36115u2.participants.participants.add(tL_chatParticipant);
                }
                profileActivity.f36115u2.participants_count++;
                profileActivity.getMessagesController().putUser(user, false);
            }
        }
        profileActivity.p5(true, false);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ne0.run():void");
    }

    public ne0(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f41782a = i10;
        this.f41783b = obj;
        this.d = obj2;
        this.f41784c = obj3;
    }
}
