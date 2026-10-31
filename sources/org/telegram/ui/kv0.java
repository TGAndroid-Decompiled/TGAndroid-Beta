package org.telegram.ui;

import android.graphics.RectF;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kv0 implements Runnable {
    public final int f38958a;
    public final ProfileActivity f38959b;
    public final TLRPC.TL_error f38960c;
    public final TLObject d;
    public final TLRPC.TL_channels_getParticipants e;

    public kv0(ProfileActivity profileActivity, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_channels_getParticipants tL_channels_getParticipants, int i10) {
        this.f38958a = i10;
        this.f38959b = profileActivity;
        this.f38960c = tL_error;
        this.d = tLObject;
        this.e = tL_channels_getParticipants;
    }

    @Override
    public final void run() {
        switch (this.f38958a) {
            case 0:
                RectF rectF = ProfileActivity.R6;
                ProfileActivity profileActivity = this.f38959b;
                profileActivity.getNotificationCenter().d(new kv0(profileActivity, this.f38960c, this.d, this.e, 1));
                return;
            default:
                ProfileActivity profileActivity2 = this.f38959b;
                if (this.f38960c == null) {
                    RectF rectF2 = ProfileActivity.R6;
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) this.d;
                    profileActivity2.getMessagesController().V3(tL_channels_channelParticipants.users, false);
                    profileActivity2.getMessagesController().P3(tL_channels_channelParticipants.chats, false);
                    if (tL_channels_channelParticipants.users.size() < 200) {
                        profileActivity2.C1 = true;
                    }
                    if (this.e.offset == 0) {
                        profileActivity2.B1.b();
                        profileActivity2.f33908t2.participants = new TLRPC.TL_chatParticipants();
                        profileActivity2.getMessagesStorage().m1(tL_channels_channelParticipants.users, tL_channels_channelParticipants.chats, true, true);
                        org.telegram.messenger.hs messagesStorage = profileActivity2.getMessagesStorage();
                        messagesStorage.f15938a.c(new org.telegram.messenger.tr(messagesStorage, profileActivity2.f33803e1, tL_channels_channelParticipants.participants, 2));
                    }
                    for (int i10 = 0; i10 < tL_channels_channelParticipants.participants.size(); i10++) {
                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
                        TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i10);
                        tL_chatChannelParticipant.channelParticipant = channelParticipant;
                        tL_chatChannelParticipant.inviter_id = channelParticipant.inviter_id;
                        long C1 = org.telegram.messenger.jj.C1(channelParticipant.peer);
                        tL_chatChannelParticipant.user_id = C1;
                        tL_chatChannelParticipant.date = tL_chatChannelParticipant.channelParticipant.date;
                        if (profileActivity2.B1.h(C1) < 0) {
                            TLRPC.ChatFull chatFull = profileActivity2.f33908t2;
                            if (chatFull.participants == null) {
                                chatFull.participants = new TLRPC.TL_chatParticipants();
                            }
                            profileActivity2.f33908t2.participants.participants.add(tL_chatChannelParticipant);
                            profileActivity2.B1.k(tL_chatChannelParticipant, tL_chatChannelParticipant.user_id);
                        }
                    }
                }
                profileActivity2.A1 = false;
                profileActivity2.S4();
                profileActivity2.C5(true, false);
                return;
        }
    }
}
