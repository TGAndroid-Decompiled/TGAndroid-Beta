package org.telegram.ui;

import android.view.KeyEvent;
import java.util.HashSet;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bf implements Runnable {
    public final int f35124a;
    public final Object f35125b;
    public final Object f35126c;
    public final Object d;
    public final Object f35127e;
    public final Object f35128f;
    public final Object h;
    public final Object f35129n;

    public bf(KeyEvent.Callback callback, Object obj, Object obj2, String str, Object obj3, TLObject tLObject, Object obj4, int i10) {
        this.f35124a = i10;
        this.f35125b = callback;
        this.d = obj;
        this.f35127e = obj2;
        this.f35126c = str;
        this.f35128f = obj3;
        this.h = tLObject;
        this.f35129n = obj4;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bf.run():void");
    }

    public bf(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i10) {
        this.f35124a = i10;
        this.f35125b = obj;
        this.d = obj2;
        this.f35127e = obj3;
        this.f35128f = obj4;
        this.f35126c = obj5;
        this.h = obj6;
        this.f35129n = obj7;
    }

    public bf(Object obj, Object obj2, String str, TLObject tLObject, Object obj3, Object obj4, Object obj5, int i10) {
        this.f35124a = i10;
        this.f35125b = obj;
        this.d = obj2;
        this.f35126c = str;
        this.f35127e = tLObject;
        this.f35128f = obj3;
        this.h = obj4;
        this.f35129n = obj5;
    }

    public bf(kn knVar, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, MessageObject messageObject, TLRPC.TL_error tL_error) {
        this.f35124a = 2;
        this.f35125b = knVar;
        this.d = b2Var;
        this.f35128f = tLObject;
        this.f35126c = hashSet;
        this.h = tL_inputGroupCallInviteMessage;
        this.f35127e = messageObject;
        this.f35129n = tL_error;
    }

    public bf(yn ynVar, TLRPC.TL_error tL_error, TLObject tLObject, TLObject tLObject2, lg lgVar, String str, nf.e eVar) {
        this.f35124a = 1;
        this.f35125b = ynVar;
        this.d = tL_error;
        this.f35127e = tLObject;
        this.f35128f = tLObject2;
        this.h = lgVar;
        this.f35126c = str;
        this.f35129n = eVar;
    }
}
