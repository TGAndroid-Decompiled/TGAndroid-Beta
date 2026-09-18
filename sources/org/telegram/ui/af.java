package org.telegram.ui;

import android.view.KeyEvent;
import java.util.HashSet;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class af implements Runnable {
    public final int f31842a;
    public final Object f31843b;
    public final Object f31844c;
    public final Object d;
    public final Object e;
    public final Object f31845f;
    public final Object h;
    public final Object f31846n;

    public af(KeyEvent.Callback callback, Object obj, Object obj2, String str, Object obj3, TLObject tLObject, Object obj4, int i10) {
        this.f31842a = i10;
        this.f31843b = callback;
        this.d = obj;
        this.e = obj2;
        this.f31844c = str;
        this.f31845f = obj3;
        this.h = tLObject;
        this.f31846n = obj4;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.af.run():void");
    }

    public af(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i10) {
        this.f31842a = i10;
        this.f31843b = obj;
        this.d = obj2;
        this.e = obj3;
        this.f31845f = obj4;
        this.f31844c = obj5;
        this.h = obj6;
        this.f31846n = obj7;
    }

    public af(Object obj, Object obj2, String str, TLObject tLObject, Object obj3, Object obj4, Object obj5, int i10) {
        this.f31842a = i10;
        this.f31843b = obj;
        this.d = obj2;
        this.f31844c = str;
        this.e = tLObject;
        this.f31845f = obj3;
        this.h = obj4;
        this.f31846n = obj5;
    }

    public af(nn nnVar, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, MessageObject messageObject, TLRPC.TL_error tL_error) {
        this.f31842a = 2;
        this.f31843b = nnVar;
        this.d = c2Var;
        this.f31845f = tLObject;
        this.f31844c = hashSet;
        this.h = tL_inputGroupCallInviteMessage;
        this.e = messageObject;
        this.f31846n = tL_error;
    }

    public af(bo boVar, TLRPC.TL_error tL_error, TLObject tLObject, TLObject tLObject2, og ogVar, String str, nf.e eVar) {
        this.f31842a = 1;
        this.f31843b = boVar;
        this.d = tL_error;
        this.e = tLObject;
        this.f31845f = tLObject2;
        this.h = ogVar;
        this.f31844c = str;
        this.f31846n = eVar;
    }
}
