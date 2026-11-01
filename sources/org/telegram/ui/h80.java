package org.telegram.ui;

import android.os.Bundle;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class h80 implements Runnable {
    public final Object D;
    public final int f37750a = 1;
    public final LaunchActivity f37751b;
    public final Bundle f37752c;
    public final Long d;
    public final y60 e;
    public final boolean f37753f;
    public final gf.e h;
    public final Long f37754n;
    public final Integer f37755r;
    public final Integer f37756s;
    public final byte[] f37757w;
    public final org.telegram.ui.ActionBar.k2 f37758x;
    public final int f37759y;

    public h80(LaunchActivity launchActivity, Bundle bundle, Long l4, int[] iArr, y60 y60Var, boolean z10, gf.e eVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.k2 k2Var, int i10) {
        this.f37751b = launchActivity;
        this.f37752c = bundle;
        this.d = l4;
        this.D = iArr;
        this.e = y60Var;
        this.f37753f = z10;
        this.h = eVar;
        this.f37754n = l10;
        this.f37755r = num;
        this.f37756s = num2;
        this.f37757w = bArr;
        this.f37758x = k2Var;
        this.f37759y = i10;
    }

    @Override
    public final void run() {
        int i10 = this.f37750a;
        Object obj = this.D;
        switch (i10) {
            case 0:
                y60 y60Var = this.e;
                TLObject tLObject = (TLObject) obj;
                Pattern pattern = LaunchActivity.D1;
                try {
                    y60Var.run();
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
                boolean z10 = tLObject instanceof TLRPC.TL_messages_chats;
                LaunchActivity launchActivity = this.f37751b;
                if (z10) {
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
                    if (!tL_messages_chats.chats.isEmpty()) {
                        org.telegram.messenger.wp.r1(launchActivity.O).P3(tL_messages_chats.chats, false);
                        TLRPC.Chat chat = tL_messages_chats.chats.get(0);
                        Long l4 = this.d;
                        if (chat != null && this.f37753f && org.telegram.messenger.w3.R(chat)) {
                            launchActivity.w0(Long.valueOf(-l4.longValue()), null, this.h, null);
                        } else if (chat != null && chat.forum) {
                            Long l10 = this.f37754n;
                            Integer num = this.f37756s;
                            byte[] bArr = this.f37757w;
                            if (l10 != null) {
                                launchActivity.l0(-l4.longValue(), this.f37755r, null, num, bArr, null, 0, -1);
                            } else {
                                launchActivity.l0(-l4.longValue(), null, null, num, bArr, null, 0, -1);
                            }
                        }
                        org.telegram.ui.ActionBar.k2 k2Var = this.f37758x;
                        Bundle bundle = this.f37752c;
                        if (k2Var == null || org.telegram.messenger.wp.r1(this.f37759y).E(bundle, k2Var, null, null)) {
                            ((ActionBarLayout) launchActivity.M()).R(new un(bundle));
                            return;
                        }
                        return;
                    }
                }
                launchActivity.F0(org.telegram.ui.Components.s4.G(launchActivity, org.telegram.messenger.dd.L0(2131751455, null), org.telegram.messenger.dd.L0(2131748905, null)));
                return;
            default:
                int[] iArr = (int[]) obj;
                Pattern pattern2 = LaunchActivity.D1;
                LaunchActivity launchActivity2 = this.f37751b;
                org.telegram.ui.ActionBar.z4 M = launchActivity2.M();
                Bundle bundle2 = this.f37752c;
                if (!((ActionBarLayout) M).R(new un(bundle2))) {
                    TLRPC.TL_channels_getChannels tL_channels_getChannels = new TLRPC.TL_channels_getChannels();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    Long l11 = this.d;
                    tL_inputChannel.channel_id = l11.longValue();
                    tL_channels_getChannels.f19830id.add(tL_inputChannel);
                    iArr[0] = ConnectionsManager.getInstance(launchActivity2.O).sendRequest(tL_channels_getChannels, new org.telegram.messenger.r4(launchActivity2, this.e, this.f37753f, l11, this.h, this.f37754n, this.f37755r, this.f37756s, this.f37757w, this.f37758x, this.f37759y, bundle2));
                    return;
                }
                return;
        }
    }

    public h80(LaunchActivity launchActivity, y60 y60Var, TLObject tLObject, boolean z10, Long l4, gf.e eVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.k2 k2Var, int i10, Bundle bundle) {
        this.f37751b = launchActivity;
        this.e = y60Var;
        this.D = tLObject;
        this.f37753f = z10;
        this.d = l4;
        this.h = eVar;
        this.f37754n = l10;
        this.f37755r = num;
        this.f37756s = num2;
        this.f37757w = bArr;
        this.f37758x = k2Var;
        this.f37759y = i10;
        this.f37752c = bundle;
    }
}
