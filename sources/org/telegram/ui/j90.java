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
public final class j90 implements Runnable {
    public final int f34782a = 1;
    public final LaunchActivity f34783b;
    public final Bundle f34784c;
    public final Long d;
    public final n80 e;
    public final boolean f34785f;
    public final nf.e h;
    public final Long f34786n;
    public final Integer f34787r;
    public final Integer f34788s;
    public final byte[] v;
    public final org.telegram.ui.ActionBar.m2 f34789w;
    public final int f34790x;
    public final Object f34791y;

    public j90(LaunchActivity launchActivity, Bundle bundle, Long l4, int[] iArr, n80 n80Var, boolean z10, nf.e eVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.m2 m2Var, int i10) {
        this.f34783b = launchActivity;
        this.f34784c = bundle;
        this.d = l4;
        this.f34791y = iArr;
        this.e = n80Var;
        this.f34785f = z10;
        this.h = eVar;
        this.f34786n = l10;
        this.f34787r = num;
        this.f34788s = num2;
        this.v = bArr;
        this.f34789w = m2Var;
        this.f34790x = i10;
    }

    @Override
    public final void run() {
        int i10 = this.f34782a;
        Object obj = this.f34791y;
        switch (i10) {
            case 0:
                n80 n80Var = this.e;
                TLObject tLObject = (TLObject) obj;
                Pattern pattern = LaunchActivity.B1;
                try {
                    n80Var.run();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                boolean z10 = tLObject instanceof TLRPC.TL_messages_chats;
                LaunchActivity launchActivity = this.f34783b;
                if (z10) {
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
                    if (!tL_messages_chats.chats.isEmpty()) {
                        MessagesController.getInstance(launchActivity.O).putChats(tL_messages_chats.chats, false);
                        TLRPC.Chat chat = tL_messages_chats.chats.get(0);
                        Long l4 = this.d;
                        if (chat != null && this.f34785f && ChatObject.isBoostSupported(chat)) {
                            launchActivity.s0(Long.valueOf(-l4.longValue()), null, this.h, null);
                        } else if (chat != null && chat.forum) {
                            Long l10 = this.f34786n;
                            Integer num = this.f34788s;
                            byte[] bArr = this.v;
                            if (l10 != null) {
                                launchActivity.k0(-l4.longValue(), this.f34787r, null, num, bArr, null, 0, -1);
                            } else {
                                launchActivity.k0(-l4.longValue(), null, null, num, bArr, null, 0, -1);
                            }
                        }
                        org.telegram.ui.ActionBar.m2 m2Var = this.f34789w;
                        Bundle bundle = this.f34784c;
                        if (m2Var == null || MessagesController.getInstance(this.f34790x).checkCanOpenChat(bundle, m2Var)) {
                            ((ActionBarLayout) launchActivity.O()).P(new wn(bundle));
                            return;
                        }
                        return;
                    }
                }
                launchActivity.B0(org.telegram.ui.Components.e5.H(launchActivity, LocaleController.getString(R.string.DialogNotAvailable), LocaleController.getString(R.string.LinkNotFound)));
                return;
            default:
                int[] iArr = (int[]) obj;
                Pattern pattern2 = LaunchActivity.B1;
                LaunchActivity launchActivity2 = this.f34783b;
                org.telegram.ui.ActionBar.b5 O = launchActivity2.O();
                Bundle bundle2 = this.f34784c;
                if (!((ActionBarLayout) O).P(new wn(bundle2))) {
                    TLRPC.TL_channels_getChannels tL_channels_getChannels = new TLRPC.TL_channels_getChannels();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    Long l11 = this.d;
                    tL_inputChannel.channel_id = l11.longValue();
                    tL_channels_getChannels.f18388id.add(tL_inputChannel);
                    iArr[0] = ConnectionsManager.getInstance(launchActivity2.O).sendRequest(tL_channels_getChannels, new org.telegram.messenger.i1(launchActivity2, this.e, this.f34785f, l11, this.h, this.f34786n, this.f34787r, this.f34788s, this.v, this.f34789w, this.f34790x, bundle2));
                    return;
                }
                return;
        }
    }

    public j90(LaunchActivity launchActivity, n80 n80Var, TLObject tLObject, boolean z10, Long l4, nf.e eVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.m2 m2Var, int i10, Bundle bundle) {
        this.f34783b = launchActivity;
        this.e = n80Var;
        this.f34791y = tLObject;
        this.f34785f = z10;
        this.d = l4;
        this.h = eVar;
        this.f34786n = l10;
        this.f34787r = num;
        this.f34788s = num2;
        this.v = bArr;
        this.f34789w = m2Var;
        this.f34790x = i10;
        this.f34784c = bundle;
    }
}
