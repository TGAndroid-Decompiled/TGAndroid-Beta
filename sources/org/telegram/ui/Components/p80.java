package org.telegram.ui.Components;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class p80 implements RequestDelegate {
    public final int f28228a;
    public final long f28229b;
    public final Object f28230c;
    public final Object d;
    public final Object e;

    public p80(Object obj, Object obj2, Object obj3, long j10, int i10) {
        this.f28228a = i10;
        this.f28230c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f28229b = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f28228a) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.f((org.telegram.ui.ActionBar.a2) this.f28230c, tLObject, this.f28229b, (AccountInstance) this.d, (MessagesStorage.BooleanCallback) this.e, 5));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new bi.q9((org.telegram.ui.ActionBar.m2) this.f28230c, tLObject, (MessagesController.DialogFilter) this.d, tL_error, (Runnable) this.e, this.f28229b, 3));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.f((zh.p) this.d, (org.telegram.ui.ActionBar.a2) this.f28230c, tLObject, this.f28229b, (Utilities.Callback) this.e));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new bi.q9((zh.r3) this.f28230c, tLObject, (String) this.d, (TL_stars.InputSavedStarGift) this.e, tL_error, this.f28229b, 4));
                return;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.f((zh.n5) this.f28230c, tLObject, (MessageObject) this.d, this.f28229b, (Runnable) this.e, 10));
                return;
        }
    }

    public p80(org.telegram.ui.ActionBar.a2 a2Var, long j10, AccountInstance accountInstance, MessagesStorage.BooleanCallback booleanCallback) {
        this.f28228a = 0;
        this.f28230c = a2Var;
        this.f28229b = j10;
        this.d = accountInstance;
        this.e = booleanCallback;
    }

    public p80(zh.p pVar, org.telegram.ui.ActionBar.a2 a2Var, long j10, Utilities.Callback callback) {
        this.f28228a = 2;
        this.d = pVar;
        this.f28230c = a2Var;
        this.f28229b = j10;
        this.e = callback;
    }

    public p80(zh.n5 n5Var, MessageObject messageObject, long j10, Runnable runnable) {
        this.f28228a = 4;
        this.f28230c = n5Var;
        this.d = messageObject;
        this.f28229b = j10;
        this.e = runnable;
    }
}
