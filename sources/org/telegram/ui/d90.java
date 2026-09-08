package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class d90 implements RequestDelegate {
    public final int f35754a;
    public final LaunchActivity f35755b;
    public final int f35756c;
    public final r80 d;
    public final Object f35757e;
    public final Object f35758f;
    public final Object f35759g;
    public final Object h;
    public final Object f35760i;

    public d90(LaunchActivity launchActivity, r80 r80Var, int i10, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2, String str3) {
        this.f35754a = 0;
        this.f35755b = launchActivity;
        this.d = r80Var;
        this.f35756c = i10;
        this.f35760i = authorizationform;
        this.f35757e = getauthorizationform;
        this.f35758f = str;
        this.f35759g = str2;
        this.h = str3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f35754a;
        Object obj = this.h;
        Object obj2 = this.f35759g;
        Object obj3 = this.f35758f;
        Object obj4 = this.f35757e;
        Object obj5 = this.f35760i;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.jb(this.f35755b, this.d, tLObject, this.f35756c, (TL_account.authorizationForm) obj5, (TL_account.getAuthorizationForm) obj4, (String) obj3, (String) obj2, (String) obj, 2));
                return;
            case 1:
                int[] iArr = (int[]) obj5;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj4;
                String str = (String) obj3;
                String str2 = (String) obj2;
                String str3 = (String) obj;
                Pattern pattern2 = LaunchActivity.B1;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) tLObject;
                LaunchActivity launchActivity = this.f35755b;
                r80 r80Var = this.d;
                if (authorizationform != null) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    int i11 = this.f35756c;
                    iArr[0] = ConnectionsManager.getInstance(i11).sendRequest(getpassword, new d90(launchActivity, r80Var, i11, authorizationform, getauthorizationform, str, str2, str3));
                    return;
                }
                AndroidUtilities.runOnUIThread(new yq(launchActivity, r80Var, tL_error, 14));
                return;
            default:
                Pattern pattern3 = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.jb(this.f35755b, tLObject, (int[]) obj5, this.f35756c, this.d, (Integer) obj4, (Integer) obj3, (Long) obj2, (Integer) obj, 3));
                return;
        }
    }

    public d90(LaunchActivity launchActivity, int[] iArr, int i10, r80 r80Var, Object obj, Object obj2, Object obj3, Object obj4, int i11) {
        this.f35754a = i11;
        this.f35755b = launchActivity;
        this.f35760i = iArr;
        this.f35756c = i10;
        this.d = r80Var;
        this.f35757e = obj;
        this.f35758f = obj2;
        this.f35759g = obj3;
        this.h = obj4;
    }
}
