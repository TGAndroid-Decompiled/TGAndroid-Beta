package org.telegram.ui;

import android.view.KeyEvent;
import java.util.HashSet;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bf implements Runnable {
    public final int f35069a;
    public final Object f35070b;
    public final Object f35071c;
    public final Object d;
    public final Object f35072e;
    public final Object f35073f;
    public final Object h;
    public final Object f35074n;

    public bf(KeyEvent.Callback callback, Object obj, Object obj2, String str, Object obj3, TLObject tLObject, Object obj4, int i10) {
        this.f35069a = i10;
        this.f35070b = callback;
        this.d = obj;
        this.f35072e = obj2;
        this.f35071c = str;
        this.f35073f = obj3;
        this.h = tLObject;
        this.f35074n = obj4;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bf.run():void");
    }

    public bf(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i10) {
        this.f35069a = i10;
        this.f35070b = obj;
        this.d = obj2;
        this.f35072e = obj3;
        this.f35073f = obj4;
        this.f35071c = obj5;
        this.h = obj6;
        this.f35074n = obj7;
    }

    public bf(Object obj, Object obj2, String str, TLObject tLObject, Object obj3, Object obj4, Object obj5, int i10) {
        this.f35069a = i10;
        this.f35070b = obj;
        this.d = obj2;
        this.f35071c = str;
        this.f35072e = tLObject;
        this.f35073f = obj3;
        this.h = obj4;
        this.f35074n = obj5;
    }

    public bf(kn knVar, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, MessageObject messageObject, TLRPC.TL_error tL_error) {
        this.f35069a = 2;
        this.f35070b = knVar;
        this.d = b2Var;
        this.f35073f = tLObject;
        this.f35071c = hashSet;
        this.h = tL_inputGroupCallInviteMessage;
        this.f35072e = messageObject;
        this.f35074n = tL_error;
    }

    public bf(yn ynVar, TLRPC.TL_error tL_error, TLObject tLObject, TLObject tLObject2, lg lgVar, String str, nf.e eVar) {
        this.f35069a = 1;
        this.f35070b = ynVar;
        this.d = tL_error;
        this.f35072e = tLObject;
        this.f35073f = tLObject2;
        this.h = lgVar;
        this.f35071c = str;
        this.f35074n = eVar;
    }
}
