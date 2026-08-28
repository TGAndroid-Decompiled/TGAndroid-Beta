package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class i80 implements RequestDelegate {
    public final int f39058a;
    public final LaunchActivity f39059b;
    public final int f39060c;
    public final x20 d;
    public final Object f39061e;
    public final Object f39062f;
    public final Object f39063g;
    public final Object h;
    public final Object f39064i;

    public i80(LaunchActivity launchActivity, x20 x20Var, int i9, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2, String str3) {
        this.f39058a = 0;
        this.f39059b = launchActivity;
        this.d = x20Var;
        this.f39060c = i9;
        this.f39064i = authorizationform;
        this.f39061e = getauthorizationform;
        this.f39062f = str;
        this.f39063g = str2;
        this.h = str3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i9 = this.f39058a;
        Object obj = this.h;
        Object obj2 = this.f39063g;
        Object obj3 = this.f39062f;
        Object obj4 = this.f39061e;
        Object obj5 = this.f39064i;
        switch (i9) {
            case 0:
                Pattern pattern = LaunchActivity.f35493x1;
                AndroidUtilities.runOnUIThread(new gh.u6(this.f39059b, this.d, tLObject, this.f39060c, (TL_account.authorizationForm) obj5, (TL_account.getAuthorizationForm) obj4, (String) obj3, (String) obj2, (String) obj, 3));
                return;
            case 1:
                int[] iArr = (int[]) obj5;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj4;
                String str = (String) obj3;
                String str2 = (String) obj2;
                String str3 = (String) obj;
                Pattern pattern2 = LaunchActivity.f35493x1;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) tLObject;
                LaunchActivity launchActivity = this.f39059b;
                x20 x20Var = this.d;
                if (authorizationform != null) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    int i10 = this.f39060c;
                    iArr[0] = ConnectionsManager.getInstance(i10).sendRequest(getpassword, new i80(launchActivity, x20Var, i10, authorizationform, getauthorizationform, str, str2, str3));
                    return;
                }
                AndroidUtilities.runOnUIThread(new jq(launchActivity, x20Var, tL_error, 14));
                return;
            default:
                Pattern pattern3 = LaunchActivity.f35493x1;
                AndroidUtilities.runOnUIThread(new gh.u6(this.f39059b, tLObject, (int[]) obj5, this.f39060c, this.d, (Integer) obj4, (Integer) obj3, (Long) obj2, (Integer) obj, 4));
                return;
        }
    }

    public i80(LaunchActivity launchActivity, int[] iArr, int i9, x20 x20Var, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f39058a = i10;
        this.f39059b = launchActivity;
        this.f39064i = iArr;
        this.f39060c = i9;
        this.d = x20Var;
        this.f39061e = obj;
        this.f39062f = obj2;
        this.f39063g = obj3;
        this.h = obj4;
    }
}
