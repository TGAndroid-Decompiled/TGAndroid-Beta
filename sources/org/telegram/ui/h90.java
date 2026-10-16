package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class h90 implements RequestDelegate {
    public final int f36450a;
    public final LaunchActivity f36451b;
    public final int f36452c;
    public final d20 d;
    public final Object e;
    public final Object f36453f;
    public final Object f36454g;
    public final Object h;
    public final Object f36455i;

    public h90(LaunchActivity launchActivity, d20 d20Var, int i10, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2, String str3) {
        this.f36450a = 0;
        this.f36451b = launchActivity;
        this.d = d20Var;
        this.f36452c = i10;
        this.f36455i = authorizationform;
        this.e = getauthorizationform;
        this.f36453f = str;
        this.f36454g = str2;
        this.h = str3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f36450a;
        Object obj = this.h;
        Object obj2 = this.f36454g;
        Object obj3 = this.f36453f;
        Object obj4 = this.e;
        Object obj5 = this.f36455i;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.ob(this.f36451b, this.d, tLObject, this.f36452c, (TL_account.authorizationForm) obj5, (TL_account.getAuthorizationForm) obj4, (String) obj3, (String) obj2, (String) obj, 1));
                return;
            case 1:
                int[] iArr = (int[]) obj5;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj4;
                String str = (String) obj3;
                String str2 = (String) obj2;
                String str3 = (String) obj;
                Pattern pattern2 = LaunchActivity.B1;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) tLObject;
                LaunchActivity launchActivity = this.f36451b;
                d20 d20Var = this.d;
                if (authorizationform != null) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    int i11 = this.f36452c;
                    iArr[0] = ConnectionsManager.getInstance(i11).sendRequest(getpassword, new h90(launchActivity, d20Var, i11, authorizationform, getauthorizationform, str, str2, str3));
                    return;
                }
                AndroidUtilities.runOnUIThread(new br(launchActivity, d20Var, tL_error, 14));
                return;
            default:
                Pattern pattern3 = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.ob(this.f36451b, tLObject, (int[]) obj5, this.f36452c, this.d, (Integer) obj4, (Integer) obj3, (Long) obj2, (Integer) obj, 2));
                return;
        }
    }

    public h90(LaunchActivity launchActivity, int[] iArr, int i10, d20 d20Var, Object obj, Object obj2, Object obj3, Object obj4, int i11) {
        this.f36450a = i11;
        this.f36451b = launchActivity;
        this.f36455i = iArr;
        this.f36452c = i10;
        this.d = d20Var;
        this.e = obj;
        this.f36453f = obj2;
        this.f36454g = obj3;
        this.h = obj4;
    }
}
