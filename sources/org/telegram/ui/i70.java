package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class i70 implements Runnable {
    public final Object E;
    public final int f48729a = 1;
    public final LaunchActivity f48730b;
    public final Bundle f48731c;
    public final Long d;
    public final i50 f48732e;
    public final boolean f48733f;
    public final vf.b h;
    public final Long f48734n;
    public final Integer f48735r;
    public final Integer f48736s;
    public final byte[] f48737w;
    public final org.telegram.ui.ActionBar.g2 f48738x;
    public final int f48739y;

    public i70(LaunchActivity launchActivity, Bundle bundle, Long l10, int[] iArr, i50 i50Var, boolean z10, vf.b bVar, Long l11, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.g2 g2Var, int i7) {
        this.f48730b = launchActivity;
        this.f48731c = bundle;
        this.d = l10;
        this.E = iArr;
        this.f48732e = i50Var;
        this.f48733f = z10;
        this.h = bVar;
        this.f48734n = l11;
        this.f48735r = num;
        this.f48736s = num2;
        this.f48737w = bArr;
        this.f48738x = g2Var;
        this.f48739y = i7;
    }

    @Override
    public final void run() {
        int i7 = this.f48729a;
        Object obj = this.E;
        switch (i7) {
            case 0:
                i50 i50Var = this.f48732e;
                TLObject tLObject = (TLObject) obj;
                String str = LaunchActivity.C1;
                try {
                    i50Var.run();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                boolean z10 = tLObject instanceof TLRPC.TL_messages_chats;
                LaunchActivity launchActivity = this.f48730b;
                if (z10) {
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
                    if (!tL_messages_chats.chats.isEmpty()) {
                        org.telegram.messenger.mp.u1(launchActivity.P).Z3(tL_messages_chats.chats, false);
                        TLRPC.Chat chat = tL_messages_chats.chats.get(0);
                        Long l10 = this.d;
                        if (chat != null && this.f48733f && org.telegram.messenger.v3.R(chat)) {
                            launchActivity.w0(Long.valueOf(-l10.longValue()), null, this.h, null);
                        } else if (chat != null && chat.forum) {
                            Long l11 = this.f48734n;
                            Integer num = this.f48736s;
                            byte[] bArr = this.f48737w;
                            if (l11 != null) {
                                launchActivity.l0(-l10.longValue(), this.f48735r, null, num, bArr, null, 0, -1);
                            } else {
                                launchActivity.l0(-l10.longValue(), null, null, num, bArr, null, 0, -1);
                            }
                        }
                        org.telegram.ui.ActionBar.g2 g2Var = this.f48738x;
                        Bundle bundle = this.f48731c;
                        if (g2Var == null || org.telegram.messenger.mp.u1(this.f48739y).E(bundle, g2Var, null, null)) {
                            ((ActionBarLayout) launchActivity.M()).S(new bn(bundle));
                            return;
                        }
                        return;
                    }
                }
                launchActivity.F0(org.telegram.ui.Components.b5.E(launchActivity, org.telegram.messenger.gd.N0(2131751442, null), org.telegram.messenger.gd.N0(2131748702, null)));
                return;
            default:
                int[] iArr = (int[]) obj;
                String str2 = LaunchActivity.C1;
                LaunchActivity launchActivity2 = this.f48730b;
                org.telegram.ui.ActionBar.r4 M = launchActivity2.M();
                Bundle bundle2 = this.f48731c;
                if (!((ActionBarLayout) M).S(new bn(bundle2))) {
                    TLRPC.TL_channels_getChannels tL_channels_getChannels = new TLRPC.TL_channels_getChannels();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    Long l12 = this.d;
                    tL_inputChannel.channel_id = l12.longValue();
                    tL_channels_getChannels.f28528id.add(tL_inputChannel);
                    iArr[0] = ConnectionsManager.getInstance(launchActivity2.P).sendRequest(tL_channels_getChannels, new org.telegram.messenger.q4(launchActivity2, this.f48732e, this.f48733f, l12, this.h, this.f48734n, this.f48735r, this.f48736s, this.f48737w, this.f48738x, this.f48739y, bundle2));
                    return;
                }
                return;
        }
    }

    public i70(LaunchActivity launchActivity, i50 i50Var, TLObject tLObject, boolean z10, Long l10, vf.b bVar, Long l11, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.g2 g2Var, int i7, Bundle bundle) {
        this.f48730b = launchActivity;
        this.f48732e = i50Var;
        this.E = tLObject;
        this.f48733f = z10;
        this.d = l10;
        this.h = bVar;
        this.f48734n = l11;
        this.f48735r = num;
        this.f48736s = num2;
        this.f48737w = bArr;
        this.f48738x = g2Var;
        this.f48739y = i7;
        this.f48731c = bundle;
    }
}
