package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class e90 implements RequestDelegate {
    public final int f37035a;
    public final LaunchActivity f37036b;
    public final int f37037c;
    public final q70 d;
    public final Object f37038e;
    public final Object f37039f;
    public final Object f37040g;
    public final Object h;
    public final Object f37041i;

    public e90(LaunchActivity launchActivity, q70 q70Var, int i10, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2, String str3) {
        this.f37035a = 0;
        this.f37036b = launchActivity;
        this.d = q70Var;
        this.f37037c = i10;
        this.f37041i = authorizationform;
        this.f37038e = getauthorizationform;
        this.f37039f = str;
        this.f37040g = str2;
        this.h = str3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f37035a;
        Object obj = this.h;
        Object obj2 = this.f37040g;
        Object obj3 = this.f37039f;
        Object obj4 = this.f37038e;
        Object obj5 = this.f37041i;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.ob(this.f37036b, this.d, tLObject, this.f37037c, (TL_account.authorizationForm) obj5, (TL_account.getAuthorizationForm) obj4, (String) obj3, (String) obj2, (String) obj, 1));
                return;
            case 1:
                int[] iArr = (int[]) obj5;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj4;
                String str = (String) obj3;
                String str2 = (String) obj2;
                String str3 = (String) obj;
                Pattern pattern2 = LaunchActivity.B1;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) tLObject;
                LaunchActivity launchActivity = this.f37036b;
                q70 q70Var = this.d;
                if (authorizationform != null) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    int i11 = this.f37037c;
                    iArr[0] = ConnectionsManager.getInstance(i11).sendRequest(getpassword, new e90(launchActivity, q70Var, i11, authorizationform, getauthorizationform, str, str2, str3));
                    return;
                }
                AndroidUtilities.runOnUIThread(new yq(launchActivity, q70Var, tL_error, 14));
                return;
            default:
                Pattern pattern3 = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.ob(this.f37036b, tLObject, (int[]) obj5, this.f37037c, this.d, (Integer) obj4, (Integer) obj3, (Long) obj2, (Integer) obj, 2));
                return;
        }
    }

    public e90(LaunchActivity launchActivity, int[] iArr, int i10, q70 q70Var, Object obj, Object obj2, Object obj3, Object obj4, int i11) {
        this.f37035a = i11;
        this.f37036b = launchActivity;
        this.f37041i = iArr;
        this.f37037c = i10;
        this.d = q70Var;
        this.f37038e = obj;
        this.f37039f = obj2;
        this.f37040g = obj3;
        this.h = obj4;
    }
}
