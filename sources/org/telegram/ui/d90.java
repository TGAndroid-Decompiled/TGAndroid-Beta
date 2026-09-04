package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class d90 implements RequestDelegate {
    public final int f35727a;
    public final LaunchActivity f35728b;
    public final int f35729c;
    public final r80 d;
    public final Object f35730e;
    public final Object f35731f;
    public final Object f35732g;
    public final Object h;
    public final Object f35733i;

    public d90(LaunchActivity launchActivity, r80 r80Var, int i10, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2, String str3) {
        this.f35727a = 0;
        this.f35728b = launchActivity;
        this.d = r80Var;
        this.f35729c = i10;
        this.f35733i = authorizationform;
        this.f35730e = getauthorizationform;
        this.f35731f = str;
        this.f35732g = str2;
        this.h = str3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f35727a;
        Object obj = this.h;
        Object obj2 = this.f35732g;
        Object obj3 = this.f35731f;
        Object obj4 = this.f35730e;
        Object obj5 = this.f35733i;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.jb(this.f35728b, this.d, tLObject, this.f35729c, (TL_account.authorizationForm) obj5, (TL_account.getAuthorizationForm) obj4, (String) obj3, (String) obj2, (String) obj, 2));
                return;
            case 1:
                int[] iArr = (int[]) obj5;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj4;
                String str = (String) obj3;
                String str2 = (String) obj2;
                String str3 = (String) obj;
                Pattern pattern2 = LaunchActivity.B1;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) tLObject;
                LaunchActivity launchActivity = this.f35728b;
                r80 r80Var = this.d;
                if (authorizationform != null) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    int i11 = this.f35729c;
                    iArr[0] = ConnectionsManager.getInstance(i11).sendRequest(getpassword, new d90(launchActivity, r80Var, i11, authorizationform, getauthorizationform, str, str2, str3));
                    return;
                }
                AndroidUtilities.runOnUIThread(new yq(launchActivity, r80Var, tL_error, 14));
                return;
            default:
                Pattern pattern3 = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.jb(this.f35728b, tLObject, (int[]) obj5, this.f35729c, this.d, (Integer) obj4, (Integer) obj3, (Long) obj2, (Integer) obj, 3));
                return;
        }
    }

    public d90(LaunchActivity launchActivity, int[] iArr, int i10, r80 r80Var, Object obj, Object obj2, Object obj3, Object obj4, int i11) {
        this.f35727a = i11;
        this.f35728b = launchActivity;
        this.f35733i = iArr;
        this.f35729c = i10;
        this.d = r80Var;
        this.f35730e = obj;
        this.f35731f = obj2;
        this.f35732g = obj3;
        this.h = obj4;
    }
}
