package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

public final class m80 implements RequestDelegate {

    public final int f40391a;

    public final LaunchActivity f40392b;

    public final int f40393c;
    public final a30 d;

    public final Object f40394e;

    public final Object f40395f;

    public final Object f40396g;
    public final Object h;

    public final Object f40397i;

    public m80(LaunchActivity launchActivity, a30 a30Var, int i10, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2, String str3) {
        this.f40391a = 0;
        this.f40392b = launchActivity;
        this.d = a30Var;
        this.f40393c = i10;
        this.f40397i = authorizationform;
        this.f40394e = getauthorizationform;
        this.f40395f = str;
        this.f40396g = str2;
        this.h = str3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f40391a;
        Object obj = this.h;
        Object obj2 = this.f40396g;
        Object obj3 = this.f40395f;
        Object obj4 = this.f40394e;
        Object obj5 = this.f40397i;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.f35496x1;
                AndroidUtilities.runOnUIThread(new hh.t6(this.f40392b, this.d, tLObject, this.f40393c, (TL_account.authorizationForm) obj5, (TL_account.getAuthorizationForm) obj4, (String) obj3, (String) obj2, (String) obj, 3));
                break;
            case 1:
                int[] iArr = (int[]) obj5;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj4;
                String str = (String) obj3;
                String str2 = (String) obj2;
                String str3 = (String) obj;
                Pattern pattern2 = LaunchActivity.f35496x1;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) tLObject;
                LaunchActivity launchActivity = this.f40392b;
                a30 a30Var = this.d;
                if (authorizationform == null) {
                    AndroidUtilities.runOnUIThread(new lq(launchActivity, a30Var, tL_error, 14));
                } else {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    int i11 = this.f40393c;
                    iArr[0] = ConnectionsManager.getInstance(i11).sendRequest(getpassword, new m80(launchActivity, a30Var, i11, authorizationform, getauthorizationform, str, str2, str3));
                }
                break;
            default:
                Pattern pattern3 = LaunchActivity.f35496x1;
                AndroidUtilities.runOnUIThread(new hh.t6(this.f40392b, tLObject, (int[]) obj5, this.f40393c, this.d, (Integer) obj4, (Integer) obj3, (Long) obj2, (Integer) obj, 4));
                break;
        }
    }

    public m80(LaunchActivity launchActivity, int[] iArr, int i10, a30 a30Var, Object obj, Object obj2, Object obj3, Object obj4, int i11) {
        this.f40391a = i11;
        this.f40392b = launchActivity;
        this.f40397i = iArr;
        this.f40393c = i10;
        this.d = a30Var;
        this.f40394e = obj;
        this.f40395f = obj2;
        this.f40396g = obj3;
        this.h = obj4;
    }
}
