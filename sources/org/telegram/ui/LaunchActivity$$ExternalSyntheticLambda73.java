package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

public final class LaunchActivity$$ExternalSyntheticLambda73 implements RequestDelegate {
    public final int $r8$classId;
    public final LaunchActivity f$0;
    public final Object f$1;
    public final int f$2;
    public final LaunchActivity$$ExternalSyntheticLambda13 f$3;
    public final Object f$4;
    public final Object f$5;
    public final Object f$6;
    public final Object f$7;

    public LaunchActivity$$ExternalSyntheticLambda73(LaunchActivity launchActivity, LaunchActivity$$ExternalSyntheticLambda13 launchActivity$$ExternalSyntheticLambda13, int i, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2, String str3) {
        this.$r8$classId = 1;
        this.f$0 = launchActivity;
        this.f$3 = launchActivity$$ExternalSyntheticLambda13;
        this.f$2 = i;
        this.f$1 = authorizationform;
        this.f$4 = getauthorizationform;
        this.f$5 = str;
        this.f$6 = str2;
        this.f$7 = str3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                LaunchActivity launchActivity = this.f$0;
                launchActivity.getClass();
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) tLObject;
                LaunchActivity$$ExternalSyntheticLambda13 launchActivity$$ExternalSyntheticLambda13 = this.f$3;
                if (authorizationform == null) {
                    AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda21(launchActivity, launchActivity$$ExternalSyntheticLambda13, tL_error, 1));
                } else {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    int i = this.f$2;
                    ((int[]) this.f$1)[0] = ConnectionsManager.getInstance(i).sendRequest(getpassword, new LaunchActivity$$ExternalSyntheticLambda73(launchActivity, launchActivity$$ExternalSyntheticLambda13, i, authorizationform, (TL_account.getAuthorizationForm) this.f$4, (String) this.f$5, (String) this.f$6, (String) this.f$7));
                }
                break;
            case 1:
                LaunchActivity launchActivity2 = this.f$0;
                launchActivity2.getClass();
                AndroidUtilities.runOnUIThread(new LaunchActivity$$ExternalSyntheticLambda101(launchActivity2, this.f$3, tLObject, this.f$2, (TL_account.authorizationForm) this.f$1, (TL_account.getAuthorizationForm) this.f$4, (String) this.f$5, (String) this.f$6, (String) this.f$7));
                break;
            default:
                LaunchActivity launchActivity3 = this.f$0;
                launchActivity3.getClass();
                AndroidUtilities.runOnUIThread(new LaunchActivity$$ExternalSyntheticLambda101(launchActivity3, tLObject, (int[]) this.f$1, this.f$2, this.f$3, (Integer) this.f$4, (Integer) this.f$5, (Long) this.f$6, (Integer) this.f$7));
                break;
        }
    }

    public LaunchActivity$$ExternalSyntheticLambda73(LaunchActivity launchActivity, int[] iArr, int i, LaunchActivity$$ExternalSyntheticLambda13 launchActivity$$ExternalSyntheticLambda13, Object obj, Object obj2, Object obj3, Object obj4, int i2) {
        this.$r8$classId = i2;
        this.f$0 = launchActivity;
        this.f$1 = iArr;
        this.f$2 = i;
        this.f$3 = launchActivity$$ExternalSyntheticLambda13;
        this.f$4 = obj;
        this.f$5 = obj2;
        this.f$6 = obj3;
        this.f$7 = obj4;
    }
}
