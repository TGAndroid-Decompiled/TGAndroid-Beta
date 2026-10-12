package org.telegram.ui;

import android.content.Intent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
public final class pf0 implements NotificationCenter.NotificationCenterDelegate {
    public final qf0 f39211a;

    public pf0(qf0 qf0Var) {
        this.f39211a = qf0Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        qf0 qf0Var = this.f39211a;
        int intValue = ((Integer) objArr[0]).intValue();
        ((Integer) objArr[1]).getClass();
        Intent intent = (Intent) objArr[2];
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.onActivityResultReceived);
        if (intValue == 200) {
            try {
                qf0Var.f39436y = (GoogleSignInAccount) w7.b9.b(intent).getResult(com.google.android.gms.common.api.f.class);
                qf0Var.h(null);
            } catch (com.google.android.gms.common.api.f e) {
                FileLog.e(e);
            }
        }
    }
}
