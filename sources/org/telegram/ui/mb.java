package org.telegram.ui;

import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
public final class mb implements RequestDelegate {
    public final int f39493a;
    public final Object f39494b;
    public final Object f39495c;
    public final Object d;
    public final Object e;

    public mb(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f39493a = i10;
        this.f39494b = obj;
        this.f39495c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite;
        int i10 = this.f39493a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.f39495c;
        Object obj4 = this.f39494b;
        switch (i10) {
            case 0:
                nb nbVar = (nb) obj4;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) obj3;
                boolean[] zArr = (boolean[]) obj2;
                org.telegram.ui.ActionBar.x1 x1Var = (org.telegram.ui.ActionBar.x1) obj;
                sb sbVar = nbVar.f39794a.f40443n;
                if (tL_error == null) {
                    tL_messages_exportedChatInvite = (TLRPC.TL_messages_exportedChatInvite) tLObject;
                    for (int i11 = 0; i11 < tL_messages_exportedChatInvite.users.size(); i11++) {
                        TLRPC.User user = tL_messages_exportedChatInvite.users.get(i11);
                        if (sbVar.f41335z0 == null) {
                            sbVar.f41335z0 = new HashMap();
                        }
                        sbVar.f41335z0.put(Long.valueOf(user.f19943id), user);
                    }
                } else {
                    tL_messages_exportedChatInvite = null;
                }
                org.telegram.messenger.i0.g3(new ag.e3(nbVar, tL_chatInviteExported, tL_messages_exportedChatInvite, zArr, x1Var, 11));
                return;
            case 1:
                org.telegram.messenger.i0.g3(new fp((qp) obj4, (org.telegram.ui.ActionBar.x1[]) obj3, (TLRPC.Chat) obj2, (org.telegram.ui.ActionBar.k2) obj, 0));
                return;
            case 2:
                org.telegram.messenger.i0.g3(new ag.e3((iq) obj4, tL_error, (TLRPC.InputCheckPasswordSRP) obj3, (TwoStepVerificationActivity) obj2, (TLRPC.TL_channels_editCreator) obj, 17));
                return;
            case 3:
                xp0 xp0Var = (xp0) obj4;
                TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = (TLRPC.TL_messages_getAttachedStickers) obj2;
                org.telegram.ui.Components.t20 t20Var = (org.telegram.ui.Components.t20) obj;
                if (tL_error != null && org.telegram.messenger.w8.r(tL_error.text) && obj3 != null) {
                    org.telegram.messenger.w8.n(xp0Var.f21584a).u(new Object[]{tL_messages_getAttachedStickers, t20Var}, obj3);
                    return;
                } else {
                    t20Var.run(tLObject, tL_error);
                    return;
                }
            case 4:
                org.telegram.messenger.i0.g3(new l90((Object) ((gf0) obj4), tL_error, (Object) ((String) obj3), (Object) ((String) obj2), (Object) ((String) obj), 2));
                return;
            case 5:
                org.telegram.messenger.i0.g3(new v8((org.telegram.ui.ActionBar.k2) ((jl0) obj4), (Object) tL_error, (Object) ((String) obj3), (Object) ((zk0) obj2), tLObject, (Object) ((TL_account.sendVerifyPhoneCode) obj), 5));
                return;
            case 6:
                org.telegram.messenger.i0.g3(new l90((Object) ((rk0) obj4), tL_error, (Object) ((kg0) obj3), (Object) ((m4.c) obj2), (Object) ((TL_account.verifyEmail) obj), 9));
                return;
            case 7:
                org.telegram.messenger.i0.g3(new l90((Object) ((PrivacyControlActivity) obj4), tL_error, (Object) ((boolean[]) obj2), (Object) ((TLRPC.GlobalPrivacySettings) obj3), (Object) ((TL_account.setGlobalPrivacySettings) obj), 13));
                return;
            case 8:
                b01 b01Var = (b01) obj4;
                b01Var.getClass();
                org.telegram.messenger.i0.g3(new v8((Object) b01Var, tLObject, (Object) ((CharSequence) obj3), (Object) tL_error, (Object) ((byte[]) obj2), (Object) ((String) obj), 6));
                return;
            case 9:
                org.telegram.messenger.i0.g3(new org.telegram.ui.web.x((org.telegram.ui.web.z0) obj4, tLObject, (org.telegram.ui.web.x0) obj3, (String) obj2, (String) obj));
                return;
            case 10:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) obj4;
                z0Var.getClass();
                org.telegram.messenger.i0.g3(new v8((Object) z0Var, tLObject, (Object) ((TLRPC.TL_messages_requestUrlAuth) obj3), (Object) ((String) obj2), (Object) tL_error, (Object) ((String) obj), 15));
                return;
            case 11:
                org.telegram.messenger.i0.g3(new v8((ph.l1) obj4, (org.telegram.ui.ActionBar.x1) obj, tLObject, (i2.g1) obj3, (org.telegram.messenger.r20) obj2, tL_error));
                return;
            case 12:
                org.telegram.messenger.i0.g3(new v8((Object) ((rh.e4) obj4), tLObject, (Object) ((mg.i2[]) obj3), (Object) ((Long) obj2), (Object) ((org.telegram.ui.Components.v41) obj), (Object) tL_error, 18));
                return;
            case 13:
                org.telegram.messenger.i0.g3(new v8((Object) ((rh.e4) obj4), tLObject, (Object) ((CharSequence) obj3), (Object) ((TL_stars.TL_starGiftUnique) obj2), (Object) ((TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) obj), (Object) tL_error, 19));
                return;
            case 14:
                org.telegram.messenger.i0.g3(new v8((Object) ((rh.e6) obj4), tLObject, (Object) ((org.telegram.messenger.kj) obj3), (Object) ((TLRPC.TL_inputInvoiceMessage) obj2), (Object) ((rh) obj), (Object) tL_error, 22));
                return;
            case 15:
                org.telegram.messenger.i0.g3(new rh.r4((Object) ((rh.e6) obj4), (Object) ((org.telegram.ui.ActionBar.x1) obj), tLObject, (Object) ((TL_stars.InputSavedStarGift) obj3), (Object) ((org.telegram.messenger.r20) obj2), 5));
                return;
            case 16:
                rh.u5 u5Var = (rh.u5) obj4;
                u5Var.getClass();
                org.telegram.messenger.i0.g3(new v8((Object) u5Var, tLObject, (Object) ((TL_stars.TL_starGiftCollection) obj3), (Object) ((rh.v5) obj2), (Object) ((org.telegram.messenger.r20) obj), (Object) tL_error, 24));
                return;
            case 17:
                org.telegram.messenger.i0.g3(new rh.r4((th.z2) obj4, (Runnable) obj3, tL_error, (TL_stories.StoryItem) obj2, (vh.u6) obj));
                return;
            case 18:
                vh.n5 n5Var = (vh.n5) obj4;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers2 = (TLRPC.TL_messages_getAttachedStickers) obj2;
                ag.c cVar = (ag.c) obj;
                if (tL_error != null && org.telegram.messenger.w8.r(tL_error.text) && storyItem != null) {
                    org.telegram.messenger.w8.n(n5Var.f51529a).u(new Object[]{tL_messages_getAttachedStickers2, cVar}, storyItem);
                    return;
                } else {
                    cVar.run(tLObject, tL_error);
                    return;
                }
            case 19:
                org.telegram.messenger.i0.g3(new v8((zf.p0) obj4, (String) obj3, tL_error, tLObject, (org.telegram.messenger.wp) obj2, (org.telegram.messenger.is) obj));
                return;
            default:
                org.telegram.messenger.i0.g3(new rh.r4((Object) ((zf.n1) obj4), (Object) ((TLRPC.TL_messages_getStickers) obj3), tLObject, (Object) ((ArrayList) obj2), (Object) ((LongSparseArray) obj), 13));
                return;
        }
    }

    public mb(Object obj, org.telegram.ui.ActionBar.x1 x1Var, Object obj2, org.telegram.messenger.r20 r20Var, int i10) {
        this.f39493a = i10;
        this.f39494b = obj;
        this.e = x1Var;
        this.f39495c = obj2;
        this.d = r20Var;
    }

    public mb(PrivacyControlActivity privacyControlActivity, boolean[] zArr, TLRPC.GlobalPrivacySettings globalPrivacySettings, TL_account.setGlobalPrivacySettings setglobalprivacysettings) {
        this.f39493a = 7;
        this.f39494b = privacyControlActivity;
        this.d = zArr;
        this.f39495c = globalPrivacySettings;
        this.e = setglobalprivacysettings;
    }
}
