package org.telegram.messenger;

import android.content.Context;
import android.os.Bundle;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y9 implements RequestDelegate {
    public final int f20691a;
    public final BaseController f20692b;
    public final Object f20693c;
    public final Object d;
    public final Object f20694e;
    public final Object f20695f;

    public y9(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f20691a = i10;
        this.f20692b = baseController;
        this.f20693c = obj;
        this.d = obj2;
        this.f20694e = obj3;
        this.f20695f = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20691a) {
            case 0:
                ((MessagesController) this.f20692b).lambda$checkCanOpenChat$452((org.telegram.ui.ActionBar.d2) this.f20693c, (af.f) this.d, (org.telegram.ui.ActionBar.p2) this.f20694e, (Bundle) this.f20695f, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f20692b).lambda$didReceivedNotification$51((TLRPC.TL_theme) this.f20693c, (org.telegram.ui.ActionBar.j6) this.d, (TLRPC.TL_inputThemeSettings) this.f20694e, (org.telegram.ui.ActionBar.i6) this.f20695f, tLObject, tL_error);
                return;
            case 2:
                ((SecretChatHelper) this.f20692b).lambda$startSecretChat$28((Context) this.d, (org.telegram.ui.ActionBar.d2) this.f20693c, (byte[]) this.f20694e, (TLRPC.User) this.f20695f, tLObject, tL_error);
                return;
            default:
                ((SendMessagesHelper) this.f20692b).lambda$performSendDelayedMessage$56((TLRPC.InputMedia) this.f20693c, (SendMessagesHelper.DelayedMessage) this.d, (String) this.f20694e, (MessageObject) this.f20695f, tLObject, tL_error);
                return;
        }
    }

    public y9(SecretChatHelper secretChatHelper, Context context, org.telegram.ui.ActionBar.d2 d2Var, byte[] bArr, TLRPC.User user) {
        this.f20691a = 2;
        this.f20692b = secretChatHelper;
        this.d = context;
        this.f20693c = d2Var;
        this.f20694e = bArr;
        this.f20695f = user;
    }
}
