package org.telegram.messenger;

import android.content.Context;
import android.os.Bundle;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y9 implements RequestDelegate {
    public final int f20137a;
    public final BaseController f20138b;
    public final Object f20139c;
    public final Object d;
    public final Object e;
    public final Object f20140f;

    public y9(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f20137a = i10;
        this.f20138b = baseController;
        this.f20139c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f20140f = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20137a) {
            case 0:
                ((MessagesController) this.f20138b).lambda$checkCanOpenChat$455((org.telegram.ui.ActionBar.b2) this.f20139c, (pf.c) this.d, (org.telegram.ui.ActionBar.n2) this.e, (Bundle) this.f20140f, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f20138b).lambda$didReceivedNotification$50((TLRPC.TL_theme) this.f20139c, (org.telegram.ui.ActionBar.g6) this.d, (TLRPC.TL_inputThemeSettings) this.e, (org.telegram.ui.ActionBar.f6) this.f20140f, tLObject, tL_error);
                return;
            case 2:
                ((SecretChatHelper) this.f20138b).lambda$startSecretChat$28((Context) this.d, (org.telegram.ui.ActionBar.b2) this.f20139c, (byte[]) this.e, (TLRPC.User) this.f20140f, tLObject, tL_error);
                return;
            default:
                ((SendMessagesHelper) this.f20138b).lambda$performSendDelayedMessage$59((TLRPC.InputMedia) this.f20139c, (SendMessagesHelper.DelayedMessage) this.d, (String) this.e, (MessageObject) this.f20140f, tLObject, tL_error);
                return;
        }
    }

    public y9(SecretChatHelper secretChatHelper, Context context, org.telegram.ui.ActionBar.b2 b2Var, byte[] bArr, TLRPC.User user) {
        this.f20137a = 2;
        this.f20138b = secretChatHelper;
        this.d = context;
        this.f20139c = b2Var;
        this.e = bArr;
        this.f20140f = user;
    }
}
