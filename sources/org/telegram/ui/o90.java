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
    public final int f39139a = 1;
    public final LaunchActivity f39140b;
    public final Bundle f39141c;
    public final Long d;
    public final r80 f39142e;
    public final boolean f39143f;
    public final of.e h;
    public final Long f39144n;
    public final Integer f39145r;
    public final Integer f39146s;
    public final byte[] v;
    public final org.telegram.ui.ActionBar.n2 f39147w;
    public final int f39148x;
    public final Object f39149y;

    public o90(LaunchActivity launchActivity, Bundle bundle, Long l4, int[] iArr, r80 r80Var, boolean z10, of.e eVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.n2 n2Var, int i10) {
        this.f39140b = launchActivity;
        this.f39141c = bundle;
        this.d = l4;
        this.f39149y = iArr;
        this.f39142e = r80Var;
        this.f39143f = z10;
        this.h = eVar;
        this.f39144n = l10;
        this.f39145r = num;
        this.f39146s = num2;
        this.v = bArr;
        this.f39147w = n2Var;
        this.f39148x = i10;
    }

    @Override
    public final void run() {
        int i10 = this.f39139a;
        Object obj = this.f39149y;
        switch (i10) {
            case 0:
                r80 r80Var = this.f39142e;
                TLObject tLObject = (TLObject) obj;
                Pattern pattern = LaunchActivity.B1;
                try {
                    r80Var.run();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                boolean z10 = tLObject instanceof TLRPC.TL_messages_chats;
                LaunchActivity launchActivity = this.f39140b;
                if (z10) {
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
                    if (!tL_messages_chats.chats.isEmpty()) {
                        MessagesController.getInstance(launchActivity.O).putChats(tL_messages_chats.chats, false);
                        TLRPC.Chat chat = tL_messages_chats.chats.get(0);
                        Long l4 = this.d;
                        if (chat != null && this.f39143f && ChatObject.isBoostSupported(chat)) {
                            launchActivity.s0(Long.valueOf(-l4.longValue()), null, this.h, null);
                        } else if (chat != null && chat.forum) {
                            Long l10 = this.f39144n;
                            Integer num = this.f39146s;
                            byte[] bArr = this.v;
                            if (l10 != null) {
                                launchActivity.k0(-l4.longValue(), this.f39145r, null, num, bArr, null, 0, -1);
                            } else {
                                launchActivity.k0(-l4.longValue(), null, null, num, bArr, null, 0, -1);
                            }
                        }
                        org.telegram.ui.ActionBar.n2 n2Var = this.f39147w;
                        Bundle bundle = this.f39141c;
                        if (n2Var == null || MessagesController.getInstance(this.f39148x).checkCanOpenChat(bundle, n2Var)) {
                            ((ActionBarLayout) launchActivity.O()).P(new co(bundle));
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
                LaunchActivity launchActivity2 = this.f39140b;
                org.telegram.ui.ActionBar.d5 O = launchActivity2.O();
                Bundle bundle2 = this.f39141c;
                if (!((ActionBarLayout) O).P(new co(bundle2))) {
                    TLRPC.TL_channels_getChannels tL_channels_getChannels = new TLRPC.TL_channels_getChannels();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    Long l11 = this.d;
                    tL_inputChannel.channel_id = l11.longValue();
                    tL_channels_getChannels.f19905id.add(tL_inputChannel);
                    iArr[0] = ConnectionsManager.getInstance(launchActivity2.O).sendRequest(tL_channels_getChannels, new org.telegram.messenger.g1(launchActivity2, this.f39142e, this.f39143f, l11, this.h, this.f39144n, this.f39145r, this.f39146s, this.v, this.f39147w, this.f39148x, bundle2));
                    return;
                }
                return;
        }
    }

    public o90(LaunchActivity launchActivity, r80 r80Var, TLObject tLObject, boolean z10, Long l4, of.e eVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.n2 n2Var, int i10, Bundle bundle) {
        this.f39140b = launchActivity;
        this.f39142e = r80Var;
        this.f39149y = tLObject;
        this.f39143f = z10;
        this.d = l4;
        this.h = eVar;
        this.f39144n = l10;
        this.f39145r = num;
        this.f39146s = num2;
        this.v = bArr;
        this.f39147w = n2Var;
        this.f39148x = i10;
        this.f39141c = bundle;
    }
}
