package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class g61 implements NotificationCenter.NotificationCenterDelegate {
    public final int f37201a;
    public final TLRPC.Chat f37202b;
    public TLRPC.ChannelParticipantsFilter f37203c;
    public boolean f37204f;
    public boolean h;
    public boolean f37206r;
    public boolean f37207s;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public int f37205n = -1;

    public g61(int i10, long j10, TLRPC.ChannelParticipantsFilter channelParticipantsFilter) {
        this.f37201a = i10;
        this.f37202b = MessagesController.getInstance(i10).getChat(Long.valueOf(j10));
        TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(j10);
        this.f37203c = channelParticipantsFilter;
        if (chatFull == null) {
            if (!this.f37207s) {
                this.f37207s = true;
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.chatInfoDidLoad);
            }
            MessagesController.getInstance(i10).loadFullChat(j10, 0, false);
        }
    }

    public final void a() {
        if (this.f37207s) {
            return;
        }
        this.f37207s = false;
        int i10 = this.f37201a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        if (this.f37205n >= 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.f37205n, true);
            this.f37205n = -1;
        }
        this.f37204f = false;
    }

    public final void b() {
        int size;
        if (!this.f37204f && !this.h) {
            TLRPC.ChannelParticipantsFilter channelParticipantsFilter = this.f37203c;
            if (!(channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) || !TextUtils.isEmpty(channelParticipantsFilter.f20275q)) {
                this.f37204f = true;
                TLRPC.Chat chat = this.f37202b;
                if (ChatObject.isChannel(chat)) {
                    TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                    tL_channels_getParticipants.channel = MessagesController.getInputChannel(chat);
                    tL_channels_getParticipants.filter = this.f37203c;
                    tL_channels_getParticipants.limit = 30;
                    if (this.f37206r) {
                        size = 0;
                    } else {
                        size = this.d.size();
                    }
                    tL_channels_getParticipants.offset = size;
                    ConnectionsManager.getInstance(this.f37201a).sendRequestTyped(tL_channels_getParticipants, new Object(), new g5(this, 24));
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            long j10 = ((TLRPC.ChatFull) objArr[0]).f20277id;
            TLRPC.Chat chat = this.f37202b;
            if (j10 == chat.f20276id && !ChatObject.isChannel(chat) && this.f37204f) {
                this.f37204f = false;
                b();
            }
        }
    }
}
