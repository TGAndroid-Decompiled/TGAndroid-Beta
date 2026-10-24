package org.telegram.messenger;

import android.content.Context;
import android.os.Bundle;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y9 implements RequestDelegate {
    public final int f20206a;
    public final BaseController f20207b;
    public final Object f20208c;
    public final Object d;
    public final Object e;
    public final Object f20209f;

    public y9(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f20206a = i10;
        this.f20207b = baseController;
        this.f20208c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f20209f = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20206a) {
            case 0:
                ((MessagesController) this.f20207b).lambda$checkCanOpenChat$455((org.telegram.ui.ActionBar.c2) this.f20208c, (pf.c) this.d, (org.telegram.ui.ActionBar.o2) this.e, (Bundle) this.f20209f, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f20207b).lambda$didReceivedNotification$50((TLRPC.TL_theme) this.f20208c, (org.telegram.ui.ActionBar.j6) this.d, (TLRPC.TL_inputThemeSettings) this.e, (org.telegram.ui.ActionBar.i6) this.f20209f, tLObject, tL_error);
                return;
            case 2:
                ((SecretChatHelper) this.f20207b).lambda$startSecretChat$28((Context) this.d, (org.telegram.ui.ActionBar.c2) this.f20208c, (byte[]) this.e, (TLRPC.User) this.f20209f, tLObject, tL_error);
                return;
            default:
                ((SendMessagesHelper) this.f20207b).lambda$performSendDelayedMessage$59((TLRPC.InputMedia) this.f20208c, (SendMessagesHelper.DelayedMessage) this.d, (String) this.e, (MessageObject) this.f20209f, tLObject, tL_error);
                return;
        }
    }

    public y9(SecretChatHelper secretChatHelper, Context context, org.telegram.ui.ActionBar.c2 c2Var, byte[] bArr, TLRPC.User user) {
        this.f20206a = 2;
        this.f20207b = secretChatHelper;
        this.d = context;
        this.f20208c = c2Var;
        this.e = bArr;
        this.f20209f = user;
    }
}
