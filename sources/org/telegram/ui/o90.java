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
    public final int f39166a = 1;
    public final LaunchActivity f39167b;
    public final Bundle f39168c;
    public final Long d;
    public final r80 f39169e;
    public final boolean f39170f;
    public final of.e h;
    public final Long f39171n;
    public final Integer f39172r;
    public final Integer f39173s;
    public final byte[] v;
    public final org.telegram.ui.ActionBar.n2 f39174w;
    public final int f39175x;
    public final Object f39176y;

    public o90(LaunchActivity launchActivity, Bundle bundle, Long l4, int[] iArr, r80 r80Var, boolean z10, of.e eVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.n2 n2Var, int i10) {
        this.f39167b = launchActivity;
        this.f39168c = bundle;
        this.d = l4;
        this.f39176y = iArr;
        this.f39169e = r80Var;
        this.f39170f = z10;
        this.h = eVar;
        this.f39171n = l10;
        this.f39172r = num;
        this.f39173s = num2;
        this.v = bArr;
        this.f39174w = n2Var;
        this.f39175x = i10;
    }

    @Override
    public final void run() {
        int i10 = this.f39166a;
        Object obj = this.f39176y;
        switch (i10) {
            case 0:
                r80 r80Var = this.f39169e;
                TLObject tLObject = (TLObject) obj;
                Pattern pattern = LaunchActivity.B1;
                try {
                    r80Var.run();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                boolean z10 = tLObject instanceof TLRPC.TL_messages_chats;
                LaunchActivity launchActivity = this.f39167b;
                if (z10) {
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
                    if (!tL_messages_chats.chats.isEmpty()) {
                        MessagesController.getInstance(launchActivity.O).putChats(tL_messages_chats.chats, false);
                        TLRPC.Chat chat = tL_messages_chats.chats.get(0);
                        Long l4 = this.d;
                        if (chat != null && this.f39170f && ChatObject.isBoostSupported(chat)) {
                            launchActivity.s0(Long.valueOf(-l4.longValue()), null, this.h, null);
                        } else if (chat != null && chat.forum) {
                            Long l10 = this.f39171n;
                            Integer num = this.f39173s;
                            byte[] bArr = this.v;
                            if (l10 != null) {
                                launchActivity.k0(-l4.longValue(), this.f39172r, null, num, bArr, null, 0, -1);
                            } else {
                                launchActivity.k0(-l4.longValue(), null, null, num, bArr, null, 0, -1);
                            }
                        }
                        org.telegram.ui.ActionBar.n2 n2Var = this.f39174w;
                        Bundle bundle = this.f39168c;
                        if (n2Var == null || MessagesController.getInstance(this.f39175x).checkCanOpenChat(bundle, n2Var)) {
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
                LaunchActivity launchActivity2 = this.f39167b;
                org.telegram.ui.ActionBar.d5 O = launchActivity2.O();
                Bundle bundle2 = this.f39168c;
                if (!((ActionBarLayout) O).P(new co(bundle2))) {
                    TLRPC.TL_channels_getChannels tL_channels_getChannels = new TLRPC.TL_channels_getChannels();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    Long l11 = this.d;
                    tL_inputChannel.channel_id = l11.longValue();
                    tL_channels_getChannels.f19932id.add(tL_inputChannel);
                    iArr[0] = ConnectionsManager.getInstance(launchActivity2.O).sendRequest(tL_channels_getChannels, new org.telegram.messenger.g1(launchActivity2, this.f39169e, this.f39170f, l11, this.h, this.f39171n, this.f39172r, this.f39173s, this.v, this.f39174w, this.f39175x, bundle2));
                    return;
                }
                return;
        }
    }

    public o90(LaunchActivity launchActivity, r80 r80Var, TLObject tLObject, boolean z10, Long l4, of.e eVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.n2 n2Var, int i10, Bundle bundle) {
        this.f39167b = launchActivity;
        this.f39169e = r80Var;
        this.f39176y = tLObject;
        this.f39170f = z10;
        this.d = l4;
        this.h = eVar;
        this.f39171n = l10;
        this.f39172r = num;
        this.f39173s = num2;
        this.v = bArr;
        this.f39174w = n2Var;
        this.f39175x = i10;
        this.f39168c = bundle;
    }
}
