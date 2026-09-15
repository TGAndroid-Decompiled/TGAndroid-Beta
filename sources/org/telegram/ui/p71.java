package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class p71 implements NotificationCenter.NotificationCenterDelegate {
    public final int f36456a;
    public final TLRPC.Chat f36457b;
    public TLRPC.ChannelParticipantsFilter f36458c;
    public boolean f36459f;
    public boolean h;
    public boolean f36461r;
    public boolean f36462s;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public int f36460n = -1;

    public p71(int i10, long j3, TLRPC.ChannelParticipantsFilter channelParticipantsFilter) {
        this.f36456a = i10;
        this.f36457b = MessagesController.getInstance(i10).getChat(Long.valueOf(j3));
        TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(j3);
        this.f36458c = channelParticipantsFilter;
        if (chatFull == null) {
            if (!this.f36462s) {
                this.f36462s = true;
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.chatInfoDidLoad);
            }
            MessagesController.getInstance(i10).loadFullChat(j3, 0, false);
        }
    }

    public final void a() {
        if (this.f36462s) {
            return;
        }
        this.f36462s = false;
        int i10 = this.f36456a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        if (this.f36460n >= 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.f36460n, true);
            this.f36460n = -1;
        }
        this.f36459f = false;
    }

    public final void b() {
        int size;
        if (!this.f36459f && !this.h) {
            TLRPC.ChannelParticipantsFilter channelParticipantsFilter = this.f36458c;
            if (!(channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) || !TextUtils.isEmpty(channelParticipantsFilter.f18111q)) {
                this.f36459f = true;
                TLRPC.Chat chat = this.f36457b;
                if (ChatObject.isChannel(chat)) {
                    TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                    tL_channels_getParticipants.channel = MessagesController.getInputChannel(chat);
                    tL_channels_getParticipants.filter = this.f36458c;
                    tL_channels_getParticipants.limit = 30;
                    if (this.f36461r) {
                        size = 0;
                    } else {
                        size = this.d.size();
                    }
                    tL_channels_getParticipants.offset = size;
                    ConnectionsManager.getInstance(this.f36456a).sendRequestTyped(tL_channels_getParticipants, new Object(), new b5(this, 24));
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            long j3 = ((TLRPC.ChatFull) objArr[0]).f18113id;
            TLRPC.Chat chat = this.f36457b;
            if (j3 == chat.f18112id && !ChatObject.isChannel(chat) && this.f36459f) {
                this.f36459f = false;
                b();
            }
        }
    }
}
