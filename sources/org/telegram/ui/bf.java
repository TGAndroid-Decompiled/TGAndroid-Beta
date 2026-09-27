package org.telegram.ui;

import android.view.KeyEvent;
import java.util.HashSet;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bf implements Runnable {
    public final int f32344a;
    public final Object f32345b;
    public final Object f32346c;
    public final Object d;
    public final Object e;
    public final Object f32347f;
    public final Object h;
    public final Object f32348n;

    public bf(KeyEvent.Callback callback, Object obj, Object obj2, String str, Object obj3, TLObject tLObject, Object obj4, int i10) {
        this.f32344a = i10;
        this.f32345b = callback;
        this.d = obj;
        this.e = obj2;
        this.f32346c = str;
        this.f32347f = obj3;
        this.h = tLObject;
        this.f32348n = obj4;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bf.run():void");
    }

    public bf(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i10) {
        this.f32344a = i10;
        this.f32345b = obj;
        this.d = obj2;
        this.e = obj3;
        this.f32347f = obj4;
        this.f32346c = obj5;
        this.h = obj6;
        this.f32348n = obj7;
    }

    public bf(Object obj, Object obj2, String str, TLObject tLObject, Object obj3, Object obj4, Object obj5, int i10) {
        this.f32344a = i10;
        this.f32345b = obj;
        this.d = obj2;
        this.f32346c = str;
        this.e = tLObject;
        this.f32347f = obj3;
        this.h = obj4;
        this.f32348n = obj5;
    }

    public bf(jn jnVar, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, MessageObject messageObject, TLRPC.TL_error tL_error) {
        this.f32344a = 2;
        this.f32345b = jnVar;
        this.d = c2Var;
        this.f32347f = tLObject;
        this.f32346c = hashSet;
        this.h = tL_inputGroupCallInviteMessage;
        this.e = messageObject;
        this.f32348n = tL_error;
    }

    public bf(xn xnVar, TLRPC.TL_error tL_error, TLObject tLObject, TLObject tLObject2, kg kgVar, String str, nf.e eVar) {
        this.f32344a = 1;
        this.f32345b = xnVar;
        this.d = tL_error;
        this.e = tLObject;
        this.f32347f = tLObject2;
        this.h = kgVar;
        this.f32346c = str;
        this.f32348n = eVar;
    }
}
