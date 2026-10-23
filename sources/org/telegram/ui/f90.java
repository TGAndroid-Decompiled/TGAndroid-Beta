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
    public final int f37250a = 1;
    public final LaunchActivity f37251b;
    public final Bundle f37252c;
    public final Long d;
    public final f80 e;
    public final boolean f37253f;
    public final pf.c h;
    public final Long f37254n;
    public final Integer f37255r;
    public final Integer f37256s;
    public final byte[] v;
    public final org.telegram.ui.ActionBar.o2 f37257w;
    public final int f37258x;
    public final Object f37259y;

    public f90(LaunchActivity launchActivity, Bundle bundle, Long l4, int[] iArr, f80 f80Var, boolean z10, pf.c cVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.o2 o2Var, int i10) {
        this.f37251b = launchActivity;
        this.f37252c = bundle;
        this.d = l4;
        this.f37259y = iArr;
        this.e = f80Var;
        this.f37253f = z10;
        this.h = cVar;
        this.f37254n = l10;
        this.f37255r = num;
        this.f37256s = num2;
        this.v = bArr;
        this.f37257w = o2Var;
        this.f37258x = i10;
    }

    @Override
    public final void run() {
        int i10 = this.f37250a;
        Object obj = this.f37259y;
        switch (i10) {
            case 0:
                f80 f80Var = this.e;
                TLObject tLObject = (TLObject) obj;
                Pattern pattern = LaunchActivity.E1;
                try {
                    f80Var.run();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                boolean z10 = tLObject instanceof TLRPC.TL_messages_chats;
                LaunchActivity launchActivity = this.f37251b;
                if (z10) {
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
                    if (!tL_messages_chats.chats.isEmpty()) {
                        MessagesController.getInstance(launchActivity.O).putChats(tL_messages_chats.chats, false);
                        TLRPC.Chat chat = tL_messages_chats.chats.get(0);
                        Long l4 = this.d;
                        if (chat != null && this.f37253f && ChatObject.isBoostSupported(chat)) {
                            launchActivity.x0(Long.valueOf(-l4.longValue()), null, this.h, null);
                        } else if (chat != null && chat.forum) {
                            Long l10 = this.f37254n;
                            Integer num = this.f37256s;
                            byte[] bArr = this.v;
                            if (l10 != null) {
                                launchActivity.m0(-l4.longValue(), this.f37255r, null, num, bArr, null, 0, -1);
                            } else {
                                launchActivity.m0(-l4.longValue(), null, null, num, bArr, null, 0, -1);
                            }
                        }
                        org.telegram.ui.ActionBar.o2 o2Var = this.f37257w;
                        Bundle bundle = this.f37252c;
                        if (o2Var == null || MessagesController.getInstance(this.f37258x).checkCanOpenChat(bundle, o2Var)) {
                            ((ActionBarLayout) launchActivity.O()).Q(new sn(bundle));
                            return;
                        }
                        return;
                    }
                }
                launchActivity.G0(org.telegram.ui.Components.f5.H(launchActivity, LocaleController.getString(R.string.DialogNotAvailable), LocaleController.getString(R.string.LinkNotFound)));
                return;
            default:
                int[] iArr = (int[]) obj;
                Pattern pattern2 = LaunchActivity.E1;
                LaunchActivity launchActivity2 = this.f37251b;
                org.telegram.ui.ActionBar.h5 O = launchActivity2.O();
                Bundle bundle2 = this.f37252c;
                if (!((ActionBarLayout) O).Q(new sn(bundle2))) {
                    TLRPC.TL_channels_getChannels tL_channels_getChannels = new TLRPC.TL_channels_getChannels();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    Long l11 = this.d;
                    tL_inputChannel.channel_id = l11.longValue();
                    tL_channels_getChannels.f20379id.add(tL_inputChannel);
                    iArr[0] = ConnectionsManager.getInstance(launchActivity2.O).sendRequest(tL_channels_getChannels, new org.telegram.messenger.l1(launchActivity2, this.e, this.f37253f, l11, this.h, this.f37254n, this.f37255r, this.f37256s, this.v, this.f37257w, this.f37258x, bundle2));
                    return;
                }
                return;
        }
    }

    public f90(LaunchActivity launchActivity, f80 f80Var, TLObject tLObject, boolean z10, Long l4, pf.c cVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.o2 o2Var, int i10, Bundle bundle) {
        this.f37251b = launchActivity;
        this.e = f80Var;
        this.f37259y = tLObject;
        this.f37253f = z10;
        this.d = l4;
        this.h = cVar;
        this.f37254n = l10;
        this.f37255r = num;
        this.f37256s = num2;
        this.v = bArr;
        this.f37257w = o2Var;
        this.f37258x = i10;
        this.f37252c = bundle;
    }
}
