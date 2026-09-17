package org.telegram.ui;

import android.view.KeyEvent;
import java.util.HashSet;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class af implements Runnable {
    public final int f31838a;
    public final Object f31839b;
    public final Object f31840c;
    public final Object d;
    public final Object e;
    public final Object f31841f;
    public final Object h;
    public final Object f31842n;

    public af(KeyEvent.Callback callback, Object obj, Object obj2, String str, Object obj3, TLObject tLObject, Object obj4, int i10) {
        this.f31838a = i10;
        this.f31839b = callback;
        this.d = obj;
        this.e = obj2;
        this.f31840c = str;
        this.f31841f = obj3;
        this.h = tLObject;
        this.f31842n = obj4;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.af.run():void");
    }

    public af(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i10) {
        this.f31838a = i10;
        this.f31839b = obj;
        this.d = obj2;
        this.e = obj3;
        this.f31841f = obj4;
        this.f31840c = obj5;
        this.h = obj6;
        this.f31842n = obj7;
    }

    public af(Object obj, Object obj2, String str, TLObject tLObject, Object obj3, Object obj4, Object obj5, int i10) {
        this.f31838a = i10;
        this.f31839b = obj;
        this.d = obj2;
        this.f31840c = str;
        this.e = tLObject;
        this.f31841f = obj3;
        this.h = obj4;
        this.f31842n = obj5;
    }

    public af(nn nnVar, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, MessageObject messageObject, TLRPC.TL_error tL_error) {
        this.f31838a = 2;
        this.f31839b = nnVar;
        this.d = c2Var;
        this.f31841f = tLObject;
        this.f31840c = hashSet;
        this.h = tL_inputGroupCallInviteMessage;
        this.e = messageObject;
        this.f31842n = tL_error;
    }

    public af(bo boVar, TLRPC.TL_error tL_error, TLObject tLObject, TLObject tLObject2, og ogVar, String str, nf.e eVar) {
        this.f31838a = 1;
        this.f31839b = boVar;
        this.d = tL_error;
        this.e = tLObject;
        this.f31841f = tLObject2;
        this.h = ogVar;
        this.f31840c = str;
        this.f31842n = eVar;
    }
}
