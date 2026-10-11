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
public final class m90 implements Runnable {
    public final int f39840a = 1;
    public final LaunchActivity f39841b;
    public final Bundle f39842c;
    public final Long d;
    public final n70 f39843e;
    public final boolean f39844f;
    public final of.e h;
    public final Long f39845n;
    public final Integer f39846r;
    public final Integer f39847s;
    public final byte[] v;
    public final org.telegram.ui.ActionBar.m2 f39848w;
    public final int f39849x;
    public final Object f39850y;

    public m90(LaunchActivity launchActivity, Bundle bundle, Long l4, int[] iArr, n70 n70Var, boolean z10, of.e eVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.m2 m2Var, int i10) {
        this.f39841b = launchActivity;
        this.f39842c = bundle;
        this.d = l4;
        this.f39850y = iArr;
        this.f39843e = n70Var;
        this.f39844f = z10;
        this.h = eVar;
        this.f39845n = l10;
        this.f39846r = num;
        this.f39847s = num2;
        this.v = bArr;
        this.f39848w = m2Var;
        this.f39849x = i10;
    }

    @Override
    public final void run() {
        int i10 = this.f39840a;
        Object obj = this.f39850y;
        switch (i10) {
            case 0:
                n70 n70Var = this.f39843e;
                TLObject tLObject = (TLObject) obj;
                Pattern pattern = LaunchActivity.B1;
                try {
                    n70Var.run();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                boolean z10 = tLObject instanceof TLRPC.TL_messages_chats;
                LaunchActivity launchActivity = this.f39841b;
                if (z10) {
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
                    if (!tL_messages_chats.chats.isEmpty()) {
                        MessagesController.getInstance(launchActivity.O).putChats(tL_messages_chats.chats, false);
                        TLRPC.Chat chat = tL_messages_chats.chats.get(0);
                        Long l4 = this.d;
                        if (chat != null && this.f39844f && ChatObject.isBoostSupported(chat)) {
                            launchActivity.s0(Long.valueOf(-l4.longValue()), null, this.h, null);
                        } else if (chat != null && chat.forum) {
                            Long l10 = this.f39845n;
                            Integer num = this.f39847s;
                            byte[] bArr = this.v;
                            if (l10 != null) {
                                launchActivity.k0(-l4.longValue(), this.f39846r, null, num, bArr, null, 0, -1);
                            } else {
                                launchActivity.k0(-l4.longValue(), null, null, num, bArr, null, 0, -1);
                            }
                        }
                        org.telegram.ui.ActionBar.m2 m2Var = this.f39848w;
                        Bundle bundle = this.f39842c;
                        if (m2Var == null || MessagesController.getInstance(this.f39849x).checkCanOpenChat(bundle, m2Var)) {
                            ((ActionBarLayout) launchActivity.O()).P(new zn(bundle));
                            return;
                        }
                        return;
                    }
                }
                launchActivity.B0(org.telegram.ui.Components.g5.G(launchActivity, LocaleController.getString(R.string.DialogNotAvailable), LocaleController.getString(R.string.LinkNotFound)));
                return;
            default:
                int[] iArr = (int[]) obj;
                Pattern pattern2 = LaunchActivity.B1;
                LaunchActivity launchActivity2 = this.f39841b;
                org.telegram.ui.ActionBar.b5 O = launchActivity2.O();
                Bundle bundle2 = this.f39842c;
                if (!((ActionBarLayout) O).P(new zn(bundle2))) {
                    TLRPC.TL_channels_getChannels tL_channels_getChannels = new TLRPC.TL_channels_getChannels();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    Long l11 = this.d;
                    tL_inputChannel.channel_id = l11.longValue();
                    tL_channels_getChannels.f20068id.add(tL_inputChannel);
                    iArr[0] = ConnectionsManager.getInstance(launchActivity2.O).sendRequest(tL_channels_getChannels, new org.telegram.messenger.i1(launchActivity2, this.f39843e, this.f39844f, l11, this.h, this.f39845n, this.f39846r, this.f39847s, this.v, this.f39848w, this.f39849x, bundle2));
                    return;
                }
                return;
        }
    }

    public m90(LaunchActivity launchActivity, n70 n70Var, TLObject tLObject, boolean z10, Long l4, of.e eVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.m2 m2Var, int i10, Bundle bundle) {
        this.f39841b = launchActivity;
        this.f39843e = n70Var;
        this.f39850y = tLObject;
        this.f39844f = z10;
        this.d = l4;
        this.h = eVar;
        this.f39845n = l10;
        this.f39846r = num;
        this.f39847s = num2;
        this.v = bArr;
        this.f39848w = m2Var;
        this.f39849x = i10;
        this.f39842c = bundle;
    }
}
