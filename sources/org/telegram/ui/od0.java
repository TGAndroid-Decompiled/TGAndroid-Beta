package org.telegram.ui;

import android.content.Intent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
public final class od0 implements NotificationCenter.NotificationCenterDelegate {
    public final qd0 f40163a;

    public od0(qd0 qd0Var) {
        this.f40163a = qd0Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        qd0 qd0Var = this.f40163a;
        int intValue = ((Integer) objArr[0]).intValue();
        ((Integer) objArr[1]).getClass();
        Intent intent = (Intent) objArr[2];
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.onActivityResultReceived);
        if (intValue == 200) {
            try {
                qd0Var.F = (GoogleSignInAccount) w7.b9.b(intent).getResult(com.google.android.gms.common.api.f.class);
                qd0Var.h(null);
            } catch (com.google.android.gms.common.api.f e) {
                FileLog.e(e);
            }
        }
    }
}
