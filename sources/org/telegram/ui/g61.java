package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class g61 implements NotificationCenter.NotificationCenterDelegate {
    public final int f37204a;
    public final TLRPC.Chat f37205b;
    public TLRPC.ChannelParticipantsFilter f37206c;
    public boolean f37207f;
    public boolean h;
    public boolean f37209r;
    public boolean f37210s;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public int f37208n = -1;

    public g61(int i10, long j10, TLRPC.ChannelParticipantsFilter channelParticipantsFilter) {
        this.f37204a = i10;
        this.f37205b = MessagesController.getInstance(i10).getChat(Long.valueOf(j10));
        TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(j10);
        this.f37206c = channelParticipantsFilter;
        if (chatFull == null) {
            if (!this.f37210s) {
                this.f37210s = true;
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.chatInfoDidLoad);
            }
            MessagesController.getInstance(i10).loadFullChat(j10, 0, false);
        }
    }

    public final void a() {
        if (this.f37210s) {
            return;
        }
        this.f37210s = false;
        int i10 = this.f37204a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        if (this.f37208n >= 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.f37208n, true);
            this.f37208n = -1;
        }
        this.f37207f = false;
    }

    public final void b() {
        int size;
        if (!this.f37207f && !this.h) {
            TLRPC.ChannelParticipantsFilter channelParticipantsFilter = this.f37206c;
            if (!(channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) || !TextUtils.isEmpty(channelParticipantsFilter.f20278q)) {
                this.f37207f = true;
                TLRPC.Chat chat = this.f37205b;
                if (ChatObject.isChannel(chat)) {
                    TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                    tL_channels_getParticipants.channel = MessagesController.getInputChannel(chat);
                    tL_channels_getParticipants.filter = this.f37206c;
                    tL_channels_getParticipants.limit = 30;
                    if (this.f37209r) {
                        size = 0;
                    } else {
                        size = this.d.size();
                    }
                    tL_channels_getParticipants.offset = size;
                    ConnectionsManager.getInstance(this.f37204a).sendRequestTyped(tL_channels_getParticipants, new Object(), new g5(this, 24));
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            long j10 = ((TLRPC.ChatFull) objArr[0]).f20280id;
            TLRPC.Chat chat = this.f37205b;
            if (j10 == chat.f20279id && !ChatObject.isChannel(chat) && this.f37207f) {
                this.f37207f = false;
                b();
            }
        }
    }
}
