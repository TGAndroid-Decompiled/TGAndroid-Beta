package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class g71 implements NotificationCenter.NotificationCenterDelegate {
    public final int f37004a;
    public final TLRPC.Chat f37005b;
    public TLRPC.ChannelParticipantsFilter f37006c;
    public boolean f37008f;
    public boolean h;
    public boolean f37010r;
    public boolean f37011s;
    public final ArrayList d = new ArrayList();
    public final ArrayList f37007e = new ArrayList();
    public int f37009n = -1;

    public g71(int i10, long j10, TLRPC.ChannelParticipantsFilter channelParticipantsFilter) {
        this.f37004a = i10;
        this.f37005b = MessagesController.getInstance(i10).getChat(Long.valueOf(j10));
        TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(j10);
        this.f37006c = channelParticipantsFilter;
        if (chatFull == null) {
            if (!this.f37011s) {
                this.f37011s = true;
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.chatInfoDidLoad);
            }
            MessagesController.getInstance(i10).loadFullChat(j10, 0, false);
        }
    }

    public final void a() {
        if (this.f37011s) {
            return;
        }
        this.f37011s = false;
        int i10 = this.f37004a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        if (this.f37009n >= 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.f37009n, true);
            this.f37009n = -1;
        }
        this.f37008f = false;
    }

    public final void b() {
        int size;
        if (!this.f37008f && !this.h) {
            TLRPC.ChannelParticipantsFilter channelParticipantsFilter = this.f37006c;
            if (!(channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) || !TextUtils.isEmpty(channelParticipantsFilter.f20844q)) {
                this.f37008f = true;
                TLRPC.Chat chat = this.f37005b;
                if (ChatObject.isChannel(chat)) {
                    TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                    tL_channels_getParticipants.channel = MessagesController.getInputChannel(chat);
                    tL_channels_getParticipants.filter = this.f37006c;
                    tL_channels_getParticipants.limit = 30;
                    if (this.f37010r) {
                        size = 0;
                    } else {
                        size = this.d.size();
                    }
                    tL_channels_getParticipants.offset = size;
                    ConnectionsManager.getInstance(this.f37004a).sendRequestTyped(tL_channels_getParticipants, new Object(), new d5(this, 24));
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            long j10 = ((TLRPC.ChatFull) objArr[0]).f20846id;
            TLRPC.Chat chat = this.f37005b;
            if (j10 == chat.f20845id && !ChatObject.isChannel(chat) && this.f37008f) {
                this.f37008f = false;
                b();
            }
        }
    }
}
