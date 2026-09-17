package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class e90 implements RequestDelegate {
    public final int f33328a;
    public final LaunchActivity f33329b;
    public final int f33330c;
    public final oa0 d;
    public final Object e;
    public final Object f33331f;
    public final Object f33332g;
    public final Object h;
    public final Object f33333i;

    public e90(LaunchActivity launchActivity, oa0 oa0Var, int i10, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2, String str3) {
        this.f33328a = 0;
        this.f33329b = launchActivity;
        this.d = oa0Var;
        this.f33330c = i10;
        this.f33333i = authorizationform;
        this.e = getauthorizationform;
        this.f33331f = str;
        this.f33332g = str2;
        this.h = str3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f33328a;
        Object obj = this.h;
        Object obj2 = this.f33332g;
        Object obj3 = this.f33331f;
        Object obj4 = this.e;
        Object obj5 = this.f33333i;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.jb(this.f33329b, this.d, tLObject, this.f33330c, (TL_account.authorizationForm) obj5, (TL_account.getAuthorizationForm) obj4, (String) obj3, (String) obj2, (String) obj, 2));
                return;
            case 1:
                int[] iArr = (int[]) obj5;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj4;
                String str = (String) obj3;
                String str2 = (String) obj2;
                String str3 = (String) obj;
                Pattern pattern2 = LaunchActivity.B1;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) tLObject;
                LaunchActivity launchActivity = this.f33329b;
                oa0 oa0Var = this.d;
                if (authorizationform != null) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    int i11 = this.f33330c;
                    iArr[0] = ConnectionsManager.getInstance(i11).sendRequest(getpassword, new e90(launchActivity, oa0Var, i11, authorizationform, getauthorizationform, str, str2, str3));
                    return;
                }
                AndroidUtilities.runOnUIThread(new xq(launchActivity, oa0Var, tL_error, 14));
                return;
            default:
                Pattern pattern3 = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.jb(this.f33329b, tLObject, (int[]) obj5, this.f33330c, this.d, (Integer) obj4, (Integer) obj3, (Long) obj2, (Integer) obj, 3));
                return;
        }
    }

    public e90(LaunchActivity launchActivity, int[] iArr, int i10, oa0 oa0Var, Object obj, Object obj2, Object obj3, Object obj4, int i11) {
        this.f33328a = i11;
        this.f33329b = launchActivity;
        this.f33333i = iArr;
        this.f33330c = i10;
        this.d = oa0Var;
        this.e = obj;
        this.f33331f = obj2;
        this.f33332g = obj3;
        this.h = obj4;
    }
}
