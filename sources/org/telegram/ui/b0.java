package org.telegram.ui;

import android.content.SharedPreferences;
import android.net.Uri;
import java.util.regex.Pattern;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class b0 implements RequestDelegate {
    public final int f35872a;
    public final int f35873b;
    public final Object f35874c;
    public final Object d;
    public final Object e;

    public b0(int i10, ah0 ah0Var, org.telegram.ui.ActionBar.k2 k2Var, TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction) {
        this.f35872a = 5;
        this.f35873b = i10;
        this.f35874c = ah0Var;
        this.d = k2Var;
        this.e = tL_payments_assignPlayMarketTransaction;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f35872a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.f35874c;
        switch (i10) {
            case 0:
                org.telegram.messenger.i0.g3(new m4.a1((l60) obj3, (f4) obj2, tL_error, tLObject, this.f35873b, (c1) obj, 4));
                return;
            case 1:
                SharedPreferences sharedPreferences = (SharedPreferences) obj3;
                org.telegram.ui.ActionBar.x1 x1Var = (org.telegram.ui.ActionBar.x1) obj2;
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) obj;
                if (tL_error == null) {
                    org.telegram.messenger.i0.g3(new i2.g1(sharedPreferences, (TLRPC.TL_help_support) tLObject, x1Var, this.f35873b, k2Var, 10));
                    return;
                } else {
                    org.telegram.messenger.i0.g3(new org.telegram.ui.Components.a2(x1Var, 0));
                    return;
                }
            case 2:
                org.telegram.messenger.i0.g3(new i2.g1((org.telegram.ui.Components.vr) obj3, tLObject, (TLRPC.InputPeer) obj2, this.f35873b, (int[]) obj, 12));
                return;
            case 3:
                org.telegram.ui.Components.au0 au0Var = (org.telegram.ui.Components.au0) obj3;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) obj;
                org.telegram.messenger.i0.g3(new org.telegram.ui.Components.as((org.telegram.ui.ActionBar.x1[]) obj2, 2));
                int i11 = this.f35873b;
                if (tL_error == null) {
                    org.telegram.messenger.wp.r1(i11).L3((TLRPC.Updates) tLObject, false);
                    return;
                } else {
                    org.telegram.messenger.i0.g3(new ag.g3(au0Var, i11, tL_error, tL_messages_editMessage, 25));
                    return;
                }
            case 4:
                Pattern pattern = LaunchActivity.D1;
                org.telegram.messenger.i0.h3(new i2.g1((LaunchActivity) obj3, tLObject, (Uri) obj2, this.f35873b, (org.telegram.ui.ActionBar.x1) obj, 14), 2L);
                return;
            case 5:
                ah0 ah0Var = (ah0) obj3;
                org.telegram.ui.ActionBar.k2 k2Var2 = (org.telegram.ui.ActionBar.k2) obj2;
                TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = (TLRPC.TL_payments_assignPlayMarketTransaction) obj;
                boolean z10 = tLObject instanceof TLRPC.Updates;
                int i12 = this.f35873b;
                if (z10) {
                    org.telegram.messenger.wp.r1(i12).L3((TLRPC.Updates) tLObject, false);
                    org.telegram.messenger.i0.g3(ah0Var);
                    return;
                } else if (tL_error != null) {
                    org.telegram.messenger.i0.g3(new org.telegram.ui.Components.d11(i12, tL_error, k2Var2, tL_payments_assignPlayMarketTransaction, 10));
                    return;
                } else {
                    return;
                }
            case 6:
                org.telegram.messenger.i0.g3(new m4.a1((org.telegram.ui.web.z0) obj3, tLObject, this.f35873b, (org.telegram.ui.web.v0) obj2, (org.telegram.ui.web.x0) obj, tL_error, 12));
                return;
            case 7:
                TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = (TLRPC.TL_messages_getAttachedStickers) obj2;
                q8 q8Var = (q8) obj;
                if (tL_error != null && org.telegram.messenger.w8.r(tL_error.text) && obj3 != null) {
                    org.telegram.messenger.w8.n(this.f35873b).u(new Object[]{tL_messages_getAttachedStickers, q8Var}, obj3);
                    return;
                } else {
                    q8Var.run(tLObject, tL_error);
                    return;
                }
            default:
                org.telegram.messenger.i0.g3(new i2.g1(tLObject, (boolean[]) obj3, (org.telegram.messenger.r20) obj2, this.f35873b, (TL_account.updateEmojiStatus) obj, 23));
                return;
        }
    }

    public b0(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f35872a = i11;
        this.f35874c = obj;
        this.f35873b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    public b0(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f35872a = i11;
        this.f35874c = obj;
        this.d = obj2;
        this.f35873b = i10;
        this.e = obj3;
    }
}
