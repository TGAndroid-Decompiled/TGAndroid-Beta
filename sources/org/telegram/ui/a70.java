package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class a70 implements RequestDelegate {
    public final int f45484a;
    public final LaunchActivity f45485b;
    public final int f45486c;
    public final n60 d;
    public final Object f45487e;
    public final Object f45488f;
    public final Object f45489g;
    public final Object h;
    public final Object f45490i;

    public a70(LaunchActivity launchActivity, n60 n60Var, int i7, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2, String str3) {
        this.f45484a = 0;
        this.f45485b = launchActivity;
        this.d = n60Var;
        this.f45486c = i7;
        this.f45490i = authorizationform;
        this.f45487e = getauthorizationform;
        this.f45488f = str;
        this.f45489g = str2;
        this.h = str3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.f45484a;
        Object obj = this.h;
        Object obj2 = this.f45489g;
        Object obj3 = this.f45488f;
        Object obj4 = this.f45487e;
        Object obj5 = this.f45490i;
        switch (i7) {
            case 0:
                String str = LaunchActivity.C1;
                org.telegram.messenger.g0.g3(new di.j8(this.f45485b, this.d, tLObject, this.f45486c, (TL_account.authorizationForm) obj5, (TL_account.getAuthorizationForm) obj4, (String) obj3, (String) obj2, (String) obj, 3));
                return;
            case 1:
                int[] iArr = (int[]) obj5;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj4;
                String str2 = (String) obj3;
                String str3 = (String) obj2;
                String str4 = (String) obj;
                String str5 = LaunchActivity.C1;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) tLObject;
                LaunchActivity launchActivity = this.f45485b;
                n60 n60Var = this.d;
                if (authorizationform != null) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    int i10 = this.f45486c;
                    iArr[0] = ConnectionsManager.getInstance(i10).sendRequest(getpassword, new a70(launchActivity, n60Var, i10, authorizationform, getauthorizationform, str2, str3, str4));
                    return;
                }
                org.telegram.messenger.g0.g3(new up(launchActivity, n60Var, tL_error, 15));
                return;
            default:
                String str6 = LaunchActivity.C1;
                org.telegram.messenger.g0.g3(new di.j8(this.f45485b, tLObject, (int[]) obj5, this.f45486c, this.d, (Integer) obj4, (Integer) obj3, (Long) obj2, (Integer) obj, 2));
                return;
        }
    }

    public a70(LaunchActivity launchActivity, int[] iArr, int i7, n60 n60Var, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f45484a = i10;
        this.f45485b = launchActivity;
        this.f45490i = iArr;
        this.f45486c = i7;
        this.d = n60Var;
        this.f45487e = obj;
        this.f45488f = obj2;
        this.f45489g = obj3;
        this.h = obj4;
    }
}
