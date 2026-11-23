package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class b21 implements org.telegram.messenger.gs {
    public final int f45751a;
    public final TLRPC.Chat f45752b;
    public TLRPC.ChannelParticipantsFilter f45753c;
    public boolean f45755f;
    public boolean h;
    public boolean f45757r;
    public boolean f45758s;
    public final ArrayList d = new ArrayList();
    public final ArrayList f45754e = new ArrayList();
    public int f45756n = -1;

    public b21(int i7, long j3, TLRPC.ChannelParticipantsFilter channelParticipantsFilter) {
        this.f45751a = i7;
        this.f45752b = org.telegram.messenger.np.u1(i7).O0(Long.valueOf(j3));
        TLRPC.ChatFull P0 = org.telegram.messenger.np.u1(i7).P0(j3);
        this.f45753c = channelParticipantsFilter;
        if (P0 == null) {
            if (!this.f45758s) {
                this.f45758s = true;
                org.telegram.messenger.ls.f(i7).c(this, org.telegram.messenger.ls.T);
            }
            org.telegram.messenger.np.u1(i7).b3(0, j3, false);
        }
    }

    public final void a() {
        if (!this.f45758s) {
            return;
        }
        this.f45758s = false;
        int i7 = this.f45751a;
        org.telegram.messenger.ls.f(i7).n(this, org.telegram.messenger.ls.T);
        if (this.f45756n >= 0) {
            ConnectionsManager.getInstance(i7).cancelRequest(this.f45756n, true);
            this.f45756n = -1;
        }
        this.f45755f = false;
    }

    public final void b() {
        int size;
        if (!this.f45755f && !this.h) {
            TLRPC.ChannelParticipantsFilter channelParticipantsFilter = this.f45753c;
            if (!(channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) || !TextUtils.isEmpty(channelParticipantsFilter.f28433q)) {
                this.f45755f = true;
                TLRPC.Chat chat = this.f45752b;
                if (org.telegram.messenger.v3.T(chat)) {
                    TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                    tL_channels_getParticipants.channel = org.telegram.messenger.np.k1(chat);
                    tL_channels_getParticipants.filter = this.f45753c;
                    tL_channels_getParticipants.limit = 30;
                    if (this.f45757r) {
                        size = 0;
                    } else {
                        size = this.d.size();
                    }
                    tL_channels_getParticipants.offset = size;
                    ConnectionsManager.getInstance(this.f45751a).sendRequestTyped(tL_channels_getParticipants, new d3.b(1), new a5(this, 25));
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ls.T) {
            long j3 = ((TLRPC.ChatFull) objArr[0]).f28435id;
            TLRPC.Chat chat = this.f45752b;
            if (j3 == chat.f28434id && !org.telegram.messenger.v3.T(chat) && this.f45755f) {
                this.f45755f = false;
                b();
            }
        }
    }
}
