package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class k61 implements NotificationCenter.NotificationCenterDelegate {
    public final int f39752a;
    public final TLRPC.Chat f39753b;
    public TLRPC.ChannelParticipantsFilter f39754c;
    public boolean f39756f;
    public boolean h;
    public boolean f39758r;
    public boolean f39759s;
    public final ArrayList d = new ArrayList();
    public final ArrayList f39755e = new ArrayList();
    public int f39757n = -1;

    public k61(int i9, long j10, TLRPC.ChannelParticipantsFilter channelParticipantsFilter) {
        this.f39752a = i9;
        this.f39753b = MessagesController.getInstance(i9).getChat(Long.valueOf(j10));
        TLRPC.ChatFull chatFull = MessagesController.getInstance(i9).getChatFull(j10);
        this.f39754c = channelParticipantsFilter;
        if (chatFull == null) {
            if (!this.f39759s) {
                this.f39759s = true;
                NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.chatInfoDidLoad);
            }
            MessagesController.getInstance(i9).loadFullChat(j10, 0, false);
        }
    }

    public final void a() {
        if (this.f39759s) {
            return;
        }
        this.f39759s = false;
        int i9 = this.f39752a;
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        if (this.f39757n >= 0) {
            ConnectionsManager.getInstance(i9).cancelRequest(this.f39757n, true);
            this.f39757n = -1;
        }
        this.f39756f = false;
    }

    public final void b() {
        int size;
        if (!this.f39756f && !this.h) {
            TLRPC.ChannelParticipantsFilter channelParticipantsFilter = this.f39754c;
            if (!(channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) || !TextUtils.isEmpty(channelParticipantsFilter.f22379q)) {
                this.f39756f = true;
                TLRPC.Chat chat = this.f39753b;
                if (ChatObject.isChannel(chat)) {
                    TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                    tL_channels_getParticipants.channel = MessagesController.getInputChannel(chat);
                    tL_channels_getParticipants.filter = this.f39754c;
                    tL_channels_getParticipants.limit = 30;
                    if (this.f39758r) {
                        size = 0;
                    } else {
                        size = this.d.size();
                    }
                    tL_channels_getParticipants.offset = size;
                    ConnectionsManager.getInstance(this.f39752a).sendRequestTyped(tL_channels_getParticipants, new Object(), new a5(this, 24));
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.chatInfoDidLoad) {
            long j10 = ((TLRPC.ChatFull) objArr[0]).f22381id;
            TLRPC.Chat chat = this.f39753b;
            if (j10 == chat.f22380id && !ChatObject.isChannel(chat) && this.f39756f) {
                this.f39756f = false;
                b();
            }
        }
    }
}
