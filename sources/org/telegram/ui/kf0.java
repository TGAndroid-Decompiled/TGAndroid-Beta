package org.telegram.ui;

import android.content.Intent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
public final class kf0 implements NotificationCenter.NotificationCenterDelegate {
    public final lf0 f34354a;

    public kf0(lf0 lf0Var) {
        this.f34354a = lf0Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        lf0 lf0Var = this.f34354a;
        int intValue = ((Integer) objArr[0]).intValue();
        ((Integer) objArr[1]).getClass();
        Intent intent = (Intent) objArr[2];
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.onActivityResultReceived);
        if (intValue == 200) {
            try {
                lf0Var.f34706y = (GoogleSignInAccount) w7.d9.b(intent).getResult(com.google.android.gms.common.api.f.class);
                lf0Var.h(null);
            } catch (com.google.android.gms.common.api.f e) {
                FileLog.e(e);
            }
        }
    }
}
