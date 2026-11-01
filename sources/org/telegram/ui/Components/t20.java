package org.telegram.ui.Components;

import android.content.Context;
import android.os.Bundle;
import j$.util.Objects;
import java.util.HashMap;
import java.util.HashSet;
import java.util.regex.Pattern;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.LaunchActivity;
public final class t20 implements RequestDelegate {
    public final int f30501a;
    public final Object f30502b;
    public final Object f30503c;

    public t20(int i10, Object obj, Object obj2) {
        this.f30501a = i10;
        this.f30502b = obj;
        this.f30503c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f30501a;
        Object obj = this.f30503c;
        Object obj2 = this.f30502b;
        switch (i10) {
            case 0:
                org.telegram.messenger.i0.g3(new org.telegram.ui.fp((Object) ((z20) obj2), (Object) tL_error, (Object) tLObject, (Object) ((TLRPC.TL_channels_getParticipants) obj), 13));
                return;
            case 1:
                org.telegram.messenger.i0.g3(new org.telegram.ui.fp((Object) ((j80) obj2), (Object) ((TLRPC.TL_chatInviteExported) obj), (Object) tL_error, (Object) tLObject, 15));
                return;
            case 2:
                org.telegram.messenger.i0.g3(new jg((tf0) obj2, (sf0) obj, tLObject, 16));
                return;
            case 3:
                org.telegram.messenger.i0.g3(new hi0((pp0) obj2, tLObject, (Context) obj, 6));
                return;
            case 4:
                org.telegram.messenger.i0.g3(new org.telegram.ui.fp((Object) ((dx0) obj2), (Object) tL_error, (Object) tLObject, (Object) ((org.telegram.messenger.vi) obj), 21));
                return;
            case 5:
                org.telegram.messenger.i0.g3(new org.telegram.ui.fp((Object) ((org.telegram.ui.xp0) obj2), (Object) tL_error, (Object) tLObject, (Object) ((TLRPC.TL_messages_getAttachedStickers) obj), 22));
                return;
            case 6:
                org.telegram.messenger.i0.g3(new org.telegram.ui.fp((Object) ((qz0) obj2), (Object) ((org.telegram.ui.ActionBar.x1) obj), (Object) tLObject, (Object) tL_error, 23));
                return;
            case 7:
                org.telegram.messenger.i0.g3(new org.telegram.ui.fp((Object) ((n31) obj2), (Object) tL_error, (Object) tLObject, (Object) ((TLRPC.TL_textWithEntities) obj), 25));
                return;
            case 8:
                org.telegram.messenger.i0.g3(new org.telegram.ui.qq((org.telegram.ui.ky) obj2, tLObject, (org.telegram.messenger.kj) obj, 4));
                return;
            case 9:
                org.telegram.messenger.i0.g3(new org.telegram.ui.Components.voip.u(14, (org.telegram.ui.fz) obj2, (org.telegram.ui.ActionBar.x1) obj));
                return;
            case 10:
                org.telegram.messenger.i0.g3(new org.telegram.ui.Components.voip.u(18, (org.telegram.ui.h00) obj2, (org.telegram.ui.ActionBar.x1) obj));
                return;
            case 11:
                org.telegram.messenger.i0.g3(new org.telegram.ui.qq((org.telegram.ui.b00) obj2, tL_error, (org.telegram.ui.a00) obj, 8));
                return;
            case 12:
                org.telegram.messenger.i0.g3(new org.telegram.ui.Components.voip.u(20, (FiltersSetupActivity) obj2, (TLRPC.TL_messages_toggleDialogFilterTags) obj));
                return;
            case 13:
                org.telegram.messenger.i0.g3(new org.telegram.ui.fp((org.telegram.ui.i40) obj2, tL_error, tLObject, (String) obj, 29));
                return;
            case 14:
                org.telegram.ui.f60 f60Var = (org.telegram.ui.f60) obj2;
                if (Objects.equals(f60Var.f37006a.e, (String) obj)) {
                    org.telegram.messenger.i0.g3(new org.telegram.ui.Components.voip.u(28, f60Var, tLObject));
                    return;
                }
                return;
            case 15:
                org.telegram.ui.r60 r60Var = (org.telegram.ui.r60) obj2;
                String str = (String) obj;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    if (!vector.objects.isEmpty()) {
                        TLRPC.LangPackString langPackString = (TLRPC.LangPackString) vector.objects.get(0);
                        if (langPackString instanceof TLRPC.TL_langPackString) {
                            org.telegram.messenger.i0.g3(new org.telegram.ui.qq(r60Var, (TLRPC.TL_langPackString) langPackString, str, 11));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 16:
                Pattern pattern = LaunchActivity.D1;
                org.telegram.messenger.i0.g3(new org.telegram.ui.qq((LaunchActivity) obj2, tLObject, (org.telegram.ui.ActionBar.s6) obj, 18));
                return;
            case 17:
                Pattern pattern2 = LaunchActivity.D1;
                org.telegram.messenger.i0.g3(new org.telegram.ui.v50((org.telegram.ui.ActionBar.x1) obj2, tLObject, (org.telegram.ui.f) obj, tL_error, 3));
                return;
            case 18:
                org.telegram.messenger.i0.g3(new org.telegram.ui.qq((org.telegram.ui.ta0) obj2, tLObject, (String) obj, 21));
                return;
            case 19:
                org.telegram.messenger.i0.g3(new org.telegram.ui.qq((org.telegram.ui.qa0) obj2, tLObject, (TLRPC.User) obj, 22));
                return;
            case 20:
                org.telegram.messenger.i0.g3(new org.telegram.ui.v50((org.telegram.ui.qa0) obj2, tLObject, (HashSet) obj, tL_error, 5));
                return;
            case 21:
                org.telegram.ui.gf0 gf0Var = (org.telegram.ui.gf0) obj2;
                Bundle bundle = (Bundle) obj;
                if (tLObject != null && !(((TLRPC.auth_SentCode) tLObject).type instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms)) {
                    org.telegram.messenger.i0.g3(new org.telegram.ui.qq(gf0Var, bundle, tLObject, 27));
                    return;
                } else {
                    org.telegram.messenger.i0.g3(new org.telegram.ui.yb0(gf0Var, 2));
                    return;
                }
            case 22:
                org.telegram.messenger.i0.g3(new org.telegram.ui.v50((org.telegram.ui.nd0) obj2, tLObject, (String) obj, tL_error, 8));
                return;
            case 23:
                org.telegram.messenger.i0.g3(new org.telegram.ui.pd0((org.telegram.ui.le0) obj2, tL_error, (TL_account.confirmPhone) obj, false, 2));
                return;
            case 24:
                org.telegram.messenger.i0.g3(new org.telegram.ui.pd0((org.telegram.ui.ff0) obj2, tLObject, (HashMap) obj, 7));
                return;
            case 25:
                org.telegram.messenger.i0.g3(new org.telegram.ui.v50((org.telegram.ui.ff0) obj2, tL_error, tLObject, (String) obj, 12));
                return;
            case 26:
                org.telegram.messenger.i0.g3(new org.telegram.ui.pd0((org.telegram.ui.ei0) obj2, tLObject, (vg) obj, 10));
                return;
            case 27:
                org.telegram.ui.mk0 mk0Var = (org.telegram.ui.mk0) obj2;
                mk0Var.getClass();
                mk0Var.a(tL_error, (TLRPC.TL_secureValue) tLObject, (TLRPC.TL_secureValue) obj);
                return;
            case 28:
                org.telegram.messenger.i0.g3(new org.telegram.ui.pd0((org.telegram.ui.fl0) obj2, tL_error, (TL_account.verifyPhone) obj, false, 16));
                return;
            default:
                org.telegram.ui.qm0 qm0Var = (org.telegram.ui.qm0) obj2;
                TLObject tLObject2 = (TLObject) obj;
                if (tLObject instanceof TLRPC.TL_payments_validatedRequestedInfo) {
                    org.telegram.messenger.i0.g3(new org.telegram.ui.if0(18, qm0Var, (TLRPC.TL_payments_validatedRequestedInfo) tLObject));
                    return;
                } else {
                    org.telegram.messenger.i0.g3(new org.telegram.ui.rl0(qm0Var, tL_error, tLObject2, 1));
                    return;
                }
        }
    }
}
