package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class i70 implements Runnable {
    public final Object E;
    public final int f48594a = 1;
    public final LaunchActivity f48595b;
    public final Bundle f48596c;
    public final Long d;
    public final n60 f48597e;
    public final boolean f48598f;
    public final vf.b h;
    public final Long f48599n;
    public final Integer f48600r;
    public final Integer f48601s;
    public final byte[] f48602w;
    public final org.telegram.ui.ActionBar.h2 f48603x;
    public final int f48604y;

    public i70(LaunchActivity launchActivity, Bundle bundle, Long l10, int[] iArr, n60 n60Var, boolean z10, vf.b bVar, Long l11, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.h2 h2Var, int i7) {
        this.f48595b = launchActivity;
        this.f48596c = bundle;
        this.d = l10;
        this.E = iArr;
        this.f48597e = n60Var;
        this.f48598f = z10;
        this.h = bVar;
        this.f48599n = l11;
        this.f48600r = num;
        this.f48601s = num2;
        this.f48602w = bArr;
        this.f48603x = h2Var;
        this.f48604y = i7;
    }

    @Override
    public final void run() {
        int i7 = this.f48594a;
        Object obj = this.E;
        switch (i7) {
            case 0:
                n60 n60Var = this.f48597e;
                TLObject tLObject = (TLObject) obj;
                String str = LaunchActivity.C1;
                try {
                    n60Var.run();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                boolean z10 = tLObject instanceof TLRPC.TL_messages_chats;
                LaunchActivity launchActivity = this.f48595b;
                if (z10) {
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
                    if (!tL_messages_chats.chats.isEmpty()) {
                        org.telegram.messenger.mp.u1(launchActivity.P).Z3(tL_messages_chats.chats, false);
                        TLRPC.Chat chat = tL_messages_chats.chats.get(0);
                        Long l10 = this.d;
                        if (chat != null && this.f48598f && org.telegram.messenger.v3.R(chat)) {
                            launchActivity.w0(Long.valueOf(-l10.longValue()), null, this.h, null);
                        } else if (chat != null && chat.forum) {
                            Long l11 = this.f48599n;
                            Integer num = this.f48601s;
                            byte[] bArr = this.f48602w;
                            if (l11 != null) {
                                launchActivity.l0(-l10.longValue(), this.f48600r, null, num, bArr, null, 0, -1);
                            } else {
                                launchActivity.l0(-l10.longValue(), null, null, num, bArr, null, 0, -1);
                            }
                        }
                        org.telegram.ui.ActionBar.h2 h2Var = this.f48603x;
                        Bundle bundle = this.f48596c;
                        if (h2Var == null || org.telegram.messenger.mp.u1(this.f48604y).E(bundle, h2Var, null, null)) {
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
                LaunchActivity launchActivity2 = this.f48595b;
                org.telegram.ui.ActionBar.s4 M = launchActivity2.M();
                Bundle bundle2 = this.f48596c;
                if (!((ActionBarLayout) M).S(new bn(bundle2))) {
                    TLRPC.TL_channels_getChannels tL_channels_getChannels = new TLRPC.TL_channels_getChannels();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    Long l12 = this.d;
                    tL_inputChannel.channel_id = l12.longValue();
                    tL_channels_getChannels.f28441id.add(tL_inputChannel);
                    iArr[0] = ConnectionsManager.getInstance(launchActivity2.P).sendRequest(tL_channels_getChannels, new org.telegram.messenger.q4(launchActivity2, this.f48597e, this.f48598f, l12, this.h, this.f48599n, this.f48600r, this.f48601s, this.f48602w, this.f48603x, this.f48604y, bundle2));
                    return;
                }
                return;
        }
    }

    public i70(LaunchActivity launchActivity, n60 n60Var, TLObject tLObject, boolean z10, Long l10, vf.b bVar, Long l11, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.h2 h2Var, int i7, Bundle bundle) {
        this.f48595b = launchActivity;
        this.f48597e = n60Var;
        this.E = tLObject;
        this.f48598f = z10;
        this.d = l10;
        this.h = bVar;
        this.f48599n = l11;
        this.f48600r = num;
        this.f48601s = num2;
        this.f48602w = bArr;
        this.f48603x = h2Var;
        this.f48604y = i7;
        this.f48596c = bundle;
    }
}
