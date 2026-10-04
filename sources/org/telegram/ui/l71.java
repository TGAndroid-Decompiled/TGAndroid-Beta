package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class l71 implements NotificationCenter.NotificationCenterDelegate {
    public final int f38183a;
    public final TLRPC.Chat f38184b;
    public TLRPC.ChannelParticipantsFilter f38185c;
    public boolean f38187f;
    public boolean h;
    public boolean f38189r;
    public boolean f38190s;
    public final ArrayList d = new ArrayList();
    public final ArrayList f38186e = new ArrayList();
    public int f38188n = -1;

    public l71(int i10, long j3, TLRPC.ChannelParticipantsFilter channelParticipantsFilter) {
        this.f38183a = i10;
        this.f38184b = MessagesController.getInstance(i10).getChat(Long.valueOf(j3));
        TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(j3);
        this.f38185c = channelParticipantsFilter;
        if (chatFull == null) {
            if (!this.f38190s) {
                this.f38190s = true;
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.chatInfoDidLoad);
            }
            MessagesController.getInstance(i10).loadFullChat(j3, 0, false);
        }
    }

    public final void a() {
        if (this.f38190s) {
            return;
        }
        this.f38190s = false;
        int i10 = this.f38183a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        if (this.f38188n >= 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.f38188n, true);
            this.f38188n = -1;
        }
        this.f38187f = false;
    }

    public final void b() {
        int size;
        if (!this.f38187f && !this.h) {
            TLRPC.ChannelParticipantsFilter channelParticipantsFilter = this.f38185c;
            if (!(channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) || !TextUtils.isEmpty(channelParticipantsFilter.f20036q)) {
                this.f38187f = true;
                TLRPC.Chat chat = this.f38184b;
                if (ChatObject.isChannel(chat)) {
                    TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                    tL_channels_getParticipants.channel = MessagesController.getInputChannel(chat);
                    tL_channels_getParticipants.filter = this.f38185c;
                    tL_channels_getParticipants.limit = 30;
                    if (this.f38189r) {
                        size = 0;
                    } else {
                        size = this.d.size();
                    }
                    tL_channels_getParticipants.offset = size;
                    ConnectionsManager.getInstance(this.f38183a).sendRequestTyped(tL_channels_getParticipants, new Object(), new c5(this, 24));
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            long j3 = ((TLRPC.ChatFull) objArr[0]).f20038id;
            TLRPC.Chat chat = this.f38184b;
            if (j3 == chat.f20037id && !ChatObject.isChannel(chat) && this.f38187f) {
                this.f38187f = false;
                b();
            }
        }
    }
}
