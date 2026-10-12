package org.telegram.ui;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class oh1 implements RequestDelegate {
    public final int f40720a;
    public final Object f40721b;
    public final Object f40722c;
    public final Object d;
    public final Object f40723e;
    public final Object f40724f;
    public final Object f40725g;

    public oh1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f40720a = i10;
        this.f40721b = obj;
        this.f40722c = obj2;
        this.d = obj3;
        this.f40723e = obj4;
        this.f40724f = obj5;
        this.f40725g = obj6;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f40720a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ii.k((UserInfoActivity) this.f40721b, tL_error, (TLObject) this.f40722c, (TL_account.TL_birthday) this.d, (TLRPC.UserFull) this.f40723e, tLObject, (int[]) this.f40724f, (ArrayList) this.f40725g));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new ii.k(tL_error, (tg.u) this.f40721b, tLObject, (List) this.f40722c, (c5.h) this.d, (tg.u) this.f40723e, (org.telegram.ui.ActionBar.m2) this.f40724f, (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f40725g, 7));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new ii.k(tL_error, (Utilities.Callback) this.f40721b, tLObject, (List) this.f40722c, (c5.h) this.d, (Utilities.Callback) this.f40723e, (org.telegram.ui.ActionBar.m2) this.f40724f, (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f40725g, 8));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new ii.k(tLObject, (c5.o) this.f40721b, (c5.h) this.f40722c, (qh.r) this.d, (Activity) this.f40723e, (TLRPC.TL_inputStorePaymentStarsGiveaway) this.f40724f, (List) this.f40725g, tL_error, 9));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ii.k(tLObject, (c5.o) this.f40721b, (c5.h) this.f40722c, (org.telegram.ui.Components.j90) this.d, (Activity) this.f40723e, (TLRPC.TL_inputStorePaymentStarsGift) this.f40724f, (List) this.f40725g, tL_error, 10));
                return;
        }
    }
}
