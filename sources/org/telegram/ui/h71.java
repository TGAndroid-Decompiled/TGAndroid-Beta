package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class h71 implements NotificationCenter.NotificationCenterDelegate {
    public final int f34591a;
    public final TLRPC.Chat f34592b;
    public TLRPC.ChannelParticipantsFilter f34593c;
    public boolean f34594f;
    public boolean h;
    public boolean f34596r;
    public boolean f34597s;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public int f34595n = -1;

    public h71(int i10, long j10, TLRPC.ChannelParticipantsFilter channelParticipantsFilter) {
        this.f34591a = i10;
        this.f34592b = MessagesController.getInstance(i10).getChat(Long.valueOf(j10));
        TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(j10);
        this.f34593c = channelParticipantsFilter;
        if (chatFull == null) {
            if (!this.f34597s) {
                this.f34597s = true;
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.chatInfoDidLoad);
            }
            MessagesController.getInstance(i10).loadFullChat(j10, 0, false);
        }
    }

    public final void a() {
        if (this.f34597s) {
            return;
        }
        this.f34597s = false;
        int i10 = this.f34591a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        if (this.f34595n >= 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.f34595n, true);
            this.f34595n = -1;
        }
        this.f34594f = false;
    }

    public final void b() {
        int size;
        if (!this.f34594f && !this.h) {
            TLRPC.ChannelParticipantsFilter channelParticipantsFilter = this.f34593c;
            if (!(channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) || !TextUtils.isEmpty(channelParticipantsFilter.f19158q)) {
                this.f34594f = true;
                TLRPC.Chat chat = this.f34592b;
                if (ChatObject.isChannel(chat)) {
                    TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                    tL_channels_getParticipants.channel = MessagesController.getInputChannel(chat);
                    tL_channels_getParticipants.filter = this.f34593c;
                    tL_channels_getParticipants.limit = 30;
                    if (this.f34596r) {
                        size = 0;
                    } else {
                        size = this.d.size();
                    }
                    tL_channels_getParticipants.offset = size;
                    ConnectionsManager.getInstance(this.f34591a).sendRequestTyped(tL_channels_getParticipants, new Object(), new f5(this, 24));
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            long j10 = ((TLRPC.ChatFull) objArr[0]).f19160id;
            TLRPC.Chat chat = this.f34592b;
            if (j10 == chat.f19159id && !ChatObject.isChannel(chat) && this.f34594f) {
                this.f34594f = false;
                b();
            }
        }
    }
}
