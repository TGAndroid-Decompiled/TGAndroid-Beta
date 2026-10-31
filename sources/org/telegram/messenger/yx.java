package org.telegram.messenger;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.gi0;
import org.telegram.ui.Components.ji0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fu0;
import org.telegram.ui.l50;
import org.telegram.ui.tz0;
public final class yx implements RequestDelegate {
    public final int f19444a;
    public final int f19445b;
    public final Object f19446c;
    public final Object d;
    public final Object e;
    public final Object f19447f;
    public final Object f19448g;

    public yx(int i10, boolean[] zArr, File file, TL_phone.setCallRating setcallrating, ArrayList arrayList, Context context) {
        this.f19444a = 3;
        this.f19445b = i10;
        this.d = zArr;
        this.e = file;
        this.f19447f = setcallrating;
        this.f19448g = arrayList;
        this.f19446c = context;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f19444a;
        int i11 = this.f19445b;
        Object obj = this.f19446c;
        Object obj2 = this.f19448g;
        Object obj3 = this.f19447f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (i10) {
            case 0:
                i0.g3(new fe((qz) obj5, tLObject, (TLRPC.InputFile) obj4, (TLRPC.InputMedia) obj3, (cz) obj2, this.f19445b, (String) obj, 1));
                return;
            case 1:
                i0.g3(new fe((org.telegram.ui.h4) obj5, this.f19445b, (gf.e) obj4, tLObject, (String) obj, (org.telegram.ui.g0) obj3, (TLRPC.TL_messages_getWebPage) obj2, 2));
                return;
            case 2:
                i0.g3(new fe(tLObject, (org.telegram.ui.ActionBar.x1) obj5, (Context) obj4, this.f19445b, (TL_phone.exportGroupCallInvite) obj3, (org.telegram.ui.ActionBar.p6) obj2, (l50) obj, 4));
                return;
            case 3:
                boolean[] zArr = (boolean[]) obj5;
                File file = (File) obj4;
                TL_phone.setCallRating setcallrating = (TL_phone.setCallRating) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                Context context = (Context) obj;
                if (tLObject instanceof TLRPC.TL_updates) {
                    vp.r1(i11).L3((TLRPC.TL_updates) tLObject, false);
                }
                if (zArr[0] && file.exists() && setcallrating.rating < 4) {
                    qz.T(c.a(d20.f15147s0), file.getAbsolutePath(), file.getAbsolutePath(), null, TextUtils.join(" ", arrayList), "text/plain", 4244000L, null, null, null, null, true, null, null);
                    Toast.makeText(context, cd.L0(2131752602, null), 1).show();
                    return;
                }
                return;
            case 4:
                String str = (String) obj;
                Pattern pattern = LaunchActivity.D1;
                i0.g3(new fe((LaunchActivity) obj5, tLObject, this.f19445b, (org.telegram.ui.ay) obj4, (org.telegram.ui.ActionBar.k2) obj3, (TLRPC.User) obj2, str, 10));
                return;
            case 5:
                i0.g3(new ce(tLObject, (org.telegram.ui.ActionBar.k2) obj5, (TLRPC.TL_inputStorePaymentPremiumSubscription) obj4, (fu0) obj3, (ba.a) obj2, this.f19445b, tL_error, (TLRPC.TL_payments_canPurchaseStore) obj));
                return;
            default:
                Context context2 = (Context) obj5;
                org.telegram.ui.ActionBar.p6 p6Var = (org.telegram.ui.ActionBar.p6) obj4;
                byte[] bArr = (byte[]) obj3;
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) obj2;
                gi0 gi0Var = (gi0) obj;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        i0.g3(new org.telegram.ui.v8(tLObject, context2, p6Var, (Object) bArr, (Object) k2Var, (Runnable) gi0Var, 7));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        i0.h3(new tz0(k2Var, context2, p6Var, gi0Var, 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        i0.h3(new ji0(k2Var, i11, gi0Var, 27), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    i0.h3(new tz0(k2Var, context2, p6Var, gi0Var, 1), 200L);
                    return;
                } else {
                    return;
                }
        }
    }

    public yx(Context context, org.telegram.ui.ActionBar.p6 p6Var, byte[] bArr, org.telegram.ui.ActionBar.k2 k2Var, gi0 gi0Var, int i10) {
        this.f19444a = 6;
        this.d = context;
        this.e = p6Var;
        this.f19447f = bArr;
        this.f19448g = k2Var;
        this.f19446c = gi0Var;
        this.f19445b = i10;
    }

    public yx(Object obj, TLObject tLObject, Object obj2, Object obj3, int i10, Object obj4, int i11) {
        this.f19444a = i11;
        this.d = obj;
        this.e = tLObject;
        this.f19447f = obj2;
        this.f19448g = obj3;
        this.f19445b = i10;
        this.f19446c = obj4;
    }

    public yx(org.telegram.ui.ActionBar.x1 x1Var, Context context, int i10, TL_phone.exportGroupCallInvite exportgroupcallinvite, org.telegram.ui.ActionBar.p6 p6Var, l50 l50Var) {
        this.f19444a = 2;
        this.d = x1Var;
        this.e = context;
        this.f19445b = i10;
        this.f19447f = exportgroupcallinvite;
        this.f19448g = p6Var;
        this.f19446c = l50Var;
    }

    public yx(org.telegram.ui.h4 h4Var, int i10, gf.e eVar, String str, org.telegram.ui.g0 g0Var, TLRPC.TL_messages_getWebPage tL_messages_getWebPage) {
        this.f19444a = 1;
        this.d = h4Var;
        this.f19445b = i10;
        this.e = eVar;
        this.f19446c = str;
        this.f19447f = g0Var;
        this.f19448g = tL_messages_getWebPage;
    }

    public yx(LaunchActivity launchActivity, int i10, org.telegram.ui.ay ayVar, org.telegram.ui.ActionBar.k2 k2Var, TLRPC.User user, String str) {
        this.f19444a = 4;
        this.d = launchActivity;
        this.f19445b = i10;
        this.e = ayVar;
        this.f19447f = k2Var;
        this.f19448g = user;
        this.f19446c = str;
    }
}
