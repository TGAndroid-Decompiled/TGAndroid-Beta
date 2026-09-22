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
    public final int f36229a = 1;
    public final LaunchActivity f36230b;
    public final Bundle f36231c;
    public final Long d;
    public final r80 e;
    public final boolean f36232f;
    public final nf.e h;
    public final Long f36233n;
    public final Integer f36234r;
    public final Integer f36235s;
    public final byte[] v;
    public final org.telegram.ui.ActionBar.n2 f36236w;
    public final int f36237x;
    public final Object f36238y;

    public o90(LaunchActivity launchActivity, Bundle bundle, Long l4, int[] iArr, r80 r80Var, boolean z10, nf.e eVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.n2 n2Var, int i10) {
        this.f36230b = launchActivity;
        this.f36231c = bundle;
        this.d = l4;
        this.f36238y = iArr;
        this.e = r80Var;
        this.f36232f = z10;
        this.h = eVar;
        this.f36233n = l10;
        this.f36234r = num;
        this.f36235s = num2;
        this.v = bArr;
        this.f36236w = n2Var;
        this.f36237x = i10;
    }

    @Override
    public final void run() {
        int i10 = this.f36229a;
        Object obj = this.f36238y;
        switch (i10) {
            case 0:
                r80 r80Var = this.e;
                TLObject tLObject = (TLObject) obj;
                Pattern pattern = LaunchActivity.B1;
                try {
                    r80Var.run();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                boolean z10 = tLObject instanceof TLRPC.TL_messages_chats;
                LaunchActivity launchActivity = this.f36230b;
                if (z10) {
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
                    if (!tL_messages_chats.chats.isEmpty()) {
                        MessagesController.getInstance(launchActivity.O).putChats(tL_messages_chats.chats, false);
                        TLRPC.Chat chat = tL_messages_chats.chats.get(0);
                        Long l4 = this.d;
                        if (chat != null && this.f36232f && ChatObject.isBoostSupported(chat)) {
                            launchActivity.s0(Long.valueOf(-l4.longValue()), null, this.h, null);
                        } else if (chat != null && chat.forum) {
                            Long l10 = this.f36233n;
                            Integer num = this.f36235s;
                            byte[] bArr = this.v;
                            if (l10 != null) {
                                launchActivity.k0(-l4.longValue(), this.f36234r, null, num, bArr, null, 0, -1);
                            } else {
                                launchActivity.k0(-l4.longValue(), null, null, num, bArr, null, 0, -1);
                            }
                        }
                        org.telegram.ui.ActionBar.n2 n2Var = this.f36236w;
                        Bundle bundle = this.f36231c;
                        if (n2Var == null || MessagesController.getInstance(this.f36237x).checkCanOpenChat(bundle, n2Var)) {
                            ((ActionBarLayout) launchActivity.O()).P(new zn(bundle));
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
                LaunchActivity launchActivity2 = this.f36230b;
                org.telegram.ui.ActionBar.d5 O = launchActivity2.O();
                Bundle bundle2 = this.f36231c;
                if (!((ActionBarLayout) O).P(new zn(bundle2))) {
                    TLRPC.TL_channels_getChannels tL_channels_getChannels = new TLRPC.TL_channels_getChannels();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    Long l11 = this.d;
                    tL_inputChannel.channel_id = l11.longValue();
                    tL_channels_getChannels.f18379id.add(tL_inputChannel);
                    iArr[0] = ConnectionsManager.getInstance(launchActivity2.O).sendRequest(tL_channels_getChannels, new org.telegram.messenger.h1(launchActivity2, this.e, this.f36232f, l11, this.h, this.f36233n, this.f36234r, this.f36235s, this.v, this.f36236w, this.f36237x, bundle2));
                    return;
                }
                return;
        }
    }

    public o90(LaunchActivity launchActivity, r80 r80Var, TLObject tLObject, boolean z10, Long l4, nf.e eVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.n2 n2Var, int i10, Bundle bundle) {
        this.f36230b = launchActivity;
        this.e = r80Var;
        this.f36238y = tLObject;
        this.f36232f = z10;
        this.d = l4;
        this.h = eVar;
        this.f36233n = l10;
        this.f36234r = num;
        this.f36235s = num2;
        this.v = bArr;
        this.f36236w = n2Var;
        this.f36237x = i10;
        this.f36231c = bundle;
    }
}
