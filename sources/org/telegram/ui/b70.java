package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class b70 implements RequestDelegate {
    public final int f45801a;
    public final LaunchActivity f45802b;
    public final int f45803c;
    public final h60 d;
    public final Object f45804e;
    public final Object f45805f;
    public final Object f45806g;
    public final Object h;
    public final Object f45807i;

    public b70(LaunchActivity launchActivity, h60 h60Var, int i7, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2, String str3) {
        this.f45801a = 0;
        this.f45802b = launchActivity;
        this.d = h60Var;
        this.f45803c = i7;
        this.f45807i = authorizationform;
        this.f45804e = getauthorizationform;
        this.f45805f = str;
        this.f45806g = str2;
        this.h = str3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.f45801a;
        Object obj = this.h;
        Object obj2 = this.f45806g;
        Object obj3 = this.f45805f;
        Object obj4 = this.f45804e;
        Object obj5 = this.f45807i;
        switch (i7) {
            case 0:
                String str = LaunchActivity.C1;
                org.telegram.messenger.g0.g3(new di.k8(this.f45802b, this.d, tLObject, this.f45803c, (TL_account.authorizationForm) obj5, (TL_account.getAuthorizationForm) obj4, (String) obj3, (String) obj2, (String) obj, 3));
                return;
            case 1:
                int[] iArr = (int[]) obj5;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj4;
                String str2 = (String) obj3;
                String str3 = (String) obj2;
                String str4 = (String) obj;
                String str5 = LaunchActivity.C1;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) tLObject;
                LaunchActivity launchActivity = this.f45802b;
                h60 h60Var = this.d;
                if (authorizationform != null) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    int i10 = this.f45803c;
                    iArr[0] = ConnectionsManager.getInstance(i10).sendRequest(getpassword, new b70(launchActivity, h60Var, i10, authorizationform, getauthorizationform, str2, str3, str4));
                    return;
                }
                org.telegram.messenger.g0.g3(new up(launchActivity, h60Var, tL_error, 15));
                return;
            default:
                String str6 = LaunchActivity.C1;
                org.telegram.messenger.g0.g3(new di.k8(this.f45802b, tLObject, (int[]) obj5, this.f45803c, this.d, (Integer) obj4, (Integer) obj3, (Long) obj2, (Integer) obj, 2));
                return;
        }
    }

    public b70(LaunchActivity launchActivity, int[] iArr, int i7, h60 h60Var, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f45801a = i10;
        this.f45802b = launchActivity;
        this.f45807i = iArr;
        this.f45803c = i7;
        this.d = h60Var;
        this.f45804e = obj;
        this.f45805f = obj2;
        this.f45806g = obj3;
        this.h = obj4;
    }
}
