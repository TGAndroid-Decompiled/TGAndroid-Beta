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
public final class p90 implements Runnable {
    public final int f36564a = 1;
    public final LaunchActivity f36565b;
    public final Bundle f36566c;
    public final Long d;
    public final oa0 e;
    public final boolean f36567f;
    public final nf.e h;
    public final Long f36568n;
    public final Integer f36569r;
    public final Integer f36570s;
    public final byte[] v;
    public final org.telegram.ui.ActionBar.o2 f36571w;
    public final int f36572x;
    public final Object f36573y;

    public p90(LaunchActivity launchActivity, Bundle bundle, Long l4, int[] iArr, oa0 oa0Var, boolean z10, nf.e eVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.o2 o2Var, int i10) {
        this.f36565b = launchActivity;
        this.f36566c = bundle;
        this.d = l4;
        this.f36573y = iArr;
        this.e = oa0Var;
        this.f36567f = z10;
        this.h = eVar;
        this.f36568n = l10;
        this.f36569r = num;
        this.f36570s = num2;
        this.v = bArr;
        this.f36571w = o2Var;
        this.f36572x = i10;
    }

    @Override
    public final void run() {
        int i10 = this.f36564a;
        Object obj = this.f36573y;
        switch (i10) {
            case 0:
                oa0 oa0Var = this.e;
                TLObject tLObject = (TLObject) obj;
                Pattern pattern = LaunchActivity.B1;
                try {
                    oa0Var.run();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                boolean z10 = tLObject instanceof TLRPC.TL_messages_chats;
                LaunchActivity launchActivity = this.f36565b;
                if (z10) {
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
                    if (!tL_messages_chats.chats.isEmpty()) {
                        MessagesController.getInstance(launchActivity.O).putChats(tL_messages_chats.chats, false);
                        TLRPC.Chat chat = tL_messages_chats.chats.get(0);
                        Long l4 = this.d;
                        if (chat != null && this.f36567f && ChatObject.isBoostSupported(chat)) {
                            launchActivity.s0(Long.valueOf(-l4.longValue()), null, this.h, null);
                        } else if (chat != null && chat.forum) {
                            Long l10 = this.f36568n;
                            Integer num = this.f36570s;
                            byte[] bArr = this.v;
                            if (l10 != null) {
                                launchActivity.k0(-l4.longValue(), this.f36569r, null, num, bArr, null, 0, -1);
                            } else {
                                launchActivity.k0(-l4.longValue(), null, null, num, bArr, null, 0, -1);
                            }
                        }
                        org.telegram.ui.ActionBar.o2 o2Var = this.f36571w;
                        Bundle bundle = this.f36566c;
                        if (o2Var == null || MessagesController.getInstance(this.f36572x).checkCanOpenChat(bundle, o2Var)) {
                            ((ActionBarLayout) launchActivity.O()).P(new bo(bundle));
                            return;
                        }
                        return;
                    }
                }
                launchActivity.B0(org.telegram.ui.Components.c5.H(launchActivity, LocaleController.getString(R.string.DialogNotAvailable), LocaleController.getString(R.string.LinkNotFound)));
                return;
            default:
                int[] iArr = (int[]) obj;
                Pattern pattern2 = LaunchActivity.B1;
                LaunchActivity launchActivity2 = this.f36565b;
                org.telegram.ui.ActionBar.e5 O = launchActivity2.O();
                Bundle bundle2 = this.f36566c;
                if (!((ActionBarLayout) O).P(new bo(bundle2))) {
                    TLRPC.TL_channels_getChannels tL_channels_getChannels = new TLRPC.TL_channels_getChannels();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    Long l11 = this.d;
                    tL_inputChannel.channel_id = l11.longValue();
                    tL_channels_getChannels.f18157id.add(tL_inputChannel);
                    iArr[0] = ConnectionsManager.getInstance(launchActivity2.O).sendRequest(tL_channels_getChannels, new org.telegram.messenger.g1(launchActivity2, this.e, this.f36567f, l11, this.h, this.f36568n, this.f36569r, this.f36570s, this.v, this.f36571w, this.f36572x, bundle2));
                    return;
                }
                return;
        }
    }

    public p90(LaunchActivity launchActivity, oa0 oa0Var, TLObject tLObject, boolean z10, Long l4, nf.e eVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.o2 o2Var, int i10, Bundle bundle) {
        this.f36565b = launchActivity;
        this.e = oa0Var;
        this.f36573y = tLObject;
        this.f36567f = z10;
        this.d = l4;
        this.h = eVar;
        this.f36568n = l10;
        this.f36569r = num;
        this.f36570s = num2;
        this.v = bArr;
        this.f36571w = o2Var;
        this.f36572x = i10;
        this.f36566c = bundle;
    }
}
