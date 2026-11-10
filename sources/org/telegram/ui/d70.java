package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class d70 implements RequestDelegate {
    public final int f44916a;
    public final LaunchActivity f44917b;
    public final int f44918c;
    public final f10 d;
    public final Object f44919e;
    public final Object f44920f;
    public final Object f44921g;
    public final Object h;
    public final Object f44922i;

    public d70(LaunchActivity launchActivity, f10 f10Var, int i7, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2, String str3) {
        this.f44916a = 0;
        this.f44917b = launchActivity;
        this.d = f10Var;
        this.f44918c = i7;
        this.f44922i = authorizationform;
        this.f44919e = getauthorizationform;
        this.f44920f = str;
        this.f44921g = str2;
        this.h = str3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.f44916a;
        Object obj = this.h;
        Object obj2 = this.f44921g;
        Object obj3 = this.f44920f;
        Object obj4 = this.f44919e;
        Object obj5 = this.f44922i;
        switch (i7) {
            case 0:
                String str = LaunchActivity.B1;
                org.telegram.messenger.g0.h3(new bi.p9(this.f44917b, this.d, tLObject, this.f44918c, (TL_account.authorizationForm) obj5, (TL_account.getAuthorizationForm) obj4, (String) obj3, (String) obj2, (String) obj, 2));
                return;
            case 1:
                int[] iArr = (int[]) obj5;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj4;
                String str2 = (String) obj3;
                String str3 = (String) obj2;
                String str4 = (String) obj;
                String str5 = LaunchActivity.B1;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) tLObject;
                LaunchActivity launchActivity = this.f44917b;
                f10 f10Var = this.d;
                if (authorizationform != null) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    int i10 = this.f44918c;
                    iArr[0] = ConnectionsManager.getInstance(i10).sendRequest(getpassword, new d70(launchActivity, f10Var, i10, authorizationform, getauthorizationform, str2, str3, str4));
                    return;
                }
                org.telegram.messenger.g0.h3(new tp(launchActivity, f10Var, tL_error, 15));
                return;
            default:
                String str6 = LaunchActivity.B1;
                org.telegram.messenger.g0.h3(new bi.p9(this.f44917b, tLObject, (int[]) obj5, this.f44918c, this.d, (Integer) obj4, (Integer) obj3, (Long) obj2, (Integer) obj, 1));
                return;
        }
    }

    public d70(LaunchActivity launchActivity, int[] iArr, int i7, f10 f10Var, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f44916a = i10;
        this.f44917b = launchActivity;
        this.f44922i = iArr;
        this.f44918c = i7;
        this.d = f10Var;
        this.f44919e = obj;
        this.f44920f = obj2;
        this.f44921g = obj3;
        this.h = obj4;
    }
}
