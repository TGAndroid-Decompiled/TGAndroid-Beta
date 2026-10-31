package org.telegram.ui;

import android.os.Bundle;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class i80 implements Runnable {
    public final Object D;
    public final int f38197a = 1;
    public final LaunchActivity f38198b;
    public final Bundle f38199c;
    public final Long d;
    public final f70 e;
    public final boolean f38200f;
    public final gf.e h;
    public final Long f38201n;
    public final Integer f38202r;
    public final Integer f38203s;
    public final byte[] f38204w;
    public final org.telegram.ui.ActionBar.k2 f38205x;
    public final int f38206y;

    public i80(LaunchActivity launchActivity, Bundle bundle, Long l4, int[] iArr, f70 f70Var, boolean z10, gf.e eVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.k2 k2Var, int i10) {
        this.f38198b = launchActivity;
        this.f38199c = bundle;
        this.d = l4;
        this.D = iArr;
        this.e = f70Var;
        this.f38200f = z10;
        this.h = eVar;
        this.f38201n = l10;
        this.f38202r = num;
        this.f38203s = num2;
        this.f38204w = bArr;
        this.f38205x = k2Var;
        this.f38206y = i10;
    }

    @Override
    public final void run() {
        int i10 = this.f38197a;
        Object obj = this.D;
        switch (i10) {
            case 0:
                f70 f70Var = this.e;
                TLObject tLObject = (TLObject) obj;
                Pattern pattern = LaunchActivity.D1;
                try {
                    f70Var.run();
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
                boolean z10 = tLObject instanceof TLRPC.TL_messages_chats;
                LaunchActivity launchActivity = this.f38198b;
                if (z10) {
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
                    if (!tL_messages_chats.chats.isEmpty()) {
                        org.telegram.messenger.vp.r1(launchActivity.O).P3(tL_messages_chats.chats, false);
                        TLRPC.Chat chat = tL_messages_chats.chats.get(0);
                        Long l4 = this.d;
                        if (chat != null && this.f38200f && org.telegram.messenger.w3.R(chat)) {
                            launchActivity.w0(Long.valueOf(-l4.longValue()), null, this.h, null);
                        } else if (chat != null && chat.forum) {
                            Long l10 = this.f38201n;
                            Integer num = this.f38203s;
                            byte[] bArr = this.f38204w;
                            if (l10 != null) {
                                launchActivity.l0(-l4.longValue(), this.f38202r, null, num, bArr, null, 0, -1);
                            } else {
                                launchActivity.l0(-l4.longValue(), null, null, num, bArr, null, 0, -1);
                            }
                        }
                        org.telegram.ui.ActionBar.k2 k2Var = this.f38205x;
                        Bundle bundle = this.f38199c;
                        if (k2Var == null || org.telegram.messenger.vp.r1(this.f38206y).E(bundle, k2Var, null, null)) {
                            ((ActionBarLayout) launchActivity.M()).R(new un(bundle));
                            return;
                        }
                        return;
                    }
                }
                launchActivity.F0(org.telegram.ui.Components.s4.G(launchActivity, org.telegram.messenger.cd.L0(2131751455, null), org.telegram.messenger.cd.L0(2131748905, null)));
                return;
            default:
                int[] iArr = (int[]) obj;
                Pattern pattern2 = LaunchActivity.D1;
                LaunchActivity launchActivity2 = this.f38198b;
                org.telegram.ui.ActionBar.z4 M = launchActivity2.M();
                Bundle bundle2 = this.f38199c;
                if (!((ActionBarLayout) M).R(new un(bundle2))) {
                    TLRPC.TL_channels_getChannels tL_channels_getChannels = new TLRPC.TL_channels_getChannels();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    Long l11 = this.d;
                    tL_inputChannel.channel_id = l11.longValue();
                    tL_channels_getChannels.f19829id.add(tL_inputChannel);
                    iArr[0] = ConnectionsManager.getInstance(launchActivity2.O).sendRequest(tL_channels_getChannels, new org.telegram.messenger.r4(launchActivity2, this.e, this.f38200f, l11, this.h, this.f38201n, this.f38202r, this.f38203s, this.f38204w, this.f38205x, this.f38206y, bundle2));
                    return;
                }
                return;
        }
    }

    public i80(LaunchActivity launchActivity, f70 f70Var, TLObject tLObject, boolean z10, Long l4, gf.e eVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.k2 k2Var, int i10, Bundle bundle) {
        this.f38198b = launchActivity;
        this.e = f70Var;
        this.D = tLObject;
        this.f38200f = z10;
        this.d = l4;
        this.h = eVar;
        this.f38201n = l10;
        this.f38202r = num;
        this.f38203s = num2;
        this.f38204w = bArr;
        this.f38205x = k2Var;
        this.f38206y = i10;
        this.f38199c = bundle;
    }
}
