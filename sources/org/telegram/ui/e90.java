package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class e90 implements RequestDelegate {
    public final int f37031a;
    public final LaunchActivity f37032b;
    public final int f37033c;
    public final t70 d;
    public final Object f37034e;
    public final Object f37035f;
    public final Object f37036g;
    public final Object h;
    public final Object f37037i;

    public e90(LaunchActivity launchActivity, t70 t70Var, int i10, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2, String str3) {
        this.f37031a = 0;
        this.f37032b = launchActivity;
        this.d = t70Var;
        this.f37033c = i10;
        this.f37037i = authorizationform;
        this.f37034e = getauthorizationform;
        this.f37035f = str;
        this.f37036g = str2;
        this.h = str3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f37031a;
        Object obj = this.h;
        Object obj2 = this.f37036g;
        Object obj3 = this.f37035f;
        Object obj4 = this.f37034e;
        Object obj5 = this.f37037i;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.ob(this.f37032b, this.d, tLObject, this.f37033c, (TL_account.authorizationForm) obj5, (TL_account.getAuthorizationForm) obj4, (String) obj3, (String) obj2, (String) obj, 1));
                return;
            case 1:
                int[] iArr = (int[]) obj5;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj4;
                String str = (String) obj3;
                String str2 = (String) obj2;
                String str3 = (String) obj;
                Pattern pattern2 = LaunchActivity.B1;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) tLObject;
                LaunchActivity launchActivity = this.f37032b;
                t70 t70Var = this.d;
                if (authorizationform != null) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    int i11 = this.f37033c;
                    iArr[0] = ConnectionsManager.getInstance(i11).sendRequest(getpassword, new e90(launchActivity, t70Var, i11, authorizationform, getauthorizationform, str, str2, str3));
                    return;
                }
                AndroidUtilities.runOnUIThread(new yq(launchActivity, t70Var, tL_error, 14));
                return;
            default:
                Pattern pattern3 = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.ob(this.f37032b, tLObject, (int[]) obj5, this.f37033c, this.d, (Integer) obj4, (Integer) obj3, (Long) obj2, (Integer) obj, 2));
                return;
        }
    }

    public e90(LaunchActivity launchActivity, int[] iArr, int i10, t70 t70Var, Object obj, Object obj2, Object obj3, Object obj4, int i11) {
        this.f37031a = i11;
        this.f37032b = launchActivity;
        this.f37037i = iArr;
        this.f37033c = i10;
        this.d = t70Var;
        this.f37034e = obj;
        this.f37035f = obj2;
        this.f37036g = obj3;
        this.h = obj4;
    }
}
