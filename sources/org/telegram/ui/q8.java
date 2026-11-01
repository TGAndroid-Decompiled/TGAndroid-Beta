package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class q8 implements RequestDelegate {
    public final int f40713a;
    public final int f40714b;
    public final Object f40715c;
    public final Object d;
    public final Object e;
    public final Object f40716f;

    public q8(int i10, Object obj, Object obj2, Object obj3, Object obj4, int i11) {
        this.f40713a = i11;
        this.f40714b = i10;
        this.f40715c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f40716f = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f40713a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.f40716f;
        Object obj4 = this.f40715c;
        switch (i10) {
            case 0:
                org.telegram.messenger.i0.g3(new m4.a1(tLObject, this.f40714b, (org.telegram.ui.ActionBar.x1) obj4, (Context) obj2, (org.telegram.ui.ActionBar.p6) obj, (k50) obj3, 5));
                return;
            case 1:
                org.telegram.messenger.i0.g3(new org.telegram.messenger.ge(tL_error, tLObject, (ArrayList) obj4, this.f40714b, (AtomicInteger) obj2, (ArrayList) obj, (qq) obj3));
                return;
            case 2:
                org.telegram.messenger.i0.g3(new m4.a1((org.telegram.ui.Components.tf0) obj4, (Integer[]) obj2, this.f40714b, tLObject, (ArrayList) obj, (TLRPC.PollAnswerVoters) obj3, 8));
                return;
            case 3:
                org.telegram.messenger.i0.g3(new org.telegram.messenger.ge((org.telegram.ui.ActionBar.x1) obj4, tLObject, this.f40714b, (TLRPC.Document) obj2, tL_error, this.e, (TLRPC.TL_stickers_addStickerToSet) obj3, 6));
                return;
            case 4:
                org.telegram.messenger.i0.g3(new m4.a1((ns) obj4, (TLRPC.FileLocation) obj2, (TLRPC.InputFile) obj, tLObject, (TLRPC.FileLocation) obj3, this.f40714b, 9));
                return;
            case 5:
                org.telegram.messenger.i0.g3(new org.telegram.messenger.ge((org.telegram.ui.ActionBar.x1) obj4, (gf.e) obj, tLObject, this.f40714b, (Context) obj2, (TLRPC.TL_inputGroupCallSlug) obj3, tL_error, 7));
                return;
            case 6:
                Pattern pattern = LaunchActivity.D1;
                org.telegram.messenger.i0.g3(new org.telegram.messenger.ge((LaunchActivity) obj4, tLObject, (gf.e) obj2, tL_error, (org.telegram.messenger.wp) obj, this.f40714b, (String) obj3, 9));
                return;
            case 7:
                Pattern pattern2 = LaunchActivity.D1;
                org.telegram.messenger.i0.g3(new org.telegram.messenger.ge((LaunchActivity) obj4, tL_error, tLObject, (TLRPC.TL_inputInvoiceSlug) obj2, (y60) obj, this.f40714b, (String) obj3, 11));
                return;
            case 8:
                Pattern pattern3 = LaunchActivity.D1;
                org.telegram.messenger.i0.g3(new org.telegram.messenger.ge((LaunchActivity) obj2, tL_error, tLObject, this.f40714b, (org.telegram.ui.ActionBar.x1) obj4, (y60) obj, (String) obj3, 8));
                return;
            case 9:
                org.telegram.messenger.i0.g3(new org.telegram.messenger.ge((org.telegram.ui.web.z0) obj4, (String) obj2, tLObject, tL_error, this.f40714b, (org.telegram.ui.web.v0) obj, (org.telegram.ui.web.x0) obj3));
                return;
            case 10:
                org.telegram.messenger.i0.g3(new m4.a1(tLObject, this.f40714b, (TLRPC.PhotoSize) obj4, (TLRPC.PhotoSize) obj2, (rh) obj, (org.telegram.ui.ActionBar.z4) obj3, 13));
                return;
            case 11:
                org.telegram.messenger.i0.g3(new m4.a1((vh.d) obj4, tLObject, (org.telegram.ui.ActionBar.z2[]) obj2, (org.telegram.ui.ActionBar.p6) obj, this.f40714b, (TLRPC.TL_messages_checkChatInvite) obj3, 14));
                return;
            case 12:
                org.telegram.messenger.i0.g3(new i2.g1((vh.d) obj4, (org.telegram.ui.ActionBar.z2[]) obj2, this.f40714b, (TLObject) obj, (String) obj3, 21));
                return;
            case 13:
                org.telegram.messenger.i0.g3(new m4.a1((th.l6) obj4, tLObject, this.d, (ArrayList) obj, (boolean[]) obj3, this.f40714b, 15));
                return;
            default:
                org.telegram.messenger.i0.g3(new org.telegram.messenger.ge((zf.s0) obj4, this.f40714b, (ArrayList) obj2, (a0.h) obj, tL_error, tLObject, (org.telegram.messenger.wp) obj3));
                return;
        }
    }

    public q8(KeyEvent.Callback callback, Serializable serializable, int i10, Object obj, Object obj2, int i11) {
        this.f40713a = i11;
        this.f40715c = callback;
        this.d = serializable;
        this.f40714b = i10;
        this.e = obj;
        this.f40716f = obj2;
    }

    public q8(KeyEvent.Callback callback, Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f40713a = i11;
        this.f40715c = callback;
        this.d = obj;
        this.e = obj2;
        this.f40714b = i10;
        this.f40716f = obj3;
    }

    public q8(Object obj, int i10, Object obj2, Object obj3, Object obj4, int i11) {
        this.f40713a = i11;
        this.f40715c = obj;
        this.f40714b = i10;
        this.d = obj2;
        this.e = obj3;
        this.f40716f = obj4;
    }

    public q8(Object obj, Object obj2, Object obj3, Object obj4, int i10, int i11) {
        this.f40713a = i11;
        this.f40715c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f40716f = obj4;
        this.f40714b = i10;
    }

    public q8(org.telegram.ui.ActionBar.x1 x1Var, gf.e eVar, int i10, Context context, TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug) {
        this.f40713a = 5;
        this.f40715c = x1Var;
        this.e = eVar;
        this.f40714b = i10;
        this.d = context;
        this.f40716f = tL_inputGroupCallSlug;
    }

    public q8(LaunchActivity launchActivity, int i10, org.telegram.ui.ActionBar.x1 x1Var, y60 y60Var, String str) {
        this.f40713a = 8;
        this.d = launchActivity;
        this.f40714b = i10;
        this.f40715c = x1Var;
        this.e = y60Var;
        this.f40716f = str;
    }
}
