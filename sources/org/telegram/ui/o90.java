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
public final class o90 implements Runnable {
    public final int f36131a = 1;
    public final LaunchActivity f36132b;
    public final Bundle f36133c;
    public final Long d;
    public final y80 e;
    public final boolean f36134f;
    public final nf.e h;
    public final Long f36135n;
    public final Integer f36136r;
    public final Integer f36137s;
    public final byte[] v;
    public final org.telegram.ui.ActionBar.n2 f36138w;
    public final int f36139x;
    public final Object f36140y;

    public o90(LaunchActivity launchActivity, Bundle bundle, Long l4, int[] iArr, y80 y80Var, boolean z10, nf.e eVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.n2 n2Var, int i10) {
        this.f36132b = launchActivity;
        this.f36133c = bundle;
        this.d = l4;
        this.f36140y = iArr;
        this.e = y80Var;
        this.f36134f = z10;
        this.h = eVar;
        this.f36135n = l10;
        this.f36136r = num;
        this.f36137s = num2;
        this.v = bArr;
        this.f36138w = n2Var;
        this.f36139x = i10;
    }

    @Override
    public final void run() {
        int i10 = this.f36131a;
        Object obj = this.f36140y;
        switch (i10) {
            case 0:
                y80 y80Var = this.e;
                TLObject tLObject = (TLObject) obj;
                Pattern pattern = LaunchActivity.B1;
                try {
                    y80Var.run();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                boolean z10 = tLObject instanceof TLRPC.TL_messages_chats;
                LaunchActivity launchActivity = this.f36132b;
                if (z10) {
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
                    if (!tL_messages_chats.chats.isEmpty()) {
                        MessagesController.getInstance(launchActivity.O).putChats(tL_messages_chats.chats, false);
                        TLRPC.Chat chat = tL_messages_chats.chats.get(0);
                        Long l4 = this.d;
                        if (chat != null && this.f36134f && ChatObject.isBoostSupported(chat)) {
                            launchActivity.s0(Long.valueOf(-l4.longValue()), null, this.h, null);
                        } else if (chat != null && chat.forum) {
                            Long l10 = this.f36135n;
                            Integer num = this.f36137s;
                            byte[] bArr = this.v;
                            if (l10 != null) {
                                launchActivity.k0(-l4.longValue(), this.f36136r, null, num, bArr, null, 0, -1);
                            } else {
                                launchActivity.k0(-l4.longValue(), null, null, num, bArr, null, 0, -1);
                            }
                        }
                        org.telegram.ui.ActionBar.n2 n2Var = this.f36138w;
                        Bundle bundle = this.f36133c;
                        if (n2Var == null || MessagesController.getInstance(this.f36139x).checkCanOpenChat(bundle, n2Var)) {
                            ((ActionBarLayout) launchActivity.O()).P(new zn(bundle));
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
                LaunchActivity launchActivity2 = this.f36132b;
                org.telegram.ui.ActionBar.d5 O = launchActivity2.O();
                Bundle bundle2 = this.f36133c;
                if (!((ActionBarLayout) O).P(new zn(bundle2))) {
                    TLRPC.TL_channels_getChannels tL_channels_getChannels = new TLRPC.TL_channels_getChannels();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    Long l11 = this.d;
                    tL_inputChannel.channel_id = l11.longValue();
                    tL_channels_getChannels.f18332id.add(tL_inputChannel);
                    iArr[0] = ConnectionsManager.getInstance(launchActivity2.O).sendRequest(tL_channels_getChannels, new org.telegram.messenger.h1(launchActivity2, this.e, this.f36134f, l11, this.h, this.f36135n, this.f36136r, this.f36137s, this.v, this.f36138w, this.f36139x, bundle2));
                    return;
                }
                return;
        }
    }

    public o90(LaunchActivity launchActivity, y80 y80Var, TLObject tLObject, boolean z10, Long l4, nf.e eVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.n2 n2Var, int i10, Bundle bundle) {
        this.f36132b = launchActivity;
        this.e = y80Var;
        this.f36140y = tLObject;
        this.f36134f = z10;
        this.d = l4;
        this.h = eVar;
        this.f36135n = l10;
        this.f36136r = num;
        this.f36137s = num2;
        this.v = bArr;
        this.f36138w = n2Var;
        this.f36139x = i10;
        this.f36133c = bundle;
    }
}
