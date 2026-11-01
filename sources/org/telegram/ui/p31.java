package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class p31 implements org.telegram.messenger.vs {
    public final int f40353a;
    public final TLRPC.Chat f40354b;
    public TLRPC.ChannelParticipantsFilter f40355c;
    public boolean f40356f;
    public boolean h;
    public boolean f40358r;
    public boolean f40359s;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public int f40357n = -1;

    public p31(int i10, long j10, TLRPC.ChannelParticipantsFilter channelParticipantsFilter) {
        this.f40353a = i10;
        this.f40354b = org.telegram.messenger.wp.r1(i10).L0(Long.valueOf(j10));
        TLRPC.ChatFull M0 = org.telegram.messenger.wp.r1(i10).M0(j10);
        this.f40355c = channelParticipantsFilter;
        if (M0 == null) {
            if (!this.f40359s) {
                this.f40359s = true;
                org.telegram.messenger.at.f(i10).c(this, org.telegram.messenger.at.T);
            }
            org.telegram.messenger.wp.r1(i10).T2(0, j10, false);
        }
    }

    public final void a() {
        if (!this.f40359s) {
            return;
        }
        this.f40359s = false;
        int i10 = this.f40353a;
        org.telegram.messenger.at.f(i10).n(this, org.telegram.messenger.at.T);
        if (this.f40357n >= 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.f40357n, true);
            this.f40357n = -1;
        }
        this.f40356f = false;
    }

    public final void b() {
        int size;
        if (!this.f40356f && !this.h) {
            TLRPC.ChannelParticipantsFilter channelParticipantsFilter = this.f40355c;
            if (!(channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) || !TextUtils.isEmpty(channelParticipantsFilter.f19793q)) {
                this.f40356f = true;
                TLRPC.Chat chat = this.f40354b;
                if (org.telegram.messenger.w3.T(chat)) {
                    TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                    tL_channels_getParticipants.channel = org.telegram.messenger.wp.h1(chat);
                    tL_channels_getParticipants.filter = this.f40355c;
                    tL_channels_getParticipants.limit = 30;
                    if (this.f40358r) {
                        size = 0;
                    } else {
                        size = this.d.size();
                    }
                    tL_channels_getParticipants.offset = size;
                    ConnectionsManager.getInstance(this.f40353a).sendRequestTyped(tL_channels_getParticipants, new a3.b(1), new z4(this, 24));
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.at.T) {
            long j10 = ((TLRPC.ChatFull) objArr[0]).f19795id;
            TLRPC.Chat chat = this.f40354b;
            if (j10 == chat.f19794id && !org.telegram.messenger.w3.T(chat) && this.f40356f) {
                this.f40356f = false;
                b();
            }
        }
    }
}
