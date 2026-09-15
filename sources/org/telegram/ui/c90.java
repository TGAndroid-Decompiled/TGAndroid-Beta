package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class c90 implements RequestDelegate {
    public final int f32715a;
    public final LaunchActivity f32716b;
    public final int f32717c;
    public final ma0 d;
    public final Object e;
    public final Object f32718f;
    public final Object f32719g;
    public final Object h;
    public final Object f32720i;

    public c90(LaunchActivity launchActivity, ma0 ma0Var, int i10, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2, String str3) {
        this.f32715a = 0;
        this.f32716b = launchActivity;
        this.d = ma0Var;
        this.f32717c = i10;
        this.f32720i = authorizationform;
        this.e = getauthorizationform;
        this.f32718f = str;
        this.f32719g = str2;
        this.h = str3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f32715a;
        Object obj = this.h;
        Object obj2 = this.f32719g;
        Object obj3 = this.f32718f;
        Object obj4 = this.e;
        Object obj5 = this.f32720i;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.jb(this.f32716b, this.d, tLObject, this.f32717c, (TL_account.authorizationForm) obj5, (TL_account.getAuthorizationForm) obj4, (String) obj3, (String) obj2, (String) obj, 2));
                return;
            case 1:
                int[] iArr = (int[]) obj5;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj4;
                String str = (String) obj3;
                String str2 = (String) obj2;
                String str3 = (String) obj;
                Pattern pattern2 = LaunchActivity.B1;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) tLObject;
                LaunchActivity launchActivity = this.f32716b;
                ma0 ma0Var = this.d;
                if (authorizationform != null) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    int i11 = this.f32717c;
                    iArr[0] = ConnectionsManager.getInstance(i11).sendRequest(getpassword, new c90(launchActivity, ma0Var, i11, authorizationform, getauthorizationform, str, str2, str3));
                    return;
                }
                AndroidUtilities.runOnUIThread(new xq(launchActivity, ma0Var, tL_error, 14));
                return;
            default:
                Pattern pattern3 = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.jb(this.f32716b, tLObject, (int[]) obj5, this.f32717c, this.d, (Integer) obj4, (Integer) obj3, (Long) obj2, (Integer) obj, 3));
                return;
        }
    }

    public c90(LaunchActivity launchActivity, int[] iArr, int i10, ma0 ma0Var, Object obj, Object obj2, Object obj3, Object obj4, int i11) {
        this.f32715a = i11;
        this.f32716b = launchActivity;
        this.f32720i = iArr;
        this.f32717c = i10;
        this.d = ma0Var;
        this.e = obj;
        this.f32718f = obj2;
        this.f32719g = obj3;
        this.h = obj4;
    }
}
