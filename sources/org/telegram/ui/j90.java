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
    public final int f34695a = 1;
    public final LaunchActivity f34696b;
    public final Bundle f34697c;
    public final Long d;
    public final m80 e;
    public final boolean f34698f;
    public final nf.e h;
    public final Long f34699n;
    public final Integer f34700r;
    public final Integer f34701s;
    public final byte[] v;
    public final org.telegram.ui.ActionBar.m2 f34702w;
    public final int f34703x;
    public final Object f34704y;

    public j90(LaunchActivity launchActivity, Bundle bundle, Long l4, int[] iArr, m80 m80Var, boolean z10, nf.e eVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.m2 m2Var, int i10) {
        this.f34696b = launchActivity;
        this.f34697c = bundle;
        this.d = l4;
        this.f34704y = iArr;
        this.e = m80Var;
        this.f34698f = z10;
        this.h = eVar;
        this.f34699n = l10;
        this.f34700r = num;
        this.f34701s = num2;
        this.v = bArr;
        this.f34702w = m2Var;
        this.f34703x = i10;
    }

    @Override
    public final void run() {
        int i10 = this.f34695a;
        Object obj = this.f34704y;
        switch (i10) {
            case 0:
                m80 m80Var = this.e;
                TLObject tLObject = (TLObject) obj;
                Pattern pattern = LaunchActivity.B1;
                try {
                    m80Var.run();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                boolean z10 = tLObject instanceof TLRPC.TL_messages_chats;
                LaunchActivity launchActivity = this.f34696b;
                if (z10) {
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
                    if (!tL_messages_chats.chats.isEmpty()) {
                        MessagesController.getInstance(launchActivity.O).putChats(tL_messages_chats.chats, false);
                        TLRPC.Chat chat = tL_messages_chats.chats.get(0);
                        Long l4 = this.d;
                        if (chat != null && this.f34698f && ChatObject.isBoostSupported(chat)) {
                            launchActivity.s0(Long.valueOf(-l4.longValue()), null, this.h, null);
                        } else if (chat != null && chat.forum) {
                            Long l10 = this.f34699n;
                            Integer num = this.f34701s;
                            byte[] bArr = this.v;
                            if (l10 != null) {
                                launchActivity.k0(-l4.longValue(), this.f34700r, null, num, bArr, null, 0, -1);
                            } else {
                                launchActivity.k0(-l4.longValue(), null, null, num, bArr, null, 0, -1);
                            }
                        }
                        org.telegram.ui.ActionBar.m2 m2Var = this.f34702w;
                        Bundle bundle = this.f34697c;
                        if (m2Var == null || MessagesController.getInstance(this.f34703x).checkCanOpenChat(bundle, m2Var)) {
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
                LaunchActivity launchActivity2 = this.f34696b;
                org.telegram.ui.ActionBar.b5 O = launchActivity2.O();
                Bundle bundle2 = this.f34697c;
                if (!((ActionBarLayout) O).P(new wn(bundle2))) {
                    TLRPC.TL_channels_getChannels tL_channels_getChannels = new TLRPC.TL_channels_getChannels();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    Long l11 = this.d;
                    tL_inputChannel.channel_id = l11.longValue();
                    tL_channels_getChannels.f18373id.add(tL_inputChannel);
                    iArr[0] = ConnectionsManager.getInstance(launchActivity2.O).sendRequest(tL_channels_getChannels, new org.telegram.messenger.i1(launchActivity2, this.e, this.f34698f, l11, this.h, this.f34699n, this.f34700r, this.f34701s, this.v, this.f34702w, this.f34703x, bundle2));
                    return;
                }
                return;
        }
    }

    public j90(LaunchActivity launchActivity, m80 m80Var, TLObject tLObject, boolean z10, Long l4, nf.e eVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.m2 m2Var, int i10, Bundle bundle) {
        this.f34696b = launchActivity;
        this.e = m80Var;
        this.f34704y = tLObject;
        this.f34698f = z10;
        this.d = l4;
        this.h = eVar;
        this.f34699n = l10;
        this.f34700r = num;
        this.f34701s = num2;
        this.v = bArr;
        this.f34702w = m2Var;
        this.f34703x = i10;
        this.f34697c = bundle;
    }
}
