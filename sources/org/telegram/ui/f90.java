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
    public final int f37233a = 1;
    public final LaunchActivity f37234b;
    public final Bundle f37235c;
    public final Long d;
    public final f80 e;
    public final boolean f37236f;
    public final pf.c h;
    public final Long f37237n;
    public final Integer f37238r;
    public final Integer f37239s;
    public final byte[] v;
    public final org.telegram.ui.ActionBar.o2 f37240w;
    public final int f37241x;
    public final Object f37242y;

    public f90(LaunchActivity launchActivity, Bundle bundle, Long l4, int[] iArr, f80 f80Var, boolean z10, pf.c cVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.o2 o2Var, int i10) {
        this.f37234b = launchActivity;
        this.f37235c = bundle;
        this.d = l4;
        this.f37242y = iArr;
        this.e = f80Var;
        this.f37236f = z10;
        this.h = cVar;
        this.f37237n = l10;
        this.f37238r = num;
        this.f37239s = num2;
        this.v = bArr;
        this.f37240w = o2Var;
        this.f37241x = i10;
    }

    @Override
    public final void run() {
        int i10 = this.f37233a;
        Object obj = this.f37242y;
        switch (i10) {
            case 0:
                f80 f80Var = this.e;
                TLObject tLObject = (TLObject) obj;
                Pattern pattern = LaunchActivity.D1;
                try {
                    f80Var.run();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                boolean z10 = tLObject instanceof TLRPC.TL_messages_chats;
                LaunchActivity launchActivity = this.f37234b;
                if (z10) {
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
                    if (!tL_messages_chats.chats.isEmpty()) {
                        MessagesController.getInstance(launchActivity.O).putChats(tL_messages_chats.chats, false);
                        TLRPC.Chat chat = tL_messages_chats.chats.get(0);
                        Long l4 = this.d;
                        if (chat != null && this.f37236f && ChatObject.isBoostSupported(chat)) {
                            launchActivity.x0(Long.valueOf(-l4.longValue()), null, this.h, null);
                        } else if (chat != null && chat.forum) {
                            Long l10 = this.f37237n;
                            Integer num = this.f37239s;
                            byte[] bArr = this.v;
                            if (l10 != null) {
                                launchActivity.m0(-l4.longValue(), this.f37238r, null, num, bArr, null, 0, -1);
                            } else {
                                launchActivity.m0(-l4.longValue(), null, null, num, bArr, null, 0, -1);
                            }
                        }
                        org.telegram.ui.ActionBar.o2 o2Var = this.f37240w;
                        Bundle bundle = this.f37235c;
                        if (o2Var == null || MessagesController.getInstance(this.f37241x).checkCanOpenChat(bundle, o2Var)) {
                            ((ActionBarLayout) launchActivity.O()).Q(new sn(bundle));
                            return;
                        }
                        return;
                    }
                }
                launchActivity.G0(org.telegram.ui.Components.d5.G(launchActivity, LocaleController.getString(R.string.DialogNotAvailable), LocaleController.getString(R.string.LinkNotFound)));
                return;
            default:
                int[] iArr = (int[]) obj;
                Pattern pattern2 = LaunchActivity.D1;
                LaunchActivity launchActivity2 = this.f37234b;
                org.telegram.ui.ActionBar.h5 O = launchActivity2.O();
                Bundle bundle2 = this.f37235c;
                if (!((ActionBarLayout) O).Q(new sn(bundle2))) {
                    TLRPC.TL_channels_getChannels tL_channels_getChannels = new TLRPC.TL_channels_getChannels();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    Long l11 = this.d;
                    tL_inputChannel.channel_id = l11.longValue();
                    tL_channels_getChannels.f20380id.add(tL_inputChannel);
                    iArr[0] = ConnectionsManager.getInstance(launchActivity2.O).sendRequest(tL_channels_getChannels, new org.telegram.messenger.l1(launchActivity2, this.e, this.f37236f, l11, this.h, this.f37237n, this.f37238r, this.f37239s, this.v, this.f37240w, this.f37241x, bundle2));
                    return;
                }
                return;
        }
    }

    public f90(LaunchActivity launchActivity, f80 f80Var, TLObject tLObject, boolean z10, Long l4, pf.c cVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.o2 o2Var, int i10, Bundle bundle) {
        this.f37234b = launchActivity;
        this.e = f80Var;
        this.f37242y = tLObject;
        this.f37236f = z10;
        this.d = l4;
        this.h = cVar;
        this.f37237n = l10;
        this.f37238r = num;
        this.f37239s = num2;
        this.v = bArr;
        this.f37240w = o2Var;
        this.f37241x = i10;
        this.f37235c = bundle;
    }
}
