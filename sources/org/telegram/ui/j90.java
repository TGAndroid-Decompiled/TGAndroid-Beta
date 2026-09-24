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
    public final int f34679a = 1;
    public final LaunchActivity f34680b;
    public final Bundle f34681c;
    public final Long d;
    public final m80 e;
    public final boolean f34682f;
    public final nf.e h;
    public final Long f34683n;
    public final Integer f34684r;
    public final Integer f34685s;
    public final byte[] v;
    public final org.telegram.ui.ActionBar.m2 f34686w;
    public final int f34687x;
    public final Object f34688y;

    public j90(LaunchActivity launchActivity, Bundle bundle, Long l4, int[] iArr, m80 m80Var, boolean z10, nf.e eVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.m2 m2Var, int i10) {
        this.f34680b = launchActivity;
        this.f34681c = bundle;
        this.d = l4;
        this.f34688y = iArr;
        this.e = m80Var;
        this.f34682f = z10;
        this.h = eVar;
        this.f34683n = l10;
        this.f34684r = num;
        this.f34685s = num2;
        this.v = bArr;
        this.f34686w = m2Var;
        this.f34687x = i10;
    }

    @Override
    public final void run() {
        int i10 = this.f34679a;
        Object obj = this.f34688y;
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
                LaunchActivity launchActivity = this.f34680b;
                if (z10) {
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
                    if (!tL_messages_chats.chats.isEmpty()) {
                        MessagesController.getInstance(launchActivity.O).putChats(tL_messages_chats.chats, false);
                        TLRPC.Chat chat = tL_messages_chats.chats.get(0);
                        Long l4 = this.d;
                        if (chat != null && this.f34682f && ChatObject.isBoostSupported(chat)) {
                            launchActivity.s0(Long.valueOf(-l4.longValue()), null, this.h, null);
                        } else if (chat != null && chat.forum) {
                            Long l10 = this.f34683n;
                            Integer num = this.f34685s;
                            byte[] bArr = this.v;
                            if (l10 != null) {
                                launchActivity.k0(-l4.longValue(), this.f34684r, null, num, bArr, null, 0, -1);
                            } else {
                                launchActivity.k0(-l4.longValue(), null, null, num, bArr, null, 0, -1);
                            }
                        }
                        org.telegram.ui.ActionBar.m2 m2Var = this.f34686w;
                        Bundle bundle = this.f34681c;
                        if (m2Var == null || MessagesController.getInstance(this.f34687x).checkCanOpenChat(bundle, m2Var)) {
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
                LaunchActivity launchActivity2 = this.f34680b;
                org.telegram.ui.ActionBar.b5 O = launchActivity2.O();
                Bundle bundle2 = this.f34681c;
                if (!((ActionBarLayout) O).P(new wn(bundle2))) {
                    TLRPC.TL_channels_getChannels tL_channels_getChannels = new TLRPC.TL_channels_getChannels();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    Long l11 = this.d;
                    tL_inputChannel.channel_id = l11.longValue();
                    tL_channels_getChannels.f18357id.add(tL_inputChannel);
                    iArr[0] = ConnectionsManager.getInstance(launchActivity2.O).sendRequest(tL_channels_getChannels, new org.telegram.messenger.i1(launchActivity2, this.e, this.f34682f, l11, this.h, this.f34683n, this.f34684r, this.f34685s, this.v, this.f34686w, this.f34687x, bundle2));
                    return;
                }
                return;
        }
    }

    public j90(LaunchActivity launchActivity, m80 m80Var, TLObject tLObject, boolean z10, Long l4, nf.e eVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.m2 m2Var, int i10, Bundle bundle) {
        this.f34680b = launchActivity;
        this.e = m80Var;
        this.f34688y = tLObject;
        this.f34682f = z10;
        this.d = l4;
        this.h = eVar;
        this.f34683n = l10;
        this.f34684r = num;
        this.f34685s = num2;
        this.v = bArr;
        this.f34686w = m2Var;
        this.f34687x = i10;
        this.f34681c = bundle;
    }
}
