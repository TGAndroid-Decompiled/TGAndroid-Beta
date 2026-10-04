package org.telegram.ui;

import android.view.KeyEvent;
import java.util.HashSet;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bf implements Runnable {
    public final int f35070a;
    public final Object f35071b;
    public final Object f35072c;
    public final Object d;
    public final Object f35073e;
    public final Object f35074f;
    public final Object h;
    public final Object f35075n;

    public bf(KeyEvent.Callback callback, Object obj, Object obj2, String str, Object obj3, TLObject tLObject, Object obj4, int i10) {
        this.f35070a = i10;
        this.f35071b = callback;
        this.d = obj;
        this.f35073e = obj2;
        this.f35072c = str;
        this.f35074f = obj3;
        this.h = tLObject;
        this.f35075n = obj4;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bf.run():void");
    }

    public bf(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i10) {
        this.f35070a = i10;
        this.f35071b = obj;
        this.d = obj2;
        this.f35073e = obj3;
        this.f35074f = obj4;
        this.f35072c = obj5;
        this.h = obj6;
        this.f35075n = obj7;
    }

    public bf(Object obj, Object obj2, String str, TLObject tLObject, Object obj3, Object obj4, Object obj5, int i10) {
        this.f35070a = i10;
        this.f35071b = obj;
        this.d = obj2;
        this.f35072c = str;
        this.f35073e = tLObject;
        this.f35074f = obj3;
        this.h = obj4;
        this.f35075n = obj5;
    }

    public bf(kn knVar, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, MessageObject messageObject, TLRPC.TL_error tL_error) {
        this.f35070a = 2;
        this.f35071b = knVar;
        this.d = b2Var;
        this.f35074f = tLObject;
        this.f35072c = hashSet;
        this.h = tL_inputGroupCallInviteMessage;
        this.f35073e = messageObject;
        this.f35075n = tL_error;
    }

    public bf(yn ynVar, TLRPC.TL_error tL_error, TLObject tLObject, TLObject tLObject2, lg lgVar, String str, nf.e eVar) {
        this.f35070a = 1;
        this.f35071b = ynVar;
        this.d = tL_error;
        this.f35073e = tLObject;
        this.f35074f = tLObject2;
        this.h = lgVar;
        this.f35072c = str;
        this.f35075n = eVar;
    }
}
