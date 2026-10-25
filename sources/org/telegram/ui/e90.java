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
    public final int f39024a = 1;
    public final LaunchActivity f39025b;
    public final Bundle f39026c;
    public final Long d;
    public final sz e;
    public final boolean f39027f;
    public final qf.c h;
    public final Long f39028n;
    public final Integer f39029r;
    public final Integer f39030s;
    public final byte[] v;
    public final org.telegram.ui.ActionBar.r2 f39031w;
    public final int f39032x;
    public final Object f39033y;

    public e90(LaunchActivity launchActivity, Bundle bundle, Long l4, int[] iArr, sz szVar, boolean z10, qf.c cVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.r2 r2Var, int i10) {
        this.f39025b = launchActivity;
        this.f39026c = bundle;
        this.d = l4;
        this.f39033y = iArr;
        this.e = szVar;
        this.f39027f = z10;
        this.h = cVar;
        this.f39028n = l10;
        this.f39029r = num;
        this.f39030s = num2;
        this.v = bArr;
        this.f39031w = r2Var;
        this.f39032x = i10;
    }

    @Override
    public final void run() {
        int i10 = this.f39024a;
        Object obj = this.f39033y;
        switch (i10) {
            case 0:
                sz szVar = this.e;
                TLObject tLObject = (TLObject) obj;
                Pattern pattern = LaunchActivity.D1;
                try {
                    szVar.run();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                boolean z10 = tLObject instanceof TLRPC.TL_messages_chats;
                LaunchActivity launchActivity = this.f39025b;
                if (z10) {
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
                    if (!tL_messages_chats.chats.isEmpty()) {
                        MessagesController.getInstance(launchActivity.O).putChats(tL_messages_chats.chats, false);
                        TLRPC.Chat chat = tL_messages_chats.chats.get(0);
                        Long l4 = this.d;
                        if (chat != null && this.f39027f && ChatObject.isBoostSupported(chat)) {
                            launchActivity.x0(Long.valueOf(-l4.longValue()), null, this.h, null);
                        } else if (chat != null && chat.forum) {
                            Long l10 = this.f39028n;
                            Integer num = this.f39030s;
                            byte[] bArr = this.v;
                            if (l10 != null) {
                                launchActivity.m0(-l4.longValue(), this.f39029r, null, num, bArr, null, 0, -1);
                            } else {
                                launchActivity.m0(-l4.longValue(), null, null, num, bArr, null, 0, -1);
                            }
                        }
                        org.telegram.ui.ActionBar.r2 r2Var = this.f39031w;
                        Bundle bundle = this.f39026c;
                        if (r2Var == null || MessagesController.getInstance(this.f39032x).checkCanOpenChat(bundle, r2Var)) {
                            ((ActionBarLayout) launchActivity.O()).R(new un(bundle));
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
                LaunchActivity launchActivity2 = this.f39025b;
                org.telegram.ui.ActionBar.j5 O = launchActivity2.O();
                Bundle bundle2 = this.f39026c;
                if (!((ActionBarLayout) O).R(new un(bundle2))) {
                    TLRPC.TL_channels_getChannels tL_channels_getChannels = new TLRPC.TL_channels_getChannels();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    Long l11 = this.d;
                    tL_inputChannel.channel_id = l11.longValue();
                    tL_channels_getChannels.f22063id.add(tL_inputChannel);
                    iArr[0] = ConnectionsManager.getInstance(launchActivity2.O).sendRequest(tL_channels_getChannels, new org.telegram.messenger.m1(launchActivity2, this.e, this.f39027f, l11, this.h, this.f39028n, this.f39029r, this.f39030s, this.v, this.f39031w, this.f39032x, bundle2));
                    return;
                }
                return;
        }
    }

    public e90(LaunchActivity launchActivity, sz szVar, TLObject tLObject, boolean z10, Long l4, qf.c cVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.r2 r2Var, int i10, Bundle bundle) {
        this.f39025b = launchActivity;
        this.e = szVar;
        this.f39033y = tLObject;
        this.f39027f = z10;
        this.d = l4;
        this.h = cVar;
        this.f39028n = l10;
        this.f39029r = num;
        this.f39030s = num2;
        this.v = bArr;
        this.f39031w = r2Var;
        this.f39032x = i10;
        this.f39026c = bundle;
    }
}
