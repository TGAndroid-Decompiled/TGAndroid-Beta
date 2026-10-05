package org.telegram.ui.ActionBar;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.j90;
public final class m5 implements Runnable {
    public final int f21404a;
    public final Object f21405b;
    public final Object f21406c;
    public final Object d;
    public final Object f21407e;

    public m5(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f21404a = i10;
        this.f21405b = obj;
        this.f21406c = obj2;
        this.d = obj3;
        this.f21407e = obj4;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.m5.run():void");
    }

    public m5(Object obj, Object obj2, TLObject tLObject, Object obj3, int i10) {
        this.f21404a = i10;
        this.f21406c = obj;
        this.d = obj2;
        this.f21405b = tLObject;
        this.f21407e = obj3;
    }

    public m5(n2 n2Var, TLObject tLObject, TLObject tLObject2, Object obj, int i10) {
        this.f21404a = i10;
        this.f21406c = n2Var;
        this.f21405b = tLObject;
        this.d = tLObject2;
        this.f21407e = obj;
    }

    public m5(j90 j90Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject) {
        this.f21404a = 26;
        this.f21406c = j90Var;
        this.d = tL_chatInviteExported;
        this.f21407e = tL_error;
        this.f21405b = tLObject;
    }
}
