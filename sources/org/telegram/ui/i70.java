package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class i70 implements Runnable {
    public final Object D;
    public final int f46579a = 1;
    public final LaunchActivity f46580b;
    public final Bundle f46581c;
    public final Long d;
    public final q10 f46582e;
    public final boolean f46583f;
    public final vf.b h;
    public final Long f46584n;
    public final Integer f46585r;
    public final Integer f46586s;
    public final byte[] f46587w;
    public final org.telegram.ui.ActionBar.f2 f46588x;
    public final int f46589y;

    public i70(LaunchActivity launchActivity, Bundle bundle, Long l10, int[] iArr, q10 q10Var, boolean z9, vf.b bVar, Long l11, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.f2 f2Var, int i7) {
        this.f46580b = launchActivity;
        this.f46581c = bundle;
        this.d = l10;
        this.D = iArr;
        this.f46582e = q10Var;
        this.f46583f = z9;
        this.h = bVar;
        this.f46584n = l11;
        this.f46585r = num;
        this.f46586s = num2;
        this.f46587w = bArr;
        this.f46588x = f2Var;
        this.f46589y = i7;
    }

    @Override
    public final void run() {
        int i7 = this.f46579a;
        Object obj = this.D;
        switch (i7) {
            case 0:
                q10 q10Var = this.f46582e;
                TLObject tLObject = (TLObject) obj;
                String str = LaunchActivity.B1;
                try {
                    q10Var.run();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                boolean z9 = tLObject instanceof TLRPC.TL_messages_chats;
                LaunchActivity launchActivity = this.f46580b;
                if (z9) {
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
                    if (!tL_messages_chats.chats.isEmpty()) {
                        org.telegram.messenger.qp.s1(launchActivity.O).S3(tL_messages_chats.chats, false);
                        TLRPC.Chat chat = tL_messages_chats.chats.get(0);
                        Long l10 = this.d;
                        if (chat != null && this.f46583f && org.telegram.messenger.t3.R(chat)) {
                            launchActivity.w0(Long.valueOf(-l10.longValue()), null, this.h, null);
                        } else if (chat != null && chat.forum) {
                            Long l11 = this.f46584n;
                            Integer num = this.f46586s;
                            byte[] bArr = this.f46587w;
                            if (l11 != null) {
                                launchActivity.l0(-l10.longValue(), this.f46585r, null, num, bArr, null, 0, -1);
                            } else {
                                launchActivity.l0(-l10.longValue(), null, null, num, bArr, null, 0, -1);
                            }
                        }
                        org.telegram.ui.ActionBar.f2 f2Var = this.f46588x;
                        Bundle bundle = this.f46581c;
                        if (f2Var == null || org.telegram.messenger.qp.s1(this.f46589y).E(bundle, f2Var, null, null)) {
                            ((ActionBarLayout) launchActivity.M()).S(new an(bundle));
                            return;
                        }
                        return;
                    }
                }
                launchActivity.F0(org.telegram.ui.Components.v4.E(launchActivity, org.telegram.messenger.id.M0(2131751455, null), org.telegram.messenger.id.M0(2131748896, null)));
                return;
            default:
                int[] iArr = (int[]) obj;
                String str2 = LaunchActivity.B1;
                LaunchActivity launchActivity2 = this.f46580b;
                org.telegram.ui.ActionBar.q4 M = launchActivity2.M();
                Bundle bundle2 = this.f46581c;
                if (!((ActionBarLayout) M).S(new an(bundle2))) {
                    TLRPC.TL_channels_getChannels tL_channels_getChannels = new TLRPC.TL_channels_getChannels();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    Long l12 = this.d;
                    tL_inputChannel.channel_id = l12.longValue();
                    tL_channels_getChannels.f26992id.add(tL_inputChannel);
                    iArr[0] = ConnectionsManager.getInstance(launchActivity2.O).sendRequest(tL_channels_getChannels, new org.telegram.messenger.o4(launchActivity2, this.f46582e, this.f46583f, l12, this.h, this.f46584n, this.f46585r, this.f46586s, this.f46587w, this.f46588x, this.f46589y, bundle2));
                    return;
                }
                return;
        }
    }

    public i70(LaunchActivity launchActivity, q10 q10Var, TLObject tLObject, boolean z9, Long l10, vf.b bVar, Long l11, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.f2 f2Var, int i7, Bundle bundle) {
        this.f46580b = launchActivity;
        this.f46582e = q10Var;
        this.D = tLObject;
        this.f46583f = z9;
        this.d = l10;
        this.h = bVar;
        this.f46584n = l11;
        this.f46585r = num;
        this.f46586s = num2;
        this.f46587w = bArr;
        this.f46588x = f2Var;
        this.f46589y = i7;
        this.f46581c = bundle;
    }
}
