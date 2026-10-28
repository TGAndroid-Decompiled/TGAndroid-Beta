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
public final class g90 implements Runnable {
    public final int f39534a = 1;
    public final LaunchActivity f39535b;
    public final Bundle f39536c;
    public final Long d;
    public final kz e;
    public final boolean f39537f;
    public final qf.c h;
    public final Long f39538n;
    public final Integer f39539r;
    public final Integer f39540s;
    public final byte[] v;
    public final org.telegram.ui.ActionBar.r2 f39541w;
    public final int f39542x;
    public final Object f39543y;

    public g90(LaunchActivity launchActivity, Bundle bundle, Long l4, int[] iArr, kz kzVar, boolean z10, qf.c cVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.r2 r2Var, int i10) {
        this.f39535b = launchActivity;
        this.f39536c = bundle;
        this.d = l4;
        this.f39543y = iArr;
        this.e = kzVar;
        this.f39537f = z10;
        this.h = cVar;
        this.f39538n = l10;
        this.f39539r = num;
        this.f39540s = num2;
        this.v = bArr;
        this.f39541w = r2Var;
        this.f39542x = i10;
    }

    @Override
    public final void run() {
        int i10 = this.f39534a;
        Object obj = this.f39543y;
        switch (i10) {
            case 0:
                kz kzVar = this.e;
                TLObject tLObject = (TLObject) obj;
                Pattern pattern = LaunchActivity.D1;
                try {
                    kzVar.run();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                boolean z10 = tLObject instanceof TLRPC.TL_messages_chats;
                LaunchActivity launchActivity = this.f39535b;
                if (z10) {
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
                    if (!tL_messages_chats.chats.isEmpty()) {
                        MessagesController.getInstance(launchActivity.O).putChats(tL_messages_chats.chats, false);
                        TLRPC.Chat chat = tL_messages_chats.chats.get(0);
                        Long l4 = this.d;
                        if (chat != null && this.f39537f && ChatObject.isBoostSupported(chat)) {
                            launchActivity.x0(Long.valueOf(-l4.longValue()), null, this.h, null);
                        } else if (chat != null && chat.forum) {
                            Long l10 = this.f39538n;
                            Integer num = this.f39540s;
                            byte[] bArr = this.v;
                            if (l10 != null) {
                                launchActivity.m0(-l4.longValue(), this.f39539r, null, num, bArr, null, 0, -1);
                            } else {
                                launchActivity.m0(-l4.longValue(), null, null, num, bArr, null, 0, -1);
                            }
                        }
                        org.telegram.ui.ActionBar.r2 r2Var = this.f39541w;
                        Bundle bundle = this.f39536c;
                        if (r2Var == null || MessagesController.getInstance(this.f39542x).checkCanOpenChat(bundle, r2Var)) {
                            ((ActionBarLayout) launchActivity.O()).R(new wn(bundle));
                            return;
                        }
                        return;
                    }
                }
                launchActivity.G0(org.telegram.ui.Components.g5.G(launchActivity, LocaleController.getString(R.string.DialogNotAvailable), LocaleController.getString(R.string.LinkNotFound)));
                return;
            default:
                int[] iArr = (int[]) obj;
                Pattern pattern2 = LaunchActivity.D1;
                LaunchActivity launchActivity2 = this.f39535b;
                org.telegram.ui.ActionBar.j5 O = launchActivity2.O();
                Bundle bundle2 = this.f39536c;
                if (!((ActionBarLayout) O).R(new wn(bundle2))) {
                    TLRPC.TL_channels_getChannels tL_channels_getChannels = new TLRPC.TL_channels_getChannels();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    Long l11 = this.d;
                    tL_inputChannel.channel_id = l11.longValue();
                    tL_channels_getChannels.f22064id.add(tL_inputChannel);
                    iArr[0] = ConnectionsManager.getInstance(launchActivity2.O).sendRequest(tL_channels_getChannels, new org.telegram.messenger.m1(launchActivity2, this.e, this.f39537f, l11, this.h, this.f39538n, this.f39539r, this.f39540s, this.v, this.f39541w, this.f39542x, bundle2));
                    return;
                }
                return;
        }
    }

    public g90(LaunchActivity launchActivity, kz kzVar, TLObject tLObject, boolean z10, Long l4, qf.c cVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.r2 r2Var, int i10, Bundle bundle) {
        this.f39535b = launchActivity;
        this.e = kzVar;
        this.f39543y = tLObject;
        this.f39537f = z10;
        this.d = l4;
        this.h = cVar;
        this.f39538n = l10;
        this.f39539r = num;
        this.f39540s = num2;
        this.v = bArr;
        this.f39541w = r2Var;
        this.f39542x = i10;
        this.f39536c = bundle;
    }
}
