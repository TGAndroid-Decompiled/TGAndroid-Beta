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
public final class v80 implements RequestDelegate {
    public final int f31456a;
    public final long f31457b;
    public final Object f31458c;
    public final Object d;
    public final Object f31459e;

    public v80(Object obj, Object obj2, Object obj3, long j3, int i10) {
        this.f31456a = i10;
        this.f31458c = obj;
        this.d = obj2;
        this.f31459e = obj3;
        this.f31457b = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f31456a) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.f((org.telegram.ui.ActionBar.a2) this.f31458c, tLObject, this.f31457b, (AccountInstance) this.d, (MessagesStorage.BooleanCallback) this.f31459e, 5));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new ai.ha((org.telegram.ui.ActionBar.m2) this.f31458c, tLObject, (MessagesController.DialogFilter) this.d, tL_error, (Runnable) this.f31459e, this.f31457b, 3));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.f((yh.o) this.d, (org.telegram.ui.ActionBar.a2) this.f31458c, tLObject, this.f31457b, (Utilities.Callback) this.f31459e));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new ai.ha((yh.s3) this.f31458c, tLObject, (String) this.d, (TL_stars.InputSavedStarGift) this.f31459e, tL_error, this.f31457b, 4));
                return;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.f((yh.n5) this.f31458c, tLObject, (MessageObject) this.d, this.f31457b, (Runnable) this.f31459e, 10));
                return;
        }
    }

    public v80(org.telegram.ui.ActionBar.a2 a2Var, long j3, AccountInstance accountInstance, MessagesStorage.BooleanCallback booleanCallback) {
        this.f31456a = 0;
        this.f31458c = a2Var;
        this.f31457b = j3;
        this.d = accountInstance;
        this.f31459e = booleanCallback;
    }

    public v80(yh.o oVar, org.telegram.ui.ActionBar.a2 a2Var, long j3, Utilities.Callback callback) {
        this.f31456a = 2;
        this.d = oVar;
        this.f31458c = a2Var;
        this.f31457b = j3;
        this.f31459e = callback;
    }

    public v80(yh.n5 n5Var, MessageObject messageObject, long j3, Runnable runnable) {
        this.f31456a = 4;
        this.f31458c = n5Var;
        this.d = messageObject;
        this.f31457b = j3;
        this.f31459e = runnable;
    }
}
