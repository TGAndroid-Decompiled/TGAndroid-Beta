package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class a21 implements org.telegram.messenger.gs {
    public final int f45441a;
    public final TLRPC.Chat f45442b;
    public TLRPC.ChannelParticipantsFilter f45443c;
    public boolean f45445f;
    public boolean h;
    public boolean f45447r;
    public boolean f45448s;
    public final ArrayList d = new ArrayList();
    public final ArrayList f45444e = new ArrayList();
    public int f45446n = -1;

    public a21(int i7, long j3, TLRPC.ChannelParticipantsFilter channelParticipantsFilter) {
        this.f45441a = i7;
        this.f45442b = org.telegram.messenger.np.u1(i7).O0(Long.valueOf(j3));
        TLRPC.ChatFull P0 = org.telegram.messenger.np.u1(i7).P0(j3);
        this.f45443c = channelParticipantsFilter;
        if (P0 == null) {
            if (!this.f45448s) {
                this.f45448s = true;
                org.telegram.messenger.ls.f(i7).c(this, org.telegram.messenger.ls.T);
            }
            org.telegram.messenger.np.u1(i7).b3(0, j3, false);
        }
    }

    public final void a() {
        if (!this.f45448s) {
            return;
        }
        this.f45448s = false;
        int i7 = this.f45441a;
        org.telegram.messenger.ls.f(i7).n(this, org.telegram.messenger.ls.T);
        if (this.f45446n >= 0) {
            ConnectionsManager.getInstance(i7).cancelRequest(this.f45446n, true);
            this.f45446n = -1;
        }
        this.f45445f = false;
    }

    public final void b() {
        int size;
        if (!this.f45445f && !this.h) {
            TLRPC.ChannelParticipantsFilter channelParticipantsFilter = this.f45443c;
            if (!(channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) || !TextUtils.isEmpty(channelParticipantsFilter.f28397q)) {
                this.f45445f = true;
                TLRPC.Chat chat = this.f45442b;
                if (org.telegram.messenger.v3.T(chat)) {
                    TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                    tL_channels_getParticipants.channel = org.telegram.messenger.np.k1(chat);
                    tL_channels_getParticipants.filter = this.f45443c;
                    tL_channels_getParticipants.limit = 30;
                    if (this.f45447r) {
                        size = 0;
                    } else {
                        size = this.d.size();
                    }
                    tL_channels_getParticipants.offset = size;
                    ConnectionsManager.getInstance(this.f45441a).sendRequestTyped(tL_channels_getParticipants, new d3.b(1), new a5(this, 25));
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ls.T) {
            long j3 = ((TLRPC.ChatFull) objArr[0]).f28399id;
            TLRPC.Chat chat = this.f45442b;
            if (j3 == chat.f28398id && !org.telegram.messenger.v3.T(chat) && this.f45445f) {
                this.f45445f = false;
                b();
            }
        }
    }
}
