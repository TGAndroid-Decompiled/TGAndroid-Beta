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
public final class k90 implements Runnable {
    public final int f34620a = 1;
    public final LaunchActivity f34621b;
    public final Bundle f34622c;
    public final Long d;
    public final ia0 e;
    public final boolean f34623f;
    public final nf.e h;
    public final Long f34624n;
    public final Integer f34625r;
    public final Integer f34626s;
    public final byte[] v;
    public final org.telegram.ui.ActionBar.n2 f34627w;
    public final int f34628x;
    public final Object f34629y;

    public k90(LaunchActivity launchActivity, Bundle bundle, Long l4, int[] iArr, ia0 ia0Var, boolean z10, nf.e eVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.n2 n2Var, int i10) {
        this.f34621b = launchActivity;
        this.f34622c = bundle;
        this.d = l4;
        this.f34629y = iArr;
        this.e = ia0Var;
        this.f34623f = z10;
        this.h = eVar;
        this.f34624n = l10;
        this.f34625r = num;
        this.f34626s = num2;
        this.v = bArr;
        this.f34627w = n2Var;
        this.f34628x = i10;
    }

    @Override
    public final void run() {
        int i10 = this.f34620a;
        Object obj = this.f34629y;
        switch (i10) {
            case 0:
                ia0 ia0Var = this.e;
                TLObject tLObject = (TLObject) obj;
                Pattern pattern = LaunchActivity.B1;
                try {
                    ia0Var.run();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                boolean z10 = tLObject instanceof TLRPC.TL_messages_chats;
                LaunchActivity launchActivity = this.f34621b;
                if (z10) {
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
                    if (!tL_messages_chats.chats.isEmpty()) {
                        MessagesController.getInstance(launchActivity.O).putChats(tL_messages_chats.chats, false);
                        TLRPC.Chat chat = tL_messages_chats.chats.get(0);
                        Long l4 = this.d;
                        if (chat != null && this.f34623f && ChatObject.isBoostSupported(chat)) {
                            launchActivity.s0(Long.valueOf(-l4.longValue()), null, this.h, null);
                        } else if (chat != null && chat.forum) {
                            Long l10 = this.f34624n;
                            Integer num = this.f34626s;
                            byte[] bArr = this.v;
                            if (l10 != null) {
                                launchActivity.k0(-l4.longValue(), this.f34625r, null, num, bArr, null, 0, -1);
                            } else {
                                launchActivity.k0(-l4.longValue(), null, null, num, bArr, null, 0, -1);
                            }
                        }
                        org.telegram.ui.ActionBar.n2 n2Var = this.f34627w;
                        Bundle bundle = this.f34622c;
                        if (n2Var == null || MessagesController.getInstance(this.f34628x).checkCanOpenChat(bundle, n2Var)) {
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
                LaunchActivity launchActivity2 = this.f34621b;
                org.telegram.ui.ActionBar.c5 O = launchActivity2.O();
                Bundle bundle2 = this.f34622c;
                if (!((ActionBarLayout) O).P(new xn(bundle2))) {
                    TLRPC.TL_channels_getChannels tL_channels_getChannels = new TLRPC.TL_channels_getChannels();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    Long l11 = this.d;
                    tL_inputChannel.channel_id = l11.longValue();
                    tL_channels_getChannels.f18119id.add(tL_inputChannel);
                    iArr[0] = ConnectionsManager.getInstance(launchActivity2.O).sendRequest(tL_channels_getChannels, new org.telegram.messenger.i1(launchActivity2, this.e, this.f34623f, l11, this.h, this.f34624n, this.f34625r, this.f34626s, this.v, this.f34627w, this.f34628x, bundle2));
                    return;
                }
                return;
        }
    }

    public k90(LaunchActivity launchActivity, ia0 ia0Var, TLObject tLObject, boolean z10, Long l4, nf.e eVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.n2 n2Var, int i10, Bundle bundle) {
        this.f34621b = launchActivity;
        this.e = ia0Var;
        this.f34629y = tLObject;
        this.f34623f = z10;
        this.d = l4;
        this.h = eVar;
        this.f34624n = l10;
        this.f34625r = num;
        this.f34626s = num2;
        this.v = bArr;
        this.f34627w = n2Var;
        this.f34628x = i10;
        this.f34622c = bundle;
    }
}
