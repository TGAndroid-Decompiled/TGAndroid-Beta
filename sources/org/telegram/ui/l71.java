package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class l71 implements NotificationCenter.NotificationCenterDelegate {
    public final int f38184a;
    public final TLRPC.Chat f38185b;
    public TLRPC.ChannelParticipantsFilter f38186c;
    public boolean f38188f;
    public boolean h;
    public boolean f38190r;
    public boolean f38191s;
    public final ArrayList d = new ArrayList();
    public final ArrayList f38187e = new ArrayList();
    public int f38189n = -1;

    public l71(int i10, long j3, TLRPC.ChannelParticipantsFilter channelParticipantsFilter) {
        this.f38184a = i10;
        this.f38185b = MessagesController.getInstance(i10).getChat(Long.valueOf(j3));
        TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(j3);
        this.f38186c = channelParticipantsFilter;
        if (chatFull == null) {
            if (!this.f38191s) {
                this.f38191s = true;
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.chatInfoDidLoad);
            }
            MessagesController.getInstance(i10).loadFullChat(j3, 0, false);
        }
    }

    public final void a() {
        if (this.f38191s) {
            return;
        }
        this.f38191s = false;
        int i10 = this.f38184a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        if (this.f38189n >= 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.f38189n, true);
            this.f38189n = -1;
        }
        this.f38188f = false;
    }

    public final void b() {
        int size;
        if (!this.f38188f && !this.h) {
            TLRPC.ChannelParticipantsFilter channelParticipantsFilter = this.f38186c;
            if (!(channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) || !TextUtils.isEmpty(channelParticipantsFilter.f20037q)) {
                this.f38188f = true;
                TLRPC.Chat chat = this.f38185b;
                if (ChatObject.isChannel(chat)) {
                    TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                    tL_channels_getParticipants.channel = MessagesController.getInputChannel(chat);
                    tL_channels_getParticipants.filter = this.f38186c;
                    tL_channels_getParticipants.limit = 30;
                    if (this.f38190r) {
                        size = 0;
                    } else {
                        size = this.d.size();
                    }
                    tL_channels_getParticipants.offset = size;
                    ConnectionsManager.getInstance(this.f38184a).sendRequestTyped(tL_channels_getParticipants, new Object(), new c5(this, 24));
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            long j3 = ((TLRPC.ChatFull) objArr[0]).f20039id;
            TLRPC.Chat chat = this.f38185b;
            if (j3 == chat.f20038id && !ChatObject.isChannel(chat) && this.f38188f) {
                this.f38188f = false;
                b();
            }
        }
    }
}
