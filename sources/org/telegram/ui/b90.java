package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class b90 implements RequestDelegate {
    public final int f36303a;
    public final LaunchActivity f36304b;
    public final int f36305c;
    public final n70 d;
    public final Object f36306e;
    public final Object f36307f;
    public final Object f36308g;
    public final Object h;
    public final Object f36309i;

    public b90(LaunchActivity launchActivity, n70 n70Var, int i10, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2, String str3) {
        this.f36303a = 0;
        this.f36304b = launchActivity;
        this.d = n70Var;
        this.f36305c = i10;
        this.f36309i = authorizationform;
        this.f36306e = getauthorizationform;
        this.f36307f = str;
        this.f36308g = str2;
        this.h = str3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f36303a;
        Object obj = this.h;
        Object obj2 = this.f36308g;
        Object obj3 = this.f36307f;
        Object obj4 = this.f36306e;
        Object obj5 = this.f36309i;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.lb(this.f36304b, this.d, tLObject, this.f36305c, (TL_account.authorizationForm) obj5, (TL_account.getAuthorizationForm) obj4, (String) obj3, (String) obj2, (String) obj, 1));
                return;
            case 1:
                int[] iArr = (int[]) obj5;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj4;
                String str = (String) obj3;
                String str2 = (String) obj2;
                String str3 = (String) obj;
                Pattern pattern2 = LaunchActivity.B1;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) tLObject;
                LaunchActivity launchActivity = this.f36304b;
                n70 n70Var = this.d;
                if (authorizationform != null) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    int i11 = this.f36305c;
                    iArr[0] = ConnectionsManager.getInstance(i11).sendRequest(getpassword, new b90(launchActivity, n70Var, i11, authorizationform, getauthorizationform, str, str2, str3));
                    return;
                }
                AndroidUtilities.runOnUIThread(new vq(launchActivity, n70Var, tL_error, 14));
                return;
            default:
                Pattern pattern3 = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.lb(this.f36304b, tLObject, (int[]) obj5, this.f36305c, this.d, (Integer) obj4, (Integer) obj3, (Long) obj2, (Integer) obj, 2));
                return;
        }
    }

    public b90(LaunchActivity launchActivity, int[] iArr, int i10, n70 n70Var, Object obj, Object obj2, Object obj3, Object obj4, int i11) {
        this.f36303a = i11;
        this.f36304b = launchActivity;
        this.f36309i = iArr;
        this.f36305c = i10;
        this.d = n70Var;
        this.f36306e = obj;
        this.f36307f = obj2;
        this.f36308g = obj3;
        this.h = obj4;
    }
}
