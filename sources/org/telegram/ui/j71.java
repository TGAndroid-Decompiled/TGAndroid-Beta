package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class j71 implements NotificationCenter.NotificationCenterDelegate {
    public final int f34765a;
    public final TLRPC.Chat f34766b;
    public TLRPC.ChannelParticipantsFilter f34767c;
    public boolean f34768f;
    public boolean h;
    public boolean f34770r;
    public boolean f34771s;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public int f34769n = -1;

    public j71(int i10, long j3, TLRPC.ChannelParticipantsFilter channelParticipantsFilter) {
        this.f34765a = i10;
        this.f34766b = MessagesController.getInstance(i10).getChat(Long.valueOf(j3));
        TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(j3);
        this.f34767c = channelParticipantsFilter;
        if (chatFull == null) {
            if (!this.f34771s) {
                this.f34771s = true;
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.chatInfoDidLoad);
            }
            MessagesController.getInstance(i10).loadFullChat(j3, 0, false);
        }
    }

    public final void a() {
        if (this.f34771s) {
            return;
        }
        this.f34771s = false;
        int i10 = this.f34765a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        if (this.f34769n >= 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.f34769n, true);
            this.f34769n = -1;
        }
        this.f34768f = false;
    }

    public final void b() {
        int size;
        if (!this.f34768f && !this.h) {
            TLRPC.ChannelParticipantsFilter channelParticipantsFilter = this.f34767c;
            if (!(channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) || !TextUtils.isEmpty(channelParticipantsFilter.f18351q)) {
                this.f34768f = true;
                TLRPC.Chat chat = this.f34766b;
                if (ChatObject.isChannel(chat)) {
                    TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                    tL_channels_getParticipants.channel = MessagesController.getInputChannel(chat);
                    tL_channels_getParticipants.filter = this.f34767c;
                    tL_channels_getParticipants.limit = 30;
                    if (this.f34770r) {
                        size = 0;
                    } else {
                        size = this.d.size();
                    }
                    tL_channels_getParticipants.offset = size;
                    ConnectionsManager.getInstance(this.f34765a).sendRequestTyped(tL_channels_getParticipants, new Object(), new b5(this, 24));
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            long j3 = ((TLRPC.ChatFull) objArr[0]).f18353id;
            TLRPC.Chat chat = this.f34766b;
            if (j3 == chat.f18352id && !ChatObject.isChannel(chat) && this.f34768f) {
                this.f34768f = false;
                b();
            }
        }
    }
}
