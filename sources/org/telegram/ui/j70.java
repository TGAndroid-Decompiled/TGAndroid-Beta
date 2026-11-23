package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class j70 implements Runnable {
    public final Object E;
    public final int f48923a = 1;
    public final LaunchActivity f48924b;
    public final Bundle f48925c;
    public final Long d;
    public final o60 f48926e;
    public final boolean f48927f;
    public final vf.b h;
    public final Long f48928n;
    public final Integer f48929r;
    public final Integer f48930s;
    public final byte[] f48931w;
    public final org.telegram.ui.ActionBar.g2 f48932x;
    public final int f48933y;

    public j70(LaunchActivity launchActivity, Bundle bundle, Long l10, int[] iArr, o60 o60Var, boolean z10, vf.b bVar, Long l11, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.g2 g2Var, int i7) {
        this.f48924b = launchActivity;
        this.f48925c = bundle;
        this.d = l10;
        this.E = iArr;
        this.f48926e = o60Var;
        this.f48927f = z10;
        this.h = bVar;
        this.f48928n = l11;
        this.f48929r = num;
        this.f48930s = num2;
        this.f48931w = bArr;
        this.f48932x = g2Var;
        this.f48933y = i7;
    }

    @Override
    public final void run() {
        int i7 = this.f48923a;
        Object obj = this.E;
        switch (i7) {
            case 0:
                o60 o60Var = this.f48926e;
                TLObject tLObject = (TLObject) obj;
                String str = LaunchActivity.C1;
                try {
                    o60Var.run();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                boolean z10 = tLObject instanceof TLRPC.TL_messages_chats;
                LaunchActivity launchActivity = this.f48924b;
                if (z10) {
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
                    if (!tL_messages_chats.chats.isEmpty()) {
                        org.telegram.messenger.np.u1(launchActivity.P).Z3(tL_messages_chats.chats, false);
                        TLRPC.Chat chat = tL_messages_chats.chats.get(0);
                        Long l10 = this.d;
                        if (chat != null && this.f48927f && org.telegram.messenger.v3.R(chat)) {
                            launchActivity.w0(Long.valueOf(-l10.longValue()), null, this.h, null);
                        } else if (chat != null && chat.forum) {
                            Long l11 = this.f48928n;
                            Integer num = this.f48930s;
                            byte[] bArr = this.f48931w;
                            if (l11 != null) {
                                launchActivity.l0(-l10.longValue(), this.f48929r, null, num, bArr, null, 0, -1);
                            } else {
                                launchActivity.l0(-l10.longValue(), null, null, num, bArr, null, 0, -1);
                            }
                        }
                        org.telegram.ui.ActionBar.g2 g2Var = this.f48932x;
                        Bundle bundle = this.f48925c;
                        if (g2Var == null || org.telegram.messenger.np.u1(this.f48933y).E(bundle, g2Var, null, null)) {
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
                LaunchActivity launchActivity2 = this.f48924b;
                org.telegram.ui.ActionBar.r4 M = launchActivity2.M();
                Bundle bundle2 = this.f48925c;
                if (!((ActionBarLayout) M).S(new bn(bundle2))) {
                    TLRPC.TL_channels_getChannels tL_channels_getChannels = new TLRPC.TL_channels_getChannels();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    Long l12 = this.d;
                    tL_inputChannel.channel_id = l12.longValue();
                    tL_channels_getChannels.f28434id.add(tL_inputChannel);
                    iArr[0] = ConnectionsManager.getInstance(launchActivity2.P).sendRequest(tL_channels_getChannels, new org.telegram.messenger.q4(launchActivity2, this.f48926e, this.f48927f, l12, this.h, this.f48928n, this.f48929r, this.f48930s, this.f48931w, this.f48932x, this.f48933y, bundle2));
                    return;
                }
                return;
        }
    }

    public j70(LaunchActivity launchActivity, o60 o60Var, TLObject tLObject, boolean z10, Long l10, vf.b bVar, Long l11, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.g2 g2Var, int i7, Bundle bundle) {
        this.f48924b = launchActivity;
        this.f48926e = o60Var;
        this.E = tLObject;
        this.f48927f = z10;
        this.d = l10;
        this.h = bVar;
        this.f48928n = l11;
        this.f48929r = num;
        this.f48930s = num2;
        this.f48931w = bArr;
        this.f48932x = g2Var;
        this.f48933y = i7;
        this.f48925c = bundle;
    }
}
