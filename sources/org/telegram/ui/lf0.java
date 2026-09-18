package org.telegram.ui;

import android.content.Intent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
public final class lf0 implements NotificationCenter.NotificationCenterDelegate {
    public final mf0 f35365a;

    public lf0(mf0 mf0Var) {
        this.f35365a = mf0Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        mf0 mf0Var = this.f35365a;
        int intValue = ((Integer) objArr[0]).intValue();
        ((Integer) objArr[1]).getClass();
        Intent intent = (Intent) objArr[2];
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.onActivityResultReceived);
        if (intValue == 200) {
            try {
                mf0Var.f35656y = (GoogleSignInAccount) w7.e9.b(intent).getResult(com.google.android.gms.common.api.f.class);
                mf0Var.h(null);
            } catch (com.google.android.gms.common.api.f e) {
                FileLog.e(e);
            }
        }
    }
}
