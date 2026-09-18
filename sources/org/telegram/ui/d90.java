package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class d90 implements RequestDelegate {
    public final int f32903a;
    public final LaunchActivity f32904b;
    public final int f32905c;
    public final y80 d;
    public final Object e;
    public final Object f32906f;
    public final Object f32907g;
    public final Object h;
    public final Object f32908i;

    public d90(LaunchActivity launchActivity, y80 y80Var, int i10, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2, String str3) {
        this.f32903a = 0;
        this.f32904b = launchActivity;
        this.d = y80Var;
        this.f32905c = i10;
        this.f32908i = authorizationform;
        this.e = getauthorizationform;
        this.f32906f = str;
        this.f32907g = str2;
        this.h = str3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f32903a;
        Object obj = this.h;
        Object obj2 = this.f32907g;
        Object obj3 = this.f32906f;
        Object obj4 = this.e;
        Object obj5 = this.f32908i;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.jb(this.f32904b, this.d, tLObject, this.f32905c, (TL_account.authorizationForm) obj5, (TL_account.getAuthorizationForm) obj4, (String) obj3, (String) obj2, (String) obj, 2));
                return;
            case 1:
                int[] iArr = (int[]) obj5;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj4;
                String str = (String) obj3;
                String str2 = (String) obj2;
                String str3 = (String) obj;
                Pattern pattern2 = LaunchActivity.B1;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) tLObject;
                LaunchActivity launchActivity = this.f32904b;
                y80 y80Var = this.d;
                if (authorizationform != null) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    int i11 = this.f32905c;
                    iArr[0] = ConnectionsManager.getInstance(i11).sendRequest(getpassword, new d90(launchActivity, y80Var, i11, authorizationform, getauthorizationform, str, str2, str3));
                    return;
                }
                AndroidUtilities.runOnUIThread(new vq(launchActivity, y80Var, tL_error, 14));
                return;
            default:
                Pattern pattern3 = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.jb(this.f32904b, tLObject, (int[]) obj5, this.f32905c, this.d, (Integer) obj4, (Integer) obj3, (Long) obj2, (Integer) obj, 3));
                return;
        }
    }

    public d90(LaunchActivity launchActivity, int[] iArr, int i10, y80 y80Var, Object obj, Object obj2, Object obj3, Object obj4, int i11) {
        this.f32903a = i11;
        this.f32904b = launchActivity;
        this.f32908i = iArr;
        this.f32905c = i10;
        this.d = y80Var;
        this.e = obj;
        this.f32906f = obj2;
        this.f32907g = obj3;
        this.h = obj4;
    }
}
