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
public final class n90 implements Runnable {
    public final int f38849a = 1;
    public final LaunchActivity f38850b;
    public final Bundle f38851c;
    public final Long d;
    public final h90 f38852e;
    public final boolean f38853f;
    public final nf.e h;
    public final Long f38854n;
    public final Integer f38855r;
    public final Integer f38856s;
    public final byte[] v;
    public final org.telegram.ui.ActionBar.n2 f38857w;
    public final int f38858x;
    public final Object f38859y;

    public n90(LaunchActivity launchActivity, Bundle bundle, Long l4, int[] iArr, h90 h90Var, boolean z10, nf.e eVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.n2 n2Var, int i10) {
        this.f38850b = launchActivity;
        this.f38851c = bundle;
        this.d = l4;
        this.f38859y = iArr;
        this.f38852e = h90Var;
        this.f38853f = z10;
        this.h = eVar;
        this.f38854n = l10;
        this.f38855r = num;
        this.f38856s = num2;
        this.v = bArr;
        this.f38857w = n2Var;
        this.f38858x = i10;
    }

    @Override
    public final void run() {
        int i10 = this.f38849a;
        Object obj = this.f38859y;
        switch (i10) {
            case 0:
                h90 h90Var = this.f38852e;
                TLObject tLObject = (TLObject) obj;
                Pattern pattern = LaunchActivity.B1;
                try {
                    h90Var.run();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                boolean z10 = tLObject instanceof TLRPC.TL_messages_chats;
                LaunchActivity launchActivity = this.f38850b;
                if (z10) {
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
                    if (!tL_messages_chats.chats.isEmpty()) {
                        MessagesController.getInstance(launchActivity.O).putChats(tL_messages_chats.chats, false);
                        TLRPC.Chat chat = tL_messages_chats.chats.get(0);
                        Long l4 = this.d;
                        if (chat != null && this.f38853f && ChatObject.isBoostSupported(chat)) {
                            launchActivity.s0(Long.valueOf(-l4.longValue()), null, this.h, null);
                        } else if (chat != null && chat.forum) {
                            Long l10 = this.f38854n;
                            Integer num = this.f38856s;
                            byte[] bArr = this.v;
                            if (l10 != null) {
                                launchActivity.k0(-l4.longValue(), this.f38855r, null, num, bArr, null, 0, -1);
                            } else {
                                launchActivity.k0(-l4.longValue(), null, null, num, bArr, null, 0, -1);
                            }
                        }
                        org.telegram.ui.ActionBar.n2 n2Var = this.f38857w;
                        Bundle bundle = this.f38851c;
                        if (n2Var == null || MessagesController.getInstance(this.f38858x).checkCanOpenChat(bundle, n2Var)) {
                            ((ActionBarLayout) launchActivity.O()).P(new yn(bundle));
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
                LaunchActivity launchActivity2 = this.f38850b;
                org.telegram.ui.ActionBar.c5 O = launchActivity2.O();
                Bundle bundle2 = this.f38851c;
                if (!((ActionBarLayout) O).P(new yn(bundle2))) {
                    TLRPC.TL_channels_getChannels tL_channels_getChannels = new TLRPC.TL_channels_getChannels();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    Long l11 = this.d;
                    tL_inputChannel.channel_id = l11.longValue();
                    tL_channels_getChannels.f20074id.add(tL_inputChannel);
                    iArr[0] = ConnectionsManager.getInstance(launchActivity2.O).sendRequest(tL_channels_getChannels, new org.telegram.messenger.i1(launchActivity2, this.f38852e, this.f38853f, l11, this.h, this.f38854n, this.f38855r, this.f38856s, this.v, this.f38857w, this.f38858x, bundle2));
                    return;
                }
                return;
        }
    }

    public n90(LaunchActivity launchActivity, h90 h90Var, TLObject tLObject, boolean z10, Long l4, nf.e eVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.n2 n2Var, int i10, Bundle bundle) {
        this.f38850b = launchActivity;
        this.f38852e = h90Var;
        this.f38859y = tLObject;
        this.f38853f = z10;
        this.d = l4;
        this.h = eVar;
        this.f38854n = l10;
        this.f38855r = num;
        this.f38856s = num2;
        this.v = bArr;
        this.f38857w = n2Var;
        this.f38858x = i10;
        this.f38851c = bundle;
    }
}
