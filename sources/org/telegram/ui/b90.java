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
    public final int f35617a = 1;
    public final LaunchActivity f35618b;
    public final Bundle f35619c;
    public final Long d;
    public final b80 e;
    public final boolean f35620f;
    public final pf.c h;
    public final Long f35621n;
    public final Integer f35622r;
    public final Integer f35623s;
    public final byte[] v;
    public final org.telegram.ui.ActionBar.n2 f35624w;
    public final int f35625x;
    public final Object f35626y;

    public b90(LaunchActivity launchActivity, Bundle bundle, Long l4, int[] iArr, b80 b80Var, boolean z10, pf.c cVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.n2 n2Var, int i10) {
        this.f35618b = launchActivity;
        this.f35619c = bundle;
        this.d = l4;
        this.f35626y = iArr;
        this.e = b80Var;
        this.f35620f = z10;
        this.h = cVar;
        this.f35621n = l10;
        this.f35622r = num;
        this.f35623s = num2;
        this.v = bArr;
        this.f35624w = n2Var;
        this.f35625x = i10;
    }

    @Override
    public final void run() {
        int i10 = this.f35617a;
        Object obj = this.f35626y;
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
                LaunchActivity launchActivity = this.f35618b;
                if (z10) {
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
                    if (!tL_messages_chats.chats.isEmpty()) {
                        MessagesController.getInstance(launchActivity.O).putChats(tL_messages_chats.chats, false);
                        TLRPC.Chat chat = tL_messages_chats.chats.get(0);
                        Long l4 = this.d;
                        if (chat != null && this.f35620f && ChatObject.isBoostSupported(chat)) {
                            launchActivity.w0(Long.valueOf(-l4.longValue()), null, this.h, null);
                        } else if (chat != null && chat.forum) {
                            Long l10 = this.f35621n;
                            Integer num = this.f35623s;
                            byte[] bArr = this.v;
                            if (l10 != null) {
                                launchActivity.l0(-l4.longValue(), this.f35622r, null, num, bArr, null, 0, -1);
                            } else {
                                launchActivity.l0(-l4.longValue(), null, null, num, bArr, null, 0, -1);
                            }
                        }
                        org.telegram.ui.ActionBar.n2 n2Var = this.f35624w;
                        Bundle bundle = this.f35619c;
                        if (n2Var == null || MessagesController.getInstance(this.f35625x).checkCanOpenChat(bundle, n2Var)) {
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
                LaunchActivity launchActivity2 = this.f35618b;
                org.telegram.ui.ActionBar.d5 O = launchActivity2.O();
                Bundle bundle2 = this.f35619c;
                if (!((ActionBarLayout) O).P(new sn(bundle2))) {
                    TLRPC.TL_channels_getChannels tL_channels_getChannels = new TLRPC.TL_channels_getChannels();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    Long l11 = this.d;
                    tL_inputChannel.channel_id = l11.longValue();
                    tL_channels_getChannels.f20315id.add(tL_inputChannel);
                    iArr[0] = ConnectionsManager.getInstance(launchActivity2.O).sendRequest(tL_channels_getChannels, new org.telegram.messenger.k1(launchActivity2, this.e, this.f35620f, l11, this.h, this.f35621n, this.f35622r, this.f35623s, this.v, this.f35624w, this.f35625x, bundle2));
                    return;
                }
                return;
        }
    }

    public b90(LaunchActivity launchActivity, b80 b80Var, TLObject tLObject, boolean z10, Long l4, pf.c cVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.n2 n2Var, int i10, Bundle bundle) {
        this.f35618b = launchActivity;
        this.e = b80Var;
        this.f35626y = tLObject;
        this.f35620f = z10;
        this.d = l4;
        this.h = cVar;
        this.f35621n = l10;
        this.f35622r = num;
        this.f35623s = num2;
        this.v = bArr;
        this.f35624w = n2Var;
        this.f35625x = i10;
        this.f35619c = bundle;
    }
}
