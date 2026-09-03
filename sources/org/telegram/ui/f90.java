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
    public final int f36711a = 1;
    public final LaunchActivity f36712b;
    public final Bundle f36713c;
    public final Long d;
    public final z10 f36714e;
    public final boolean f36715f;
    public final af.f h;
    public final Long f36716n;
    public final Integer f36717r;
    public final Integer f36718s;
    public final byte[] v;
    public final org.telegram.ui.ActionBar.p2 f36719w;
    public final int f36720x;
    public final Object f36721y;

    public f90(LaunchActivity launchActivity, Bundle bundle, Long l10, int[] iArr, z10 z10Var, boolean z4, af.f fVar, Long l11, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.p2 p2Var, int i10) {
        this.f36712b = launchActivity;
        this.f36713c = bundle;
        this.d = l10;
        this.f36721y = iArr;
        this.f36714e = z10Var;
        this.f36715f = z4;
        this.h = fVar;
        this.f36716n = l11;
        this.f36717r = num;
        this.f36718s = num2;
        this.v = bArr;
        this.f36719w = p2Var;
        this.f36720x = i10;
    }

    @Override
    public final void run() {
        int i10 = this.f36711a;
        Object obj = this.f36721y;
        switch (i10) {
            case 0:
                z10 z10Var = this.f36714e;
                TLObject tLObject = (TLObject) obj;
                Pattern pattern = LaunchActivity.f34134y1;
                try {
                    z10Var.run();
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
                boolean z4 = tLObject instanceof TLRPC.TL_messages_chats;
                LaunchActivity launchActivity = this.f36712b;
                if (z4) {
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
                    if (!tL_messages_chats.chats.isEmpty()) {
                        MessagesController.getInstance(launchActivity.L).putChats(tL_messages_chats.chats, false);
                        TLRPC.Chat chat = tL_messages_chats.chats.get(0);
                        Long l10 = this.d;
                        if (chat != null && this.f36715f && ChatObject.isBoostSupported(chat)) {
                            launchActivity.s0(Long.valueOf(-l10.longValue()), null, this.h, null);
                        } else if (chat != null && chat.forum) {
                            Long l11 = this.f36716n;
                            Integer num = this.f36718s;
                            byte[] bArr = this.v;
                            if (l11 != null) {
                                launchActivity.k0(-l10.longValue(), this.f36717r, null, num, bArr, null, 0, -1);
                            } else {
                                launchActivity.k0(-l10.longValue(), null, null, num, bArr, null, 0, -1);
                            }
                        }
                        org.telegram.ui.ActionBar.p2 p2Var = this.f36719w;
                        Bundle bundle = this.f36713c;
                        if (p2Var == null || MessagesController.getInstance(this.f36720x).checkCanOpenChat(bundle, p2Var)) {
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
                LaunchActivity launchActivity2 = this.f36712b;
                org.telegram.ui.ActionBar.f5 O = launchActivity2.O();
                Bundle bundle2 = this.f36713c;
                if (!((ActionBarLayout) O).P(new xn(bundle2))) {
                    TLRPC.TL_channels_getChannels tL_channels_getChannels = new TLRPC.TL_channels_getChannels();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    Long l12 = this.d;
                    tL_inputChannel.channel_id = l12.longValue();
                    tL_channels_getChannels.f20881id.add(tL_inputChannel);
                    iArr[0] = ConnectionsManager.getInstance(launchActivity2.L).sendRequest(tL_channels_getChannels, new org.telegram.messenger.h1(launchActivity2, this.f36714e, this.f36715f, l12, this.h, this.f36716n, this.f36717r, this.f36718s, this.v, this.f36719w, this.f36720x, bundle2));
                    return;
                }
                return;
        }
    }

    public f90(LaunchActivity launchActivity, z10 z10Var, TLObject tLObject, boolean z4, Long l10, af.f fVar, Long l11, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.p2 p2Var, int i10, Bundle bundle) {
        this.f36712b = launchActivity;
        this.f36714e = z10Var;
        this.f36721y = tLObject;
        this.f36715f = z4;
        this.d = l10;
        this.h = fVar;
        this.f36716n = l11;
        this.f36717r = num;
        this.f36718s = num2;
        this.v = bArr;
        this.f36719w = p2Var;
        this.f36720x = i10;
        this.f36713c = bundle;
    }
}
