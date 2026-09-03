package org.telegram.ui;

import android.os.Bundle;
import java.util.regex.Pattern;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class g90 implements Runnable {
    public final int f34358a = 1;
    public final LaunchActivity f34359b;
    public final Bundle f34360c;
    public final Long d;
    public final w10 e;
    public final boolean f34361f;
    public final ze.c h;
    public final Long f34362n;
    public final Integer f34363r;
    public final Integer f34364s;
    public final byte[] v;
    public final org.telegram.ui.ActionBar.p2 f34365w;
    public final int f34366x;
    public final Object f34367y;

    public g90(LaunchActivity launchActivity, Bundle bundle, Long l10, int[] iArr, w10 w10Var, boolean z4, ze.c cVar, Long l11, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.p2 p2Var, int i10) {
        this.f34359b = launchActivity;
        this.f34360c = bundle;
        this.d = l10;
        this.f34367y = iArr;
        this.e = w10Var;
        this.f34361f = z4;
        this.h = cVar;
        this.f34362n = l11;
        this.f34363r = num;
        this.f34364s = num2;
        this.v = bArr;
        this.f34365w = p2Var;
        this.f34366x = i10;
    }

    @Override
    public final void run() {
        int i10 = this.f34358a;
        Object obj = this.f34367y;
        switch (i10) {
            case 0:
                w10 w10Var = this.e;
                TLObject tLObject = (TLObject) obj;
                Pattern pattern = LaunchActivity.f31586y1;
                try {
                    w10Var.run();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                boolean z4 = tLObject instanceof TLRPC.TL_messages_chats;
                LaunchActivity launchActivity = this.f34359b;
                if (z4) {
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
                    if (!tL_messages_chats.chats.isEmpty()) {
                        MessagesController.getInstance(launchActivity.L).putChats(tL_messages_chats.chats, false);
                        TLRPC.Chat chat = tL_messages_chats.chats.get(0);
                        Long l10 = this.d;
                        if (chat != null && this.f34361f && ChatObject.isBoostSupported(chat)) {
                            launchActivity.s0(Long.valueOf(-l10.longValue()), null, this.h, null);
                        } else if (chat != null && chat.forum) {
                            Long l11 = this.f34362n;
                            Integer num = this.f34364s;
                            byte[] bArr = this.v;
                            if (l11 != null) {
                                launchActivity.k0(-l10.longValue(), this.f34363r, null, num, bArr, null, 0, -1);
                            } else {
                                launchActivity.k0(-l10.longValue(), null, null, num, bArr, null, 0, -1);
                            }
                        }
                        org.telegram.ui.ActionBar.p2 p2Var = this.f34365w;
                        Bundle bundle = this.f34360c;
                        if (p2Var == null || MessagesController.getInstance(this.f34366x).checkCanOpenChat(bundle, p2Var)) {
                            ((ActionBarLayout) launchActivity.O()).P(new zn(bundle));
                            return;
                        }
                        return;
                    }
                }
                launchActivity.B0(org.telegram.ui.Components.z4.H(launchActivity, LocaleController.getString(R.string.DialogNotAvailable), LocaleController.getString(R.string.LinkNotFound)));
                return;
            default:
                int[] iArr = (int[]) obj;
                Pattern pattern2 = LaunchActivity.f31586y1;
                LaunchActivity launchActivity2 = this.f34359b;
                org.telegram.ui.ActionBar.e5 O = launchActivity2.O();
                Bundle bundle2 = this.f34360c;
                if (!((ActionBarLayout) O).P(new zn(bundle2))) {
                    TLRPC.TL_channels_getChannels tL_channels_getChannels = new TLRPC.TL_channels_getChannels();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    Long l12 = this.d;
                    tL_inputChannel.channel_id = l12.longValue();
                    tL_channels_getChannels.f19195id.add(tL_inputChannel);
                    iArr[0] = ConnectionsManager.getInstance(launchActivity2.L).sendRequest(tL_channels_getChannels, new org.telegram.messenger.h1(launchActivity2, this.e, this.f34361f, l12, this.h, this.f34362n, this.f34363r, this.f34364s, this.v, this.f34365w, this.f34366x, bundle2));
                    return;
                }
                return;
        }
    }

    public g90(LaunchActivity launchActivity, w10 w10Var, TLObject tLObject, boolean z4, Long l10, ze.c cVar, Long l11, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.p2 p2Var, int i10, Bundle bundle) {
        this.f34359b = launchActivity;
        this.e = w10Var;
        this.f34367y = tLObject;
        this.f34361f = z4;
        this.d = l10;
        this.h = cVar;
        this.f34362n = l11;
        this.f34363r = num;
        this.f34364s = num2;
        this.v = bArr;
        this.f34365w = p2Var;
        this.f34366x = i10;
        this.f34360c = bundle;
    }
}
