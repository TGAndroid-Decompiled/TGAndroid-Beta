package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class c90 implements RequestDelegate {
    public final int f36584a;
    public final LaunchActivity f36585b;
    public final int f36586c;
    public final m70 d;
    public final Object f36587e;
    public final Object f36588f;
    public final Object f36589g;
    public final Object h;
    public final Object f36590i;

    public c90(LaunchActivity launchActivity, m70 m70Var, int i10, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2, String str3) {
        this.f36584a = 0;
        this.f36585b = launchActivity;
        this.d = m70Var;
        this.f36586c = i10;
        this.f36590i = authorizationform;
        this.f36587e = getauthorizationform;
        this.f36588f = str;
        this.f36589g = str2;
        this.h = str3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f36584a;
        Object obj = this.h;
        Object obj2 = this.f36589g;
        Object obj3 = this.f36588f;
        Object obj4 = this.f36587e;
        Object obj5 = this.f36590i;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.lb(this.f36585b, this.d, tLObject, this.f36586c, (TL_account.authorizationForm) obj5, (TL_account.getAuthorizationForm) obj4, (String) obj3, (String) obj2, (String) obj, 1));
                return;
            case 1:
                int[] iArr = (int[]) obj5;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj4;
                String str = (String) obj3;
                String str2 = (String) obj2;
                String str3 = (String) obj;
                Pattern pattern2 = LaunchActivity.B1;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) tLObject;
                LaunchActivity launchActivity = this.f36585b;
                m70 m70Var = this.d;
                if (authorizationform != null) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    int i11 = this.f36586c;
                    iArr[0] = ConnectionsManager.getInstance(i11).sendRequest(getpassword, new c90(launchActivity, m70Var, i11, authorizationform, getauthorizationform, str, str2, str3));
                    return;
                }
                AndroidUtilities.runOnUIThread(new vq(launchActivity, m70Var, tL_error, 14));
                return;
            default:
                Pattern pattern3 = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.lb(this.f36585b, tLObject, (int[]) obj5, this.f36586c, this.d, (Integer) obj4, (Integer) obj3, (Long) obj2, (Integer) obj, 2));
                return;
        }
    }

    public c90(LaunchActivity launchActivity, int[] iArr, int i10, m70 m70Var, Object obj, Object obj2, Object obj3, Object obj4, int i11) {
        this.f36584a = i11;
        this.f36585b = launchActivity;
        this.f36590i = iArr;
        this.f36586c = i10;
        this.d = m70Var;
        this.f36587e = obj;
        this.f36588f = obj2;
        this.f36589g = obj3;
        this.h = obj4;
    }
}
