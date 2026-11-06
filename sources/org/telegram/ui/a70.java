package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class a70 implements RequestDelegate {
    public final int f43583a;
    public final LaunchActivity f43584b;
    public final int f43585c;
    public final q10 d;
    public final Object f43586e;
    public final Object f43587f;
    public final Object f43588g;
    public final Object h;
    public final Object f43589i;

    public a70(LaunchActivity launchActivity, q10 q10Var, int i7, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2, String str3) {
        this.f43583a = 0;
        this.f43584b = launchActivity;
        this.d = q10Var;
        this.f43585c = i7;
        this.f43589i = authorizationform;
        this.f43586e = getauthorizationform;
        this.f43587f = str;
        this.f43588g = str2;
        this.h = str3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.f43583a;
        Object obj = this.h;
        Object obj2 = this.f43588g;
        Object obj3 = this.f43587f;
        Object obj4 = this.f43586e;
        Object obj5 = this.f43589i;
        switch (i7) {
            case 0:
                String str = LaunchActivity.B1;
                org.telegram.messenger.g0.h3(new bi.p9(this.f43584b, this.d, tLObject, this.f43585c, (TL_account.authorizationForm) obj5, (TL_account.getAuthorizationForm) obj4, (String) obj3, (String) obj2, (String) obj, 2));
                return;
            case 1:
                int[] iArr = (int[]) obj5;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj4;
                String str2 = (String) obj3;
                String str3 = (String) obj2;
                String str4 = (String) obj;
                String str5 = LaunchActivity.B1;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) tLObject;
                LaunchActivity launchActivity = this.f43584b;
                q10 q10Var = this.d;
                if (authorizationform != null) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    int i10 = this.f43585c;
                    iArr[0] = ConnectionsManager.getInstance(i10).sendRequest(getpassword, new a70(launchActivity, q10Var, i10, authorizationform, getauthorizationform, str2, str3, str4));
                    return;
                }
                org.telegram.messenger.g0.h3(new rp(launchActivity, q10Var, tL_error, 15));
                return;
            default:
                String str6 = LaunchActivity.B1;
                org.telegram.messenger.g0.h3(new bi.p9(this.f43584b, tLObject, (int[]) obj5, this.f43585c, this.d, (Integer) obj4, (Integer) obj3, (Long) obj2, (Integer) obj, 1));
                return;
        }
    }

    public a70(LaunchActivity launchActivity, int[] iArr, int i7, q10 q10Var, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f43583a = i10;
        this.f43584b = launchActivity;
        this.f43589i = iArr;
        this.f43585c = i7;
        this.d = q10Var;
        this.f43586e = obj;
        this.f43587f = obj2;
        this.f43588g = obj3;
        this.h = obj4;
    }
}
