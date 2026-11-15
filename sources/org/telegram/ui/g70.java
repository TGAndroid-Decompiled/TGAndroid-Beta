package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class g70 implements Runnable {
    public final Object E;
    public final int f47348a = 1;
    public final LaunchActivity f47349b;
    public final Bundle f47350c;
    public final Long d;
    public final g50 f47351e;
    public final boolean f47352f;
    public final vf.b h;
    public final Long f47353n;
    public final Integer f47354r;
    public final Integer f47355s;
    public final byte[] f47356w;
    public final org.telegram.ui.ActionBar.e2 f47357x;
    public final int f47358y;

    public g70(LaunchActivity launchActivity, Bundle bundle, Long l10, int[] iArr, g50 g50Var, boolean z10, vf.b bVar, Long l11, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.e2 e2Var, int i7) {
        this.f47349b = launchActivity;
        this.f47350c = bundle;
        this.d = l10;
        this.E = iArr;
        this.f47351e = g50Var;
        this.f47352f = z10;
        this.h = bVar;
        this.f47353n = l11;
        this.f47354r = num;
        this.f47355s = num2;
        this.f47356w = bArr;
        this.f47357x = e2Var;
        this.f47358y = i7;
    }

    @Override
    public final void run() {
        int i7 = this.f47348a;
        Object obj = this.E;
        switch (i7) {
            case 0:
                g50 g50Var = this.f47351e;
                TLObject tLObject = (TLObject) obj;
                String str = LaunchActivity.C1;
                try {
                    g50Var.run();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                boolean z10 = tLObject instanceof TLRPC.TL_messages_chats;
                LaunchActivity launchActivity = this.f47349b;
                if (z10) {
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
                    if (!tL_messages_chats.chats.isEmpty()) {
                        org.telegram.messenger.np.s1(launchActivity.P).S3(tL_messages_chats.chats, false);
                        TLRPC.Chat chat = tL_messages_chats.chats.get(0);
                        Long l10 = this.d;
                        if (chat != null && this.f47352f && org.telegram.messenger.t3.R(chat)) {
                            launchActivity.w0(Long.valueOf(-l10.longValue()), null, this.h, null);
                        } else if (chat != null && chat.forum) {
                            Long l11 = this.f47353n;
                            Integer num = this.f47355s;
                            byte[] bArr = this.f47356w;
                            if (l11 != null) {
                                launchActivity.l0(-l10.longValue(), this.f47354r, null, num, bArr, null, 0, -1);
                            } else {
                                launchActivity.l0(-l10.longValue(), null, null, num, bArr, null, 0, -1);
                            }
                        }
                        org.telegram.ui.ActionBar.e2 e2Var = this.f47357x;
                        Bundle bundle = this.f47350c;
                        if (e2Var == null || org.telegram.messenger.np.s1(this.f47358y).E(bundle, e2Var, null, null)) {
                            ((ActionBarLayout) launchActivity.M()).S(new an(bundle));
                            return;
                        }
                        return;
                    }
                }
                launchActivity.F0(org.telegram.ui.Components.t4.E(launchActivity, org.telegram.messenger.hd.M0(2131751454, null), org.telegram.messenger.hd.M0(2131748895, null)));
                return;
            default:
                int[] iArr = (int[]) obj;
                String str2 = LaunchActivity.C1;
                LaunchActivity launchActivity2 = this.f47349b;
                org.telegram.ui.ActionBar.o4 M = launchActivity2.M();
                Bundle bundle2 = this.f47350c;
                if (!((ActionBarLayout) M).S(new an(bundle2))) {
                    TLRPC.TL_channels_getChannels tL_channels_getChannels = new TLRPC.TL_channels_getChannels();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    Long l12 = this.d;
                    tL_inputChannel.channel_id = l12.longValue();
                    tL_channels_getChannels.f28087id.add(tL_inputChannel);
                    iArr[0] = ConnectionsManager.getInstance(launchActivity2.P).sendRequest(tL_channels_getChannels, new org.telegram.messenger.o4(launchActivity2, this.f47351e, this.f47352f, l12, this.h, this.f47353n, this.f47354r, this.f47355s, this.f47356w, this.f47357x, this.f47358y, bundle2));
                    return;
                }
                return;
        }
    }

    public g70(LaunchActivity launchActivity, g50 g50Var, TLObject tLObject, boolean z10, Long l10, vf.b bVar, Long l11, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.e2 e2Var, int i7, Bundle bundle) {
        this.f47349b = launchActivity;
        this.f47351e = g50Var;
        this.E = tLObject;
        this.f47352f = z10;
        this.d = l10;
        this.h = bVar;
        this.f47353n = l11;
        this.f47354r = num;
        this.f47355s = num2;
        this.f47356w = bArr;
        this.f47357x = e2Var;
        this.f47358y = i7;
        this.f47350c = bundle;
    }
}
