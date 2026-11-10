package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class l70 implements Runnable {
    public final Object D;
    public final int f47529a = 1;
    public final LaunchActivity f47530b;
    public final Bundle f47531c;
    public final Long d;
    public final f10 f47532e;
    public final boolean f47533f;
    public final vf.b h;
    public final Long f47534n;
    public final Integer f47535r;
    public final Integer f47536s;
    public final byte[] f47537w;
    public final org.telegram.ui.ActionBar.f2 f47538x;
    public final int f47539y;

    public l70(LaunchActivity launchActivity, Bundle bundle, Long l10, int[] iArr, f10 f10Var, boolean z9, vf.b bVar, Long l11, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.f2 f2Var, int i7) {
        this.f47530b = launchActivity;
        this.f47531c = bundle;
        this.d = l10;
        this.D = iArr;
        this.f47532e = f10Var;
        this.f47533f = z9;
        this.h = bVar;
        this.f47534n = l11;
        this.f47535r = num;
        this.f47536s = num2;
        this.f47537w = bArr;
        this.f47538x = f2Var;
        this.f47539y = i7;
    }

    @Override
    public final void run() {
        int i7 = this.f47529a;
        Object obj = this.D;
        switch (i7) {
            case 0:
                f10 f10Var = this.f47532e;
                TLObject tLObject = (TLObject) obj;
                String str = LaunchActivity.B1;
                try {
                    f10Var.run();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                boolean z9 = tLObject instanceof TLRPC.TL_messages_chats;
                LaunchActivity launchActivity = this.f47530b;
                if (z9) {
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
                    if (!tL_messages_chats.chats.isEmpty()) {
                        org.telegram.messenger.qp.s1(launchActivity.O).S3(tL_messages_chats.chats, false);
                        TLRPC.Chat chat = tL_messages_chats.chats.get(0);
                        Long l10 = this.d;
                        if (chat != null && this.f47533f && org.telegram.messenger.t3.R(chat)) {
                            launchActivity.w0(Long.valueOf(-l10.longValue()), null, this.h, null);
                        } else if (chat != null && chat.forum) {
                            Long l11 = this.f47534n;
                            Integer num = this.f47536s;
                            byte[] bArr = this.f47537w;
                            if (l11 != null) {
                                launchActivity.l0(-l10.longValue(), this.f47535r, null, num, bArr, null, 0, -1);
                            } else {
                                launchActivity.l0(-l10.longValue(), null, null, num, bArr, null, 0, -1);
                            }
                        }
                        org.telegram.ui.ActionBar.f2 f2Var = this.f47538x;
                        Bundle bundle = this.f47531c;
                        if (f2Var == null || org.telegram.messenger.qp.s1(this.f47539y).E(bundle, f2Var, null, null)) {
                            ((ActionBarLayout) launchActivity.M()).S(new cn(bundle));
                            return;
                        }
                        return;
                    }
                }
                launchActivity.F0(org.telegram.ui.Components.u4.E(launchActivity, org.telegram.messenger.id.M0(2131751454, null), org.telegram.messenger.id.M0(2131748895, null)));
                return;
            default:
                int[] iArr = (int[]) obj;
                String str2 = LaunchActivity.B1;
                LaunchActivity launchActivity2 = this.f47530b;
                org.telegram.ui.ActionBar.r4 M = launchActivity2.M();
                Bundle bundle2 = this.f47531c;
                if (!((ActionBarLayout) M).S(new cn(bundle2))) {
                    TLRPC.TL_channels_getChannels tL_channels_getChannels = new TLRPC.TL_channels_getChannels();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    Long l12 = this.d;
                    tL_inputChannel.channel_id = l12.longValue();
                    tL_channels_getChannels.f26996id.add(tL_inputChannel);
                    iArr[0] = ConnectionsManager.getInstance(launchActivity2.O).sendRequest(tL_channels_getChannels, new org.telegram.messenger.o4(launchActivity2, this.f47532e, this.f47533f, l12, this.h, this.f47534n, this.f47535r, this.f47536s, this.f47537w, this.f47538x, this.f47539y, bundle2));
                    return;
                }
                return;
        }
    }

    public l70(LaunchActivity launchActivity, f10 f10Var, TLObject tLObject, boolean z9, Long l10, vf.b bVar, Long l11, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.f2 f2Var, int i7, Bundle bundle) {
        this.f47530b = launchActivity;
        this.f47532e = f10Var;
        this.D = tLObject;
        this.f47533f = z9;
        this.d = l10;
        this.h = bVar;
        this.f47534n = l11;
        this.f47535r = num;
        this.f47536s = num2;
        this.f47537w = bArr;
        this.f47538x = f2Var;
        this.f47539y = i7;
        this.f47531c = bundle;
    }
}
