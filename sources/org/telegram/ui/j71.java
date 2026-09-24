package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class j71 implements NotificationCenter.NotificationCenterDelegate {
    public final int f34662a;
    public final TLRPC.Chat f34663b;
    public TLRPC.ChannelParticipantsFilter f34664c;
    public boolean f34665f;
    public boolean h;
    public boolean f34667r;
    public boolean f34668s;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public int f34666n = -1;

    public j71(int i10, long j3, TLRPC.ChannelParticipantsFilter channelParticipantsFilter) {
        this.f34662a = i10;
        this.f34663b = MessagesController.getInstance(i10).getChat(Long.valueOf(j3));
        TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(j3);
        this.f34664c = channelParticipantsFilter;
        if (chatFull == null) {
            if (!this.f34668s) {
                this.f34668s = true;
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.chatInfoDidLoad);
            }
            MessagesController.getInstance(i10).loadFullChat(j3, 0, false);
        }
    }

    public final void a() {
        if (this.f34668s) {
            return;
        }
        this.f34668s = false;
        int i10 = this.f34662a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        if (this.f34666n >= 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.f34666n, true);
            this.f34666n = -1;
        }
        this.f34665f = false;
    }

    public final void b() {
        int size;
        if (!this.f34665f && !this.h) {
            TLRPC.ChannelParticipantsFilter channelParticipantsFilter = this.f34664c;
            if (!(channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) || !TextUtils.isEmpty(channelParticipantsFilter.f18320q)) {
                this.f34665f = true;
                TLRPC.Chat chat = this.f34663b;
                if (ChatObject.isChannel(chat)) {
                    TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                    tL_channels_getParticipants.channel = MessagesController.getInputChannel(chat);
                    tL_channels_getParticipants.filter = this.f34664c;
                    tL_channels_getParticipants.limit = 30;
                    if (this.f34667r) {
                        size = 0;
                    } else {
                        size = this.d.size();
                    }
                    tL_channels_getParticipants.offset = size;
                    ConnectionsManager.getInstance(this.f34662a).sendRequestTyped(tL_channels_getParticipants, new Object(), new b5(this, 24));
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            long j3 = ((TLRPC.ChatFull) objArr[0]).f18322id;
            TLRPC.Chat chat = this.f34663b;
            if (j3 == chat.f18321id && !ChatObject.isChannel(chat) && this.f34665f) {
                this.f34665f = false;
                b();
            }
        }
    }
}
