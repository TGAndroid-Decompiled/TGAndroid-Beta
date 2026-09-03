package org.telegram.messenger;

import android.content.Context;
import android.os.Bundle;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y9 implements RequestDelegate {
    public final int f19017a;
    public final BaseController f19018b;
    public final Object f19019c;
    public final Object d;
    public final Object e;
    public final Object f19020f;

    public y9(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f19017a = i10;
        this.f19018b = baseController;
        this.f19019c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f19020f = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19017a) {
            case 0:
                ((MessagesController) this.f19018b).lambda$checkCanOpenChat$452((org.telegram.ui.ActionBar.d2) this.f19019c, (ze.c) this.d, (org.telegram.ui.ActionBar.p2) this.e, (Bundle) this.f19020f, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f19018b).lambda$didReceivedNotification$51((TLRPC.TL_theme) this.f19019c, (org.telegram.ui.ActionBar.i6) this.d, (TLRPC.TL_inputThemeSettings) this.e, (org.telegram.ui.ActionBar.h6) this.f19020f, tLObject, tL_error);
                return;
            case 2:
                ((SecretChatHelper) this.f19018b).lambda$startSecretChat$28((Context) this.d, (org.telegram.ui.ActionBar.d2) this.f19019c, (byte[]) this.e, (TLRPC.User) this.f19020f, tLObject, tL_error);
                return;
            default:
                ((SendMessagesHelper) this.f19018b).lambda$performSendDelayedMessage$56((TLRPC.InputMedia) this.f19019c, (SendMessagesHelper.DelayedMessage) this.d, (String) this.e, (MessageObject) this.f19020f, tLObject, tL_error);
                return;
        }
    }

    public y9(SecretChatHelper secretChatHelper, Context context, org.telegram.ui.ActionBar.d2 d2Var, byte[] bArr, TLRPC.User user) {
        this.f19017a = 2;
        this.f19018b = secretChatHelper;
        this.d = context;
        this.f19019c = d2Var;
        this.e = bArr;
        this.f19020f = user;
    }
}
