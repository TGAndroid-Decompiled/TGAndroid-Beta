package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class g61 implements NotificationCenter.NotificationCenterDelegate {
    public final int f37200a;
    public final TLRPC.Chat f37201b;
    public TLRPC.ChannelParticipantsFilter f37202c;
    public boolean f37203f;
    public boolean h;
    public boolean f37205r;
    public boolean f37206s;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public int f37204n = -1;

    public g61(int i10, long j10, TLRPC.ChannelParticipantsFilter channelParticipantsFilter) {
        this.f37200a = i10;
        this.f37201b = MessagesController.getInstance(i10).getChat(Long.valueOf(j10));
        TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(j10);
        this.f37202c = channelParticipantsFilter;
        if (chatFull == null) {
            if (!this.f37206s) {
                this.f37206s = true;
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.chatInfoDidLoad);
            }
            MessagesController.getInstance(i10).loadFullChat(j10, 0, false);
        }
    }

    public final void a() {
        if (this.f37206s) {
            return;
        }
        this.f37206s = false;
        int i10 = this.f37200a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        if (this.f37204n >= 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.f37204n, true);
            this.f37204n = -1;
        }
        this.f37203f = false;
    }

    public final void b() {
        int size;
        if (!this.f37203f && !this.h) {
            TLRPC.ChannelParticipantsFilter channelParticipantsFilter = this.f37202c;
            if (!(channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) || !TextUtils.isEmpty(channelParticipantsFilter.f20274q)) {
                this.f37203f = true;
                TLRPC.Chat chat = this.f37201b;
                if (ChatObject.isChannel(chat)) {
                    TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                    tL_channels_getParticipants.channel = MessagesController.getInputChannel(chat);
                    tL_channels_getParticipants.filter = this.f37202c;
                    tL_channels_getParticipants.limit = 30;
                    if (this.f37205r) {
                        size = 0;
                    } else {
                        size = this.d.size();
                    }
                    tL_channels_getParticipants.offset = size;
                    ConnectionsManager.getInstance(this.f37200a).sendRequestTyped(tL_channels_getParticipants, new Object(), new g5(this, 24));
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            long j10 = ((TLRPC.ChatFull) objArr[0]).f20276id;
            TLRPC.Chat chat = this.f37201b;
            if (j10 == chat.f20275id && !ChatObject.isChannel(chat) && this.f37203f) {
                this.f37203f = false;
                b();
            }
        }
    }
}
