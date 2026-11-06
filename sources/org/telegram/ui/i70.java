package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class i70 implements Runnable {
    public final Object D;
    public final int f46581a = 1;
    public final LaunchActivity f46582b;
    public final Bundle f46583c;
    public final Long d;
    public final q10 f46584e;
    public final boolean f46585f;
    public final vf.b h;
    public final Long f46586n;
    public final Integer f46587r;
    public final Integer f46588s;
    public final byte[] f46589w;
    public final org.telegram.ui.ActionBar.f2 f46590x;
    public final int f46591y;

    public i70(LaunchActivity launchActivity, Bundle bundle, Long l10, int[] iArr, q10 q10Var, boolean z9, vf.b bVar, Long l11, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.f2 f2Var, int i7) {
        this.f46582b = launchActivity;
        this.f46583c = bundle;
        this.d = l10;
        this.D = iArr;
        this.f46584e = q10Var;
        this.f46585f = z9;
        this.h = bVar;
        this.f46586n = l11;
        this.f46587r = num;
        this.f46588s = num2;
        this.f46589w = bArr;
        this.f46590x = f2Var;
        this.f46591y = i7;
    }

    @Override
    public final void run() {
        int i7 = this.f46581a;
        Object obj = this.D;
        switch (i7) {
            case 0:
                q10 q10Var = this.f46584e;
                TLObject tLObject = (TLObject) obj;
                String str = LaunchActivity.B1;
                try {
                    q10Var.run();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                boolean z9 = tLObject instanceof TLRPC.TL_messages_chats;
                LaunchActivity launchActivity = this.f46582b;
                if (z9) {
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
                    if (!tL_messages_chats.chats.isEmpty()) {
                        org.telegram.messenger.qp.s1(launchActivity.O).S3(tL_messages_chats.chats, false);
                        TLRPC.Chat chat = tL_messages_chats.chats.get(0);
                        Long l10 = this.d;
                        if (chat != null && this.f46585f && org.telegram.messenger.t3.R(chat)) {
                            launchActivity.w0(Long.valueOf(-l10.longValue()), null, this.h, null);
                        } else if (chat != null && chat.forum) {
                            Long l11 = this.f46586n;
                            Integer num = this.f46588s;
                            byte[] bArr = this.f46589w;
                            if (l11 != null) {
                                launchActivity.l0(-l10.longValue(), this.f46587r, null, num, bArr, null, 0, -1);
                            } else {
                                launchActivity.l0(-l10.longValue(), null, null, num, bArr, null, 0, -1);
                            }
                        }
                        org.telegram.ui.ActionBar.f2 f2Var = this.f46590x;
                        Bundle bundle = this.f46583c;
                        if (f2Var == null || org.telegram.messenger.qp.s1(this.f46591y).E(bundle, f2Var, null, null)) {
                            ((ActionBarLayout) launchActivity.M()).S(new an(bundle));
                            return;
                        }
                        return;
                    }
                }
                launchActivity.F0(org.telegram.ui.Components.v4.E(launchActivity, org.telegram.messenger.hd.M0(2131751455, null), org.telegram.messenger.hd.M0(2131748894, null)));
                return;
            default:
                int[] iArr = (int[]) obj;
                String str2 = LaunchActivity.B1;
                LaunchActivity launchActivity2 = this.f46582b;
                org.telegram.ui.ActionBar.q4 M = launchActivity2.M();
                Bundle bundle2 = this.f46583c;
                if (!((ActionBarLayout) M).S(new an(bundle2))) {
                    TLRPC.TL_channels_getChannels tL_channels_getChannels = new TLRPC.TL_channels_getChannels();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    Long l12 = this.d;
                    tL_inputChannel.channel_id = l12.longValue();
                    tL_channels_getChannels.f26988id.add(tL_inputChannel);
                    iArr[0] = ConnectionsManager.getInstance(launchActivity2.O).sendRequest(tL_channels_getChannels, new org.telegram.messenger.o4(launchActivity2, this.f46584e, this.f46585f, l12, this.h, this.f46586n, this.f46587r, this.f46588s, this.f46589w, this.f46590x, this.f46591y, bundle2));
                    return;
                }
                return;
        }
    }

    public i70(LaunchActivity launchActivity, q10 q10Var, TLObject tLObject, boolean z9, Long l10, vf.b bVar, Long l11, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.f2 f2Var, int i7, Bundle bundle) {
        this.f46582b = launchActivity;
        this.f46584e = q10Var;
        this.D = tLObject;
        this.f46585f = z9;
        this.d = l10;
        this.h = bVar;
        this.f46586n = l11;
        this.f46587r = num;
        this.f46588s = num2;
        this.f46589w = bArr;
        this.f46590x = f2Var;
        this.f46591y = i7;
        this.f46583c = bundle;
    }
}
