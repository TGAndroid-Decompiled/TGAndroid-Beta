package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class c70 implements Runnable {
    public final Object E;
    public final int f44252a = 1;
    public final LaunchActivity f44253b;
    public final Bundle f44254c;
    public final Long d;
    public final ly f44255e;
    public final boolean f44256f;
    public final sf.b h;
    public final Long f44257n;
    public final Integer f44258r;
    public final Integer f44259s;
    public final byte[] f44260w;
    public final org.telegram.ui.ActionBar.d2 f44261x;
    public final int f44262y;

    public c70(LaunchActivity launchActivity, Bundle bundle, Long l10, int[] iArr, ly lyVar, boolean z10, sf.b bVar, Long l11, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.d2 d2Var, int i3) {
        this.f44253b = launchActivity;
        this.f44254c = bundle;
        this.d = l10;
        this.E = iArr;
        this.f44255e = lyVar;
        this.f44256f = z10;
        this.h = bVar;
        this.f44257n = l11;
        this.f44258r = num;
        this.f44259s = num2;
        this.f44260w = bArr;
        this.f44261x = d2Var;
        this.f44262y = i3;
    }

    @Override
    public final void run() {
        int i3 = this.f44252a;
        Object obj = this.E;
        switch (i3) {
            case 0:
                ly lyVar = this.f44255e;
                TLObject tLObject = (TLObject) obj;
                String str = LaunchActivity.E1;
                try {
                    lyVar.run();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                boolean z10 = tLObject instanceof TLRPC.TL_messages_chats;
                LaunchActivity launchActivity = this.f44253b;
                if (z10) {
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
                    if (!tL_messages_chats.chats.isEmpty()) {
                        org.telegram.messenger.hp.s1(launchActivity.P).S3(tL_messages_chats.chats, false);
                        TLRPC.Chat chat = tL_messages_chats.chats.get(0);
                        Long l10 = this.d;
                        if (chat != null && this.f44256f && org.telegram.messenger.t3.R(chat)) {
                            launchActivity.w0(Long.valueOf(-l10.longValue()), null, this.h, null);
                        } else if (chat != null && chat.forum) {
                            Long l11 = this.f44257n;
                            Integer num = this.f44259s;
                            byte[] bArr = this.f44260w;
                            if (l11 != null) {
                                launchActivity.l0(-l10.longValue(), this.f44258r, null, num, bArr, null, 0, -1);
                            } else {
                                launchActivity.l0(-l10.longValue(), null, null, num, bArr, null, 0, -1);
                            }
                        }
                        org.telegram.ui.ActionBar.d2 d2Var = this.f44261x;
                        Bundle bundle = this.f44254c;
                        if (d2Var == null || org.telegram.messenger.hp.s1(this.f44262y).E(bundle, d2Var, null, null)) {
                            ((ActionBarLayout) launchActivity.M()).S(new wm(bundle));
                            return;
                        }
                        return;
                    }
                }
                launchActivity.F0(org.telegram.ui.Components.t4.G(launchActivity, org.telegram.messenger.bd.M0(2131751455, null), org.telegram.messenger.bd.M0(2131748903, null)));
                return;
            default:
                int[] iArr = (int[]) obj;
                String str2 = LaunchActivity.E1;
                LaunchActivity launchActivity2 = this.f44253b;
                org.telegram.ui.ActionBar.q4 M = launchActivity2.M();
                Bundle bundle2 = this.f44254c;
                if (!((ActionBarLayout) M).S(new wm(bundle2))) {
                    TLRPC.TL_channels_getChannels tL_channels_getChannels = new TLRPC.TL_channels_getChannels();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    Long l12 = this.d;
                    tL_inputChannel.channel_id = l12.longValue();
                    tL_channels_getChannels.f27037id.add(tL_inputChannel);
                    iArr[0] = ConnectionsManager.getInstance(launchActivity2.P).sendRequest(tL_channels_getChannels, new org.telegram.messenger.o4(launchActivity2, this.f44255e, this.f44256f, l12, this.h, this.f44257n, this.f44258r, this.f44259s, this.f44260w, this.f44261x, this.f44262y, bundle2));
                    return;
                }
                return;
        }
    }

    public c70(LaunchActivity launchActivity, ly lyVar, TLObject tLObject, boolean z10, Long l10, sf.b bVar, Long l11, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.d2 d2Var, int i3, Bundle bundle) {
        this.f44253b = launchActivity;
        this.f44255e = lyVar;
        this.E = tLObject;
        this.f44256f = z10;
        this.d = l10;
        this.h = bVar;
        this.f44257n = l11;
        this.f44258r = num;
        this.f44259s = num2;
        this.f44260w = bArr;
        this.f44261x = d2Var;
        this.f44262y = i3;
        this.f44254c = bundle;
    }
}
