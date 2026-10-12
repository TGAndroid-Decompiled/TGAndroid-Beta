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
    public final int f40876a = 1;
    public final LaunchActivity f40877b;
    public final Bundle f40878c;
    public final Long d;
    public final t70 f40879e;
    public final boolean f40880f;
    public final of.e h;
    public final Long f40881n;
    public final Integer f40882r;
    public final Integer f40883s;
    public final byte[] v;
    public final org.telegram.ui.ActionBar.m2 f40884w;
    public final int f40885x;
    public final Object f40886y;

    public p90(LaunchActivity launchActivity, Bundle bundle, Long l4, int[] iArr, t70 t70Var, boolean z10, of.e eVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.m2 m2Var, int i10) {
        this.f40877b = launchActivity;
        this.f40878c = bundle;
        this.d = l4;
        this.f40886y = iArr;
        this.f40879e = t70Var;
        this.f40880f = z10;
        this.h = eVar;
        this.f40881n = l10;
        this.f40882r = num;
        this.f40883s = num2;
        this.v = bArr;
        this.f40884w = m2Var;
        this.f40885x = i10;
    }

    @Override
    public final void run() {
        int i10 = this.f40876a;
        Object obj = this.f40886y;
        switch (i10) {
            case 0:
                t70 t70Var = this.f40879e;
                TLObject tLObject = (TLObject) obj;
                Pattern pattern = LaunchActivity.B1;
                try {
                    t70Var.run();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                boolean z10 = tLObject instanceof TLRPC.TL_messages_chats;
                LaunchActivity launchActivity = this.f40877b;
                if (z10) {
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
                    if (!tL_messages_chats.chats.isEmpty()) {
                        MessagesController.getInstance(launchActivity.O).putChats(tL_messages_chats.chats, false);
                        TLRPC.Chat chat = tL_messages_chats.chats.get(0);
                        Long l4 = this.d;
                        if (chat != null && this.f40880f && ChatObject.isBoostSupported(chat)) {
                            launchActivity.s0(Long.valueOf(-l4.longValue()), null, this.h, null);
                        } else if (chat != null && chat.forum) {
                            Long l10 = this.f40881n;
                            Integer num = this.f40883s;
                            byte[] bArr = this.v;
                            if (l10 != null) {
                                launchActivity.k0(-l4.longValue(), this.f40882r, null, num, bArr, null, 0, -1);
                            } else {
                                launchActivity.k0(-l4.longValue(), null, null, num, bArr, null, 0, -1);
                            }
                        }
                        org.telegram.ui.ActionBar.m2 m2Var = this.f40884w;
                        Bundle bundle = this.f40878c;
                        if (m2Var == null || MessagesController.getInstance(this.f40885x).checkCanOpenChat(bundle, m2Var)) {
                            ((ActionBarLayout) launchActivity.O()).P(new eo(bundle));
                            return;
                        }
                        return;
                    }
                }
                launchActivity.B0(org.telegram.ui.Components.g5.G(launchActivity, LocaleController.getString(R.string.DialogNotAvailable), LocaleController.getString(R.string.LinkNotFound)));
                return;
            default:
                int[] iArr = (int[]) obj;
                Pattern pattern2 = LaunchActivity.B1;
                LaunchActivity launchActivity2 = this.f40877b;
                org.telegram.ui.ActionBar.b5 O = launchActivity2.O();
                Bundle bundle2 = this.f40878c;
                if (!((ActionBarLayout) O).P(new eo(bundle2))) {
                    TLRPC.TL_channels_getChannels tL_channels_getChannels = new TLRPC.TL_channels_getChannels();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    Long l11 = this.d;
                    tL_inputChannel.channel_id = l11.longValue();
                    tL_channels_getChannels.f19838id.add(tL_inputChannel);
                    iArr[0] = ConnectionsManager.getInstance(launchActivity2.O).sendRequest(tL_channels_getChannels, new org.telegram.messenger.l1(launchActivity2, this.f40879e, this.f40880f, l11, this.h, this.f40881n, this.f40882r, this.f40883s, this.v, this.f40884w, this.f40885x, bundle2));
                    return;
                }
                return;
        }
    }

    public p90(LaunchActivity launchActivity, t70 t70Var, TLObject tLObject, boolean z10, Long l4, of.e eVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.m2 m2Var, int i10, Bundle bundle) {
        this.f40877b = launchActivity;
        this.f40879e = t70Var;
        this.f40886y = tLObject;
        this.f40880f = z10;
        this.d = l4;
        this.h = eVar;
        this.f40881n = l10;
        this.f40882r = num;
        this.f40883s = num2;
        this.v = bArr;
        this.f40884w = m2Var;
        this.f40885x = i10;
        this.f40878c = bundle;
    }
}
