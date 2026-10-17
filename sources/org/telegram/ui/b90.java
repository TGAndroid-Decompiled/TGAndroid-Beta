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
public final class b90 implements Runnable {
    public final int f35594a = 1;
    public final LaunchActivity f35595b;
    public final Bundle f35596c;
    public final Long d;
    public final b80 e;
    public final boolean f35597f;
    public final pf.c h;
    public final Long f35598n;
    public final Integer f35599r;
    public final Integer f35600s;
    public final byte[] v;
    public final org.telegram.ui.ActionBar.n2 f35601w;
    public final int f35602x;
    public final Object f35603y;

    public b90(LaunchActivity launchActivity, Bundle bundle, Long l4, int[] iArr, b80 b80Var, boolean z10, pf.c cVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.n2 n2Var, int i10) {
        this.f35595b = launchActivity;
        this.f35596c = bundle;
        this.d = l4;
        this.f35603y = iArr;
        this.e = b80Var;
        this.f35597f = z10;
        this.h = cVar;
        this.f35598n = l10;
        this.f35599r = num;
        this.f35600s = num2;
        this.v = bArr;
        this.f35601w = n2Var;
        this.f35602x = i10;
    }

    @Override
    public final void run() {
        int i10 = this.f35594a;
        Object obj = this.f35603y;
        switch (i10) {
            case 0:
                b80 b80Var = this.e;
                TLObject tLObject = (TLObject) obj;
                Pattern pattern = LaunchActivity.C1;
                try {
                    b80Var.run();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                boolean z10 = tLObject instanceof TLRPC.TL_messages_chats;
                LaunchActivity launchActivity = this.f35595b;
                if (z10) {
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
                    if (!tL_messages_chats.chats.isEmpty()) {
                        MessagesController.getInstance(launchActivity.O).putChats(tL_messages_chats.chats, false);
                        TLRPC.Chat chat = tL_messages_chats.chats.get(0);
                        Long l4 = this.d;
                        if (chat != null && this.f35597f && ChatObject.isBoostSupported(chat)) {
                            launchActivity.w0(Long.valueOf(-l4.longValue()), null, this.h, null);
                        } else if (chat != null && chat.forum) {
                            Long l10 = this.f35598n;
                            Integer num = this.f35600s;
                            byte[] bArr = this.v;
                            if (l10 != null) {
                                launchActivity.l0(-l4.longValue(), this.f35599r, null, num, bArr, null, 0, -1);
                            } else {
                                launchActivity.l0(-l4.longValue(), null, null, num, bArr, null, 0, -1);
                            }
                        }
                        org.telegram.ui.ActionBar.n2 n2Var = this.f35601w;
                        Bundle bundle = this.f35596c;
                        if (n2Var == null || MessagesController.getInstance(this.f35602x).checkCanOpenChat(bundle, n2Var)) {
                            ((ActionBarLayout) launchActivity.O()).P(new sn(bundle));
                            return;
                        }
                        return;
                    }
                }
                launchActivity.F0(org.telegram.ui.Components.f5.G(launchActivity, LocaleController.getString(R.string.DialogNotAvailable), LocaleController.getString(R.string.LinkNotFound)));
                return;
            default:
                int[] iArr = (int[]) obj;
                Pattern pattern2 = LaunchActivity.C1;
                LaunchActivity launchActivity2 = this.f35595b;
                org.telegram.ui.ActionBar.d5 O = launchActivity2.O();
                Bundle bundle2 = this.f35596c;
                if (!((ActionBarLayout) O).P(new sn(bundle2))) {
                    TLRPC.TL_channels_getChannels tL_channels_getChannels = new TLRPC.TL_channels_getChannels();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    Long l11 = this.d;
                    tL_inputChannel.channel_id = l11.longValue();
                    tL_channels_getChannels.f20308id.add(tL_inputChannel);
                    iArr[0] = ConnectionsManager.getInstance(launchActivity2.O).sendRequest(tL_channels_getChannels, new org.telegram.messenger.k1(launchActivity2, this.e, this.f35597f, l11, this.h, this.f35598n, this.f35599r, this.f35600s, this.v, this.f35601w, this.f35602x, bundle2));
                    return;
                }
                return;
        }
    }

    public b90(LaunchActivity launchActivity, b80 b80Var, TLObject tLObject, boolean z10, Long l4, pf.c cVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.n2 n2Var, int i10, Bundle bundle) {
        this.f35595b = launchActivity;
        this.e = b80Var;
        this.f35603y = tLObject;
        this.f35597f = z10;
        this.d = l4;
        this.h = cVar;
        this.f35598n = l10;
        this.f35599r = num;
        this.f35600s = num2;
        this.v = bArr;
        this.f35601w = n2Var;
        this.f35602x = i10;
        this.f35596c = bundle;
    }
}
