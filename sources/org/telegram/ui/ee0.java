package org.telegram.ui;

import android.content.Intent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
public final class ee0 implements NotificationCenter.NotificationCenterDelegate {
    public final ge0 f36010a;

    public ee0(ge0 ge0Var) {
        this.f36010a = ge0Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ge0 ge0Var = this.f36010a;
        int intValue = ((Integer) objArr[0]).intValue();
        ((Integer) objArr[1]).getClass();
        Intent intent = (Intent) objArr[2];
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.onActivityResultReceived);
        if (intValue == 200) {
            try {
                ge0Var.F = (GoogleSignInAccount) w7.d9.b(intent).getResult(com.google.android.gms.common.api.f.class);
                ge0Var.h(null);
            } catch (com.google.android.gms.common.api.f e7) {
                FileLog.e(e7);
            }
        }
    }
}
