package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class b71 implements NotificationCenter.NotificationCenterDelegate {
    public final int f35371a;
    public final TLRPC.Chat f35372b;
    public TLRPC.ChannelParticipantsFilter f35373c;
    public boolean f35375f;
    public boolean h;
    public boolean f35377r;
    public boolean f35378s;
    public final ArrayList d = new ArrayList();
    public final ArrayList f35374e = new ArrayList();
    public int f35376n = -1;

    public b71(int i10, long j10, TLRPC.ChannelParticipantsFilter channelParticipantsFilter) {
        this.f35371a = i10;
        this.f35372b = MessagesController.getInstance(i10).getChat(Long.valueOf(j10));
        TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(j10);
        this.f35373c = channelParticipantsFilter;
        if (chatFull == null) {
            if (!this.f35378s) {
                this.f35378s = true;
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.chatInfoDidLoad);
            }
            MessagesController.getInstance(i10).loadFullChat(j10, 0, false);
        }
    }

    public final void a() {
        if (this.f35378s) {
            return;
        }
        this.f35378s = false;
        int i10 = this.f35371a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        if (this.f35376n >= 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.f35376n, true);
            this.f35376n = -1;
        }
        this.f35375f = false;
    }

    public final void b() {
        int size;
        if (!this.f35375f && !this.h) {
            TLRPC.ChannelParticipantsFilter channelParticipantsFilter = this.f35373c;
            if (!(channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) || !TextUtils.isEmpty(channelParticipantsFilter.f20842q)) {
                this.f35375f = true;
                TLRPC.Chat chat = this.f35372b;
                if (ChatObject.isChannel(chat)) {
                    TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                    tL_channels_getParticipants.channel = MessagesController.getInputChannel(chat);
                    tL_channels_getParticipants.filter = this.f35373c;
                    tL_channels_getParticipants.limit = 30;
                    if (this.f35377r) {
                        size = 0;
                    } else {
                        size = this.d.size();
                    }
                    tL_channels_getParticipants.offset = size;
                    ConnectionsManager.getInstance(this.f35371a).sendRequestTyped(tL_channels_getParticipants, new Object(), new d5(this, 24));
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            long j10 = ((TLRPC.ChatFull) objArr[0]).f20844id;
            TLRPC.Chat chat = this.f35372b;
            if (j10 == chat.f20843id && !ChatObject.isChannel(chat) && this.f35375f) {
                this.f35375f = false;
                b();
            }
        }
    }
}
