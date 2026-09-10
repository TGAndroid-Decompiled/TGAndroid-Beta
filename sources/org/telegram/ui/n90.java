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
    public final int f35156a = 1;
    public final LaunchActivity f35157b;
    public final Bundle f35158c;
    public final Long d;
    public final h90 e;
    public final boolean f35159f;
    public final nf.e h;
    public final Long f35160n;
    public final Integer f35161r;
    public final Integer f35162s;
    public final byte[] v;
    public final org.telegram.ui.ActionBar.p2 f35163w;
    public final int f35164x;
    public final Object f35165y;

    public n90(LaunchActivity launchActivity, Bundle bundle, Long l4, int[] iArr, h90 h90Var, boolean z10, nf.e eVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.p2 p2Var, int i10) {
        this.f35157b = launchActivity;
        this.f35158c = bundle;
        this.d = l4;
        this.f35165y = iArr;
        this.e = h90Var;
        this.f35159f = z10;
        this.h = eVar;
        this.f35160n = l10;
        this.f35161r = num;
        this.f35162s = num2;
        this.v = bArr;
        this.f35163w = p2Var;
        this.f35164x = i10;
    }

    @Override
    public final void run() {
        int i10 = this.f35156a;
        Object obj = this.f35165y;
        switch (i10) {
            case 0:
                h90 h90Var = this.e;
                TLObject tLObject = (TLObject) obj;
                Pattern pattern = LaunchActivity.B1;
                try {
                    h90Var.run();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                boolean z10 = tLObject instanceof TLRPC.TL_messages_chats;
                LaunchActivity launchActivity = this.f35157b;
                if (z10) {
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
                    if (!tL_messages_chats.chats.isEmpty()) {
                        MessagesController.getInstance(launchActivity.O).putChats(tL_messages_chats.chats, false);
                        TLRPC.Chat chat = tL_messages_chats.chats.get(0);
                        Long l4 = this.d;
                        if (chat != null && this.f35159f && ChatObject.isBoostSupported(chat)) {
                            launchActivity.s0(Long.valueOf(-l4.longValue()), null, this.h, null);
                        } else if (chat != null && chat.forum) {
                            Long l10 = this.f35160n;
                            Integer num = this.f35162s;
                            byte[] bArr = this.v;
                            if (l10 != null) {
                                launchActivity.k0(-l4.longValue(), this.f35161r, null, num, bArr, null, 0, -1);
                            } else {
                                launchActivity.k0(-l4.longValue(), null, null, num, bArr, null, 0, -1);
                            }
                        }
                        org.telegram.ui.ActionBar.p2 p2Var = this.f35163w;
                        Bundle bundle = this.f35158c;
                        if (p2Var == null || MessagesController.getInstance(this.f35164x).checkCanOpenChat(bundle, p2Var)) {
                            ((ActionBarLayout) launchActivity.O()).P(new eo(bundle));
                            return;
                        }
                        return;
                    }
                }
                launchActivity.B0(org.telegram.ui.Components.d5.H(launchActivity, LocaleController.getString(R.string.DialogNotAvailable), LocaleController.getString(R.string.LinkNotFound)));
                return;
            default:
                int[] iArr = (int[]) obj;
                Pattern pattern2 = LaunchActivity.B1;
                LaunchActivity launchActivity2 = this.f35157b;
                org.telegram.ui.ActionBar.f5 O = launchActivity2.O();
                Bundle bundle2 = this.f35158c;
                if (!((ActionBarLayout) O).P(new eo(bundle2))) {
                    TLRPC.TL_channels_getChannels tL_channels_getChannels = new TLRPC.TL_channels_getChannels();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    Long l11 = this.d;
                    tL_inputChannel.channel_id = l11.longValue();
                    tL_channels_getChannels.f17231id.add(tL_inputChannel);
                    iArr[0] = ConnectionsManager.getInstance(launchActivity2.O).sendRequest(tL_channels_getChannels, new org.telegram.messenger.j1(launchActivity2, this.e, this.f35159f, l11, this.h, this.f35160n, this.f35161r, this.f35162s, this.v, this.f35163w, this.f35164x, bundle2));
                    return;
                }
                return;
        }
    }

    public n90(LaunchActivity launchActivity, h90 h90Var, TLObject tLObject, boolean z10, Long l4, nf.e eVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.p2 p2Var, int i10, Bundle bundle) {
        this.f35157b = launchActivity;
        this.e = h90Var;
        this.f35165y = tLObject;
        this.f35159f = z10;
        this.d = l4;
        this.h = eVar;
        this.f35160n = l10;
        this.f35161r = num;
        this.f35162s = num2;
        this.v = bArr;
        this.f35163w = p2Var;
        this.f35164x = i10;
        this.f35158c = bundle;
    }
}
