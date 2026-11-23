package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class a70 implements RequestDelegate {
    public final int f45611a;
    public final LaunchActivity f45612b;
    public final int f45613c;
    public final i50 d;
    public final Object f45614e;
    public final Object f45615f;
    public final Object f45616g;
    public final Object h;
    public final Object f45617i;

    public a70(LaunchActivity launchActivity, i50 i50Var, int i7, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2, String str3) {
        this.f45611a = 0;
        this.f45612b = launchActivity;
        this.d = i50Var;
        this.f45613c = i7;
        this.f45617i = authorizationform;
        this.f45614e = getauthorizationform;
        this.f45615f = str;
        this.f45616g = str2;
        this.h = str3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.f45611a;
        Object obj = this.h;
        Object obj2 = this.f45616g;
        Object obj3 = this.f45615f;
        Object obj4 = this.f45614e;
        Object obj5 = this.f45617i;
        switch (i7) {
            case 0:
                String str = LaunchActivity.C1;
                org.telegram.messenger.g0.g3(new di.k8(this.f45612b, this.d, tLObject, this.f45613c, (TL_account.authorizationForm) obj5, (TL_account.getAuthorizationForm) obj4, (String) obj3, (String) obj2, (String) obj, 3));
                return;
            case 1:
                int[] iArr = (int[]) obj5;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj4;
                String str2 = (String) obj3;
                String str3 = (String) obj2;
                String str4 = (String) obj;
                String str5 = LaunchActivity.C1;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) tLObject;
                LaunchActivity launchActivity = this.f45612b;
                i50 i50Var = this.d;
                if (authorizationform != null) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    int i10 = this.f45613c;
                    iArr[0] = ConnectionsManager.getInstance(i10).sendRequest(getpassword, new a70(launchActivity, i50Var, i10, authorizationform, getauthorizationform, str2, str3, str4));
                    return;
                }
                org.telegram.messenger.g0.g3(new up(launchActivity, i50Var, tL_error, 15));
                return;
            default:
                String str6 = LaunchActivity.C1;
                org.telegram.messenger.g0.g3(new di.k8(this.f45612b, tLObject, (int[]) obj5, this.f45613c, this.d, (Integer) obj4, (Integer) obj3, (Long) obj2, (Integer) obj, 2));
                return;
        }
    }

    public a70(LaunchActivity launchActivity, int[] iArr, int i7, i50 i50Var, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f45611a = i10;
        this.f45612b = launchActivity;
        this.f45617i = iArr;
        this.f45613c = i7;
        this.d = i50Var;
        this.f45614e = obj;
        this.f45615f = obj2;
        this.f45616g = obj3;
        this.h = obj4;
    }
}
