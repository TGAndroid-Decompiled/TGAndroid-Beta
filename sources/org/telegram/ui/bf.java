package org.telegram.ui;

import android.view.KeyEvent;
import java.util.HashSet;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bf implements Runnable {
    public final int f31246a;
    public final Object f31247b;
    public final Object f31248c;
    public final Object d;
    public final Object e;
    public final Object f31249f;
    public final Object h;
    public final Object f31250n;

    public bf(KeyEvent.Callback callback, Object obj, Object obj2, String str, Object obj3, TLObject tLObject, Object obj4, int i10) {
        this.f31246a = i10;
        this.f31247b = callback;
        this.d = obj;
        this.e = obj2;
        this.f31248c = str;
        this.f31249f = obj3;
        this.h = tLObject;
        this.f31250n = obj4;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bf.run():void");
    }

    public bf(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i10) {
        this.f31246a = i10;
        this.f31247b = obj;
        this.d = obj2;
        this.e = obj3;
        this.f31249f = obj4;
        this.f31248c = obj5;
        this.h = obj6;
        this.f31250n = obj7;
    }

    public bf(Object obj, Object obj2, String str, TLObject tLObject, Object obj3, Object obj4, Object obj5, int i10) {
        this.f31246a = i10;
        this.f31247b = obj;
        this.d = obj2;
        this.f31248c = str;
        this.e = tLObject;
        this.f31249f = obj3;
        this.h = obj4;
        this.f31250n = obj5;
    }

    public bf(pn pnVar, org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, MessageObject messageObject, TLRPC.TL_error tL_error) {
        this.f31246a = 2;
        this.f31247b = pnVar;
        this.d = d2Var;
        this.f31249f = tLObject;
        this.f31248c = hashSet;
        this.h = tL_inputGroupCallInviteMessage;
        this.e = messageObject;
        this.f31250n = tL_error;
    }

    public bf(eo eoVar, TLRPC.TL_error tL_error, TLObject tLObject, TLObject tLObject2, ng ngVar, String str, nf.e eVar) {
        this.f31246a = 1;
        this.f31247b = eoVar;
        this.d = tL_error;
        this.e = tLObject;
        this.f31249f = tLObject2;
        this.h = ngVar;
        this.f31248c = str;
        this.f31250n = eVar;
    }
}
