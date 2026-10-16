package org.telegram.ui;

import java.util.HashSet;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ff implements Runnable {
    public final int f35516a;
    public final Object f35517b;
    public final Object f35518c;
    public final Object d;
    public final Object e;
    public final Object f35519f;
    public final Object h;
    public final Object f35520n;

    public ff(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i10) {
        this.f35516a = i10;
        this.f35517b = obj;
        this.d = obj2;
        this.e = obj3;
        this.f35519f = obj4;
        this.f35518c = obj5;
        this.h = obj6;
        this.f35520n = obj7;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ff.run():void");
    }

    public ff(Object obj, Object obj2, Object obj3, String str, Object obj4, Object obj5, Object obj6, int i10) {
        this.f35516a = i10;
        this.f35517b = obj;
        this.d = obj2;
        this.e = obj3;
        this.f35518c = str;
        this.f35519f = obj4;
        this.h = obj5;
        this.f35520n = obj6;
    }

    public ff(Object obj, Object obj2, String str, TLObject tLObject, Object obj3, Object obj4, Object obj5, int i10) {
        this.f35516a = i10;
        this.f35517b = obj;
        this.d = obj2;
        this.f35518c = str;
        this.e = tLObject;
        this.f35519f = obj3;
        this.h = obj4;
        this.f35520n = obj5;
    }

    public ff(qn qnVar, org.telegram.ui.ActionBar.a2 a2Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, MessageObject messageObject, TLRPC.TL_error tL_error) {
        this.f35516a = 2;
        this.f35517b = qnVar;
        this.d = a2Var;
        this.f35519f = tLObject;
        this.f35518c = hashSet;
        this.h = tL_inputGroupCallInviteMessage;
        this.e = messageObject;
        this.f35520n = tL_error;
    }

    public ff(fo foVar, TLRPC.TL_error tL_error, TLObject tLObject, TLObject tLObject2, kf kfVar, String str, pf.c cVar) {
        this.f35516a = 1;
        this.f35517b = foVar;
        this.d = tL_error;
        this.e = tLObject;
        this.f35519f = tLObject2;
        this.h = kfVar;
        this.f35518c = str;
        this.f35520n = cVar;
    }
}
