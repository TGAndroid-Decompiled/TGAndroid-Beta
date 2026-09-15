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
    public final int f35909a = 1;
    public final LaunchActivity f35910b;
    public final Bundle f35911c;
    public final Long d;
    public final ma0 e;
    public final boolean f35912f;
    public final nf.e h;
    public final Long f35913n;
    public final Integer f35914r;
    public final Integer f35915s;
    public final byte[] v;
    public final org.telegram.ui.ActionBar.n2 f35916w;
    public final int f35917x;
    public final Object f35918y;

    public n90(LaunchActivity launchActivity, Bundle bundle, Long l4, int[] iArr, ma0 ma0Var, boolean z10, nf.e eVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.n2 n2Var, int i10) {
        this.f35910b = launchActivity;
        this.f35911c = bundle;
        this.d = l4;
        this.f35918y = iArr;
        this.e = ma0Var;
        this.f35912f = z10;
        this.h = eVar;
        this.f35913n = l10;
        this.f35914r = num;
        this.f35915s = num2;
        this.v = bArr;
        this.f35916w = n2Var;
        this.f35917x = i10;
    }

    @Override
    public final void run() {
        int i10 = this.f35909a;
        Object obj = this.f35918y;
        switch (i10) {
            case 0:
                ma0 ma0Var = this.e;
                TLObject tLObject = (TLObject) obj;
                Pattern pattern = LaunchActivity.B1;
                try {
                    ma0Var.run();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                boolean z10 = tLObject instanceof TLRPC.TL_messages_chats;
                LaunchActivity launchActivity = this.f35910b;
                if (z10) {
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
                    if (!tL_messages_chats.chats.isEmpty()) {
                        MessagesController.getInstance(launchActivity.O).putChats(tL_messages_chats.chats, false);
                        TLRPC.Chat chat = tL_messages_chats.chats.get(0);
                        Long l4 = this.d;
                        if (chat != null && this.f35912f && ChatObject.isBoostSupported(chat)) {
                            launchActivity.s0(Long.valueOf(-l4.longValue()), null, this.h, null);
                        } else if (chat != null && chat.forum) {
                            Long l10 = this.f35913n;
                            Integer num = this.f35915s;
                            byte[] bArr = this.v;
                            if (l10 != null) {
                                launchActivity.k0(-l4.longValue(), this.f35914r, null, num, bArr, null, 0, -1);
                            } else {
                                launchActivity.k0(-l4.longValue(), null, null, num, bArr, null, 0, -1);
                            }
                        }
                        org.telegram.ui.ActionBar.n2 n2Var = this.f35916w;
                        Bundle bundle = this.f35911c;
                        if (n2Var == null || MessagesController.getInstance(this.f35917x).checkCanOpenChat(bundle, n2Var)) {
                            ((ActionBarLayout) launchActivity.O()).P(new bo(bundle));
                            return;
                        }
                        return;
                    }
                }
                launchActivity.B0(org.telegram.ui.Components.c5.H(launchActivity, LocaleController.getString(R.string.DialogNotAvailable), LocaleController.getString(R.string.LinkNotFound)));
                return;
            default:
                int[] iArr = (int[]) obj;
                Pattern pattern2 = LaunchActivity.B1;
                LaunchActivity launchActivity2 = this.f35910b;
                org.telegram.ui.ActionBar.d5 O = launchActivity2.O();
                Bundle bundle2 = this.f35911c;
                if (!((ActionBarLayout) O).P(new bo(bundle2))) {
                    TLRPC.TL_channels_getChannels tL_channels_getChannels = new TLRPC.TL_channels_getChannels();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    Long l11 = this.d;
                    tL_inputChannel.channel_id = l11.longValue();
                    tL_channels_getChannels.f18148id.add(tL_inputChannel);
                    iArr[0] = ConnectionsManager.getInstance(launchActivity2.O).sendRequest(tL_channels_getChannels, new org.telegram.messenger.g1(launchActivity2, this.e, this.f35912f, l11, this.h, this.f35913n, this.f35914r, this.f35915s, this.v, this.f35916w, this.f35917x, bundle2));
                    return;
                }
                return;
        }
    }

    public n90(LaunchActivity launchActivity, ma0 ma0Var, TLObject tLObject, boolean z10, Long l4, nf.e eVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.n2 n2Var, int i10, Bundle bundle) {
        this.f35910b = launchActivity;
        this.e = ma0Var;
        this.f35918y = tLObject;
        this.f35912f = z10;
        this.d = l4;
        this.h = eVar;
        this.f35913n = l10;
        this.f35914r = num;
        this.f35915s = num2;
        this.v = bArr;
        this.f35916w = n2Var;
        this.f35917x = i10;
        this.f35911c = bundle;
    }
}
