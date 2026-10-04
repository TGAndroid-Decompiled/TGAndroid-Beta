package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class b90 implements RequestDelegate {
    public final int f35031a;
    public final LaunchActivity f35032b;
    public final int f35033c;
    public final h90 d;
    public final Object f35034e;
    public final Object f35035f;
    public final Object f35036g;
    public final Object h;
    public final Object f35037i;

    public b90(LaunchActivity launchActivity, h90 h90Var, int i10, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2, String str3) {
        this.f35031a = 0;
        this.f35032b = launchActivity;
        this.d = h90Var;
        this.f35033c = i10;
        this.f35037i = authorizationform;
        this.f35034e = getauthorizationform;
        this.f35035f = str;
        this.f35036g = str2;
        this.h = str3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f35031a;
        Object obj = this.h;
        Object obj2 = this.f35036g;
        Object obj3 = this.f35035f;
        Object obj4 = this.f35034e;
        Object obj5 = this.f35037i;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.jb(this.f35032b, this.d, tLObject, this.f35033c, (TL_account.authorizationForm) obj5, (TL_account.getAuthorizationForm) obj4, (String) obj3, (String) obj2, (String) obj, 1));
                return;
            case 1:
                int[] iArr = (int[]) obj5;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj4;
                String str = (String) obj3;
                String str2 = (String) obj2;
                String str3 = (String) obj;
                Pattern pattern2 = LaunchActivity.B1;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) tLObject;
                LaunchActivity launchActivity = this.f35032b;
                h90 h90Var = this.d;
                if (authorizationform != null) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    int i11 = this.f35033c;
                    iArr[0] = ConnectionsManager.getInstance(i11).sendRequest(getpassword, new b90(launchActivity, h90Var, i11, authorizationform, getauthorizationform, str, str2, str3));
                    return;
                }
                AndroidUtilities.runOnUIThread(new uq(launchActivity, h90Var, tL_error, 14));
                return;
            default:
                Pattern pattern3 = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.jb(this.f35032b, tLObject, (int[]) obj5, this.f35033c, this.d, (Integer) obj4, (Integer) obj3, (Long) obj2, (Integer) obj, 2));
                return;
        }
    }

    public b90(LaunchActivity launchActivity, int[] iArr, int i10, h90 h90Var, Object obj, Object obj2, Object obj3, Object obj4, int i11) {
        this.f35031a = i11;
        this.f35032b = launchActivity;
        this.f35037i = iArr;
        this.f35033c = i10;
        this.d = h90Var;
        this.f35034e = obj;
        this.f35035f = obj2;
        this.f35036g = obj3;
        this.h = obj4;
    }
}
