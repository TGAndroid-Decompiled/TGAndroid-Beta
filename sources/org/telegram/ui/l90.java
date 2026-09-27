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
public final class l90 implements Runnable {
    public final int f35287a = 1;
    public final LaunchActivity f35288b;
    public final Bundle f35289c;
    public final Long d;
    public final ea0 e;
    public final boolean f35290f;
    public final nf.e h;
    public final Long f35291n;
    public final Integer f35292r;
    public final Integer f35293s;
    public final byte[] v;
    public final org.telegram.ui.ActionBar.o2 f35294w;
    public final int f35295x;
    public final Object f35296y;

    public l90(LaunchActivity launchActivity, Bundle bundle, Long l4, int[] iArr, ea0 ea0Var, boolean z10, nf.e eVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.o2 o2Var, int i10) {
        this.f35288b = launchActivity;
        this.f35289c = bundle;
        this.d = l4;
        this.f35296y = iArr;
        this.e = ea0Var;
        this.f35290f = z10;
        this.h = eVar;
        this.f35291n = l10;
        this.f35292r = num;
        this.f35293s = num2;
        this.v = bArr;
        this.f35294w = o2Var;
        this.f35295x = i10;
    }

    @Override
    public final void run() {
        int i10 = this.f35287a;
        Object obj = this.f35296y;
        switch (i10) {
            case 0:
                ea0 ea0Var = this.e;
                TLObject tLObject = (TLObject) obj;
                Pattern pattern = LaunchActivity.B1;
                try {
                    ea0Var.run();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                boolean z10 = tLObject instanceof TLRPC.TL_messages_chats;
                LaunchActivity launchActivity = this.f35288b;
                if (z10) {
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
                    if (!tL_messages_chats.chats.isEmpty()) {
                        MessagesController.getInstance(launchActivity.O).putChats(tL_messages_chats.chats, false);
                        TLRPC.Chat chat = tL_messages_chats.chats.get(0);
                        Long l4 = this.d;
                        if (chat != null && this.f35290f && ChatObject.isBoostSupported(chat)) {
                            launchActivity.s0(Long.valueOf(-l4.longValue()), null, this.h, null);
                        } else if (chat != null && chat.forum) {
                            Long l10 = this.f35291n;
                            Integer num = this.f35293s;
                            byte[] bArr = this.v;
                            if (l10 != null) {
                                launchActivity.k0(-l4.longValue(), this.f35292r, null, num, bArr, null, 0, -1);
                            } else {
                                launchActivity.k0(-l4.longValue(), null, null, num, bArr, null, 0, -1);
                            }
                        }
                        org.telegram.ui.ActionBar.o2 o2Var = this.f35294w;
                        Bundle bundle = this.f35289c;
                        if (o2Var == null || MessagesController.getInstance(this.f35295x).checkCanOpenChat(bundle, o2Var)) {
                            ((ActionBarLayout) launchActivity.O()).P(new xn(bundle));
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
                LaunchActivity launchActivity2 = this.f35288b;
                org.telegram.ui.ActionBar.d5 O = launchActivity2.O();
                Bundle bundle2 = this.f35289c;
                if (!((ActionBarLayout) O).P(new xn(bundle2))) {
                    TLRPC.TL_channels_getChannels tL_channels_getChannels = new TLRPC.TL_channels_getChannels();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    Long l11 = this.d;
                    tL_inputChannel.channel_id = l11.longValue();
                    tL_channels_getChannels.f18365id.add(tL_inputChannel);
                    iArr[0] = ConnectionsManager.getInstance(launchActivity2.O).sendRequest(tL_channels_getChannels, new org.telegram.messenger.i1(launchActivity2, this.e, this.f35290f, l11, this.h, this.f35291n, this.f35292r, this.f35293s, this.v, this.f35294w, this.f35295x, bundle2));
                    return;
                }
                return;
        }
    }

    public l90(LaunchActivity launchActivity, ea0 ea0Var, TLObject tLObject, boolean z10, Long l4, nf.e eVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.o2 o2Var, int i10, Bundle bundle) {
        this.f35288b = launchActivity;
        this.e = ea0Var;
        this.f35296y = tLObject;
        this.f35290f = z10;
        this.d = l4;
        this.h = eVar;
        this.f35291n = l10;
        this.f35292r = num;
        this.f35293s = num2;
        this.v = bArr;
        this.f35294w = o2Var;
        this.f35295x = i10;
        this.f35289c = bundle;
    }
}
