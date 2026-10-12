package org.telegram.ui;

import java.util.HashSet;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class df implements Runnable {
    public final int f36777a;
    public final Object f36778b;
    public final Object f36779c;
    public final Object d;
    public final Object f36780e;
    public final Object f36781f;
    public final Object h;
    public final Object f36782n;

    public df(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i10) {
        this.f36777a = i10;
        this.f36778b = obj;
        this.d = obj2;
        this.f36780e = obj3;
        this.f36781f = obj4;
        this.f36779c = obj5;
        this.h = obj6;
        this.f36782n = obj7;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.df.run():void");
    }

    public df(Object obj, Object obj2, Object obj3, String str, Object obj4, Object obj5, Object obj6, int i10) {
        this.f36777a = i10;
        this.f36778b = obj;
        this.d = obj2;
        this.f36780e = obj3;
        this.f36779c = str;
        this.f36781f = obj4;
        this.h = obj5;
        this.f36782n = obj6;
    }

    public df(Object obj, Object obj2, String str, TLObject tLObject, Object obj3, Object obj4, Object obj5, int i10) {
        this.f36777a = i10;
        this.f36778b = obj;
        this.d = obj2;
        this.f36779c = str;
        this.f36780e = tLObject;
        this.f36781f = obj3;
        this.h = obj4;
        this.f36782n = obj5;
    }

    public df(pn pnVar, org.telegram.ui.ActionBar.a2 a2Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, MessageObject messageObject, TLRPC.TL_error tL_error) {
        this.f36777a = 2;
        this.f36778b = pnVar;
        this.d = a2Var;
        this.f36781f = tLObject;
        this.f36779c = hashSet;
        this.h = tL_inputGroupCallInviteMessage;
        this.f36780e = messageObject;
        this.f36782n = tL_error;
    }

    public df(eo eoVar, TLRPC.TL_error tL_error, TLObject tLObject, TLObject tLObject2, hf hfVar, String str, of.e eVar) {
        this.f36777a = 1;
        this.f36778b = eoVar;
        this.d = tL_error;
        this.f36780e = tLObject;
        this.f36781f = tLObject2;
        this.h = hfVar;
        this.f36779c = str;
        this.f36782n = eVar;
    }
}
