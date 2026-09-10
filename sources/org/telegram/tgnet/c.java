package org.telegram.tgnet;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.p2;
import xh.v5;
import xh.x3;
import zh.x5;
import zh.z5;
public final class c implements Runnable {
    public final int f17357a;
    public final long f17358b;
    public final Object f17359c;
    public final Object d;
    public final TLObject e;
    public final Object f17360f;
    public final Object h;

    public c(Object obj, Object obj2, long j3, TLObject tLObject, Object obj3, Object obj4, int i10) {
        this.f17357a = i10;
        this.f17359c = obj;
        this.d = obj2;
        this.f17358b = j3;
        this.e = tLObject;
        this.f17360f = obj3;
        this.h = obj4;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.tgnet.c.run():void");
    }

    public c(ConnectionsManager connectionsManager, RequestDelegate requestDelegate, TLObject tLObject, TLRPC.TL_error tL_error, RequestDelegateTimestamp requestDelegateTimestamp, long j3) {
        this.f17357a = 0;
        this.f17359c = connectionsManager;
        this.d = requestDelegate;
        this.e = tLObject;
        this.f17360f = tL_error;
        this.h = requestDelegateTimestamp;
        this.f17358b = j3;
    }

    public c(p2 p2Var, TLObject tLObject, MessagesController.DialogFilter dialogFilter, TLRPC.TL_error tL_error, Runnable runnable, long j3) {
        this.f17357a = 2;
        this.f17359c = p2Var;
        this.e = tLObject;
        this.d = dialogFilter;
        this.f17360f = tL_error;
        this.h = runnable;
        this.f17358b = j3;
    }

    public c(x3 x3Var, TLObject tLObject, String str, TL_stars.InputSavedStarGift inputSavedStarGift, TLRPC.TL_error tL_error, long j3) {
        this.f17357a = 3;
        this.f17359c = x3Var;
        this.e = tLObject;
        this.d = str;
        this.h = inputSavedStarGift;
        this.f17360f = tL_error;
        this.f17358b = j3;
    }

    public c(v5 v5Var, boolean[] zArr, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j3, Utilities.Callback2 callback2) {
        this.f17357a = 5;
        this.f17359c = v5Var;
        this.d = zArr;
        this.e = tL_payments_paymentFormStarGift;
        this.f17360f = starGift;
        this.f17358b = j3;
        this.h = callback2;
    }

    public c(z5 z5Var, TLObject tLObject, long j3, View view, x5 x5Var, MessagesController messagesController) {
        this.f17357a = 6;
        this.f17359c = z5Var;
        this.e = tLObject;
        this.f17358b = j3;
        this.d = view;
        this.f17360f = x5Var;
        this.h = messagesController;
    }
}
