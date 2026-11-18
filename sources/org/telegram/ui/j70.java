package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class j70 implements Runnable {
    public final Object E;
    public final int f48894a = 1;
    public final LaunchActivity f48895b;
    public final Bundle f48896c;
    public final Long d;
    public final o60 f48897e;
    public final boolean f48898f;
    public final vf.b h;
    public final Long f48899n;
    public final Integer f48900r;
    public final Integer f48901s;
    public final byte[] f48902w;
    public final org.telegram.ui.ActionBar.h2 f48903x;
    public final int f48904y;

    public j70(LaunchActivity launchActivity, Bundle bundle, Long l10, int[] iArr, o60 o60Var, boolean z10, vf.b bVar, Long l11, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.h2 h2Var, int i7) {
        this.f48895b = launchActivity;
        this.f48896c = bundle;
        this.d = l10;
        this.E = iArr;
        this.f48897e = o60Var;
        this.f48898f = z10;
        this.h = bVar;
        this.f48899n = l11;
        this.f48900r = num;
        this.f48901s = num2;
        this.f48902w = bArr;
        this.f48903x = h2Var;
        this.f48904y = i7;
    }

    @Override
    public final void run() {
        int i7 = this.f48894a;
        Object obj = this.E;
        switch (i7) {
            case 0:
                o60 o60Var = this.f48897e;
                TLObject tLObject = (TLObject) obj;
                String str = LaunchActivity.C1;
                try {
                    o60Var.run();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                boolean z10 = tLObject instanceof TLRPC.TL_messages_chats;
                LaunchActivity launchActivity = this.f48895b;
                if (z10) {
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
                    if (!tL_messages_chats.chats.isEmpty()) {
                        org.telegram.messenger.mp.u1(launchActivity.P).Z3(tL_messages_chats.chats, false);
                        TLRPC.Chat chat = tL_messages_chats.chats.get(0);
                        Long l10 = this.d;
                        if (chat != null && this.f48898f && org.telegram.messenger.v3.R(chat)) {
                            launchActivity.w0(Long.valueOf(-l10.longValue()), null, this.h, null);
                        } else if (chat != null && chat.forum) {
                            Long l11 = this.f48899n;
                            Integer num = this.f48901s;
                            byte[] bArr = this.f48902w;
                            if (l11 != null) {
                                launchActivity.l0(-l10.longValue(), this.f48900r, null, num, bArr, null, 0, -1);
                            } else {
                                launchActivity.l0(-l10.longValue(), null, null, num, bArr, null, 0, -1);
                            }
                        }
                        org.telegram.ui.ActionBar.h2 h2Var = this.f48903x;
                        Bundle bundle = this.f48896c;
                        if (h2Var == null || org.telegram.messenger.mp.u1(this.f48904y).E(bundle, h2Var, null, null)) {
                            ((ActionBarLayout) launchActivity.M()).S(new bn(bundle));
                            return;
                        }
                        return;
                    }
                }
                launchActivity.F0(org.telegram.ui.Components.b5.E(launchActivity, org.telegram.messenger.gd.M0(2131751443, null), org.telegram.messenger.gd.M0(2131748703, null)));
                return;
            default:
                int[] iArr = (int[]) obj;
                String str2 = LaunchActivity.C1;
                LaunchActivity launchActivity2 = this.f48895b;
                org.telegram.ui.ActionBar.s4 M = launchActivity2.M();
                Bundle bundle2 = this.f48896c;
                if (!((ActionBarLayout) M).S(new bn(bundle2))) {
                    TLRPC.TL_channels_getChannels tL_channels_getChannels = new TLRPC.TL_channels_getChannels();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    Long l12 = this.d;
                    tL_inputChannel.channel_id = l12.longValue();
                    tL_channels_getChannels.f28439id.add(tL_inputChannel);
                    iArr[0] = ConnectionsManager.getInstance(launchActivity2.P).sendRequest(tL_channels_getChannels, new org.telegram.messenger.q4(launchActivity2, this.f48897e, this.f48898f, l12, this.h, this.f48899n, this.f48900r, this.f48901s, this.f48902w, this.f48903x, this.f48904y, bundle2));
                    return;
                }
                return;
        }
    }

    public j70(LaunchActivity launchActivity, o60 o60Var, TLObject tLObject, boolean z10, Long l10, vf.b bVar, Long l11, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.h2 h2Var, int i7, Bundle bundle) {
        this.f48895b = launchActivity;
        this.f48897e = o60Var;
        this.E = tLObject;
        this.f48898f = z10;
        this.d = l10;
        this.h = bVar;
        this.f48899n = l11;
        this.f48900r = num;
        this.f48901s = num2;
        this.f48902w = bArr;
        this.f48903x = h2Var;
        this.f48904y = i7;
        this.f48896c = bundle;
    }
}
