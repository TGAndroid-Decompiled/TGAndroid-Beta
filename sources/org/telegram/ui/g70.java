package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class g70 implements Runnable {
    public final Object E;
    public final int f47358a = 1;
    public final LaunchActivity f47359b;
    public final Bundle f47360c;
    public final Long d;
    public final g50 f47361e;
    public final boolean f47362f;
    public final vf.b h;
    public final Long f47363n;
    public final Integer f47364r;
    public final Integer f47365s;
    public final byte[] f47366w;
    public final org.telegram.ui.ActionBar.e2 f47367x;
    public final int f47368y;

    public g70(LaunchActivity launchActivity, Bundle bundle, Long l10, int[] iArr, g50 g50Var, boolean z10, vf.b bVar, Long l11, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.e2 e2Var, int i7) {
        this.f47359b = launchActivity;
        this.f47360c = bundle;
        this.d = l10;
        this.E = iArr;
        this.f47361e = g50Var;
        this.f47362f = z10;
        this.h = bVar;
        this.f47363n = l11;
        this.f47364r = num;
        this.f47365s = num2;
        this.f47366w = bArr;
        this.f47367x = e2Var;
        this.f47368y = i7;
    }

    @Override
    public final void run() {
        int i7 = this.f47358a;
        Object obj = this.E;
        switch (i7) {
            case 0:
                g50 g50Var = this.f47361e;
                TLObject tLObject = (TLObject) obj;
                String str = LaunchActivity.C1;
                try {
                    g50Var.run();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                boolean z10 = tLObject instanceof TLRPC.TL_messages_chats;
                LaunchActivity launchActivity = this.f47359b;
                if (z10) {
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
                    if (!tL_messages_chats.chats.isEmpty()) {
                        org.telegram.messenger.np.s1(launchActivity.P).S3(tL_messages_chats.chats, false);
                        TLRPC.Chat chat = tL_messages_chats.chats.get(0);
                        Long l10 = this.d;
                        if (chat != null && this.f47362f && org.telegram.messenger.t3.R(chat)) {
                            launchActivity.w0(Long.valueOf(-l10.longValue()), null, this.h, null);
                        } else if (chat != null && chat.forum) {
                            Long l11 = this.f47363n;
                            Integer num = this.f47365s;
                            byte[] bArr = this.f47366w;
                            if (l11 != null) {
                                launchActivity.l0(-l10.longValue(), this.f47364r, null, num, bArr, null, 0, -1);
                            } else {
                                launchActivity.l0(-l10.longValue(), null, null, num, bArr, null, 0, -1);
                            }
                        }
                        org.telegram.ui.ActionBar.e2 e2Var = this.f47367x;
                        Bundle bundle = this.f47360c;
                        if (e2Var == null || org.telegram.messenger.np.s1(this.f47368y).E(bundle, e2Var, null, null)) {
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
                LaunchActivity launchActivity2 = this.f47359b;
                org.telegram.ui.ActionBar.o4 M = launchActivity2.M();
                Bundle bundle2 = this.f47360c;
                if (!((ActionBarLayout) M).S(new an(bundle2))) {
                    TLRPC.TL_channels_getChannels tL_channels_getChannels = new TLRPC.TL_channels_getChannels();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    Long l12 = this.d;
                    tL_inputChannel.channel_id = l12.longValue();
                    tL_channels_getChannels.f28087id.add(tL_inputChannel);
                    iArr[0] = ConnectionsManager.getInstance(launchActivity2.P).sendRequest(tL_channels_getChannels, new org.telegram.messenger.o4(launchActivity2, this.f47361e, this.f47362f, l12, this.h, this.f47363n, this.f47364r, this.f47365s, this.f47366w, this.f47367x, this.f47368y, bundle2));
                    return;
                }
                return;
        }
    }

    public g70(LaunchActivity launchActivity, g50 g50Var, TLObject tLObject, boolean z10, Long l10, vf.b bVar, Long l11, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.e2 e2Var, int i7, Bundle bundle) {
        this.f47359b = launchActivity;
        this.f47361e = g50Var;
        this.E = tLObject;
        this.f47362f = z10;
        this.d = l10;
        this.h = bVar;
        this.f47363n = l11;
        this.f47364r = num;
        this.f47365s = num2;
        this.f47366w = bArr;
        this.f47367x = e2Var;
        this.f47368y = i7;
        this.f47360c = bundle;
    }
}
