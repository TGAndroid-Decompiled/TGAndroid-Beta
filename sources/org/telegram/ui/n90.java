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
    public final int f38848a = 1;
    public final LaunchActivity f38849b;
    public final Bundle f38850c;
    public final Long d;
    public final h90 f38851e;
    public final boolean f38852f;
    public final nf.e h;
    public final Long f38853n;
    public final Integer f38854r;
    public final Integer f38855s;
    public final byte[] v;
    public final org.telegram.ui.ActionBar.n2 f38856w;
    public final int f38857x;
    public final Object f38858y;

    public n90(LaunchActivity launchActivity, Bundle bundle, Long l4, int[] iArr, h90 h90Var, boolean z10, nf.e eVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.n2 n2Var, int i10) {
        this.f38849b = launchActivity;
        this.f38850c = bundle;
        this.d = l4;
        this.f38858y = iArr;
        this.f38851e = h90Var;
        this.f38852f = z10;
        this.h = eVar;
        this.f38853n = l10;
        this.f38854r = num;
        this.f38855s = num2;
        this.v = bArr;
        this.f38856w = n2Var;
        this.f38857x = i10;
    }

    @Override
    public final void run() {
        int i10 = this.f38848a;
        Object obj = this.f38858y;
        switch (i10) {
            case 0:
                h90 h90Var = this.f38851e;
                TLObject tLObject = (TLObject) obj;
                Pattern pattern = LaunchActivity.B1;
                try {
                    h90Var.run();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                boolean z10 = tLObject instanceof TLRPC.TL_messages_chats;
                LaunchActivity launchActivity = this.f38849b;
                if (z10) {
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
                    if (!tL_messages_chats.chats.isEmpty()) {
                        MessagesController.getInstance(launchActivity.O).putChats(tL_messages_chats.chats, false);
                        TLRPC.Chat chat = tL_messages_chats.chats.get(0);
                        Long l4 = this.d;
                        if (chat != null && this.f38852f && ChatObject.isBoostSupported(chat)) {
                            launchActivity.s0(Long.valueOf(-l4.longValue()), null, this.h, null);
                        } else if (chat != null && chat.forum) {
                            Long l10 = this.f38853n;
                            Integer num = this.f38855s;
                            byte[] bArr = this.v;
                            if (l10 != null) {
                                launchActivity.k0(-l4.longValue(), this.f38854r, null, num, bArr, null, 0, -1);
                            } else {
                                launchActivity.k0(-l4.longValue(), null, null, num, bArr, null, 0, -1);
                            }
                        }
                        org.telegram.ui.ActionBar.n2 n2Var = this.f38856w;
                        Bundle bundle = this.f38850c;
                        if (n2Var == null || MessagesController.getInstance(this.f38857x).checkCanOpenChat(bundle, n2Var)) {
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
                LaunchActivity launchActivity2 = this.f38849b;
                org.telegram.ui.ActionBar.c5 O = launchActivity2.O();
                Bundle bundle2 = this.f38850c;
                if (!((ActionBarLayout) O).P(new yn(bundle2))) {
                    TLRPC.TL_channels_getChannels tL_channels_getChannels = new TLRPC.TL_channels_getChannels();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    Long l11 = this.d;
                    tL_inputChannel.channel_id = l11.longValue();
                    tL_channels_getChannels.f20073id.add(tL_inputChannel);
                    iArr[0] = ConnectionsManager.getInstance(launchActivity2.O).sendRequest(tL_channels_getChannels, new org.telegram.messenger.i1(launchActivity2, this.f38851e, this.f38852f, l11, this.h, this.f38853n, this.f38854r, this.f38855s, this.v, this.f38856w, this.f38857x, bundle2));
                    return;
                }
                return;
        }
    }

    public n90(LaunchActivity launchActivity, h90 h90Var, TLObject tLObject, boolean z10, Long l4, nf.e eVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.n2 n2Var, int i10, Bundle bundle) {
        this.f38849b = launchActivity;
        this.f38851e = h90Var;
        this.f38858y = tLObject;
        this.f38852f = z10;
        this.d = l4;
        this.h = eVar;
        this.f38853n = l10;
        this.f38854r = num;
        this.f38855s = num2;
        this.v = bArr;
        this.f38856w = n2Var;
        this.f38857x = i10;
        this.f38850c = bundle;
    }
}
