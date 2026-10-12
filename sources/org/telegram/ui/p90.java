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
    public final int f40878a = 1;
    public final LaunchActivity f40879b;
    public final Bundle f40880c;
    public final Long d;
    public final q70 f40881e;
    public final boolean f40882f;
    public final of.e h;
    public final Long f40883n;
    public final Integer f40884r;
    public final Integer f40885s;
    public final byte[] v;
    public final org.telegram.ui.ActionBar.m2 f40886w;
    public final int f40887x;
    public final Object f40888y;

    public p90(LaunchActivity launchActivity, Bundle bundle, Long l4, int[] iArr, q70 q70Var, boolean z10, of.e eVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.m2 m2Var, int i10) {
        this.f40879b = launchActivity;
        this.f40880c = bundle;
        this.d = l4;
        this.f40888y = iArr;
        this.f40881e = q70Var;
        this.f40882f = z10;
        this.h = eVar;
        this.f40883n = l10;
        this.f40884r = num;
        this.f40885s = num2;
        this.v = bArr;
        this.f40886w = m2Var;
        this.f40887x = i10;
    }

    @Override
    public final void run() {
        int i10 = this.f40878a;
        Object obj = this.f40888y;
        switch (i10) {
            case 0:
                q70 q70Var = this.f40881e;
                TLObject tLObject = (TLObject) obj;
                Pattern pattern = LaunchActivity.B1;
                try {
                    q70Var.run();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                boolean z10 = tLObject instanceof TLRPC.TL_messages_chats;
                LaunchActivity launchActivity = this.f40879b;
                if (z10) {
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
                    if (!tL_messages_chats.chats.isEmpty()) {
                        MessagesController.getInstance(launchActivity.O).putChats(tL_messages_chats.chats, false);
                        TLRPC.Chat chat = tL_messages_chats.chats.get(0);
                        Long l4 = this.d;
                        if (chat != null && this.f40882f && ChatObject.isBoostSupported(chat)) {
                            launchActivity.s0(Long.valueOf(-l4.longValue()), null, this.h, null);
                        } else if (chat != null && chat.forum) {
                            Long l10 = this.f40883n;
                            Integer num = this.f40885s;
                            byte[] bArr = this.v;
                            if (l10 != null) {
                                launchActivity.k0(-l4.longValue(), this.f40884r, null, num, bArr, null, 0, -1);
                            } else {
                                launchActivity.k0(-l4.longValue(), null, null, num, bArr, null, 0, -1);
                            }
                        }
                        org.telegram.ui.ActionBar.m2 m2Var = this.f40886w;
                        Bundle bundle = this.f40880c;
                        if (m2Var == null || MessagesController.getInstance(this.f40887x).checkCanOpenChat(bundle, m2Var)) {
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
                LaunchActivity launchActivity2 = this.f40879b;
                org.telegram.ui.ActionBar.b5 O = launchActivity2.O();
                Bundle bundle2 = this.f40880c;
                if (!((ActionBarLayout) O).P(new eo(bundle2))) {
                    TLRPC.TL_channels_getChannels tL_channels_getChannels = new TLRPC.TL_channels_getChannels();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    Long l11 = this.d;
                    tL_inputChannel.channel_id = l11.longValue();
                    tL_channels_getChannels.f19839id.add(tL_inputChannel);
                    iArr[0] = ConnectionsManager.getInstance(launchActivity2.O).sendRequest(tL_channels_getChannels, new org.telegram.messenger.l1(launchActivity2, this.f40881e, this.f40882f, l11, this.h, this.f40883n, this.f40884r, this.f40885s, this.v, this.f40886w, this.f40887x, bundle2));
                    return;
                }
                return;
        }
    }

    public p90(LaunchActivity launchActivity, q70 q70Var, TLObject tLObject, boolean z10, Long l4, of.e eVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.m2 m2Var, int i10, Bundle bundle) {
        this.f40879b = launchActivity;
        this.f40881e = q70Var;
        this.f40888y = tLObject;
        this.f40882f = z10;
        this.d = l4;
        this.h = eVar;
        this.f40883n = l10;
        this.f40884r = num;
        this.f40885s = num2;
        this.v = bArr;
        this.f40886w = m2Var;
        this.f40887x = i10;
        this.f40880c = bundle;
    }
}
