package org.telegram.ui;

import android.content.Intent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
public final class of0 implements NotificationCenter.NotificationCenterDelegate {
    public final pf0 f38637a;

    public of0(pf0 pf0Var) {
        this.f38637a = pf0Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        pf0 pf0Var = this.f38637a;
        int intValue = ((Integer) objArr[0]).intValue();
        ((Integer) objArr[1]).getClass();
        Intent intent = (Intent) objArr[2];
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.onActivityResultReceived);
        if (intValue == 200) {
            try {
                pf0Var.f38915y = (GoogleSignInAccount) w7.b9.b(intent).getResult(com.google.android.gms.common.api.f.class);
                pf0Var.h(null);
            } catch (com.google.android.gms.common.api.f e) {
                FileLog.e(e);
            }
        }
    }
}
