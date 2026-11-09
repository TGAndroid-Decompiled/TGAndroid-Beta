package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class c70 implements RequestDelegate {
    public final int f44235a;
    public final LaunchActivity f44236b;
    public final int f44237c;
    public final s10 d;
    public final Object f44238e;
    public final Object f44239f;
    public final Object f44240g;
    public final Object h;
    public final Object f44241i;

    public c70(LaunchActivity launchActivity, s10 s10Var, int i7, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2, String str3) {
        this.f44235a = 0;
        this.f44236b = launchActivity;
        this.d = s10Var;
        this.f44237c = i7;
        this.f44241i = authorizationform;
        this.f44238e = getauthorizationform;
        this.f44239f = str;
        this.f44240g = str2;
        this.h = str3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.f44235a;
        Object obj = this.h;
        Object obj2 = this.f44240g;
        Object obj3 = this.f44239f;
        Object obj4 = this.f44238e;
        Object obj5 = this.f44241i;
        switch (i7) {
            case 0:
                String str = LaunchActivity.B1;
                org.telegram.messenger.g0.h3(new bi.p9(this.f44236b, this.d, tLObject, this.f44237c, (TL_account.authorizationForm) obj5, (TL_account.getAuthorizationForm) obj4, (String) obj3, (String) obj2, (String) obj, 2));
                return;
            case 1:
                int[] iArr = (int[]) obj5;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj4;
                String str2 = (String) obj3;
                String str3 = (String) obj2;
                String str4 = (String) obj;
                String str5 = LaunchActivity.B1;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) tLObject;
                LaunchActivity launchActivity = this.f44236b;
                s10 s10Var = this.d;
                if (authorizationform != null) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    int i10 = this.f44237c;
                    iArr[0] = ConnectionsManager.getInstance(i10).sendRequest(getpassword, new c70(launchActivity, s10Var, i10, authorizationform, getauthorizationform, str2, str3, str4));
                    return;
                }
                org.telegram.messenger.g0.h3(new tp(launchActivity, s10Var, tL_error, 15));
                return;
            default:
                String str6 = LaunchActivity.B1;
                org.telegram.messenger.g0.h3(new bi.p9(this.f44236b, tLObject, (int[]) obj5, this.f44237c, this.d, (Integer) obj4, (Integer) obj3, (Long) obj2, (Integer) obj, 1));
                return;
        }
    }

    public c70(LaunchActivity launchActivity, int[] iArr, int i7, s10 s10Var, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f44235a = i10;
        this.f44236b = launchActivity;
        this.f44241i = iArr;
        this.f44237c = i7;
        this.d = s10Var;
        this.f44238e = obj;
        this.f44239f = obj2;
        this.f44240g = obj3;
        this.h = obj4;
    }
}
