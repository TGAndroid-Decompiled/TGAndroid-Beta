package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class p71 implements NotificationCenter.NotificationCenterDelegate {
    public final int f36365a;
    public final TLRPC.Chat f36366b;
    public TLRPC.ChannelParticipantsFilter f36367c;
    public boolean f36368f;
    public boolean h;
    public boolean f36370r;
    public boolean f36371s;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public int f36369n = -1;

    public p71(int i10, long j3, TLRPC.ChannelParticipantsFilter channelParticipantsFilter) {
        this.f36365a = i10;
        this.f36366b = MessagesController.getInstance(i10).getChat(Long.valueOf(j3));
        TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(j3);
        this.f36367c = channelParticipantsFilter;
        if (chatFull == null) {
            if (!this.f36371s) {
                this.f36371s = true;
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.chatInfoDidLoad);
            }
            MessagesController.getInstance(i10).loadFullChat(j3, 0, false);
        }
    }

    public final void a() {
        if (this.f36371s) {
            return;
        }
        this.f36371s = false;
        int i10 = this.f36365a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        if (this.f36369n >= 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.f36369n, true);
            this.f36369n = -1;
        }
        this.f36368f = false;
    }

    public final void b() {
        int size;
        if (!this.f36368f && !this.h) {
            TLRPC.ChannelParticipantsFilter channelParticipantsFilter = this.f36367c;
            if (!(channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) || !TextUtils.isEmpty(channelParticipantsFilter.f18295q)) {
                this.f36368f = true;
                TLRPC.Chat chat = this.f36366b;
                if (ChatObject.isChannel(chat)) {
                    TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                    tL_channels_getParticipants.channel = MessagesController.getInputChannel(chat);
                    tL_channels_getParticipants.filter = this.f36367c;
                    tL_channels_getParticipants.limit = 30;
                    if (this.f36370r) {
                        size = 0;
                    } else {
                        size = this.d.size();
                    }
                    tL_channels_getParticipants.offset = size;
                    ConnectionsManager.getInstance(this.f36365a).sendRequestTyped(tL_channels_getParticipants, new Object(), new b5(this, 24));
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            long j3 = ((TLRPC.ChatFull) objArr[0]).f18297id;
            TLRPC.Chat chat = this.f36366b;
            if (j3 == chat.f18296id && !ChatObject.isChannel(chat) && this.f36368f) {
                this.f36368f = false;
                b();
            }
        }
    }
}
