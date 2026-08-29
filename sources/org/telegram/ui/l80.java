package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class l80 implements RequestDelegate {
    public final int f40116a;
    public final LaunchActivity f40117b;
    public final int f40118c;
    public final x60 d;
    public final Object f40119e;
    public final Object f40120f;
    public final Object f40121g;
    public final Object h;
    public final Object f40122i;

    public l80(LaunchActivity launchActivity, x60 x60Var, int i10, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2, String str3) {
        this.f40116a = 0;
        this.f40117b = launchActivity;
        this.d = x60Var;
        this.f40118c = i10;
        this.f40122i = authorizationform;
        this.f40119e = getauthorizationform;
        this.f40120f = str;
        this.f40121g = str2;
        this.h = str3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f40116a;
        Object obj = this.h;
        Object obj2 = this.f40121g;
        Object obj3 = this.f40120f;
        Object obj4 = this.f40119e;
        Object obj5 = this.f40122i;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.f35560x1;
                AndroidUtilities.runOnUIThread(new jh.r6(this.f40117b, this.d, tLObject, this.f40118c, (TL_account.authorizationForm) obj5, (TL_account.getAuthorizationForm) obj4, (String) obj3, (String) obj2, (String) obj, 3));
                return;
            case 1:
                int[] iArr = (int[]) obj5;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj4;
                String str = (String) obj3;
                String str2 = (String) obj2;
                String str3 = (String) obj;
                Pattern pattern2 = LaunchActivity.f35560x1;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) tLObject;
                LaunchActivity launchActivity = this.f40117b;
                x60 x60Var = this.d;
                if (authorizationform != null) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    int i11 = this.f40118c;
                    iArr[0] = ConnectionsManager.getInstance(i11).sendRequest(getpassword, new l80(launchActivity, x60Var, i11, authorizationform, getauthorizationform, str, str2, str3));
                    return;
                }
                AndroidUtilities.runOnUIThread(new lq(launchActivity, x60Var, tL_error, 14));
                return;
            default:
                Pattern pattern3 = LaunchActivity.f35560x1;
                AndroidUtilities.runOnUIThread(new jh.r6(this.f40117b, tLObject, (int[]) obj5, this.f40118c, this.d, (Integer) obj4, (Integer) obj3, (Long) obj2, (Integer) obj, 4));
                return;
        }
    }

    public l80(LaunchActivity launchActivity, int[] iArr, int i10, x60 x60Var, Object obj, Object obj2, Object obj3, Object obj4, int i11) {
        this.f40116a = i11;
        this.f40117b = launchActivity;
        this.f40122i = iArr;
        this.f40118c = i10;
        this.d = x60Var;
        this.f40119e = obj;
        this.f40120f = obj2;
        this.f40121g = obj3;
        this.h = obj4;
    }
}
