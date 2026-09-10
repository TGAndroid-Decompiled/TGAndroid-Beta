package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class c90 implements RequestDelegate {
    public final int f31574a;
    public final LaunchActivity f31575b;
    public final int f31576c;
    public final h90 d;
    public final Object e;
    public final Object f31577f;
    public final Object f31578g;
    public final Object h;
    public final Object f31579i;

    public c90(LaunchActivity launchActivity, h90 h90Var, int i10, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2, String str3) {
        this.f31574a = 0;
        this.f31575b = launchActivity;
        this.d = h90Var;
        this.f31576c = i10;
        this.f31579i = authorizationform;
        this.e = getauthorizationform;
        this.f31577f = str;
        this.f31578g = str2;
        this.h = str3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f31574a;
        Object obj = this.h;
        Object obj2 = this.f31578g;
        Object obj3 = this.f31577f;
        Object obj4 = this.e;
        Object obj5 = this.f31579i;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.qb(this.f31575b, this.d, tLObject, this.f31576c, (TL_account.authorizationForm) obj5, (TL_account.getAuthorizationForm) obj4, (String) obj3, (String) obj2, (String) obj, 2));
                return;
            case 1:
                int[] iArr = (int[]) obj5;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj4;
                String str = (String) obj3;
                String str2 = (String) obj2;
                String str3 = (String) obj;
                Pattern pattern2 = LaunchActivity.B1;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) tLObject;
                LaunchActivity launchActivity = this.f31575b;
                h90 h90Var = this.d;
                if (authorizationform != null) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    int i11 = this.f31576c;
                    iArr[0] = ConnectionsManager.getInstance(i11).sendRequest(getpassword, new c90(launchActivity, h90Var, i11, authorizationform, getauthorizationform, str, str2, str3));
                    return;
                }
                AndroidUtilities.runOnUIThread(new zq(launchActivity, h90Var, tL_error, 14));
                return;
            default:
                Pattern pattern3 = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.qb(this.f31575b, tLObject, (int[]) obj5, this.f31576c, this.d, (Integer) obj4, (Integer) obj3, (Long) obj2, (Integer) obj, 3));
                return;
        }
    }

    public c90(LaunchActivity launchActivity, int[] iArr, int i10, h90 h90Var, Object obj, Object obj2, Object obj3, Object obj4, int i11) {
        this.f31574a = i11;
        this.f31575b = launchActivity;
        this.f31579i = iArr;
        this.f31576c = i10;
        this.d = h90Var;
        this.e = obj;
        this.f31577f = obj2;
        this.f31578g = obj3;
        this.h = obj4;
    }
}
