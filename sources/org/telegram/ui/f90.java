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
public final class f90 implements Runnable {
    public final int f36791a = 1;
    public final LaunchActivity f36792b;
    public final Bundle f36793c;
    public final Long d;
    public final v10 f36794e;
    public final boolean f36795f;
    public final af.f h;
    public final Long f36796n;
    public final Integer f36797r;
    public final Integer f36798s;
    public final byte[] v;
    public final org.telegram.ui.ActionBar.p2 f36799w;
    public final int f36800x;
    public final Object f36801y;

    public f90(LaunchActivity launchActivity, Bundle bundle, Long l10, int[] iArr, v10 v10Var, boolean z4, af.f fVar, Long l11, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.p2 p2Var, int i10) {
        this.f36792b = launchActivity;
        this.f36793c = bundle;
        this.d = l10;
        this.f36801y = iArr;
        this.f36794e = v10Var;
        this.f36795f = z4;
        this.h = fVar;
        this.f36796n = l11;
        this.f36797r = num;
        this.f36798s = num2;
        this.v = bArr;
        this.f36799w = p2Var;
        this.f36800x = i10;
    }

    @Override
    public final void run() {
        int i10 = this.f36791a;
        Object obj = this.f36801y;
        switch (i10) {
            case 0:
                v10 v10Var = this.f36794e;
                TLObject tLObject = (TLObject) obj;
                Pattern pattern = LaunchActivity.f34134y1;
                try {
                    v10Var.run();
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
                boolean z4 = tLObject instanceof TLRPC.TL_messages_chats;
                LaunchActivity launchActivity = this.f36792b;
                if (z4) {
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
                    if (!tL_messages_chats.chats.isEmpty()) {
                        MessagesController.getInstance(launchActivity.L).putChats(tL_messages_chats.chats, false);
                        TLRPC.Chat chat = tL_messages_chats.chats.get(0);
                        Long l10 = this.d;
                        if (chat != null && this.f36795f && ChatObject.isBoostSupported(chat)) {
                            launchActivity.s0(Long.valueOf(-l10.longValue()), null, this.h, null);
                        } else if (chat != null && chat.forum) {
                            Long l11 = this.f36796n;
                            Integer num = this.f36798s;
                            byte[] bArr = this.v;
                            if (l11 != null) {
                                launchActivity.k0(-l10.longValue(), this.f36797r, null, num, bArr, null, 0, -1);
                            } else {
                                launchActivity.k0(-l10.longValue(), null, null, num, bArr, null, 0, -1);
                            }
                        }
                        org.telegram.ui.ActionBar.p2 p2Var = this.f36799w;
                        Bundle bundle = this.f36793c;
                        if (p2Var == null || MessagesController.getInstance(this.f36800x).checkCanOpenChat(bundle, p2Var)) {
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
                Pattern pattern2 = LaunchActivity.f34134y1;
                LaunchActivity launchActivity2 = this.f36792b;
                org.telegram.ui.ActionBar.f5 O = launchActivity2.O();
                Bundle bundle2 = this.f36793c;
                if (!((ActionBarLayout) O).P(new xn(bundle2))) {
                    TLRPC.TL_channels_getChannels tL_channels_getChannels = new TLRPC.TL_channels_getChannels();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    Long l12 = this.d;
                    tL_inputChannel.channel_id = l12.longValue();
                    tL_channels_getChannels.f20879id.add(tL_inputChannel);
                    iArr[0] = ConnectionsManager.getInstance(launchActivity2.L).sendRequest(tL_channels_getChannels, new org.telegram.messenger.h1(launchActivity2, this.f36794e, this.f36795f, l12, this.h, this.f36796n, this.f36797r, this.f36798s, this.v, this.f36799w, this.f36800x, bundle2));
                    return;
                }
                return;
        }
    }

    public f90(LaunchActivity launchActivity, v10 v10Var, TLObject tLObject, boolean z4, Long l10, af.f fVar, Long l11, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.p2 p2Var, int i10, Bundle bundle) {
        this.f36792b = launchActivity;
        this.f36794e = v10Var;
        this.f36801y = tLObject;
        this.f36795f = z4;
        this.d = l10;
        this.h = fVar;
        this.f36796n = l11;
        this.f36797r = num;
        this.f36798s = num2;
        this.v = bArr;
        this.f36799w = p2Var;
        this.f36800x = i10;
        this.f36793c = bundle;
    }
}
