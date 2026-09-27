package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class l71 implements NotificationCenter.NotificationCenterDelegate {
    public final int f35273a;
    public final TLRPC.Chat f35274b;
    public TLRPC.ChannelParticipantsFilter f35275c;
    public boolean f35276f;
    public boolean h;
    public boolean f35278r;
    public boolean f35279s;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public int f35277n = -1;

    public l71(int i10, long j3, TLRPC.ChannelParticipantsFilter channelParticipantsFilter) {
        this.f35273a = i10;
        this.f35274b = MessagesController.getInstance(i10).getChat(Long.valueOf(j3));
        TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(j3);
        this.f35275c = channelParticipantsFilter;
        if (chatFull == null) {
            if (!this.f35279s) {
                this.f35279s = true;
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.chatInfoDidLoad);
            }
            MessagesController.getInstance(i10).loadFullChat(j3, 0, false);
        }
    }

    public final void a() {
        if (this.f35279s) {
            return;
        }
        this.f35279s = false;
        int i10 = this.f35273a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        if (this.f35277n >= 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.f35277n, true);
            this.f35277n = -1;
        }
        this.f35276f = false;
    }

    public final void b() {
        int size;
        if (!this.f35276f && !this.h) {
            TLRPC.ChannelParticipantsFilter channelParticipantsFilter = this.f35275c;
            if (!(channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) || !TextUtils.isEmpty(channelParticipantsFilter.f18328q)) {
                this.f35276f = true;
                TLRPC.Chat chat = this.f35274b;
                if (ChatObject.isChannel(chat)) {
                    TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                    tL_channels_getParticipants.channel = MessagesController.getInputChannel(chat);
                    tL_channels_getParticipants.filter = this.f35275c;
                    tL_channels_getParticipants.limit = 30;
                    if (this.f35278r) {
                        size = 0;
                    } else {
                        size = this.d.size();
                    }
                    tL_channels_getParticipants.offset = size;
                    ConnectionsManager.getInstance(this.f35273a).sendRequestTyped(tL_channels_getParticipants, new Object(), new d5(this, 24));
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            long j3 = ((TLRPC.ChatFull) objArr[0]).f18330id;
            TLRPC.Chat chat = this.f35274b;
            if (j3 == chat.f18329id && !ChatObject.isChannel(chat) && this.f35276f) {
                this.f35276f = false;
                b();
            }
        }
    }
}
