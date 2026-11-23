package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class j70 implements Runnable {
    public final Object E;
    public final int f48914a = 1;
    public final LaunchActivity f48915b;
    public final Bundle f48916c;
    public final Long d;
    public final h60 f48917e;
    public final boolean f48918f;
    public final vf.b h;
    public final Long f48919n;
    public final Integer f48920r;
    public final Integer f48921s;
    public final byte[] f48922w;
    public final org.telegram.ui.ActionBar.g2 f48923x;
    public final int f48924y;

    public j70(LaunchActivity launchActivity, Bundle bundle, Long l10, int[] iArr, h60 h60Var, boolean z10, vf.b bVar, Long l11, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.g2 g2Var, int i7) {
        this.f48915b = launchActivity;
        this.f48916c = bundle;
        this.d = l10;
        this.E = iArr;
        this.f48917e = h60Var;
        this.f48918f = z10;
        this.h = bVar;
        this.f48919n = l11;
        this.f48920r = num;
        this.f48921s = num2;
        this.f48922w = bArr;
        this.f48923x = g2Var;
        this.f48924y = i7;
    }

    @Override
    public final void run() {
        int i7 = this.f48914a;
        Object obj = this.E;
        switch (i7) {
            case 0:
                h60 h60Var = this.f48917e;
                TLObject tLObject = (TLObject) obj;
                String str = LaunchActivity.C1;
                try {
                    h60Var.run();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                boolean z10 = tLObject instanceof TLRPC.TL_messages_chats;
                LaunchActivity launchActivity = this.f48915b;
                if (z10) {
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
                    if (!tL_messages_chats.chats.isEmpty()) {
                        org.telegram.messenger.np.u1(launchActivity.P).Z3(tL_messages_chats.chats, false);
                        TLRPC.Chat chat = tL_messages_chats.chats.get(0);
                        Long l10 = this.d;
                        if (chat != null && this.f48918f && org.telegram.messenger.v3.R(chat)) {
                            launchActivity.w0(Long.valueOf(-l10.longValue()), null, this.h, null);
                        } else if (chat != null && chat.forum) {
                            Long l11 = this.f48919n;
                            Integer num = this.f48921s;
                            byte[] bArr = this.f48922w;
                            if (l11 != null) {
                                launchActivity.l0(-l10.longValue(), this.f48920r, null, num, bArr, null, 0, -1);
                            } else {
                                launchActivity.l0(-l10.longValue(), null, null, num, bArr, null, 0, -1);
                            }
                        }
                        org.telegram.ui.ActionBar.g2 g2Var = this.f48923x;
                        Bundle bundle = this.f48916c;
                        if (g2Var == null || org.telegram.messenger.np.u1(this.f48924y).E(bundle, g2Var, null, null)) {
                            ((ActionBarLayout) launchActivity.M()).S(new bn(bundle));
                            return;
                        }
                        return;
                    }
                }
                launchActivity.F0(org.telegram.ui.Components.c5.E(launchActivity, org.telegram.messenger.hd.N0(2131751442, null), org.telegram.messenger.hd.N0(2131748702, null)));
                return;
            default:
                int[] iArr = (int[]) obj;
                String str2 = LaunchActivity.C1;
                LaunchActivity launchActivity2 = this.f48915b;
                org.telegram.ui.ActionBar.r4 M = launchActivity2.M();
                Bundle bundle2 = this.f48916c;
                if (!((ActionBarLayout) M).S(new bn(bundle2))) {
                    TLRPC.TL_channels_getChannels tL_channels_getChannels = new TLRPC.TL_channels_getChannels();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    Long l12 = this.d;
                    tL_inputChannel.channel_id = l12.longValue();
                    tL_channels_getChannels.f28470id.add(tL_inputChannel);
                    iArr[0] = ConnectionsManager.getInstance(launchActivity2.P).sendRequest(tL_channels_getChannels, new org.telegram.messenger.q4(launchActivity2, this.f48917e, this.f48918f, l12, this.h, this.f48919n, this.f48920r, this.f48921s, this.f48922w, this.f48923x, this.f48924y, bundle2));
                    return;
                }
                return;
        }
    }

    public j70(LaunchActivity launchActivity, h60 h60Var, TLObject tLObject, boolean z10, Long l10, vf.b bVar, Long l11, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.g2 g2Var, int i7, Bundle bundle) {
        this.f48915b = launchActivity;
        this.f48917e = h60Var;
        this.E = tLObject;
        this.f48918f = z10;
        this.d = l10;
        this.h = bVar;
        this.f48919n = l11;
        this.f48920r = num;
        this.f48921s = num2;
        this.f48922w = bArr;
        this.f48923x = g2Var;
        this.f48924y = i7;
        this.f48916c = bundle;
    }
}
