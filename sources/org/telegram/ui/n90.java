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
    public final int f40105a = 1;
    public final LaunchActivity f40106b;
    public final Bundle f40107c;
    public final Long d;
    public final m70 f40108e;
    public final boolean f40109f;
    public final of.e h;
    public final Long f40110n;
    public final Integer f40111r;
    public final Integer f40112s;
    public final byte[] v;
    public final org.telegram.ui.ActionBar.n2 f40113w;
    public final int f40114x;
    public final Object f40115y;

    public n90(LaunchActivity launchActivity, Bundle bundle, Long l4, int[] iArr, m70 m70Var, boolean z10, of.e eVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.n2 n2Var, int i10) {
        this.f40106b = launchActivity;
        this.f40107c = bundle;
        this.d = l4;
        this.f40115y = iArr;
        this.f40108e = m70Var;
        this.f40109f = z10;
        this.h = eVar;
        this.f40110n = l10;
        this.f40111r = num;
        this.f40112s = num2;
        this.v = bArr;
        this.f40113w = n2Var;
        this.f40114x = i10;
    }

    @Override
    public final void run() {
        int i10 = this.f40105a;
        Object obj = this.f40115y;
        switch (i10) {
            case 0:
                m70 m70Var = this.f40108e;
                TLObject tLObject = (TLObject) obj;
                Pattern pattern = LaunchActivity.B1;
                try {
                    m70Var.run();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                boolean z10 = tLObject instanceof TLRPC.TL_messages_chats;
                LaunchActivity launchActivity = this.f40106b;
                if (z10) {
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
                    if (!tL_messages_chats.chats.isEmpty()) {
                        MessagesController.getInstance(launchActivity.O).putChats(tL_messages_chats.chats, false);
                        TLRPC.Chat chat = tL_messages_chats.chats.get(0);
                        Long l4 = this.d;
                        if (chat != null && this.f40109f && ChatObject.isBoostSupported(chat)) {
                            launchActivity.s0(Long.valueOf(-l4.longValue()), null, this.h, null);
                        } else if (chat != null && chat.forum) {
                            Long l10 = this.f40110n;
                            Integer num = this.f40112s;
                            byte[] bArr = this.v;
                            if (l10 != null) {
                                launchActivity.k0(-l4.longValue(), this.f40111r, null, num, bArr, null, 0, -1);
                            } else {
                                launchActivity.k0(-l4.longValue(), null, null, num, bArr, null, 0, -1);
                            }
                        }
                        org.telegram.ui.ActionBar.n2 n2Var = this.f40113w;
                        Bundle bundle = this.f40107c;
                        if (n2Var == null || MessagesController.getInstance(this.f40114x).checkCanOpenChat(bundle, n2Var)) {
                            ((ActionBarLayout) launchActivity.O()).P(new zn(bundle));
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
                LaunchActivity launchActivity2 = this.f40106b;
                org.telegram.ui.ActionBar.d5 O = launchActivity2.O();
                Bundle bundle2 = this.f40107c;
                if (!((ActionBarLayout) O).P(new zn(bundle2))) {
                    TLRPC.TL_channels_getChannels tL_channels_getChannels = new TLRPC.TL_channels_getChannels();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    Long l11 = this.d;
                    tL_inputChannel.channel_id = l11.longValue();
                    tL_channels_getChannels.f20074id.add(tL_inputChannel);
                    iArr[0] = ConnectionsManager.getInstance(launchActivity2.O).sendRequest(tL_channels_getChannels, new org.telegram.messenger.i1(launchActivity2, this.f40108e, this.f40109f, l11, this.h, this.f40110n, this.f40111r, this.f40112s, this.v, this.f40113w, this.f40114x, bundle2));
                    return;
                }
                return;
        }
    }

    public n90(LaunchActivity launchActivity, m70 m70Var, TLObject tLObject, boolean z10, Long l4, of.e eVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.n2 n2Var, int i10, Bundle bundle) {
        this.f40106b = launchActivity;
        this.f40108e = m70Var;
        this.f40115y = tLObject;
        this.f40109f = z10;
        this.d = l4;
        this.h = eVar;
        this.f40110n = l10;
        this.f40111r = num;
        this.f40112s = num2;
        this.v = bArr;
        this.f40113w = n2Var;
        this.f40114x = i10;
        this.f40107c = bundle;
    }
}
