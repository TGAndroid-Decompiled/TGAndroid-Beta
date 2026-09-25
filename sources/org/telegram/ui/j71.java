package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class j71 implements NotificationCenter.NotificationCenterDelegate {
    public final int f34677a;
    public final TLRPC.Chat f34678b;
    public TLRPC.ChannelParticipantsFilter f34679c;
    public boolean f34680f;
    public boolean h;
    public boolean f34682r;
    public boolean f34683s;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public int f34681n = -1;

    public j71(int i10, long j3, TLRPC.ChannelParticipantsFilter channelParticipantsFilter) {
        this.f34677a = i10;
        this.f34678b = MessagesController.getInstance(i10).getChat(Long.valueOf(j3));
        TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(j3);
        this.f34679c = channelParticipantsFilter;
        if (chatFull == null) {
            if (!this.f34683s) {
                this.f34683s = true;
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.chatInfoDidLoad);
            }
            MessagesController.getInstance(i10).loadFullChat(j3, 0, false);
        }
    }

    public final void a() {
        if (this.f34683s) {
            return;
        }
        this.f34683s = false;
        int i10 = this.f34677a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        if (this.f34681n >= 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.f34681n, true);
            this.f34681n = -1;
        }
        this.f34680f = false;
    }

    public final void b() {
        int size;
        if (!this.f34680f && !this.h) {
            TLRPC.ChannelParticipantsFilter channelParticipantsFilter = this.f34679c;
            if (!(channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) || !TextUtils.isEmpty(channelParticipantsFilter.f18335q)) {
                this.f34680f = true;
                TLRPC.Chat chat = this.f34678b;
                if (ChatObject.isChannel(chat)) {
                    TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                    tL_channels_getParticipants.channel = MessagesController.getInputChannel(chat);
                    tL_channels_getParticipants.filter = this.f34679c;
                    tL_channels_getParticipants.limit = 30;
                    if (this.f34682r) {
                        size = 0;
                    } else {
                        size = this.d.size();
                    }
                    tL_channels_getParticipants.offset = size;
                    ConnectionsManager.getInstance(this.f34677a).sendRequestTyped(tL_channels_getParticipants, new Object(), new b5(this, 24));
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            long j3 = ((TLRPC.ChatFull) objArr[0]).f18337id;
            TLRPC.Chat chat = this.f34678b;
            if (j3 == chat.f18336id && !ChatObject.isChannel(chat) && this.f34680f) {
                this.f34680f = false;
                b();
            }
        }
    }
}
