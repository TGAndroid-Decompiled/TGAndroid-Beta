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
public final class e90 implements Runnable {
    public final int f33932a = 1;
    public final LaunchActivity f33933b;
    public final Bundle f33934c;
    public final Long d;
    public final g00 e;
    public final boolean f33935f;
    public final af.f h;
    public final Long f33936n;
    public final Integer f33937r;
    public final Integer f33938s;
    public final byte[] v;
    public final org.telegram.ui.ActionBar.p2 f33939w;
    public final int f33940x;
    public final Object f33941y;

    public e90(LaunchActivity launchActivity, Bundle bundle, Long l10, int[] iArr, g00 g00Var, boolean z4, af.f fVar, Long l11, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.p2 p2Var, int i10) {
        this.f33933b = launchActivity;
        this.f33934c = bundle;
        this.d = l10;
        this.f33941y = iArr;
        this.e = g00Var;
        this.f33935f = z4;
        this.h = fVar;
        this.f33936n = l11;
        this.f33937r = num;
        this.f33938s = num2;
        this.v = bArr;
        this.f33939w = p2Var;
        this.f33940x = i10;
    }

    @Override
    public final void run() {
        int i10 = this.f33932a;
        Object obj = this.f33941y;
        switch (i10) {
            case 0:
                g00 g00Var = this.e;
                TLObject tLObject = (TLObject) obj;
                Pattern pattern = LaunchActivity.f31612y1;
                try {
                    g00Var.run();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                boolean z4 = tLObject instanceof TLRPC.TL_messages_chats;
                LaunchActivity launchActivity = this.f33933b;
                if (z4) {
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
                    if (!tL_messages_chats.chats.isEmpty()) {
                        MessagesController.getInstance(launchActivity.L).putChats(tL_messages_chats.chats, false);
                        TLRPC.Chat chat = tL_messages_chats.chats.get(0);
                        Long l10 = this.d;
                        if (chat != null && this.f33935f && ChatObject.isBoostSupported(chat)) {
                            launchActivity.s0(Long.valueOf(-l10.longValue()), null, this.h, null);
                        } else if (chat != null && chat.forum) {
                            Long l11 = this.f33936n;
                            Integer num = this.f33938s;
                            byte[] bArr = this.v;
                            if (l11 != null) {
                                launchActivity.k0(-l10.longValue(), this.f33937r, null, num, bArr, null, 0, -1);
                            } else {
                                launchActivity.k0(-l10.longValue(), null, null, num, bArr, null, 0, -1);
                            }
                        }
                        org.telegram.ui.ActionBar.p2 p2Var = this.f33939w;
                        Bundle bundle = this.f33934c;
                        if (p2Var == null || MessagesController.getInstance(this.f33940x).checkCanOpenChat(bundle, p2Var)) {
                            ((ActionBarLayout) launchActivity.O()).P(new xn(bundle));
                            return;
                        }
                        return;
                    }
                }
                launchActivity.B0(org.telegram.ui.Components.z4.H(launchActivity, LocaleController.getString(R.string.DialogNotAvailable), LocaleController.getString(R.string.LinkNotFound)));
                return;
            default:
                int[] iArr = (int[]) obj;
                Pattern pattern2 = LaunchActivity.f31612y1;
                LaunchActivity launchActivity2 = this.f33933b;
                org.telegram.ui.ActionBar.e5 O = launchActivity2.O();
                Bundle bundle2 = this.f33934c;
                if (!((ActionBarLayout) O).P(new xn(bundle2))) {
                    TLRPC.TL_channels_getChannels tL_channels_getChannels = new TLRPC.TL_channels_getChannels();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    Long l12 = this.d;
                    tL_inputChannel.channel_id = l12.longValue();
                    tL_channels_getChannels.f19220id.add(tL_inputChannel);
                    iArr[0] = ConnectionsManager.getInstance(launchActivity2.L).sendRequest(tL_channels_getChannels, new org.telegram.messenger.h1(launchActivity2, this.e, this.f33935f, l12, this.h, this.f33936n, this.f33937r, this.f33938s, this.v, this.f33939w, this.f33940x, bundle2));
                    return;
                }
                return;
        }
    }

    public e90(LaunchActivity launchActivity, g00 g00Var, TLObject tLObject, boolean z4, Long l10, af.f fVar, Long l11, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.p2 p2Var, int i10, Bundle bundle) {
        this.f33933b = launchActivity;
        this.e = g00Var;
        this.f33941y = tLObject;
        this.f33935f = z4;
        this.d = l10;
        this.h = fVar;
        this.f33936n = l11;
        this.f33937r = num;
        this.f33938s = num2;
        this.v = bArr;
        this.f33939w = p2Var;
        this.f33940x = i10;
        this.f33934c = bundle;
    }
}
