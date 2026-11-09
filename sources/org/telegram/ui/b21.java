package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class b21 implements org.telegram.messenger.ls {
    public final int f43854a;
    public final TLRPC.Chat f43855b;
    public TLRPC.ChannelParticipantsFilter f43856c;
    public boolean f43858f;
    public boolean h;
    public boolean f43860r;
    public boolean f43861s;
    public final ArrayList d = new ArrayList();
    public final ArrayList f43857e = new ArrayList();
    public int f43859n = -1;

    public b21(int i7, long j3, TLRPC.ChannelParticipantsFilter channelParticipantsFilter) {
        this.f43854a = i7;
        this.f43855b = org.telegram.messenger.qp.s1(i7).M0(Long.valueOf(j3));
        TLRPC.ChatFull N0 = org.telegram.messenger.qp.s1(i7).N0(j3);
        this.f43856c = channelParticipantsFilter;
        if (N0 == null) {
            if (!this.f43861s) {
                this.f43861s = true;
                org.telegram.messenger.qs.f(i7).c(this, org.telegram.messenger.qs.T);
            }
            org.telegram.messenger.qp.s1(i7).V2(0, j3, false);
        }
    }

    public final void a() {
        if (!this.f43861s) {
            return;
        }
        this.f43861s = false;
        int i7 = this.f43854a;
        org.telegram.messenger.qs.f(i7).n(this, org.telegram.messenger.qs.T);
        if (this.f43859n >= 0) {
            ConnectionsManager.getInstance(i7).cancelRequest(this.f43859n, true);
            this.f43859n = -1;
        }
        this.f43858f = false;
    }

    public final void b() {
        int size;
        if (!this.f43858f && !this.h) {
            TLRPC.ChannelParticipantsFilter channelParticipantsFilter = this.f43856c;
            if (!(channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) || !TextUtils.isEmpty(channelParticipantsFilter.f26955q)) {
                this.f43858f = true;
                TLRPC.Chat chat = this.f43855b;
                if (org.telegram.messenger.t3.T(chat)) {
                    TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                    tL_channels_getParticipants.channel = org.telegram.messenger.qp.i1(chat);
                    tL_channels_getParticipants.filter = this.f43856c;
                    tL_channels_getParticipants.limit = 30;
                    if (this.f43860r) {
                        size = 0;
                    } else {
                        size = this.d.size();
                    }
                    tL_channels_getParticipants.offset = size;
                    ConnectionsManager.getInstance(this.f43854a).sendRequestTyped(tL_channels_getParticipants, new d3.b(1), new a5(this, 25));
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.T) {
            long j3 = ((TLRPC.ChatFull) objArr[0]).f26957id;
            TLRPC.Chat chat = this.f43855b;
            if (j3 == chat.f26956id && !org.telegram.messenger.t3.T(chat) && this.f43858f) {
                this.f43858f = false;
                b();
            }
        }
    }
}
